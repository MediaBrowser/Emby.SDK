/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import EmbyClient.Java.ApiCallback;
import EmbyClient.Java.ApiClient;
import EmbyClient.Java.ApiException;
import EmbyClient.Java.ApiResponse;
import EmbyClient.Java.Configuration;
import EmbyClient.Java.Pair;
import EmbyClient.Java.ProgressRequestBody;
import EmbyClient.Java.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.MediaInfoLiveStreamRequest;
import io.swagger.client.model.MediaInfoLiveStreamResponse;
import io.swagger.client.model.MediaInfoPlaybackInfoRequest;
import io.swagger.client.model.MediaInfoPlaybackInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaInfoServiceApi {
    private ApiClient apiClient;

    public MediaInfoServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MediaInfoServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getItemsByIdPlaybackinfo
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdPlaybackinfoCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/PlaybackInfo"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

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
    private com.squareup.okhttp.Call getItemsByIdPlaybackinfoValidateBeforeCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdPlaybackinfo(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getItemsByIdPlaybackinfo(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdPlaybackinfoCall(id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @return MediaInfoPlaybackInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaInfoPlaybackInfoResponse getItemsByIdPlaybackinfo(String id, String userId) throws ApiException {
        ApiResponse<MediaInfoPlaybackInfoResponse> resp = getItemsByIdPlaybackinfoWithHttpInfo(id, userId);
        return resp.getData();
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @return ApiResponse&lt;MediaInfoPlaybackInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaInfoPlaybackInfoResponse> getItemsByIdPlaybackinfoWithHttpInfo(String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdPlaybackinfoValidateBeforeCall(id, userId, null, null);
        Type localVarReturnType = new TypeToken<MediaInfoPlaybackInfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live playback media info for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdPlaybackinfoAsync(String id, String userId, final ApiCallback<MediaInfoPlaybackInfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdPlaybackinfoValidateBeforeCall(id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaInfoPlaybackInfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlaybackBitratetest
     * @param size Size (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlaybackBitratetestCall(Long size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playback/BitrateTest";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Size", size));

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
    private com.squareup.okhttp.Call getPlaybackBitratetestValidateBeforeCall(Long size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling getPlaybackBitratetest(Async)");
        }
        
        com.squareup.okhttp.Call call = getPlaybackBitratetestCall(size, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param size Size (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getPlaybackBitratetest(Long size) throws ApiException {
        getPlaybackBitratetestWithHttpInfo(size);
    }

    /**
     * 
     * Requires authentication as user
     * @param size Size (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getPlaybackBitratetestWithHttpInfo(Long size) throws ApiException {
        com.squareup.okhttp.Call call = getPlaybackBitratetestValidateBeforeCall(size, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param size Size (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlaybackBitratetestAsync(Long size, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlaybackBitratetestValidateBeforeCall(size, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdPlaybackinfo
     * @param body PlaybackInfoRequest:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdPlaybackinfoCall(MediaInfoPlaybackInfoRequest body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/PlaybackInfo"
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
    private com.squareup.okhttp.Call postItemsByIdPlaybackinfoValidateBeforeCall(MediaInfoPlaybackInfoRequest body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsByIdPlaybackinfo(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdPlaybackinfo(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdPlaybackinfoCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param body PlaybackInfoRequest:  (required)
     * @param id  (required)
     * @return MediaInfoPlaybackInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaInfoPlaybackInfoResponse postItemsByIdPlaybackinfo(MediaInfoPlaybackInfoRequest body, String id) throws ApiException {
        ApiResponse<MediaInfoPlaybackInfoResponse> resp = postItemsByIdPlaybackinfoWithHttpInfo(body, id);
        return resp.getData();
    }

    /**
     * Gets live playback media info for an item
     * Requires authentication as user
     * @param body PlaybackInfoRequest:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;MediaInfoPlaybackInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaInfoPlaybackInfoResponse> postItemsByIdPlaybackinfoWithHttpInfo(MediaInfoPlaybackInfoRequest body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdPlaybackinfoValidateBeforeCall(body, id, null, null);
        Type localVarReturnType = new TypeToken<MediaInfoPlaybackInfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live playback media info for an item (asynchronously)
     * Requires authentication as user
     * @param body PlaybackInfoRequest:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdPlaybackinfoAsync(MediaInfoPlaybackInfoRequest body, String id, final ApiCallback<MediaInfoPlaybackInfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdPlaybackinfoValidateBeforeCall(body, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaInfoPlaybackInfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLivestreamsClose
     * @param liveStreamId LiveStreamId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsCloseCall(String liveStreamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveStreams/Close";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));

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
    private com.squareup.okhttp.Call postLivestreamsCloseValidateBeforeCall(String liveStreamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling postLivestreamsClose(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivestreamsCloseCall(liveStreamId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivestreamsClose(String liveStreamId) throws ApiException {
        postLivestreamsCloseWithHttpInfo(liveStreamId);
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivestreamsCloseWithHttpInfo(String liveStreamId) throws ApiException {
        com.squareup.okhttp.Call call = postLivestreamsCloseValidateBeforeCall(liveStreamId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Closes a media source (asynchronously)
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsCloseAsync(String liveStreamId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivestreamsCloseValidateBeforeCall(liveStreamId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivestreamsMediainfo
     * @param liveStreamId LiveStreamId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsMediainfoCall(String liveStreamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveStreams/MediaInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));

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
    private com.squareup.okhttp.Call postLivestreamsMediainfoValidateBeforeCall(String liveStreamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'liveStreamId' is set
        if (liveStreamId == null) {
            throw new ApiException("Missing the required parameter 'liveStreamId' when calling postLivestreamsMediainfo(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivestreamsMediainfoCall(liveStreamId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivestreamsMediainfo(String liveStreamId) throws ApiException {
        postLivestreamsMediainfoWithHttpInfo(liveStreamId);
    }

    /**
     * Closes a media source
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivestreamsMediainfoWithHttpInfo(String liveStreamId) throws ApiException {
        com.squareup.okhttp.Call call = postLivestreamsMediainfoValidateBeforeCall(liveStreamId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Closes a media source (asynchronously)
     * Requires authentication as user
     * @param liveStreamId LiveStreamId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsMediainfoAsync(String liveStreamId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivestreamsMediainfoValidateBeforeCall(liveStreamId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivestreamsOpen
     * @param body LiveStreamRequest:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsOpenCall(MediaInfoLiveStreamRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveStreams/Open";

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
    private com.squareup.okhttp.Call postLivestreamsOpenValidateBeforeCall(MediaInfoLiveStreamRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivestreamsOpen(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivestreamsOpenCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Opens a media source
     * Requires authentication as user
     * @param body LiveStreamRequest:  (required)
     * @return MediaInfoLiveStreamResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaInfoLiveStreamResponse postLivestreamsOpen(MediaInfoLiveStreamRequest body) throws ApiException {
        ApiResponse<MediaInfoLiveStreamResponse> resp = postLivestreamsOpenWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Opens a media source
     * Requires authentication as user
     * @param body LiveStreamRequest:  (required)
     * @return ApiResponse&lt;MediaInfoLiveStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaInfoLiveStreamResponse> postLivestreamsOpenWithHttpInfo(MediaInfoLiveStreamRequest body) throws ApiException {
        com.squareup.okhttp.Call call = postLivestreamsOpenValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaInfoLiveStreamResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Opens a media source (asynchronously)
     * Requires authentication as user
     * @param body LiveStreamRequest:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivestreamsOpenAsync(MediaInfoLiveStreamRequest body, final ApiCallback<MediaInfoLiveStreamResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivestreamsOpenValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaInfoLiveStreamResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
