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


import io.swagger.client.model.MetadataRefreshMode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRefreshServiceApi {
    private ApiClient apiClient;

    public ItemRefreshServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ItemRefreshServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postItemsByIdRefresh
     * @param id Item Id (required)
     * @param recursive Indicates if the refresh should occur recursively. (optional)
     * @param metadataRefreshMode Specifies the metadata refresh mode (optional)
     * @param imageRefreshMode Specifies the image refresh mode (optional)
     * @param replaceAllMetadata Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param replaceAllImages Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRefreshCall(String id, Boolean recursive, MetadataRefreshMode metadataRefreshMode, MetadataRefreshMode imageRefreshMode, Boolean replaceAllMetadata, Boolean replaceAllImages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Refresh"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (metadataRefreshMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MetadataRefreshMode", metadataRefreshMode));
        if (imageRefreshMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageRefreshMode", imageRefreshMode));
        if (replaceAllMetadata != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ReplaceAllMetadata", replaceAllMetadata));
        if (replaceAllImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ReplaceAllImages", replaceAllImages));

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
    private com.squareup.okhttp.Call postItemsByIdRefreshValidateBeforeCall(String id, Boolean recursive, MetadataRefreshMode metadataRefreshMode, MetadataRefreshMode imageRefreshMode, Boolean replaceAllMetadata, Boolean replaceAllImages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdRefresh(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdRefreshCall(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Refreshes metadata for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param recursive Indicates if the refresh should occur recursively. (optional)
     * @param metadataRefreshMode Specifies the metadata refresh mode (optional)
     * @param imageRefreshMode Specifies the image refresh mode (optional)
     * @param replaceAllMetadata Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param replaceAllImages Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdRefresh(String id, Boolean recursive, MetadataRefreshMode metadataRefreshMode, MetadataRefreshMode imageRefreshMode, Boolean replaceAllMetadata, Boolean replaceAllImages) throws ApiException {
        postItemsByIdRefreshWithHttpInfo(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages);
    }

    /**
     * Refreshes metadata for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param recursive Indicates if the refresh should occur recursively. (optional)
     * @param metadataRefreshMode Specifies the metadata refresh mode (optional)
     * @param imageRefreshMode Specifies the image refresh mode (optional)
     * @param replaceAllMetadata Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param replaceAllImages Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdRefreshWithHttpInfo(String id, Boolean recursive, MetadataRefreshMode metadataRefreshMode, MetadataRefreshMode imageRefreshMode, Boolean replaceAllMetadata, Boolean replaceAllImages) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdRefreshValidateBeforeCall(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages, null, null);
        return apiClient.execute(call);
    }

    /**
     * Refreshes metadata for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param recursive Indicates if the refresh should occur recursively. (optional)
     * @param metadataRefreshMode Specifies the metadata refresh mode (optional)
     * @param imageRefreshMode Specifies the image refresh mode (optional)
     * @param replaceAllMetadata Determines if metadata should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param replaceAllImages Determines if images should be replaced. Only applicable if mode is FullRefresh (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRefreshAsync(String id, Boolean recursive, MetadataRefreshMode metadataRefreshMode, MetadataRefreshMode imageRefreshMode, Boolean replaceAllMetadata, Boolean replaceAllImages, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdRefreshValidateBeforeCall(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
