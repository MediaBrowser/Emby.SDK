/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;
using EmbyClient.Dotnet.Model;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IDynamicHlsServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdLiveM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdLiveM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdMainM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdMainM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetVideosByIdLiveM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdLiveM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns></returns>
        void GetVideosByIdLiveSubtitlesM3u8 (string id, int? subtitleSegmentLength, string manifestSubtitles);

        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdLiveSubtitlesM3u8WithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetVideosByIdMainM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdMainM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetVideosByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns></returns>
        void GetVideosByIdSubtitlesM3u8 (string id, int? subtitleSegmentLength, string manifestSubtitles);

        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetVideosByIdSubtitlesM3u8WithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void HeadAudioByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        void HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void HeadVideosByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadVideosByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdLiveM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdLiveM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdMainM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdMainM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdLiveM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdLiveM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdLiveSubtitlesM3u8Async (string id, int? subtitleSegmentLength, string manifestSubtitles);

        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdLiveSubtitlesM3u8AsyncWithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdMainM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdMainM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetVideosByIdSubtitlesM3u8Async (string id, int? subtitleSegmentLength, string manifestSubtitles);

        /// <summary>
        /// Gets an HLS subtitle playlist.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdSubtitlesM3u8AsyncWithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId);
        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadVideosByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets a video stream using HTTP live streaming.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class DynamicHlsServiceApi : IDynamicHlsServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DynamicHlsServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DynamicHlsServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DynamicHlsServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public DynamicHlsServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DynamicHlsServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DynamicHlsServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public EmbyClient.Dotnet.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EmbyClient.Dotnet.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdLiveM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetAudioByIdLiveM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdLiveM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdLiveM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdLiveM3u8");

            var localVarPath = "/Audio/{Id}/live.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdLiveM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdLiveM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetAudioByIdLiveM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdLiveM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdLiveM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdLiveM3u8");

            var localVarPath = "/Audio/{Id}/live.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdLiveM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdMainM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetAudioByIdMainM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdMainM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdMainM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdMainM3u8");

            var localVarPath = "/Audio/{Id}/main.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdMainM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdMainM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetAudioByIdMainM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdMainM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdMainM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdMainM3u8");

            var localVarPath = "/Audio/{Id}/main.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdMainM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetAudioByIdMasterM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdMasterM3u8");

            var localVarPath = "/Audio/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetAudioByIdMasterM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetAudioByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetAudioByIdMasterM3u8");

            var localVarPath = "/Audio/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAudioByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetVideosByIdLiveM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetVideosByIdLiveM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdLiveM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdLiveM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdLiveM3u8");

            var localVarPath = "/Videos/{Id}/live.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdLiveM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdLiveM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetVideosByIdLiveM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdLiveM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdLiveM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdLiveM3u8");

            var localVarPath = "/Videos/{Id}/live.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdLiveM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns></returns>
        public void GetVideosByIdLiveSubtitlesM3u8 (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
             GetVideosByIdLiveSubtitlesM3u8WithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdLiveSubtitlesM3u8WithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");
            // verify the required parameter 'subtitleSegmentLength' is set
            if (subtitleSegmentLength == null)
                throw new ApiException(400, "Missing required parameter 'subtitleSegmentLength' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");
            // verify the required parameter 'manifestSubtitles' is set
            if (manifestSubtitles == null)
                throw new ApiException(400, "Missing required parameter 'manifestSubtitles' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");

            var localVarPath = "/Videos/{Id}/live_subtitles.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (subtitleSegmentLength != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleSegmentLength", subtitleSegmentLength)); // query parameter
            if (manifestSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ManifestSubtitles", manifestSubtitles)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdLiveSubtitlesM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdLiveSubtitlesM3u8Async (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
             await GetVideosByIdLiveSubtitlesM3u8AsyncWithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);

        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdLiveSubtitlesM3u8AsyncWithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");
            // verify the required parameter 'subtitleSegmentLength' is set
            if (subtitleSegmentLength == null)
                throw new ApiException(400, "Missing required parameter 'subtitleSegmentLength' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");
            // verify the required parameter 'manifestSubtitles' is set
            if (manifestSubtitles == null)
                throw new ApiException(400, "Missing required parameter 'manifestSubtitles' when calling DynamicHlsServiceApi->GetVideosByIdLiveSubtitlesM3u8");

            var localVarPath = "/Videos/{Id}/live_subtitles.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (subtitleSegmentLength != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleSegmentLength", subtitleSegmentLength)); // query parameter
            if (manifestSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ManifestSubtitles", manifestSubtitles)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdLiveSubtitlesM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetVideosByIdMainM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetVideosByIdMainM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdMainM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdMainM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdMainM3u8");

            var localVarPath = "/Videos/{Id}/main.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdMainM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdMainM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetVideosByIdMainM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdMainM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdMainM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdMainM3u8");

            var localVarPath = "/Videos/{Id}/main.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdMainM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetVideosByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetVideosByIdMasterM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdMasterM3u8");

            var localVarPath = "/Videos/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetVideosByIdMasterM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->GetVideosByIdMasterM3u8");

            var localVarPath = "/Videos/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns></returns>
        public void GetVideosByIdSubtitlesM3u8 (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
             GetVideosByIdSubtitlesM3u8WithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetVideosByIdSubtitlesM3u8WithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");
            // verify the required parameter 'subtitleSegmentLength' is set
            if (subtitleSegmentLength == null)
                throw new ApiException(400, "Missing required parameter 'subtitleSegmentLength' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");
            // verify the required parameter 'manifestSubtitles' is set
            if (manifestSubtitles == null)
                throw new ApiException(400, "Missing required parameter 'manifestSubtitles' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");

            var localVarPath = "/Videos/{Id}/subtitles.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (subtitleSegmentLength != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleSegmentLength", subtitleSegmentLength)); // query parameter
            if (manifestSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ManifestSubtitles", manifestSubtitles)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdSubtitlesM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetVideosByIdSubtitlesM3u8Async (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
             await GetVideosByIdSubtitlesM3u8AsyncWithHttpInfo(id, subtitleSegmentLength, manifestSubtitles);

        }

        /// <summary>
        /// Gets an HLS subtitle playlist. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="subtitleSegmentLength">The subtitle segment length</param>
        /// <param name="manifestSubtitles">The subtitle segment format</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetVideosByIdSubtitlesM3u8AsyncWithHttpInfo (string id, int? subtitleSegmentLength, string manifestSubtitles)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");
            // verify the required parameter 'subtitleSegmentLength' is set
            if (subtitleSegmentLength == null)
                throw new ApiException(400, "Missing required parameter 'subtitleSegmentLength' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");
            // verify the required parameter 'manifestSubtitles' is set
            if (manifestSubtitles == null)
                throw new ApiException(400, "Missing required parameter 'manifestSubtitles' when calling DynamicHlsServiceApi->GetVideosByIdSubtitlesM3u8");

            var localVarPath = "/Videos/{Id}/subtitles.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (subtitleSegmentLength != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleSegmentLength", subtitleSegmentLength)); // query parameter
            if (manifestSubtitles != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "ManifestSubtitles", manifestSubtitles)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVideosByIdSubtitlesM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Audio/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void HeadAudioByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             HeadAudioByIdMasterM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadAudioByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->HeadAudioByIdMasterM3u8");

            var localVarPath = "/Audio/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await HeadAudioByIdMasterM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadAudioByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->HeadAudioByIdMasterM3u8");

            var localVarPath = "/Audio/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadAudioByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns></returns>
        public void HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer (string segmentContainer, string segmentId, string id, string playlistId)
        {
             HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo(segmentContainer, segmentId, id, playlistId);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsync (string segmentContainer, string segmentId, string id, string playlistId)
        {
             await HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo(segmentContainer, segmentId, id, playlistId);

        }

        /// <summary>
        ///  Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="segmentContainer"></param>
        /// <param name="segmentId"></param>
        /// <param name="id"></param>
        /// <param name="playlistId"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerAsyncWithHttpInfo (string segmentContainer, string segmentId, string id, string playlistId)
        {
            // verify the required parameter 'segmentContainer' is set
            if (segmentContainer == null)
                throw new ApiException(400, "Missing required parameter 'segmentContainer' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'segmentId' is set
            if (segmentId == null)
                throw new ApiException(400, "Missing required parameter 'segmentId' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");
            // verify the required parameter 'playlistId' is set
            if (playlistId == null)
                throw new ApiException(400, "Missing required parameter 'playlistId' when calling DynamicHlsServiceApi->HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer");

            var localVarPath = "/Videos/{Id}/hls1/{PlaylistId}/{SegmentId}.{SegmentContainer}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (segmentContainer != null) localVarPathParams.Add("SegmentContainer", this.Configuration.ApiClient.ParameterToString(segmentContainer)); // path parameter
            if (segmentId != null) localVarPathParams.Add("SegmentId", this.Configuration.ApiClient.ParameterToString(segmentId)); // path parameter
            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (playlistId != null) localVarPathParams.Add("PlaylistId", this.Configuration.ApiClient.ParameterToString(playlistId)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void HeadVideosByIdMasterM3u8 (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             HeadVideosByIdMasterM3u8WithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadVideosByIdMasterM3u8WithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadVideosByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->HeadVideosByIdMasterM3u8");

            var localVarPath = "/Videos/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadVideosByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadVideosByIdMasterM3u8Async (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await HeadVideosByIdMasterM3u8AsyncWithHttpInfo(deviceProfileId, id, deviceId, container, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets a video stream using HTTP live streaming. Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="id">Item Id</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="container">Container</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1ms &#x3D; 10000 ticks. (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadVideosByIdMasterM3u8AsyncWithHttpInfo (string deviceProfileId, string id, string deviceId, string container, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, SubtitleDeliveryMethod subtitleMethod, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DynamicHlsServiceApi->HeadVideosByIdMasterM3u8");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling DynamicHlsServiceApi->HeadVideosByIdMasterM3u8");

            var localVarPath = "/Videos/{Id}/master.m3u8";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (container != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Container", container)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxVideoBitDepth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxVideoBitDepth", maxVideoBitDepth)); // query parameter
            if (videoCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoCodec", videoCodec)); // query parameter
            if (audioStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioStreamIndex", audioStreamIndex)); // query parameter
            if (videoStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoStreamIndex", videoStreamIndex)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.HEAD, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("HeadVideosByIdMasterM3u8", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
