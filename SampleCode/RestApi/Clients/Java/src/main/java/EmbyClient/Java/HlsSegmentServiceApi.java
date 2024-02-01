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

public class HlsSegmentServiceApi {
    private ApiClient apiClient;

    public HlsSegmentServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HlsSegmentServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteVideosActiveencodings
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteVideosActiveencodingsCall(String deviceId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/ActiveEncodings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
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
    private com.squareup.okhttp.Call deleteVideosActiveencodingsValidateBeforeCall(String deviceId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling deleteVideosActiveencodings(Async)");
        }
        // verify the required parameter 'playSessionId' is set
        if (playSessionId == null) {
            throw new ApiException("Missing the required parameter 'playSessionId' when calling deleteVideosActiveencodings(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteVideosActiveencodingsCall(deviceId, playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteVideosActiveencodings(String deviceId, String playSessionId) throws ApiException {
        deleteVideosActiveencodingsWithHttpInfo(deviceId, playSessionId);
    }

    /**
     * 
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteVideosActiveencodingsWithHttpInfo(String deviceId, String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = deleteVideosActiveencodingsValidateBeforeCall(deviceId, playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVideosActiveencodingsAsync(String deviceId, String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVideosActiveencodingsValidateBeforeCall(deviceId, playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postVideosActiveencodingsDelete
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVideosActiveencodingsDeleteCall(String deviceId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/ActiveEncodings/Delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
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
    private com.squareup.okhttp.Call postVideosActiveencodingsDeleteValidateBeforeCall(String deviceId, String playSessionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling postVideosActiveencodingsDelete(Async)");
        }
        // verify the required parameter 'playSessionId' is set
        if (playSessionId == null) {
            throw new ApiException("Missing the required parameter 'playSessionId' when calling postVideosActiveencodingsDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postVideosActiveencodingsDeleteCall(deviceId, playSessionId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postVideosActiveencodingsDelete(String deviceId, String playSessionId) throws ApiException {
        postVideosActiveencodingsDeleteWithHttpInfo(deviceId, playSessionId);
    }

    /**
     * 
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postVideosActiveencodingsDeleteWithHttpInfo(String deviceId, String playSessionId) throws ApiException {
        com.squareup.okhttp.Call call = postVideosActiveencodingsDeleteValidateBeforeCall(deviceId, playSessionId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (required)
     * @param playSessionId The play session id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVideosActiveencodingsDeleteAsync(String deviceId, String playSessionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postVideosActiveencodingsDeleteValidateBeforeCall(deviceId, playSessionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
