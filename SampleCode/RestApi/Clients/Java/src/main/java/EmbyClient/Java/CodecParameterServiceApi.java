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


import io.swagger.client.model.EditObjectContainer;
import io.swagger.client.model.MediaEncodingCodecParameterContext;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodecParameterServiceApi {
    private ApiClient apiClient;

    public CodecParameterServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CodecParameterServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEncodingCodecparameters
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingCodecparametersCall(String codecId, MediaEncodingCodecParameterContext parameterContext, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/CodecParameters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (codecId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CodecId", codecId));
        if (parameterContext != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParameterContext", parameterContext));

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
    private com.squareup.okhttp.Call getEncodingCodecparametersValidateBeforeCall(String codecId, MediaEncodingCodecParameterContext parameterContext, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'codecId' is set
        if (codecId == null) {
            throw new ApiException("Missing the required parameter 'codecId' when calling getEncodingCodecparameters(Async)");
        }
        // verify the required parameter 'parameterContext' is set
        if (parameterContext == null) {
            throw new ApiException("Missing the required parameter 'parameterContext' when calling getEncodingCodecparameters(Async)");
        }
        
        com.squareup.okhttp.Call call = getEncodingCodecparametersCall(codecId, parameterContext, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the parameters for a specified codec.
     * Requires authentication as user
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @return EditObjectContainer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EditObjectContainer getEncodingCodecparameters(String codecId, MediaEncodingCodecParameterContext parameterContext) throws ApiException {
        ApiResponse<EditObjectContainer> resp = getEncodingCodecparametersWithHttpInfo(codecId, parameterContext);
        return resp.getData();
    }

    /**
     * Gets the parameters for a specified codec.
     * Requires authentication as user
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @return ApiResponse&lt;EditObjectContainer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EditObjectContainer> getEncodingCodecparametersWithHttpInfo(String codecId, MediaEncodingCodecParameterContext parameterContext) throws ApiException {
        com.squareup.okhttp.Call call = getEncodingCodecparametersValidateBeforeCall(codecId, parameterContext, null, null);
        Type localVarReturnType = new TypeToken<EditObjectContainer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the parameters for a specified codec. (asynchronously)
     * Requires authentication as user
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingCodecparametersAsync(String codecId, MediaEncodingCodecParameterContext parameterContext, final ApiCallback<EditObjectContainer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingCodecparametersValidateBeforeCall(codecId, parameterContext, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EditObjectContainer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingCodecparameters
     * @param body Binary stream (required)
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingCodecparametersCall(Object body, String codecId, MediaEncodingCodecParameterContext parameterContext, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/CodecParameters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (codecId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CodecId", codecId));
        if (parameterContext != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParameterContext", parameterContext));

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
    private com.squareup.okhttp.Call postEncodingCodecparametersValidateBeforeCall(Object body, String codecId, MediaEncodingCodecParameterContext parameterContext, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingCodecparameters(Async)");
        }
        // verify the required parameter 'codecId' is set
        if (codecId == null) {
            throw new ApiException("Missing the required parameter 'codecId' when calling postEncodingCodecparameters(Async)");
        }
        // verify the required parameter 'parameterContext' is set
        if (parameterContext == null) {
            throw new ApiException("Missing the required parameter 'parameterContext' when calling postEncodingCodecparameters(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingCodecparametersCall(body, codecId, parameterContext, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates the parameters for a specified codec.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEncodingCodecparameters(Object body, String codecId, MediaEncodingCodecParameterContext parameterContext) throws ApiException {
        postEncodingCodecparametersWithHttpInfo(body, codecId, parameterContext);
    }

    /**
     * Updates the parameters for a specified codec.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEncodingCodecparametersWithHttpInfo(Object body, String codecId, MediaEncodingCodecParameterContext parameterContext) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingCodecparametersValidateBeforeCall(body, codecId, parameterContext, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates the parameters for a specified codec. (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param codecId Codec Id (required)
     * @param parameterContext Parameter Context (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingCodecparametersAsync(Object body, String codecId, MediaEncodingCodecParameterContext parameterContext, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingCodecparametersValidateBeforeCall(body, codecId, parameterContext, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
