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
        public interface IItemRefreshServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Refreshes metadata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns></returns>
        void PostItemsByIdRefresh (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages);

        /// <summary>
        /// Refreshes metadata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdRefreshWithHttpInfo (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Refreshes metadata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdRefreshAsync (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages);

        /// <summary>
        /// Refreshes metadata for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdRefreshAsyncWithHttpInfo (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ItemRefreshServiceApi : IItemRefreshServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemRefreshServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ItemRefreshServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemRefreshServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public ItemRefreshServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ItemRefreshServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ItemRefreshServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Refreshes metadata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns></returns>
        public void PostItemsByIdRefresh (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages)
        {
             PostItemsByIdRefreshWithHttpInfo(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages);
        }

        /// <summary>
        /// Refreshes metadata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdRefreshWithHttpInfo (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemRefreshServiceApi->PostItemsByIdRefresh");

            var localVarPath = "/Items/{Id}/Refresh";
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
            if (recursive != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Recursive", recursive)); // query parameter
            if (metadataRefreshMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MetadataRefreshMode", metadataRefreshMode)); // query parameter
            if (imageRefreshMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageRefreshMode", imageRefreshMode)); // query parameter
            if (replaceAllMetadata != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllMetadata", replaceAllMetadata)); // query parameter
            if (replaceAllImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllImages", replaceAllImages)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRefresh", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Refreshes metadata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdRefreshAsync (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages)
        {
             await PostItemsByIdRefreshAsyncWithHttpInfo(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages);

        }

        /// <summary>
        /// Refreshes metadata for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="recursive">Indicates if the refresh should occur recursively. (optional)</param>
        /// <param name="metadataRefreshMode">Specifies the metadata refresh mode (optional)</param>
        /// <param name="imageRefreshMode">Specifies the image refresh mode (optional)</param>
        /// <param name="replaceAllMetadata">Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <param name="replaceAllImages">Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdRefreshAsyncWithHttpInfo (string id, bool? recursive, ProvidersMetadataRefreshMode metadataRefreshMode, ProvidersMetadataRefreshMode imageRefreshMode, bool? replaceAllMetadata, bool? replaceAllImages)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling ItemRefreshServiceApi->PostItemsByIdRefresh");

            var localVarPath = "/Items/{Id}/Refresh";
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
            if (recursive != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Recursive", recursive)); // query parameter
            if (metadataRefreshMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MetadataRefreshMode", metadataRefreshMode)); // query parameter
            if (imageRefreshMode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageRefreshMode", imageRefreshMode)); // query parameter
            if (replaceAllMetadata != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllMetadata", replaceAllMetadata)); // query parameter
            if (replaceAllImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ReplaceAllImages", replaceAllImages)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRefresh", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
