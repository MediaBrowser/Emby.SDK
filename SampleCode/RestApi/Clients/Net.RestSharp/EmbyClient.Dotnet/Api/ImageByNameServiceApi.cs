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
        public interface IImageByNameServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets all general images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        List<ImageByNameInfo> GetImagesGeneral ();

        /// <summary>
        /// Gets all general images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        ApiResponse<List<ImageByNameInfo>> GetImagesGeneralWithHttpInfo ();
        /// <summary>
        /// Gets a general image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns></returns>
        void GetImagesGeneralByNameByType (string name, string type);

        /// <summary>
        /// Gets a general image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetImagesGeneralByNameByTypeWithHttpInfo (string name, string type);
        /// <summary>
        /// Gets all media info image by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        List<ImageByNameInfo> GetImagesMediainfo ();

        /// <summary>
        /// Gets all media info image by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        ApiResponse<List<ImageByNameInfo>> GetImagesMediainfoWithHttpInfo ();
        /// <summary>
        /// Gets a media info image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns></returns>
        void GetImagesMediainfoByThemeByName (string name, string theme);

        /// <summary>
        /// Gets a media info image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetImagesMediainfoByThemeByNameWithHttpInfo (string name, string theme);
        /// <summary>
        /// Gets all rating images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        List<ImageByNameInfo> GetImagesRatings ();

        /// <summary>
        /// Gets all rating images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        ApiResponse<List<ImageByNameInfo>> GetImagesRatingsWithHttpInfo ();
        /// <summary>
        /// Gets a rating image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns></returns>
        void GetImagesRatingsByThemeByName (string name, string theme);

        /// <summary>
        /// Gets a rating image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetImagesRatingsByThemeByNameWithHttpInfo (string name, string theme);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets all general images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesGeneralAsync ();

        /// <summary>
        /// Gets all general images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesGeneralAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a general image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetImagesGeneralByNameByTypeAsync (string name, string type);

        /// <summary>
        /// Gets a general image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesGeneralByNameByTypeAsyncWithHttpInfo (string name, string type);
        /// <summary>
        /// Gets all media info image by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesMediainfoAsync ();

        /// <summary>
        /// Gets all media info image by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesMediainfoAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a media info image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetImagesMediainfoByThemeByNameAsync (string name, string theme);

        /// <summary>
        /// Gets a media info image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesMediainfoByThemeByNameAsyncWithHttpInfo (string name, string theme);
        /// <summary>
        /// Gets all rating images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesRatingsAsync ();

        /// <summary>
        /// Gets all rating images by name
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesRatingsAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a rating image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetImagesRatingsByThemeByNameAsync (string name, string theme);

        /// <summary>
        /// Gets a rating image by name
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesRatingsByThemeByNameAsyncWithHttpInfo (string name, string theme);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class ImageByNameServiceApi : IImageByNameServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageByNameServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ImageByNameServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageByNameServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public ImageByNameServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ImageByNameServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ImageByNameServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets all general images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        public List<ImageByNameInfo> GetImagesGeneral ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = GetImagesGeneralWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all general images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        public ApiResponse< List<ImageByNameInfo> > GetImagesGeneralWithHttpInfo ()
        {

            var localVarPath = "/Images/General";
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
                Exception exception = ExceptionFactory("GetImagesGeneral", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets all general images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesGeneralAsync ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = await GetImagesGeneralAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all general images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesGeneralAsyncWithHttpInfo ()
        {

            var localVarPath = "/Images/General";
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
                Exception exception = ExceptionFactory("GetImagesGeneral", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets a general image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns></returns>
        public void GetImagesGeneralByNameByType (string name, string type)
        {
             GetImagesGeneralByNameByTypeWithHttpInfo(name, type);
        }

        /// <summary>
        /// Gets a general image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetImagesGeneralByNameByTypeWithHttpInfo (string name, string type)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesGeneralByNameByType");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling ImageByNameServiceApi->GetImagesGeneralByNameByType");

            var localVarPath = "/Images/General/{Name}/{Type}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (type != null) localVarPathParams.Add("Type", this.Configuration.ApiClient.ParameterToString(type)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesGeneralByNameByType", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a general image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetImagesGeneralByNameByTypeAsync (string name, string type)
        {
             await GetImagesGeneralByNameByTypeAsyncWithHttpInfo(name, type);

        }

        /// <summary>
        /// Gets a general image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesGeneralByNameByTypeAsyncWithHttpInfo (string name, string type)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesGeneralByNameByType");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling ImageByNameServiceApi->GetImagesGeneralByNameByType");

            var localVarPath = "/Images/General/{Name}/{Type}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (type != null) localVarPathParams.Add("Type", this.Configuration.ApiClient.ParameterToString(type)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesGeneralByNameByType", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets all media info image by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        public List<ImageByNameInfo> GetImagesMediainfo ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = GetImagesMediainfoWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all media info image by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        public ApiResponse< List<ImageByNameInfo> > GetImagesMediainfoWithHttpInfo ()
        {

            var localVarPath = "/Images/MediaInfo";
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
                Exception exception = ExceptionFactory("GetImagesMediainfo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets all media info image by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesMediainfoAsync ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = await GetImagesMediainfoAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all media info image by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesMediainfoAsyncWithHttpInfo ()
        {

            var localVarPath = "/Images/MediaInfo";
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
                Exception exception = ExceptionFactory("GetImagesMediainfo", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets a media info image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns></returns>
        public void GetImagesMediainfoByThemeByName (string name, string theme)
        {
             GetImagesMediainfoByThemeByNameWithHttpInfo(name, theme);
        }

        /// <summary>
        /// Gets a media info image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetImagesMediainfoByThemeByNameWithHttpInfo (string name, string theme)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesMediainfoByThemeByName");
            // verify the required parameter 'theme' is set
            if (theme == null)
                throw new ApiException(400, "Missing required parameter 'theme' when calling ImageByNameServiceApi->GetImagesMediainfoByThemeByName");

            var localVarPath = "/Images/MediaInfo/{Theme}/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (theme != null) localVarPathParams.Add("Theme", this.Configuration.ApiClient.ParameterToString(theme)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesMediainfoByThemeByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a media info image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetImagesMediainfoByThemeByNameAsync (string name, string theme)
        {
             await GetImagesMediainfoByThemeByNameAsyncWithHttpInfo(name, theme);

        }

        /// <summary>
        /// Gets a media info image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesMediainfoByThemeByNameAsyncWithHttpInfo (string name, string theme)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesMediainfoByThemeByName");
            // verify the required parameter 'theme' is set
            if (theme == null)
                throw new ApiException(400, "Missing required parameter 'theme' when calling ImageByNameServiceApi->GetImagesMediainfoByThemeByName");

            var localVarPath = "/Images/MediaInfo/{Theme}/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (theme != null) localVarPathParams.Add("Theme", this.Configuration.ApiClient.ParameterToString(theme)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesMediainfoByThemeByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets all rating images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;ImageByNameInfo&gt;</returns>
        public List<ImageByNameInfo> GetImagesRatings ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = GetImagesRatingsWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets all rating images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;ImageByNameInfo&gt;</returns>
        public ApiResponse< List<ImageByNameInfo> > GetImagesRatingsWithHttpInfo ()
        {

            var localVarPath = "/Images/Ratings";
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
                Exception exception = ExceptionFactory("GetImagesRatings", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets all rating images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;ImageByNameInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<ImageByNameInfo>> GetImagesRatingsAsync ()
        {
             ApiResponse<List<ImageByNameInfo>> localVarResponse = await GetImagesRatingsAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets all rating images by name Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;ImageByNameInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<ImageByNameInfo>>> GetImagesRatingsAsyncWithHttpInfo ()
        {

            var localVarPath = "/Images/Ratings";
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
                Exception exception = ExceptionFactory("GetImagesRatings", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<ImageByNameInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<ImageByNameInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<ImageByNameInfo>)));
        }

        /// <summary>
        /// Gets a rating image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns></returns>
        public void GetImagesRatingsByThemeByName (string name, string theme)
        {
             GetImagesRatingsByThemeByNameWithHttpInfo(name, theme);
        }

        /// <summary>
        /// Gets a rating image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetImagesRatingsByThemeByNameWithHttpInfo (string name, string theme)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesRatingsByThemeByName");
            // verify the required parameter 'theme' is set
            if (theme == null)
                throw new ApiException(400, "Missing required parameter 'theme' when calling ImageByNameServiceApi->GetImagesRatingsByThemeByName");

            var localVarPath = "/Images/Ratings/{Theme}/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (theme != null) localVarPathParams.Add("Theme", this.Configuration.ApiClient.ParameterToString(theme)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesRatingsByThemeByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a rating image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetImagesRatingsByThemeByNameAsync (string name, string theme)
        {
             await GetImagesRatingsByThemeByNameAsyncWithHttpInfo(name, theme);

        }

        /// <summary>
        /// Gets a rating image by name No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the image</param>
        /// <param name="theme">The theme to get the image from</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetImagesRatingsByThemeByNameAsyncWithHttpInfo (string name, string theme)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling ImageByNameServiceApi->GetImagesRatingsByThemeByName");
            // verify the required parameter 'theme' is set
            if (theme == null)
                throw new ApiException(400, "Missing required parameter 'theme' when calling ImageByNameServiceApi->GetImagesRatingsByThemeByName");

            var localVarPath = "/Images/Ratings/{Theme}/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (theme != null) localVarPathParams.Add("Theme", this.Configuration.ApiClient.ParameterToString(theme)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetImagesRatingsByThemeByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
