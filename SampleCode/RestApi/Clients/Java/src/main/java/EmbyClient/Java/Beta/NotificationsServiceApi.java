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


import io.swagger.client.model.EmbyNotificationsApiNotificationResult;
import io.swagger.client.model.EmbyNotificationsApiNotificationsSummary;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.NotificationsNotificationLevel;
import io.swagger.client.model.NotificationsNotificationTypeInfo;

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
     * Build call for getNotificationsByUserid
     * @param userId User Id (required)
     * @param isRead An optional filter by IsRead (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotificationsByUseridCall(String userId, Boolean isRead, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/{UserId}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isRead != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRead", isRead));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));

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
    private com.squareup.okhttp.Call getNotificationsByUseridValidateBeforeCall(String userId, Boolean isRead, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getNotificationsByUserid(Async)");
        }
        
        com.squareup.okhttp.Call call = getNotificationsByUseridCall(userId, isRead, startIndex, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets notifications
     * Requires authentication as user
     * @param userId User Id (required)
     * @param isRead An optional filter by IsRead (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return EmbyNotificationsApiNotificationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbyNotificationsApiNotificationResult getNotificationsByUserid(String userId, Boolean isRead, Integer startIndex, Integer limit) throws ApiException {
        ApiResponse<EmbyNotificationsApiNotificationResult> resp = getNotificationsByUseridWithHttpInfo(userId, isRead, startIndex, limit);
        return resp.getData();
    }

    /**
     * Gets notifications
     * Requires authentication as user
     * @param userId User Id (required)
     * @param isRead An optional filter by IsRead (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return ApiResponse&lt;EmbyNotificationsApiNotificationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbyNotificationsApiNotificationResult> getNotificationsByUseridWithHttpInfo(String userId, Boolean isRead, Integer startIndex, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsByUseridValidateBeforeCall(userId, isRead, startIndex, limit, null, null);
        Type localVarReturnType = new TypeToken<EmbyNotificationsApiNotificationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets notifications (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param isRead An optional filter by IsRead (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsByUseridAsync(String userId, Boolean isRead, Integer startIndex, Integer limit, final ApiCallback<EmbyNotificationsApiNotificationResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotificationsByUseridValidateBeforeCall(userId, isRead, startIndex, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbyNotificationsApiNotificationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNotificationsByUseridSummary
     * @param userId User Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotificationsByUseridSummaryCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/{UserId}/Summary"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call getNotificationsByUseridSummaryValidateBeforeCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getNotificationsByUseridSummary(Async)");
        }
        
        com.squareup.okhttp.Call call = getNotificationsByUseridSummaryCall(userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a notification summary for a user
     * Requires authentication as user
     * @param userId User Id (required)
     * @return EmbyNotificationsApiNotificationsSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbyNotificationsApiNotificationsSummary getNotificationsByUseridSummary(String userId) throws ApiException {
        ApiResponse<EmbyNotificationsApiNotificationsSummary> resp = getNotificationsByUseridSummaryWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Gets a notification summary for a user
     * Requires authentication as user
     * @param userId User Id (required)
     * @return ApiResponse&lt;EmbyNotificationsApiNotificationsSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbyNotificationsApiNotificationsSummary> getNotificationsByUseridSummaryWithHttpInfo(String userId) throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsByUseridSummaryValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<EmbyNotificationsApiNotificationsSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a notification summary for a user (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsByUseridSummaryAsync(String userId, final ApiCallback<EmbyNotificationsApiNotificationsSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotificationsByUseridSummaryValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbyNotificationsApiNotificationsSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNotificationsServices
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotificationsServicesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/Services";

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
    private com.squareup.okhttp.Call getNotificationsServicesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getNotificationsServicesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets notification types
     * Requires authentication as user
     * @return List&lt;NameIdPair&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NameIdPair> getNotificationsServices() throws ApiException {
        ApiResponse<List<NameIdPair>> resp = getNotificationsServicesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets notification types
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;NameIdPair&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NameIdPair>> getNotificationsServicesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsServicesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets notification types (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsServicesAsync(final ApiCallback<List<NameIdPair>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotificationsServicesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
     * @return List&lt;NotificationsNotificationTypeInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NotificationsNotificationTypeInfo> getNotificationsTypes() throws ApiException {
        ApiResponse<List<NotificationsNotificationTypeInfo>> resp = getNotificationsTypesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets notification types
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;NotificationsNotificationTypeInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NotificationsNotificationTypeInfo>> getNotificationsTypesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsTypesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<NotificationsNotificationTypeInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets notification types (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsTypesAsync(final ApiCallback<List<NotificationsNotificationTypeInfo>> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<List<NotificationsNotificationTypeInfo>>(){}.getType();
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
    public com.squareup.okhttp.Call postNotificationsAdminCall(String name, String description, String imageUrl, String url, NotificationsNotificationLevel level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call postNotificationsAdminValidateBeforeCall(String name, String description, String imageUrl, String url, NotificationsNotificationLevel level, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    public void postNotificationsAdmin(String name, String description, String imageUrl, String url, NotificationsNotificationLevel level) throws ApiException {
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
    public ApiResponse<Void> postNotificationsAdminWithHttpInfo(String name, String description, String imageUrl, String url, NotificationsNotificationLevel level) throws ApiException {
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
    public com.squareup.okhttp.Call postNotificationsAdminAsync(String name, String description, String imageUrl, String url, NotificationsNotificationLevel level, final ApiCallback<Void> callback) throws ApiException {

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
    /**
     * Build call for postNotificationsByUseridRead
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotificationsByUseridReadCall(String userId, String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/{UserId}/Read"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call postNotificationsByUseridReadValidateBeforeCall(String userId, String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postNotificationsByUseridRead(Async)");
        }
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postNotificationsByUseridRead(Async)");
        }
        
        com.squareup.okhttp.Call call = postNotificationsByUseridReadCall(userId, ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks notifications as read
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postNotificationsByUseridRead(String userId, String ids) throws ApiException {
        postNotificationsByUseridReadWithHttpInfo(userId, ids);
    }

    /**
     * Marks notifications as read
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postNotificationsByUseridReadWithHttpInfo(String userId, String ids) throws ApiException {
        com.squareup.okhttp.Call call = postNotificationsByUseridReadValidateBeforeCall(userId, ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Marks notifications as read (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotificationsByUseridReadAsync(String userId, String ids, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postNotificationsByUseridReadValidateBeforeCall(userId, ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postNotificationsByUseridUnread
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotificationsByUseridUnreadCall(String userId, String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Notifications/{UserId}/Unread"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));

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
    private com.squareup.okhttp.Call postNotificationsByUseridUnreadValidateBeforeCall(String userId, String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postNotificationsByUseridUnread(Async)");
        }
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postNotificationsByUseridUnread(Async)");
        }
        
        com.squareup.okhttp.Call call = postNotificationsByUseridUnreadCall(userId, ids, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Marks notifications as unread
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postNotificationsByUseridUnread(String userId, String ids) throws ApiException {
        postNotificationsByUseridUnreadWithHttpInfo(userId, ids);
    }

    /**
     * Marks notifications as unread
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postNotificationsByUseridUnreadWithHttpInfo(String userId, String ids) throws ApiException {
        com.squareup.okhttp.Call call = postNotificationsByUseridUnreadValidateBeforeCall(userId, ids, null, null);
        return apiClient.execute(call);
    }

    /**
     * Marks notifications as unread (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param ids A list of notification ids, comma delimited (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotificationsByUseridUnreadAsync(String userId, String ids, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postNotificationsByUseridUnreadValidateBeforeCall(userId, ids, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
