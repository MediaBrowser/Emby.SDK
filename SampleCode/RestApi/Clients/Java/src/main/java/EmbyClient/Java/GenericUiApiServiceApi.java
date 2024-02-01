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


import io.swagger.client.model.RunUICommand;
import io.swagger.client.model.UIViewInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericUiApiServiceApi {
    private ApiClient apiClient;

    public GenericUiApiServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenericUiApiServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUIView
     * @param pageId Id of the page controller (required)
     * @param clientLocale Locale identifier of the client (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUIViewCall(String pageId, String clientLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/UI/View";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PageId", pageId));
        if (clientLocale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ClientLocale", clientLocale));

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
    private com.squareup.okhttp.Call getUIViewValidateBeforeCall(String pageId, String clientLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling getUIView(Async)");
        }
        // verify the required parameter 'clientLocale' is set
        if (clientLocale == null) {
            throw new ApiException("Missing the required parameter 'clientLocale' when calling getUIView(Async)");
        }
        
        com.squareup.okhttp.Call call = getUIViewCall(pageId, clientLocale, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets UI view data
     * Requires authentication as user
     * @param pageId Id of the page controller (required)
     * @param clientLocale Locale identifier of the client (required)
     * @return UIViewInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UIViewInfo getUIView(String pageId, String clientLocale) throws ApiException {
        ApiResponse<UIViewInfo> resp = getUIViewWithHttpInfo(pageId, clientLocale);
        return resp.getData();
    }

    /**
     * Gets UI view data
     * Requires authentication as user
     * @param pageId Id of the page controller (required)
     * @param clientLocale Locale identifier of the client (required)
     * @return ApiResponse&lt;UIViewInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UIViewInfo> getUIViewWithHttpInfo(String pageId, String clientLocale) throws ApiException {
        com.squareup.okhttp.Call call = getUIViewValidateBeforeCall(pageId, clientLocale, null, null);
        Type localVarReturnType = new TypeToken<UIViewInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets UI view data (asynchronously)
     * Requires authentication as user
     * @param pageId Id of the page controller (required)
     * @param clientLocale Locale identifier of the client (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUIViewAsync(String pageId, String clientLocale, final ApiCallback<UIViewInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUIViewValidateBeforeCall(pageId, clientLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UIViewInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUICommand
     * @param body RunUICommand (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUICommandCall(RunUICommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/UI/Command";

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
    private com.squareup.okhttp.Call postUICommandValidateBeforeCall(RunUICommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUICommand(Async)");
        }
        
        com.squareup.okhttp.Call call = postUICommandCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Execute a command in the context of tv setup
     * Requires authentication as user
     * @param body RunUICommand (required)
     * @return UIViewInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UIViewInfo postUICommand(RunUICommand body) throws ApiException {
        ApiResponse<UIViewInfo> resp = postUICommandWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Execute a command in the context of tv setup
     * Requires authentication as user
     * @param body RunUICommand (required)
     * @return ApiResponse&lt;UIViewInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UIViewInfo> postUICommandWithHttpInfo(RunUICommand body) throws ApiException {
        com.squareup.okhttp.Call call = postUICommandValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UIViewInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute a command in the context of tv setup (asynchronously)
     * Requires authentication as user
     * @param body RunUICommand (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUICommandAsync(RunUICommand body, final ApiCallback<UIViewInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUICommandValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UIViewInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
