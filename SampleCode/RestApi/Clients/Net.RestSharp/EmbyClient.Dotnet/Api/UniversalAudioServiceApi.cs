/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IUniversalAudioServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdUniversal (string id, string deviceId, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdUniversalWithHttpInfo (string id, string deviceId, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdUniversalByContainer (string id, string deviceId, string container, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdUniversalByContainerWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        void HeadAudioByIdUniversal (string id, string deviceId, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdUniversalWithHttpInfo (string id, string deviceId, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        void HeadAudioByIdUniversalByContainer (string id, string deviceId, string container, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdUniversalByContainerWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdUniversalAsync (string id, string deviceId, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdUniversalAsyncWithHttpInfo (string id, string deviceId, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdUniversalByContainerAsync (string id, string deviceId, string container, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdUniversalByContainerAsyncWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdUniversalAsync (string id, string deviceId, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdUniversalAsyncWithHttpInfo (string id, string deviceId, long? startTimeTicks);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdUniversalByContainerAsync (string id, string deviceId, string container, long? startTimeTicks);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdUniversalByContainerAsyncWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class UniversalAudioServiceApi : IUniversalAudioServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalAudioServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UniversalAudioServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalAudioServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public UniversalAudioServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalAudioServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UniversalAudioServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdUniversal (string id, string deviceId, long? startTimeTicks)
        {
             GetAudioByIdUniversalWithHttpInfo(id, deviceId, startTimeTicks);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdUniversalWithHttpInfo (string id, string deviceId, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->GetAudioByIdUniversal");

            var localVarPath = "/Audio/{Id}/universal";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdUniversal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdUniversalAsync (string id, string deviceId, long? startTimeTicks)
        {
             await GetAudioByIdUniversalAsyncWithHttpInfo(id, deviceId, startTimeTicks);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdUniversalAsyncWithHttpInfo (string id, string deviceId, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->GetAudioByIdUniversal");

            var localVarPath = "/Audio/{Id}/universal";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdUniversal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdUniversalByContainer (string id, string deviceId, string container, long? startTimeTicks)
        {
             GetAudioByIdUniversalByContainerWithHttpInfo(id, deviceId, container, startTimeTicks);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdUniversalByContainerWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->GetAudioByIdUniversalByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling UniversalAudioServiceApi->GetAudioByIdUniversalByContainer");

            var localVarPath = "/Audio/{Id}/universal.{Container}";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdUniversalByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdUniversalByContainerAsync (string id, string deviceId, string container, long? startTimeTicks)
        {
             await GetAudioByIdUniversalByContainerAsyncWithHttpInfo(id, deviceId, container, startTimeTicks);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdUniversalByContainerAsyncWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->GetAudioByIdUniversalByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling UniversalAudioServiceApi->GetAudioByIdUniversalByContainer");

            var localVarPath = "/Audio/{Id}/universal.{Container}";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdUniversalByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        public void HeadAudioByIdUniversal (string id, string deviceId, long? startTimeTicks)
        {
             HeadAudioByIdUniversalWithHttpInfo(id, deviceId, startTimeTicks);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdUniversalWithHttpInfo (string id, string deviceId, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->HeadAudioByIdUniversal");

            var localVarPath = "/Audio/{Id}/universal";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdUniversal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdUniversalAsync (string id, string deviceId, long? startTimeTicks)
        {
             await HeadAudioByIdUniversalAsyncWithHttpInfo(id, deviceId, startTimeTicks);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdUniversalAsyncWithHttpInfo (string id, string deviceId, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->HeadAudioByIdUniversal");

            var localVarPath = "/Audio/{Id}/universal";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdUniversal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns></returns>
        public void HeadAudioByIdUniversalByContainer (string id, string deviceId, string container, long? startTimeTicks)
        {
             HeadAudioByIdUniversalByContainerWithHttpInfo(id, deviceId, container, startTimeTicks);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdUniversalByContainerWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->HeadAudioByIdUniversalByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling UniversalAudioServiceApi->HeadAudioByIdUniversalByContainer");

            var localVarPath = "/Audio/{Id}/universal.{Container}";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdUniversalByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdUniversalByContainerAsync (string id, string deviceId, string container, long? startTimeTicks)
        {
             await HeadAudioByIdUniversalByContainerAsyncWithHttpInfo(id, deviceId, container, startTimeTicks);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container"></param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdUniversalByContainerAsyncWithHttpInfo (string id, string deviceId, string container, long? startTimeTicks)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UniversalAudioServiceApi->HeadAudioByIdUniversalByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling UniversalAudioServiceApi->HeadAudioByIdUniversalByContainer");

            var localVarPath = "/Audio/{Id}/universal.{Container}";
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
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
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
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdUniversalByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
