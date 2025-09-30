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
        public interface IVideoHlsServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class VideoHlsServiceApi : IVideoHlsServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="VideoHlsServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public VideoHlsServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="VideoHlsServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public VideoHlsServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="VideoHlsServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public VideoHlsServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}";
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

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling VideoHlsServiceApi->GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}";
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

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}";
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

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling VideoHlsServiceApi->GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}";
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

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
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
                Exception exception = ExceptionFactory("GetVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
