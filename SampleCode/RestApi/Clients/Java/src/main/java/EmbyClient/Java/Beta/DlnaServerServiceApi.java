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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DlnaServerServiceApi {
    private ApiClient apiClient;

    public DlnaServerServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DlnaServerServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDlnaByUuidConnectionmanagerConnectionmanager
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidConnectionmanagerConnectionmanager(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidConnectionmanagerConnectionmanager(String uuId) throws ApiException {
        getDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo(uuId);
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna connection manager xml (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidConnectionmanagerConnectionmanagerXml
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerXmlCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/connectionmanager/connectionmanager.xml"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerXmlValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidConnectionmanagerConnectionmanagerXml(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerXmlCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidConnectionmanagerConnectionmanagerXml(String uuId) throws ApiException {
        getDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo(uuId);
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerXmlValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna connection manager xml (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidConnectionmanagerConnectionmanagerXmlAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidConnectionmanagerConnectionmanagerXmlValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidContentdirectoryContentdirectory
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidContentdirectoryContentdirectory(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidContentdirectoryContentdirectory(String uuId) throws ApiException {
        getDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo(uuId);
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna content directory xml (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidContentdirectoryContentdirectoryXml
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryXmlCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/contentdirectory/contentdirectory.xml"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryXmlValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidContentdirectoryContentdirectoryXml(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryXmlCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidContentdirectoryContentdirectoryXml(String uuId) throws ApiException {
        getDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo(uuId);
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryXmlValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna content directory xml (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidContentdirectoryContentdirectoryXmlAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidContentdirectoryContentdirectoryXmlValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidDescription
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidDescriptionCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/description"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidDescriptionValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidDescription(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidDescription(String uuId) throws ApiException {
        getDlnaByUuidDescriptionWithHttpInfo(uuId);
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidDescriptionWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna server info (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidDescriptionAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidDescriptionXml
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidDescriptionXmlCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/description.xml"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidDescriptionXmlValidateBeforeCall(String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidDescriptionXml(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionXmlCall(uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidDescriptionXml(String uuId) throws ApiException {
        getDlnaByUuidDescriptionXmlWithHttpInfo(uuId);
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidDescriptionXmlWithHttpInfo(String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionXmlValidateBeforeCall(uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets dlna server info (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidDescriptionXmlAsync(String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidDescriptionXmlValidateBeforeCall(uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaByUuidIconsByFilename
     * @param uuId Server UuId (required)
     * @param filename The icon filename (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidIconsByFilenameCall(String uuId, String filename, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/icons/{Filename}"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()))
            .replaceAll("\\{" + "Filename" + "\\}", apiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaByUuidIconsByFilenameValidateBeforeCall(String uuId, String filename, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling getDlnaByUuidIconsByFilename(Async)");
        }
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling getDlnaByUuidIconsByFilename(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaByUuidIconsByFilenameCall(uuId, filename, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a server icon
     * No authentication required
     * @param uuId Server UuId (required)
     * @param filename The icon filename (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaByUuidIconsByFilename(String uuId, String filename) throws ApiException {
        getDlnaByUuidIconsByFilenameWithHttpInfo(uuId, filename);
    }

    /**
     * Gets a server icon
     * No authentication required
     * @param uuId Server UuId (required)
     * @param filename The icon filename (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaByUuidIconsByFilenameWithHttpInfo(String uuId, String filename) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaByUuidIconsByFilenameValidateBeforeCall(uuId, filename, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a server icon (asynchronously)
     * No authentication required
     * @param uuId Server UuId (required)
     * @param filename The icon filename (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaByUuidIconsByFilenameAsync(String uuId, String filename, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaByUuidIconsByFilenameValidateBeforeCall(uuId, filename, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDlnaIconsByFilename
     * @param filename The icon filename (required)
     * @param uuId Server UuId (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDlnaIconsByFilenameCall(String filename, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Dlna/icons/{Filename}"
            .replaceAll("\\{" + "Filename" + "\\}", apiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (uuId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UuId", uuId));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDlnaIconsByFilenameValidateBeforeCall(String filename, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling getDlnaIconsByFilename(Async)");
        }
        
        com.squareup.okhttp.Call call = getDlnaIconsByFilenameCall(filename, uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a server icon
     * No authentication required
     * @param filename The icon filename (required)
     * @param uuId Server UuId (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDlnaIconsByFilename(String filename, String uuId) throws ApiException {
        getDlnaIconsByFilenameWithHttpInfo(filename, uuId);
    }

    /**
     * Gets a server icon
     * No authentication required
     * @param filename The icon filename (required)
     * @param uuId Server UuId (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDlnaIconsByFilenameWithHttpInfo(String filename, String uuId) throws ApiException {
        com.squareup.okhttp.Call call = getDlnaIconsByFilenameValidateBeforeCall(filename, uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a server icon (asynchronously)
     * No authentication required
     * @param filename The icon filename (required)
     * @param uuId Server UuId (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDlnaIconsByFilenameAsync(String filename, String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDlnaIconsByFilenameValidateBeforeCall(filename, uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postDlnaByUuidConnectionmanagerControl
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDlnaByUuidConnectionmanagerControlCall(Object body, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/connectionmanager/control"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDlnaByUuidConnectionmanagerControlValidateBeforeCall(Object body, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postDlnaByUuidConnectionmanagerControl(Async)");
        }
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling postDlnaByUuidConnectionmanagerControl(Async)");
        }
        
        com.squareup.okhttp.Call call = postDlnaByUuidConnectionmanagerControlCall(body, uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Processes a control request
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postDlnaByUuidConnectionmanagerControl(Object body, String uuId) throws ApiException {
        postDlnaByUuidConnectionmanagerControlWithHttpInfo(body, uuId);
    }

    /**
     * Processes a control request
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postDlnaByUuidConnectionmanagerControlWithHttpInfo(Object body, String uuId) throws ApiException {
        com.squareup.okhttp.Call call = postDlnaByUuidConnectionmanagerControlValidateBeforeCall(body, uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Processes a control request (asynchronously)
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDlnaByUuidConnectionmanagerControlAsync(Object body, String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDlnaByUuidConnectionmanagerControlValidateBeforeCall(body, uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postDlnaByUuidContentdirectoryControl
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDlnaByUuidContentdirectoryControlCall(Object body, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Dlna/{UuId}/contentdirectory/control"
            .replaceAll("\\{" + "UuId" + "\\}", apiClient.escapeString(uuId.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postDlnaByUuidContentdirectoryControlValidateBeforeCall(Object body, String uuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postDlnaByUuidContentdirectoryControl(Async)");
        }
        // verify the required parameter 'uuId' is set
        if (uuId == null) {
            throw new ApiException("Missing the required parameter 'uuId' when calling postDlnaByUuidContentdirectoryControl(Async)");
        }
        
        com.squareup.okhttp.Call call = postDlnaByUuidContentdirectoryControlCall(body, uuId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Processes a control request
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postDlnaByUuidContentdirectoryControl(Object body, String uuId) throws ApiException {
        postDlnaByUuidContentdirectoryControlWithHttpInfo(body, uuId);
    }

    /**
     * Processes a control request
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postDlnaByUuidContentdirectoryControlWithHttpInfo(Object body, String uuId) throws ApiException {
        com.squareup.okhttp.Call call = postDlnaByUuidContentdirectoryControlValidateBeforeCall(body, uuId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Processes a control request (asynchronously)
     * No authentication required
     * @param body Binary stream (required)
     * @param uuId Server UuId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDlnaByUuidContentdirectoryControlAsync(Object body, String uuId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDlnaByUuidContentdirectoryControlValidateBeforeCall(body, uuId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
