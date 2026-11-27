/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import embyclient.ApiCallback;
import embyclient.ApiClient;
import embyclient.ApiException;
import embyclient.ApiResponse;
import embyclient.Configuration;
import embyclient.Pair;
import embyclient.ProgressRequestBody;
import embyclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import embyclient.model.MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageExtractionConfigServiceApi {
    private ApiClient apiClient;

    public ImageExtractionConfigServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageExtractionConfigServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEncodingImageextractiontonemapparameters
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingImageextractiontonemapparametersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/ImageExtractionToneMapParameters";

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
    private com.squareup.okhttp.Call getEncodingImageextractiontonemapparametersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEncodingImageextractiontonemapparametersCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm getEncodingImageextractiontonemapparameters() throws ApiException {
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> resp = getEncodingImageextractiontonemapparametersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return ApiResponse&lt;MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> getEncodingImageextractiontonemapparametersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEncodingImageextractiontonemapparametersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the image-extraction tone-mapping settings (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingImageextractiontonemapparametersAsync(final ApiCallback<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingImageextractiontonemapparametersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingImageextractiontonemapparameters
     * @param body Binary stream (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/ImageExtractionToneMapParameters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersValidateBeforeCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingImageextractiontonemapparameters(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEncodingImageextractiontonemapparameters(Object body) throws ApiException {
        postEncodingImageextractiontonemapparametersWithHttpInfo(body);
    }

    /**
     * Updates the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEncodingImageextractiontonemapparametersWithHttpInfo(Object body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates the image-extraction tone-mapping settings (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersAsync(Object body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postEncodingImageextractiontonemapparametersCommand
     * @param body Binary stream (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersCommandCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/ImageExtractionToneMapParameters/Command";

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
    private com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersCommandValidateBeforeCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingImageextractiontonemapparametersCommand(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersCommandCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Runs an image-extraction settings command
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @return MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm postEncodingImageextractiontonemapparametersCommand(Object body) throws ApiException {
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> resp = postEncodingImageextractiontonemapparametersCommandWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Runs an image-extraction settings command
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @return ApiResponse&lt;MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> postEncodingImageextractiontonemapparametersCommandWithHttpInfo(Object body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersCommandValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Runs an image-extraction settings command (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersCommandAsync(Object body, final ApiCallback<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersCommandValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingImageextractiontonemapparametersSuboptions
     * @param body Binary stream (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersSuboptionsCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/ImageExtractionToneMapParameters/SubOptions";

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
    private com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersSuboptionsValidateBeforeCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingImageextractiontonemapparametersSuboptions(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersSuboptionsCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Closes an image-extraction filter options dialog
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @return MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm postEncodingImageextractiontonemapparametersSuboptions(Object body) throws ApiException {
        ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> resp = postEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Closes an image-extraction filter options dialog
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @return ApiResponse&lt;MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> postEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo(Object body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersSuboptionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Closes an image-extraction filter options dialog (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingImageextractiontonemapparametersSuboptionsAsync(Object body, final ApiCallback<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingImageextractiontonemapparametersSuboptionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
