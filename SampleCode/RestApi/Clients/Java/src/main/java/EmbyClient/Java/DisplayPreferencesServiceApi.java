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


import io.swagger.client.model.DisplayPreferences;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayPreferencesServiceApi {
    private ApiClient apiClient;

    public DisplayPreferencesServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DisplayPreferencesServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDisplaypreferencesById
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param client Client (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDisplaypreferencesByIdCall(String id, String userId, String client, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/DisplayPreferences/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (client != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Client", client));

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
    private com.squareup.okhttp.Call getDisplaypreferencesByIdValidateBeforeCall(String id, String userId, String client, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDisplaypreferencesById(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getDisplaypreferencesById(Async)");
        }
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new ApiException("Missing the required parameter 'client' when calling getDisplaypreferencesById(Async)");
        }
        
        com.squareup.okhttp.Call call = getDisplaypreferencesByIdCall(id, userId, client, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param client Client (required)
     * @return DisplayPreferences
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DisplayPreferences getDisplaypreferencesById(String id, String userId, String client) throws ApiException {
        ApiResponse<DisplayPreferences> resp = getDisplaypreferencesByIdWithHttpInfo(id, userId, client);
        return resp.getData();
    }

    /**
     * Gets a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param client Client (required)
     * @return ApiResponse&lt;DisplayPreferences&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DisplayPreferences> getDisplaypreferencesByIdWithHttpInfo(String id, String userId, String client) throws ApiException {
        com.squareup.okhttp.Call call = getDisplaypreferencesByIdValidateBeforeCall(id, userId, client, null, null);
        Type localVarReturnType = new TypeToken<DisplayPreferences>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a user&#x27;s display preferences for an item (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param userId User Id (required)
     * @param client Client (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDisplaypreferencesByIdAsync(String id, String userId, String client, final ApiCallback<DisplayPreferences> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDisplaypreferencesByIdValidateBeforeCall(id, userId, client, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DisplayPreferences>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postDisplaypreferencesByDisplaypreferencesid
     * @param body DisplayPreferences:  (required)
     * @param userId User Id (required)
     * @param displayPreferencesId DisplayPreferences Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postDisplaypreferencesByDisplaypreferencesidCall(DisplayPreferences body, String userId, String displayPreferencesId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/DisplayPreferences/{DisplayPreferencesId}"
            .replaceAll("\\{" + "DisplayPreferencesId" + "\\}", apiClient.escapeString(displayPreferencesId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

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
    private com.squareup.okhttp.Call postDisplaypreferencesByDisplaypreferencesidValidateBeforeCall(DisplayPreferences body, String userId, String displayPreferencesId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postDisplaypreferencesByDisplaypreferencesid(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postDisplaypreferencesByDisplaypreferencesid(Async)");
        }
        // verify the required parameter 'displayPreferencesId' is set
        if (displayPreferencesId == null) {
            throw new ApiException("Missing the required parameter 'displayPreferencesId' when calling postDisplaypreferencesByDisplaypreferencesid(Async)");
        }
        
        com.squareup.okhttp.Call call = postDisplaypreferencesByDisplaypreferencesidCall(body, userId, displayPreferencesId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param body DisplayPreferences:  (required)
     * @param userId User Id (required)
     * @param displayPreferencesId DisplayPreferences Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postDisplaypreferencesByDisplaypreferencesid(DisplayPreferences body, String userId, String displayPreferencesId) throws ApiException {
        postDisplaypreferencesByDisplaypreferencesidWithHttpInfo(body, userId, displayPreferencesId);
    }

    /**
     * Updates a user&#x27;s display preferences for an item
     * Requires authentication as user
     * @param body DisplayPreferences:  (required)
     * @param userId User Id (required)
     * @param displayPreferencesId DisplayPreferences Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postDisplaypreferencesByDisplaypreferencesidWithHttpInfo(DisplayPreferences body, String userId, String displayPreferencesId) throws ApiException {
        com.squareup.okhttp.Call call = postDisplaypreferencesByDisplaypreferencesidValidateBeforeCall(body, userId, displayPreferencesId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user&#x27;s display preferences for an item (asynchronously)
     * Requires authentication as user
     * @param body DisplayPreferences:  (required)
     * @param userId User Id (required)
     * @param displayPreferencesId DisplayPreferences Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postDisplaypreferencesByDisplaypreferencesidAsync(DisplayPreferences body, String userId, String displayPreferencesId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postDisplaypreferencesByDisplaypreferencesidValidateBeforeCall(body, userId, displayPreferencesId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
