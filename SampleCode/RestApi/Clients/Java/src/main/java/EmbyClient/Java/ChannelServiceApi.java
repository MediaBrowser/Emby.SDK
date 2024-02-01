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

public class ChannelServiceApi {
    private ApiClient apiClient;

    public ChannelServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChannels
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available channels Documentation</a>
     */
    public com.squareup.okhttp.Call getChannelsCall(String userId, Integer startIndex, String fields, Integer limit, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Channels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
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
    private com.squareup.okhttp.Call getChannelsValidateBeforeCall(String userId, Integer startIndex, String fields, Integer limit, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getChannelsCall(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available channels
     * Requires authentication as user
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available channels Documentation</a>
     */
    public QueryResultBaseItemDto getChannels(String userId, Integer startIndex, String fields, Integer limit, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getChannelsWithHttpInfo(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets available channels
     * Requires authentication as user
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available channels Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getChannelsWithHttpInfo(String userId, Integer startIndex, String fields, Integer limit, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getChannelsValidateBeforeCall(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available channels (asynchronously)
     * Requires authentication as user
     * @param userId User Id (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available channels Documentation</a>
     */
    public com.squareup.okhttp.Call getChannelsAsync(String userId, Integer startIndex, String fields, Integer limit, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelsValidateBeforeCall(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
