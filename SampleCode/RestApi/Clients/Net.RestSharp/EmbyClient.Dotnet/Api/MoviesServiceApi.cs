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
        public interface IMoviesServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets movie recommendations
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>List&lt;RecommendationDto&gt;</returns>
        List<RecommendationDto> GetMoviesRecommendations (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes);

        /// <summary>
        /// Gets movie recommendations
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>ApiResponse of List&lt;RecommendationDto&gt;</returns>
        ApiResponse<List<RecommendationDto>> GetMoviesRecommendationsWithHttpInfo (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets movie recommendations
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>Task of List&lt;RecommendationDto&gt;</returns>
        System.Threading.Tasks.Task<List<RecommendationDto>> GetMoviesRecommendationsAsync (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes);

        /// <summary>
        /// Gets movie recommendations
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;RecommendationDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<RecommendationDto>>> GetMoviesRecommendationsAsyncWithHttpInfo (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class MoviesServiceApi : IMoviesServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="MoviesServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MoviesServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MoviesServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public MoviesServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MoviesServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public MoviesServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets movie recommendations Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>List&lt;RecommendationDto&gt;</returns>
        public List<RecommendationDto> GetMoviesRecommendations (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes)
        {
             ApiResponse<List<RecommendationDto>> localVarResponse = GetMoviesRecommendationsWithHttpInfo(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets movie recommendations Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>ApiResponse of List&lt;RecommendationDto&gt;</returns>
        public ApiResponse< List<RecommendationDto> > GetMoviesRecommendationsWithHttpInfo (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes)
        {

            var localVarPath = "/Movies/Recommendations";
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

            if (categoryLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CategoryLimit", categoryLimit)); // query parameter
            if (itemLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemLimit", itemLimit)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
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
                Exception exception = ExceptionFactory("GetMoviesRecommendations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RecommendationDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RecommendationDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RecommendationDto>)));
        }

        /// <summary>
        /// Gets movie recommendations Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>Task of List&lt;RecommendationDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<RecommendationDto>> GetMoviesRecommendationsAsync (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes)
        {
             ApiResponse<List<RecommendationDto>> localVarResponse = await GetMoviesRecommendationsAsyncWithHttpInfo(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets movie recommendations Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="categoryLimit">The max number of categories to return (optional)</param>
        /// <param name="itemLimit">The max number of items to return per category (optional)</param>
        /// <param name="userId">Optional. Filter by user id, and attach user data (optional)</param>
        /// <param name="parentId">Specify this to localize the search to a specific item or folder. Omit to use the root (optional)</param>
        /// <param name="enableImages">Optional, include image information in output (optional)</param>
        /// <param name="enableUserData">Optional, include user data (optional)</param>
        /// <param name="imageTypeLimit">Optional, the max number of images to return, per image type (optional)</param>
        /// <param name="enableImageTypes">Optional. The image types to include in the output. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;RecommendationDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<RecommendationDto>>> GetMoviesRecommendationsAsyncWithHttpInfo (int? categoryLimit, int? itemLimit, string userId, string parentId, bool? enableImages, bool? enableUserData, int? imageTypeLimit, string enableImageTypes)
        {

            var localVarPath = "/Movies/Recommendations";
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

            if (categoryLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CategoryLimit", categoryLimit)); // query parameter
            if (itemLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ItemLimit", itemLimit)); // query parameter
            if (userId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UserId", userId)); // query parameter
            if (parentId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParentId", parentId)); // query parameter
            if (enableImages != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImages", enableImages)); // query parameter
            if (enableUserData != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableUserData", enableUserData)); // query parameter
            if (imageTypeLimit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ImageTypeLimit", imageTypeLimit)); // query parameter
            if (enableImageTypes != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableImageTypes", enableImageTypes)); // query parameter
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
                Exception exception = ExceptionFactory("GetMoviesRecommendations", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<RecommendationDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<RecommendationDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<RecommendationDto>)));
        }

    }
}
