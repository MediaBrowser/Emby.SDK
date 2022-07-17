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
        public interface INotificationsServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets notifications
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>EmbyNotificationsApiNotificationResult</returns>
        EmbyNotificationsApiNotificationResult GetNotificationsByUserid (string userId, bool? isRead, int? startIndex, int? limit);

        /// <summary>
        /// Gets notifications
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>ApiResponse of EmbyNotificationsApiNotificationResult</returns>
        ApiResponse<EmbyNotificationsApiNotificationResult> GetNotificationsByUseridWithHttpInfo (string userId, bool? isRead, int? startIndex, int? limit);
        /// <summary>
        /// Gets a notification summary for a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>EmbyNotificationsApiNotificationsSummary</returns>
        EmbyNotificationsApiNotificationsSummary GetNotificationsByUseridSummary (string userId);

        /// <summary>
        /// Gets a notification summary for a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>ApiResponse of EmbyNotificationsApiNotificationsSummary</returns>
        ApiResponse<EmbyNotificationsApiNotificationsSummary> GetNotificationsByUseridSummaryWithHttpInfo (string userId);
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;NameIdPair&gt;</returns>
        List<NameIdPair> GetNotificationsServices ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;NameIdPair&gt;</returns>
        ApiResponse<List<NameIdPair>> GetNotificationsServicesWithHttpInfo ();
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        List<NotificationsNotificationTypeInfo> GetNotificationsTypes ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        ApiResponse<List<NotificationsNotificationTypeInfo>> GetNotificationsTypesWithHttpInfo ();
        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns></returns>
        void PostNotificationsAdmin (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level);

        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostNotificationsAdminWithHttpInfo (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level);
        /// <summary>
        /// Marks notifications as read
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns></returns>
        void PostNotificationsByUseridRead (string userId, string ids);

        /// <summary>
        /// Marks notifications as read
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostNotificationsByUseridReadWithHttpInfo (string userId, string ids);
        /// <summary>
        /// Marks notifications as unread
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns></returns>
        void PostNotificationsByUseridUnread (string userId, string ids);

        /// <summary>
        /// Marks notifications as unread
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostNotificationsByUseridUnreadWithHttpInfo (string userId, string ids);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets notifications
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of EmbyNotificationsApiNotificationResult</returns>
        System.Threading.Tasks.Task<EmbyNotificationsApiNotificationResult> GetNotificationsByUseridAsync (string userId, bool? isRead, int? startIndex, int? limit);

        /// <summary>
        /// Gets notifications
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of ApiResponse (EmbyNotificationsApiNotificationResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsApiNotificationResult>> GetNotificationsByUseridAsyncWithHttpInfo (string userId, bool? isRead, int? startIndex, int? limit);
        /// <summary>
        /// Gets a notification summary for a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of EmbyNotificationsApiNotificationsSummary</returns>
        System.Threading.Tasks.Task<EmbyNotificationsApiNotificationsSummary> GetNotificationsByUseridSummaryAsync (string userId);

        /// <summary>
        /// Gets a notification summary for a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of ApiResponse (EmbyNotificationsApiNotificationsSummary)</returns>
        System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsApiNotificationsSummary>> GetNotificationsByUseridSummaryAsyncWithHttpInfo (string userId);
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;NameIdPair&gt;</returns>
        System.Threading.Tasks.Task<List<NameIdPair>> GetNotificationsServicesAsync ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;NameIdPair&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<NameIdPair>>> GetNotificationsServicesAsyncWithHttpInfo ();
        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        System.Threading.Tasks.Task<List<NotificationsNotificationTypeInfo>> GetNotificationsTypesAsync ();

        /// <summary>
        /// Gets notification types
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;NotificationsNotificationTypeInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<NotificationsNotificationTypeInfo>>> GetNotificationsTypesAsyncWithHttpInfo ();
        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostNotificationsAdminAsync (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level);

        /// <summary>
        /// Sends a notification to all admin users
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsAdminAsyncWithHttpInfo (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level);
        /// <summary>
        /// Marks notifications as read
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostNotificationsByUseridReadAsync (string userId, string ids);

        /// <summary>
        /// Marks notifications as read
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsByUseridReadAsyncWithHttpInfo (string userId, string ids);
        /// <summary>
        /// Marks notifications as unread
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostNotificationsByUseridUnreadAsync (string userId, string ids);

        /// <summary>
        /// Marks notifications as unread
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsByUseridUnreadAsyncWithHttpInfo (string userId, string ids);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class NotificationsServiceApi : INotificationsServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NotificationsServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public NotificationsServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public NotificationsServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets notifications Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>EmbyNotificationsApiNotificationResult</returns>
        public EmbyNotificationsApiNotificationResult GetNotificationsByUserid (string userId, bool? isRead, int? startIndex, int? limit)
        {
             ApiResponse<EmbyNotificationsApiNotificationResult> localVarResponse = GetNotificationsByUseridWithHttpInfo(userId, isRead, startIndex, limit);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets notifications Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>ApiResponse of EmbyNotificationsApiNotificationResult</returns>
        public ApiResponse< EmbyNotificationsApiNotificationResult > GetNotificationsByUseridWithHttpInfo (string userId, bool? isRead, int? startIndex, int? limit)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->GetNotificationsByUserid");

            var localVarPath = "/Notifications/{UserId}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (isRead != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsRead", isRead)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
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
                Exception exception = ExceptionFactory("GetNotificationsByUserid", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsApiNotificationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsApiNotificationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsApiNotificationResult)));
        }

        /// <summary>
        /// Gets notifications Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of EmbyNotificationsApiNotificationResult</returns>
        public async System.Threading.Tasks.Task<EmbyNotificationsApiNotificationResult> GetNotificationsByUseridAsync (string userId, bool? isRead, int? startIndex, int? limit)
        {
             ApiResponse<EmbyNotificationsApiNotificationResult> localVarResponse = await GetNotificationsByUseridAsyncWithHttpInfo(userId, isRead, startIndex, limit);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets notifications Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="isRead">An optional filter by IsRead (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <returns>Task of ApiResponse (EmbyNotificationsApiNotificationResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsApiNotificationResult>> GetNotificationsByUseridAsyncWithHttpInfo (string userId, bool? isRead, int? startIndex, int? limit)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->GetNotificationsByUserid");

            var localVarPath = "/Notifications/{UserId}";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (isRead != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsRead", isRead)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
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
                Exception exception = ExceptionFactory("GetNotificationsByUserid", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsApiNotificationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsApiNotificationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsApiNotificationResult)));
        }

        /// <summary>
        /// Gets a notification summary for a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>EmbyNotificationsApiNotificationsSummary</returns>
        public EmbyNotificationsApiNotificationsSummary GetNotificationsByUseridSummary (string userId)
        {
             ApiResponse<EmbyNotificationsApiNotificationsSummary> localVarResponse = GetNotificationsByUseridSummaryWithHttpInfo(userId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a notification summary for a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>ApiResponse of EmbyNotificationsApiNotificationsSummary</returns>
        public ApiResponse< EmbyNotificationsApiNotificationsSummary > GetNotificationsByUseridSummaryWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->GetNotificationsByUseridSummary");

            var localVarPath = "/Notifications/{UserId}/Summary";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("GetNotificationsByUseridSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsApiNotificationsSummary>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsApiNotificationsSummary) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsApiNotificationsSummary)));
        }

        /// <summary>
        /// Gets a notification summary for a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of EmbyNotificationsApiNotificationsSummary</returns>
        public async System.Threading.Tasks.Task<EmbyNotificationsApiNotificationsSummary> GetNotificationsByUseridSummaryAsync (string userId)
        {
             ApiResponse<EmbyNotificationsApiNotificationsSummary> localVarResponse = await GetNotificationsByUseridSummaryAsyncWithHttpInfo(userId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a notification summary for a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <returns>Task of ApiResponse (EmbyNotificationsApiNotificationsSummary)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EmbyNotificationsApiNotificationsSummary>> GetNotificationsByUseridSummaryAsyncWithHttpInfo (string userId)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->GetNotificationsByUseridSummary");

            var localVarPath = "/Notifications/{UserId}/Summary";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
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
                Exception exception = ExceptionFactory("GetNotificationsByUseridSummary", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EmbyNotificationsApiNotificationsSummary>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EmbyNotificationsApiNotificationsSummary) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EmbyNotificationsApiNotificationsSummary)));
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;NameIdPair&gt;</returns>
        public List<NameIdPair> GetNotificationsServices ()
        {
             ApiResponse<List<NameIdPair>> localVarResponse = GetNotificationsServicesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;NameIdPair&gt;</returns>
        public ApiResponse< List<NameIdPair> > GetNotificationsServicesWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Services";
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
                Exception exception = ExceptionFactory("GetNotificationsServices", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameIdPair>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NameIdPair>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameIdPair>)));
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;NameIdPair&gt;</returns>
        public async System.Threading.Tasks.Task<List<NameIdPair>> GetNotificationsServicesAsync ()
        {
             ApiResponse<List<NameIdPair>> localVarResponse = await GetNotificationsServicesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;NameIdPair&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<NameIdPair>>> GetNotificationsServicesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Notifications/Services";
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
                Exception exception = ExceptionFactory("GetNotificationsServices", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameIdPair>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NameIdPair>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameIdPair>)));
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        public List<NotificationsNotificationTypeInfo> GetNotificationsTypes ()
        {
             ApiResponse<List<NotificationsNotificationTypeInfo>> localVarResponse = GetNotificationsTypesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        public ApiResponse< List<NotificationsNotificationTypeInfo> > GetNotificationsTypesWithHttpInfo ()
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

            return new ApiResponse<List<NotificationsNotificationTypeInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NotificationsNotificationTypeInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NotificationsNotificationTypeInfo>)));
        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;NotificationsNotificationTypeInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<NotificationsNotificationTypeInfo>> GetNotificationsTypesAsync ()
        {
             ApiResponse<List<NotificationsNotificationTypeInfo>> localVarResponse = await GetNotificationsTypesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets notification types Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;NotificationsNotificationTypeInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<NotificationsNotificationTypeInfo>>> GetNotificationsTypesAsyncWithHttpInfo ()
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

            return new ApiResponse<List<NotificationsNotificationTypeInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NotificationsNotificationTypeInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NotificationsNotificationTypeInfo>)));
        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns></returns>
        public void PostNotificationsAdmin (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level)
        {
             PostNotificationsAdminWithHttpInfo(name, description, imageUrl, url, level);
        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostNotificationsAdminWithHttpInfo (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level)
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
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostNotificationsAdminAsync (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level)
        {
             await PostNotificationsAdminAsyncWithHttpInfo(name, description, imageUrl, url, level);

        }

        /// <summary>
        /// Sends a notification to all admin users Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The notification&#x27;s name</param>
        /// <param name="description">The notification&#x27;s description</param>
        /// <param name="imageUrl">The notification&#x27;s image url (optional)</param>
        /// <param name="url">The notification&#x27;s info url (optional)</param>
        /// <param name="level">The notification level (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsAdminAsyncWithHttpInfo (string name, string description, string imageUrl, string url, NotificationsNotificationLevel level)
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

        /// <summary>
        /// Marks notifications as read Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns></returns>
        public void PostNotificationsByUseridRead (string userId, string ids)
        {
             PostNotificationsByUseridReadWithHttpInfo(userId, ids);
        }

        /// <summary>
        /// Marks notifications as read Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostNotificationsByUseridReadWithHttpInfo (string userId, string ids)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->PostNotificationsByUseridRead");
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling NotificationsServiceApi->PostNotificationsByUseridRead");

            var localVarPath = "/Notifications/{UserId}/Read";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsByUseridRead", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks notifications as read Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostNotificationsByUseridReadAsync (string userId, string ids)
        {
             await PostNotificationsByUseridReadAsyncWithHttpInfo(userId, ids);

        }

        /// <summary>
        /// Marks notifications as read Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsByUseridReadAsyncWithHttpInfo (string userId, string ids)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->PostNotificationsByUseridRead");
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling NotificationsServiceApi->PostNotificationsByUseridRead");

            var localVarPath = "/Notifications/{UserId}/Read";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsByUseridRead", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks notifications as unread Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns></returns>
        public void PostNotificationsByUseridUnread (string userId, string ids)
        {
             PostNotificationsByUseridUnreadWithHttpInfo(userId, ids);
        }

        /// <summary>
        /// Marks notifications as unread Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostNotificationsByUseridUnreadWithHttpInfo (string userId, string ids)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->PostNotificationsByUseridUnread");
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling NotificationsServiceApi->PostNotificationsByUseridUnread");

            var localVarPath = "/Notifications/{UserId}/Unread";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsByUseridUnread", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Marks notifications as unread Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostNotificationsByUseridUnreadAsync (string userId, string ids)
        {
             await PostNotificationsByUseridUnreadAsyncWithHttpInfo(userId, ids);

        }

        /// <summary>
        /// Marks notifications as unread Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id</param>
        /// <param name="ids">A list of notification ids, comma delimited</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostNotificationsByUseridUnreadAsyncWithHttpInfo (string userId, string ids)
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
                throw new ApiException(400, "Missing required parameter 'userId' when calling NotificationsServiceApi->PostNotificationsByUseridUnread");
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new ApiException(400, "Missing required parameter 'ids' when calling NotificationsServiceApi->PostNotificationsByUseridUnread");

            var localVarPath = "/Notifications/{UserId}/Unread";
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

            if (userId != null) localVarPathParams.Add("UserId", this.Configuration.ApiClient.ParameterToString(userId)); // path parameter
            if (ids != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Ids", ids)); // query parameter
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
                Exception exception = ExceptionFactory("PostNotificationsByUseridUnread", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
