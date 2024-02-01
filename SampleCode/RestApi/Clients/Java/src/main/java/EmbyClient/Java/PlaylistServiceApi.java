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


import io.swagger.client.model.PlaylistsAddToPlaylistResult;
import io.swagger.client.model.PlaylistsPlaylistCreationResult;
import io.swagger.client.model.QueryResultBaseItemDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaylistServiceApi {
    private ApiClient apiClient;

    public PlaylistServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlaylistServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletePlaylistsByIdItems
     * @param id  (required)
     * @param entryIds  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistsByIdItemsCall(String id, String entryIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/Items"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entryIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EntryIds", entryIds));

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
    private com.squareup.okhttp.Call deletePlaylistsByIdItemsValidateBeforeCall(String id, String entryIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePlaylistsByIdItems(Async)");
        }
        // verify the required parameter 'entryIds' is set
        if (entryIds == null) {
            throw new ApiException("Missing the required parameter 'entryIds' when calling deletePlaylistsByIdItems(Async)");
        }
        
        com.squareup.okhttp.Call call = deletePlaylistsByIdItemsCall(id, entryIds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePlaylistsByIdItems(String id, String entryIds) throws ApiException {
        deletePlaylistsByIdItemsWithHttpInfo(id, entryIds);
    }

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePlaylistsByIdItemsWithHttpInfo(String id, String entryIds) throws ApiException {
        com.squareup.okhttp.Call call = deletePlaylistsByIdItemsValidateBeforeCall(id, entryIds, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes items from a playlist (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistsByIdItemsAsync(String id, String entryIds, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePlaylistsByIdItemsValidateBeforeCall(id, entryIds, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPlaylistsByIdAddtoplaylistinfo
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlaylistsByIdAddtoplaylistinfoCall(String ids, String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/AddToPlaylistInfo"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call getPlaylistsByIdAddtoplaylistinfoValidateBeforeCall(String ids, String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling getPlaylistsByIdAddtoplaylistinfo(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPlaylistsByIdAddtoplaylistinfo(Async)");
        }
        
        com.squareup.okhttp.Call call = getPlaylistsByIdAddtoplaylistinfoCall(ids, id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets add to playlist info
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getPlaylistsByIdAddtoplaylistinfo(String ids, String id, String userId) throws ApiException {
        ApiResponse<Object> resp = getPlaylistsByIdAddtoplaylistinfoWithHttpInfo(ids, id, userId);
        return resp.getData();
    }

    /**
     * Gets add to playlist info
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getPlaylistsByIdAddtoplaylistinfoWithHttpInfo(String ids, String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getPlaylistsByIdAddtoplaylistinfoValidateBeforeCall(ids, id, userId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets add to playlist info (asynchronously)
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlaylistsByIdAddtoplaylistinfoAsync(String ids, String id, String userId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlaylistsByIdAddtoplaylistinfoValidateBeforeCall(ids, id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlaylistsByIdItems
     * @param id  (required)
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the original items of a playlist Documentation</a>
     */
    public com.squareup.okhttp.Call getPlaylistsByIdItemsCall(String id, String userId, Integer startIndex, Integer limit, String fields, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/Items"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));

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
    private com.squareup.okhttp.Call getPlaylistsByIdItemsValidateBeforeCall(String id, String userId, Integer startIndex, Integer limit, String fields, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPlaylistsByIdItems(Async)");
        }
        
        com.squareup.okhttp.Call call = getPlaylistsByIdItemsCall(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the original items of a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the original items of a playlist Documentation</a>
     */
    public QueryResultBaseItemDto getPlaylistsByIdItems(String id, String userId, Integer startIndex, Integer limit, String fields, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getPlaylistsByIdItemsWithHttpInfo(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes);
        return resp.getData();
    }

    /**
     * Gets the original items of a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the original items of a playlist Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getPlaylistsByIdItemsWithHttpInfo(String id, String userId, Integer startIndex, Integer limit, String fields, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes) throws ApiException {
        com.squareup.okhttp.Call call = getPlaylistsByIdItemsValidateBeforeCall(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the original items of a playlist (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the original items of a playlist Documentation</a>
     */
    public com.squareup.okhttp.Call getPlaylistsByIdItemsAsync(String id, String userId, Integer startIndex, Integer limit, String fields, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlaylistsByIdItemsValidateBeforeCall(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPlaylists
     * @param name The name of the new playlist. (optional)
     * @param ids Item Ids to add to the playlist (optional)
     * @param mediaType The playlist media type (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsCall(String name, String ids, String mediaType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Name", name));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (mediaType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaType", mediaType));

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
    private com.squareup.okhttp.Call postPlaylistsValidateBeforeCall(String name, String ids, String mediaType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postPlaylistsCall(name, ids, mediaType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a new playlist
     * Requires authentication as user
     * @param name The name of the new playlist. (optional)
     * @param ids Item Ids to add to the playlist (optional)
     * @param mediaType The playlist media type (optional)
     * @return PlaylistsPlaylistCreationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistsPlaylistCreationResult postPlaylists(String name, String ids, String mediaType) throws ApiException {
        ApiResponse<PlaylistsPlaylistCreationResult> resp = postPlaylistsWithHttpInfo(name, ids, mediaType);
        return resp.getData();
    }

    /**
     * Creates a new playlist
     * Requires authentication as user
     * @param name The name of the new playlist. (optional)
     * @param ids Item Ids to add to the playlist (optional)
     * @param mediaType The playlist media type (optional)
     * @return ApiResponse&lt;PlaylistsPlaylistCreationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistsPlaylistCreationResult> postPlaylistsWithHttpInfo(String name, String ids, String mediaType) throws ApiException {
        com.squareup.okhttp.Call call = postPlaylistsValidateBeforeCall(name, ids, mediaType, null, null);
        Type localVarReturnType = new TypeToken<PlaylistsPlaylistCreationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new playlist (asynchronously)
     * Requires authentication as user
     * @param name The name of the new playlist. (optional)
     * @param ids Item Ids to add to the playlist (optional)
     * @param mediaType The playlist media type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsAsync(String name, String ids, String mediaType, final ApiCallback<PlaylistsPlaylistCreationResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPlaylistsValidateBeforeCall(name, ids, mediaType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistsPlaylistCreationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPlaylistsByIdItems
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsCall(String ids, String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/Items"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call postPlaylistsByIdItemsValidateBeforeCall(String ids, String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postPlaylistsByIdItems(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postPlaylistsByIdItems(Async)");
        }
        
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsCall(ids, id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds items to a playlist
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @return PlaylistsAddToPlaylistResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistsAddToPlaylistResult postPlaylistsByIdItems(String ids, String id, String userId) throws ApiException {
        ApiResponse<PlaylistsAddToPlaylistResult> resp = postPlaylistsByIdItemsWithHttpInfo(ids, id, userId);
        return resp.getData();
    }

    /**
     * Adds items to a playlist
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @return ApiResponse&lt;PlaylistsAddToPlaylistResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistsAddToPlaylistResult> postPlaylistsByIdItemsWithHttpInfo(String ids, String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsValidateBeforeCall(ids, id, userId, null, null);
        Type localVarReturnType = new TypeToken<PlaylistsAddToPlaylistResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds items to a playlist (asynchronously)
     * Requires authentication as user
     * @param ids Item id, comma delimited (required)
     * @param id  (required)
     * @param userId User Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsAsync(String ids, String id, String userId, final ApiCallback<PlaylistsAddToPlaylistResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPlaylistsByIdItemsValidateBeforeCall(ids, id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistsAddToPlaylistResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPlaylistsByIdItemsByItemidMoveByNewindex
     * @param itemId ItemId (required)
     * @param id  (required)
     * @param newIndex NewIndex (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsByItemidMoveByNewindexCall(Long itemId, String id, Integer newIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/Items/{ItemId}/Move/{NewIndex}"
            .replaceAll("\\{" + "ItemId" + "\\}", apiClient.escapeString(itemId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "NewIndex" + "\\}", apiClient.escapeString(newIndex.toString()));

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
    private com.squareup.okhttp.Call postPlaylistsByIdItemsByItemidMoveByNewindexValidateBeforeCall(Long itemId, String id, Integer newIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling postPlaylistsByIdItemsByItemidMoveByNewindex(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postPlaylistsByIdItemsByItemidMoveByNewindex(Async)");
        }
        // verify the required parameter 'newIndex' is set
        if (newIndex == null) {
            throw new ApiException("Missing the required parameter 'newIndex' when calling postPlaylistsByIdItemsByItemidMoveByNewindex(Async)");
        }
        
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsByItemidMoveByNewindexCall(itemId, id, newIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Moves a playlist item
     * Requires authentication as user
     * @param itemId ItemId (required)
     * @param id  (required)
     * @param newIndex NewIndex (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postPlaylistsByIdItemsByItemidMoveByNewindex(Long itemId, String id, Integer newIndex) throws ApiException {
        postPlaylistsByIdItemsByItemidMoveByNewindexWithHttpInfo(itemId, id, newIndex);
    }

    /**
     * Moves a playlist item
     * Requires authentication as user
     * @param itemId ItemId (required)
     * @param id  (required)
     * @param newIndex NewIndex (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postPlaylistsByIdItemsByItemidMoveByNewindexWithHttpInfo(Long itemId, String id, Integer newIndex) throws ApiException {
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsByItemidMoveByNewindexValidateBeforeCall(itemId, id, newIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Moves a playlist item (asynchronously)
     * Requires authentication as user
     * @param itemId ItemId (required)
     * @param id  (required)
     * @param newIndex NewIndex (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsByItemidMoveByNewindexAsync(Long itemId, String id, Integer newIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPlaylistsByIdItemsByItemidMoveByNewindexValidateBeforeCall(itemId, id, newIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postPlaylistsByIdItemsDelete
     * @param id  (required)
     * @param entryIds  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsDeleteCall(String id, String entryIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/Items/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entryIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EntryIds", entryIds));

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
    private com.squareup.okhttp.Call postPlaylistsByIdItemsDeleteValidateBeforeCall(String id, String entryIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postPlaylistsByIdItemsDelete(Async)");
        }
        // verify the required parameter 'entryIds' is set
        if (entryIds == null) {
            throw new ApiException("Missing the required parameter 'entryIds' when calling postPlaylistsByIdItemsDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsDeleteCall(id, entryIds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postPlaylistsByIdItemsDelete(String id, String entryIds) throws ApiException {
        postPlaylistsByIdItemsDeleteWithHttpInfo(id, entryIds);
    }

    /**
     * Removes items from a playlist
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postPlaylistsByIdItemsDeleteWithHttpInfo(String id, String entryIds) throws ApiException {
        com.squareup.okhttp.Call call = postPlaylistsByIdItemsDeleteValidateBeforeCall(id, entryIds, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes items from a playlist (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param entryIds  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPlaylistsByIdItemsDeleteAsync(String id, String entryIds, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPlaylistsByIdItemsDeleteValidateBeforeCall(id, entryIds, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
