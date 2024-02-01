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


import io.swagger.client.model.ApiAvailableRecordingOptions;
import io.swagger.client.model.ApiBaseItemsRequest;
import io.swagger.client.model.ApiListingProviderTypeInfo;
import io.swagger.client.model.ApiSetChannelDisabled;
import io.swagger.client.model.ApiSetChannelMapping;
import io.swagger.client.model.ApiSetChannelSortIndex;
import io.swagger.client.model.ApiTagItem;
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.LiveTvChannelType;
import io.swagger.client.model.LiveTvGuideInfo;
import io.swagger.client.model.LiveTvListingsProviderInfo;
import io.swagger.client.model.LiveTvLiveTvInfo;
import io.swagger.client.model.LiveTvRecordingStatus;
import io.swagger.client.model.LiveTvSeriesTimerInfo;
import io.swagger.client.model.LiveTvSeriesTimerInfoDto;
import io.swagger.client.model.LiveTvTimerInfoDto;
import io.swagger.client.model.LiveTvTunerHostInfo;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.QueryResultApiEpgRow;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.QueryResultChannelManagementInfo;
import io.swagger.client.model.QueryResultLiveTvSeriesTimerInfoDto;
import io.swagger.client.model.QueryResultLiveTvTimerInfoDto;
import io.swagger.client.model.SortOrder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveTvServiceApi {
    private ApiClient apiClient;

    public LiveTvServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LiveTvServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteLivetvChannelmappingoptions
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvChannelmappingoptionsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappingOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call deleteLivetvChannelmappingoptionsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling deleteLivetvChannelmappingoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLivetvChannelmappingoptionsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvChannelmappingoptions(String providerId) throws ApiException {
        deleteLivetvChannelmappingoptionsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvChannelmappingoptionsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvChannelmappingoptionsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvChannelmappingoptionsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvChannelmappingoptionsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvChannelmappings
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvChannelmappingsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call deleteLivetvChannelmappingsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling deleteLivetvChannelmappings(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLivetvChannelmappingsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvChannelmappings(String providerId) throws ApiException {
        deleteLivetvChannelmappingsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvChannelmappingsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvChannelmappingsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvChannelmappingsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvChannelmappingsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvListingproviders
     * @param id Provider id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvListingprovidersCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Id", id));

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
    private com.squareup.okhttp.Call deleteLivetvListingprovidersValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = deleteLivetvListingprovidersCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvListingproviders(String id) throws ApiException {
        deleteLivetvListingprovidersWithHttpInfo(id);
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvListingprovidersWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvListingprovidersValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a listing provider (asynchronously)
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvListingprovidersAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvListingprovidersValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvRecordingsById
     * @param id Recording Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvRecordingsByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/{Id}"
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
    private com.squareup.okhttp.Call deleteLivetvRecordingsByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteLivetvRecordingsById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLivetvRecordingsByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvRecordingsById(String id) throws ApiException {
        deleteLivetvRecordingsByIdWithHttpInfo(id);
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvRecordingsByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvRecordingsByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a live tv recording (asynchronously)
     * Requires authentication as user
     * @param id Recording Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvRecordingsByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvRecordingsByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvSeriestimersById
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvSeriestimersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers/{Id}"
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
    private com.squareup.okhttp.Call deleteLivetvSeriestimersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteLivetvSeriestimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLivetvSeriestimersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvSeriestimersById(String id) throws ApiException {
        deleteLivetvSeriestimersByIdWithHttpInfo(id);
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvSeriestimersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvSeriestimersByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a live tv series timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvSeriestimersByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvSeriestimersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvTimersById
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvTimersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers/{Id}"
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
    private com.squareup.okhttp.Call deleteLivetvTimersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteLivetvTimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLivetvTimersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvTimersById(String id) throws ApiException {
        deleteLivetvTimersByIdWithHttpInfo(id);
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvTimersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvTimersByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a live tv timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvTimersByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvTimersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteLivetvTunerhosts
     * @param id Tuner host id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvTunerhostsCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Id", id));

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
    private com.squareup.okhttp.Call deleteLivetvTunerhostsValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = deleteLivetvTunerhostsCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLivetvTunerhosts(String id) throws ApiException {
        deleteLivetvTunerhostsWithHttpInfo(id);
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLivetvTunerhostsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLivetvTunerhostsValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a tuner host (asynchronously)
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLivetvTunerhostsAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLivetvTunerhostsValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvAvailablerecordingoptions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvAvailablerecordingoptionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/AvailableRecordingOptions";

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
    private com.squareup.okhttp.Call getLivetvAvailablerecordingoptionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvAvailablerecordingoptionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available recording options
     * Requires authentication as user
     * @return ApiAvailableRecordingOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiAvailableRecordingOptions getLivetvAvailablerecordingoptions() throws ApiException {
        ApiResponse<ApiAvailableRecordingOptions> resp = getLivetvAvailablerecordingoptionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets available recording options
     * Requires authentication as user
     * @return ApiResponse&lt;ApiAvailableRecordingOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiAvailableRecordingOptions> getLivetvAvailablerecordingoptionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvAvailablerecordingoptionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiAvailableRecordingOptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available recording options (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvAvailablerecordingoptionsAsync(final ApiCallback<ApiAvailableRecordingOptions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvAvailablerecordingoptionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiAvailableRecordingOptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvChannelmappingoptions
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvChannelmappingoptionsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappingOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call getLivetvChannelmappingoptionsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling getLivetvChannelmappingoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvChannelmappingoptionsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getLivetvChannelmappingoptions(String providerId) throws ApiException {
        getLivetvChannelmappingoptionsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getLivetvChannelmappingoptionsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChannelmappingoptionsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvChannelmappingoptionsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChannelmappingoptionsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvChannelmappings
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvChannelmappingsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call getLivetvChannelmappingsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling getLivetvChannelmappings(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvChannelmappingsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getLivetvChannelmappings(String providerId) throws ApiException {
        getLivetvChannelmappingsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getLivetvChannelmappingsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChannelmappingsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvChannelmappingsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChannelmappingsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvChannels
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv channels. Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChannelsCall(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Channels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (isLiked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLiked", isLiked));
        if (isDisliked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsDisliked", isDisliked));
        if (enableFavoriteSorting != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableFavoriteSorting", enableFavoriteSorting));
        if (addCurrentProgram != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AddCurrentProgram", addCurrentProgram));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvChannelsValidateBeforeCall(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvChannelsCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available live tv channels.
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv channels. Documentation</a>
     */
    public QueryResultBaseItemDto getLivetvChannels(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLivetvChannelsWithHttpInfo(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets available live tv channels.
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv channels. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLivetvChannelsWithHttpInfo(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChannelsValidateBeforeCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available live tv channels. (asynchronously)
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv channels. Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChannelsAsync(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChannelsValidateBeforeCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvChannelsById
     * @param id Channel Id (required)
     * @param userId Optional attach user data. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv channel Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChannelsByIdCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Channels/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

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
    private com.squareup.okhttp.Call getLivetvChannelsByIdValidateBeforeCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLivetvChannelsById(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvChannelsByIdCall(id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param id Channel Id (required)
     * @param userId Optional attach user data. (optional)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv channel Documentation</a>
     */
    public BaseItemDto getLivetvChannelsById(String id, String userId) throws ApiException {
        ApiResponse<BaseItemDto> resp = getLivetvChannelsByIdWithHttpInfo(id, userId);
        return resp.getData();
    }

    /**
     * Gets a live tv channel
     * Requires authentication as user
     * @param id Channel Id (required)
     * @param userId Optional attach user data. (optional)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv channel Documentation</a>
     */
    public ApiResponse<BaseItemDto> getLivetvChannelsByIdWithHttpInfo(String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChannelsByIdValidateBeforeCall(id, userId, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a live tv channel (asynchronously)
     * Requires authentication as user
     * @param id Channel Id (required)
     * @param userId Optional attach user data. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv channel Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChannelsByIdAsync(String id, String userId, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChannelsByIdValidateBeforeCall(id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvChanneltags
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv channel tags Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChanneltagsCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelTags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvChanneltagsValidateBeforeCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvChanneltagsCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv channel tags
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv channel tags Documentation</a>
     */
    public QueryResultBaseItemDto getLivetvChanneltags(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLivetvChanneltagsWithHttpInfo(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets live tv channel tags
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv channel tags Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLivetvChanneltagsWithHttpInfo(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChanneltagsValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv channel tags (asynchronously)
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv channel tags Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvChanneltagsAsync(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChanneltagsValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvChanneltagsPrefixes
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvChanneltagsPrefixesCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelTags/Prefixes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvChanneltagsPrefixesValidateBeforeCall(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvChanneltagsPrefixesCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv channel tag prefixes
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return List&lt;ApiTagItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ApiTagItem> getLivetvChanneltagsPrefixes(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<List<ApiTagItem>> resp = getLivetvChanneltagsPrefixesWithHttpInfo(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets live tv channel tag prefixes
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;List&lt;ApiTagItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ApiTagItem>> getLivetvChanneltagsPrefixesWithHttpInfo(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvChanneltagsPrefixesValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<List<ApiTagItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv channel tag prefixes (asynchronously)
     * Requires authentication as user
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvChanneltagsPrefixesAsync(String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<List<ApiTagItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvChanneltagsPrefixesValidateBeforeCall(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ApiTagItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvEPG
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvEPGCall(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/EPG";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (isLiked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLiked", isLiked));
        if (isDisliked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsDisliked", isDisliked));
        if (enableFavoriteSorting != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableFavoriteSorting", enableFavoriteSorting));
        if (addCurrentProgram != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AddCurrentProgram", addCurrentProgram));
        if (channelIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelIds", channelIds));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvEPGValidateBeforeCall(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvEPGCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the epg.
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return QueryResultApiEpgRow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultApiEpgRow getLivetvEPG(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        ApiResponse<QueryResultApiEpgRow> resp = getLivetvEPGWithHttpInfo(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
        return resp.getData();
    }

    /**
     * Gets the epg.
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;QueryResultApiEpgRow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultApiEpgRow> getLivetvEPGWithHttpInfo(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvEPGValidateBeforeCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        Type localVarReturnType = new TypeToken<QueryResultApiEpgRow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the epg. (asynchronously)
     * Requires authentication as user
     * @param type Optional filter by channel type. (optional)
     * @param isLiked Filter by channels that are liked, or not. (optional)
     * @param isDisliked Filter by channels that are disliked, or not. (optional)
     * @param enableFavoriteSorting Incorporate favorite and like status into channel sorting. (optional)
     * @param addCurrentProgram Optional. Adds current program info to each channel (optional)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvEPGAsync(LiveTvChannelType type, Boolean isLiked, Boolean isDisliked, Boolean enableFavoriteSorting, Boolean addCurrentProgram, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<QueryResultApiEpgRow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvEPGValidateBeforeCall(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultApiEpgRow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvFolder
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the top level live tv folder Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvFolderCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Folder";

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
    private com.squareup.okhttp.Call getLivetvFolderValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvFolderCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the top level live tv folder
     * Requires authentication as user
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the top level live tv folder Documentation</a>
     */
    public BaseItemDto getLivetvFolder() throws ApiException {
        ApiResponse<BaseItemDto> resp = getLivetvFolderWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets the top level live tv folder
     * Requires authentication as user
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the top level live tv folder Documentation</a>
     */
    public ApiResponse<BaseItemDto> getLivetvFolderWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvFolderValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the top level live tv folder (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets the top level live tv folder Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvFolderAsync(final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvFolderValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvGuideinfo
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvGuideinfoCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/GuideInfo";

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
    private com.squareup.okhttp.Call getLivetvGuideinfoValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvGuideinfoCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets guide info
     * Requires authentication as user
     * @return LiveTvGuideInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvGuideInfo getLivetvGuideinfo() throws ApiException {
        ApiResponse<LiveTvGuideInfo> resp = getLivetvGuideinfoWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets guide info
     * Requires authentication as user
     * @return ApiResponse&lt;LiveTvGuideInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvGuideInfo> getLivetvGuideinfoWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvGuideinfoValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LiveTvGuideInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets guide info (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvGuideinfoAsync(final ApiCallback<LiveTvGuideInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvGuideinfoValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvGuideInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvInfo
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvInfoCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Info";

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
    private com.squareup.okhttp.Call getLivetvInfoValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvInfoCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available live tv services.
     * Requires authentication as user
     * @return LiveTvLiveTvInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvLiveTvInfo getLivetvInfo() throws ApiException {
        ApiResponse<LiveTvLiveTvInfo> resp = getLivetvInfoWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets available live tv services.
     * Requires authentication as user
     * @return ApiResponse&lt;LiveTvLiveTvInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvLiveTvInfo> getLivetvInfoWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvInfoValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LiveTvLiveTvInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available live tv services. (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvInfoAsync(final ApiCallback<LiveTvLiveTvInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvInfoValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvLiveTvInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvListingproviders
     * @param channelId Channel id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersCall(String channelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelId", channelId));

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
    private com.squareup.okhttp.Call getLivetvListingprovidersValidateBeforeCall(String channelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling getLivetvListingproviders(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvListingprovidersCall(channelId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets current listing providers
     * Requires authentication as administrator
     * @param channelId Channel id (required)
     * @return List&lt;LiveTvListingsProviderInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LiveTvListingsProviderInfo> getLivetvListingproviders(String channelId) throws ApiException {
        ApiResponse<List<LiveTvListingsProviderInfo>> resp = getLivetvListingprovidersWithHttpInfo(channelId);
        return resp.getData();
    }

    /**
     * Gets current listing providers
     * Requires authentication as administrator
     * @param channelId Channel id (required)
     * @return ApiResponse&lt;List&lt;LiveTvListingsProviderInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LiveTvListingsProviderInfo>> getLivetvListingprovidersWithHttpInfo(String channelId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvListingprovidersValidateBeforeCall(channelId, null, null);
        Type localVarReturnType = new TypeToken<List<LiveTvListingsProviderInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets current listing providers (asynchronously)
     * Requires authentication as administrator
     * @param channelId Channel id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersAsync(String channelId, final ApiCallback<List<LiveTvListingsProviderInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvListingprovidersValidateBeforeCall(channelId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LiveTvListingsProviderInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvListingprovidersAvailable
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersAvailableCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders/Available";

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
    private com.squareup.okhttp.Call getLivetvListingprovidersAvailableValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvListingprovidersAvailableCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets listing provider
     * Requires authentication as administrator
     * @return List&lt;ApiListingProviderTypeInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ApiListingProviderTypeInfo> getLivetvListingprovidersAvailable() throws ApiException {
        ApiResponse<List<ApiListingProviderTypeInfo>> resp = getLivetvListingprovidersAvailableWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets listing provider
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;ApiListingProviderTypeInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ApiListingProviderTypeInfo>> getLivetvListingprovidersAvailableWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvListingprovidersAvailableValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<ApiListingProviderTypeInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets listing provider (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersAvailableAsync(final ApiCallback<List<ApiListingProviderTypeInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvListingprovidersAvailableValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ApiListingProviderTypeInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvListingprovidersDefault
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersDefaultCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders/Default";

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
    private com.squareup.okhttp.Call getLivetvListingprovidersDefaultValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvListingprovidersDefaultCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @return LiveTvListingsProviderInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvListingsProviderInfo getLivetvListingprovidersDefault() throws ApiException {
        ApiResponse<LiveTvListingsProviderInfo> resp = getLivetvListingprovidersDefaultWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @return ApiResponse&lt;LiveTvListingsProviderInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvListingsProviderInfo> getLivetvListingprovidersDefaultWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvListingprovidersDefaultValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LiveTvListingsProviderInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersDefaultAsync(final ApiCallback<LiveTvListingsProviderInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvListingprovidersDefaultValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvListingsProviderInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvListingprovidersLineups
     * @param id Provider id (optional)
     * @param type Provider Type (optional)
     * @param location Location (optional)
     * @param country Country (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersLineupsCall(String id, String type, String location, String country, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders/Lineups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Id", id));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (location != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Location", location));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Country", country));

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
    private com.squareup.okhttp.Call getLivetvListingprovidersLineupsValidateBeforeCall(String id, String type, String location, String country, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvListingprovidersLineupsCall(id, type, location, country, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @param type Provider Type (optional)
     * @param location Location (optional)
     * @param country Country (optional)
     * @return List&lt;NameIdPair&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NameIdPair> getLivetvListingprovidersLineups(String id, String type, String location, String country) throws ApiException {
        ApiResponse<List<NameIdPair>> resp = getLivetvListingprovidersLineupsWithHttpInfo(id, type, location, country);
        return resp.getData();
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @param type Provider Type (optional)
     * @param location Location (optional)
     * @param country Country (optional)
     * @return ApiResponse&lt;List&lt;NameIdPair&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NameIdPair>> getLivetvListingprovidersLineupsWithHttpInfo(String id, String type, String location, String country) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvListingprovidersLineupsValidateBeforeCall(id, type, location, country, null, null);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available lineups (asynchronously)
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @param type Provider Type (optional)
     * @param location Location (optional)
     * @param country Country (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersLineupsAsync(String id, String type, String location, String country, final ApiCallback<List<NameIdPair>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvListingprovidersLineupsValidateBeforeCall(id, type, location, country, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvListingprovidersSchedulesdirectCountries
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersSchedulesdirectCountriesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders/SchedulesDirect/Countries";

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
    private com.squareup.okhttp.Call getLivetvListingprovidersSchedulesdirectCountriesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvListingprovidersSchedulesdirectCountriesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getLivetvListingprovidersSchedulesdirectCountries() throws ApiException {
        getLivetvListingprovidersSchedulesdirectCountriesWithHttpInfo();
    }

    /**
     * Gets available lineups
     * Requires authentication as administrator
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getLivetvListingprovidersSchedulesdirectCountriesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvListingprovidersSchedulesdirectCountriesValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets available lineups (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvListingprovidersSchedulesdirectCountriesAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvListingprovidersSchedulesdirectCountriesValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvManageChannels
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvManageChannelsCall(Integer startIndex, Integer limit, String sortBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Manage/Channels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
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
    private com.squareup.okhttp.Call getLivetvManageChannelsValidateBeforeCall(Integer startIndex, Integer limit, String sortBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvManageChannelsCall(startIndex, limit, sortBy, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the channel management list
     * Requires authentication as administrator
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return QueryResultChannelManagementInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultChannelManagementInfo getLivetvManageChannels(Integer startIndex, Integer limit, String sortBy, String sortOrder) throws ApiException {
        ApiResponse<QueryResultChannelManagementInfo> resp = getLivetvManageChannelsWithHttpInfo(startIndex, limit, sortBy, sortOrder);
        return resp.getData();
    }

    /**
     * Gets the channel management list
     * Requires authentication as administrator
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @return ApiResponse&lt;QueryResultChannelManagementInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultChannelManagementInfo> getLivetvManageChannelsWithHttpInfo(Integer startIndex, Integer limit, String sortBy, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvManageChannelsValidateBeforeCall(startIndex, limit, sortBy, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the channel management list (asynchronously)
     * Requires authentication as administrator
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvManageChannelsAsync(Integer startIndex, Integer limit, String sortBy, String sortOrder, final ApiCallback<QueryResultChannelManagementInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvManageChannelsValidateBeforeCall(startIndex, limit, sortBy, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvPrograms
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvProgramsCall(String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Programs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelIds", channelIds));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvProgramsValidateBeforeCall(String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvProgramsCall(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getLivetvPrograms(String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        getLivetvProgramsWithHttpInfo(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getLivetvProgramsWithHttpInfo(String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvProgramsValidateBeforeCall(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets available live tv epgs.. (asynchronously)
     * Requires authentication as user
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvProgramsAsync(String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvProgramsValidateBeforeCall(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvProgramsRecommended
     * @param userId Optional filter by user id. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param isAiring Optional. Filter by programs that are currently airing, or not. (optional)
     * @param hasAired Optional. Filter by programs that have completed airing, or not. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param genreIds The genres to return guide information for. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv epgs.. Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvProgramsRecommendedCall(String userId, Integer limit, Boolean isAiring, Boolean hasAired, Boolean isSeries, Boolean isMovie, Boolean isNews, Boolean isKids, Boolean isSports, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, String genreIds, String fields, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Programs/Recommended";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (isAiring != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsAiring", isAiring));
        if (hasAired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasAired", hasAired));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (genreIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GenreIds", genreIds));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getLivetvProgramsRecommendedValidateBeforeCall(String userId, Integer limit, Boolean isAiring, Boolean hasAired, Boolean isSeries, Boolean isMovie, Boolean isNews, Boolean isKids, Boolean isSports, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, String genreIds, String fields, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvProgramsRecommendedCall(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param userId Optional filter by user id. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param isAiring Optional. Filter by programs that are currently airing, or not. (optional)
     * @param hasAired Optional. Filter by programs that have completed airing, or not. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param genreIds The genres to return guide information for. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv epgs.. Documentation</a>
     */
    public QueryResultBaseItemDto getLivetvProgramsRecommended(String userId, Integer limit, Boolean isAiring, Boolean hasAired, Boolean isSeries, Boolean isMovie, Boolean isNews, Boolean isKids, Boolean isSports, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, String genreIds, String fields, Boolean enableUserData) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLivetvProgramsRecommendedWithHttpInfo(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData);
        return resp.getData();
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param userId Optional filter by user id. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param isAiring Optional. Filter by programs that are currently airing, or not. (optional)
     * @param hasAired Optional. Filter by programs that have completed airing, or not. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param genreIds The genres to return guide information for. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv epgs.. Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLivetvProgramsRecommendedWithHttpInfo(String userId, Integer limit, Boolean isAiring, Boolean hasAired, Boolean isSeries, Boolean isMovie, Boolean isNews, Boolean isKids, Boolean isSports, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, String genreIds, String fields, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvProgramsRecommendedValidateBeforeCall(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available live tv epgs.. (asynchronously)
     * Requires authentication as user
     * @param userId Optional filter by user id. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param isAiring Optional. Filter by programs that are currently airing, or not. (optional)
     * @param hasAired Optional. Filter by programs that have completed airing, or not. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param genreIds The genres to return guide information for. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets available live tv epgs.. Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvProgramsRecommendedAsync(String userId, Integer limit, Boolean isAiring, Boolean hasAired, Boolean isSeries, Boolean isMovie, Boolean isNews, Boolean isKids, Boolean isSports, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, String genreIds, String fields, Boolean enableUserData, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvProgramsRecommendedValidateBeforeCall(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvRecordings
     * @param channelId Optional filter by channel id. (optional)
     * @param status Optional filter by recording status. (optional)
     * @param isInProgress Optional filter by recordings that are in progress, or not. (optional)
     * @param seriesTimerId Optional filter by recordings belonging to a series timer (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvRecordingsCall(String channelId, LiveTvRecordingStatus status, Boolean isInProgress, String seriesTimerId, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelId", channelId));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Status", status));
        if (isInProgress != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsInProgress", isInProgress));
        if (seriesTimerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesTimerId", seriesTimerId));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call getLivetvRecordingsValidateBeforeCall(String channelId, LiveTvRecordingStatus status, Boolean isInProgress, String seriesTimerId, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvRecordingsCall(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param status Optional filter by recording status. (optional)
     * @param isInProgress Optional filter by recordings that are in progress, or not. (optional)
     * @param seriesTimerId Optional filter by recordings belonging to a series timer (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getLivetvRecordings(String channelId, LiveTvRecordingStatus status, Boolean isInProgress, String seriesTimerId, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        getLivetvRecordingsWithHttpInfo(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param status Optional filter by recording status. (optional)
     * @param isInProgress Optional filter by recordings that are in progress, or not. (optional)
     * @param seriesTimerId Optional filter by recordings belonging to a series timer (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getLivetvRecordingsWithHttpInfo(String channelId, LiveTvRecordingStatus status, Boolean isInProgress, String seriesTimerId, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvRecordingsValidateBeforeCall(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets live tv recordings (asynchronously)
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param status Optional filter by recording status. (optional)
     * @param isInProgress Optional filter by recordings that are in progress, or not. (optional)
     * @param seriesTimerId Optional filter by recordings belonging to a series timer (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvRecordingsAsync(String channelId, LiveTvRecordingStatus status, Boolean isInProgress, String seriesTimerId, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvRecordingsValidateBeforeCall(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLivetvRecordingsById
     * @param id Recording Id (required)
     * @param userId Optional attach user data. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv recording Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsByIdCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/{Id}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));

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
    private com.squareup.okhttp.Call getLivetvRecordingsByIdValidateBeforeCall(String id, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLivetvRecordingsById(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvRecordingsByIdCall(id, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @param userId Optional attach user data. (optional)
     * @return BaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv recording Documentation</a>
     */
    public BaseItemDto getLivetvRecordingsById(String id, String userId) throws ApiException {
        ApiResponse<BaseItemDto> resp = getLivetvRecordingsByIdWithHttpInfo(id, userId);
        return resp.getData();
    }

    /**
     * Gets a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @param userId Optional attach user data. (optional)
     * @return ApiResponse&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv recording Documentation</a>
     */
    public ApiResponse<BaseItemDto> getLivetvRecordingsByIdWithHttpInfo(String id, String userId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvRecordingsByIdValidateBeforeCall(id, userId, null, null);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a live tv recording (asynchronously)
     * Requires authentication as user
     * @param id Recording Id (required)
     * @param userId Optional attach user data. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets a live tv recording Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsByIdAsync(String id, String userId, final ApiCallback<BaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvRecordingsByIdValidateBeforeCall(id, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvRecordingsFolders
     * @param userId Optional filter by user and attach user data. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets recording folders Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsFoldersCall(String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/Folders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));

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
    private com.squareup.okhttp.Call getLivetvRecordingsFoldersValidateBeforeCall(String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvRecordingsFoldersCall(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets recording folders
     * Requires authentication as user
     * @param userId Optional filter by user and attach user data. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return List&lt;BaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets recording folders Documentation</a>
     */
    public List<BaseItemDto> getLivetvRecordingsFolders(String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        ApiResponse<List<BaseItemDto>> resp = getLivetvRecordingsFoldersWithHttpInfo(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData);
        return resp.getData();
    }

    /**
     * Gets recording folders
     * Requires authentication as user
     * @param userId Optional filter by user and attach user data. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @return ApiResponse&lt;List&lt;BaseItemDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets recording folders Documentation</a>
     */
    public ApiResponse<List<BaseItemDto>> getLivetvRecordingsFoldersWithHttpInfo(String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvRecordingsFoldersValidateBeforeCall(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, null, null);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets recording folders (asynchronously)
     * Requires authentication as user
     * @param userId Optional filter by user and attach user data. (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets recording folders Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsFoldersAsync(String userId, String fields, Boolean enableImages, Integer imageTypeLimit, String enableImageTypes, Boolean enableUserData, final ApiCallback<List<BaseItemDto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvRecordingsFoldersValidateBeforeCall(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BaseItemDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvRecordingsGroups
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recording groups Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsGroupsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/Groups";

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
    private com.squareup.okhttp.Call getLivetvRecordingsGroupsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvRecordingsGroupsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv recording groups
     * Requires authentication as user
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recording groups Documentation</a>
     */
    public QueryResultBaseItemDto getLivetvRecordingsGroups() throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLivetvRecordingsGroupsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets live tv recording groups
     * Requires authentication as user
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recording groups Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLivetvRecordingsGroupsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvRecordingsGroupsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv recording groups (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recording groups Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsGroupsAsync(final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvRecordingsGroupsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvRecordingsSeries
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recordings Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsSeriesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/Series";

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
    private com.squareup.okhttp.Call getLivetvRecordingsSeriesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvRecordingsSeriesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recordings Documentation</a>
     */
    public QueryResultBaseItemDto getLivetvRecordingsSeries() throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getLivetvRecordingsSeriesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets live tv recordings
     * Requires authentication as user
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recordings Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getLivetvRecordingsSeriesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvRecordingsSeriesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv recordings (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Item Information
     * @see <a href="https://dev.emby.media/doc/restapi/Item-Information.html">Gets live tv recordings Documentation</a>
     */
    public com.squareup.okhttp.Call getLivetvRecordingsSeriesAsync(final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvRecordingsSeriesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvSeriestimers
     * @param sortBy Optional. Sort by SortName or Priority (optional)
     * @param sortOrder Optional. Sort in Ascending or Descending order (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvSeriestimersCall(String sortBy, SortOrder sortOrder, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
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
    private com.squareup.okhttp.Call getLivetvSeriestimersValidateBeforeCall(String sortBy, SortOrder sortOrder, Integer startIndex, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvSeriestimersCall(sortBy, sortOrder, startIndex, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv series timers
     * Requires authentication as user
     * @param sortBy Optional. Sort by SortName or Priority (optional)
     * @param sortOrder Optional. Sort in Ascending or Descending order (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return QueryResultLiveTvSeriesTimerInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultLiveTvSeriesTimerInfoDto getLivetvSeriestimers(String sortBy, SortOrder sortOrder, Integer startIndex, Integer limit) throws ApiException {
        ApiResponse<QueryResultLiveTvSeriesTimerInfoDto> resp = getLivetvSeriestimersWithHttpInfo(sortBy, sortOrder, startIndex, limit);
        return resp.getData();
    }

    /**
     * Gets live tv series timers
     * Requires authentication as user
     * @param sortBy Optional. Sort by SortName or Priority (optional)
     * @param sortOrder Optional. Sort in Ascending or Descending order (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @return ApiResponse&lt;QueryResultLiveTvSeriesTimerInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultLiveTvSeriesTimerInfoDto> getLivetvSeriestimersWithHttpInfo(String sortBy, SortOrder sortOrder, Integer startIndex, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvSeriestimersValidateBeforeCall(sortBy, sortOrder, startIndex, limit, null, null);
        Type localVarReturnType = new TypeToken<QueryResultLiveTvSeriesTimerInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv series timers (asynchronously)
     * Requires authentication as user
     * @param sortBy Optional. Sort by SortName or Priority (optional)
     * @param sortOrder Optional. Sort in Ascending or Descending order (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvSeriestimersAsync(String sortBy, SortOrder sortOrder, Integer startIndex, Integer limit, final ApiCallback<QueryResultLiveTvSeriesTimerInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvSeriestimersValidateBeforeCall(sortBy, sortOrder, startIndex, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultLiveTvSeriesTimerInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvSeriestimersById
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvSeriestimersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers/{Id}"
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
    private com.squareup.okhttp.Call getLivetvSeriestimersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLivetvSeriestimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvSeriestimersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return LiveTvTimerInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvTimerInfoDto getLivetvSeriestimersById(String id) throws ApiException {
        ApiResponse<LiveTvTimerInfoDto> resp = getLivetvSeriestimersByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;LiveTvTimerInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvTimerInfoDto> getLivetvSeriestimersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvSeriestimersByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<LiveTvTimerInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a live tv series timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvSeriestimersByIdAsync(String id, final ApiCallback<LiveTvTimerInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvSeriestimersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvTimerInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTimers
     * @param channelId Optional filter by channel id. (optional)
     * @param seriesTimerId Optional filter by timers belonging to a series timer (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersCall(String channelId, String seriesTimerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelId", channelId));
        if (seriesTimerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesTimerId", seriesTimerId));

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
    private com.squareup.okhttp.Call getLivetvTimersValidateBeforeCall(String channelId, String seriesTimerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvTimersCall(channelId, seriesTimerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets live tv timers
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param seriesTimerId Optional filter by timers belonging to a series timer (optional)
     * @return QueryResultLiveTvTimerInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultLiveTvTimerInfoDto getLivetvTimers(String channelId, String seriesTimerId) throws ApiException {
        ApiResponse<QueryResultLiveTvTimerInfoDto> resp = getLivetvTimersWithHttpInfo(channelId, seriesTimerId);
        return resp.getData();
    }

    /**
     * Gets live tv timers
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param seriesTimerId Optional filter by timers belonging to a series timer (optional)
     * @return ApiResponse&lt;QueryResultLiveTvTimerInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultLiveTvTimerInfoDto> getLivetvTimersWithHttpInfo(String channelId, String seriesTimerId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTimersValidateBeforeCall(channelId, seriesTimerId, null, null);
        Type localVarReturnType = new TypeToken<QueryResultLiveTvTimerInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets live tv timers (asynchronously)
     * Requires authentication as user
     * @param channelId Optional filter by channel id. (optional)
     * @param seriesTimerId Optional filter by timers belonging to a series timer (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersAsync(String channelId, String seriesTimerId, final ApiCallback<QueryResultLiveTvTimerInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTimersValidateBeforeCall(channelId, seriesTimerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultLiveTvTimerInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTimersById
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers/{Id}"
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
    private com.squareup.okhttp.Call getLivetvTimersByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLivetvTimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvTimersByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return LiveTvTimerInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvTimerInfoDto getLivetvTimersById(String id) throws ApiException {
        ApiResponse<LiveTvTimerInfoDto> resp = getLivetvTimersByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;LiveTvTimerInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvTimerInfoDto> getLivetvTimersByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTimersByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<LiveTvTimerInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a live tv timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersByIdAsync(String id, final ApiCallback<LiveTvTimerInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTimersByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvTimerInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTimersDefaults
     * @param programId Optional, to attach default values based on a program. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersDefaultsCall(String programId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers/Defaults";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (programId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProgramId", programId));

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
    private com.squareup.okhttp.Call getLivetvTimersDefaultsValidateBeforeCall(String programId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvTimersDefaultsCall(programId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets default values for a new timer
     * Requires authentication as user
     * @param programId Optional, to attach default values based on a program. (optional)
     * @return LiveTvSeriesTimerInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvSeriesTimerInfoDto getLivetvTimersDefaults(String programId) throws ApiException {
        ApiResponse<LiveTvSeriesTimerInfoDto> resp = getLivetvTimersDefaultsWithHttpInfo(programId);
        return resp.getData();
    }

    /**
     * Gets default values for a new timer
     * Requires authentication as user
     * @param programId Optional, to attach default values based on a program. (optional)
     * @return ApiResponse&lt;LiveTvSeriesTimerInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvSeriesTimerInfoDto> getLivetvTimersDefaultsWithHttpInfo(String programId) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTimersDefaultsValidateBeforeCall(programId, null, null);
        Type localVarReturnType = new TypeToken<LiveTvSeriesTimerInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets default values for a new timer (asynchronously)
     * Requires authentication as user
     * @param programId Optional, to attach default values based on a program. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTimersDefaultsAsync(String programId, final ApiCallback<LiveTvSeriesTimerInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTimersDefaultsValidateBeforeCall(programId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvSeriesTimerInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTunerhosts
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts";

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
    private com.squareup.okhttp.Call getLivetvTunerhostsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvTunerhostsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return List&lt;LiveTvTunerHostInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LiveTvTunerHostInfo> getLivetvTunerhosts() throws ApiException {
        ApiResponse<List<LiveTvTunerHostInfo>> resp = getLivetvTunerhostsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @return ApiResponse&lt;List&lt;LiveTvTunerHostInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LiveTvTunerHostInfo>> getLivetvTunerhostsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTunerhostsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<LiveTvTunerHostInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets tuner hosts (asynchronously)
     * Requires authentication as administrator
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsAsync(final ApiCallback<List<LiveTvTunerHostInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTunerhostsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LiveTvTunerHostInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTunerhostsDefaultByType
     * @param type Type (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsDefaultByTypeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts/Default/{Type}"
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

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
    private com.squareup.okhttp.Call getLivetvTunerhostsDefaultByTypeValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getLivetvTunerhostsDefaultByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getLivetvTunerhostsDefaultByTypeCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @param type Type (required)
     * @return LiveTvTunerHostInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvTunerHostInfo getLivetvTunerhostsDefaultByType(String type) throws ApiException {
        ApiResponse<LiveTvTunerHostInfo> resp = getLivetvTunerhostsDefaultByTypeWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * Gets tuner hosts
     * Requires authentication as administrator
     * @param type Type (required)
     * @return ApiResponse&lt;LiveTvTunerHostInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvTunerHostInfo> getLivetvTunerhostsDefaultByTypeWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTunerhostsDefaultByTypeValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<LiveTvTunerHostInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets tuner hosts (asynchronously)
     * Requires authentication as administrator
     * @param type Type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsDefaultByTypeAsync(String type, final ApiCallback<LiveTvTunerHostInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTunerhostsDefaultByTypeValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvTunerHostInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTunerhostsTypes
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsTypesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts/Types";

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
    private com.squareup.okhttp.Call getLivetvTunerhostsTypesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvTunerhostsTypesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @return List&lt;NameIdPair&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NameIdPair> getLivetvTunerhostsTypes() throws ApiException {
        ApiResponse<List<NameIdPair>> resp = getLivetvTunerhostsTypesWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;NameIdPair&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NameIdPair>> getLivetvTunerhostsTypesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTunerhostsTypesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunerhostsTypesAsync(final ApiCallback<List<NameIdPair>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTunerhostsTypesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NameIdPair>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLivetvTunersDiscvover
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunersDiscvoverCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Tuners/Discvover";

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
    private com.squareup.okhttp.Call getLivetvTunersDiscvoverValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLivetvTunersDiscvoverCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @return List&lt;LiveTvTunerHostInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LiveTvTunerHostInfo> getLivetvTunersDiscvover() throws ApiException {
        ApiResponse<List<LiveTvTunerHostInfo>> resp = getLivetvTunersDiscvoverWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @return ApiResponse&lt;List&lt;LiveTvTunerHostInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LiveTvTunerHostInfo>> getLivetvTunersDiscvoverWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLivetvTunersDiscvoverValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<LiveTvTunerHostInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLivetvTunersDiscvoverAsync(final ApiCallback<List<LiveTvTunerHostInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLivetvTunersDiscvoverValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LiveTvTunerHostInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for headLivetvChannelmappingoptions
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headLivetvChannelmappingoptionsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappingOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headLivetvChannelmappingoptionsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling headLivetvChannelmappingoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = headLivetvChannelmappingoptionsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headLivetvChannelmappingoptions(String providerId) throws ApiException {
        headLivetvChannelmappingoptionsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headLivetvChannelmappingoptionsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = headLivetvChannelmappingoptionsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headLivetvChannelmappingoptionsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headLivetvChannelmappingoptionsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headLivetvChannelmappings
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headLivetvChannelmappingsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headLivetvChannelmappingsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling headLivetvChannelmappings(Async)");
        }
        
        com.squareup.okhttp.Call call = headLivetvChannelmappingsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headLivetvChannelmappings(String providerId) throws ApiException {
        headLivetvChannelmappingsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headLivetvChannelmappingsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = headLivetvChannelmappingsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headLivetvChannelmappingsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headLivetvChannelmappingsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvChannelmappingoptions
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvChannelmappingoptionsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappingOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call postLivetvChannelmappingoptionsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling postLivetvChannelmappingoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvChannelmappingoptionsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvChannelmappingoptions(String providerId) throws ApiException {
        postLivetvChannelmappingoptionsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvChannelmappingoptionsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvChannelmappingoptionsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvChannelmappingoptionsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvChannelmappingoptionsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvChannelmappings
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvChannelmappingsCall(ApiSetChannelMapping body, String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
    private com.squareup.okhttp.Call postLivetvChannelmappingsValidateBeforeCall(ApiSetChannelMapping body, String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvChannelmappings(Async)");
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling postLivetvChannelmappings(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvChannelmappingsCall(body, providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvChannelmappings(ApiSetChannelMapping body, String providerId) throws ApiException {
        postLivetvChannelmappingsWithHttpInfo(body, providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvChannelmappingsWithHttpInfo(ApiSetChannelMapping body, String providerId) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvChannelmappingsValidateBeforeCall(body, providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvChannelmappingsAsync(ApiSetChannelMapping body, String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvChannelmappingsValidateBeforeCall(body, providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvListingproviders
     * @param body ListingsProviderInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvListingprovidersCall(LiveTvListingsProviderInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders";

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
    private com.squareup.okhttp.Call postLivetvListingprovidersValidateBeforeCall(LiveTvListingsProviderInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvListingproviders(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvListingprovidersCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds a listing provider
     * Requires authentication as administrator
     * @param body ListingsProviderInfo:  (required)
     * @return LiveTvListingsProviderInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvListingsProviderInfo postLivetvListingproviders(LiveTvListingsProviderInfo body) throws ApiException {
        ApiResponse<LiveTvListingsProviderInfo> resp = postLivetvListingprovidersWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Adds a listing provider
     * Requires authentication as administrator
     * @param body ListingsProviderInfo:  (required)
     * @return ApiResponse&lt;LiveTvListingsProviderInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvListingsProviderInfo> postLivetvListingprovidersWithHttpInfo(LiveTvListingsProviderInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvListingprovidersValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LiveTvListingsProviderInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a listing provider (asynchronously)
     * Requires authentication as administrator
     * @param body ListingsProviderInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvListingprovidersAsync(LiveTvListingsProviderInfo body, final ApiCallback<LiveTvListingsProviderInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvListingprovidersValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvListingsProviderInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLivetvListingprovidersDelete
     * @param id Provider id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvListingprovidersDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ListingProviders/Delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Id", id));

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
    private com.squareup.okhttp.Call postLivetvListingprovidersDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLivetvListingprovidersDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvListingprovidersDelete(String id) throws ApiException {
        postLivetvListingprovidersDeleteWithHttpInfo(id);
    }

    /**
     * Deletes a listing provider
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvListingprovidersDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvListingprovidersDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a listing provider (asynchronously)
     * Requires authentication as administrator
     * @param id Provider id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvListingprovidersDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvListingprovidersDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvManageChannelsByIdDisabled
     * @param body SetChannelDisabled (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvManageChannelsByIdDisabledCall(ApiSetChannelDisabled body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Manage/Channels/{Id}/Disabled"
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
    private com.squareup.okhttp.Call postLivetvManageChannelsByIdDisabledValidateBeforeCall(ApiSetChannelDisabled body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvManageChannelsByIdDisabled(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvManageChannelsByIdDisabled(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdDisabledCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Sets a channel disabled or not
     * Requires authentication as administrator
     * @param body SetChannelDisabled (required)
     * @param id  (required)
     * @return QueryResultChannelManagementInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultChannelManagementInfo postLivetvManageChannelsByIdDisabled(ApiSetChannelDisabled body, String id) throws ApiException {
        ApiResponse<QueryResultChannelManagementInfo> resp = postLivetvManageChannelsByIdDisabledWithHttpInfo(body, id);
        return resp.getData();
    }

    /**
     * Sets a channel disabled or not
     * Requires authentication as administrator
     * @param body SetChannelDisabled (required)
     * @param id  (required)
     * @return ApiResponse&lt;QueryResultChannelManagementInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultChannelManagementInfo> postLivetvManageChannelsByIdDisabledWithHttpInfo(ApiSetChannelDisabled body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdDisabledValidateBeforeCall(body, id, null, null);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sets a channel disabled or not (asynchronously)
     * Requires authentication as administrator
     * @param body SetChannelDisabled (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvManageChannelsByIdDisabledAsync(ApiSetChannelDisabled body, String id, final ApiCallback<QueryResultChannelManagementInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdDisabledValidateBeforeCall(body, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLivetvManageChannelsByIdSortindex
     * @param body SetChannelSortIndex (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvManageChannelsByIdSortindexCall(ApiSetChannelSortIndex body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Manage/Channels/{Id}/SortIndex"
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
    private com.squareup.okhttp.Call postLivetvManageChannelsByIdSortindexValidateBeforeCall(ApiSetChannelSortIndex body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvManageChannelsByIdSortindex(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvManageChannelsByIdSortindex(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdSortindexCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Sets a channel sort index
     * Requires authentication as administrator
     * @param body SetChannelSortIndex (required)
     * @param id  (required)
     * @return QueryResultChannelManagementInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResultChannelManagementInfo postLivetvManageChannelsByIdSortindex(ApiSetChannelSortIndex body, String id) throws ApiException {
        ApiResponse<QueryResultChannelManagementInfo> resp = postLivetvManageChannelsByIdSortindexWithHttpInfo(body, id);
        return resp.getData();
    }

    /**
     * Sets a channel sort index
     * Requires authentication as administrator
     * @param body SetChannelSortIndex (required)
     * @param id  (required)
     * @return ApiResponse&lt;QueryResultChannelManagementInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResultChannelManagementInfo> postLivetvManageChannelsByIdSortindexWithHttpInfo(ApiSetChannelSortIndex body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdSortindexValidateBeforeCall(body, id, null, null);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Sets a channel sort index (asynchronously)
     * Requires authentication as administrator
     * @param body SetChannelSortIndex (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvManageChannelsByIdSortindexAsync(ApiSetChannelSortIndex body, String id, final ApiCallback<QueryResultChannelManagementInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvManageChannelsByIdSortindexValidateBeforeCall(body, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultChannelManagementInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLivetvPrograms
     * @param body BaseItemsRequest:  (required)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvProgramsCall(ApiBaseItemsRequest body, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Programs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ChannelIds", channelIds));
        if (artistType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistType", artistType));
        if (maxOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxOfficialRating", maxOfficialRating));
        if (hasThemeSong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeSong", hasThemeSong));
        if (hasThemeVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasThemeVideo", hasThemeVideo));
        if (hasSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSubtitles", hasSubtitles));
        if (hasSpecialFeature != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasSpecialFeature", hasSpecialFeature));
        if (hasTrailer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTrailer", hasTrailer));
        if (adjacentTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AdjacentTo", adjacentTo));
        if (minIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinIndexNumber", minIndexNumber));
        if (minStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinStartDate", minStartDate));
        if (maxStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxStartDate", maxStartDate));
        if (minEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinEndDate", minEndDate));
        if (maxEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxEndDate", maxEndDate));
        if (minPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPlayers", minPlayers));
        if (maxPlayers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPlayers", maxPlayers));
        if (parentIndexNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentIndexNumber", parentIndexNumber));
        if (hasParentalRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasParentalRating", hasParentalRating));
        if (isHD != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHD", isHD));
        if (isUnaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsUnaired", isUnaired));
        if (minCommunityRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCommunityRating", minCommunityRating));
        if (minCriticRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinCriticRating", minCriticRating));
        if (airedDuringSeason != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AiredDuringSeason", airedDuringSeason));
        if (minPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinPremiereDate", minPremiereDate));
        if (minDateLastSaved != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSaved", minDateLastSaved));
        if (minDateLastSavedForUser != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinDateLastSavedForUser", minDateLastSavedForUser));
        if (maxPremiereDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxPremiereDate", maxPremiereDate));
        if (hasOverview != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOverview", hasOverview));
        if (hasImdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasImdbId", hasImdbId));
        if (hasTmdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTmdbId", hasTmdbId));
        if (hasTvdbId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasTvdbId", hasTvdbId));
        if (excludeItemIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemIds", excludeItemIds));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartIndex", startIndex));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Limit", limit));
        if (recursive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Recursive", recursive));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchTerm", searchTerm));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortOrder", sortOrder));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParentId", parentId));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Fields", fields));
        if (excludeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeItemTypes", excludeItemTypes));
        if (includeItemTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeItemTypes", includeItemTypes));
        if (anyProviderIdEquals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AnyProviderIdEquals", anyProviderIdEquals));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Filters", filters));
        if (isFavorite != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFavorite", isFavorite));
        if (isMovie != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsMovie", isMovie));
        if (isSeries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSeries", isSeries));
        if (isFolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsFolder", isFolder));
        if (isNews != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNews", isNews));
        if (isKids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsKids", isKids));
        if (isSports != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsSports", isSports));
        if (isNew != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNew", isNew));
        if (isPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPremiere", isPremiere));
        if (isNewOrPremiere != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsNewOrPremiere", isNewOrPremiere));
        if (isRepeat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsRepeat", isRepeat));
        if (projectToMedia != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProjectToMedia", projectToMedia));
        if (mediaTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaTypes", mediaTypes));
        if (imageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypes", imageTypes));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SortBy", sortBy));
        if (isPlayed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlayed", isPlayed));
        if (genres != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Genres", genres));
        if (officialRatings != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OfficialRatings", officialRatings));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tags", tags));
        if (excludeTags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExcludeTags", excludeTags));
        if (years != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Years", years));
        if (enableImages != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImages", enableImages));
        if (enableUserData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableUserData", enableUserData));
        if (imageTypeLimit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ImageTypeLimit", imageTypeLimit));
        if (enableImageTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageTypes", enableImageTypes));
        if (person != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Person", person));
        if (personIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonIds", personIds));
        if (personTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("PersonTypes", personTypes));
        if (studios != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Studios", studios));
        if (studioIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StudioIds", studioIds));
        if (artists != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Artists", artists));
        if (artistIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistIds", artistIds));
        if (albums != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Albums", albums));
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Ids", ids));
        if (videoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoTypes", videoTypes));
        if (containers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Containers", containers));
        if (audioCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodecs", audioCodecs));
        if (audioLayouts != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioLayouts", audioLayouts));
        if (videoCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodecs", videoCodecs));
        if (extendedVideoTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ExtendedVideoTypes", extendedVideoTypes));
        if (subtitleCodecs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleCodecs", subtitleCodecs));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Path", path));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("UserId", userId));
        if (minOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MinOfficialRating", minOfficialRating));
        if (isLocked != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsLocked", isLocked));
        if (isPlaceHolder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPlaceHolder", isPlaceHolder));
        if (hasOfficialRating != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("HasOfficialRating", hasOfficialRating));
        if (groupItemsIntoCollections != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("GroupItemsIntoCollections", groupItemsIntoCollections));
        if (is3D != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Is3D", is3D));
        if (seriesStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SeriesStatus", seriesStatus));
        if (nameStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWithOrGreater", nameStartsWithOrGreater));
        if (artistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ArtistStartsWithOrGreater", artistStartsWithOrGreater));
        if (albumArtistStartsWithOrGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AlbumArtistStartsWithOrGreater", albumArtistStartsWithOrGreater));
        if (nameStartsWith != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameStartsWith", nameStartsWith));
        if (nameLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NameLessThan", nameLessThan));

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
    private com.squareup.okhttp.Call postLivetvProgramsValidateBeforeCall(ApiBaseItemsRequest body, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvPrograms(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvProgramsCall(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param body BaseItemsRequest:  (required)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvPrograms(ApiBaseItemsRequest body, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        postLivetvProgramsWithHttpInfo(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);
    }

    /**
     * Gets available live tv epgs..
     * Requires authentication as user
     * @param body BaseItemsRequest:  (required)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvProgramsWithHttpInfo(ApiBaseItemsRequest body, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvProgramsValidateBeforeCall(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets available live tv epgs.. (asynchronously)
     * Requires authentication as user
     * @param body BaseItemsRequest:  (required)
     * @param channelIds The channels to return guide information for. (optional)
     * @param artistType Artist or AlbumArtist (optional)
     * @param maxOfficialRating Optional filter by maximum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param hasThemeSong Optional filter by items with theme songs. (optional)
     * @param hasThemeVideo Optional filter by items with theme videos. (optional)
     * @param hasSubtitles Optional filter by items with subtitles. (optional)
     * @param hasSpecialFeature Optional filter by items with special features. (optional)
     * @param hasTrailer Optional filter by items with trailers. (optional)
     * @param adjacentTo Optional. Return items that are siblings of a supplied item. (optional)
     * @param minIndexNumber Optional filter by minimum index number. (optional)
     * @param minStartDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxStartDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minEndDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxEndDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param minPlayers Optional filter by minimum number of game players. (optional)
     * @param maxPlayers Optional filter by maximum number of game players. (optional)
     * @param parentIndexNumber Optional filter by parent index number. (optional)
     * @param hasParentalRating Optional filter by items that have or do not have a parental rating (optional)
     * @param isHD Optional filter by items that are HD or not. (optional)
     * @param isUnaired Optional filter by items that are unaired episodes or not. (optional)
     * @param minCommunityRating Optional filter by minimum community rating. (optional)
     * @param minCriticRating Optional filter by minimum critic rating. (optional)
     * @param airedDuringSeason Gets all episodes that aired during a season, including specials. (optional)
     * @param minPremiereDate Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSaved Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param minDateLastSavedForUser Optional. The minimum premiere date. Format &#x3D; ISO (optional)
     * @param maxPremiereDate Optional. The maximum premiere date. Format &#x3D; ISO (optional)
     * @param hasOverview Optional filter by items that have an overview or not. (optional)
     * @param hasImdbId Optional filter by items that have an imdb id or not. (optional)
     * @param hasTmdbId Optional filter by items that have a tmdb id or not. (optional)
     * @param hasTvdbId Optional filter by items that have a tvdb id or not. (optional)
     * @param excludeItemIds Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted. (optional)
     * @param startIndex Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
     * @param limit Optional. The maximum number of records to return (optional)
     * @param recursive When searching within folders, this determines whether or not the search will be recursive. true/false (optional)
     * @param searchTerm Enter a search term to perform a search request (optional)
     * @param sortOrder Sort Order - Ascending,Descending (optional)
     * @param parentId Specify this to localize the search to a specific item or folder. Omit to use the root (optional)
     * @param fields Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines (optional)
     * @param excludeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param includeItemTypes Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted. (optional)
     * @param anyProviderIdEquals Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs. (optional)
     * @param filters Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes (optional)
     * @param isFavorite Optional filter by items that are marked as favorite, or not. (optional)
     * @param isMovie Optional filter for movies. (optional)
     * @param isSeries Optional filter for series. (optional)
     * @param isFolder Optional filter for folders. (optional)
     * @param isNews Optional filter for news. (optional)
     * @param isKids Optional filter for kids. (optional)
     * @param isSports Optional filter for sports. (optional)
     * @param isNew Optional filter for IsNew. (optional)
     * @param isPremiere Optional filter for IsPremiere. (optional)
     * @param isNewOrPremiere Optional filter for IsNewOrPremiere. (optional)
     * @param isRepeat Optional filter for IsRepeat. (optional)
     * @param projectToMedia ProjectToMedia (optional)
     * @param mediaTypes Optional filter by MediaType. Allows multiple, comma delimited. (optional)
     * @param imageTypes Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited. (optional)
     * @param sortBy Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime (optional)
     * @param isPlayed Optional filter by items that are played, or not. (optional)
     * @param genres Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted. (optional)
     * @param officialRatings Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted. (optional)
     * @param tags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param excludeTags Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted. (optional)
     * @param years Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted. (optional)
     * @param enableImages Optional, include image information in output (optional)
     * @param enableUserData Optional, include user data (optional)
     * @param imageTypeLimit Optional, the max number of images to return, per image type (optional)
     * @param enableImageTypes Optional. The image types to include in the output. (optional)
     * @param person Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personIds Optional. If specified, results will be filtered to include only those containing the specified person. (optional)
     * @param personTypes Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited (optional)
     * @param studios Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param studioIds Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted. (optional)
     * @param artists Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param artistIds Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted. (optional)
     * @param albums Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted. (optional)
     * @param ids Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited. (optional)
     * @param videoTypes Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted. (optional)
     * @param containers Optional filter by Container. Allows multiple, comma delimeted. (optional)
     * @param audioCodecs Optional filter by AudioCodec. Allows multiple, comma delimeted. (optional)
     * @param audioLayouts Optional filter by AudioLayout. Allows multiple, comma delimeted. (optional)
     * @param videoCodecs Optional filter by VideoCodec. Allows multiple, comma delimeted. (optional)
     * @param extendedVideoTypes Optional filter by ExtendedVideoType. Allows multiple, comma delimeted. (optional)
     * @param subtitleCodecs Optional filter by SubtitleCodec. Allows multiple, comma delimeted. (optional)
     * @param path Optional filter by Path. (optional)
     * @param userId User Id (optional)
     * @param minOfficialRating Optional filter by minimum official rating (PG, PG-13, TV-MA, etc). (optional)
     * @param isLocked Optional filter by items that are locked. (optional)
     * @param isPlaceHolder Optional filter by items that are placeholders (optional)
     * @param hasOfficialRating Optional filter by items that have official ratings (optional)
     * @param groupItemsIntoCollections Whether or not to hide items behind their boxsets. (optional)
     * @param is3D Optional filter by items that are 3D, or not. (optional)
     * @param seriesStatus Optional filter by Series Status. Allows multiple, comma delimeted. (optional)
     * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param artistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param albumArtistStartsWithOrGreater Optional filter by items whose name is sorted equally or greater than a given input string. (optional)
     * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input string. (optional)
     * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input string. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvProgramsAsync(ApiBaseItemsRequest body, String channelIds, String artistType, String maxOfficialRating, Boolean hasThemeSong, Boolean hasThemeVideo, Boolean hasSubtitles, Boolean hasSpecialFeature, Boolean hasTrailer, String adjacentTo, Integer minIndexNumber, String minStartDate, String maxStartDate, String minEndDate, String maxEndDate, Integer minPlayers, Integer maxPlayers, Integer parentIndexNumber, Boolean hasParentalRating, Boolean isHD, Boolean isUnaired, Double minCommunityRating, Double minCriticRating, Integer airedDuringSeason, String minPremiereDate, String minDateLastSaved, String minDateLastSavedForUser, String maxPremiereDate, Boolean hasOverview, Boolean hasImdbId, Boolean hasTmdbId, Boolean hasTvdbId, String excludeItemIds, Integer startIndex, Integer limit, Boolean recursive, String searchTerm, String sortOrder, String parentId, String fields, String excludeItemTypes, String includeItemTypes, String anyProviderIdEquals, String filters, Boolean isFavorite, Boolean isMovie, Boolean isSeries, Boolean isFolder, Boolean isNews, Boolean isKids, Boolean isSports, Boolean isNew, Boolean isPremiere, Boolean isNewOrPremiere, Boolean isRepeat, Boolean projectToMedia, String mediaTypes, String imageTypes, String sortBy, Boolean isPlayed, String genres, String officialRatings, String tags, String excludeTags, String years, Boolean enableImages, Boolean enableUserData, Integer imageTypeLimit, String enableImageTypes, String person, String personIds, String personTypes, String studios, String studioIds, String artists, String artistIds, String albums, String ids, String videoTypes, String containers, String audioCodecs, String audioLayouts, String videoCodecs, String extendedVideoTypes, String subtitleCodecs, String path, String userId, String minOfficialRating, Boolean isLocked, Boolean isPlaceHolder, Boolean hasOfficialRating, Boolean groupItemsIntoCollections, Boolean is3D, String seriesStatus, String nameStartsWithOrGreater, String artistStartsWithOrGreater, String albumArtistStartsWithOrGreater, String nameStartsWith, String nameLessThan, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvProgramsValidateBeforeCall(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvRecordingsByIdDelete
     * @param id Recording Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvRecordingsByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Recordings/{Id}/Delete"
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
    private com.squareup.okhttp.Call postLivetvRecordingsByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvRecordingsByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvRecordingsByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvRecordingsByIdDelete(String id) throws ApiException {
        postLivetvRecordingsByIdDeleteWithHttpInfo(id);
    }

    /**
     * Deletes a live tv recording
     * Requires authentication as user
     * @param id Recording Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvRecordingsByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvRecordingsByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a live tv recording (asynchronously)
     * Requires authentication as user
     * @param id Recording Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvRecordingsByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvRecordingsByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvSeriestimers
     * @param body SeriesTimerInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersCall(LiveTvSeriesTimerInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers";

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
    private com.squareup.okhttp.Call postLivetvSeriestimersValidateBeforeCall(LiveTvSeriesTimerInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvSeriestimers(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvSeriestimersCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a live tv series timer
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvSeriestimers(LiveTvSeriesTimerInfo body) throws ApiException {
        postLivetvSeriestimersWithHttpInfo(body);
    }

    /**
     * Creates a live tv series timer
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvSeriestimersWithHttpInfo(LiveTvSeriesTimerInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvSeriestimersValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates a live tv series timer (asynchronously)
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersAsync(LiveTvSeriesTimerInfo body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvSeriestimersValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvSeriestimersById
     * @param body SeriesTimerInfo:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersByIdCall(LiveTvSeriesTimerInfo body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers/{Id}"
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
    private com.squareup.okhttp.Call postLivetvSeriestimersByIdValidateBeforeCall(LiveTvSeriesTimerInfo body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvSeriestimersById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvSeriestimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a live tv series timer
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvSeriestimersById(LiveTvSeriesTimerInfo body, String id) throws ApiException {
        postLivetvSeriestimersByIdWithHttpInfo(body, id);
    }

    /**
     * Updates a live tv series timer
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvSeriestimersByIdWithHttpInfo(LiveTvSeriesTimerInfo body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a live tv series timer (asynchronously)
     * Requires authentication as user
     * @param body SeriesTimerInfo:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersByIdAsync(LiveTvSeriesTimerInfo body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvSeriestimersByIdDelete
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/SeriesTimers/{Id}/Delete"
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
    private com.squareup.okhttp.Call postLivetvSeriestimersByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvSeriestimersByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvSeriestimersByIdDelete(String id) throws ApiException {
        postLivetvSeriestimersByIdDeleteWithHttpInfo(id);
    }

    /**
     * Cancels a live tv series timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvSeriestimersByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a live tv series timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvSeriestimersByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvSeriestimersByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvTimers
     * @param body TimerInfoDto:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersCall(LiveTvTimerInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers";

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
    private com.squareup.okhttp.Call postLivetvTimersValidateBeforeCall(LiveTvTimerInfoDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvTimers(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvTimersCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a live tv timer
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvTimers(LiveTvTimerInfoDto body) throws ApiException {
        postLivetvTimersWithHttpInfo(body);
    }

    /**
     * Creates a live tv timer
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvTimersWithHttpInfo(LiveTvTimerInfoDto body) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTimersValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates a live tv timer (asynchronously)
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersAsync(LiveTvTimerInfoDto body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTimersValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvTimersById
     * @param body TimerInfoDto:  (required)
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersByIdCall(LiveTvTimerInfoDto body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers/{Id}"
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
    private com.squareup.okhttp.Call postLivetvTimersByIdValidateBeforeCall(LiveTvTimerInfoDto body, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvTimersById(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvTimersById(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvTimersByIdCall(body, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a live tv timer
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvTimersById(LiveTvTimerInfoDto body, String id) throws ApiException {
        postLivetvTimersByIdWithHttpInfo(body, id);
    }

    /**
     * Updates a live tv timer
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvTimersByIdWithHttpInfo(LiveTvTimerInfoDto body, String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTimersByIdValidateBeforeCall(body, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a live tv timer (asynchronously)
     * Requires authentication as user
     * @param body TimerInfoDto:  (required)
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersByIdAsync(LiveTvTimerInfoDto body, String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTimersByIdValidateBeforeCall(body, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvTimersByIdDelete
     * @param id Timer Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersByIdDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Timers/{Id}/Delete"
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
    private com.squareup.okhttp.Call postLivetvTimersByIdDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvTimersByIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvTimersByIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvTimersByIdDelete(String id) throws ApiException {
        postLivetvTimersByIdDeleteWithHttpInfo(id);
    }

    /**
     * Cancels a live tv timer
     * Requires authentication as user
     * @param id Timer Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvTimersByIdDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTimersByIdDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancels a live tv timer (asynchronously)
     * Requires authentication as user
     * @param id Timer Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTimersByIdDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTimersByIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvTunerhosts
     * @param body TunerHostInfo:  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunerhostsCall(LiveTvTunerHostInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts";

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
    private com.squareup.okhttp.Call postLivetvTunerhostsValidateBeforeCall(LiveTvTunerHostInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postLivetvTunerhosts(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvTunerhostsCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds a tuner host
     * Requires authentication as administrator
     * @param body TunerHostInfo:  (required)
     * @return LiveTvTunerHostInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LiveTvTunerHostInfo postLivetvTunerhosts(LiveTvTunerHostInfo body) throws ApiException {
        ApiResponse<LiveTvTunerHostInfo> resp = postLivetvTunerhostsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Adds a tuner host
     * Requires authentication as administrator
     * @param body TunerHostInfo:  (required)
     * @return ApiResponse&lt;LiveTvTunerHostInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LiveTvTunerHostInfo> postLivetvTunerhostsWithHttpInfo(LiveTvTunerHostInfo body) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTunerhostsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LiveTvTunerHostInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a tuner host (asynchronously)
     * Requires authentication as administrator
     * @param body TunerHostInfo:  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunerhostsAsync(LiveTvTunerHostInfo body, final ApiCallback<LiveTvTunerHostInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTunerhostsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LiveTvTunerHostInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postLivetvTunerhostsDelete
     * @param id Tuner host id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunerhostsDeleteCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/TunerHosts/Delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Id", id));

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
    private com.squareup.okhttp.Call postLivetvTunerhostsDeleteValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = postLivetvTunerhostsDeleteCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvTunerhostsDelete(String id) throws ApiException {
        postLivetvTunerhostsDeleteWithHttpInfo(id);
    }

    /**
     * Deletes a tuner host
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvTunerhostsDeleteWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTunerhostsDeleteValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a tuner host (asynchronously)
     * Requires authentication as administrator
     * @param id Tuner host id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunerhostsDeleteAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTunerhostsDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postLivetvTunersByIdReset
     * @param id Tuner Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunersByIdResetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/Tuners/{Id}/Reset"
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
    private com.squareup.okhttp.Call postLivetvTunersByIdResetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postLivetvTunersByIdReset(Async)");
        }
        
        com.squareup.okhttp.Call call = postLivetvTunersByIdResetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Resets a tv tuner
     * Requires authentication as administrator
     * @param id Tuner Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postLivetvTunersByIdReset(String id) throws ApiException {
        postLivetvTunersByIdResetWithHttpInfo(id);
    }

    /**
     * Resets a tv tuner
     * Requires authentication as administrator
     * @param id Tuner Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postLivetvTunersByIdResetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = postLivetvTunersByIdResetValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Resets a tv tuner (asynchronously)
     * Requires authentication as administrator
     * @param id Tuner Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postLivetvTunersByIdResetAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postLivetvTunersByIdResetValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putLivetvChannelmappingoptions
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putLivetvChannelmappingoptionsCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappingOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putLivetvChannelmappingoptionsValidateBeforeCall(String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling putLivetvChannelmappingoptions(Async)");
        }
        
        com.squareup.okhttp.Call call = putLivetvChannelmappingoptionsCall(providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putLivetvChannelmappingoptions(String providerId) throws ApiException {
        putLivetvChannelmappingoptionsWithHttpInfo(providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putLivetvChannelmappingoptionsWithHttpInfo(String providerId) throws ApiException {
        com.squareup.okhttp.Call call = putLivetvChannelmappingoptionsValidateBeforeCall(providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putLivetvChannelmappingoptionsAsync(String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putLivetvChannelmappingoptionsValidateBeforeCall(providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putLivetvChannelmappings
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putLivetvChannelmappingsCall(ApiSetChannelMapping body, String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/LiveTv/ChannelMappings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (providerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ProviderId", providerId));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putLivetvChannelmappingsValidateBeforeCall(ApiSetChannelMapping body, String providerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putLivetvChannelmappings(Async)");
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException("Missing the required parameter 'providerId' when calling putLivetvChannelmappings(Async)");
        }
        
        com.squareup.okhttp.Call call = putLivetvChannelmappingsCall(body, providerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putLivetvChannelmappings(ApiSetChannelMapping body, String providerId) throws ApiException {
        putLivetvChannelmappingsWithHttpInfo(body, providerId);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putLivetvChannelmappingsWithHttpInfo(ApiSetChannelMapping body, String providerId) throws ApiException {
        com.squareup.okhttp.Call call = putLivetvChannelmappingsValidateBeforeCall(body, providerId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param body SetChannelMapping (required)
     * @param providerId Provider id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putLivetvChannelmappingsAsync(ApiSetChannelMapping body, String providerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putLivetvChannelmappingsValidateBeforeCall(body, providerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
