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


import io.swagger.client.model.AuthenticateUser;
import io.swagger.client.model.AuthenticateUserByName;
import io.swagger.client.model.AuthenticationAuthenticationResult;
import io.swagger.client.model.CreateUserByName;
import io.swagger.client.model.ForgotPassword;
import io.swagger.client.model.ForgotPasswordPin;
import io.swagger.client.model.ForgotPasswordResult;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.PinRedeemResult;
import io.swagger.client.model.QueryResultUserDto;
import io.swagger.client.model.UpdateUserPassword;
import io.swagger.client.model.UserConfiguration;
import io.swagger.client.model.UserDto;
import io.swagger.client.model.UserPolicy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceApi {
    private ApiClient apiClient;

    public UserServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUsersById
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUsersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUsersById(String id) throws ApiException {
        deleteUsersByIdWithHttpInfo(id);
    }

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUsersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a user (asynchronously)
     * Requires authentication as administrator
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteUsersByIdTrackselectionsByTracktype
     * @param id  (required)
     * @param trackType  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdTrackselectionsByTracktypeCall(String id, String trackType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/TrackSelections/{TrackType}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "TrackType" + "\\}", apiClient.escapeString(trackType.toString()));

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

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUsersByIdTrackselectionsByTracktypeValidateBeforeCall(String id, String trackType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByIdTrackselectionsByTracktype(Async)");
        }
        // verify the required parameter 'trackType' is set
        if (trackType == null) {
            throw new ApiException("Missing the required parameter 'trackType' when calling deleteUsersByIdTrackselectionsByTracktype(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByIdTrackselectionsByTracktypeCall(id, trackType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUsersByIdTrackselectionsByTracktype(String id, String trackType) throws ApiException {
        deleteUsersByIdTrackselectionsByTracktypeWithHttpInfo(id, trackType);
    }

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUsersByIdTrackselectionsByTracktypeWithHttpInfo(String id, String trackType) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByIdTrackselectionsByTracktypeValidateBeforeCall(id, trackType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Clears audio or subtitle track selections for a user (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdTrackselectionsByTracktypeAsync(String id, String trackType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByIdTrackselectionsByTracktypeValidateBeforeCall(id, trackType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getUsersById
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getUsersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersById(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a user by Id
     * Requires authentication as user
     * @param id  (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserDto getUsersById(String id) throws ApiException {
        ApiResponse<UserDto> resp = getUsersByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a user by Id
     * Requires authentication as user
     * @param id  (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserDto> getUsersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a user by Id (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersByIdAsync(String id, final ApiCallback<UserDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersByUseridTypedsettingsByKey
     * @param key Key (required)
     * @param userId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersByUseridTypedsettingsByKeyCall(String key, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/TypedSettings/{Key}"
            .replaceAll("\\{" + "Key" + "\\}", apiClient.escapeString(key.toString()))
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

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

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsersByUseridTypedsettingsByKeyValidateBeforeCall(String key, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling getUsersByUseridTypedsettingsByKey(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridTypedsettingsByKey(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridTypedsettingsByKeyCall(key, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a typed user setting
     * Requires authentication as user
     * @param key Key (required)
     * @param userId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getUsersByUseridTypedsettingsByKey(String key, String userId) throws ApiException {
        getUsersByUseridTypedsettingsByKeyWithHttpInfo(key, userId);
    }

    /**
     * Gets a typed user setting
     * Requires authentication as user
     * @param key Key (required)
     * @param userId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getUsersByUseridTypedsettingsByKeyWithHttpInfo(String key, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridTypedsettingsByKeyValidateBeforeCall(key, userId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a typed user setting (asynchronously)
     * Requires authentication as user
     * @param key Key (required)
     * @param userId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersByUseridTypedsettingsByKeyAsync(String key, String userId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridTypedsettingsByKeyValidateBeforeCall(key, userId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getUsersItemaccess
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersItemaccessCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/ItemAccess";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHidden", isHidden));
        if (isDisabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsDisabled", isDisabled));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));

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
    private com.squareup.okhttp.Call getUsersItemaccessValidateBeforeCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getUsersItemaccessCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of users
     * Requires authentication as user
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return QueryResultUserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultUserDto getUsersItemaccess(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        ApiResponse<QueryResultUserDto> resp = getUsersItemaccessWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);
        return resp.getData();
    }

    /**
     * Gets a list of users
     * Requires authentication as user
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return ApiResponse&lt;QueryResultUserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultUserDto> getUsersItemaccessWithHttpInfo(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getUsersItemaccessValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<QueryResultUserDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of users (asynchronously)
     * Requires authentication as user
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersItemaccessAsync(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ApiCallback<QueryResultUserDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersItemaccessValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultUserDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersPrefixes
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersPrefixesCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/Prefixes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHidden", isHidden));
        if (isDisabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsDisabled", isDisabled));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));

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
    private com.squareup.okhttp.Call getUsersPrefixesValidateBeforeCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getUsersPrefixesCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return List&lt;NameIdPair&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NameIdPair> getUsersPrefixes(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        ApiResponse<List<NameIdPair>> resp = getUsersPrefixesWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);
        return resp.getData();
    }

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return ApiResponse&lt;List&lt;NameIdPair&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NameIdPair>> getUsersPrefixesWithHttpInfo(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getUsersPrefixesValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of users (asynchronously)
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersPrefixesAsync(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ApiCallback<List<NameIdPair>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersPrefixesValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersPublic
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Gets a list of publicly visible users for display on a login screen. Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersPublicCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/Public";

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
    private com.squareup.okhttp.Call getUsersPublicValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getUsersPublicCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of publicly visible users for display on a login screen.
     * Requires authentication as user
     * @return List&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Gets a list of publicly visible users for display on a login screen. Documentation</a>
     */
    public List<UserDto> getUsersPublic() throws ApiException {
        ApiResponse<List<UserDto>> resp = getUsersPublicWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of publicly visible users for display on a login screen.
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;UserDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Gets a list of publicly visible users for display on a login screen. Documentation</a>
     */
    public ApiResponse<List<UserDto>> getUsersPublicWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getUsersPublicValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<UserDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of publicly visible users for display on a login screen. (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Gets a list of publicly visible users for display on a login screen. Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersPublicAsync(final ApiCallback<List<UserDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersPublicValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersQuery
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersQueryCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/Query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isHidden != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHidden", isHidden));
        if (isDisabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsDisabled", isDisabled));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));

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
    private com.squareup.okhttp.Call getUsersQueryValidateBeforeCall(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getUsersQueryCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return QueryResultUserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultUserDto getUsersQuery(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        ApiResponse<QueryResultUserDto> resp = getUsersQueryWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);
        return resp.getData();
    }

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return ApiResponse&lt;QueryResultUserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultUserDto> getUsersQueryWithHttpInfo(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getUsersQueryValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<QueryResultUserDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of users (asynchronously)
     * Requires authentication as administrator
     * @param isHidden Optional filter by IsHidden&#x3D;true or false (optional)
     * @param isDisabled Optional filter by IsDisabled&#x3D;true or false (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersQueryAsync(Boolean isHidden, Boolean isDisabled, Integer startIndex, Integer limit, String nameStartsWithOrGreater, String sortOrder, final ApiCallback<QueryResultUserDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersQueryValidateBeforeCall(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultUserDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersAuthenticatebyname
     * @param body AuthenticateUserByName (required)
     * @param xEmbyAuthorization The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersAuthenticatebynameCall(AuthenticateUserByName body, String xEmbyAuthorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/AuthenticateByName";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xEmbyAuthorization != null)
        localVarHeaderParams.put("X-Emby-Authorization", apiClient.parameterToString(xEmbyAuthorization));

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
    private com.squareup.okhttp.Call postUsersAuthenticatebynameValidateBeforeCall(AuthenticateUserByName body, String xEmbyAuthorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersAuthenticatebyname(Async)");
        }
        // verify the required parameter 'xEmbyAuthorization' is set
        if (xEmbyAuthorization == null) {
            throw new ApiException("Missing the required parameter 'xEmbyAuthorization' when calling postUsersAuthenticatebyname(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersAuthenticatebynameCall(body, xEmbyAuthorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Authenticates a user
     * Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user
     * @param body AuthenticateUserByName (required)
     * @param xEmbyAuthorization The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details. (required)
     * @return AuthenticationAuthenticationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public AuthenticationAuthenticationResult postUsersAuthenticatebyname(AuthenticateUserByName body, String xEmbyAuthorization) throws ApiException {
        ApiResponse<AuthenticationAuthenticationResult> resp = postUsersAuthenticatebynameWithHttpInfo(body, xEmbyAuthorization);
        return resp.getData();
    }

    /**
     * Authenticates a user
     * Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user
     * @param body AuthenticateUserByName (required)
     * @param xEmbyAuthorization The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details. (required)
     * @return ApiResponse&lt;AuthenticationAuthenticationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public ApiResponse<AuthenticationAuthenticationResult> postUsersAuthenticatebynameWithHttpInfo(AuthenticateUserByName body, String xEmbyAuthorization) throws ApiException {
        com.squareup.okhttp.Call call = postUsersAuthenticatebynameValidateBeforeCall(body, xEmbyAuthorization, null, null);
        Type localVarReturnType = new TypeToken<AuthenticationAuthenticationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Authenticates a user (asynchronously)
     * Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user
     * @param body AuthenticateUserByName (required)
     * @param xEmbyAuthorization The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersAuthenticatebynameAsync(AuthenticateUserByName body, String xEmbyAuthorization, final ApiCallback<AuthenticationAuthenticationResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersAuthenticatebynameValidateBeforeCall(body, xEmbyAuthorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticationAuthenticationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersById
     * @param body UserDto:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdCall(UserDto body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdValidateBeforeCall(UserDto body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersById(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user
     * Requires authentication as user
     * @param body UserDto:  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersById(UserDto body, String id) throws ApiException {
        postUsersByIdWithHttpInfo(body, id);
    }

    /**
     * Updates a user
     * Requires authentication as user
     * @param body UserDto:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdWithHttpInfo(UserDto body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user (asynchronously)
     * Requires authentication as user
     * @param body UserDto:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdAsync(UserDto body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdAuthenticate
     * @param body AuthenticateUser (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersByIdAuthenticateCall(AuthenticateUser body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Authenticate"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdAuthenticateValidateBeforeCall(AuthenticateUser body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdAuthenticate(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdAuthenticate(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdAuthenticateCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Authenticates a user
     * Requires authentication as user
     * @param body AuthenticateUser (required)
     * @param id  (required)
     * @return AuthenticationAuthenticationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public AuthenticationAuthenticationResult postUsersByIdAuthenticate(AuthenticateUser body, String id) throws ApiException {
        ApiResponse<AuthenticationAuthenticationResult> resp = postUsersByIdAuthenticateWithHttpInfo(body, id);
        return resp.getData();
    }

    /**
     * Authenticates a user
     * Requires authentication as user
     * @param body AuthenticateUser (required)
     * @param id  (required)
     * @return ApiResponse&lt;AuthenticationAuthenticationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public ApiResponse<AuthenticationAuthenticationResult> postUsersByIdAuthenticateWithHttpInfo(AuthenticateUser body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdAuthenticateValidateBeforeCall(body, id, null, null);
        Type localVarReturnType = new TypeToken<AuthenticationAuthenticationResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Authenticates a user (asynchronously)
     * Requires authentication as user
     * @param body AuthenticateUser (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html">Authenticates a user Documentation</a>
     */
    public com.squareup.okhttp.Call postUsersByIdAuthenticateAsync(AuthenticateUser body, String id, final ApiCallback<AuthenticationAuthenticationResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdAuthenticateValidateBeforeCall(body, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticationAuthenticationResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdConfiguration
     * @param body UserConfiguration:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdConfigurationCall(UserConfiguration body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Configuration"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdConfigurationValidateBeforeCall(UserConfiguration body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdConfiguration(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdConfigurationCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param body UserConfiguration:  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdConfiguration(UserConfiguration body, String id) throws ApiException {
        postUsersByIdConfigurationWithHttpInfo(body, id);
    }

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param body UserConfiguration:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdConfigurationWithHttpInfo(UserConfiguration body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdConfigurationValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user configuration (asynchronously)
     * Requires authentication as user
     * @param body UserConfiguration:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdConfigurationAsync(UserConfiguration body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdConfigurationValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdConfigurationPartial
     * @param body Binary stream (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdConfigurationPartialCall(Object body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Configuration/Partial"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdConfigurationPartialValidateBeforeCall(Object body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdConfigurationPartial(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdConfigurationPartial(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdConfigurationPartialCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdConfigurationPartial(Object body, String id) throws ApiException {
        postUsersByIdConfigurationPartialWithHttpInfo(body, id);
    }

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdConfigurationPartialWithHttpInfo(Object body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdConfigurationPartialValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user configuration (asynchronously)
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdConfigurationPartialAsync(Object body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdConfigurationPartialValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdDelete
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUsersByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdDelete(String id) throws ApiException {
        postUsersByIdDeleteWithHttpInfo(id);
    }

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a user (asynchronously)
     * Requires authentication as administrator
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdPassword
     * @param body UpdateUserPassword (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdPasswordCall(UpdateUserPassword body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Password"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdPasswordValidateBeforeCall(UpdateUserPassword body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdPassword(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdPassword(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdPasswordCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user&#x27;s password
     * Requires authentication as user
     * @param body UpdateUserPassword (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdPassword(UpdateUserPassword body, String id) throws ApiException {
        postUsersByIdPasswordWithHttpInfo(body, id);
    }

    /**
     * Updates a user&#x27;s password
     * Requires authentication as user
     * @param body UpdateUserPassword (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdPasswordWithHttpInfo(UpdateUserPassword body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdPasswordValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user&#x27;s password (asynchronously)
     * Requires authentication as user
     * @param body UpdateUserPassword (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdPasswordAsync(UpdateUserPassword body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdPasswordValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdPolicy
     * @param body UserPolicy:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdPolicyCall(UserPolicy body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Policy"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdPolicyValidateBeforeCall(UserPolicy body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdPolicy(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdPolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdPolicyCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a user policy
     * Requires authentication as administrator
     * @param body UserPolicy:  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdPolicy(UserPolicy body, String id) throws ApiException {
        postUsersByIdPolicyWithHttpInfo(body, id);
    }

    /**
     * Updates a user policy
     * Requires authentication as administrator
     * @param body UserPolicy:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdPolicyWithHttpInfo(UserPolicy body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdPolicyValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a user policy (asynchronously)
     * Requires authentication as administrator
     * @param body UserPolicy:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdPolicyAsync(UserPolicy body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdPolicyValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdTrackselectionsByTracktypeDelete
     * @param id  (required)
     * @param trackType  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdTrackselectionsByTracktypeDeleteCall(String id, String trackType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/TrackSelections/{TrackType}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "TrackType" + "\\}", apiClient.escapeString(trackType.toString()));

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

        String[] localVarAuthNames = new String[] { "apikeyauth", "embyauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUsersByIdTrackselectionsByTracktypeDeleteValidateBeforeCall(String id, String trackType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdTrackselectionsByTracktypeDelete(Async)");
        }
        // verify the required parameter 'trackType' is set
        if (trackType == null) {
            throw new ApiException("Missing the required parameter 'trackType' when calling postUsersByIdTrackselectionsByTracktypeDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdTrackselectionsByTracktypeDeleteCall(id, trackType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdTrackselectionsByTracktypeDelete(String id, String trackType) throws ApiException {
        postUsersByIdTrackselectionsByTracktypeDeleteWithHttpInfo(id, trackType);
    }

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdTrackselectionsByTracktypeDeleteWithHttpInfo(String id, String trackType) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdTrackselectionsByTracktypeDeleteValidateBeforeCall(id, trackType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Clears audio or subtitle track selections for a user (asynchronously)
     * Requires authentication as user
     * @param id  (required)
     * @param trackType  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdTrackselectionsByTracktypeDeleteAsync(String id, String trackType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdTrackselectionsByTracktypeDeleteValidateBeforeCall(id, trackType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByUseridTypedsettingsByKey
     * @param body Binary stream (required)
     * @param userId  (required)
     * @param key Key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridTypedsettingsByKeyCall(Object body, String userId, String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/TypedSettings/{Key}"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "Key" + "\\}", apiClient.escapeString(key.toString()));

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
    private com.squareup.okhttp.Call postUsersByUseridTypedsettingsByKeyValidateBeforeCall(Object body, String userId, String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByUseridTypedsettingsByKey(Async)");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postUsersByUseridTypedsettingsByKey(Async)");
        }
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling postUsersByUseridTypedsettingsByKey(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByUseridTypedsettingsByKeyCall(body, userId, key, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a typed user setting
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param userId  (required)
     * @param key Key (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByUseridTypedsettingsByKey(Object body, String userId, String key) throws ApiException {
        postUsersByUseridTypedsettingsByKeyWithHttpInfo(body, userId, key);
    }

    /**
     * Updates a typed user setting
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param userId  (required)
     * @param key Key (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByUseridTypedsettingsByKeyWithHttpInfo(Object body, String userId, String key) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByUseridTypedsettingsByKeyValidateBeforeCall(body, userId, key, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a typed user setting (asynchronously)
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param userId  (required)
     * @param key Key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByUseridTypedsettingsByKeyAsync(Object body, String userId, String key, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByUseridTypedsettingsByKeyValidateBeforeCall(body, userId, key, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersForgotpassword
     * @param body ForgotPassword (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersForgotpasswordCall(ForgotPassword body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/ForgotPassword";

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
    private com.squareup.okhttp.Call postUsersForgotpasswordValidateBeforeCall(ForgotPassword body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersForgotpassword(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersForgotpasswordCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Initiates the forgot password process for a local user
     * Requires authentication as user
     * @param body ForgotPassword (required)
     * @return ForgotPasswordResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ForgotPasswordResult postUsersForgotpassword(ForgotPassword body) throws ApiException {
        ApiResponse<ForgotPasswordResult> resp = postUsersForgotpasswordWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Initiates the forgot password process for a local user
     * Requires authentication as user
     * @param body ForgotPassword (required)
     * @return ApiResponse&lt;ForgotPasswordResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ForgotPasswordResult> postUsersForgotpasswordWithHttpInfo(ForgotPassword body) throws ApiException {
        com.squareup.okhttp.Call call = postUsersForgotpasswordValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ForgotPasswordResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Initiates the forgot password process for a local user (asynchronously)
     * Requires authentication as user
     * @param body ForgotPassword (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersForgotpasswordAsync(ForgotPassword body, final ApiCallback<ForgotPasswordResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersForgotpasswordValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ForgotPasswordResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersForgotpasswordPin
     * @param body ForgotPasswordPin (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersForgotpasswordPinCall(ForgotPasswordPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/ForgotPassword/Pin";

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
    private com.squareup.okhttp.Call postUsersForgotpasswordPinValidateBeforeCall(ForgotPasswordPin body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersForgotpasswordPin(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersForgotpasswordPinCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Redeems a forgot password pin
     * Requires authentication as user
     * @param body ForgotPasswordPin (required)
     * @return PinRedeemResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PinRedeemResult postUsersForgotpasswordPin(ForgotPasswordPin body) throws ApiException {
        ApiResponse<PinRedeemResult> resp = postUsersForgotpasswordPinWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Redeems a forgot password pin
     * Requires authentication as user
     * @param body ForgotPasswordPin (required)
     * @return ApiResponse&lt;PinRedeemResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PinRedeemResult> postUsersForgotpasswordPinWithHttpInfo(ForgotPasswordPin body) throws ApiException {
        com.squareup.okhttp.Call call = postUsersForgotpasswordPinValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PinRedeemResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Redeems a forgot password pin (asynchronously)
     * Requires authentication as user
     * @param body ForgotPasswordPin (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersForgotpasswordPinAsync(ForgotPasswordPin body, final ApiCallback<PinRedeemResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersForgotpasswordPinValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PinRedeemResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUsersNew
     * @param body CreateUserByName (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersNewCall(CreateUserByName body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/New";

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
    private com.squareup.okhttp.Call postUsersNewValidateBeforeCall(CreateUserByName body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersNew(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersNewCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a user
     * Requires authentication as administrator
     * @param body CreateUserByName (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserDto postUsersNew(CreateUserByName body) throws ApiException {
        ApiResponse<UserDto> resp = postUsersNewWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates a user
     * Requires authentication as administrator
     * @param body CreateUserByName (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserDto> postUsersNewWithHttpInfo(CreateUserByName body) throws ApiException {
        com.squareup.okhttp.Call call = postUsersNewValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a user (asynchronously)
     * Requires authentication as administrator
     * @param body CreateUserByName (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersNewAsync(CreateUserByName body, final ApiCallback<UserDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersNewValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
