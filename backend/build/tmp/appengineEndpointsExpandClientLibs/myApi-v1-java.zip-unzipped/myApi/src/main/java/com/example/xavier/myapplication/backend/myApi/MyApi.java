/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-06-04 at 14:33:04 UTC 
 * Modify at your own risk.
 */

package com.example.xavier.myapplication.backend.myApi;

/**
 * Service definition for MyApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0 of the myApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "clearMesures".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link ClearMesures#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ClearMesures clearMesures() throws java.io.IOException {
    ClearMesures result = new ClearMesures();
    initialize(result);
    return result;
  }

  public class ClearMesures extends MyApiRequest<Void> {

    private static final String REST_PATH = "clearMesures";

    /**
     * Create a request for the method "clearMesures".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link ClearMesures#execute()} method to invoke the remote operation. <p>
     * {@link
     * ClearMesures#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ClearMesures() {
      super(MyApi.this, "POST", REST_PATH, null, Void.class);
    }

    @Override
    public ClearMesures setAlt(java.lang.String alt) {
      return (ClearMesures) super.setAlt(alt);
    }

    @Override
    public ClearMesures setFields(java.lang.String fields) {
      return (ClearMesures) super.setFields(fields);
    }

    @Override
    public ClearMesures setKey(java.lang.String key) {
      return (ClearMesures) super.setKey(key);
    }

    @Override
    public ClearMesures setOauthToken(java.lang.String oauthToken) {
      return (ClearMesures) super.setOauthToken(oauthToken);
    }

    @Override
    public ClearMesures setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ClearMesures) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ClearMesures setQuotaUser(java.lang.String quotaUser) {
      return (ClearMesures) super.setQuotaUser(quotaUser);
    }

    @Override
    public ClearMesures setUserIp(java.lang.String userIp) {
      return (ClearMesures) super.setUserIp(userIp);
    }

    @Override
    public ClearMesures set(String parameterName, Object value) {
      return (ClearMesures) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getMesures".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetMesures#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetMesures getMesures() throws java.io.IOException {
    GetMesures result = new GetMesures();
    initialize(result);
    return result;
  }

  public class GetMesures extends MyApiRequest<com.example.xavier.myapplication.backend.myApi.model.MesureCollection> {

    private static final String REST_PATH = "mesurecollection";

    /**
     * Create a request for the method "getMesures".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetMesures#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetMesures#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetMesures() {
      super(MyApi.this, "GET", REST_PATH, null, com.example.xavier.myapplication.backend.myApi.model.MesureCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetMesures setAlt(java.lang.String alt) {
      return (GetMesures) super.setAlt(alt);
    }

    @Override
    public GetMesures setFields(java.lang.String fields) {
      return (GetMesures) super.setFields(fields);
    }

    @Override
    public GetMesures setKey(java.lang.String key) {
      return (GetMesures) super.setKey(key);
    }

    @Override
    public GetMesures setOauthToken(java.lang.String oauthToken) {
      return (GetMesures) super.setOauthToken(oauthToken);
    }

    @Override
    public GetMesures setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetMesures) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetMesures setQuotaUser(java.lang.String quotaUser) {
      return (GetMesures) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetMesures setUserIp(java.lang.String userIp) {
      return (GetMesures) super.setUserIp(userIp);
    }

    @Override
    public GetMesures set(String parameterName, Object value) {
      return (GetMesures) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "storeMesure".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link StoreMesure#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.xavier.myapplication.backend.myApi.model.Mesure}
   * @return the request
   */
  public StoreMesure storeMesure(com.example.xavier.myapplication.backend.myApi.model.Mesure content) throws java.io.IOException {
    StoreMesure result = new StoreMesure(content);
    initialize(result);
    return result;
  }

  public class StoreMesure extends MyApiRequest<Void> {

    private static final String REST_PATH = "storeMesures";

    /**
     * Create a request for the method "storeMesure".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link StoreMesure#execute()} method to invoke the remote operation. <p>
     * {@link
     * StoreMesure#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.xavier.myapplication.backend.myApi.model.Mesure}
     * @since 1.13
     */
    protected StoreMesure(com.example.xavier.myapplication.backend.myApi.model.Mesure content) {
      super(MyApi.this, "POST", REST_PATH, content, Void.class);
    }

    @Override
    public StoreMesure setAlt(java.lang.String alt) {
      return (StoreMesure) super.setAlt(alt);
    }

    @Override
    public StoreMesure setFields(java.lang.String fields) {
      return (StoreMesure) super.setFields(fields);
    }

    @Override
    public StoreMesure setKey(java.lang.String key) {
      return (StoreMesure) super.setKey(key);
    }

    @Override
    public StoreMesure setOauthToken(java.lang.String oauthToken) {
      return (StoreMesure) super.setOauthToken(oauthToken);
    }

    @Override
    public StoreMesure setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (StoreMesure) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public StoreMesure setQuotaUser(java.lang.String quotaUser) {
      return (StoreMesure) super.setQuotaUser(quotaUser);
    }

    @Override
    public StoreMesure setUserIp(java.lang.String userIp) {
      return (StoreMesure) super.setUserIp(userIp);
    }

    @Override
    public StoreMesure set(String parameterName, Object value) {
      return (StoreMesure) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link MyApi}. */
    @Override
    public MyApi build() {
      return new MyApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyApiRequestInitializer(
        MyApiRequestInitializer myapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
