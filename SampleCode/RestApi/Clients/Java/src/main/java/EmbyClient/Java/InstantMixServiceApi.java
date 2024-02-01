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


import io.swagger.client.model.QueryResultBaseItemDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstantMixServiceApi {
    private ApiClient apiClient;

    public InstantMixServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstantMixServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAlbumsByIdInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given album Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdInstantmixCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Albums/{Id}/InstantMix"
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
    private com.squareup.okhttp.Call getAlbumsByIdInstantmixValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAlbumsByIdInstantmix(Async)");
        }
        
        com.squareup.okhttp.Call call = getAlbumsByIdInstantmixCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a given album
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given album Documentation</a>
     */
    public QueryResultBaseItemDto getAlbumsByIdInstantmix(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getAlbumsByIdInstantmixWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a given album
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given album Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getAlbumsByIdInstantmixWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getAlbumsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a given album (asynchronously)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given album Documentation</a>
     */
    public com.squareup.okhttp.Call getAlbumsByIdInstantmixAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlbumsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getArtistsInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given artist Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsInstantmixCall(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/InstantMix";

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
    private com.squareup.okhttp.Call getArtistsInstantmixValidateBeforeCall(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getArtistsInstantmixCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a given artist
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given artist Documentation</a>
     */
    public QueryResultBaseItemDto getArtistsInstantmix(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getArtistsInstantmixWithHttpInfo(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a given artist
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given artist Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getArtistsInstantmixWithHttpInfo(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getArtistsInstantmixValidateBeforeCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a given artist (asynchronously)
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given artist Documentation</a>
     */
    public com.squareup.okhttp.Call getArtistsInstantmixAsync(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getArtistsInstantmixValidateBeforeCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAudiobooksNextup
     * @param userId User Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param albumId Optional. Filter by series id (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a list of next up episodes Documentation</a>
     */
    public com.squareup.okhttp.Call getAudiobooksNextupCall(String userId, Integer startIndex, Integer limit, String fields, String albumId, String parentId, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/AudioBooks/NextUp";

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
        if (albumId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumId", albumId));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
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
    private com.squareup.okhttp.Call getAudiobooksNextupValidateBeforeCall(String userId, Integer startIndex, Integer limit, String fields, String albumId, String parentId, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getAudiobooksNextup(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudiobooksNextupCall(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of next up episodes
     * Requires authentication as user
     * @param userId User Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param albumId Optional. Filter by series id (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a list of next up episodes Documentation</a>
     */
    public QueryResultBaseItemDto getAudiobooksNextup(String userId, Integer startIndex, Integer limit, String fields, String albumId, String parentId, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getAudiobooksNextupWithHttpInfo(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets a list of next up episodes
     * Requires authentication as user
     * @param userId User Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param albumId Optional. Filter by series id (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a list of next up episodes Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getAudiobooksNextupWithHttpInfo(String userId, Integer startIndex, Integer limit, String fields, String albumId, String parentId, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getAudiobooksNextupValidateBeforeCall(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of next up episodes (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param albumId Optional. Filter by series id (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a list of next up episodes Documentation</a>
     */
    public com.squareup.okhttp.Call getAudiobooksNextupAsync(String userId, Integer startIndex, Integer limit, String fields, String albumId, String parentId, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudiobooksNextupValidateBeforeCall(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdInstantmixCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/InstantMix"
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
    private com.squareup.okhttp.Call getItemsByIdInstantmixValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdInstantmix(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdInstantmixCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a given item
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given item Documentation</a>
     */
    public QueryResultBaseItemDto getItemsByIdInstantmix(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getItemsByIdInstantmixWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a given item
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given item Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getItemsByIdInstantmixWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a given item (asynchronously)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given item Documentation</a>
     */
    public com.squareup.okhttp.Call getItemsByIdInstantmixAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMusicgenresByNameInstantmix
     * @param name The genre name (required)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public com.squareup.okhttp.Call getMusicgenresByNameInstantmixCall(String name, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/{Name}/InstantMix"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()));

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
    private com.squareup.okhttp.Call getMusicgenresByNameInstantmixValidateBeforeCall(String name, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMusicgenresByNameInstantmix(Async)");
        }
        
        com.squareup.okhttp.Call call = getMusicgenresByNameInstantmixCall(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a music genre
     * Requires authentication as user
     * @param name The genre name (required)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public QueryResultBaseItemDto getMusicgenresByNameInstantmix(String name, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getMusicgenresByNameInstantmixWithHttpInfo(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a music genre
     * Requires authentication as user
     * @param name The genre name (required)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getMusicgenresByNameInstantmixWithHttpInfo(String name, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getMusicgenresByNameInstantmixValidateBeforeCall(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a music genre (asynchronously)
     * Requires authentication as user
     * @param name The genre name (required)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public com.squareup.okhttp.Call getMusicgenresByNameInstantmixAsync(String name, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMusicgenresByNameInstantmixValidateBeforeCall(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMusicgenresInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public com.squareup.okhttp.Call getMusicgenresInstantmixCall(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/InstantMix";

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
    private com.squareup.okhttp.Call getMusicgenresInstantmixValidateBeforeCall(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getMusicgenresInstantmixCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a music genre
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public QueryResultBaseItemDto getMusicgenresInstantmix(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getMusicgenresInstantmixWithHttpInfo(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a music genre
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getMusicgenresInstantmixWithHttpInfo(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getMusicgenresInstantmixValidateBeforeCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a music genre (asynchronously)
     * Requires authentication as user
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a music genre Documentation</a>
     */
    public com.squareup.okhttp.Call getMusicgenresInstantmixAsync(String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMusicgenresInstantmixValidateBeforeCall(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlaylistsByIdInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given playlist Documentation</a>
     */
    public com.squareup.okhttp.Call getPlaylistsByIdInstantmixCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Playlists/{Id}/InstantMix"
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
    private com.squareup.okhttp.Call getPlaylistsByIdInstantmixValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPlaylistsByIdInstantmix(Async)");
        }
        
        com.squareup.okhttp.Call call = getPlaylistsByIdInstantmixCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a given playlist
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given playlist Documentation</a>
     */
    public QueryResultBaseItemDto getPlaylistsByIdInstantmix(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getPlaylistsByIdInstantmixWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a given playlist
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given playlist Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getPlaylistsByIdInstantmixWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getPlaylistsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a given playlist (asynchronously)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given playlist Documentation</a>
     */
    public com.squareup.okhttp.Call getPlaylistsByIdInstantmixAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlaylistsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSongsByIdInstantmix
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given song Documentation</a>
     */
    public com.squareup.okhttp.Call getSongsByIdInstantmixCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Songs/{Id}/InstantMix"
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
    private com.squareup.okhttp.Call getSongsByIdInstantmixValidateBeforeCall(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSongsByIdInstantmix(Async)");
        }
        
        com.squareup.okhttp.Call call = getSongsByIdInstantmixCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates an instant playlist based on a given song
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given song Documentation</a>
     */
    public QueryResultBaseItemDto getSongsByIdInstantmix(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getSongsByIdInstantmixWithHttpInfo(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields);
        return resp.getData();
    }

    /**
     * Creates an instant playlist based on a given song
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given song Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getSongsByIdInstantmixWithHttpInfo(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getSongsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an instant playlist based on a given song (asynchronously)
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
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Creates an instant playlist based on a given song Documentation</a>
     */
    public com.squareup.okhttp.Call getSongsByIdInstantmixAsync(String id, String includeItemTypes, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String userId, Integer limit, String fields, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSongsByIdInstantmixValidateBeforeCall(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
