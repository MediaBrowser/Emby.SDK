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


import io.swagger.client.model.PackageInfo;
import io.swagger.client.model.PackageVersionClass;
import io.swagger.client.model.PackageVersionInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PackageServiceApi {
    private ApiClient apiClient;

    public PackageServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PackageServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletePackagesInstallingById
     * @param id Installation Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePackagesInstallingByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages/Installing/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePackagesInstallingByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePackagesInstallingById(Async)");
        }
        
        com.squareup.okhttp.Call call = deletePackagesInstallingByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePackagesInstallingById(String id) throws ApiException {
        deletePackagesInstallingByIdWithHttpInfo(id);
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePackagesInstallingByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deletePackagesInstallingByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a package installation (asynchronously)
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePackagesInstallingByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePackagesInstallingByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPackages
     * @param packageType Optional package type filter (System/UserInstalled) (optional)
     * @param targetSystems Optional. Filter by target system type. Allows multiple, comma delimited. (optional)
     * @param isPremium Optional. Filter by premium status (optional)
     * @param isAdult Optional. Filter by package that contain adult content. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPackagesCall(String packageType, String targetSystems, Boolean isPremium, Boolean isAdult, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (packageType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PackageType", packageType));
        if (targetSystems != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("TargetSystems", targetSystems));
        if (isPremium != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremium", isPremium));
        if (isAdult != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsAdult", isAdult));

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
    private com.squareup.okhttp.Call getPackagesValidateBeforeCall(String packageType, String targetSystems, Boolean isPremium, Boolean isAdult, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getPackagesCall(packageType, targetSystems, isPremium, isAdult, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available packages
     * Requires authentication as user
     * @param packageType Optional package type filter (System/UserInstalled) (optional)
     * @param targetSystems Optional. Filter by target system type. Allows multiple, comma delimited. (optional)
     * @param isPremium Optional. Filter by premium status (optional)
     * @param isAdult Optional. Filter by package that contain adult content. (optional)
     * @return List&lt;PackageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PackageInfo> getPackages(String packageType, String targetSystems, Boolean isPremium, Boolean isAdult) throws ApiException {
        ApiResponse<List<PackageInfo>> resp = getPackagesWithHttpInfo(packageType, targetSystems, isPremium, isAdult);
        return resp.getData();
    }

    /**
     * Gets available packages
     * Requires authentication as user
     * @param packageType Optional package type filter (System/UserInstalled) (optional)
     * @param targetSystems Optional. Filter by target system type. Allows multiple, comma delimited. (optional)
     * @param isPremium Optional. Filter by premium status (optional)
     * @param isAdult Optional. Filter by package that contain adult content. (optional)
     * @return ApiResponse&lt;List&lt;PackageInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PackageInfo>> getPackagesWithHttpInfo(String packageType, String targetSystems, Boolean isPremium, Boolean isAdult) throws ApiException {
        com.squareup.okhttp.Call call = getPackagesValidateBeforeCall(packageType, targetSystems, isPremium, isAdult, null, null);
        Type localVarReturnType = new TypeToken<List<PackageInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available packages (asynchronously)
     * Requires authentication as user
     * @param packageType Optional package type filter (System/UserInstalled) (optional)
     * @param targetSystems Optional. Filter by target system type. Allows multiple, comma delimited. (optional)
     * @param isPremium Optional. Filter by premium status (optional)
     * @param isAdult Optional. Filter by package that contain adult content. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPackagesAsync(String packageType, String targetSystems, Boolean isPremium, Boolean isAdult, final ApiCallback<List<PackageInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPackagesValidateBeforeCall(packageType, targetSystems, isPremium, isAdult, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PackageInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPackagesByName
     * @param name The name of the package (required)
     * @param assemblyGuid The guid of the associated assembly (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPackagesByNameCall(String name, String assemblyGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages/{Name}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (assemblyGuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AssemblyGuid", assemblyGuid));

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
    private com.squareup.okhttp.Call getPackagesByNameValidateBeforeCall(String name, String assemblyGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPackagesByName(Async)");
        }
        
        com.squareup.okhttp.Call call = getPackagesByNameCall(name, assemblyGuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a package, by name or assembly guid
     * Requires authentication as user
     * @param name The name of the package (required)
     * @param assemblyGuid The guid of the associated assembly (optional)
     * @return PackageInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PackageInfo getPackagesByName(String name, String assemblyGuid) throws ApiException {
        ApiResponse<PackageInfo> resp = getPackagesByNameWithHttpInfo(name, assemblyGuid);
        return resp.getData();
    }

    /**
     * Gets a package, by name or assembly guid
     * Requires authentication as user
     * @param name The name of the package (required)
     * @param assemblyGuid The guid of the associated assembly (optional)
     * @return ApiResponse&lt;PackageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PackageInfo> getPackagesByNameWithHttpInfo(String name, String assemblyGuid) throws ApiException {
        com.squareup.okhttp.Call call = getPackagesByNameValidateBeforeCall(name, assemblyGuid, null, null);
        Type localVarReturnType = new TypeToken<PackageInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a package, by name or assembly guid (asynchronously)
     * Requires authentication as user
     * @param name The name of the package (required)
     * @param assemblyGuid The guid of the associated assembly (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPackagesByNameAsync(String name, String assemblyGuid, final ApiCallback<PackageInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPackagesByNameValidateBeforeCall(name, assemblyGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PackageInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPackagesUpdates
     * @param packageType Package type filter (System/UserInstalled) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPackagesUpdatesCall(String packageType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages/Updates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (packageType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PackageType", packageType));

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
    private com.squareup.okhttp.Call getPackagesUpdatesValidateBeforeCall(String packageType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'packageType' is set
        if (packageType == null) {
            throw new ApiException("Missing the required parameter 'packageType' when calling getPackagesUpdates(Async)");
        }
        
        com.squareup.okhttp.Call call = getPackagesUpdatesCall(packageType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available package updates for currently installed packages
     * Requires authentication as administrator
     * @param packageType Package type filter (System/UserInstalled) (required)
     * @return List&lt;PackageVersionInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PackageVersionInfo> getPackagesUpdates(String packageType) throws ApiException {
        ApiResponse<List<PackageVersionInfo>> resp = getPackagesUpdatesWithHttpInfo(packageType);
        return resp.getData();
    }

    /**
     * Gets available package updates for currently installed packages
     * Requires authentication as administrator
     * @param packageType Package type filter (System/UserInstalled) (required)
     * @return ApiResponse&lt;List&lt;PackageVersionInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PackageVersionInfo>> getPackagesUpdatesWithHttpInfo(String packageType) throws ApiException {
        com.squareup.okhttp.Call call = getPackagesUpdatesValidateBeforeCall(packageType, null, null);
        Type localVarReturnType = new TypeToken<List<PackageVersionInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available package updates for currently installed packages (asynchronously)
     * Requires authentication as administrator
     * @param packageType Package type filter (System/UserInstalled) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPackagesUpdatesAsync(String packageType, final ApiCallback<List<PackageVersionInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPackagesUpdatesValidateBeforeCall(packageType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PackageVersionInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPackagesInstalledByName
     * @param name Package name (required)
     * @param assemblyGuid Guid of the associated assembly (optional)
     * @param version Optional version. Defaults to latest version. (optional)
     * @param updateClass Optional update class (Dev, Beta, Release). Defaults to Release. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPackagesInstalledByNameCall(String name, String assemblyGuid, String version, PackageVersionClass updateClass, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages/Installed/{Name}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (assemblyGuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AssemblyGuid", assemblyGuid));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Version", version));
        if (updateClass != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UpdateClass", updateClass));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPackagesInstalledByNameValidateBeforeCall(String name, String assemblyGuid, String version, PackageVersionClass updateClass, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPackagesInstalledByName(Async)");
        }
        
        com.squareup.okhttp.Call call = postPackagesInstalledByNameCall(name, assemblyGuid, version, updateClass, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Installs a package
     * Requires authentication as administrator
     * @param name Package name (required)
     * @param assemblyGuid Guid of the associated assembly (optional)
     * @param version Optional version. Defaults to latest version. (optional)
     * @param updateClass Optional update class (Dev, Beta, Release). Defaults to Release. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postPackagesInstalledByName(String name, String assemblyGuid, String version, PackageVersionClass updateClass) throws ApiException {
        postPackagesInstalledByNameWithHttpInfo(name, assemblyGuid, version, updateClass);
    }

    /**
     * Installs a package
     * Requires authentication as administrator
     * @param name Package name (required)
     * @param assemblyGuid Guid of the associated assembly (optional)
     * @param version Optional version. Defaults to latest version. (optional)
     * @param updateClass Optional update class (Dev, Beta, Release). Defaults to Release. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postPackagesInstalledByNameWithHttpInfo(String name, String assemblyGuid, String version, PackageVersionClass updateClass) throws ApiException {
        com.squareup.okhttp.Call call = postPackagesInstalledByNameValidateBeforeCall(name, assemblyGuid, version, updateClass, null, null);
        return apiClient.execute(call);
    }

    /**
     * Installs a package (asynchronously)
     * Requires authentication as administrator
     * @param name Package name (required)
     * @param assemblyGuid Guid of the associated assembly (optional)
     * @param version Optional version. Defaults to latest version. (optional)
     * @param updateClass Optional update class (Dev, Beta, Release). Defaults to Release. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPackagesInstalledByNameAsync(String name, String assemblyGuid, String version, PackageVersionClass updateClass, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPackagesInstalledByNameValidateBeforeCall(name, assemblyGuid, version, updateClass, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postPackagesInstallingByIdDelete
     * @param id Installation Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPackagesInstallingByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Packages/Installing/{Id}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPackagesInstallingByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postPackagesInstallingByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postPackagesInstallingByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postPackagesInstallingByIdDelete(String id) throws ApiException {
        postPackagesInstallingByIdDeleteWithHttpInfo(id);
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postPackagesInstallingByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postPackagesInstallingByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a package installation (asynchronously)
     * Requires authentication as administrator
     * @param id Installation Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPackagesInstallingByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPackagesInstallingByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
