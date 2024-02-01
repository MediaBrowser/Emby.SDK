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


import io.swagger.client.model.RecommendationDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesServiceApi {
    private ApiClient apiClient;

    public MoviesServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MoviesServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getMoviesRecommendations
     * @param categoryLimit The max number of categories to return (optional)
     * @param itemLimit The max number of items to return per category (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMoviesRecommendationsCall(Integer categoryLimit, Integer itemLimit, String userId, String parentId, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Movies/Recommendations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (categoryLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CategoryLimit", categoryLimit));
        if (itemLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ItemLimit", itemLimit));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
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
    private com.squareup.okhttp.Call getMoviesRecommendationsValidateBeforeCall(Integer categoryLimit, Integer itemLimit, String userId, String parentId, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getMoviesRecommendationsCall(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets movie recommendations
     * Requires authentication as user
     * @param categoryLimit The max number of categories to return (optional)
     * @param itemLimit The max number of items to return per category (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @return List&lt;RecommendationDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<RecommendationDto> getMoviesRecommendations(Integer categoryLimit, Integer itemLimit, String userId, String parentId, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes) throws ApiException {
        ApiResponse<List<RecommendationDto>> resp = getMoviesRecommendationsWithHttpInfo(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes);
        return resp.getData();
    }

    /**
     * Gets movie recommendations
     * Requires authentication as user
     * @param categoryLimit The max number of categories to return (optional)
     * @param itemLimit The max number of items to return per category (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @return ApiResponse&lt;List&lt;RecommendationDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<RecommendationDto>> getMoviesRecommendationsWithHttpInfo(Integer categoryLimit, Integer itemLimit, String userId, String parentId, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes) throws ApiException {
        com.squareup.okhttp.Call call = getMoviesRecommendationsValidateBeforeCall(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes, null, null);
        Type localVarReturnType = new TypeToken<List<RecommendationDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets movie recommendations (asynchronously)
     * Requires authentication as user
     * @param categoryLimit The max number of categories to return (optional)
     * @param itemLimit The max number of items to return per category (optional)
     * @param userId Optional. Filter by user id, and attach user data (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMoviesRecommendationsAsync(Integer categoryLimit, Integer itemLimit, String userId, String parentId, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, final ApiCallback<List<RecommendationDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMoviesRecommendationsValidateBeforeCall(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<RecommendationDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
