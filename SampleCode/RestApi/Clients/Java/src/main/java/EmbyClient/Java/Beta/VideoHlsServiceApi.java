/*
 * Emby Server REST API (BETA)
 * 
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


import io.swagger.client.model.DlnaSubtitleDeliveryMethod;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoHlsServiceApi {
    private ApiClient apiClient;

    public VideoHlsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoHlsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(String segmentContainer, String segmentId, String id, String playlistId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'segmentContainer' is set
        if (segmentContainer == null) {
            throw new ApiException("Missing the required parameter 'segmentContainer' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException("Missing the required parameter 'segmentId' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new ApiException("Missing the required parameter 'playlistId' when calling getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * No authentication required
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
    }

    /**
     * 
     * No authentication required
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(String segmentContainer, String segmentId, String id, String playlistId) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * No authentication required
     * @param segmentContainer  (required)
     * @param segmentId  (required)
     * @param id  (required)
     * @param playlistId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerAsync(String segmentContainer, String segmentId, String id, String playlistId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerValidateBeforeCall(segmentContainer, segmentId, id, playlistId, progressListener, progressRequestListener);
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
     * @param profile Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)
     * @param level Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)
     * @param framerate Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param maxFramerate Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxRefFrames Optional. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveM3u8Call(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, String profile, String level, Float framerate, Float maxFramerate, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, Integer maxRefFrames, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
        if (profile != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Profile", profile));
        if (level != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Level", level));
        if (framerate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Framerate", framerate));
        if (maxFramerate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxFramerate", maxFramerate));
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
        if (maxRefFrames != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("MaxRefFrames", maxRefFrames));
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
    private com.squareup.okhttp.Call getVideosByIdLiveM3u8ValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, String profile, String level, Float framerate, Float maxFramerate, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, Integer maxRefFrames, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdLiveM3u8(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdLiveM3u8(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8Call(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
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
     * @param profile Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)
     * @param level Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)
     * @param framerate Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param maxFramerate Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxRefFrames Optional. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getVideosByIdLiveM3u8(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, String profile, String level, Float framerate, Float maxFramerate, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, Integer maxRefFrames, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdLiveM3u8WithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
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
     * @param profile Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)
     * @param level Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)
     * @param framerate Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param maxFramerate Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxRefFrames Optional. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getVideosByIdLiveM3u8WithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, String profile, String level, Float framerate, Float maxFramerate, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, Integer maxRefFrames, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
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
     * @param profile Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)
     * @param level Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)
     * @param framerate Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param maxFramerate Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
     * @param copyTimestamps Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
     * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)
     * @param width Optional. The fixed horizontal resolution of the encoded video. (optional)
     * @param height Optional. The fixed vertical resolution of the encoded video. (optional)
     * @param maxWidth Optional. The maximum horizontal resolution of the encoded video. (optional)
     * @param maxHeight Optional. The maximum vertical resolution of the encoded video. (optional)
     * @param videoBitRate Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
     * @param subtitleStreamIndex Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
     * @param subtitleMethod Optional. Specify the subtitle delivery method. (optional)
     * @param maxRefFrames Optional. (optional)
     * @param maxVideoBitDepth Optional. (optional)
     * @param videoCodec Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)
     * @param audioStreamIndex Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
     * @param videoStreamIndex Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVideosByIdLiveM3u8Async(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, String profile, String level, Float framerate, Float maxFramerate, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, Integer maxRefFrames, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdLiveM3u8ValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
