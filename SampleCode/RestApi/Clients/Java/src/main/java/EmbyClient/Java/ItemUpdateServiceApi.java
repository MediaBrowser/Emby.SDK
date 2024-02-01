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


import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.MetadataEditorInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemUpdateServiceApi {
    private ApiClient apiClient;

    public ItemUpdateServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ItemUpdateServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getItemsByItemidMetadataeditor
     * @param itemId The id of the item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByItemidMetadataeditorCall(String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{ItemId}/MetadataEditor"
            .replaceAll("\\{" + "ItemId" + "\\}", apiClient.escapeString(itemId.toString()));

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
    private com.squareup.okhttp.Call getItemsByItemidMetadataeditorValidateBeforeCall(String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling getItemsByItemidMetadataeditor(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByItemidMetadataeditorCall(itemId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets metadata editor info for an item
     * Requires authentication as administrator
     * @param itemId The id of the item (required)
     * @return MetadataEditorInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataEditorInfo getItemsByItemidMetadataeditor(String itemId) throws ApiException {
        ApiResponse<MetadataEditorInfo> resp = getItemsByItemidMetadataeditorWithHttpInfo(itemId);
        return resp.getData();
    }

    /**
     * Gets metadata editor info for an item
     * Requires authentication as administrator
     * @param itemId The id of the item (required)
     * @return ApiResponse&lt;MetadataEditorInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataEditorInfo> getItemsByItemidMetadataeditorWithHttpInfo(String itemId) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByItemidMetadataeditorValidateBeforeCall(itemId, null, null);
        Type localVarReturnType = new TypeToken<MetadataEditorInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets metadata editor info for an item (asynchronously)
     * Requires authentication as administrator
     * @param itemId The id of the item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByItemidMetadataeditorAsync(String itemId, final ApiCallback<MetadataEditorInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByItemidMetadataeditorValidateBeforeCall(itemId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataEditorInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsByItemid
     * @param body BaseItemDto:  (required)
     * @param itemId The id of the item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByItemidCall(BaseItemDto body, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/{ItemId}"
            .replaceAll("\\{" + "ItemId" + "\\}", apiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call postItemsByItemidValidateBeforeCall(BaseItemDto body, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsByItemid(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling postItemsByItemid(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByItemidCall(body, itemId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates an item
     * Requires authentication as administrator
     * @param body BaseItemDto:  (required)
     * @param itemId The id of the item (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByItemid(BaseItemDto body, String itemId) throws ApiException {
        postItemsByItemidWithHttpInfo(body, itemId);
    }

    /**
     * Updates an item
     * Requires authentication as administrator
     * @param body BaseItemDto:  (required)
     * @param itemId The id of the item (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByItemidWithHttpInfo(BaseItemDto body, String itemId) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByItemidValidateBeforeCall(body, itemId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates an item (asynchronously)
     * Requires authentication as administrator
     * @param body BaseItemDto:  (required)
     * @param itemId The id of the item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByItemidAsync(BaseItemDto body, String itemId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByItemidValidateBeforeCall(body, itemId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
