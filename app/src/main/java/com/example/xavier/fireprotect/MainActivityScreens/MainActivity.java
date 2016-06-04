package com.example.xavier.fireprotect.MainActivityScreens;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xavier.fireprotect.MenuActivityScreens.Help;
import com.example.xavier.fireprotect.MenuActivityScreens.PrivacyPolicy;
import com.example.xavier.fireprotect.MenuActivityScreens.Settings;
import com.example.xavier.fireprotect.MenuActivityScreens.UseTerms;
import com.example.xavier.fireprotect.R;
import com.example.xavier.fireprotect.gcm.RegistrationIntentService;
import com.example.xavier.myapplication.backend.messaging.Messaging;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by xavier i dídac
 */
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final String TAG = "MainActivity";
    private ProgressBar mRegistrationProgressBar;
    private BroadcastReceiver mRegistrationBroadcastReceiver;
    private TextView mInformationTextView;
    private boolean isReceiverRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerToken();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        configureMessaging();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, getString(R.string.phoning), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"));
                startActivity(in);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void onClickMesure (View v){
        Toast.makeText(this, getString(R.string.start_mesure), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MesureActivity.class);
        startActivity(intent);
    }

    public void onClickMap (View v) {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.settings) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        }
        else if (id == R.id.help) {
            Intent intent = new Intent(this, Help.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_settings) {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        } else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, Help.class);
            startActivity(intent);
        } else if (id == R.id.nav_contact) {
            Toast.makeText(this, getString(R.string.send_mail), Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, "fireprotect@mail.com");
            intent.putExtra(Intent.EXTRA_SUBJECT, "FireProtect");
            startActivity(Intent.createChooser(intent, getString(R.string.send_mail)));
        } else if (id == R.id.nav_use_terms) {
            Intent intent = new Intent(this, UseTerms.class);
            startActivity(intent);

        } else if (id == R.id.nav_privacy_policy) {
            Intent intent = new Intent(this, PrivacyPolicy.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void configureMessaging() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean sentToken = sharedPreferences.getBoolean("sentTokenToServer", false);
        if (!sentToken) {
            if (checkPlayServices()) {
                // Start IntentService to register this application with GCM.
                Intent intent = new Intent(this, RegistrationIntentService.class);
                startService(intent);
            }
        }
    }

    private boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(this, resultCode, PLAY_SERVICES_RESOLUTION_REQUEST)
                        .show();
            } else {
                Log.i(TAG, "This device is not supported.");
                finish();
            }
            return false;
        }
        return true;
    }

    private void registerToken() {
        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                mRegistrationProgressBar.setVisibility(ProgressBar.GONE);
                SharedPreferences sharedPreferences =
                        PreferenceManager.getDefaultSharedPreferences(context);
                boolean sentToken = sharedPreferences
                        .getBoolean("sentTokenToServer", false);
                if (sentToken) {
                    mInformationTextView.setText(getString(R.string.gcm_send_message));
                } else {
                    mInformationTextView.setText(getString(R.string.token_error_message));
                }
            }
        };
        mInformationTextView = (TextView) findViewById(R.id.informationTextView);

        // Registering BroadcastReceiver
        registerReceiver();

        if (checkPlayServices()) {
            // Start IntentService to register this application with GCM.
            Intent intent = new Intent(this, RegistrationIntentService.class);
            startService(intent);
        }
    }

    private void registerReceiver(){
        if(!isReceiverRegistered) {
            LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver,
                    new IntentFilter("registrationComplete"));
            isReceiverRegistered = true;
        }
    }

}
