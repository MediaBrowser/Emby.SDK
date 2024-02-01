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

public class UniversalAudioServiceApi {
    private ApiClient apiClient;

    public UniversalAudioServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UniversalAudioServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAudioByIdUniversal
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdUniversalCall(String id, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/universal"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));

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
    private com.squareup.okhttp.Call getAudioByIdUniversalValidateBeforeCall(String id, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdUniversal(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdUniversalCall(id, deviceId, startTimeTicks, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdUniversal(String id, String deviceId, Long startTimeTicks) throws ApiException {
        getAudioByIdUniversalWithHttpInfo(id, deviceId, startTimeTicks);
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdUniversalWithHttpInfo(String id, String deviceId, Long startTimeTicks) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdUniversalValidateBeforeCall(id, deviceId, startTimeTicks, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdUniversalAsync(String id, String deviceId, Long startTimeTicks, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdUniversalValidateBeforeCall(id, deviceId, startTimeTicks, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAudioByIdUniversalByContainer
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdUniversalByContainerCall(String id, String container, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/universal.{Container}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Container" + "\\}", apiClient.escapeString(container.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));

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
    private com.squareup.okhttp.Call getAudioByIdUniversalByContainerValidateBeforeCall(String id, String container, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdUniversalByContainer(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getAudioByIdUniversalByContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdUniversalByContainerCall(id, container, deviceId, startTimeTicks, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdUniversalByContainer(String id, String container, String deviceId, Long startTimeTicks) throws ApiException {
        getAudioByIdUniversalByContainerWithHttpInfo(id, container, deviceId, startTimeTicks);
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdUniversalByContainerWithHttpInfo(String id, String container, String deviceId, Long startTimeTicks) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdUniversalByContainerValidateBeforeCall(id, container, deviceId, startTimeTicks, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdUniversalByContainerAsync(String id, String container, String deviceId, Long startTimeTicks, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdUniversalByContainerValidateBeforeCall(id, container, deviceId, startTimeTicks, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headAudioByIdUniversal
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdUniversalCall(String id, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/universal"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headAudioByIdUniversalValidateBeforeCall(String id, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headAudioByIdUniversal(Async)");
        }
        
        com.squareup.okhttp.Call call = headAudioByIdUniversalCall(id, deviceId, startTimeTicks, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headAudioByIdUniversal(String id, String deviceId, Long startTimeTicks) throws ApiException {
        headAudioByIdUniversalWithHttpInfo(id, deviceId, startTimeTicks);
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headAudioByIdUniversalWithHttpInfo(String id, String deviceId, Long startTimeTicks) throws ApiException {
        com.squareup.okhttp.Call call = headAudioByIdUniversalValidateBeforeCall(id, deviceId, startTimeTicks, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdUniversalAsync(String id, String deviceId, Long startTimeTicks, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headAudioByIdUniversalValidateBeforeCall(id, deviceId, startTimeTicks, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headAudioByIdUniversalByContainer
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdUniversalByContainerCall(String id, String container, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/universal.{Container}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Container" + "\\}", apiClient.escapeString(container.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headAudioByIdUniversalByContainerValidateBeforeCall(String id, String container, String deviceId, Long startTimeTicks, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headAudioByIdUniversalByContainer(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headAudioByIdUniversalByContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = headAudioByIdUniversalByContainerCall(id, container, deviceId, startTimeTicks, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headAudioByIdUniversalByContainer(String id, String container, String deviceId, Long startTimeTicks) throws ApiException {
        headAudioByIdUniversalByContainerWithHttpInfo(id, container, deviceId, startTimeTicks);
    }

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headAudioByIdUniversalByContainerWithHttpInfo(String id, String container, String deviceId, Long startTimeTicks) throws ApiException {
        com.squareup.okhttp.Call call = headAudioByIdUniversalByContainerValidateBeforeCall(id, container, deviceId, startTimeTicks, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container  (required)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdUniversalByContainerAsync(String id, String container, String deviceId, Long startTimeTicks, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headAudioByIdUniversalByContainerValidateBeforeCall(id, container, deviceId, startTimeTicks, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
