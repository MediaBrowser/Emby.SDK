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


import io.swagger.client.model.SubtitleDeliveryMethod;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicHlsServiceApi {
    private ApiClient apiClient;

    public DynamicHlsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DynamicHlsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
    private com.squareup.okhttp.Call getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAudioByIdLiveM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdLiveM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/live.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getAudioByIdLiveM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdLiveM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getAudioByIdLiveM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdLiveM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdLiveM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getAudioByIdLiveM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdLiveM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdLiveM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAudioByIdMainM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdMainM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/main.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getAudioByIdMainM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdMainM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getAudioByIdMainM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdMainM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdMainM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getAudioByIdMainM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdMainM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdMainM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdMainM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdMainM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAudioByIdMasterM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdMasterM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/master.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getAudioByIdMasterM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudioByIdMasterM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getAudioByIdMasterM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudioByIdMasterM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getAudioByIdMasterM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getAudioByIdMasterM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getAudioByIdMasterM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getAudioByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudioByIdMasterM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAudioByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
    private com.squareup.okhttp.Call getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdLiveM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/live.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getVideosByIdLiveM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdLiveM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdLiveM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdLiveM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdLiveM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * 
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdLiveM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdLiveSubtitlesM3u8
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveSubtitlesM3u8Call(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/live_subtitles.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (subtitleSegmentLength != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleSegmentLength", subtitleSegmentLength));
        if (manifestSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ManifestSubtitles", manifestSubtitles));

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
    private com.squareup.okhttp.Call getVideosByIdLiveSubtitlesM3u8ValidateBeforeCall(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdLiveSubtitlesM3u8(Async)");
        }
        // verify the required parameter 'subtitleSegmentLength' is set
        if (subtitleSegmentLength == null) {
            throw new ApiException("Missing the required parameter 'subtitleSegmentLength' when calling getVideosByIdLiveSubtitlesM3u8(Async)");
        }
        // verify the required parameter 'manifestSubtitles' is set
        if (manifestSubtitles == null) {
            throw new ApiException("Missing the required parameter 'manifestSubtitles' when calling getVideosByIdLiveSubtitlesM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdLiveSubtitlesM3u8Call(id, subtitleSegmentLength, manifestSubtitles, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdLiveSubtitlesM3u8(String id, Integer subtitleSegmentLength, String manifestSubtitles) throws ApiException {
        getVideosByIdLiveSubtitlesM3u8WithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdLiveSubtitlesM3u8WithHttpInfo(String id, Integer subtitleSegmentLength, String manifestSubtitles) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdLiveSubtitlesM3u8ValidateBeforeCall(id, subtitleSegmentLength, manifestSubtitles, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an HLS subtitle playlist. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveSubtitlesM3u8Async(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdLiveSubtitlesM3u8ValidateBeforeCall(id, subtitleSegmentLength, manifestSubtitles, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdMainM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdMainM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/main.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getVideosByIdMainM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdMainM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdMainM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdMainM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdMainM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdMainM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdMainM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdMainM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdMainM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdMainM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdMasterM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdMasterM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/master.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call getVideosByIdMasterM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdMasterM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdMasterM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdMasterM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdMasterM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdMasterM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdMasterM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdMasterM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdSubtitlesM3u8
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdSubtitlesM3u8Call(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/subtitles.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (subtitleSegmentLength != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleSegmentLength", subtitleSegmentLength));
        if (manifestSubtitles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ManifestSubtitles", manifestSubtitles));

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
    private com.squareup.okhttp.Call getVideosByIdSubtitlesM3u8ValidateBeforeCall(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdSubtitlesM3u8(Async)");
        }
        // verify the required parameter 'subtitleSegmentLength' is set
        if (subtitleSegmentLength == null) {
            throw new ApiException("Missing the required parameter 'subtitleSegmentLength' when calling getVideosByIdSubtitlesM3u8(Async)");
        }
        // verify the required parameter 'manifestSubtitles' is set
        if (manifestSubtitles == null) {
            throw new ApiException("Missing the required parameter 'manifestSubtitles' when calling getVideosByIdSubtitlesM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdSubtitlesM3u8Call(id, subtitleSegmentLength, manifestSubtitles, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdSubtitlesM3u8(String id, Integer subtitleSegmentLength, String manifestSubtitles) throws ApiException {
        getVideosByIdSubtitlesM3u8WithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);
    }

    /**
     * Gets an HLS subtitle playlist.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdSubtitlesM3u8WithHttpInfo(String id, Integer subtitleSegmentLength, String manifestSubtitles) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdSubtitlesM3u8ValidateBeforeCall(id, subtitleSegmentLength, manifestSubtitles, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an HLS subtitle playlist. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param subtitleSegmentLength The subtitle segment length (required)
     * @param manifestSubtitles The subtitle segment format (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdSubtitlesM3u8Async(String id, Integer subtitleSegmentLength, String manifestSubtitles, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdSubtitlesM3u8ValidateBeforeCall(id, subtitleSegmentLength, manifestSubtitles, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headAudioByIdMasterM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdMasterM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Audio/{Id}/master.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call headAudioByIdMasterM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headAudioByIdMasterM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headAudioByIdMasterM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = headAudioByIdMasterM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headAudioByIdMasterM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        headAudioByIdMasterM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets an audio stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headAudioByIdMasterM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = headAudioByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an audio stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headAudioByIdMasterM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headAudioByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}"
            .replaceAll("\\{" + "SegmentContainer" + "\\}", apiClient.escapeString(segmentContainer.toString()))
            .replaceAll("\\{" + "SegmentId" + "\\}", apiClient.escapeString(segmentId.toString()))
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "PlaylistId" + "\\}", apiClient.escapeString(playlistId.toString()));

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
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Requires authentication as user
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdMasterM3u8
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdMasterM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/master.m3u8"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
        if (container != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Container", container));
        if (audioCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioCodec", audioCodec));
        if (enableAutoStreamCopy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EnableAutoStreamCopy", enableAutoStreamCopy));
        if (audioSampleRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioSampleRate", audioSampleRate));
        if (audioBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioBitRate", audioBitRate));
        if (audioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioChannels", audioChannels));
        if (maxAudioChannels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxAudioChannels", maxAudioChannels));
        if (_static != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Static", _static));
        if (copyTimestamps != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CopyTimestamps", copyTimestamps));
        if (startTimeTicks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartTimeTicks", startTimeTicks));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Width", width));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Height", height));
        if (maxWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxWidth", maxWidth));
        if (maxHeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxHeight", maxHeight));
        if (videoBitRate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoBitRate", videoBitRate));
        if (subtitleStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleStreamIndex", subtitleStreamIndex));
        if (subtitleMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SubtitleMethod", subtitleMethod));
        if (maxVideoBitDepth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxVideoBitDepth", maxVideoBitDepth));
        if (videoCodec != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoCodec", videoCodec));
        if (audioStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("AudioStreamIndex", audioStreamIndex));
        if (videoStreamIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VideoStreamIndex", videoStreamIndex));

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
    private com.squareup.okhttp.Call headVideosByIdMasterM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdMasterM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headVideosByIdMasterM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdMasterM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void headVideosByIdMasterM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        headVideosByIdMasterM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream using HTTP live streaming.
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> headVideosByIdMasterM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream using HTTP live streaming. (asynchronously)
     * Requires authentication as user
     * @param id Item Id (required)
     * @param container Container (required)
     * @param deviceProfileId Optional. The dlna device profile id to utilize. (optional)
     * @param deviceId The device id of the client requesting. Used to stop encoding processes when needed. (optional)
     * @param audioCodec Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)
     * @param enableAutoStreamCopy Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
     * @param audioSampleRate Optional. Specify a specific audio sample rate, e.g. 44100 (optional)
     * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
     * @param audioChannels Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)
     * @param maxAudioChannels Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)
     * @param _static Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call headVideosByIdMasterM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdMasterM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
