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
        public interface IRemoteImageServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns></returns>
        void GetImagesRemote (string imageUrl);

        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetImagesRemoteWithHttpInfo (string imageUrl);
        /// <summary>
        /// Gets available remote images for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>RemoteImageResult</returns>
        RemoteImageResult GetItemsByIdRemoteimages (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages);

        /// <summary>
        /// Gets available remote images for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>ApiResponse of RemoteImageResult</returns>
        ApiResponse<RemoteImageResult> GetItemsByIdRemoteimagesWithHttpInfo (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages);
        /// <summary>
        /// Gets available remote image providers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>List&lt;ImageProviderInfo&gt;</returns>
        List<ImageProviderInfo> GetItemsByIdRemoteimagesProviders (string id);

        /// <summary>
        /// Gets available remote image providers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of List&lt;ImageProviderInfo&gt;</returns>
        ApiResponse<List<ImageProviderInfo>> GetItemsByIdRemoteimagesProvidersWithHttpInfo (string id);
        /// <summary>
        /// Downloads a remote image for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns></returns>
        void PostItemsByIdRemoteimagesDownload (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl);

        /// <summary>
        /// Downloads a remote image for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostItemsByIdRemoteimagesDownloadWithHttpInfo (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetImagesRemoteAsync (string imageUrl);

        /// <summary>
        /// Gets a remote image
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesRemoteAsyncWithHttpInfo (string imageUrl);
        /// <summary>
        /// Gets available remote images for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>Task of RemoteImageResult</returns>
        System.Threading.Tasks.Task<RemoteImageResult> GetItemsByIdRemoteimagesAsync (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages);

        /// <summary>
        /// Gets available remote images for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>Task of ApiResponse (RemoteImageResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<RemoteImageResult>> GetItemsByIdRemoteimagesAsyncWithHttpInfo (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages);
        /// <summary>
        /// Gets available remote image providers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of List&lt;ImageProviderInfo&gt;</returns>
        System.Threading.Tasks.Task<List<ImageProviderInfo>> GetItemsByIdRemoteimagesProvidersAsync (string id);

        /// <summary>
        /// Gets available remote image providers for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (List&lt;ImageProviderInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ImageProviderInfo>>> GetItemsByIdRemoteimagesProvidersAsyncWithHttpInfo (string id);
        /// <summary>
        /// Downloads a remote image for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostItemsByIdRemoteimagesDownloadAsync (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl);

        /// <summary>
        /// Downloads a remote image for an item
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdRemoteimagesDownloadAsyncWithHttpInfo (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class RemoteImageServiceApi : IRemoteImageServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteImageServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RemoteImageServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteImageServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public RemoteImageServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteImageServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RemoteImageServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns></returns>
        public void GetImagesRemote (string imageUrl)
        {
             GetImagesRemoteWithHttpInfo(imageUrl);
        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetImagesRemoteWithHttpInfo (string imageUrl)
        {
            // verify the required parameter 'imageUrl' is set
            if (imageUrl == null)
                throw new ApiException(400, "Missing required parameter 'imageUrl' when calling RemoteImageServiceApi->GetImagesRemote");

            var localVarPath = "/Images/Remote";
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

            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
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
                Exception exception = ExceptionFactory("GetImagesRemote", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetImagesRemoteAsync (string imageUrl)
        {
             await GetImagesRemoteAsyncWithHttpInfo(imageUrl);

        }

        /// <summary>
        /// Gets a remote image Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="imageUrl">The image url</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesRemoteAsyncWithHttpInfo (string imageUrl)
        {
            // verify the required parameter 'imageUrl' is set
            if (imageUrl == null)
                throw new ApiException(400, "Missing required parameter 'imageUrl' when calling RemoteImageServiceApi->GetImagesRemote");

            var localVarPath = "/Images/Remote";
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

            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
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
                Exception exception = ExceptionFactory("GetImagesRemote", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets available remote images for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>RemoteImageResult</returns>
        public RemoteImageResult GetItemsByIdRemoteimages (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages)
        {
             ApiResponse<RemoteImageResult> localVarResponse = GetItemsByIdRemoteimagesWithHttpInfo(id, type, startIndex, limit, providerName, includeAllLanguages, enableSeriesImages);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available remote images for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>ApiResponse of RemoteImageResult</returns>
        public ApiResponse< RemoteImageResult > GetItemsByIdRemoteimagesWithHttpInfo (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->GetItemsByIdRemoteimages");

            var localVarPath = "/Items/{Id}/RemoteImages";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (type != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Type", type)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
            if (includeAllLanguages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeAllLanguages", includeAllLanguages)); // query parameter
            if (enableSeriesImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableSeriesImages", enableSeriesImages)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemoteimages", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<RemoteImageResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (RemoteImageResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(RemoteImageResult)));
        }

        /// <summary>
        /// Gets available remote images for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>Task of RemoteImageResult</returns>
        public async System.Threading.Tasks.Task<RemoteImageResult> GetItemsByIdRemoteimagesAsync (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages)
        {
             ApiResponse<RemoteImageResult> localVarResponse = await GetItemsByIdRemoteimagesAsyncWithHttpInfo(id, type, startIndex, limit, providerName, includeAllLanguages, enableSeriesImages);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available remote images for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="type">The image type (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="providerName">Optional. The image provider to use (optional)</param>
        /// <param name="includeAllLanguages">Optional. (optional)</param>
        /// <param name="enableSeriesImages">Optional. (optional)</param>
        /// <returns>Task of ApiResponse (RemoteImageResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<RemoteImageResult>> GetItemsByIdRemoteimagesAsyncWithHttpInfo (string id, ImageType type, int? startIndex, int? limit, string providerName, bool? includeAllLanguages, bool? enableSeriesImages)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->GetItemsByIdRemoteimages");

            var localVarPath = "/Items/{Id}/RemoteImages";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (type != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Type", type)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
            if (includeAllLanguages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeAllLanguages", includeAllLanguages)); // query parameter
            if (enableSeriesImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableSeriesImages", enableSeriesImages)); // query parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemoteimages", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<RemoteImageResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (RemoteImageResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(RemoteImageResult)));
        }

        /// <summary>
        /// Gets available remote image providers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>List&lt;ImageProviderInfo&gt;</returns>
        public List<ImageProviderInfo> GetItemsByIdRemoteimagesProviders (string id)
        {
             ApiResponse<List<ImageProviderInfo>> localVarResponse = GetItemsByIdRemoteimagesProvidersWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available remote image providers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>ApiResponse of List&lt;ImageProviderInfo&gt;</returns>
        public ApiResponse< List<ImageProviderInfo> > GetItemsByIdRemoteimagesProvidersWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->GetItemsByIdRemoteimagesProviders");

            var localVarPath = "/Items/{Id}/RemoteImages/Providers";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemoteimagesProviders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageProviderInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageProviderInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageProviderInfo>)));
        }

        /// <summary>
        /// Gets available remote image providers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of List&lt;ImageProviderInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<ImageProviderInfo>> GetItemsByIdRemoteimagesProvidersAsync (string id)
        {
             ApiResponse<List<ImageProviderInfo>> localVarResponse = await GetItemsByIdRemoteimagesProvidersAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available remote image providers for an item Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse (List&lt;ImageProviderInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ImageProviderInfo>>> GetItemsByIdRemoteimagesProvidersAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->GetItemsByIdRemoteimagesProviders");

            var localVarPath = "/Items/{Id}/RemoteImages/Providers";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
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
                Exception exception = ExceptionFactory("GetItemsByIdRemoteimagesProviders", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageProviderInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageProviderInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageProviderInfo>)));
        }

        /// <summary>
        /// Downloads a remote image for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns></returns>
        public void PostItemsByIdRemoteimagesDownload (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl)
        {
             PostItemsByIdRemoteimagesDownloadWithHttpInfo(body, type, id, providerName, imageUrl);
        }

        /// <summary>
        /// Downloads a remote image for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostItemsByIdRemoteimagesDownloadWithHttpInfo (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");

            var localVarPath = "/Items/{Id}/RemoteImages/Download";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (type != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Type", type)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRemoteimagesDownload", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Downloads a remote image for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostItemsByIdRemoteimagesDownloadAsync (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl)
        {
             await PostItemsByIdRemoteimagesDownloadAsyncWithHttpInfo(body, type, id, providerName, imageUrl);

        }

        /// <summary>
        /// Downloads a remote image for an item Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">BaseDownloadRemoteImage: </param>
        /// <param name="type">The image type</param>
        /// <param name="id">Item Id</param>
        /// <param name="providerName">The image provider (optional)</param>
        /// <param name="imageUrl">The image url (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostItemsByIdRemoteimagesDownloadAsyncWithHttpInfo (ImagesBaseDownloadRemoteImage body, ImageType type, string id, string providerName, string imageUrl)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling RemoteImageServiceApi->PostItemsByIdRemoteimagesDownload");

            var localVarPath = "/Items/{Id}/RemoteImages/Download";
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

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (type != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Type", type)); // query parameter
            if (providerName != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ProviderName", providerName)); // query parameter
            if (imageUrl != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageUrl", imageUrl)); // query parameter
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
                Exception exception = ExceptionFactory("PostItemsByIdRemoteimagesDownload", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
