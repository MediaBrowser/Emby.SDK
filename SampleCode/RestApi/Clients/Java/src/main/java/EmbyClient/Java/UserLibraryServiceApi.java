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
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.UserItemDataDto;
import io.swagger.client.model.UserLibraryLeaveSharedItems;
import io.swagger.client.model.UserLibraryUpdateUserItemAccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserLibraryServiceApi {
    private ApiClient apiClient;

    public UserLibraryServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserLibraryServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUsersByUseridFavoriteitemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridFavoriteitemsByIdCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/FavoriteItems/{Id}"
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
    private com.squareup.okhttp.Call deleteUsersByUseridFavoriteitemsByIdValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUsersByUseridFavoriteitemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByUseridFavoriteitemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByUseridFavoriteitemsByIdCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto deleteUsersByUseridFavoriteitemsById(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = deleteUsersByUseridFavoriteitemsByIdWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> deleteUsersByUseridFavoriteitemsByIdWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByUseridFavoriteitemsByIdValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unmarks an item as a favorite (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridFavoriteitemsByIdAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByUseridFavoriteitemsByIdValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUsersByUseridItemsByIdRating
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridItemsByIdRatingCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/Rating"
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
    private com.squareup.okhttp.Call deleteUsersByUseridItemsByIdRatingValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUsersByUseridItemsByIdRating(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByUseridItemsByIdRating(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByUseridItemsByIdRatingCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto deleteUsersByUseridItemsByIdRating(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = deleteUsersByUseridItemsByIdRatingWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> deleteUsersByUseridItemsByIdRatingWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByUseridItemsByIdRatingValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByUseridItemsByIdRatingAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByUseridItemsByIdRatingValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvProgramsById
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv program Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvProgramsByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Programs/{Id}"
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
    private com.squareup.okhttp.Call getLivetvProgramsByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLivetvProgramsById(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvProgramsByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a live tv program
     * Requires authentication as user
     * @param id Item Id (required)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv program Documentation</a>
     */
    public BaseItemDto getLivetvProgramsById(String id) throws ApiException {
        ApiResponse<BaseItemDto> resp = getLivetvProgramsByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a live tv program
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv program Documentation</a>
     */
    public ApiResponse<BaseItemDto> getLivetvProgramsByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvProgramsByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a live tv program (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv program Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvProgramsByIdAsync(String id, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvProgramsByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets an item from a user&#x27;s library Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsersByUseridItemsByIdValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByUseridItemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an item from a user&#x27;s library
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets an item from a user&#x27;s library Documentation</a>
     */
    public BaseItemDto getUsersByUseridItemsById(String userId, String id) throws ApiException {
        ApiResponse<BaseItemDto> resp = getUsersByUseridItemsByIdWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Gets an item from a user&#x27;s library
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets an item from a user&#x27;s library Documentation</a>
     */
    public ApiResponse<BaseItemDto> getUsersByUseridItemsByIdWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets an item from a user&#x27;s library (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets an item from a user&#x27;s library Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdAsync(String userId, String id, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsByIdIntros
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets intros to play before the main media item plays Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdIntrosCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/Intros"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getUsersByUseridItemsByIdIntrosValidateBeforeCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsByIdIntros(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByUseridItemsByIdIntros(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdIntrosCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets intros to play before the main media item plays
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets intros to play before the main media item plays Documentation</a>
     */
    public QueryResultBaseItemDto getUsersByUseridItemsByIdIntros(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getUsersByUseridItemsByIdIntrosWithHttpInfo(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets intros to play before the main media item plays
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets intros to play before the main media item plays Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getUsersByUseridItemsByIdIntrosWithHttpInfo(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdIntrosValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets intros to play before the main media item plays (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets intros to play before the main media item plays Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdIntrosAsync(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdIntrosValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsByIdLocaltrailers
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets local trailers for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdLocaltrailersCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/LocalTrailers"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getUsersByUseridItemsByIdLocaltrailersValidateBeforeCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsByIdLocaltrailers(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByUseridItemsByIdLocaltrailers(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdLocaltrailersCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets local trailers for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets local trailers for an item Documentation</a>
     */
    public List<BaseItemDto> getUsersByUseridItemsByIdLocaltrailers(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getUsersByUseridItemsByIdLocaltrailersWithHttpInfo(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets local trailers for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets local trailers for an item Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getUsersByUseridItemsByIdLocaltrailersWithHttpInfo(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdLocaltrailersValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets local trailers for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets local trailers for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdLocaltrailersAsync(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdLocaltrailersValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsByIdSpecialfeatures
     * @param userId User Id (required)
     * @param id Movie Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets special features for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdSpecialfeaturesCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/SpecialFeatures"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getUsersByUseridItemsByIdSpecialfeaturesValidateBeforeCall(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsByIdSpecialfeatures(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByUseridItemsByIdSpecialfeatures(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdSpecialfeaturesCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets special features for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Movie Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets special features for an item Documentation</a>
     */
    public List<BaseItemDto> getUsersByUseridItemsByIdSpecialfeatures(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets special features for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Movie Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets special features for an item Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdSpecialfeaturesValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets special features for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Movie Id (required)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets special features for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsByIdSpecialfeaturesAsync(String userId, String id, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsByIdSpecialfeaturesValidateBeforeCall(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsLatest
     * @param userId User Id (required)
     * @param limit Limit (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param isFolder Filter by items that are folders, or not. (optional)
     * @param isPlayed Filter by items that are played, or not. (optional)
     * @param groupItems Whether or not to group items into a parent container. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Latest Items
     * @see <a href="https://dev.emby.media/doc/restapi/Latest-Items.html">Gets latest media Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsLatestCall(String userId, Integer limit, String parentId, String fields, String includeItemTypes, String mediaTypes, Boolean isFolder, Boolean isPlayed, Boolean groupItems, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/Latest"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (groupItems != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItems", groupItems));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getUsersByUseridItemsLatestValidateBeforeCall(String userId, Integer limit, String parentId, String fields, String includeItemTypes, String mediaTypes, Boolean isFolder, Boolean isPlayed, Boolean groupItems, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsLatest(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsLatestCall(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets latest media
     * Requires authentication as user
     * @param userId User Id (required)
     * @param limit Limit (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param isFolder Filter by items that are folders, or not. (optional)
     * @param isPlayed Filter by items that are played, or not. (optional)
     * @param groupItems Whether or not to group items into a parent container. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Latest Items
     * @see <a href="https://dev.emby.media/doc/restapi/Latest-Items.html">Gets latest media Documentation</a>
     */
    public List<BaseItemDto> getUsersByUseridItemsLatest(String userId, Integer limit, String parentId, String fields, String includeItemTypes, String mediaTypes, Boolean isFolder, Boolean isPlayed, Boolean groupItems, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getUsersByUseridItemsLatestWithHttpInfo(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets latest media
     * Requires authentication as user
     * @param userId User Id (required)
     * @param limit Limit (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param isFolder Filter by items that are folders, or not. (optional)
     * @param isPlayed Filter by items that are played, or not. (optional)
     * @param groupItems Whether or not to group items into a parent container. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Latest Items
     * @see <a href="https://dev.emby.media/doc/restapi/Latest-Items.html">Gets latest media Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getUsersByUseridItemsLatestWithHttpInfo(String userId, Integer limit, String parentId, String fields, String includeItemTypes, String mediaTypes, Boolean isFolder, Boolean isPlayed, Boolean groupItems, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsLatestValidateBeforeCall(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets latest media (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param limit Limit (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, SortName, Studios, Taglines (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param isFolder Filter by items that are folders, or not. (optional)
     * @param isPlayed Filter by items that are played, or not. (optional)
     * @param groupItems Whether or not to group items into a parent container. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Latest Items
     * @see <a href="https://dev.emby.media/doc/restapi/Latest-Items.html">Gets latest media Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsLatestAsync(String userId, Integer limit, String parentId, String fields, String includeItemTypes, String mediaTypes, Boolean isFolder, Boolean isPlayed, Boolean groupItems, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsLatestValidateBeforeCall(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridItemsRoot
     * @param userId User Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the root folder from a user&#x27;s library Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsRootCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/Root"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call getUsersByUseridItemsRootValidateBeforeCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridItemsRoot(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridItemsRootCall(userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the root folder from a user&#x27;s library
     * Requires authentication as user
     * @param userId User Id (required)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the root folder from a user&#x27;s library Documentation</a>
     */
    public BaseItemDto getUsersByUseridItemsRoot(String userId) throws ApiException {
        ApiResponse<BaseItemDto> resp = getUsersByUseridItemsRootWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Gets the root folder from a user&#x27;s library
     * Requires authentication as user
     * @param userId User Id (required)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the root folder from a user&#x27;s library Documentation</a>
     */
    public ApiResponse<BaseItemDto> getUsersByUseridItemsRootWithHttpInfo(String userId) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridItemsRootValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the root folder from a user&#x27;s library (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the root folder from a user&#x27;s library Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridItemsRootAsync(String userId, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridItemsRootValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdAdditionalparts
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets additional parts for a video. Documentation</a>
     */
    public com.squareup.okhttp.Call getVideosByIdAdditionalpartsCall(String id, String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/AdditionalParts"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getVideosByIdAdditionalpartsValidateBeforeCall(String id, String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdAdditionalparts(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdAdditionalpartsCall(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets additional parts for a video.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets additional parts for a video. Documentation</a>
     */
    public QueryResultBaseItemDto getVideosByIdAdditionalparts(String id, String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getVideosByIdAdditionalpartsWithHttpInfo(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets additional parts for a video.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets additional parts for a video. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getVideosByIdAdditionalpartsWithHttpInfo(String id, String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdAdditionalpartsValidateBeforeCall(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets additional parts for a video. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets additional parts for a video. Documentation</a>
     */
    public com.squareup.okhttp.Call getVideosByIdAdditionalpartsAsync(String id, String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdAdditionalpartsValidateBeforeCall(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsAccess
     * @param body UpdateUserItemAccess (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsAccessCall(UserLibraryUpdateUserItemAccess body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/Access";

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
    private com.squareup.okhttp.Call postItemsAccessValidateBeforeCall(UserLibraryUpdateUserItemAccess body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsAccess(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsAccessCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates user item access
     * Requires authentication as user
     * @param body UpdateUserItemAccess (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsAccess(UserLibraryUpdateUserItemAccess body) throws ApiException {
        postItemsAccessWithHttpInfo(body);
    }

    /**
     * Updates user item access
     * Requires authentication as user
     * @param body UpdateUserItemAccess (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsAccessWithHttpInfo(UserLibraryUpdateUserItemAccess body) throws ApiException {
        com.squareup.okhttp.Call call = postItemsAccessValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates user item access (asynchronously)
     * Requires authentication as user
     * @param body UpdateUserItemAccess (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsAccessAsync(UserLibraryUpdateUserItemAccess body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsAccessValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdMakeprivate
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdMakeprivateCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/MakePrivate"
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
    private com.squareup.okhttp.Call postItemsByIdMakeprivateValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdMakeprivate(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdMakeprivateCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Makes an item private
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdMakeprivate(String id) throws ApiException {
        postItemsByIdMakeprivateWithHttpInfo(id);
    }

    /**
     * Makes an item private
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdMakeprivateWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdMakeprivateValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Makes an item private (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdMakeprivateAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdMakeprivateValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdMakepublic
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdMakepublicCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/MakePublic"
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
    private com.squareup.okhttp.Call postItemsByIdMakepublicValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdMakepublic(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdMakepublicCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Makes an item public to all users
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdMakepublic(String id) throws ApiException {
        postItemsByIdMakepublicWithHttpInfo(id);
    }

    /**
     * Makes an item public to all users
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdMakepublicWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdMakepublicValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Makes an item public to all users (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdMakepublicAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdMakepublicValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsSharedLeave
     * @param body LeaveSharedItems (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsSharedLeaveCall(UserLibraryLeaveSharedItems body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/Shared/Leave";

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
    private com.squareup.okhttp.Call postItemsSharedLeaveValidateBeforeCall(UserLibraryLeaveSharedItems body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsSharedLeave(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsSharedLeaveCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Leaves a shared item
     * Requires authentication as user
     * @param body LeaveSharedItems (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsSharedLeave(UserLibraryLeaveSharedItems body) throws ApiException {
        postItemsSharedLeaveWithHttpInfo(body);
    }

    /**
     * Leaves a shared item
     * Requires authentication as user
     * @param body LeaveSharedItems (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsSharedLeaveWithHttpInfo(UserLibraryLeaveSharedItems body) throws ApiException {
        com.squareup.okhttp.Call call = postItemsSharedLeaveValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Leaves a shared item (asynchronously)
     * Requires authentication as user
     * @param body LeaveSharedItems (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsSharedLeaveAsync(UserLibraryLeaveSharedItems body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsSharedLeaveValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridFavoriteitemsById
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/FavoriteItems/{Id}"
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
    private com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridFavoriteitemsById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridFavoriteitemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridFavoriteitemsById(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridFavoriteitemsByIdWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Marks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridFavoriteitemsByIdWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Marks an item as a favorite (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridFavoriteitemsByIdDelete
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdDeleteCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/FavoriteItems/{Id}/Delete"
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
    private com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdDeleteValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridFavoriteitemsByIdDelete(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridFavoriteitemsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdDeleteCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridFavoriteitemsByIdDelete(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdDeleteValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unmarks an item as a favorite (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridFavoriteitemsByIdDeleteAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridFavoriteitemsByIdDeleteValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridItemsByIdHidefromresume
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param hide Whether the item should be hidden from reusme or not. true/false (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdHidefromresumeCall(String userId, String id, Boolean hide, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/HideFromResume"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (hide != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Hide", hide));

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
    private com.squareup.okhttp.Call postUsersByUseridItemsByIdHidefromresumeValidateBeforeCall(String userId, String id, Boolean hide, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridItemsByIdHidefromresume(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridItemsByIdHidefromresume(Async)");
        }
        // verify the required parameter 'hide' is set
        if (hide == null) {
            throw new ApiException("Missing the required parameter 'hide' when calling postUsersByUseridItemsByIdHidefromresume(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdHidefromresumeCall(userId, id, hide, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user&#x27;s hide from resume for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param hide Whether the item should be hidden from reusme or not. true/false (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridItemsByIdHidefromresume(String userId, String id, Boolean hide) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridItemsByIdHidefromresumeWithHttpInfo(userId, id, hide);
        return resp.getData();
    }

    /**
     * Updates a user&#x27;s hide from resume for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param hide Whether the item should be hidden from reusme or not. true/false (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridItemsByIdHidefromresumeWithHttpInfo(String userId, String id, Boolean hide) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdHidefromresumeValidateBeforeCall(userId, id, hide, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a user&#x27;s hide from resume for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param hide Whether the item should be hidden from reusme or not. true/false (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdHidefromresumeAsync(String userId, String id, Boolean hide, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdHidefromresumeValidateBeforeCall(userId, id, hide, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridItemsByIdRating
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param likes Whether the user likes the item or not. true/false (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingCall(String userId, String id, Boolean likes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/Rating"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (likes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Likes", likes));

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
    private com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingValidateBeforeCall(String userId, String id, Boolean likes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridItemsByIdRating(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridItemsByIdRating(Async)");
        }
        // verify the required parameter 'likes' is set
        if (likes == null) {
            throw new ApiException("Missing the required parameter 'likes' when calling postUsersByUseridItemsByIdRating(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingCall(userId, id, likes, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user&#x27;s rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param likes Whether the user likes the item or not. true/false (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridItemsByIdRating(String userId, String id, Boolean likes) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridItemsByIdRatingWithHttpInfo(userId, id, likes);
        return resp.getData();
    }

    /**
     * Updates a user&#x27;s rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param likes Whether the user likes the item or not. true/false (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridItemsByIdRatingWithHttpInfo(String userId, String id, Boolean likes) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingValidateBeforeCall(userId, id, likes, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a user&#x27;s rating for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param likes Whether the user likes the item or not. true/false (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingAsync(String userId, String id, Boolean likes, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingValidateBeforeCall(userId, id, likes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridItemsByIdRatingDelete
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingDeleteCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Items/{Id}/Rating/Delete"
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
    private com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingDeleteValidateBeforeCall(String userId, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridItemsByIdRatingDelete(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByUseridItemsByIdRatingDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingDeleteCall(userId, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return UserItemDataDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserItemDataDto postUsersByUseridItemsByIdRatingDelete(String userId, String id) throws ApiException {
        ApiResponse<UserItemDataDto> resp = postUsersByUseridItemsByIdRatingDeleteWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @return ApiResponse&lt;UserItemDataDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserItemDataDto> postUsersByUseridItemsByIdRatingDeleteWithHttpInfo(String userId, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingDeleteValidateBeforeCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridItemsByIdRatingDeleteAsync(String userId, String id, final ApiCallback<UserItemDataDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridItemsByIdRatingDeleteValidateBeforeCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserItemDataDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
