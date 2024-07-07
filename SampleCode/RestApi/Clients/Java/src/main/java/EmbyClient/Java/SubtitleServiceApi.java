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


import io.swagger.client.model.RemoteSubtitleInfo;
import io.swagger.client.model.SubtitlesSubtitleDownloadResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubtitleServiceApi {
    private ApiClient apiClient;

    public SubtitleServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubtitleServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteItemsByIdSubtitlesByIndex
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdSubtitlesByIndexCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Subtitles/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));

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
    private com.squareup.okhttp.Call deleteItemsByIdSubtitlesByIndexValidateBeforeCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteItemsByIdSubtitlesByIndex(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling deleteItemsByIdSubtitlesByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling deleteItemsByIdSubtitlesByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteItemsByIdSubtitlesByIndexCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteItemsByIdSubtitlesByIndex(String id, String mediaSourceId, Integer index) throws ApiException {
        deleteItemsByIdSubtitlesByIndexWithHttpInfo(id, mediaSourceId, index);
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteItemsByIdSubtitlesByIndexWithHttpInfo(String id, String mediaSourceId, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteItemsByIdSubtitlesByIndexValidateBeforeCall(id, mediaSourceId, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an external subtitle file (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteItemsByIdSubtitlesByIndexAsync(String id, String mediaSourceId, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteItemsByIdSubtitlesByIndexValidateBeforeCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteVideosByIdSubtitlesByIndex
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteVideosByIdSubtitlesByIndexCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/Subtitles/{Index}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));

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
    private com.squareup.okhttp.Call deleteVideosByIdSubtitlesByIndexValidateBeforeCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteVideosByIdSubtitlesByIndex(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling deleteVideosByIdSubtitlesByIndex(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling deleteVideosByIdSubtitlesByIndex(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteVideosByIdSubtitlesByIndexCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteVideosByIdSubtitlesByIndex(String id, String mediaSourceId, Integer index) throws ApiException {
        deleteVideosByIdSubtitlesByIndexWithHttpInfo(id, mediaSourceId, index);
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteVideosByIdSubtitlesByIndexWithHttpInfo(String id, String mediaSourceId, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = deleteVideosByIdSubtitlesByIndexValidateBeforeCall(id, mediaSourceId, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an external subtitle file (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVideosByIdSubtitlesByIndexAsync(String id, String mediaSourceId, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVideosByIdSubtitlesByIndexValidateBeforeCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "StartPositionTicks" + "\\}", apiClient.escapeString(startPositionTicks.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'startPositionTicks' is set
        if (startPositionTicks == null) {
            throw new ApiException("Missing the required parameter 'startPositionTicks' when calling getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartPositionTicks", startPositionTicks));
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getItemsByIdRemotesearchSubtitlesByLanguage
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param language Language (required)
     * @param isPerfectMatch IsPerfectMatch (optional)
     * @param isForced IsForced (optional)
     * @param isHearingImpaired IsHearingImpaired (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemotesearchSubtitlesByLanguageCall(String id, String mediaSourceId, String language, Boolean isPerfectMatch, Boolean isForced, Boolean isHearingImpaired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{Language}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Language" + "\\}", apiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));
        if (isPerfectMatch != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsPerfectMatch", isPerfectMatch));
        if (isForced != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsForced", isForced));
        if (isHearingImpaired != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IsHearingImpaired", isHearingImpaired));

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
    private com.squareup.okhttp.Call getItemsByIdRemotesearchSubtitlesByLanguageValidateBeforeCall(String id, String mediaSourceId, String language, Boolean isPerfectMatch, Boolean isForced, Boolean isHearingImpaired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getItemsByIdRemotesearchSubtitlesByLanguage(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling getItemsByIdRemotesearchSubtitlesByLanguage(Async)");
        }
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getItemsByIdRemotesearchSubtitlesByLanguage(Async)");
        }
        
        com.squareup.okhttp.Call call = getItemsByIdRemotesearchSubtitlesByLanguageCall(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param language Language (required)
     * @param isPerfectMatch IsPerfectMatch (optional)
     * @param isForced IsForced (optional)
     * @param isHearingImpaired IsHearingImpaired (optional)
     * @return List&lt;RemoteSubtitleInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<RemoteSubtitleInfo> getItemsByIdRemotesearchSubtitlesByLanguage(String id, String mediaSourceId, String language, Boolean isPerfectMatch, Boolean isForced, Boolean isHearingImpaired) throws ApiException {
        ApiResponse<List<RemoteSubtitleInfo>> resp = getItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired);
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param language Language (required)
     * @param isPerfectMatch IsPerfectMatch (optional)
     * @param isForced IsForced (optional)
     * @param isHearingImpaired IsHearingImpaired (optional)
     * @return ApiResponse&lt;List&lt;RemoteSubtitleInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<RemoteSubtitleInfo>> getItemsByIdRemotesearchSubtitlesByLanguageWithHttpInfo(String id, String mediaSourceId, String language, Boolean isPerfectMatch, Boolean isForced, Boolean isHearingImpaired) throws ApiException {
        com.squareup.okhttp.Call call = getItemsByIdRemotesearchSubtitlesByLanguageValidateBeforeCall(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired, null, null);
        Type localVarReturnType = new TypeToken<List<RemoteSubtitleInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param language Language (required)
     * @param isPerfectMatch IsPerfectMatch (optional)
     * @param isForced IsForced (optional)
     * @param isHearingImpaired IsHearingImpaired (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getItemsByIdRemotesearchSubtitlesByLanguageAsync(String id, String mediaSourceId, String language, Boolean isPerfectMatch, Boolean isForced, Boolean isHearingImpaired, final ApiCallback<List<RemoteSubtitleInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getItemsByIdRemotesearchSubtitlesByLanguageValidateBeforeCall(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<RemoteSubtitleInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProvidersSubtitlesSubtitlesById
     * @param id Item Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProvidersSubtitlesSubtitlesByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Providers/Subtitles/Subtitles/{Id}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProvidersSubtitlesSubtitlesByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProvidersSubtitlesSubtitlesById(Async)");
        }
        
        com.squareup.okhttp.Call call = getProvidersSubtitlesSubtitlesByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getProvidersSubtitlesSubtitlesById(String id) throws ApiException {
        getProvidersSubtitlesSubtitlesByIdWithHttpInfo(id);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getProvidersSubtitlesSubtitlesByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getProvidersSubtitlesSubtitlesByIdValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProvidersSubtitlesSubtitlesByIdAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProvidersSubtitlesSubtitlesByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "StartPositionTicks" + "\\}", apiClient.escapeString(startPositionTicks.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'startPositionTicks' is set
        if (startPositionTicks == null) {
            throw new ApiException("Missing the required parameter 'startPositionTicks' when calling getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartPositionTicks", startPositionTicks));
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "StartPositionTicks" + "\\}", apiClient.escapeString(startPositionTicks.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'startPositionTicks' is set
        if (startPositionTicks == null) {
            throw new ApiException("Missing the required parameter 'startPositionTicks' when calling headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartPositionTicks", startPositionTicks));
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()))
            .replaceAll("\\{" + "StartPositionTicks" + "\\}", apiClient.escapeString(startPositionTicks.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        // verify the required parameter 'startPositionTicks' is set
        if (startPositionTicks == null) {
            throw new ApiException("Missing the required parameter 'startPositionTicks' when calling headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (required)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "MediaSourceId" + "\\}", apiClient.escapeString(mediaSourceId.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()))
            .replaceAll("\\{" + "Format" + "\\}", apiClient.escapeString(format.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartPositionTicks", startPositionTicks));
        if (endPositionTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndPositionTicks", endPositionTicks));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));

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
    private com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);
    }

    /**
     * Gets subtitles in a specified format.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatWithHttpInfo(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets subtitles in a specified format. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param format Format (required)
     * @param startPositionTicks StartPositionTicks (optional)
     * @param endPositionTicks EndPositionTicks (optional)
     * @param copyTimestamps CopyTimestamps (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatAsync(String id, String mediaSourceId, Integer index, String format, Long startPositionTicks, Long endPositionTicks, Boolean copyTimestamps, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatValidateBeforeCall(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdRemotesearchSubtitlesBySubtitleid
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param subtitleId SubtitleId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRemotesearchSubtitlesBySubtitleidCall(String id, String mediaSourceId, String subtitleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "SubtitleId" + "\\}", apiClient.escapeString(subtitleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postItemsByIdRemotesearchSubtitlesBySubtitleidValidateBeforeCall(String id, String mediaSourceId, String subtitleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdRemotesearchSubtitlesBySubtitleid(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postItemsByIdRemotesearchSubtitlesBySubtitleid(Async)");
        }
        // verify the required parameter 'subtitleId' is set
        if (subtitleId == null) {
            throw new ApiException("Missing the required parameter 'subtitleId' when calling postItemsByIdRemotesearchSubtitlesBySubtitleid(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdRemotesearchSubtitlesBySubtitleidCall(id, mediaSourceId, subtitleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param subtitleId SubtitleId (required)
     * @return SubtitlesSubtitleDownloadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubtitlesSubtitleDownloadResult postItemsByIdRemotesearchSubtitlesBySubtitleid(String id, String mediaSourceId, String subtitleId) throws ApiException {
        ApiResponse<SubtitlesSubtitleDownloadResult> resp = postItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo(id, mediaSourceId, subtitleId);
        return resp.getData();
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param subtitleId SubtitleId (required)
     * @return ApiResponse&lt;SubtitlesSubtitleDownloadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubtitlesSubtitleDownloadResult> postItemsByIdRemotesearchSubtitlesBySubtitleidWithHttpInfo(String id, String mediaSourceId, String subtitleId) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdRemotesearchSubtitlesBySubtitleidValidateBeforeCall(id, mediaSourceId, subtitleId, null, null);
        Type localVarReturnType = new TypeToken<SubtitlesSubtitleDownloadResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param subtitleId SubtitleId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdRemotesearchSubtitlesBySubtitleidAsync(String id, String mediaSourceId, String subtitleId, final ApiCallback<SubtitlesSubtitleDownloadResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdRemotesearchSubtitlesBySubtitleidValidateBeforeCall(id, mediaSourceId, subtitleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubtitlesSubtitleDownloadResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postItemsByIdSubtitlesByIndexDelete
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdSubtitlesByIndexDeleteCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Items/{Id}/Subtitles/{Index}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));

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
    private com.squareup.okhttp.Call postItemsByIdSubtitlesByIndexDeleteValidateBeforeCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postItemsByIdSubtitlesByIndexDelete(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postItemsByIdSubtitlesByIndexDelete(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postItemsByIdSubtitlesByIndexDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postItemsByIdSubtitlesByIndexDeleteCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postItemsByIdSubtitlesByIndexDelete(String id, String mediaSourceId, Integer index) throws ApiException {
        postItemsByIdSubtitlesByIndexDeleteWithHttpInfo(id, mediaSourceId, index);
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postItemsByIdSubtitlesByIndexDeleteWithHttpInfo(String id, String mediaSourceId, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postItemsByIdSubtitlesByIndexDeleteValidateBeforeCall(id, mediaSourceId, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an external subtitle file (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postItemsByIdSubtitlesByIndexDeleteAsync(String id, String mediaSourceId, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postItemsByIdSubtitlesByIndexDeleteValidateBeforeCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postVideosByIdSubtitlesByIndexDelete
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postVideosByIdSubtitlesByIndexDeleteCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/Subtitles/{Index}/Delete"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (mediaSourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MediaSourceId", mediaSourceId));

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
    private com.squareup.okhttp.Call postVideosByIdSubtitlesByIndexDeleteValidateBeforeCall(String id, String mediaSourceId, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling postVideosByIdSubtitlesByIndexDelete(Async)");
        }
        // verify the required parameter 'mediaSourceId' is set
        if (mediaSourceId == null) {
            throw new ApiException("Missing the required parameter 'mediaSourceId' when calling postVideosByIdSubtitlesByIndexDelete(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling postVideosByIdSubtitlesByIndexDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = postVideosByIdSubtitlesByIndexDeleteCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postVideosByIdSubtitlesByIndexDelete(String id, String mediaSourceId, Integer index) throws ApiException {
        postVideosByIdSubtitlesByIndexDeleteWithHttpInfo(id, mediaSourceId, index);
    }

    /**
     * Deletes an external subtitle file
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postVideosByIdSubtitlesByIndexDeleteWithHttpInfo(String id, String mediaSourceId, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = postVideosByIdSubtitlesByIndexDeleteValidateBeforeCall(id, mediaSourceId, index, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an external subtitle file (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param mediaSourceId MediaSourceId (required)
     * @param index The subtitle stream index (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postVideosByIdSubtitlesByIndexDeleteAsync(String id, String mediaSourceId, Integer index, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postVideosByIdSubtitlesByIndexDeleteValidateBeforeCall(id, mediaSourceId, index, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
