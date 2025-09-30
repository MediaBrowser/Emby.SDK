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
        public interface ICodecParameterServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>EditObjectContainer</returns>
        EditObjectContainer GetEncodingCodecparameters (string codecId, MediaEncodingCodecParameterContext parameterContext);

        /// <summary>
        /// Gets the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>ApiResponse of EditObjectContainer</returns>
        ApiResponse<EditObjectContainer> GetEncodingCodecparametersWithHttpInfo (string codecId, MediaEncodingCodecParameterContext parameterContext);
        /// <summary>
        /// Updates the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns></returns>
        void PostEncodingCodecparameters (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext);

        /// <summary>
        /// Updates the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostEncodingCodecparametersWithHttpInfo (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of EditObjectContainer</returns>
        System.Threading.Tasks.Task<EditObjectContainer> GetEncodingCodecparametersAsync (string codecId, MediaEncodingCodecParameterContext parameterContext);

        /// <summary>
        /// Gets the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of ApiResponse (EditObjectContainer)</returns>
        System.Threading.Tasks.Task<ApiResponse<EditObjectContainer>> GetEncodingCodecparametersAsyncWithHttpInfo (string codecId, MediaEncodingCodecParameterContext parameterContext);
        /// <summary>
        /// Updates the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostEncodingCodecparametersAsync (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext);

        /// <summary>
        /// Updates the parameters for a specified codec.
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingCodecparametersAsyncWithHttpInfo (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class CodecParameterServiceApi : ICodecParameterServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="CodecParameterServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CodecParameterServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CodecParameterServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public CodecParameterServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CodecParameterServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CodecParameterServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets the parameters for a specified codec. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>EditObjectContainer</returns>
        public EditObjectContainer GetEncodingCodecparameters (string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
             ApiResponse<EditObjectContainer> localVarResponse = GetEncodingCodecparametersWithHttpInfo(codecId, parameterContext);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the parameters for a specified codec. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>ApiResponse of EditObjectContainer</returns>
        public ApiResponse< EditObjectContainer > GetEncodingCodecparametersWithHttpInfo (string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
            // verify the required parameter 'codecId' is set
            if (codecId == null)
                throw new ApiException(400, "Missing required parameter 'codecId' when calling CodecParameterServiceApi->GetEncodingCodecparameters");
            // verify the required parameter 'parameterContext' is set
            if (parameterContext == null)
                throw new ApiException(400, "Missing required parameter 'parameterContext' when calling CodecParameterServiceApi->GetEncodingCodecparameters");

            var localVarPath = "/Encoding/CodecParameters";
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

            if (codecId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CodecId", codecId)); // query parameter
            if (parameterContext != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParameterContext", parameterContext)); // query parameter
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
                Exception exception = ExceptionFactory("GetEncodingCodecparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EditObjectContainer>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EditObjectContainer) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EditObjectContainer)));
        }

        /// <summary>
        /// Gets the parameters for a specified codec. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of EditObjectContainer</returns>
        public async System.Threading.Tasks.Task<EditObjectContainer> GetEncodingCodecparametersAsync (string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
             ApiResponse<EditObjectContainer> localVarResponse = await GetEncodingCodecparametersAsyncWithHttpInfo(codecId, parameterContext);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the parameters for a specified codec. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of ApiResponse (EditObjectContainer)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<EditObjectContainer>> GetEncodingCodecparametersAsyncWithHttpInfo (string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
            // verify the required parameter 'codecId' is set
            if (codecId == null)
                throw new ApiException(400, "Missing required parameter 'codecId' when calling CodecParameterServiceApi->GetEncodingCodecparameters");
            // verify the required parameter 'parameterContext' is set
            if (parameterContext == null)
                throw new ApiException(400, "Missing required parameter 'parameterContext' when calling CodecParameterServiceApi->GetEncodingCodecparameters");

            var localVarPath = "/Encoding/CodecParameters";
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

            if (codecId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CodecId", codecId)); // query parameter
            if (parameterContext != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParameterContext", parameterContext)); // query parameter
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
                Exception exception = ExceptionFactory("GetEncodingCodecparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<EditObjectContainer>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (EditObjectContainer) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(EditObjectContainer)));
        }

        /// <summary>
        /// Updates the parameters for a specified codec. Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns></returns>
        public void PostEncodingCodecparameters (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
             PostEncodingCodecparametersWithHttpInfo(body, codecId, parameterContext);
        }

        /// <summary>
        /// Updates the parameters for a specified codec. Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostEncodingCodecparametersWithHttpInfo (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling CodecParameterServiceApi->PostEncodingCodecparameters");
            // verify the required parameter 'codecId' is set
            if (codecId == null)
                throw new ApiException(400, "Missing required parameter 'codecId' when calling CodecParameterServiceApi->PostEncodingCodecparameters");
            // verify the required parameter 'parameterContext' is set
            if (parameterContext == null)
                throw new ApiException(400, "Missing required parameter 'parameterContext' when calling CodecParameterServiceApi->PostEncodingCodecparameters");

            var localVarPath = "/Encoding/CodecParameters";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (codecId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CodecId", codecId)); // query parameter
            if (parameterContext != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParameterContext", parameterContext)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingCodecparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates the parameters for a specified codec. Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostEncodingCodecparametersAsync (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
             await PostEncodingCodecparametersAsyncWithHttpInfo(body, codecId, parameterContext);

        }

        /// <summary>
        /// Updates the parameters for a specified codec. Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">Binary stream</param>
        /// <param name="codecId">Codec Id</param>
        /// <param name="parameterContext">Parameter Context</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostEncodingCodecparametersAsyncWithHttpInfo (Object body, string codecId, MediaEncodingCodecParameterContext parameterContext)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling CodecParameterServiceApi->PostEncodingCodecparameters");
            // verify the required parameter 'codecId' is set
            if (codecId == null)
                throw new ApiException(400, "Missing required parameter 'codecId' when calling CodecParameterServiceApi->PostEncodingCodecparameters");
            // verify the required parameter 'parameterContext' is set
            if (parameterContext == null)
                throw new ApiException(400, "Missing required parameter 'parameterContext' when calling CodecParameterServiceApi->PostEncodingCodecparameters");

            var localVarPath = "/Encoding/CodecParameters";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/octet-stream"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (codecId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CodecId", codecId)); // query parameter
            if (parameterContext != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ParameterContext", parameterContext)); // query parameter
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
                Exception exception = ExceptionFactory("PostEncodingCodecparameters", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
