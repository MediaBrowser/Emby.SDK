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
        public interface IImageExtractionConfigServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm GetEncodingImageextractiontonemapparameters ();

        /// <summary>
        /// Gets the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> GetEncodingImageextractiontonemapparametersWithHttpInfo ();
        /// <summary>
        /// Updates the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns></returns>
        void PostEncodingImageextractiontonemapparameters (Object body);

        /// <summary>
        /// Updates the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostEncodingImageextractiontonemapparametersWithHttpInfo (Object body);
        /// <summary>
        /// Runs an image-extraction settings command
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm PostEncodingImageextractiontonemapparametersCommand (Object body);

        /// <summary>
        /// Runs an image-extraction settings command
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersCommandWithHttpInfo (Object body);
        /// <summary>
        /// Closes an image-extraction filter options dialog
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm PostEncodingImageextractiontonemapparametersSuboptions (Object body);

        /// <summary>
        /// Closes an image-extraction filter options dialog
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo (Object body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> GetEncodingImageextractiontonemapparametersAsync ();

        /// <summary>
        /// Gets the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> GetEncodingImageextractiontonemapparametersAsyncWithHttpInfo ();
        /// <summary>
        /// Updates the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostEncodingImageextractiontonemapparametersAsync (Object body);

        /// <summary>
        /// Updates the image-extraction tone-mapping settings
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingImageextractiontonemapparametersAsyncWithHttpInfo (Object body);
        /// <summary>
        /// Runs an image-extraction settings command
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersCommandAsync (Object body);

        /// <summary>
        /// Runs an image-extraction settings command
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> PostEncodingImageextractiontonemapparametersCommandAsyncWithHttpInfo (Object body);
        /// <summary>
        /// Closes an image-extraction filter options dialog
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersSuboptionsAsync (Object body);

        /// <summary>
        /// Closes an image-extraction filter options dialog
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> PostEncodingImageextractiontonemapparametersSuboptionsAsyncWithHttpInfo (Object body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ImageExtractionConfigServiceApi : IImageExtractionConfigServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageExtractionConfigServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ImageExtractionConfigServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageExtractionConfigServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public ImageExtractionConfigServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageExtractionConfigServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ImageExtractionConfigServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm GetEncodingImageextractiontonemapparameters ()
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = GetEncodingImageextractiontonemapparametersWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public ApiResponse< MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm > GetEncodingImageextractiontonemapparametersWithHttpInfo ()
        {

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters";
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
                Exception exception = ExceptionFactory("GetEncodingImageextractiontonemapparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

        /// <summary>
        /// Gets the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> GetEncodingImageextractiontonemapparametersAsync ()
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = await GetEncodingImageextractiontonemapparametersAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> GetEncodingImageextractiontonemapparametersAsyncWithHttpInfo ()
        {

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters";
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
                Exception exception = ExceptionFactory("GetEncodingImageextractiontonemapparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

        /// <summary>
        /// Updates the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns></returns>
        public void PostEncodingImageextractiontonemapparameters (Object body)
        {
             PostEncodingImageextractiontonemapparametersWithHttpInfo(body);
        }

        /// <summary>
        /// Updates the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostEncodingImageextractiontonemapparametersWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparameters");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostEncodingImageextractiontonemapparametersAsync (Object body)
        {
             await PostEncodingImageextractiontonemapparametersAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Updates the image-extraction tone-mapping settings Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingImageextractiontonemapparametersAsyncWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparameters");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Runs an image-extraction settings command Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm PostEncodingImageextractiontonemapparametersCommand (Object body)
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = PostEncodingImageextractiontonemapparametersCommandWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Runs an image-extraction settings command Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public ApiResponse< MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm > PostEncodingImageextractiontonemapparametersCommandWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparametersCommand");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters/Command";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
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

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparametersCommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

        /// <summary>
        /// Runs an image-extraction settings command Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersCommandAsync (Object body)
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = await PostEncodingImageextractiontonemapparametersCommandAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Runs an image-extraction settings command Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> PostEncodingImageextractiontonemapparametersCommandAsyncWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparametersCommand");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters/Command";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
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

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparametersCommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

        /// <summary>
        /// Closes an image-extraction filter options dialog Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm PostEncodingImageextractiontonemapparametersSuboptions (Object body)
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = PostEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Closes an image-extraction filter options dialog Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>ApiResponse of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public ApiResponse< MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm > PostEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparametersSuboptions");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters/SubOptions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
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

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparametersSuboptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

        /// <summary>
        /// Closes an image-extraction filter options dialog Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm</returns>
        public async System.Threading.Tasks.Task<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> PostEncodingImageextractiontonemapparametersSuboptionsAsync (Object body)
        {
             ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> localVarResponse = await PostEncodingImageextractiontonemapparametersSuboptionsAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Closes an image-extraction filter options dialog Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <returns>Task of ApiResponse (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>> PostEncodingImageextractiontonemapparametersSuboptionsAsyncWithHttpInfo (Object body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ImageExtractionConfigServiceApi->PostEncodingImageextractiontonemapparametersSuboptions");

            var localVarPath = "/Encoding/ImageExtractionToneMapParameters/SubOptions";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
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

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
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
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostEncodingImageextractiontonemapparametersSuboptions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm)));
        }

    }
}
