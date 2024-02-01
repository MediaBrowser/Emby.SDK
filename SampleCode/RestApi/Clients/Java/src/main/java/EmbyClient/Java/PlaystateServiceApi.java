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


import io.swagger.client.model.ApiOnPlaybackProgress;
import io.swagger.client.model.PlayMethod;
import io.swagger.client.model.PlaybackProgressInfo;
import io.swagger.client.model.PlaybackStartInfo;
import io.swagger.client.model.PlaybackStopInfo;
import io.swagger.client.model.RepeatMode;
import io.swagger.client.model.UserItemDataDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaystateServiceApi {
    private ApiClient apiClient;

    public PlaystateServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlaystateServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUsersByUseridPlayeditemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as unplayed Documentation</a>
     */
    public com.squareup.okhttp.Call deleteUsersByUseridPlayeditemsByIdCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayedItems/{Id}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUsersByUseridPlayeditemsByIdValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUsersByUseridPlayeditemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByUseridPlayeditemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByUseridPlayeditemsByIdCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as unplayed Documentation</a>
     */
    public UserItemDataDto deleteUsersByUseridPlayeditemsById(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = deleteUsersByUseridPlayeditemsByIdWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as unplayed Documentation</a>
     */
    public ApiResponse<UserItemDataDto> deleteUsersByUseridPlayeditemsByIdWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByUseridPlayeditemsByIdValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Marks an item as unplayed (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as unplayed Documentation</a>
     */
    public com.squareup.okhttp.Call deleteUsersByUseridPlayeditemsByIdAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByUseridPlayeditemsByIdValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUsersByUseridPlayingitemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridPlayingitemsByIdCall(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayingItems/{Id}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));
        if (nextMediaType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NextMediaType", nextMediaType));
        if (positionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PositionTicks", positionTicks));
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));
        if (playSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaySessionId", playSessionId));

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
    private com.squareup.okhttp.Call deleteUsersByUseridPlayingitemsByIdValidateBeforeCall(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUsersByUseridPlayingitemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByUseridPlayingitemsById(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling deleteUsersByUseridPlayingitemsById(Async)");
        }
        // verify the required parameter 'nextMediaType' is set
        if (nextMediaType == null) {
            throw new ApiException("Missing the required parameter 'nextMediaType' when calling deleteUsersByUseridPlayingitemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByUseridPlayingitemsByIdCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUsersByUseridPlayingitemsById(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId) throws ApiException {
        deleteUsersByUseridPlayingitemsByIdWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUsersByUseridPlayingitemsByIdWithHttpInfo(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByUseridPlayingitemsByIdValidateBeforeCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports that a user has stopped playing an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridPlayingitemsByIdAsync(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByUseridPlayingitemsByIdValidateBeforeCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postSessionsPlaying
     * @param body PlaybackStartInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has started within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingCall(PlaybackStartInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Sessions/Playing";

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
    private com.squareup.okhttp.Call postSessionsPlayingValidateBeforeCall(PlaybackStartInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postSessionsPlaying(Async)");
        }
        
        com.squareup.okhttp.Call call = postSessionsPlayingCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports playback has started within a session
     * Requires authentication as user
     * @param body PlaybackStartInfo:  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has started within a session Documentation</a>
     */
    public void postSessionsPlaying(PlaybackStartInfo body) throws ApiException {
        postSessionsPlayingWithHttpInfo(body);
    }

    /**
     * Reports playback has started within a session
     * Requires authentication as user
     * @param body PlaybackStartInfo:  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has started within a session Documentation</a>
     */
    public ApiResponse<Void> postSessionsPlayingWithHttpInfo(PlaybackStartInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postSessionsPlayingValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports playback has started within a session (asynchronously)
     * Requires authentication as user
     * @param body PlaybackStartInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has started within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingAsync(PlaybackStartInfo body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSessionsPlayingValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postSessionsPlayingPing
     * @param playSessionId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSessionsPlayingPingCall(String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Sessions/Playing/Ping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (playSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaySessionId", playSessionId));

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
    private com.squareup.okhttp.Call postSessionsPlayingPingValidateBeforeCall(String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postSessionsPlayingPingCall(playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Pings a playback session
     * Requires authentication as user
     * @param playSessionId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postSessionsPlayingPing(String playSessionId) throws ApiException {
        postSessionsPlayingPingWithHttpInfo(playSessionId);
    }

    /**
     * Pings a playback session
     * Requires authentication as user
     * @param playSessionId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postSessionsPlayingPingWithHttpInfo(String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = postSessionsPlayingPingValidateBeforeCall(playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Pings a playback session (asynchronously)
     * Requires authentication as user
     * @param playSessionId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSessionsPlayingPingAsync(String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSessionsPlayingPingValidateBeforeCall(playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postSessionsPlayingProgress
     * @param body PlaybackProgressInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback progress within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingProgressCall(PlaybackProgressInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Sessions/Playing/Progress";

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
    private com.squareup.okhttp.Call postSessionsPlayingProgressValidateBeforeCall(PlaybackProgressInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postSessionsPlayingProgress(Async)");
        }
        
        com.squareup.okhttp.Call call = postSessionsPlayingProgressCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports playback progress within a session
     * Requires authentication as user
     * @param body PlaybackProgressInfo:  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback progress within a session Documentation</a>
     */
    public void postSessionsPlayingProgress(PlaybackProgressInfo body) throws ApiException {
        postSessionsPlayingProgressWithHttpInfo(body);
    }

    /**
     * Reports playback progress within a session
     * Requires authentication as user
     * @param body PlaybackProgressInfo:  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback progress within a session Documentation</a>
     */
    public ApiResponse<Void> postSessionsPlayingProgressWithHttpInfo(PlaybackProgressInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postSessionsPlayingProgressValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports playback progress within a session (asynchronously)
     * Requires authentication as user
     * @param body PlaybackProgressInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback progress within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingProgressAsync(PlaybackProgressInfo body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSessionsPlayingProgressValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postSessionsPlayingStopped
     * @param body PlaybackStopInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has stopped within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingStoppedCall(PlaybackStopInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Sessions/Playing/Stopped";

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
    private com.squareup.okhttp.Call postSessionsPlayingStoppedValidateBeforeCall(PlaybackStopInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postSessionsPlayingStopped(Async)");
        }
        
        com.squareup.okhttp.Call call = postSessionsPlayingStoppedCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports playback has stopped within a session
     * Requires authentication as user
     * @param body PlaybackStopInfo:  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has stopped within a session Documentation</a>
     */
    public void postSessionsPlayingStopped(PlaybackStopInfo body) throws ApiException {
        postSessionsPlayingStoppedWithHttpInfo(body);
    }

    /**
     * Reports playback has stopped within a session
     * Requires authentication as user
     * @param body PlaybackStopInfo:  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has stopped within a session Documentation</a>
     */
    public ApiResponse<Void> postSessionsPlayingStoppedWithHttpInfo(PlaybackStopInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postSessionsPlayingStoppedValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports playback has stopped within a session (asynchronously)
     * Requires authentication as user
     * @param body PlaybackStopInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Reports playback has stopped within a session Documentation</a>
     */
    public com.squareup.okhttp.Call postSessionsPlayingStoppedAsync(PlaybackStopInfo body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSessionsPlayingStoppedValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridItemsByItemidUserdata
     * @param body UserItemDataDto:  (required)
     * @param userId User Id (required)
     * @param itemId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByItemidUserdataCall(UserItemDataDto body, String userId, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{ItemId}/UserData"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
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
    private com.squareup.okhttp.Call postUsersByUseridItemsByItemidUserdataValidateBeforeCall(UserItemDataDto body, String userId, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByUseridItemsByItemidUserdata(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridItemsByItemidUserdata(Async)");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling postUsersByUseridItemsByItemidUserdata(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridItemsByItemidUserdataCall(body, userId, itemId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates userdata for an item
     * Requires authentication as user
     * @param body UserItemDataDto:  (required)
     * @param userId User Id (required)
     * @param itemId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByUseridItemsByItemidUserdata(UserItemDataDto body, String userId, String itemId) throws ApiException {
        postUsersByUseridItemsByItemidUserdataWithHttpInfo(body, userId, itemId);
    }

    /**
     * Updates userdata for an item
     * Requires authentication as user
     * @param body UserItemDataDto:  (required)
     * @param userId User Id (required)
     * @param itemId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByUseridItemsByItemidUserdataWithHttpInfo(UserItemDataDto body, String userId, String itemId) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridItemsByItemidUserdataValidateBeforeCall(body, userId, itemId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates userdata for an item (asynchronously)
     * Requires authentication as user
     * @param body UserItemDataDto:  (required)
     * @param userId User Id (required)
     * @param itemId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByItemidUserdataAsync(UserItemDataDto body, String userId, String itemId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridItemsByItemidUserdataValidateBeforeCall(body, userId, itemId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridPlayeditemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param datePlayed The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as played Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdCall(String userId, String id, String datePlayed, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayedItems/{Id}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datePlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DatePlayed", datePlayed));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdValidateBeforeCall(String userId, String id, String datePlayed, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridPlayeditemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridPlayeditemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdCall(userId, id, datePlayed, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks an item as played
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param datePlayed The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as played Documentation</a>
     */
    public UserItemDataDto postUsersByUseridPlayeditemsById(String userId, String id, String datePlayed) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridPlayeditemsByIdWithHttpInfo(userId, id, datePlayed);
        return resp.getData();
    }

    /**
     * Marks an item as played
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param datePlayed The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as played Documentation</a>
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridPlayeditemsByIdWithHttpInfo(String userId, String id, String datePlayed) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdValidateBeforeCall(userId, id, datePlayed, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Marks an item as played (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param datePlayed The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Playback Check-ins
     * @see <a href="https://dev.emby.media/doc/restapi/Playback-Check-ins.html">Marks an item as played Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdAsync(String userId, String id, String datePlayed, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdValidateBeforeCall(userId, id, datePlayed, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridPlayeditemsByIdDelete
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdDeleteCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayedItems/{Id}/Delete"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdDeleteValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridPlayeditemsByIdDelete(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridPlayeditemsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdDeleteCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridPlayeditemsByIdDelete(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridPlayeditemsByIdDeleteWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Marks an item as unplayed
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridPlayeditemsByIdDeleteWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdDeleteValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Marks an item as unplayed (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayeditemsByIdDeleteAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridPlayeditemsByIdDeleteValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridPlayingitemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param canSeek Indicates if the client can seek (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdCall(String userId, String id, String mediaSourceId, Boolean canSeek, Integer audioStreamIndex, Integer subtitleStreamIndex, PlayMethod playMethod, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayingItems/{Id}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));
        if (canSeek != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CanSeek", canSeek));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (playMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlayMethod", playMethod));
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));
        if (playSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaySessionId", playSessionId));

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
    private com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdValidateBeforeCall(String userId, String id, String mediaSourceId, Boolean canSeek, Integer audioStreamIndex, Integer subtitleStreamIndex, PlayMethod playMethod, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridPlayingitemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridPlayingitemsById(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postUsersByUseridPlayingitemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdCall(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports that a user has begun playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param canSeek Indicates if the client can seek (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByUseridPlayingitemsById(String userId, String id, String mediaSourceId, Boolean canSeek, Integer audioStreamIndex, Integer subtitleStreamIndex, PlayMethod playMethod, String liveStreamId, String playSessionId) throws ApiException {
        postUsersByUseridPlayingitemsByIdWithHttpInfo(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId);
    }

    /**
     * Reports that a user has begun playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param canSeek Indicates if the client can seek (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByUseridPlayingitemsByIdWithHttpInfo(String userId, String id, String mediaSourceId, Boolean canSeek, Integer audioStreamIndex, Integer subtitleStreamIndex, PlayMethod playMethod, String liveStreamId, String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdValidateBeforeCall(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports that a user has begun playing an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param canSeek Indicates if the client can seek (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdAsync(String userId, String id, String mediaSourceId, Boolean canSeek, Integer audioStreamIndex, Integer subtitleStreamIndex, PlayMethod playMethod, String liveStreamId, String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdValidateBeforeCall(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridPlayingitemsByIdDelete
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdDeleteCall(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Delete"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));
        if (nextMediaType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NextMediaType", nextMediaType));
        if (positionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PositionTicks", positionTicks));
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));
        if (playSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaySessionId", playSessionId));

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
    private com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdDeleteValidateBeforeCall(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridPlayingitemsByIdDelete(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridPlayingitemsByIdDelete(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postUsersByUseridPlayingitemsByIdDelete(Async)");
        }
        // verify the required parameter 'nextMediaType' is set
        if (nextMediaType == null) {
            throw new ApiException("Missing the required parameter 'nextMediaType' when calling postUsersByUseridPlayingitemsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdDeleteCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByUseridPlayingitemsByIdDelete(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId) throws ApiException {
        postUsersByUseridPlayingitemsByIdDeleteWithHttpInfo(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);
    }

    /**
     * Reports that a user has stopped playing an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByUseridPlayingitemsByIdDeleteWithHttpInfo(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdDeleteValidateBeforeCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports that a user has stopped playing an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param nextMediaType The next media type that will play (required)
     * @param positionTicks Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks. (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdDeleteAsync(String userId, String id, String mediaSourceId, String nextMediaType, Long positionTicks, String liveStreamId, String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdDeleteValidateBeforeCall(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridPlayingitemsByIdProgress
     * @param body OnPlaybackProgress (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param positionTicks Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param isPaused Indicates if the player is paused. (optional)
     * @param isMuted Indicates if the player is muted. (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param volumeLevel Scale of 0-100 (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param repeatMode  (optional)
     * @param subtitleOffset  (optional)
     * @param playbackRate  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdProgressCall(ApiOnPlaybackProgress body, String mediaSourceId, String userId, String id, Long positionTicks, Boolean isPaused, Boolean isMuted, Integer audioStreamIndex, Integer subtitleStreamIndex, Integer volumeLevel, PlayMethod playMethod, String liveStreamId, String playSessionId, RepeatMode repeatMode, Integer subtitleOffset, Double playbackRate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/PlayingItems/{Id}/Progress"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));
        if (positionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PositionTicks", positionTicks));
        if (isPaused != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPaused", isPaused));
        if (isMuted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMuted", isMuted));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (volumeLevel != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VolumeLevel", volumeLevel));
        if (playMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlayMethod", playMethod));
        if (liveStreamId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("LiveStreamId", liveStreamId));
        if (playSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaySessionId", playSessionId));
        if (repeatMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("RepeatMode", repeatMode));
        if (subtitleOffset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleOffset", subtitleOffset));
        if (playbackRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PlaybackRate", playbackRate));

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
    private com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdProgressValidateBeforeCall(ApiOnPlaybackProgress body, String mediaSourceId, String userId, String id, Long positionTicks, Boolean isPaused, Boolean isMuted, Integer audioStreamIndex, Integer subtitleStreamIndex, Integer volumeLevel, PlayMethod playMethod, String liveStreamId, String playSessionId, RepeatMode repeatMode, Integer subtitleOffset, Double playbackRate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByUseridPlayingitemsByIdProgress(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postUsersByUseridPlayingitemsByIdProgress(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridPlayingitemsByIdProgress(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridPlayingitemsByIdProgress(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdProgressCall(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports a user&#x27;s playback progress
     * Requires authentication as user
     * @param body OnPlaybackProgress (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param positionTicks Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param isPaused Indicates if the player is paused. (optional)
     * @param isMuted Indicates if the player is muted. (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param volumeLevel Scale of 0-100 (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param repeatMode  (optional)
     * @param subtitleOffset  (optional)
     * @param playbackRate  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByUseridPlayingitemsByIdProgress(ApiOnPlaybackProgress body, String mediaSourceId, String userId, String id, Long positionTicks, Boolean isPaused, Boolean isMuted, Integer audioStreamIndex, Integer subtitleStreamIndex, Integer volumeLevel, PlayMethod playMethod, String liveStreamId, String playSessionId, RepeatMode repeatMode, Integer subtitleOffset, Double playbackRate) throws ApiException {
        postUsersByUseridPlayingitemsByIdProgressWithHttpInfo(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate);
    }

    /**
     * Reports a user&#x27;s playback progress
     * Requires authentication as user
     * @param body OnPlaybackProgress (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param positionTicks Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param isPaused Indicates if the player is paused. (optional)
     * @param isMuted Indicates if the player is muted. (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param volumeLevel Scale of 0-100 (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param repeatMode  (optional)
     * @param subtitleOffset  (optional)
     * @param playbackRate  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByUseridPlayingitemsByIdProgressWithHttpInfo(ApiOnPlaybackProgress body, String mediaSourceId, String userId, String id, Long positionTicks, Boolean isPaused, Boolean isMuted, Integer audioStreamIndex, Integer subtitleStreamIndex, Integer volumeLevel, PlayMethod playMethod, String liveStreamId, String playSessionId, RepeatMode repeatMode, Integer subtitleOffset, Double playbackRate) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdProgressValidateBeforeCall(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports a user&#x27;s playback progress (asynchronously)
     * Requires authentication as user
     * @param body OnPlaybackProgress (required)
     * @param mediaSourceId The id of the MediaSource (required)
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param positionTicks Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param isPaused Indicates if the player is paused. (optional)
     * @param isMuted Indicates if the player is muted. (optional)
     * @param audioStreamIndex  (optional)
     * @param subtitleStreamIndex  (optional)
     * @param volumeLevel Scale of 0-100 (optional)
     * @param playMethod  (optional)
     * @param liveStreamId  (optional)
     * @param playSessionId  (optional)
     * @param repeatMode  (optional)
     * @param subtitleOffset  (optional)
     * @param playbackRate  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridPlayingitemsByIdProgressAsync(ApiOnPlaybackProgress body, String mediaSourceId, String userId, String id, Long positionTicks, Boolean isPaused, Boolean isMuted, Integer audioStreamIndex, Integer subtitleStreamIndex, Integer volumeLevel, PlayMethod playMethod, String liveStreamId, String playSessionId, RepeatMode repeatMode, Integer subtitleOffset, Double playbackRate, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridPlayingitemsByIdProgressValidateBeforeCall(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
