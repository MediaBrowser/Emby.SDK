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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoHlsServiceApi {
    private ApiClient apiClient;

    public VideoHlsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoHlsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
