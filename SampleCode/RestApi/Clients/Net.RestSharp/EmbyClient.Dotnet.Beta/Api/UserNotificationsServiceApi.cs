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
        public interface IUserNotificationsServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets default notification info
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>EmbyNotificationsUserNotificationInfo</returns>
        EmbyNotificationsUserNotificationInfo GetNotificationsServicesDefaults ();

        /// <summary>
        /// Gets default notification info
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of EmbyNotificationsUserNotificationInfo</returns>
        ApiResponse<EmbyNotificationsUserNotificationInfo> GetNotificationsServicesDefaultsWithHttpInfo ();
        /// <summary>
        /// Sends a test notification
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns></returns>
        void PostNotificationsServicesTest (EmbyNotificationsUserNotificationInfo body);

        /// <summary>
        /// Sends a test notification
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostNotificationsServicesTestWithHttpInfo (EmbyNotificationsUserNotificationInfo body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets default notification info
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of EmbyNotificationsUserNotificationInfo</returns>
        System.Threading.Tasks.Task<EmbyNotificationsUserNotificationInfo> GetNotificationsServicesDefaultsAsync ();

        /// <summary>
        /// Gets default notification info
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (EmbyNotificationsUserNotificationInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsUserNotificationInfo>> GetNotificationsServicesDefaultsAsyncWithHttpInfo ();
        /// <summary>
        /// Sends a test notification
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostNotificationsServicesTestAsync (EmbyNotificationsUserNotificationInfo body);

        /// <summary>
        /// Sends a test notification
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsServicesTestAsyncWithHttpInfo (EmbyNotificationsUserNotificationInfo body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class UserNotificationsServiceApi : IUserNotificationsServiceApi
    {
        private EmbyClient.Dotnet.Beta.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UserNotificationsServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserNotificationsServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Beta.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserNotificationsServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public UserNotificationsServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Beta.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserNotificationsServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UserNotificationsServiceApi(EmbyClient.Dotnet.Beta.Client.Configuration configuration = null)
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
        /// Gets default notification info Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>EmbyNotificationsUserNotificationInfo</returns>
        public EmbyNotificationsUserNotificationInfo GetNotificationsServicesDefaults ()
        {
             ApiResponse<EmbyNotificationsUserNotificationInfo> localVarResponse = GetNotificationsServicesDefaultsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets default notification info Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of EmbyNotificationsUserNotificationInfo</returns>
        public ApiResponse< EmbyNotificationsUserNotificationInfo > GetNotificationsServicesDefaultsWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Services/Defaults";
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
                Exception exception = ExceptionFactory("GetNotificationsServicesDefaults", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsUserNotificationInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsUserNotificationInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsUserNotificationInfo)));
        }

        /// <summary>
        /// Gets default notification info Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of EmbyNotificationsUserNotificationInfo</returns>
        public async System.Threading.Tasks.Task<EmbyNotificationsUserNotificationInfo> GetNotificationsServicesDefaultsAsync ()
        {
             ApiResponse<EmbyNotificationsUserNotificationInfo> localVarResponse = await GetNotificationsServicesDefaultsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets default notification info Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (EmbyNotificationsUserNotificationInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsUserNotificationInfo>> GetNotificationsServicesDefaultsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Services/Defaults";
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
                Exception exception = ExceptionFactory("GetNotificationsServicesDefaults", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsUserNotificationInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsUserNotificationInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsUserNotificationInfo)));
        }

        /// <summary>
        /// Sends a test notification Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns></returns>
        public void PostNotificationsServicesTest (EmbyNotificationsUserNotificationInfo body)
        {
             PostNotificationsServicesTestWithHttpInfo(body);
        }

        /// <summary>
        /// Sends a test notification Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostNotificationsServicesTestWithHttpInfo (EmbyNotificationsUserNotificationInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserNotificationsServiceApi->PostNotificationsServicesTest");

            var localVarPath = "/Notifications/Services/Test";
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
                Exception exception = ExceptionFactory("PostNotificationsServicesTest", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Sends a test notification Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostNotificationsServicesTestAsync (EmbyNotificationsUserNotificationInfo body)
        {
             await PostNotificationsServicesTestAsyncWithHttpInfo(body);

        }

        /// <summary>
        /// Sends a test notification Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserNotificationInfo: </param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsServicesTestAsyncWithHttpInfo (EmbyNotificationsUserNotificationInfo body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserNotificationsServiceApi->PostNotificationsServicesTest");

            var localVarPath = "/Notifications/Services/Test";
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
                Exception exception = ExceptionFactory("PostNotificationsServicesTest", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
