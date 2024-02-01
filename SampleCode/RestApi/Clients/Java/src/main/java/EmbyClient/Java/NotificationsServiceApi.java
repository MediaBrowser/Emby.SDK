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


import io.swagger.client.model.NotificationCategoryInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsServiceApi {
    private ApiClient apiClient;

    public NotificationsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNotificationsTypes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotificationsTypesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/Types";

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
    private com.squareup.okhttp.Call getNotificationsTypesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getNotificationsTypesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets notification types
     * Requires authentication as user
     * @return List&lt;NotificationCategoryInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NotificationCategoryInfo> getNotificationsTypes() throws ApiException {
        ApiResponse<List<NotificationCategoryInfo>> resp = getNotificationsTypesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets notification types
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;NotificationCategoryInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NotificationCategoryInfo>> getNotificationsTypesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsTypesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<NotificationCategoryInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets notification types (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsTypesAsync(final ApiCallback<List<NotificationCategoryInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotificationsTypesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NotificationCategoryInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postNotificationsAdmin
     * @param name The notification&#x27;s name (required)
     * @param description The notification&#x27;s description (required)
     * @param imageUrl The notification&#x27;s image url (optional)
     * @param url The notification&#x27;s info url (optional)
     * @param level The notification level (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotificationsAdminCall(String name, String description, String imageUrl, String url, String level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/Admin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Description", description));
        if (imageUrl != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageUrl", imageUrl));
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Url", url));
        if (level != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Level", level));

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
    private com.squareup.okhttp.Call postNotificationsAdminValidateBeforeCall(String name, String description, String imageUrl, String url, String level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotificationsAdmin(Async)");
        }
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling postNotificationsAdmin(Async)");
        }
        
        com.squareup.okhttp.Call call = postNotificationsAdminCall(name, description, imageUrl, url, level, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Sends a notification to all admin users
     * Requires authentication as user
     * @param name The notification&#x27;s name (required)
     * @param description The notification&#x27;s description (required)
     * @param imageUrl The notification&#x27;s image url (optional)
     * @param url The notification&#x27;s info url (optional)
     * @param level The notification level (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postNotificationsAdmin(String name, String description, String imageUrl, String url, String level) throws ApiException {
        postNotificationsAdminWithHttpInfo(name, description, imageUrl, url, level);
    }

    /**
     * Sends a notification to all admin users
     * Requires authentication as user
     * @param name The notification&#x27;s name (required)
     * @param description The notification&#x27;s description (required)
     * @param imageUrl The notification&#x27;s image url (optional)
     * @param url The notification&#x27;s info url (optional)
     * @param level The notification level (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postNotificationsAdminWithHttpInfo(String name, String description, String imageUrl, String url, String level) throws ApiException {
        com.squareup.okhttp.Call call = postNotificationsAdminValidateBeforeCall(name, description, imageUrl, url, level, null, null);
        return apiClient.execute(call);
    }

    /**
     * Sends a notification to all admin users (asynchronously)
     * Requires authentication as user
     * @param name The notification&#x27;s name (required)
     * @param description The notification&#x27;s description (required)
     * @param imageUrl The notification&#x27;s image url (optional)
     * @param url The notification&#x27;s info url (optional)
     * @param level The notification level (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotificationsAdminAsync(String name, String description, String imageUrl, String url, String level, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postNotificationsAdminValidateBeforeCall(name, description, imageUrl, url, level, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
