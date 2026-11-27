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


import embyclient.model.MediaEncodingSettingsApiHwaCancelHwaNodeOptions;
import embyclient.model.MediaEncodingSettingsApiHwaExecuteHwaConfigCommand;
import embyclient.model.MediaEncodingSettingsApiHwaSaveHwaConfig;
import embyclient.model.MediaEncodingSettingsApiHwaSaveHwaConfigResult;
import embyclient.model.MediaEncodingSettingsApiHwaSelectHwaBasicDevice;
import embyclient.model.MediaEncodingSettingsHwaEditingNodeOptionsForm;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType;
import embyclient.model.MediaEncodingSettingsHwaProjectionHwaConfigView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HwaConfigServiceApi {
    private ApiClient apiClient;

    public HwaConfigServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HwaConfigServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEncodingHwaconfig
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwaconfigCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaConfig";

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
    private com.squareup.okhttp.Call getEncodingHwaconfigValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEncodingHwaconfigCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the transcoding configuration graph
     * Requires authentication as administrator
     * @return MediaEncodingSettingsHwaProjectionHwaConfigView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaProjectionHwaConfigView getEncodingHwaconfig() throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> resp = getEncodingHwaconfigWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets the transcoding configuration graph
     * Requires authentication as administrator
     * @return ApiResponse&lt;MediaEncodingSettingsHwaProjectionHwaConfigView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> getEncodingHwaconfigWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEncodingHwaconfigValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the transcoding configuration graph (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwaconfigAsync(final ApiCallback<MediaEncodingSettingsHwaProjectionHwaConfigView> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingHwaconfigValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEncodingHwaconfighaschanges
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwaconfighaschangesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaConfigHasChanges";

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
    private com.squareup.okhttp.Call getEncodingHwaconfighaschangesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEncodingHwaconfighaschangesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets whether the active configuration has unsaved changes
     * Requires authentication as administrator
     * @return Boolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Boolean getEncodingHwaconfighaschanges() throws ApiException {
        ApiResponse<Boolean> resp = getEncodingHwaconfighaschangesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets whether the active configuration has unsaved changes
     * Requires authentication as administrator
     * @return ApiResponse&lt;Boolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Boolean> getEncodingHwaconfighaschangesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEncodingHwaconfighaschangesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets whether the active configuration has unsaved changes (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwaconfighaschangesAsync(final ApiCallback<Boolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingHwaconfighaschangesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Boolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEncodingHwanodeoptions
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms is wanted (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwanodeoptionsCall(String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaNodeOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NodeId", nodeId));
        if (editorType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EditorType", editorType));

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
    private com.squareup.okhttp.Call getEncodingHwanodeoptionsValidateBeforeCall(String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling getEncodingHwanodeoptions(Async)");
        }
        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling getEncodingHwanodeoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = getEncodingHwanodeoptionsCall(nodeId, editorType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an options form for a graph node
     * Requires authentication as administrator
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms is wanted (required)
     * @return MediaEncodingSettingsHwaEditingNodeOptionsForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaEditingNodeOptionsForm getEncodingHwanodeoptions(String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> resp = getEncodingHwanodeoptionsWithHttpInfo(nodeId, editorType);
        return resp.getData();
    }

    /**
     * Gets an options form for a graph node
     * Requires authentication as administrator
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms is wanted (required)
     * @return ApiResponse&lt;MediaEncodingSettingsHwaEditingNodeOptionsForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> getEncodingHwanodeoptionsWithHttpInfo(String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) throws ApiException {
        com.squareup.okhttp.Call call = getEncodingHwanodeoptionsValidateBeforeCall(nodeId, editorType, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets an options form for a graph node (asynchronously)
     * Requires authentication as administrator
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms is wanted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingHwanodeoptionsAsync(String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ApiCallback<MediaEncodingSettingsHwaEditingNodeOptionsForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingHwanodeoptionsValidateBeforeCall(nodeId, editorType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwabasicdevice
     * @param body SelectHwaBasicDevice (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwabasicdeviceCall(MediaEncodingSettingsApiHwaSelectHwaBasicDevice body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaBasicDevice";

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
    private com.squareup.okhttp.Call postEncodingHwabasicdeviceValidateBeforeCall(MediaEncodingSettingsApiHwaSelectHwaBasicDevice body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwabasicdevice(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwabasicdeviceCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Chooses the device Basic mode uses
     * Requires authentication as administrator
     * @param body SelectHwaBasicDevice (required)
     * @return MediaEncodingSettingsHwaProjectionHwaConfigView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaProjectionHwaConfigView postEncodingHwabasicdevice(MediaEncodingSettingsApiHwaSelectHwaBasicDevice body) throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> resp = postEncodingHwabasicdeviceWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Chooses the device Basic mode uses
     * Requires authentication as administrator
     * @param body SelectHwaBasicDevice (required)
     * @return ApiResponse&lt;MediaEncodingSettingsHwaProjectionHwaConfigView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> postEncodingHwabasicdeviceWithHttpInfo(MediaEncodingSettingsApiHwaSelectHwaBasicDevice body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwabasicdeviceValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Chooses the device Basic mode uses (asynchronously)
     * Requires authentication as administrator
     * @param body SelectHwaBasicDevice (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwabasicdeviceAsync(MediaEncodingSettingsApiHwaSelectHwaBasicDevice body, final ApiCallback<MediaEncodingSettingsHwaProjectionHwaConfigView> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwabasicdeviceValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwaconfigcommand
     * @param body ExecuteHwaConfigCommand (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigcommandCall(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaConfigCommand";

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
    private com.squareup.okhttp.Call postEncodingHwaconfigcommandValidateBeforeCall(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwaconfigcommand(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwaconfigcommandCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Runs a command against the transcoding configuration graph
     * Requires authentication as administrator
     * @param body ExecuteHwaConfigCommand (required)
     * @return MediaEncodingSettingsHwaProjectionHwaConfigView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaProjectionHwaConfigView postEncodingHwaconfigcommand(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body) throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> resp = postEncodingHwaconfigcommandWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Runs a command against the transcoding configuration graph
     * Requires authentication as administrator
     * @param body ExecuteHwaConfigCommand (required)
     * @return ApiResponse&lt;MediaEncodingSettingsHwaProjectionHwaConfigView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> postEncodingHwaconfigcommandWithHttpInfo(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwaconfigcommandValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Runs a command against the transcoding configuration graph (asynchronously)
     * Requires authentication as administrator
     * @param body ExecuteHwaConfigCommand (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigcommandAsync(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body, final ApiCallback<MediaEncodingSettingsHwaProjectionHwaConfigView> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwaconfigcommandValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwaconfigdiscardchanges
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigdiscardchangesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaConfigDiscardChanges";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postEncodingHwaconfigdiscardchangesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postEncodingHwaconfigdiscardchangesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Discards the in-progress edit and reloads the active transcoding configuration
     * Requires authentication as administrator
     * @return MediaEncodingSettingsHwaProjectionHwaConfigView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaProjectionHwaConfigView postEncodingHwaconfigdiscardchanges() throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> resp = postEncodingHwaconfigdiscardchangesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Discards the in-progress edit and reloads the active transcoding configuration
     * Requires authentication as administrator
     * @return ApiResponse&lt;MediaEncodingSettingsHwaProjectionHwaConfigView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaProjectionHwaConfigView> postEncodingHwaconfigdiscardchangesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwaconfigdiscardchangesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Discards the in-progress edit and reloads the active transcoding configuration (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigdiscardchangesAsync(final ApiCallback<MediaEncodingSettingsHwaProjectionHwaConfigView> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwaconfigdiscardchangesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaProjectionHwaConfigView>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwaconfigsave
     * @param body SaveHwaConfig (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigsaveCall(MediaEncodingSettingsApiHwaSaveHwaConfig body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaConfigSave";

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
    private com.squareup.okhttp.Call postEncodingHwaconfigsaveValidateBeforeCall(MediaEncodingSettingsApiHwaSaveHwaConfig body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwaconfigsave(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwaconfigsaveCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Saves the transcoding configuration
     * Requires authentication as administrator
     * @param body SaveHwaConfig (required)
     * @return MediaEncodingSettingsApiHwaSaveHwaConfigResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsApiHwaSaveHwaConfigResult postEncodingHwaconfigsave(MediaEncodingSettingsApiHwaSaveHwaConfig body) throws ApiException {
        ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult> resp = postEncodingHwaconfigsaveWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Saves the transcoding configuration
     * Requires authentication as administrator
     * @param body SaveHwaConfig (required)
     * @return ApiResponse&lt;MediaEncodingSettingsApiHwaSaveHwaConfigResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsApiHwaSaveHwaConfigResult> postEncodingHwaconfigsaveWithHttpInfo(MediaEncodingSettingsApiHwaSaveHwaConfig body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwaconfigsaveValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsApiHwaSaveHwaConfigResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Saves the transcoding configuration (asynchronously)
     * Requires authentication as administrator
     * @param body SaveHwaConfig (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwaconfigsaveAsync(MediaEncodingSettingsApiHwaSaveHwaConfig body, final ApiCallback<MediaEncodingSettingsApiHwaSaveHwaConfigResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwaconfigsaveValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsApiHwaSaveHwaConfigResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwanodeoptions
     * @param body Binary stream (required)
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms was edited (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionsCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaNodeOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NodeId", nodeId));
        if (editorType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EditorType", editorType));

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
    private com.squareup.okhttp.Call postEncodingHwanodeoptionsValidateBeforeCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwanodeoptions(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling postEncodingHwanodeoptions(Async)");
        }
        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling postEncodingHwanodeoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionsCall(body, nodeId, editorType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Stores an options form for a graph node
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms was edited (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEncodingHwanodeoptions(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) throws ApiException {
        postEncodingHwanodeoptionsWithHttpInfo(body, nodeId, editorType);
    }

    /**
     * Stores an options form for a graph node
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms was edited (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEncodingHwanodeoptionsWithHttpInfo(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionsValidateBeforeCall(body, nodeId, editorType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Stores an options form for a graph node (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node (required)
     * @param editorType Which of the node&#x27;s forms was edited (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionsAsync(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwanodeoptionsValidateBeforeCall(body, nodeId, editorType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwanodeoptionscancel
     * @param body CancelHwaNodeOptions (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionscancelCall(MediaEncodingSettingsApiHwaCancelHwaNodeOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaNodeOptionsCancel";

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
    private com.squareup.okhttp.Call postEncodingHwanodeoptionscancelValidateBeforeCall(MediaEncodingSettingsApiHwaCancelHwaNodeOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwanodeoptionscancel(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscancelCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Discards an open options form
     * Requires authentication as administrator
     * @param body CancelHwaNodeOptions (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEncodingHwanodeoptionscancel(MediaEncodingSettingsApiHwaCancelHwaNodeOptions body) throws ApiException {
        postEncodingHwanodeoptionscancelWithHttpInfo(body);
    }

    /**
     * Discards an open options form
     * Requires authentication as administrator
     * @param body CancelHwaNodeOptions (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEncodingHwanodeoptionscancelWithHttpInfo(MediaEncodingSettingsApiHwaCancelHwaNodeOptions body) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscancelValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Discards an open options form (asynchronously)
     * Requires authentication as administrator
     * @param body CancelHwaNodeOptions (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionscancelAsync(MediaEncodingSettingsApiHwaCancelHwaNodeOptions body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscancelValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwanodeoptionscommand
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms is open (required)
     * @param commandId The postback command (required)
     * @param itemId The item the command came from (optional)
     * @param data The command&#x27;s value (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionscommandCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, String commandId, String itemId, String data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaNodeOptionsCommand";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NodeId", nodeId));
        if (editorType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EditorType", editorType));
        if (commandId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CommandId", commandId));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ItemId", itemId));
        if (data != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Data", data));

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
    private com.squareup.okhttp.Call postEncodingHwanodeoptionscommandValidateBeforeCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, String commandId, String itemId, String data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwanodeoptionscommand(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling postEncodingHwanodeoptionscommand(Async)");
        }
        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling postEncodingHwanodeoptionscommand(Async)");
        }
        // verify the required parameter 'commandId' is set
        if (commandId == null) {
            throw new ApiException("Missing the required parameter 'commandId' when calling postEncodingHwanodeoptionscommand(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscommandCall(body, nodeId, editorType, commandId, itemId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Runs a postback within an open options form
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms is open (required)
     * @param commandId The postback command (required)
     * @param itemId The item the command came from (optional)
     * @param data The command&#x27;s value (optional)
     * @return MediaEncodingSettingsHwaEditingNodeOptionsForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaEditingNodeOptionsForm postEncodingHwanodeoptionscommand(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, String commandId, String itemId, String data) throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> resp = postEncodingHwanodeoptionscommandWithHttpInfo(body, nodeId, editorType, commandId, itemId, data);
        return resp.getData();
    }

    /**
     * Runs a postback within an open options form
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms is open (required)
     * @param commandId The postback command (required)
     * @param itemId The item the command came from (optional)
     * @param data The command&#x27;s value (optional)
     * @return ApiResponse&lt;MediaEncodingSettingsHwaEditingNodeOptionsForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> postEncodingHwanodeoptionscommandWithHttpInfo(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, String commandId, String itemId, String data) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscommandValidateBeforeCall(body, nodeId, editorType, commandId, itemId, data, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Runs a postback within an open options form (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms is open (required)
     * @param commandId The postback command (required)
     * @param itemId The item the command came from (optional)
     * @param data The command&#x27;s value (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodeoptionscommandAsync(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, String commandId, String itemId, String data, final ApiCallback<MediaEncodingSettingsHwaEditingNodeOptionsForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwanodeoptionscommandValidateBeforeCall(body, nodeId, editorType, commandId, itemId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postEncodingHwanodesuboptions
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms it was opened from (required)
     * @param isAccepted Whether to keep what the form holds (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodesuboptionsCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, Boolean isAccepted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Encoding/HwaNodeSubOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NodeId", nodeId));
        if (editorType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EditorType", editorType));
        if (isAccepted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsAccepted", isAccepted));

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
    private com.squareup.okhttp.Call postEncodingHwanodesuboptionsValidateBeforeCall(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, Boolean isAccepted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postEncodingHwanodesuboptions(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling postEncodingHwanodesuboptions(Async)");
        }
        // verify the required parameter 'editorType' is set
        if (editorType == null) {
            throw new ApiException("Missing the required parameter 'editorType' when calling postEncodingHwanodesuboptions(Async)");
        }
        
        com.squareup.okhttp.Call call = postEncodingHwanodesuboptionsCall(body, nodeId, editorType, isAccepted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Closes a form opened from within another one
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms it was opened from (required)
     * @param isAccepted Whether to keep what the form holds (optional)
     * @return MediaEncodingSettingsHwaEditingNodeOptionsForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MediaEncodingSettingsHwaEditingNodeOptionsForm postEncodingHwanodesuboptions(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, Boolean isAccepted) throws ApiException {
        ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> resp = postEncodingHwanodesuboptionsWithHttpInfo(body, nodeId, editorType, isAccepted);
        return resp.getData();
    }

    /**
     * Closes a form opened from within another one
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms it was opened from (required)
     * @param isAccepted Whether to keep what the form holds (optional)
     * @return ApiResponse&lt;MediaEncodingSettingsHwaEditingNodeOptionsForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MediaEncodingSettingsHwaEditingNodeOptionsForm> postEncodingHwanodesuboptionsWithHttpInfo(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, Boolean isAccepted) throws ApiException {
        com.squareup.okhttp.Call call = postEncodingHwanodesuboptionsValidateBeforeCall(body, nodeId, editorType, isAccepted, null, null);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Closes a form opened from within another one (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param nodeId Id of the node being edited (required)
     * @param editorType Which of the node&#x27;s forms it was opened from (required)
     * @param isAccepted Whether to keep what the form holds (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEncodingHwanodesuboptionsAsync(Object body, String nodeId, MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType, Boolean isAccepted, final ApiCallback<MediaEncodingSettingsHwaEditingNodeOptionsForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEncodingHwanodesuboptionsValidateBeforeCall(body, nodeId, editorType, isAccepted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MediaEncodingSettingsHwaEditingNodeOptionsForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
