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
        public interface INotificationsServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        List<EmbyNotificationsNotificationCategoryInfo> GetNotificationsTypes ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>> GetNotificationsTypesWithHttpInfo ();
        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns></returns>
        void PostNotificationsAdmin (string name, string description, string imageUrl, string url, string level);

        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostNotificationsAdminWithHttpInfo (string name, string description, string imageUrl, string url, string level);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<EmbyNotificationsNotificationCategoryInfo>> GetNotificationsTypesAsync ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;EmbyNotificationsNotificationCategoryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>>> GetNotificationsTypesAsyncWithHttpInfo ();
        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostNotificationsAdminAsync (string name, string description, string imageUrl, string url, string level);

        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsAdminAsyncWithHttpInfo (string name, string description, string imageUrl, string url, string level);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class NotificationsServiceApi : INotificationsServiceApi
    {
        private EmbyClient.Dotnet.Beta.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NotificationsServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Beta.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public NotificationsServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Beta.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Beta.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public NotificationsServiceApi(EmbyClient.Dotnet.Beta.Client.Configuration configuration = null)
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
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        public List<EmbyNotificationsNotificationCategoryInfo> GetNotificationsTypes ()
        {
             ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>> localVarResponse = GetNotificationsTypesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        public ApiResponse< List<EmbyNotificationsNotificationCategoryInfo> > GetNotificationsTypesWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Types";
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
                Exception exception = ExceptionFactory("GetNotificationsTypes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<EmbyNotificationsNotificationCategoryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<EmbyNotificationsNotificationCategoryInfo>)));
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;EmbyNotificationsNotificationCategoryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<EmbyNotificationsNotificationCategoryInfo>> GetNotificationsTypesAsync ()
        {
             ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>> localVarResponse = await GetNotificationsTypesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;EmbyNotificationsNotificationCategoryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>>> GetNotificationsTypesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Types";
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
                Exception exception = ExceptionFactory("GetNotificationsTypes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<EmbyNotificationsNotificationCategoryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<EmbyNotificationsNotificationCategoryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<EmbyNotificationsNotificationCategoryInfo>)));
        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns></returns>
        public void PostNotificationsAdmin (string name, string description, string imageUrl, string url, string level)
        {
             PostNotificationsAdminWithHttpInfo(name, description, imageUrl, url, level);
        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostNotificationsAdminWithHttpInfo (string name, string description, string imageUrl, string url, string level)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling NotificationsServiceApi->PostNotificationsAdmin");
            // verify the required parameter 'description' is set
            if (description == null)
                throw new ApiException(400, "Missing required parameter 'description' when calling NotificationsServiceApi->PostNotificationsAdmin");

            var localVarPath = "/Notifications/Admin";
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

            if (name != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Name", name)); // query parameter
            if (description != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Description", description)); // query parameter
            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
            if (url != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Url", url)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsAdmin", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostNotificationsAdminAsync (string name, string description, string imageUrl, string url, string level)
        {
             await PostNotificationsAdminAsyncWithHttpInfo(name, description, imageUrl, url, level);

        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Beta.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsAdminAsyncWithHttpInfo (string name, string description, string imageUrl, string url, string level)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling NotificationsServiceApi->PostNotificationsAdmin");
            // verify the required parameter 'description' is set
            if (description == null)
                throw new ApiException(400, "Missing required parameter 'description' when calling NotificationsServiceApi->PostNotificationsAdmin");

            var localVarPath = "/Notifications/Admin";
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

            if (name != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Name", name)); // query parameter
            if (description != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Description", description)); // query parameter
            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
            if (url != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Url", url)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsAdmin", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}