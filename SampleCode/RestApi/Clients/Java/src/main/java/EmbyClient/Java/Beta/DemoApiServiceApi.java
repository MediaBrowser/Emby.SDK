/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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


import io.swagger.client.model.EmbyPluginGenericEditDemoDataDemoTypeInfo;
import io.swagger.client.model.EmbyWebGenericEditEditObjectContainer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoApiServiceApi {
    private ApiClient apiClient;

    public DemoApiServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DemoApiServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGenericeditdemoDemo
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGenericeditdemoDemoCall(Integer demoSet, Integer demoType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GenericEditDemo/Demo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (demoSet != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DemoSet", demoSet));
        if (demoType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DemoType", demoType));

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
    private com.squareup.okhttp.Call getGenericeditdemoDemoValidateBeforeCall(Integer demoSet, Integer demoType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'demoSet' is set
        if (demoSet == null) {
            throw new ApiException("Missing the required parameter 'demoSet' when calling getGenericeditdemoDemo(Async)");
        }
        // verify the required parameter 'demoType' is set
        if (demoType == null) {
            throw new ApiException("Missing the required parameter 'demoType' when calling getGenericeditdemoDemo(Async)");
        }
        
        com.squareup.okhttp.Call call = getGenericeditdemoDemoCall(demoSet, demoType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets GenericEdit demo data
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @return EmbyWebGenericEditEditObjectContainer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbyWebGenericEditEditObjectContainer getGenericeditdemoDemo(Integer demoSet, Integer demoType) throws ApiException {
        ApiResponse<EmbyWebGenericEditEditObjectContainer> resp = getGenericeditdemoDemoWithHttpInfo(demoSet, demoType);
        return resp.getData();
    }

    /**
     * Gets GenericEdit demo data
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @return ApiResponse&lt;EmbyWebGenericEditEditObjectContainer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbyWebGenericEditEditObjectContainer> getGenericeditdemoDemoWithHttpInfo(Integer demoSet, Integer demoType) throws ApiException {
        com.squareup.okhttp.Call call = getGenericeditdemoDemoValidateBeforeCall(demoSet, demoType, null, null);
        Type localVarReturnType = new TypeToken<EmbyWebGenericEditEditObjectContainer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets GenericEdit demo data (asynchronously)
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGenericeditdemoDemoAsync(Integer demoSet, Integer demoType, final ApiCallback<EmbyWebGenericEditEditObjectContainer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenericeditdemoDemoValidateBeforeCall(demoSet, demoType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbyWebGenericEditEditObjectContainer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGenericeditdemoDemotypes
     * @param demoSet Set of demos (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGenericeditdemoDemotypesCall(Integer demoSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GenericEditDemo/DemoTypes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (demoSet != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DemoSet", demoSet));

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
    private com.squareup.okhttp.Call getGenericeditdemoDemotypesValidateBeforeCall(Integer demoSet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'demoSet' is set
        if (demoSet == null) {
            throw new ApiException("Missing the required parameter 'demoSet' when calling getGenericeditdemoDemotypes(Async)");
        }
        
        com.squareup.okhttp.Call call = getGenericeditdemoDemotypesCall(demoSet, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of demos
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @return List&lt;EmbyPluginGenericEditDemoDataDemoTypeInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EmbyPluginGenericEditDemoDataDemoTypeInfo> getGenericeditdemoDemotypes(Integer demoSet) throws ApiException {
        ApiResponse<List<EmbyPluginGenericEditDemoDataDemoTypeInfo>> resp = getGenericeditdemoDemotypesWithHttpInfo(demoSet);
        return resp.getData();
    }

    /**
     * Gets a list of demos
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @return ApiResponse&lt;List&lt;EmbyPluginGenericEditDemoDataDemoTypeInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EmbyPluginGenericEditDemoDataDemoTypeInfo>> getGenericeditdemoDemotypesWithHttpInfo(Integer demoSet) throws ApiException {
        com.squareup.okhttp.Call call = getGenericeditdemoDemotypesValidateBeforeCall(demoSet, null, null);
        Type localVarReturnType = new TypeToken<List<EmbyPluginGenericEditDemoDataDemoTypeInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of demos (asynchronously)
     * Requires authentication as administrator
     * @param demoSet Set of demos (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGenericeditdemoDemotypesAsync(Integer demoSet, final ApiCallback<List<EmbyPluginGenericEditDemoDataDemoTypeInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenericeditdemoDemotypesValidateBeforeCall(demoSet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EmbyPluginGenericEditDemoDataDemoTypeInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postGenericeditdemoDemo
     * @param body Binary stream (required)
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postGenericeditdemoDemoCall(Object body, Integer demoSet, Integer demoType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/GenericEditDemo/Demo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (demoSet != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DemoSet", demoSet));
        if (demoType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DemoType", demoType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream"
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
    private com.squareup.okhttp.Call postGenericeditdemoDemoValidateBeforeCall(Object body, Integer demoSet, Integer demoType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postGenericeditdemoDemo(Async)");
        }
        // verify the required parameter 'demoSet' is set
        if (demoSet == null) {
            throw new ApiException("Missing the required parameter 'demoSet' when calling postGenericeditdemoDemo(Async)");
        }
        // verify the required parameter 'demoType' is set
        if (demoType == null) {
            throw new ApiException("Missing the required parameter 'demoType' when calling postGenericeditdemoDemo(Async)");
        }
        
        com.squareup.okhttp.Call call = postGenericeditdemoDemoCall(body, demoSet, demoType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates GenericEdit demo data
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postGenericeditdemoDemo(Object body, Integer demoSet, Integer demoType) throws ApiException {
        postGenericeditdemoDemoWithHttpInfo(body, demoSet, demoType);
    }

    /**
     * Updates GenericEdit demo data
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postGenericeditdemoDemoWithHttpInfo(Object body, Integer demoSet, Integer demoType) throws ApiException {
        com.squareup.okhttp.Call call = postGenericeditdemoDemoValidateBeforeCall(body, demoSet, demoType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates GenericEdit demo data (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param demoSet Set of demos (required)
     * @param demoType Type of demo object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postGenericeditdemoDemoAsync(Object body, Integer demoSet, Integer demoType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postGenericeditdemoDemoValidateBeforeCall(body, demoSet, demoType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
