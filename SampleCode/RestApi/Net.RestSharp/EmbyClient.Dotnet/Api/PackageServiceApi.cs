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
        public interface IPackageServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns></returns>
        void DeletePackagesInstallingById (string id);

        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeletePackagesInstallingByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets available packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>List&lt;PackageInfo&gt;</returns>
        List<PackageInfo> GetPackages (string packageType, string targetSystems, bool? isPremium, bool? isAdult);

        /// <summary>
        /// Gets available packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>ApiResponse of List&lt;PackageInfo&gt;</returns>
        ApiResponse<List<PackageInfo>> GetPackagesWithHttpInfo (string packageType, string targetSystems, bool? isPremium, bool? isAdult);
        /// <summary>
        /// Gets a package, by name or assembly guid
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>PackageInfo</returns>
        PackageInfo GetPackagesByName (string name, string assemblyGuid);

        /// <summary>
        /// Gets a package, by name or assembly guid
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>ApiResponse of PackageInfo</returns>
        ApiResponse<PackageInfo> GetPackagesByNameWithHttpInfo (string name, string assemblyGuid);
        /// <summary>
        /// Gets available package updates for currently installed packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>List&lt;PackageVersionInfo&gt;</returns>
        List<PackageVersionInfo> GetPackagesUpdates (string packageType);

        /// <summary>
        /// Gets available package updates for currently installed packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>ApiResponse of List&lt;PackageVersionInfo&gt;</returns>
        ApiResponse<List<PackageVersionInfo>> GetPackagesUpdatesWithHttpInfo (string packageType);
        /// <summary>
        /// Installs a package
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns></returns>
        void PostPackagesInstalledByName (string name, string assemblyGuid, string version, PackageVersionClass updateClass);

        /// <summary>
        /// Installs a package
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostPackagesInstalledByNameWithHttpInfo (string name, string assemblyGuid, string version, PackageVersionClass updateClass);
        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns></returns>
        void PostPackagesInstallingByIdDelete (string id);

        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostPackagesInstallingByIdDeleteWithHttpInfo (string id);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeletePackagesInstallingByIdAsync (string id);

        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeletePackagesInstallingByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets available packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>Task of List&lt;PackageInfo&gt;</returns>
        System.Threading.Tasks.Task<List<PackageInfo>> GetPackagesAsync (string packageType, string targetSystems, bool? isPremium, bool? isAdult);

        /// <summary>
        /// Gets available packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;PackageInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<PackageInfo>>> GetPackagesAsyncWithHttpInfo (string packageType, string targetSystems, bool? isPremium, bool? isAdult);
        /// <summary>
        /// Gets a package, by name or assembly guid
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>Task of PackageInfo</returns>
        System.Threading.Tasks.Task<PackageInfo> GetPackagesByNameAsync (string name, string assemblyGuid);

        /// <summary>
        /// Gets a package, by name or assembly guid
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>Task of ApiResponse (PackageInfo)</returns>
        System.Threading.Tasks.Task<ApiResponse<PackageInfo>> GetPackagesByNameAsyncWithHttpInfo (string name, string assemblyGuid);
        /// <summary>
        /// Gets available package updates for currently installed packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>Task of List&lt;PackageVersionInfo&gt;</returns>
        System.Threading.Tasks.Task<List<PackageVersionInfo>> GetPackagesUpdatesAsync (string packageType);

        /// <summary>
        /// Gets available package updates for currently installed packages
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>Task of ApiResponse (List&lt;PackageVersionInfo&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<PackageVersionInfo>>> GetPackagesUpdatesAsyncWithHttpInfo (string packageType);
        /// <summary>
        /// Installs a package
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostPackagesInstalledByNameAsync (string name, string assemblyGuid, string version, PackageVersionClass updateClass);

        /// <summary>
        /// Installs a package
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostPackagesInstalledByNameAsyncWithHttpInfo (string name, string assemblyGuid, string version, PackageVersionClass updateClass);
        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostPackagesInstallingByIdDeleteAsync (string id);

        /// <summary>
        /// Cancels a package installation
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostPackagesInstallingByIdDeleteAsyncWithHttpInfo (string id);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class PackageServiceApi : IPackageServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="PackageServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PackageServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PackageServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public PackageServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PackageServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public PackageServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns></returns>
        public void DeletePackagesInstallingById (string id)
        {
             DeletePackagesInstallingByIdWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeletePackagesInstallingByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PackageServiceApi->DeletePackagesInstallingById");

            var localVarPath = "/Packages/Installing/{Id}";
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
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeletePackagesInstallingById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeletePackagesInstallingByIdAsync (string id)
        {
             await DeletePackagesInstallingByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeletePackagesInstallingByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PackageServiceApi->DeletePackagesInstallingById");

            var localVarPath = "/Packages/Installing/{Id}";
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
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeletePackagesInstallingById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets available packages Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>List&lt;PackageInfo&gt;</returns>
        public List<PackageInfo> GetPackages (string packageType, string targetSystems, bool? isPremium, bool? isAdult)
        {
             ApiResponse<List<PackageInfo>> localVarResponse = GetPackagesWithHttpInfo(packageType, targetSystems, isPremium, isAdult);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available packages Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>ApiResponse of List&lt;PackageInfo&gt;</returns>
        public ApiResponse< List<PackageInfo> > GetPackagesWithHttpInfo (string packageType, string targetSystems, bool? isPremium, bool? isAdult)
        {

            var localVarPath = "/Packages";
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

            if (packageType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PackageType", packageType)); // query parameter
            if (targetSystems != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetSystems", targetSystems)); // query parameter
            if (isPremium != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPremium", isPremium)); // query parameter
            if (isAdult != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsAdult", isAdult)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackages", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PackageInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PackageInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PackageInfo>)));
        }

        /// <summary>
        /// Gets available packages Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>Task of List&lt;PackageInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<PackageInfo>> GetPackagesAsync (string packageType, string targetSystems, bool? isPremium, bool? isAdult)
        {
             ApiResponse<List<PackageInfo>> localVarResponse = await GetPackagesAsyncWithHttpInfo(packageType, targetSystems, isPremium, isAdult);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available packages Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Optional package type filter (System/UserInstalled) (optional)</param>
        /// <param name="targetSystems">Optional. Filter by target system type. Allows multiple, comma delimited. (optional)</param>
        /// <param name="isPremium">Optional. Filter by premium status (optional)</param>
        /// <param name="isAdult">Optional. Filter by package that contain adult content. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;PackageInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<PackageInfo>>> GetPackagesAsyncWithHttpInfo (string packageType, string targetSystems, bool? isPremium, bool? isAdult)
        {

            var localVarPath = "/Packages";
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

            if (packageType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PackageType", packageType)); // query parameter
            if (targetSystems != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "TargetSystems", targetSystems)); // query parameter
            if (isPremium != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsPremium", isPremium)); // query parameter
            if (isAdult != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsAdult", isAdult)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackages", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PackageInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PackageInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PackageInfo>)));
        }

        /// <summary>
        /// Gets a package, by name or assembly guid Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>PackageInfo</returns>
        public PackageInfo GetPackagesByName (string name, string assemblyGuid)
        {
             ApiResponse<PackageInfo> localVarResponse = GetPackagesByNameWithHttpInfo(name, assemblyGuid);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a package, by name or assembly guid Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>ApiResponse of PackageInfo</returns>
        public ApiResponse< PackageInfo > GetPackagesByNameWithHttpInfo (string name, string assemblyGuid)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling PackageServiceApi->GetPackagesByName");

            var localVarPath = "/Packages/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (assemblyGuid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AssemblyGuid", assemblyGuid)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackagesByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PackageInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (PackageInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(PackageInfo)));
        }

        /// <summary>
        /// Gets a package, by name or assembly guid Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>Task of PackageInfo</returns>
        public async System.Threading.Tasks.Task<PackageInfo> GetPackagesByNameAsync (string name, string assemblyGuid)
        {
             ApiResponse<PackageInfo> localVarResponse = await GetPackagesByNameAsyncWithHttpInfo(name, assemblyGuid);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a package, by name or assembly guid Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">The name of the package</param>
        /// <param name="assemblyGuid">The guid of the associated assembly (optional)</param>
        /// <returns>Task of ApiResponse (PackageInfo)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PackageInfo>> GetPackagesByNameAsyncWithHttpInfo (string name, string assemblyGuid)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling PackageServiceApi->GetPackagesByName");

            var localVarPath = "/Packages/{Name}";
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

            if (name != null) localVarPathParams.Add("Name", this.Configuration.ApiClient.ParameterToString(name)); // path parameter
            if (assemblyGuid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AssemblyGuid", assemblyGuid)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackagesByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PackageInfo>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (PackageInfo) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(PackageInfo)));
        }

        /// <summary>
        /// Gets available package updates for currently installed packages Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>List&lt;PackageVersionInfo&gt;</returns>
        public List<PackageVersionInfo> GetPackagesUpdates (string packageType)
        {
             ApiResponse<List<PackageVersionInfo>> localVarResponse = GetPackagesUpdatesWithHttpInfo(packageType);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets available package updates for currently installed packages Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>ApiResponse of List&lt;PackageVersionInfo&gt;</returns>
        public ApiResponse< List<PackageVersionInfo> > GetPackagesUpdatesWithHttpInfo (string packageType)
        {
            // verify the required parameter 'packageType' is set
            if (packageType == null)
                throw new ApiException(400, "Missing required parameter 'packageType' when calling PackageServiceApi->GetPackagesUpdates");

            var localVarPath = "/Packages/Updates";
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

            if (packageType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PackageType", packageType)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackagesUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PackageVersionInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PackageVersionInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PackageVersionInfo>)));
        }

        /// <summary>
        /// Gets available package updates for currently installed packages Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>Task of List&lt;PackageVersionInfo&gt;</returns>
        public async System.Threading.Tasks.Task<List<PackageVersionInfo>> GetPackagesUpdatesAsync (string packageType)
        {
             ApiResponse<List<PackageVersionInfo>> localVarResponse = await GetPackagesUpdatesAsyncWithHttpInfo(packageType);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets available package updates for currently installed packages Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="packageType">Package type filter (System/UserInstalled)</param>
        /// <returns>Task of ApiResponse (List&lt;PackageVersionInfo&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<PackageVersionInfo>>> GetPackagesUpdatesAsyncWithHttpInfo (string packageType)
        {
            // verify the required parameter 'packageType' is set
            if (packageType == null)
                throw new ApiException(400, "Missing required parameter 'packageType' when calling PackageServiceApi->GetPackagesUpdates");

            var localVarPath = "/Packages/Updates";
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

            if (packageType != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "PackageType", packageType)); // query parameter
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
                Exception exception = ExceptionFactory("GetPackagesUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<PackageVersionInfo>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<PackageVersionInfo>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<PackageVersionInfo>)));
        }

        /// <summary>
        /// Installs a package Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns></returns>
        public void PostPackagesInstalledByName (string name, string assemblyGuid, string version, PackageVersionClass updateClass)
        {
             PostPackagesInstalledByNameWithHttpInfo(name, assemblyGuid, version, updateClass);
        }

        /// <summary>
        /// Installs a package Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostPackagesInstalledByNameWithHttpInfo (string name, string assemblyGuid, string version, PackageVersionClass updateClass)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling PackageServiceApi->PostPackagesInstalledByName");

            var localVarPath = "/Packages/Installed/{Name}";
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
            if (assemblyGuid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AssemblyGuid", assemblyGuid)); // query parameter
            if (version != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Version", version)); // query parameter
            if (updateClass != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UpdateClass", updateClass)); // query parameter
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
                Exception exception = ExceptionFactory("PostPackagesInstalledByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Installs a package Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostPackagesInstalledByNameAsync (string name, string assemblyGuid, string version, PackageVersionClass updateClass)
        {
             await PostPackagesInstalledByNameAsyncWithHttpInfo(name, assemblyGuid, version, updateClass);

        }

        /// <summary>
        /// Installs a package Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="name">Package name</param>
        /// <param name="assemblyGuid">Guid of the associated assembly (optional)</param>
        /// <param name="version">Optional version. Defaults to latest version. (optional)</param>
        /// <param name="updateClass">Optional update class (Dev, Beta, Release). Defaults to Release. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostPackagesInstalledByNameAsyncWithHttpInfo (string name, string assemblyGuid, string version, PackageVersionClass updateClass)
        {
            // verify the required parameter 'name' is set
            if (name == null)
                throw new ApiException(400, "Missing required parameter 'name' when calling PackageServiceApi->PostPackagesInstalledByName");

            var localVarPath = "/Packages/Installed/{Name}";
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
            if (assemblyGuid != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AssemblyGuid", assemblyGuid)); // query parameter
            if (version != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Version", version)); // query parameter
            if (updateClass != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "UpdateClass", updateClass)); // query parameter
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
                Exception exception = ExceptionFactory("PostPackagesInstalledByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns></returns>
        public void PostPackagesInstallingByIdDelete (string id)
        {
             PostPackagesInstallingByIdDeleteWithHttpInfo(id);
        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostPackagesInstallingByIdDeleteWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PackageServiceApi->PostPackagesInstallingByIdDelete");

            var localVarPath = "/Packages/Installing/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostPackagesInstallingByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostPackagesInstallingByIdDeleteAsync (string id)
        {
             await PostPackagesInstallingByIdDeleteAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Cancels a package installation Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Installation Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostPackagesInstallingByIdDeleteAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling PackageServiceApi->PostPackagesInstallingByIdDelete");

            var localVarPath = "/Packages/Installing/{Id}/Delete";
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
                Exception exception = ExceptionFactory("PostPackagesInstallingByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
