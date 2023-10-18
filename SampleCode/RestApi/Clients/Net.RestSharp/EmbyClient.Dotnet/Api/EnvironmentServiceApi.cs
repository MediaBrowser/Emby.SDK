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
        public interface IEnvironmentServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>DefaultDirectoryBrowserInfo</returns>
        DefaultDirectoryBrowserInfo GetEnvironmentDefaultdirectorybrowser ();

        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of DefaultDirectoryBrowserInfo</returns>
        ApiResponse<DefaultDirectoryBrowserInfo> GetEnvironmentDefaultdirectorybrowserWithHttpInfo ();
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        List<IOFileSystemEntryInfo> GetEnvironmentDirectorycontents (string path, bool? includeFiles, bool? includeDirectories);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        ApiResponse<List<IOFileSystemEntryInfo>> GetEnvironmentDirectorycontentsWithHttpInfo (string path, bool? includeFiles, bool? includeDirectories);
        /// <summary>
        /// Gets available drives from the server&#x27;s file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        List<IOFileSystemEntryInfo> GetEnvironmentDrives ();

        /// <summary>
        /// Gets available drives from the server&#x27;s file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        ApiResponse<List<IOFileSystemEntryInfo>> GetEnvironmentDrivesWithHttpInfo ();
        /// <summary>
        /// Gets a list of devices on the network
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        List<IOFileSystemEntryInfo> GetEnvironmentNetworkdevices ();

        /// <summary>
        /// Gets a list of devices on the network
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        ApiResponse<List<IOFileSystemEntryInfo>> GetEnvironmentNetworkdevicesWithHttpInfo ();
        /// <summary>
        /// Gets shares from a network device
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        List<IOFileSystemEntryInfo> GetEnvironmentNetworkshares (string path);

        /// <summary>
        /// Gets shares from a network device
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        ApiResponse<List<IOFileSystemEntryInfo>> GetEnvironmentNetworksharesWithHttpInfo (string path);
        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>string</returns>
        string GetEnvironmentParentpath (string path);

        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>ApiResponse of string</returns>
        ApiResponse<string> GetEnvironmentParentpathWithHttpInfo (string path);
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        List<IOFileSystemEntryInfo> PostEnvironmentDirectorycontents (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        ApiResponse<List<IOFileSystemEntryInfo>> PostEnvironmentDirectorycontentsWithHttpInfo (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories);
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns></returns>
        void PostEnvironmentValidatepath (ValidatePath body, string path);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostEnvironmentValidatepathWithHttpInfo (ValidatePath body, string path);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of DefaultDirectoryBrowserInfo</returns>
        System.Threading.Tasks.Task<DefaultDirectoryBrowserInfo> GetEnvironmentDefaultdirectorybrowserAsync ();

        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (DefaultDirectoryBrowserInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<DefaultDirectoryBrowserInfo>> GetEnvironmentDefaultdirectorybrowserAsyncWithHttpInfo ();
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentDirectorycontentsAsync (string path, bool? includeFiles, bool? includeDirectories);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentDirectorycontentsAsyncWithHttpInfo (string path, bool? includeFiles, bool? includeDirectories);
        /// <summary>
        /// Gets available drives from the server&#x27;s file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentDrivesAsync ();

        /// <summary>
        /// Gets available drives from the server&#x27;s file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentDrivesAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a list of devices on the network
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentNetworkdevicesAsync ();

        /// <summary>
        /// Gets a list of devices on the network
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentNetworkdevicesAsyncWithHttpInfo ();
        /// <summary>
        /// Gets shares from a network device
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentNetworksharesAsync (string path);

        /// <summary>
        /// Gets shares from a network device
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentNetworksharesAsyncWithHttpInfo (string path);
        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of string</returns>
        System.Threading.Tasks.Task<string> GetEnvironmentParentpathAsync (string path);

        /// <summary>
        /// Gets the parent path of a given path
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse (string)</returns>
        System.Threading.Tasks.Task<ApiResponse<string>> GetEnvironmentParentpathAsyncWithHttpInfo (string path);
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> PostEnvironmentDirectorycontentsAsync (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> PostEnvironmentDirectorycontentsAsyncWithHttpInfo (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories);
        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostEnvironmentValidatepathAsync (ValidatePath body, string path);

        /// <summary>
        /// Gets the contents of a given directory in the file system
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostEnvironmentValidatepathAsyncWithHttpInfo (ValidatePath body, string path);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class EnvironmentServiceApi : IEnvironmentServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EnvironmentServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public EnvironmentServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EnvironmentServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>DefaultDirectoryBrowserInfo</returns>
        public DefaultDirectoryBrowserInfo GetEnvironmentDefaultdirectorybrowser ()
        {
             ApiResponse<DefaultDirectoryBrowserInfo> localVarResponse = GetEnvironmentDefaultdirectorybrowserWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of DefaultDirectoryBrowserInfo</returns>
        public ApiResponse< DefaultDirectoryBrowserInfo > GetEnvironmentDefaultdirectorybrowserWithHttpInfo ()
        {

            var localVarPath = "/Environment/DefaultDirectoryBrowser";
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
                Exception exception = ExceptionFactory("GetEnvironmentDefaultdirectorybrowser", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DefaultDirectoryBrowserInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DefaultDirectoryBrowserInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DefaultDirectoryBrowserInfo)));
        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of DefaultDirectoryBrowserInfo</returns>
        public async System.Threading.Tasks.Task<DefaultDirectoryBrowserInfo> GetEnvironmentDefaultdirectorybrowserAsync ()
        {
             ApiResponse<DefaultDirectoryBrowserInfo> localVarResponse = await GetEnvironmentDefaultdirectorybrowserAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (DefaultDirectoryBrowserInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DefaultDirectoryBrowserInfo>> GetEnvironmentDefaultdirectorybrowserAsyncWithHttpInfo ()
        {

            var localVarPath = "/Environment/DefaultDirectoryBrowser";
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
                Exception exception = ExceptionFactory("GetEnvironmentDefaultdirectorybrowser", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DefaultDirectoryBrowserInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DefaultDirectoryBrowserInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DefaultDirectoryBrowserInfo)));
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        public List<IOFileSystemEntryInfo> GetEnvironmentDirectorycontents (string path, bool? includeFiles, bool? includeDirectories)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = GetEnvironmentDirectorycontentsWithHttpInfo(path, includeFiles, includeDirectories);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public ApiResponse< List<IOFileSystemEntryInfo> > GetEnvironmentDirectorycontentsWithHttpInfo (string path, bool? includeFiles, bool? includeDirectories)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentDirectorycontents");

            var localVarPath = "/Environment/DirectoryContents";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (includeFiles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeFiles", includeFiles)); // query parameter
            if (includeDirectories != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeDirectories", includeDirectories)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentDirectorycontents", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentDirectorycontentsAsync (string path, bool? includeFiles, bool? includeDirectories)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = await GetEnvironmentDirectorycontentsAsyncWithHttpInfo(path, includeFiles, includeDirectories);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentDirectorycontentsAsyncWithHttpInfo (string path, bool? includeFiles, bool? includeDirectories)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentDirectorycontents");

            var localVarPath = "/Environment/DirectoryContents";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (includeFiles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeFiles", includeFiles)); // query parameter
            if (includeDirectories != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeDirectories", includeDirectories)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentDirectorycontents", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets available drives from the server&#x27;s file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        public List<IOFileSystemEntryInfo> GetEnvironmentDrives ()
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = GetEnvironmentDrivesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available drives from the server&#x27;s file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public ApiResponse< List<IOFileSystemEntryInfo> > GetEnvironmentDrivesWithHttpInfo ()
        {

            var localVarPath = "/Environment/Drives";
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
                Exception exception = ExceptionFactory("GetEnvironmentDrives", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets available drives from the server&#x27;s file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentDrivesAsync ()
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = await GetEnvironmentDrivesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available drives from the server&#x27;s file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentDrivesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Environment/Drives";
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
                Exception exception = ExceptionFactory("GetEnvironmentDrives", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets a list of devices on the network Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        public List<IOFileSystemEntryInfo> GetEnvironmentNetworkdevices ()
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = GetEnvironmentNetworkdevicesWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of devices on the network Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public ApiResponse< List<IOFileSystemEntryInfo> > GetEnvironmentNetworkdevicesWithHttpInfo ()
        {

            var localVarPath = "/Environment/NetworkDevices";
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
                Exception exception = ExceptionFactory("GetEnvironmentNetworkdevices", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets a list of devices on the network Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentNetworkdevicesAsync ()
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = await GetEnvironmentNetworkdevicesAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of devices on the network Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentNetworkdevicesAsyncWithHttpInfo ()
        {

            var localVarPath = "/Environment/NetworkDevices";
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
                Exception exception = ExceptionFactory("GetEnvironmentNetworkdevices", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets shares from a network device Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        public List<IOFileSystemEntryInfo> GetEnvironmentNetworkshares (string path)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = GetEnvironmentNetworksharesWithHttpInfo(path);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets shares from a network device Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public ApiResponse< List<IOFileSystemEntryInfo> > GetEnvironmentNetworksharesWithHttpInfo (string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentNetworkshares");

            var localVarPath = "/Environment/NetworkShares";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentNetworkshares", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets shares from a network device Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> GetEnvironmentNetworksharesAsync (string path)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = await GetEnvironmentNetworksharesAsyncWithHttpInfo(path);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets shares from a network device Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> GetEnvironmentNetworksharesAsyncWithHttpInfo (string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentNetworkshares");

            var localVarPath = "/Environment/NetworkShares";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentNetworkshares", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>string</returns>
        public string GetEnvironmentParentpath (string path)
        {
             ApiResponse<string> localVarResponse = GetEnvironmentParentpathWithHttpInfo(path);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>ApiResponse of string</returns>
        public ApiResponse< string > GetEnvironmentParentpathWithHttpInfo (string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentParentpath");

            var localVarPath = "/Environment/ParentPath";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentParentpath", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<string>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (string) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(string)));
        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of string</returns>
        public async System.Threading.Tasks.Task<string> GetEnvironmentParentpathAsync (string path)
        {
             ApiResponse<string> localVarResponse = await GetEnvironmentParentpathAsyncWithHttpInfo(path);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the parent path of a given path Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse (string)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<string>> GetEnvironmentParentpathAsyncWithHttpInfo (string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->GetEnvironmentParentpath");

            var localVarPath = "/Environment/ParentPath";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("GetEnvironmentParentpath", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<string>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (string) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(string)));
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>List&lt;IOFileSystemEntryInfo&gt;</returns>
        public List<IOFileSystemEntryInfo> PostEnvironmentDirectorycontents (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = PostEnvironmentDirectorycontentsWithHttpInfo(body, path, includeFiles, includeDirectories);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>ApiResponse of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public ApiResponse< List<IOFileSystemEntryInfo> > PostEnvironmentDirectorycontentsWithHttpInfo (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling EnvironmentServiceApi->PostEnvironmentDirectorycontents");
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->PostEnvironmentDirectorycontents");

            var localVarPath = "/Environment/DirectoryContents";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (includeFiles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeFiles", includeFiles)); // query parameter
            if (includeDirectories != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeDirectories", includeDirectories)); // query parameter
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
                Exception exception = ExceptionFactory("PostEnvironmentDirectorycontents", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of List&lt;IOFileSystemEntryInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<IOFileSystemEntryInfo>> PostEnvironmentDirectorycontentsAsync (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories)
        {
             ApiResponse<List<IOFileSystemEntryInfo>> localVarResponse = await PostEnvironmentDirectorycontentsAsyncWithHttpInfo(body, path, includeFiles, includeDirectories);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">GetDirectoryContents</param>
        /// <param name="path"></param>
        /// <param name="includeFiles">An optional filter to include or exclude files from the results. true/false (optional)</param>
        /// <param name="includeDirectories">An optional filter to include or exclude folders from the results. true/false (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;IOFileSystemEntryInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<IOFileSystemEntryInfo>>> PostEnvironmentDirectorycontentsAsyncWithHttpInfo (GetDirectoryContents body, string path, bool? includeFiles, bool? includeDirectories)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling EnvironmentServiceApi->PostEnvironmentDirectorycontents");
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->PostEnvironmentDirectorycontents");

            var localVarPath = "/Environment/DirectoryContents";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
            if (includeFiles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeFiles", includeFiles)); // query parameter
            if (includeDirectories != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IncludeDirectories", includeDirectories)); // query parameter
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
                Exception exception = ExceptionFactory("PostEnvironmentDirectorycontents", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<IOFileSystemEntryInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<IOFileSystemEntryInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<IOFileSystemEntryInfo>)));
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns></returns>
        public void PostEnvironmentValidatepath (ValidatePath body, string path)
        {
             PostEnvironmentValidatepathWithHttpInfo(body, path);
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostEnvironmentValidatepathWithHttpInfo (ValidatePath body, string path)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling EnvironmentServiceApi->PostEnvironmentValidatepath");
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->PostEnvironmentValidatepath");

            var localVarPath = "/Environment/ValidatePath";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("PostEnvironmentValidatepath", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostEnvironmentValidatepathAsync (ValidatePath body, string path)
        {
             await PostEnvironmentValidatepathAsyncWithHttpInfo(body, path);

        }

        /// <summary>
        /// Gets the contents of a given directory in the file system Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ValidatePath</param>
        /// <param name="path"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostEnvironmentValidatepathAsyncWithHttpInfo (ValidatePath body, string path)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling EnvironmentServiceApi->PostEnvironmentValidatepath");
            // verify the required parameter 'path' is set
            if (path == null)
                throw new ApiException(400, "Missing required parameter 'path' when calling EnvironmentServiceApi->PostEnvironmentValidatepath");

            var localVarPath = "/Environment/ValidatePath";
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

            if (path != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Path", path)); // query parameter
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
                Exception exception = ExceptionFactory("PostEnvironmentValidatepath", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
