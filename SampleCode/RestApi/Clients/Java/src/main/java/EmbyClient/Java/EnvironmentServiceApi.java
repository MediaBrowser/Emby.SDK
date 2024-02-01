/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import EmbyClient.ApiCallback;
import EmbyClient.ApiClient;
import EmbyClient.ApiException;
import EmbyClient.ApiResponse;
import EmbyClient.Configuration;
import EmbyClient.Pair;
import EmbyClient.ProgressRequestBody;
import EmbyClient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DefaultDirectoryBrowserInfo;
import io.swagger.client.model.GetDirectoryContents;
import io.swagger.client.model.IOFileSystemEntryInfo;
import io.swagger.client.model.ValidatePath;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentServiceApi {
    private ApiClient apiClient;

    public EnvironmentServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnvironmentServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEnvironmentDefaultdirectorybrowser
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDefaultdirectorybrowserCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/DefaultDirectoryBrowser";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentDefaultdirectorybrowserValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEnvironmentDefaultdirectorybrowserCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return DefaultDirectoryBrowserInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DefaultDirectoryBrowserInfo getEnvironmentDefaultdirectorybrowser() throws ApiException {
        ApiResponse<DefaultDirectoryBrowserInfo> resp = getEnvironmentDefaultdirectorybrowserWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return ApiResponse&lt;DefaultDirectoryBrowserInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DefaultDirectoryBrowserInfo> getEnvironmentDefaultdirectorybrowserWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentDefaultdirectorybrowserValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DefaultDirectoryBrowserInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the parent path of a given path (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDefaultdirectorybrowserAsync(final ApiCallback<DefaultDirectoryBrowserInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentDefaultdirectorybrowserValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DefaultDirectoryBrowserInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnvironmentDirectorycontents
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDirectorycontentsCall(String path, Boolean includeFiles, Boolean includeDirectories, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/DirectoryContents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (includeFiles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeFiles", includeFiles));
        if (includeDirectories != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeDirectories", includeDirectories));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentDirectorycontentsValidateBeforeCall(String path, Boolean includeFiles, Boolean includeDirectories, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getEnvironmentDirectorycontents(Async)");
        }
        
        com.squareup.okhttp.Call call = getEnvironmentDirectorycontentsCall(path, includeFiles, includeDirectories, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @return List&lt;IOFileSystemEntryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IOFileSystemEntryInfo> getEnvironmentDirectorycontents(String path, Boolean includeFiles, Boolean includeDirectories) throws ApiException {
        ApiResponse<List<IOFileSystemEntryInfo>> resp = getEnvironmentDirectorycontentsWithHttpInfo(path, includeFiles, includeDirectories);
        return resp.getData();
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @return ApiResponse&lt;List&lt;IOFileSystemEntryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IOFileSystemEntryInfo>> getEnvironmentDirectorycontentsWithHttpInfo(String path, Boolean includeFiles, Boolean includeDirectories) throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentDirectorycontentsValidateBeforeCall(path, includeFiles, includeDirectories, null, null);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the contents of a given directory in the file system (asynchronously)
     * Requires authentication as administrator
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDirectorycontentsAsync(String path, Boolean includeFiles, Boolean includeDirectories, final ApiCallback<List<IOFileSystemEntryInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentDirectorycontentsValidateBeforeCall(path, includeFiles, includeDirectories, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnvironmentDrives
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDrivesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/Drives";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentDrivesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEnvironmentDrivesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available drives from the server&#x27;s file system
     * Requires authentication as administrator
     * @return List&lt;IOFileSystemEntryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IOFileSystemEntryInfo> getEnvironmentDrives() throws ApiException {
        ApiResponse<List<IOFileSystemEntryInfo>> resp = getEnvironmentDrivesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets available drives from the server&#x27;s file system
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;IOFileSystemEntryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IOFileSystemEntryInfo>> getEnvironmentDrivesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentDrivesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available drives from the server&#x27;s file system (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentDrivesAsync(final ApiCallback<List<IOFileSystemEntryInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentDrivesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnvironmentNetworkdevices
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentNetworkdevicesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/NetworkDevices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentNetworkdevicesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEnvironmentNetworkdevicesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of devices on the network
     * Requires authentication as administrator
     * @return List&lt;IOFileSystemEntryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IOFileSystemEntryInfo> getEnvironmentNetworkdevices() throws ApiException {
        ApiResponse<List<IOFileSystemEntryInfo>> resp = getEnvironmentNetworkdevicesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of devices on the network
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;IOFileSystemEntryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IOFileSystemEntryInfo>> getEnvironmentNetworkdevicesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentNetworkdevicesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of devices on the network (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentNetworkdevicesAsync(final ApiCallback<List<IOFileSystemEntryInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentNetworkdevicesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnvironmentNetworkshares
     * @param path  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentNetworksharesCall(String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/NetworkShares";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentNetworksharesValidateBeforeCall(String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getEnvironmentNetworkshares(Async)");
        }
        
        com.squareup.okhttp.Call call = getEnvironmentNetworksharesCall(path, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets shares from a network device
     * Requires authentication as administrator
     * @param path  (required)
     * @return List&lt;IOFileSystemEntryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IOFileSystemEntryInfo> getEnvironmentNetworkshares(String path) throws ApiException {
        ApiResponse<List<IOFileSystemEntryInfo>> resp = getEnvironmentNetworksharesWithHttpInfo(path);
        return resp.getData();
    }

    /**
     * Gets shares from a network device
     * Requires authentication as administrator
     * @param path  (required)
     * @return ApiResponse&lt;List&lt;IOFileSystemEntryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IOFileSystemEntryInfo>> getEnvironmentNetworksharesWithHttpInfo(String path) throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentNetworksharesValidateBeforeCall(path, null, null);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets shares from a network device (asynchronously)
     * Requires authentication as administrator
     * @param path  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentNetworksharesAsync(String path, final ApiCallback<List<IOFileSystemEntryInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentNetworksharesValidateBeforeCall(path, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnvironmentParentpath
     * @param path  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentParentpathCall(String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Environment/ParentPath";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentParentpathValidateBeforeCall(String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getEnvironmentParentpath(Async)");
        }
        
        com.squareup.okhttp.Call call = getEnvironmentParentpathCall(path, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @param path  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getEnvironmentParentpath(String path) throws ApiException {
        ApiResponse<String> resp = getEnvironmentParentpathWithHttpInfo(path);
        return resp.getData();
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @param path  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getEnvironmentParentpathWithHttpInfo(String path) throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentParentpathValidateBeforeCall(path, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the parent path of a given path (asynchronously)
     * Requires authentication as administrator
     * @param path  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentParentpathAsync(String path, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEnvironmentParentpathValidateBeforeCall(path, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEnvironmentDirectorycontents
     * @param body GetDirectoryContents (required)
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentDirectorycontentsCall(GetDirectoryContents body, String path, Boolean includeFiles, Boolean includeDirectories, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Environment/DirectoryContents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (includeFiles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeFiles", includeFiles));
        if (includeDirectories != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeDirectories", includeDirectories));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postEnvironmentDirectorycontentsValidateBeforeCall(GetDirectoryContents body, String path, Boolean includeFiles, Boolean includeDirectories, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEnvironmentDirectorycontents(Async)");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postEnvironmentDirectorycontents(Async)");
        }
        
        com.squareup.okhttp.Call call = postEnvironmentDirectorycontentsCall(body, path, includeFiles, includeDirectories, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param body GetDirectoryContents (required)
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @return List&lt;IOFileSystemEntryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IOFileSystemEntryInfo> postEnvironmentDirectorycontents(GetDirectoryContents body, String path, Boolean includeFiles, Boolean includeDirectories) throws ApiException {
        ApiResponse<List<IOFileSystemEntryInfo>> resp = postEnvironmentDirectorycontentsWithHttpInfo(body, path, includeFiles, includeDirectories);
        return resp.getData();
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param body GetDirectoryContents (required)
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @return ApiResponse&lt;List&lt;IOFileSystemEntryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IOFileSystemEntryInfo>> postEnvironmentDirectorycontentsWithHttpInfo(GetDirectoryContents body, String path, Boolean includeFiles, Boolean includeDirectories) throws ApiException {
        com.squareup.okhttp.Call call = postEnvironmentDirectorycontentsValidateBeforeCall(body, path, includeFiles, includeDirectories, null, null);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the contents of a given directory in the file system (asynchronously)
     * Requires authentication as administrator
     * @param body GetDirectoryContents (required)
     * @param path  (required)
     * @param includeFiles An optional filter to include or exclude files from the results. true/false (optional)
     * @param includeDirectories An optional filter to include or exclude folders from the results. true/false (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentDirectorycontentsAsync(GetDirectoryContents body, String path, Boolean includeFiles, Boolean includeDirectories, final ApiCallback<List<IOFileSystemEntryInfo>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postEnvironmentDirectorycontentsValidateBeforeCall(body, path, includeFiles, includeDirectories, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IOFileSystemEntryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEnvironmentValidatepath
     * @param body ValidatePath (required)
     * @param path  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentValidatepathCall(ValidatePath body, String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Environment/ValidatePath";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postEnvironmentValidatepathValidateBeforeCall(ValidatePath body, String path, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEnvironmentValidatepath(Async)");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postEnvironmentValidatepath(Async)");
        }
        
        com.squareup.okhttp.Call call = postEnvironmentValidatepathCall(body, path, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param body ValidatePath (required)
     * @param path  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEnvironmentValidatepath(ValidatePath body, String path) throws ApiException {
        postEnvironmentValidatepathWithHttpInfo(body, path);
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param body ValidatePath (required)
     * @param path  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEnvironmentValidatepathWithHttpInfo(ValidatePath body, String path) throws ApiException {
        com.squareup.okhttp.Call call = postEnvironmentValidatepathValidateBeforeCall(body, path, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets the contents of a given directory in the file system (asynchronously)
     * Requires authentication as administrator
     * @param body ValidatePath (required)
     * @param path  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentValidatepathAsync(ValidatePath body, String path, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postEnvironmentValidatepathValidateBeforeCall(body, path, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
