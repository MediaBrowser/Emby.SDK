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


import io.swagger.client.model.ImageProviderInfo;
import io.swagger.client.model.ImageType;
import io.swagger.client.model.RemoteImageResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteImageServiceApi {
    private ApiClient apiClient;

    public RemoteImageServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RemoteImageServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getImagesRemote
     * @param imageUrl The image url (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImagesRemoteCall(String imageUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Images/Remote";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (imageUrl != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageUrl", imageUrl));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImagesRemoteValidateBeforeCall(String imageUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new ApiException("Missing the required parameter 'imageUrl' when calling getImagesRemote(Async)");
        }
        
        com.squareup.okhttp.Call call = getImagesRemoteCall(imageUrl, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @param imageUrl The image url (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getImagesRemote(String imageUrl) throws ApiException {
        getImagesRemoteWithHttpInfo(imageUrl);
    }

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @param imageUrl The image url (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getImagesRemoteWithHttpInfo(String imageUrl) throws ApiException {
        com.squareup.okhttp.Call call = getImagesRemoteValidateBeforeCall(imageUrl, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a remote image (asynchronously)
     * Requires authentication as administrator
     * @param imageUrl The image url (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImagesRemoteAsync(String imageUrl, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getImagesRemoteValidateBeforeCall(imageUrl, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdRemoteimages
     * @param id Item Id (required)
     * @param type The image type (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param providerName Optional. The image provider to use (optional)
     * @param includeAllLanguages Optional. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemoteimagesCall(String id, ImageType type, Integer startIndex, Integer limit, String providerName, Boolean includeAllLanguages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/RemoteImages"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (providerName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderName", providerName));
        if (includeAllLanguages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeAllLanguages", includeAllLanguages));

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
    private com.squareup.okhttp.Call getItemsByIdRemoteimagesValidateBeforeCall(String id, ImageType type, Integer startIndex, Integer limit, String providerName, Boolean includeAllLanguages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdRemoteimages(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesCall(id, type, startIndex, limit, providerName, includeAllLanguages, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available remote images for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type The image type (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param providerName Optional. The image provider to use (optional)
     * @param includeAllLanguages Optional. (optional)
     * @return RemoteImageResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RemoteImageResult getItemsByIdRemoteimages(String id, ImageType type, Integer startIndex, Integer limit, String providerName, Boolean includeAllLanguages) throws ApiException {
        ApiResponse<RemoteImageResult> resp = getItemsByIdRemoteimagesWithHttpInfo(id, type, startIndex, limit, providerName, includeAllLanguages);
        return resp.getData();
    }

    /**
     * Gets available remote images for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type The image type (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param providerName Optional. The image provider to use (optional)
     * @param includeAllLanguages Optional. (optional)
     * @return ApiResponse&lt;RemoteImageResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RemoteImageResult> getItemsByIdRemoteimagesWithHttpInfo(String id, ImageType type, Integer startIndex, Integer limit, String providerName, Boolean includeAllLanguages) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesValidateBeforeCall(id, type, startIndex, limit, providerName, includeAllLanguages, null, null);
        Type localVarReturnType = new TypeToken<RemoteImageResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available remote images for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type The image type (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param providerName Optional. The image provider to use (optional)
     * @param includeAllLanguages Optional. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemoteimagesAsync(String id, ImageType type, Integer startIndex, Integer limit, String providerName, Boolean includeAllLanguages, final ApiCallback<RemoteImageResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesValidateBeforeCall(id, type, startIndex, limit, providerName, includeAllLanguages, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RemoteImageResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdRemoteimagesProviders
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemoteimagesProvidersCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/RemoteImages/Providers"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getItemsByIdRemoteimagesProvidersValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdRemoteimagesProviders(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesProvidersCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available remote image providers for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return List&lt;ImageProviderInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ImageProviderInfo> getItemsByIdRemoteimagesProviders(String id) throws ApiException {
        ApiResponse<List<ImageProviderInfo>> resp = getItemsByIdRemoteimagesProvidersWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets available remote image providers for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;List&lt;ImageProviderInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ImageProviderInfo>> getItemsByIdRemoteimagesProvidersWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesProvidersValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<List<ImageProviderInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available remote image providers for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemoteimagesProvidersAsync(String id, final ApiCallback<List<ImageProviderInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdRemoteimagesProvidersValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ImageProviderInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdRemoteimagesDownload
     * @param id Item Id (required)
     * @param type The image type (required)
     * @param providerName The image provider (optional)
     * @param imageUrl The image url (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRemoteimagesDownloadCall(String id, ImageType type, String providerName, String imageUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/RemoteImages/Download"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (providerName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderName", providerName));
        if (imageUrl != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageUrl", imageUrl));

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
    private com.squareup.okhttp.Call postItemsByIdRemoteimagesDownloadValidateBeforeCall(String id, ImageType type, String providerName, String imageUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdRemoteimagesDownload(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdRemoteimagesDownload(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdRemoteimagesDownloadCall(id, type, providerName, imageUrl, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Downloads a remote image for an item
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type The image type (required)
     * @param providerName The image provider (optional)
     * @param imageUrl The image url (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdRemoteimagesDownload(String id, ImageType type, String providerName, String imageUrl) throws ApiException {
        postItemsByIdRemoteimagesDownloadWithHttpInfo(id, type, providerName, imageUrl);
    }

    /**
     * Downloads a remote image for an item
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type The image type (required)
     * @param providerName The image provider (optional)
     * @param imageUrl The image url (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdRemoteimagesDownloadWithHttpInfo(String id, ImageType type, String providerName, String imageUrl) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdRemoteimagesDownloadValidateBeforeCall(id, type, providerName, imageUrl, null, null);
        return apiClient.execute(call);
    }

    /**
     * Downloads a remote image for an item (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type The image type (required)
     * @param providerName The image provider (optional)
     * @param imageUrl The image url (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRemoteimagesDownloadAsync(String id, ImageType type, String providerName, String imageUrl, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdRemoteimagesDownloadValidateBeforeCall(id, type, providerName, imageUrl, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
