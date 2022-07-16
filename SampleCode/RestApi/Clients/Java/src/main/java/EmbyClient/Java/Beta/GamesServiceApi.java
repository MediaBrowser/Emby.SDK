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


import io.swagger.client.model.GameSystemSummary;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GamesServiceApi {
    private ApiClient apiClient;

    public GamesServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GamesServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGamesSystemsummaries
     * @param userId Optional. Filter by user id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGamesSystemsummariesCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Games/SystemSummaries";

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
    private com.squareup.okhttp.Call getGamesSystemsummariesValidateBeforeCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getGamesSystemsummariesCall(userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param userId Optional. Filter by user id (optional)
     * @return List&lt;GameSystemSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GameSystemSummary> getGamesSystemsummaries(String userId) throws ApiException {
        ApiResponse<List<GameSystemSummary>> resp = getGamesSystemsummariesWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param userId Optional. Filter by user id (optional)
     * @return ApiResponse&lt;List&lt;GameSystemSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GameSystemSummary>> getGamesSystemsummariesWithHttpInfo(String userId) throws ApiException {
        com.squareup.okhttp.Call call = getGamesSystemsummariesValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<List<GameSystemSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds games similar to a given game. (asynchronously)
     * Requires authentication as user
     * @param userId Optional. Filter by user id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGamesSystemsummariesAsync(String userId, final ApiCallback<List<GameSystemSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGamesSystemsummariesValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GameSystemSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
