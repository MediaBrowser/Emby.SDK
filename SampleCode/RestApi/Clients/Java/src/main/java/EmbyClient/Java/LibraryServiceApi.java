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


import io.swagger.client.model.AllThemeMediaResult;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.ItemCounts;
import io.swagger.client.model.LibraryDeleteInfo;
import io.swagger.client.model.LibraryLibraryOptionsResult;
import io.swagger.client.model.LibraryMediaFolder;
import io.swagger.client.model.LibraryPostUpdatedMedia;
import io.swagger.client.model.PersistenceIntroDebugInfo;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.ThemeMediaResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryServiceApi {
    private ApiClient apiClient;

    public LibraryServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LibraryServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteItems
     * @param ids Ids (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call deleteItemsValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling deleteItems(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsCall(ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItems(String ids) throws ApiException {
        deleteItemsWithHttpInfo(ids);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsValidateBeforeCall(ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param ids Ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsAsync(String ids, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteItemsValidateBeforeCall(ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteItemsById
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}"
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
    private com.squareup.okhttp.Call deleteItemsByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteItemsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItemsById(String id) throws ApiException {
        deleteItemsByIdWithHttpInfo(id);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteItemsByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAlbumsByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Albums/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getAlbumsByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAlbumsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getAlbumsByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public QueryResultBaseItemDto getAlbumsByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getAlbumsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getAlbumsByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getAlbumsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds albums similar to a given album. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlbumsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getArtistsByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getArtistsByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getArtistsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getArtistsByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public QueryResultBaseItemDto getArtistsByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getArtistsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds albums similar to a given album.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getArtistsByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getArtistsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds albums similar to a given album. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds albums similar to a given album. Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getArtistsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGamesByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public com.squareup.okhttp.Call getGamesByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Games/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getGamesByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getGamesByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getGamesByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public QueryResultBaseItemDto getGamesByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getGamesByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getGamesByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getGamesByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds games similar to a given game. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds games similar to a given game. Documentation</a>
     */
    public com.squareup.okhttp.Call getGamesByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGamesByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdAncestors
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdAncestorsCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Ancestors"
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
    private com.squareup.okhttp.Call getItemsByIdAncestorsValidateBeforeCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdAncestors(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdAncestorsCall(id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public List<BaseItemDto> getItemsByIdAncestors(String id, String userId) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getItemsByIdAncestorsWithHttpInfo(id, userId);
        return resp.getData();
    }

    /**
     * Gets all parents of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getItemsByIdAncestorsWithHttpInfo(String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdAncestorsValidateBeforeCall(id, userId, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all parents of an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all parents of an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdAncestorsAsync(String id, String userId, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdAncestorsValidateBeforeCall(id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdCriticreviews
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdCriticreviewsCall(String id, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/CriticReviews"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));

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
    private com.squareup.okhttp.Call getItemsByIdCriticreviewsValidateBeforeCall(String id, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdCriticreviews(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsCall(id, startIndex, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public QueryResultBaseItemDto getItemsByIdCriticreviews(String id, Integer startIndex, Integer limit) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getItemsByIdCriticreviewsWithHttpInfo(id, startIndex, limit);
        return resp.getData();
    }

    /**
     * Gets critic reviews for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getItemsByIdCriticreviewsWithHttpInfo(String id, Integer startIndex, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsValidateBeforeCall(id, startIndex, limit, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets critic reviews for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets critic reviews for an item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdCriticreviewsAsync(String id, Integer startIndex, Integer limit, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdCriticreviewsValidateBeforeCall(id, startIndex, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdDeleteinfo
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDeleteinfoCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/DeleteInfo"
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
    private com.squareup.okhttp.Call getItemsByIdDeleteinfoValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdDeleteinfo(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return LibraryDeleteInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryDeleteInfo getItemsByIdDeleteinfo(String id) throws ApiException {
        ApiResponse<LibraryDeleteInfo> resp = getItemsByIdDeleteinfoWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets delete info for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;LibraryDeleteInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryDeleteInfo> getItemsByIdDeleteinfoWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<LibraryDeleteInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets delete info for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDeleteinfoAsync(String id, final ApiCallback<LibraryDeleteInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdDeleteinfoValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryDeleteInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdDownload
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDownloadCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Download"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdDownloadValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdDownload(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdDownloadCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Downloads item media
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdDownload(String id) throws ApiException {
        getItemsByIdDownloadWithHttpInfo(id);
    }

    /**
     * Downloads item media
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdDownloadWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdDownloadValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Downloads item media (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdDownloadAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdDownloadValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdFile
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdFileCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/File"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemsByIdFileValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdFileCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdFile(String id) throws ApiException {
        getItemsByIdFileWithHttpInfo(id);
    }

    /**
     * Gets the original file of an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdFileWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdFileValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets the original file of an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdFileAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdFileValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getItemsByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets similar items
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public QueryResultBaseItemDto getItemsByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getItemsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Gets similar items
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getItemsByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets similar items (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets similar items Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThememedia
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThememediaCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeMedia"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getItemsByIdThememediaValidateBeforeCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThememedia(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThememediaCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return AllThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllThemeMediaResult getItemsByIdThememedia(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        ApiResponse<AllThemeMediaResult> resp = getItemsByIdThememediaWithHttpInfo(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);
        return resp.getData();
    }

    /**
     * Gets theme videos and songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;AllThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllThemeMediaResult> getItemsByIdThememediaWithHttpInfo(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThememediaValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, null, null);
        Type localVarReturnType = new TypeToken<AllThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme videos and songs for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThememediaAsync(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ApiCallback<AllThemeMediaResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdThememediaValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThemesongs
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemesongsCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeSongs"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getItemsByIdThemesongsValidateBeforeCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThemesongs(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThemesongsCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThemeMediaResult getItemsByIdThemesongs(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        ApiResponse<ThemeMediaResult> resp = getItemsByIdThemesongsWithHttpInfo(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);
        return resp.getData();
    }

    /**
     * Gets theme songs for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;ThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThemeMediaResult> getItemsByIdThemesongsWithHttpInfo(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThemesongsValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, null, null);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme songs for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemesongsAsync(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ApiCallback<ThemeMediaResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdThemesongsValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdThemevideos
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemevideosCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/ThemeVideos"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (inheritFromParent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("InheritFromParent", inheritFromParent));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getItemsByIdThemevideosValidateBeforeCall(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdThemevideos(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdThemevideosCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ThemeMediaResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThemeMediaResult getItemsByIdThemevideos(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        ApiResponse<ThemeMediaResult> resp = getItemsByIdThemevideosWithHttpInfo(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields);
        return resp.getData();
    }

    /**
     * Gets theme videos for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;ThemeMediaResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThemeMediaResult> getItemsByIdThemevideosWithHttpInfo(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdThemevideosValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, null, null);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets theme videos for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param inheritFromParent Determines whether or not parent items should be searched for theme media. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdThemevideosAsync(String id, String userId, Boolean inheritFromParent, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, String fields, final ApiCallback<ThemeMediaResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdThemevideosValidateBeforeCall(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ThemeMediaResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsCounts
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsCountsCall(String userId, Boolean isFavorite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Counts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));

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
    private com.squareup.okhttp.Call getItemsCountsValidateBeforeCall(String userId, Boolean isFavorite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getItemsCountsCall(userId, isFavorite, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @return ItemCounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemCounts getItemsCounts(String userId, Boolean isFavorite) throws ApiException {
        ApiResponse<ItemCounts> resp = getItemsCountsWithHttpInfo(userId, isFavorite);
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @return ApiResponse&lt;ItemCounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemCounts> getItemsCountsWithHttpInfo(String userId, Boolean isFavorite) throws ApiException {
        com.squareup.okhttp.Call call = getItemsCountsValidateBeforeCall(userId, isFavorite, null, null);
        Type localVarReturnType = new TypeToken<ItemCounts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param userId Optional. Get counts from a specific user&#x27;s library. (optional)
     * @param isFavorite Optional. Get counts of favorite items (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsCountsAsync(String userId, Boolean isFavorite, final ApiCallback<ItemCounts> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsCountsValidateBeforeCall(userId, isFavorite, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemCounts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsIntros
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsIntrosCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Intros";

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
    private com.squareup.okhttp.Call getItemsIntrosValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getItemsIntrosCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return List&lt;PersistenceIntroDebugInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PersistenceIntroDebugInfo> getItemsIntros() throws ApiException {
        ApiResponse<List<PersistenceIntroDebugInfo>> resp = getItemsIntrosWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets info to debug intros
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;PersistenceIntroDebugInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PersistenceIntroDebugInfo>> getItemsIntrosWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getItemsIntrosValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<PersistenceIntroDebugInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets info to debug intros (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsIntrosAsync(final ApiCallback<List<PersistenceIntroDebugInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsIntrosValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PersistenceIntroDebugInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibrariesAvailableoptions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibrariesAvailableoptionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Libraries/AvailableOptions";

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
    private com.squareup.okhttp.Call getLibrariesAvailableoptionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @return LibraryLibraryOptionsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryLibraryOptionsResult getLibrariesAvailableoptions() throws ApiException {
        ApiResponse<LibraryLibraryOptionsResult> resp = getLibrariesAvailableoptionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @return ApiResponse&lt;LibraryLibraryOptionsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryLibraryOptionsResult> getLibrariesAvailableoptionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LibraryLibraryOptionsResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibrariesAvailableoptionsAsync(final ApiCallback<LibraryLibraryOptionsResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLibrariesAvailableoptionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryLibraryOptionsResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibraryMediafolders
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public com.squareup.okhttp.Call getLibraryMediafoldersCall(Boolean isHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/MediaFolders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHidden", isHidden));

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
    private com.squareup.okhttp.Call getLibraryMediafoldersValidateBeforeCall(Boolean isHidden, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibraryMediafoldersCall(isHidden, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public QueryResultBaseItemDto getLibraryMediafolders(Boolean isHidden) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLibraryMediafoldersWithHttpInfo(isHidden);
        return resp.getData();
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLibraryMediafoldersWithHttpInfo(Boolean isHidden) throws ApiException {
        com.squareup.okhttp.Call call = getLibraryMediafoldersValidateBeforeCall(isHidden, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all user media folders. (asynchronously)
     * Requires authentication as user
     * @param isHidden Optional. Filter by folders that are marked hidden, or not. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets all user media folders. Documentation</a>
     */
    public com.squareup.okhttp.Call getLibraryMediafoldersAsync(Boolean isHidden, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLibraryMediafoldersValidateBeforeCall(isHidden, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibraryPhysicalpaths
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibraryPhysicalpathsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/PhysicalPaths";

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
    private com.squareup.okhttp.Call getLibraryPhysicalpathsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibraryPhysicalpathsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> getLibraryPhysicalpaths() throws ApiException {
        ApiResponse<List<String>> resp = getLibraryPhysicalpathsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of physical paths from virtual folders
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> getLibraryPhysicalpathsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibraryPhysicalpathsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of physical paths from virtual folders (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibraryPhysicalpathsAsync(final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLibraryPhysicalpathsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLibrarySelectablemediafolders
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLibrarySelectablemediafoldersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/SelectableMediaFolders";

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
    private com.squareup.okhttp.Call getLibrarySelectablemediafoldersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return List&lt;LibraryMediaFolder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LibraryMediaFolder> getLibrarySelectablemediafolders() throws ApiException {
        ApiResponse<List<LibraryMediaFolder>> resp = getLibrarySelectablemediafoldersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets all user media folders.
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;LibraryMediaFolder&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LibraryMediaFolder>> getLibrarySelectablemediafoldersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<LibraryMediaFolder>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all user media folders. (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLibrarySelectablemediafoldersAsync(final ApiCallback<List<LibraryMediaFolder>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLibrarySelectablemediafoldersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LibraryMediaFolder>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMoviesByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public com.squareup.okhttp.Call getMoviesByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Movies/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getMoviesByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMoviesByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getMoviesByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public QueryResultBaseItemDto getMoviesByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getMoviesByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds movies and trailers similar to a given movie.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getMoviesByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getMoviesByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds movies and trailers similar to a given movie. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given movie. Documentation</a>
     */
    public com.squareup.okhttp.Call getMoviesByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMoviesByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getShowsByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public com.squareup.okhttp.Call getShowsByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Shows/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getShowsByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getShowsByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getShowsByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public QueryResultBaseItemDto getShowsByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getShowsByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds tv shows similar to a given one.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getShowsByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getShowsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds tv shows similar to a given one. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds tv shows similar to a given one. Documentation</a>
     */
    public com.squareup.okhttp.Call getShowsByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShowsByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTrailersByIdSimilar
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public com.squareup.okhttp.Call getTrailersByIdSimilarCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Trailers/{Id}/Similar"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));

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
    private com.squareup.okhttp.Call getTrailersByIdSimilarValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTrailersByIdSimilar(Async)");
        }
        
        com.squareup.okhttp.Call call = getTrailersByIdSimilarCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public QueryResultBaseItemDto getTrailersByIdSimilar(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getTrailersByIdSimilarWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Finds movies and trailers similar to a given trailer.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getTrailersByIdSimilarWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getTrailersByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds movies and trailers similar to a given trailer. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Finds movies and trailers similar to a given trailer. Documentation</a>
     */
    public com.squareup.okhttp.Call getTrailersByIdSimilarAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTrailersByIdSimilarValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdDelete
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Delete"
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
    private com.squareup.okhttp.Call postItemsByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdDelete(String id) throws ApiException {
        postItemsByIdDeleteWithHttpInfo(id);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsDelete
     * @param ids Ids (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsDeleteCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/Delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call postItemsDeleteValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postItemsDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsDeleteCall(ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsDelete(String ids) throws ApiException {
        postItemsDeleteWithHttpInfo(ids);
    }

    /**
     * Deletes an item from the library and file system
     * Requires authentication as user
     * @param ids Ids (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsDeleteWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = postItemsDeleteValidateBeforeCall(ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an item from the library and file system (asynchronously)
     * Requires authentication as user
     * @param ids Ids (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsDeleteAsync(String ids, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsDeleteValidateBeforeCall(ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMediaUpdated
     * @param body PostUpdatedMedia (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMediaUpdatedCall(LibraryPostUpdatedMedia body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Library/Media/Updated";

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
    private com.squareup.okhttp.Call postLibraryMediaUpdatedValidateBeforeCall(LibraryPostUpdatedMedia body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLibraryMediaUpdated(Async)");
        }
        
        com.squareup.okhttp.Call call = postLibraryMediaUpdatedCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMediaUpdated(LibraryPostUpdatedMedia body) throws ApiException {
        postLibraryMediaUpdatedWithHttpInfo(body);
    }

    /**
     * Reports that new movies have been added by an external source
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMediaUpdatedWithHttpInfo(LibraryPostUpdatedMedia body) throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMediaUpdatedValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reports that new movies have been added by an external source (asynchronously)
     * Requires authentication as user
     * @param body PostUpdatedMedia (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMediaUpdatedAsync(LibraryPostUpdatedMedia body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibraryMediaUpdatedValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMoviesAdded
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesAddedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Movies/Added";

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
    private com.squareup.okhttp.Call postLibraryMoviesAddedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryMoviesAddedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMoviesAdded() throws ApiException {
        postLibraryMoviesAddedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMoviesAddedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMoviesAddedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesAddedAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibraryMoviesAddedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryMoviesUpdated
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesUpdatedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Movies/Updated";

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
    private com.squareup.okhttp.Call postLibraryMoviesUpdatedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryMoviesUpdated() throws ApiException {
        postLibraryMoviesUpdatedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryMoviesUpdatedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryMoviesUpdatedAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibraryMoviesUpdatedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibraryRefresh
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibraryRefreshCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Refresh";

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
    private com.squareup.okhttp.Call postLibraryRefreshValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibraryRefreshCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibraryRefresh() throws ApiException {
        postLibraryRefreshWithHttpInfo();
    }

    /**
     * Starts a library scan
     * Requires authentication as administrator
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibraryRefreshWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibraryRefreshValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Starts a library scan (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibraryRefreshAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibraryRefreshValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibrarySeriesAdded
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesAddedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Series/Added";

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
    private com.squareup.okhttp.Call postLibrarySeriesAddedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibrarySeriesAddedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibrarySeriesAdded() throws ApiException {
        postLibrarySeriesAddedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibrarySeriesAddedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibrarySeriesAddedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesAddedAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibrarySeriesAddedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLibrarySeriesUpdated
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesUpdatedCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Library/Series/Updated";

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
    private com.squareup.okhttp.Call postLibrarySeriesUpdatedValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLibrarySeriesUpdated() throws ApiException {
        postLibrarySeriesUpdatedWithHttpInfo();
    }

    /**
     * Deprecated. Use /Library/Media/Updated
     * Requires authentication as user
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLibrarySeriesUpdatedWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Deprecated. Use /Library/Media/Updated (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLibrarySeriesUpdatedAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLibrarySeriesUpdatedValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
