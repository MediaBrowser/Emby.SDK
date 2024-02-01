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


import io.swagger.client.model.QueryResultBaseItemDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserViewsServiceApi {
    private ApiClient apiClient;

    public UserViewsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserViewsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUsersByUseridViews
     * @param userId User Id (required)
     * @param includeExternalContent Whether or not to include external views such as channels or live tv (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Browsing the Library
     * @see <a href="https://dev.emby.media/doc/restapi/Browsing-the-Library.html"> Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridViewsCall(String userId, Boolean includeExternalContent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{UserId}/Views"
            .replaceAll("\\{" + "UserId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeExternalContent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IncludeExternalContent", includeExternalContent));

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
    private com.squareup.okhttp.Call getUsersByUseridViewsValidateBeforeCall(String userId, Boolean includeExternalContent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUsersByUseridViews(Async)");
        }
        // verify the required parameter 'includeExternalContent' is set
        if (includeExternalContent == null) {
            throw new ApiException("Missing the required parameter 'includeExternalContent' when calling getUsersByUseridViews(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByUseridViewsCall(userId, includeExternalContent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param userId User Id (required)
     * @param includeExternalContent Whether or not to include external views such as channels or live tv (required)
     * @return QueryResultBaseItemDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Browsing the Library
     * @see <a href="https://dev.emby.media/doc/restapi/Browsing-the-Library.html"> Documentation</a>
     */
    public QueryResultBaseItemDto getUsersByUseridViews(String userId, Boolean includeExternalContent) throws ApiException {
        ApiResponse<QueryResultBaseItemDto> resp = getUsersByUseridViewsWithHttpInfo(userId, includeExternalContent);
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @param userId User Id (required)
     * @param includeExternalContent Whether or not to include external views such as channels or live tv (required)
     * @return ApiResponse&lt;QueryResultBaseItemDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Browsing the Library
     * @see <a href="https://dev.emby.media/doc/restapi/Browsing-the-Library.html"> Documentation</a>
     */
    public ApiResponse<QueryResultBaseItemDto> getUsersByUseridViewsWithHttpInfo(String userId, Boolean includeExternalContent) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByUseridViewsValidateBeforeCall(userId, includeExternalContent, null, null);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param userId User Id (required)
     * @param includeExternalContent Whether or not to include external views such as channels or live tv (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Browsing the Library
     * @see <a href="https://dev.emby.media/doc/restapi/Browsing-the-Library.html"> Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByUseridViewsAsync(String userId, Boolean includeExternalContent, final ApiCallback<QueryResultBaseItemDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByUseridViewsValidateBeforeCall(userId, includeExternalContent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResultBaseItemDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
