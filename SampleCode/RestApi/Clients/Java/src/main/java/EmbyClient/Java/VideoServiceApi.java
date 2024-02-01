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

public class VideoServiceApi {
    private ApiClient apiClient;

    public VideoServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VideoServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getVideosByIdByStreamfilename
     * @param streamFileName  (required)
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
    public com.squareup.okhttp.Call getVideosByIdByStreamfilenameCall(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{StreamFileName}"
            .replaceAll("\\{" + "StreamFileName" + "\\}", apiClient.escapeString(streamFileName.toString()))
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
    private com.squareup.okhttp.Call getVideosByIdByStreamfilenameValidateBeforeCall(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'streamFileName' is set
        if (streamFileName == null) {
            throw new ApiException("Missing the required parameter 'streamFileName' when calling getVideosByIdByStreamfilename(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdByStreamfilename(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdByStreamfilename(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdByStreamfilenameCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public void getVideosByIdByStreamfilename(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdByStreamfilenameWithHttpInfo(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public ApiResponse<Void> getVideosByIdByStreamfilenameWithHttpInfo(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdByStreamfilenameValidateBeforeCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public com.squareup.okhttp.Call getVideosByIdByStreamfilenameAsync(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdByStreamfilenameValidateBeforeCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdStream
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
    public com.squareup.okhttp.Call getVideosByIdStreamCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/stream"
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
    private com.squareup.okhttp.Call getVideosByIdStreamValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdStream(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdStream(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdStreamCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
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
    public void getVideosByIdStream(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdStreamWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
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
    public ApiResponse<Void> getVideosByIdStreamWithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdStreamValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
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
    public com.squareup.okhttp.Call getVideosByIdStreamAsync(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdStreamValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getVideosByIdStreamByContainer
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
    public com.squareup.okhttp.Call getVideosByIdStreamByContainerCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/stream.{Container}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Container" + "\\}", apiClient.escapeString(container.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
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
    private com.squareup.okhttp.Call getVideosByIdStreamByContainerValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVideosByIdStreamByContainer(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling getVideosByIdStreamByContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = getVideosByIdStreamByContainerCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
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
    public void getVideosByIdStreamByContainer(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        getVideosByIdStreamByContainerWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
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
    public ApiResponse<Void> getVideosByIdStreamByContainerWithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = getVideosByIdStreamByContainerValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
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
    public com.squareup.okhttp.Call getVideosByIdStreamByContainerAsync(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVideosByIdStreamByContainerValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdByStreamfilename
     * @param streamFileName  (required)
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
    public com.squareup.okhttp.Call headVideosByIdByStreamfilenameCall(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/{StreamFileName}"
            .replaceAll("\\{" + "StreamFileName" + "\\}", apiClient.escapeString(streamFileName.toString()))
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
    private com.squareup.okhttp.Call headVideosByIdByStreamfilenameValidateBeforeCall(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'streamFileName' is set
        if (streamFileName == null) {
            throw new ApiException("Missing the required parameter 'streamFileName' when calling headVideosByIdByStreamfilename(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdByStreamfilename(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headVideosByIdByStreamfilename(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdByStreamfilenameCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public void headVideosByIdByStreamfilename(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        headVideosByIdByStreamfilenameWithHttpInfo(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public ApiResponse<Void> headVideosByIdByStreamfilenameWithHttpInfo(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdByStreamfilenameValidateBeforeCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
     * Requires authentication as user
     * @param streamFileName  (required)
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
    public com.squareup.okhttp.Call headVideosByIdByStreamfilenameAsync(String streamFileName, String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdByStreamfilenameValidateBeforeCall(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdStream
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
    public com.squareup.okhttp.Call headVideosByIdStreamCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/stream"
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
    private com.squareup.okhttp.Call headVideosByIdStreamValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdStream(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headVideosByIdStream(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdStreamCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
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
    public void headVideosByIdStream(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        headVideosByIdStreamWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
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
    public ApiResponse<Void> headVideosByIdStreamWithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdStreamValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
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
    public com.squareup.okhttp.Call headVideosByIdStreamAsync(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdStreamValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for headVideosByIdStreamByContainer
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
    public com.squareup.okhttp.Call headVideosByIdStreamByContainerCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/Videos/{Id}/stream.{Container}"
            .replaceAll("\\{" + "Id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "Container" + "\\}", apiClient.escapeString(container.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deviceProfileId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceProfileId", deviceProfileId));
        if (deviceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("DeviceId", deviceId));
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
    private com.squareup.okhttp.Call headVideosByIdStreamByContainerValidateBeforeCall(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling headVideosByIdStreamByContainer(Async)");
        }
        // verify the required parameter 'container' is set
        if (container == null) {
            throw new ApiException("Missing the required parameter 'container' when calling headVideosByIdStreamByContainer(Async)");
        }
        
        com.squareup.okhttp.Call call = headVideosByIdStreamByContainerCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a video stream
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
    public void headVideosByIdStreamByContainer(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        headVideosByIdStreamByContainerWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
    }

    /**
     * Gets a video stream
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
    public ApiResponse<Void> headVideosByIdStreamByContainerWithHttpInfo(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex) throws ApiException {
        com.squareup.okhttp.Call call = headVideosByIdStreamByContainerValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a video stream (asynchronously)
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
    public com.squareup.okhttp.Call headVideosByIdStreamByContainerAsync(String id, String container, String deviceProfileId, String deviceId, String audioCodec, Boolean enableAutoStreamCopy, Integer audioSampleRate, Integer audioBitRate, Integer audioChannels, Integer maxAudioChannels, Boolean _static, Boolean copyTimestamps, Long startTimeTicks, Integer width, Integer height, Integer maxWidth, Integer maxHeight, Integer videoBitRate, Integer subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, Integer maxVideoBitDepth, String videoCodec, Integer audioStreamIndex, Integer videoStreamIndex, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = headVideosByIdStreamByContainerValidateBeforeCall(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
