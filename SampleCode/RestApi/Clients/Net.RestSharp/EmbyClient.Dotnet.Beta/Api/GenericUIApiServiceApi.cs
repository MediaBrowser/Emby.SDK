/*
 * EmbyClient.Dotnet.Beta
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Beta.Client;
using EmbyClient.Dotnet.Beta.Model;

namespace EmbyClient.Dotnet.Beta.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IGenericUIApiServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets UI view data
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>EmbyWebGenericUIModelUIViewInfo</returns>
        EmbyWebGenericUIModelUIViewInfo GetUIView (string pageId, string clientLocale);

        /// <summary>
        /// Gets UI view data
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>ApiResponse of EmbyWebGenericUIModelUIViewInfo</returns>
        ApiResponse<EmbyWebGenericUIModelUIViewInfo> GetUIViewWithHttpInfo (string pageId, string clientLocale);
        /// <summary>
        /// Execute a command in the context of tv setup
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>EmbyWebGenericUIModelUIViewInfo</returns>
        EmbyWebGenericUIModelUIViewInfo PostUICommand (EmbyWebGenericUIApiEndpointsRunUICommand body);

        /// <summary>
        /// Execute a command in the context of tv setup
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>ApiResponse of EmbyWebGenericUIModelUIViewInfo</returns>
        ApiResponse<EmbyWebGenericUIModelUIViewInfo> PostUICommandWithHttpInfo (EmbyWebGenericUIApiEndpointsRunUICommand body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets UI view data
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>Task of EmbyWebGenericUIModelUIViewInfo</returns>
        System.Threading.Tasks.Task<EmbyWebGenericUIModelUIViewInfo> GetUIViewAsync (string pageId, string clientLocale);

        /// <summary>
        /// Gets UI view data
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>Task of ApiResponse (EmbyWebGenericUIModelUIViewInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<EmbyWebGenericUIModelUIViewInfo>> GetUIViewAsyncWithHttpInfo (string pageId, string clientLocale);
        /// <summary>
        /// Execute a command in the context of tv setup
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>Task of EmbyWebGenericUIModelUIViewInfo</returns>
        System.Threading.Tasks.Task<EmbyWebGenericUIModelUIViewInfo> PostUICommandAsync (EmbyWebGenericUIApiEndpointsRunUICommand body);

        /// <summary>
        /// Execute a command in the context of tv setup
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>Task of ApiResponse (EmbyWebGenericUIModelUIViewInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<EmbyWebGenericUIModelUIViewInfo>> PostUICommandAsyncWithHttpInfo (EmbyWebGenericUIApiEndpointsRunUICommand body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class GenericUIApiServiceApi : IGenericUIApiServiceApi
    {
        private EmbyClient.Dotnet.Beta.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GenericUIApiServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GenericUIApiServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Beta.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GenericUIApiServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public GenericUIApiServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Beta.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GenericUIApiServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GenericUIApiServiceApi(EmbyClient.Dotnet.Beta.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = EmbyClient.Dotnet.Beta.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
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
        public EmbyClient.Dotnet.Beta.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EmbyClient.Dotnet.Beta.Client.ExceptionFactory ExceptionFactory
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
        /// Gets UI view data Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>EmbyWebGenericUIModelUIViewInfo</returns>
        public EmbyWebGenericUIModelUIViewInfo GetUIView (string pageId, string clientLocale)
        {
             ApiResponse<EmbyWebGenericUIModelUIViewInfo> localVarResponse = GetUIViewWithHttpInfo(pageId, clientLocale);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets UI view data Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>ApiResponse of EmbyWebGenericUIModelUIViewInfo</returns>
        public ApiResponse< EmbyWebGenericUIModelUIViewInfo > GetUIViewWithHttpInfo (string pageId, string clientLocale)
        {
            // verify the required parameter 'pageId' is set
            if (pageId == null)
                throw new ApiException(400, "Missing required parameter 'pageId' when calling GenericUIApiServiceApi->GetUIView");
            // verify the required parameter 'clientLocale' is set
            if (clientLocale == null)
                throw new ApiException(400, "Missing required parameter 'clientLocale' when calling GenericUIApiServiceApi->GetUIView");

            var localVarPath = "/UI/View";
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

            if (pageId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PageId", pageId)); // query parameter
            if (clientLocale != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ClientLocale", clientLocale)); // query parameter
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
                Exception exception = ExceptionFactory("GetUIView", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyWebGenericUIModelUIViewInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyWebGenericUIModelUIViewInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyWebGenericUIModelUIViewInfo)));
        }

        /// <summary>
        /// Gets UI view data Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>Task of EmbyWebGenericUIModelUIViewInfo</returns>
        public async System.Threading.Tasks.Task<EmbyWebGenericUIModelUIViewInfo> GetUIViewAsync (string pageId, string clientLocale)
        {
             ApiResponse<EmbyWebGenericUIModelUIViewInfo> localVarResponse = await GetUIViewAsyncWithHttpInfo(pageId, clientLocale);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets UI view data Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pageId">Id of the page controller</param>
        /// <param name="clientLocale">Locale identifier of the client</param>
        /// <returns>Task of ApiResponse (EmbyWebGenericUIModelUIViewInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EmbyWebGenericUIModelUIViewInfo>> GetUIViewAsyncWithHttpInfo (string pageId, string clientLocale)
        {
            // verify the required parameter 'pageId' is set
            if (pageId == null)
                throw new ApiException(400, "Missing required parameter 'pageId' when calling GenericUIApiServiceApi->GetUIView");
            // verify the required parameter 'clientLocale' is set
            if (clientLocale == null)
                throw new ApiException(400, "Missing required parameter 'clientLocale' when calling GenericUIApiServiceApi->GetUIView");

            var localVarPath = "/UI/View";
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

            if (pageId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PageId", pageId)); // query parameter
            if (clientLocale != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ClientLocale", clientLocale)); // query parameter
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
                Exception exception = ExceptionFactory("GetUIView", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyWebGenericUIModelUIViewInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyWebGenericUIModelUIViewInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyWebGenericUIModelUIViewInfo)));
        }

        /// <summary>
        /// Execute a command in the context of tv setup Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>EmbyWebGenericUIModelUIViewInfo</returns>
        public EmbyWebGenericUIModelUIViewInfo PostUICommand (EmbyWebGenericUIApiEndpointsRunUICommand body)
        {
             ApiResponse<EmbyWebGenericUIModelUIViewInfo> localVarResponse = PostUICommandWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Execute a command in the context of tv setup Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>ApiResponse of EmbyWebGenericUIModelUIViewInfo</returns>
        public ApiResponse< EmbyWebGenericUIModelUIViewInfo > PostUICommandWithHttpInfo (EmbyWebGenericUIApiEndpointsRunUICommand body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling GenericUIApiServiceApi->PostUICommand");

            var localVarPath = "/UI/Command";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
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
                Exception exception = ExceptionFactory("PostUICommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyWebGenericUIModelUIViewInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyWebGenericUIModelUIViewInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyWebGenericUIModelUIViewInfo)));
        }

        /// <summary>
        /// Execute a command in the context of tv setup Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>Task of EmbyWebGenericUIModelUIViewInfo</returns>
        public async System.Threading.Tasks.Task<EmbyWebGenericUIModelUIViewInfo> PostUICommandAsync (EmbyWebGenericUIApiEndpointsRunUICommand body)
        {
             ApiResponse<EmbyWebGenericUIModelUIViewInfo> localVarResponse = await PostUICommandAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Execute a command in the context of tv setup Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">RunUICommand</param>
        /// <returns>Task of ApiResponse (EmbyWebGenericUIModelUIViewInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EmbyWebGenericUIModelUIViewInfo>> PostUICommandAsyncWithHttpInfo (EmbyWebGenericUIApiEndpointsRunUICommand body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling GenericUIApiServiceApi->PostUICommand");

            var localVarPath = "/UI/Command";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
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
                Exception exception = ExceptionFactory("PostUICommand", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyWebGenericUIModelUIViewInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyWebGenericUIModelUIViewInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyWebGenericUIModelUIViewInfo)));
        }

    }
}
