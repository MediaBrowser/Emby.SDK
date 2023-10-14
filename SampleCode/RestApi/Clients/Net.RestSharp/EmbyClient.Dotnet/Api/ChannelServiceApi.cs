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
        public interface IChannelServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets available channels
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        QueryResultBaseItemDto GetChannels (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets available channels
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        ApiResponse<QueryResultBaseItemDto> GetChannelsWithHttpInfo (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets available channels
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        System.Threading.Tasks.Task<QueryResultBaseItemDto> GetChannelsAsync (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);

        /// <summary>
        /// Gets available channels
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetChannelsAsyncWithHttpInfo (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ChannelServiceApi : IChannelServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ChannelServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ChannelServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ChannelServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public ChannelServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ChannelServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ChannelServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets available channels Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>QueryResultBaseItemDto</returns>
        public QueryResultBaseItemDto GetChannels (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = GetChannelsWithHttpInfo(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available channels Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>ApiResponse of QueryResultBaseItemDto</returns>
        public ApiResponse< QueryResultBaseItemDto > GetChannelsWithHttpInfo (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {

            var localVarPath = "/Channels";
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

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetChannels", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

        /// <summary>
        /// Gets available channels Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of QueryResultBaseItemDto</returns>
        public async System.Threading.Tasks.Task<QueryResultBaseItemDto> GetChannelsAsync (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {
             ApiResponse<QueryResultBaseItemDto> localVarResponse = await GetChannelsAsyncWithHttpInfo(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available channels Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId">User Id (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="fields">Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultBaseItemDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultBaseItemDto>> GetChannelsAsyncWithHttpInfo (string userId, int? startIndex, string fields, int? limit, bool? enableImages, int? imageTypeLimit, string enableImageTypes, bool? enableUserData)
        {

            var localVarPath = "/Channels";
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

            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (fields != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Fields", fields)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
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
                Exception exception = ExceptionFactory("GetChannels", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultBaseItemDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultBaseItemDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultBaseItemDto)));
        }

    }
}
