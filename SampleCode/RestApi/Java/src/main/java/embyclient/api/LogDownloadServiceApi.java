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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogDownloadServiceApi {
    private ApiClient apiClient;

    public LogDownloadServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogDownloadServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEncodingLogsDownload
     * @param ticket The ticket of the download link (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEncodingLogsDownloadCall(String ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Encoding/Logs/Download";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ticket != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ticket", ticket));

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
    private com.squareup.okhttp.Call getEncodingLogsDownloadValidateBeforeCall(String ticket, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new ApiException("Missing the required parameter 'ticket' when calling getEncodingLogsDownload(Async)");
        }
        
        com.squareup.okhttp.Call call = getEncodingLogsDownloadCall(ticket, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Downloads logs for the ticket of a download link
     * Requires authentication as user
     * @param ticket The ticket of the download link (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getEncodingLogsDownload(String ticket) throws ApiException {
        getEncodingLogsDownloadWithHttpInfo(ticket);
    }

    /**
     * Downloads logs for the ticket of a download link
     * Requires authentication as user
     * @param ticket The ticket of the download link (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getEncodingLogsDownloadWithHttpInfo(String ticket) throws ApiException {
        com.squareup.okhttp.Call call = getEncodingLogsDownloadValidateBeforeCall(ticket, null, null);
        return apiClient.execute(call);
    }

    /**
     * Downloads logs for the ticket of a download link (asynchronously)
     * Requires authentication as user
     * @param ticket The ticket of the download link (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEncodingLogsDownloadAsync(String ticket, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEncodingLogsDownloadValidateBeforeCall(ticket, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
