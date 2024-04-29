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


import io.swagger.client.model.ImageInfo;
import io.swagger.client.model.ImageType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageServiceApi {
    private ApiClient apiClient;

    public ImageServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteItemsByIdImagesByType
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdImagesByTypeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call deleteItemsByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteItemsByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling deleteItemsByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItemsByIdImagesByType(String id, ImageType type, Integer index) throws ApiException {
        deleteItemsByIdImagesByTypeWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdImagesByTypeAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteItemsByIdImagesByTypeByIndex
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call deleteItemsByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling deleteItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling deleteItemsByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeByIndexCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItemsByIdImagesByTypeByIndex(String id, ImageType type, Integer index) throws ApiException {
        deleteItemsByIdImagesByTypeByIndexWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteUsersByIdImagesByType
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdImagesByTypeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call deleteUsersByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling deleteUsersByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUsersByIdImagesByType(String id, ImageType type, Integer index) throws ApiException {
        deleteUsersByIdImagesByTypeWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUsersByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdImagesByTypeAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteUsersByIdImagesByTypeByIndex
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call deleteUsersByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling deleteUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling deleteUsersByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeByIndexCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUsersByIdImagesByTypeByIndex(String id, ImageType type, Integer index) throws ApiException {
        deleteUsersByIdImagesByTypeByIndexWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUsersByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsersByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getArtistsByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getArtistsByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getArtistsByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getArtistsByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getArtistsByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getArtistsByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getArtistsByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getArtistsByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getArtistsByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getArtistsByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getArtistsByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getArtistsByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getArtistsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getArtistsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getArtistsByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getArtistsByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getArtistsByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getArtistsByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getArtistsByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getArtistsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getGamegenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGamegenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GameGenres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getGamegenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getGamegenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getGamegenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getGamegenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getGamegenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getGamegenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGamegenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getGamegenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGamegenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GameGenres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getGamegenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getGamegenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getGamegenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getGamegenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getGamegenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getGamegenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getGamegenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGamegenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGamegenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getGenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getGenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getGenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getGenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getGenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getGenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getGenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getGenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getGenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getGenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getGenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getGenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getGenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getGenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getGenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdImages
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images"
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
    private com.squareup.okhttp.Call getItemsByIdImagesValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdImages(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdImagesCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets information about an item&#x27;s images
     * Requires authentication as user
     * @param id Item Id (required)
     * @return List&lt;ImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ImageInfo> getItemsByIdImages(String id) throws ApiException {
        ApiResponse<List<ImageInfo>> resp = getItemsByIdImagesWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets information about an item&#x27;s images
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;List&lt;ImageInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ImageInfo>> getItemsByIdImagesWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdImagesValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<List<ImageInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets information about an item&#x27;s images (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesAsync(String id, final ApiCallback<List<ImageInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdImagesValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ImageInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdImagesByType
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getItemsByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getItemsByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdImagesByType(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getItemsByIdImagesByTypeWithHttpInfo(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeAsync(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdImagesByTypeByIndex
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getItemsByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdImagesByTypeByIndex(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getItemsByIdImagesByTypeByIndexWithHttpInfo(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCall(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}"
            .replaceAll("\\{" + "PercentPlayed" + "\\}", apiClient.escapeString(percentPlayed.toString()))
            .replaceAll("\\{" + "UnPlayedCount" + "\\}", apiClient.escapeString(unPlayedCount.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MaxWidth" + "\\}", apiClient.escapeString(maxWidth.toString()))
            .replaceAll("\\{" + "MaxHeight" + "\\}", apiClient.escapeString(maxHeight.toString()))
            .replaceAll("\\{" + "Tag" + "\\}", apiClient.escapeString(tag.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'percentPlayed' is set
        if (percentPlayed == null) {
            throw new ApiException("Missing the required parameter 'percentPlayed' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'unPlayedCount' is set
        if (unPlayedCount == null) {
            throw new ApiException("Missing the required parameter 'unPlayedCount' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new ApiException("Missing the required parameter 'maxWidth' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new ApiException("Missing the required parameter 'maxHeight' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountAsync(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getMusicgenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMusicgenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getMusicgenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getMusicgenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getMusicgenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getMusicgenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getMusicgenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getMusicgenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getMusicgenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getMusicgenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMusicgenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPersonsByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPersonsByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Persons/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getPersonsByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPersonsByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getPersonsByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getPersonsByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getPersonsByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getPersonsByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPersonsByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPersonsByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPersonsByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Persons/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getPersonsByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPersonsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getPersonsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getPersonsByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getPersonsByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getPersonsByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getPersonsByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPersonsByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPersonsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getStudiosByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStudiosByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Studios/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getStudiosByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getStudiosByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getStudiosByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getStudiosByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getStudiosByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getStudiosByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStudiosByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getStudiosByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStudiosByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Studios/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getStudiosByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getStudiosByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getStudiosByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getStudiosByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getStudiosByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getStudiosByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getStudiosByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStudiosByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStudiosByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getUsersByIdImagesByType
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html"> Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByIdImagesByTypeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call getUsersByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getUsersByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html"> Documentation</a>
     */
    public void getUsersByIdImagesByType(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        getUsersByIdImagesByTypeWithHttpInfo(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html"> Documentation</a>
     */
    public ApiResponse<Void> getUsersByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * API Documentation: Authentication
     * @see <a href="https://dev.emby.media/doc/restapi/User-Authentication.html"> Documentation</a>
     */
    public com.squareup.okhttp.Call getUsersByIdImagesByTypeAsync(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getUsersByIdImagesByTypeByIndex
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call getUsersByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling getUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getUsersByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeByIndexCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getUsersByIdImagesByTypeByIndex(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        getUsersByIdImagesByTypeByIndexWithHttpInfo(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getUsersByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headArtistsByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headArtistsByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headArtistsByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headArtistsByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headArtistsByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headArtistsByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headArtistsByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headArtistsByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headArtistsByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headArtistsByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headArtistsByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Artists/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headArtistsByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headArtistsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headArtistsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headArtistsByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headArtistsByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headArtistsByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headArtistsByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headArtistsByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headArtistsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headGamegenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headGamegenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GameGenres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headGamegenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headGamegenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headGamegenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headGamegenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headGamegenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headGamegenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headGamegenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headGamegenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headGamegenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/GameGenres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headGamegenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headGamegenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headGamegenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headGamegenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headGamegenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headGamegenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headGamegenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headGamegenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headGamegenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headGenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headGenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headGenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headGenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headGenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headGenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headGenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headGenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headGenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headGenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headGenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Genres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headGenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headGenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headGenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headGenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headGenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headGenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headGenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headGenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headGenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headItemsByIdImagesByType
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headItemsByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headItemsByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headItemsByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headItemsByIdImagesByType(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headItemsByIdImagesByTypeWithHttpInfo(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headItemsByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeAsync(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headItemsByIdImagesByTypeByIndex
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headItemsByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headItemsByIdImagesByTypeByIndex(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headItemsByIdImagesByTypeByIndexWithHttpInfo(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headItemsByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCall(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}"
            .replaceAll("\\{" + "PercentPlayed" + "\\}", apiClient.escapeString(percentPlayed.toString()))
            .replaceAll("\\{" + "UnPlayedCount" + "\\}", apiClient.escapeString(unPlayedCount.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MaxWidth" + "\\}", apiClient.escapeString(maxWidth.toString()))
            .replaceAll("\\{" + "MaxHeight" + "\\}", apiClient.escapeString(maxHeight.toString()))
            .replaceAll("\\{" + "Tag" + "\\}", apiClient.escapeString(tag.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'percentPlayed' is set
        if (percentPlayed == null) {
            throw new ApiException("Missing the required parameter 'percentPlayed' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'unPlayedCount' is set
        if (unPlayedCount == null) {
            throw new ApiException("Missing the required parameter 'unPlayedCount' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new ApiException("Missing the required parameter 'maxWidth' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new ApiException("Missing the required parameter 'maxHeight' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Async)");
        }
        
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountWithHttpInfo(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param percentPlayed  (required)
     * @param unPlayedCount  (required)
     * @param id Item Id (required)
     * @param maxWidth The maximum image width to return. (required)
     * @param maxHeight The maximum image height to return. (required)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountAsync(Integer percentPlayed, Integer unPlayedCount, String id, Integer maxWidth, Integer maxHeight, String tag, String format, ImageType type, Integer index, Integer width, Integer height, Integer quality, Boolean cropWhitespace, Boolean enableImageEnhancers, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountValidateBeforeCall(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headMusicgenresByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headMusicgenresByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headMusicgenresByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headMusicgenresByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headMusicgenresByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headMusicgenresByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headMusicgenresByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/MusicGenres/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headMusicgenresByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headMusicgenresByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headMusicgenresByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headMusicgenresByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headMusicgenresByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headMusicgenresByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headPersonsByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headPersonsByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Persons/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headPersonsByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headPersonsByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headPersonsByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headPersonsByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headPersonsByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headPersonsByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headPersonsByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headPersonsByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headPersonsByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Persons/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headPersonsByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headPersonsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headPersonsByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headPersonsByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headPersonsByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headPersonsByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headPersonsByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headPersonsByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headPersonsByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headStudiosByNameImagesByType
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headStudiosByNameImagesByTypeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Studios/{Name}/Images/{Type}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headStudiosByNameImagesByTypeValidateBeforeCall(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headStudiosByNameImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headStudiosByNameImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headStudiosByNameImagesByType(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headStudiosByNameImagesByTypeWithHttpInfo(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headStudiosByNameImagesByTypeWithHttpInfo(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headStudiosByNameImagesByTypeAsync(String name, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeValidateBeforeCall(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headStudiosByNameImagesByTypeByIndex
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headStudiosByNameImagesByTypeByIndexCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Studios/{Name}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headStudiosByNameImagesByTypeByIndexValidateBeforeCall(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling headStudiosByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headStudiosByNameImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headStudiosByNameImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeByIndexCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headStudiosByNameImagesByTypeByIndex(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headStudiosByNameImagesByTypeByIndexWithHttpInfo(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headStudiosByNameImagesByTypeByIndexWithHttpInfo(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param name Item name (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headStudiosByNameImagesByTypeByIndexAsync(String name, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headStudiosByNameImagesByTypeByIndexValidateBeforeCall(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headUsersByIdImagesByType
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headUsersByIdImagesByTypeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call headUsersByIdImagesByTypeValidateBeforeCall(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headUsersByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headUsersByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headUsersByIdImagesByType(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        headUsersByIdImagesByTypeWithHttpInfo(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headUsersByIdImagesByTypeWithHttpInfo(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headUsersByIdImagesByTypeAsync(String id, ImageType type, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeValidateBeforeCall(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headUsersByIdImagesByTypeByIndex
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headUsersByIdImagesByTypeByIndexCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (quality != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Quality", quality));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Tag", tag));
        if (cropWhitespace != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CropWhitespace", cropWhitespace));
        if (enableImageEnhancers != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableImageEnhancers", enableImageEnhancers));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Format", format));
        if (backgroundColor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("BackgroundColor", backgroundColor));
        if (foregroundLayer != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ForegroundLayer", foregroundLayer));
        if (autoOrient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AutoOrient", autoOrient));
        if (keepAnimation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("KeepAnimation", keepAnimation));

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
    private com.squareup.okhttp.Call headUsersByIdImagesByTypeByIndexValidateBeforeCall(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling headUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headUsersByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeByIndexCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headUsersByIdImagesByTypeByIndex(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        headUsersByIdImagesByTypeByIndexWithHttpInfo(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headUsersByIdImagesByTypeByIndexWithHttpInfo(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation) throws ApiException {
        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param maxWidth The maximum image width to return. (optional)
     * @param maxHeight The maximum image height to return. (optional)
     * @param width The fixed image width to return. (optional)
     * @param height The fixed image height to return. (optional)
     * @param quality Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
     * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
     * @param cropWhitespace Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
     * @param enableImageEnhancers Enable or disable image enhancers such as cover art. (optional)
     * @param format Determines the output foramt of the image - original,gif,jpg,png (optional)
     * @param backgroundColor Optional. Apply a background color for transparent images. (optional)
     * @param foregroundLayer Optional. Apply a foreground layer on top of the image. (optional)
     * @param autoOrient Set to true to force normalization of orientation in the event the renderer does not support it. (optional)
     * @param keepAnimation Set to true to retain image animation (when supported). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headUsersByIdImagesByTypeByIndexAsync(String id, ImageType type, Integer index, Integer maxWidth, Integer maxHeight, Integer width, Integer height, Integer quality, String tag, Boolean cropWhitespace, Boolean enableImageEnhancers, String format, String backgroundColor, String foregroundLayer, Boolean autoOrient, Boolean keepAnimation, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headUsersByIdImagesByTypeByIndexValidateBeforeCall(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByType
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeValidateBeforeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsByIdImagesByType(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeCall(body, id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByType(Object body, String id, ImageType type, Integer index) throws ApiException {
        postItemsByIdImagesByTypeWithHttpInfo(body, id, type, index);
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeWithHttpInfo(Object body, String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeValidateBeforeCall(body, id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uploads an image for an item, must be base64 encoded. (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeAsync(Object body, String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeValidateBeforeCall(body, id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByTypeByIndex
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexValidateBeforeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postItemsByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexCall(body, id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByTypeByIndex(Object body, String id, ImageType type, Integer index) throws ApiException {
        postItemsByIdImagesByTypeByIndexWithHttpInfo(body, id, type, index);
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeByIndexWithHttpInfo(Object body, String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexValidateBeforeCall(body, id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uploads an image for an item, must be base64 encoded. (asynchronously)
     * Requires authentication as administrator
     * @param body Binary stream (required)
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexAsync(Object body, String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexValidateBeforeCall(body, id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByTypeByIndexDelete
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexDeleteCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexDeleteValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByTypeByIndexDelete(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByTypeByIndexDelete(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postItemsByIdImagesByTypeByIndexDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexDeleteCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByTypeByIndexDelete(String id, ImageType type, Integer index) throws ApiException {
        postItemsByIdImagesByTypeByIndexDeleteWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeByIndexDeleteWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexDeleteValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexDeleteAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexDeleteValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByTypeByIndexIndex
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param newIndex The new image index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexIndexCall(String id, ImageType type, Integer index, Integer newIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}/Index"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (newIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("NewIndex", newIndex));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexIndexValidateBeforeCall(String id, ImageType type, Integer index, Integer newIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByTypeByIndexIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByTypeByIndexIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postItemsByIdImagesByTypeByIndexIndex(Async)");
        }
        // verify the required parameter 'newIndex' is set
        if (newIndex == null) {
            throw new ApiException("Missing the required parameter 'newIndex' when calling postItemsByIdImagesByTypeByIndexIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexIndexCall(id, type, index, newIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param newIndex The new image index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByTypeByIndexIndex(String id, ImageType type, Integer index, Integer newIndex) throws ApiException {
        postItemsByIdImagesByTypeByIndexIndexWithHttpInfo(id, type, index, newIndex);
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param newIndex The new image index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeByIndexIndexWithHttpInfo(String id, ImageType type, Integer index, Integer newIndex) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexIndexValidateBeforeCall(id, type, index, newIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates the index for an item image (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param newIndex The new image index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexIndexAsync(String id, ImageType type, Integer index, Integer newIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexIndexValidateBeforeCall(id, type, index, newIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByTypeByIndexUrl
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param url The url for the new image (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexUrlCall(String id, ImageType type, Integer index, String url, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/{Index}/Url"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Url", url));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexUrlValidateBeforeCall(String id, ImageType type, Integer index, String url, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByTypeByIndexUrl(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByTypeByIndexUrl(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postItemsByIdImagesByTypeByIndexUrl(Async)");
        }
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling postItemsByIdImagesByTypeByIndexUrl(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexUrlCall(id, type, index, url, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param url The url for the new image (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByTypeByIndexUrl(String id, ImageType type, Integer index, String url) throws ApiException {
        postItemsByIdImagesByTypeByIndexUrlWithHttpInfo(id, type, index, url);
    }

    /**
     * Updates the index for an item image
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param url The url for the new image (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeByIndexUrlWithHttpInfo(String id, ImageType type, Integer index, String url) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexUrlValidateBeforeCall(id, type, index, url, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates the index for an item image (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param url The url for the new image (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeByIndexUrlAsync(String id, ImageType type, Integer index, String url, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeByIndexUrlValidateBeforeCall(id, type, index, url, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdImagesByTypeDelete
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeDeleteCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Images/{Type}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call postItemsByIdImagesByTypeDeleteValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdImagesByTypeDelete(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postItemsByIdImagesByTypeDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeDeleteCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdImagesByTypeDelete(String id, ImageType type, Integer index) throws ApiException {
        postItemsByIdImagesByTypeDeleteWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdImagesByTypeDeleteWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeDeleteValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as administrator
     * @param id Item Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdImagesByTypeDeleteAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdImagesByTypeDeleteValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdImagesByType
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call postUsersByIdImagesByTypeValidateBeforeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdImagesByType(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdImagesByType(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postUsersByIdImagesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeCall(body, id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdImagesByType(Object body, String id, ImageType type, Integer index) throws ApiException {
        postUsersByIdImagesByTypeWithHttpInfo(body, id, type, index);
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdImagesByTypeWithHttpInfo(Object body, String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeValidateBeforeCall(body, id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uploads an image for an item, must be base64 encoded. (asynchronously)
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeAsync(Object body, String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeValidateBeforeCall(body, id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdImagesByTypeByIndex
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexValidateBeforeCall(Object body, String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postUsersByIdImagesByTypeByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postUsersByIdImagesByTypeByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexCall(body, id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdImagesByTypeByIndex(Object body, String id, ImageType type, Integer index) throws ApiException {
        postUsersByIdImagesByTypeByIndexWithHttpInfo(body, id, type, index);
    }

    /**
     * Uploads an image for an item, must be base64 encoded.
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdImagesByTypeByIndexWithHttpInfo(Object body, String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexValidateBeforeCall(body, id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uploads an image for an item, must be base64 encoded. (asynchronously)
     * Requires authentication as user
     * @param body Binary stream (required)
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexAsync(Object body, String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexValidateBeforeCall(body, id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdImagesByTypeByIndexDelete
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexDeleteCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/{Index}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

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
    private com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexDeleteValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdImagesByTypeByIndexDelete(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postUsersByIdImagesByTypeByIndexDelete(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postUsersByIdImagesByTypeByIndexDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexDeleteCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdImagesByTypeByIndexDelete(String id, ImageType type, Integer index) throws ApiException {
        postUsersByIdImagesByTypeByIndexDeleteWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdImagesByTypeByIndexDeleteWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexDeleteValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeByIndexDeleteAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeByIndexDeleteValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postUsersByIdImagesByTypeDelete
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeDeleteCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Users/{Id}/Images/{Type}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Type" + "\\}", apiClient.escapeString(type.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Index", index));

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
    private com.squareup.okhttp.Call postUsersByIdImagesByTypeDeleteValidateBeforeCall(String id, ImageType type, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postUsersByIdImagesByTypeDelete(Async)");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling postUsersByIdImagesByTypeDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeDeleteCall(id, type, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUsersByIdImagesByTypeDelete(String id, ImageType type, Integer index) throws ApiException {
        postUsersByIdImagesByTypeDeleteWithHttpInfo(id, type, index);
    }

    /**
     * 
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUsersByIdImagesByTypeDeleteWithHttpInfo(String id, ImageType type, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeDeleteValidateBeforeCall(id, type, index, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id User Id (required)
     * @param type Image Type (required)
     * @param index Image Index (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUsersByIdImagesByTypeDeleteAsync(String id, ImageType type, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUsersByIdImagesByTypeDeleteValidateBeforeCall(id, type, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
