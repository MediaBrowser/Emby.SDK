/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;
using EmbyClient.Dotnet.Model;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IEncodingInfoServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets default codec configurations
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ConfigurationCodecConfiguration&gt;</returns>
        List<ConfigurationCodecConfiguration> GetEncodingCodecconfigurationDefaults ();

        /// <summary>
        /// Gets default codec configurations
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ConfigurationCodecConfiguration&gt;</returns>
        ApiResponse<List<ConfigurationCodecConfiguration>> GetEncodingCodecconfigurationDefaultsWithHttpInfo ();
        /// <summary>
        /// Gets details about available video encoders and decoders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        List<MediaEncodingCodecsVideoCodecsVideoCodecBase> GetEncodingCodecinformationVideo ();

        /// <summary>
        /// Gets details about available video encoders and decoders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>> GetEncodingCodecinformationVideoWithHttpInfo ();
        /// <summary>
        /// Gets available tone mapping options
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        MediaEncodingConfigurationToneMappingToneMapOptionsVisibility GetEncodingTonemapoptions ();

        /// <summary>
        /// Gets available tone mapping options
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility> GetEncodingTonemapoptionsWithHttpInfo ();
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets default codec configurations
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ConfigurationCodecConfiguration&gt;</returns>
        System.Threading.Tasks.Task<List<ConfigurationCodecConfiguration>> GetEncodingCodecconfigurationDefaultsAsync ();

        /// <summary>
        /// Gets default codec configurations
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ConfigurationCodecConfiguration&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ConfigurationCodecConfiguration>>> GetEncodingCodecconfigurationDefaultsAsyncWithHttpInfo ();
        /// <summary>
        /// Gets details about available video encoders and decoders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        System.Threading.Tasks.Task<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>> GetEncodingCodecinformationVideoAsync ();

        /// <summary>
        /// Gets details about available video encoders and decoders
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>>> GetEncodingCodecinformationVideoAsyncWithHttpInfo ();
        /// <summary>
        /// Gets available tone mapping options
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        System.Threading.Tasks.Task<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility> GetEncodingTonemapoptionsAsync ();

        /// <summary>
        /// Gets available tone mapping options
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingConfigurationToneMappingToneMapOptionsVisibility)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility>> GetEncodingTonemapoptionsAsyncWithHttpInfo ();
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class EncodingInfoServiceApi : IEncodingInfoServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="EncodingInfoServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EncodingInfoServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EncodingInfoServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public EncodingInfoServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EncodingInfoServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EncodingInfoServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public EmbyClient.Dotnet.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EmbyClient.Dotnet.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Gets default codec configurations Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ConfigurationCodecConfiguration&gt;</returns>
        public List<ConfigurationCodecConfiguration> GetEncodingCodecconfigurationDefaults ()
        {
             ApiResponse<List<ConfigurationCodecConfiguration>> localVarResponse = GetEncodingCodecconfigurationDefaultsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets default codec configurations Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ConfigurationCodecConfiguration&gt;</returns>
        public ApiResponse< List<ConfigurationCodecConfiguration> > GetEncodingCodecconfigurationDefaultsWithHttpInfo ()
        {

            var localVarPath = "/Encoding/CodecConfiguration/Defaults";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingCodecconfigurationDefaults", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ConfigurationCodecConfiguration>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ConfigurationCodecConfiguration>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ConfigurationCodecConfiguration>)));
        }

        /// <summary>
        /// Gets default codec configurations Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ConfigurationCodecConfiguration&gt;</returns>
        public async System.Threading.Tasks.Task<List<ConfigurationCodecConfiguration>> GetEncodingCodecconfigurationDefaultsAsync ()
        {
             ApiResponse<List<ConfigurationCodecConfiguration>> localVarResponse = await GetEncodingCodecconfigurationDefaultsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets default codec configurations Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ConfigurationCodecConfiguration&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ConfigurationCodecConfiguration>>> GetEncodingCodecconfigurationDefaultsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/CodecConfiguration/Defaults";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingCodecconfigurationDefaults", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ConfigurationCodecConfiguration>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ConfigurationCodecConfiguration>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ConfigurationCodecConfiguration>)));
        }

        /// <summary>
        /// Gets details about available video encoders and decoders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        public List<MediaEncodingCodecsVideoCodecsVideoCodecBase> GetEncodingCodecinformationVideo ()
        {
             ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>> localVarResponse = GetEncodingCodecinformationVideoWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets details about available video encoders and decoders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        public ApiResponse< List<MediaEncodingCodecsVideoCodecsVideoCodecBase> > GetEncodingCodecinformationVideoWithHttpInfo ()
        {

            var localVarPath = "/Encoding/CodecInformation/Video";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingCodecinformationVideo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<MediaEncodingCodecsVideoCodecsVideoCodecBase>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<MediaEncodingCodecsVideoCodecsVideoCodecBase>)));
        }

        /// <summary>
        /// Gets details about available video encoders and decoders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;</returns>
        public async System.Threading.Tasks.Task<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>> GetEncodingCodecinformationVideoAsync ()
        {
             ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>> localVarResponse = await GetEncodingCodecinformationVideoAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets details about available video encoders and decoders Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;MediaEncodingCodecsVideoCodecsVideoCodecBase&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>>> GetEncodingCodecinformationVideoAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/CodecInformation/Video";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingCodecinformationVideo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<MediaEncodingCodecsVideoCodecsVideoCodecBase>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<MediaEncodingCodecsVideoCodecsVideoCodecBase>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<MediaEncodingCodecsVideoCodecsVideoCodecBase>)));
        }

        /// <summary>
        /// Gets available tone mapping options Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        public MediaEncodingConfigurationToneMappingToneMapOptionsVisibility GetEncodingTonemapoptions ()
        {
             ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility> localVarResponse = GetEncodingTonemapoptionsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available tone mapping options Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        public ApiResponse< MediaEncodingConfigurationToneMappingToneMapOptionsVisibility > GetEncodingTonemapoptionsWithHttpInfo ()
        {

            var localVarPath = "/Encoding/ToneMapOptions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingTonemapoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingConfigurationToneMappingToneMapOptionsVisibility) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingConfigurationToneMappingToneMapOptionsVisibility)));
        }

        /// <summary>
        /// Gets available tone mapping options Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingConfigurationToneMappingToneMapOptionsVisibility</returns>
        public async System.Threading.Tasks.Task<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility> GetEncodingTonemapoptionsAsync ()
        {
             ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility> localVarResponse = await GetEncodingTonemapoptionsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available tone mapping options Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingConfigurationToneMappingToneMapOptionsVisibility)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility>> GetEncodingTonemapoptionsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/ToneMapOptions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetEncodingTonemapoptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingConfigurationToneMappingToneMapOptionsVisibility>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingConfigurationToneMappingToneMapOptionsVisibility) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingConfigurationToneMappingToneMapOptionsVisibility)));
        }

    }
}
