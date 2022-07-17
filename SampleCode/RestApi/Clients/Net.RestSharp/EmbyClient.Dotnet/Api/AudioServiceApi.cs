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
        public interface IAudioServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdStream (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdStreamWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void GetAudioByIdStreamByContainer (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetAudioByIdStreamByContainerWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void HeadAudioByIdStream (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdStreamWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        void HeadAudioByIdStreamByContainer (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> HeadAudioByIdStreamByContainerWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdStreamAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdStreamAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetAudioByIdStreamByContainerAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdStreamByContainerAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdStreamAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdStreamAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task HeadAudioByIdStreamByContainerAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);

        /// <summary>
        /// Gets an audio stream
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdStreamByContainerAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class AudioServiceApi : IAudioServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="AudioServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AudioServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AudioServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public AudioServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AudioServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public AudioServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
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
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdStream (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetAudioByIdStreamWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdStreamWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->GetAudioByIdStream");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->GetAudioByIdStream");

            var localVarPath = "/Audio/{Id}/stream";
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
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdStreamAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetAudioByIdStreamAsyncWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdStreamAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->GetAudioByIdStream");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->GetAudioByIdStream");

            var localVarPath = "/Audio/{Id}/stream";
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
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void GetAudioByIdStreamByContainer (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             GetAudioByIdStreamByContainerWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetAudioByIdStreamByContainerWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->GetAudioByIdStreamByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->GetAudioByIdStreamByContainer");

            var localVarPath = "/Audio/{Id}/stream.{Container}";
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
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdStreamByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetAudioByIdStreamByContainerAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await GetAudioByIdStreamByContainerAsyncWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetAudioByIdStreamByContainerAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->GetAudioByIdStreamByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->GetAudioByIdStreamByContainer");

            var localVarPath = "/Audio/{Id}/stream.{Container}";
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
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("GetAudioByIdStreamByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void HeadAudioByIdStream (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             HeadAudioByIdStreamWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdStreamWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->HeadAudioByIdStream");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->HeadAudioByIdStream");

            var localVarPath = "/Audio/{Id}/stream";
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
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("HeadAudioByIdStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdStreamAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await HeadAudioByIdStreamAsyncWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdStreamAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->HeadAudioByIdStream");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->HeadAudioByIdStream");

            var localVarPath = "/Audio/{Id}/stream";
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
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("HeadAudioByIdStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns></returns>
        public void HeadAudioByIdStreamByContainer (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             HeadAudioByIdStreamByContainerWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> HeadAudioByIdStreamByContainerWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->HeadAudioByIdStreamByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->HeadAudioByIdStreamByContainer");

            var localVarPath = "/Audio/{Id}/stream.{Container}";
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
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("HeadAudioByIdStreamByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task HeadAudioByIdStreamByContainerAsync (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
             await HeadAudioByIdStreamByContainerAsyncWithHttpInfo(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        }

        /// <summary>
        /// Gets an audio stream Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Item Id</param>
        /// <param name="container">Container</param>
        /// <param name="deviceProfileId">Optional. The dlna device profile id to utilize. (optional)</param>
        /// <param name="deviceId">The device id of the client requesting. Used to stop encoding processes when needed. (optional)</param>
        /// <param name="audioCodec">Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url&#x27;s extension. Options: aac, mp3, vorbis, wma. (optional)</param>
        /// <param name="enableAutoStreamCopy">Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)</param>
        /// <param name="audioSampleRate">Optional. Specify a specific audio sample rate, e.g. 44100 (optional)</param>
        /// <param name="audioBitRate">Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="audioChannels">Optional. Specify a specific number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="maxAudioChannels">Optional. Specify a maximum number of audio channels to encode to, e.g. 2 (optional)</param>
        /// <param name="_static">Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false (optional)</param>
        /// <param name="profile">Optional. Specify a specific h264 profile, e.g. main, baseline, high. (optional)</param>
        /// <param name="level">Optional. Specify a level for the h264 profile, e.g. 3, 3.1. (optional)</param>
        /// <param name="framerate">Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="maxFramerate">Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)</param>
        /// <param name="copyTimestamps">Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)</param>
        /// <param name="startTimeTicks">Optional. Specify a starting offset, in ticks. 1 tick &#x3D; 10000 ms (optional)</param>
        /// <param name="width">Optional. The fixed horizontal resolution of the encoded video. (optional)</param>
        /// <param name="height">Optional. The fixed vertical resolution of the encoded video. (optional)</param>
        /// <param name="maxWidth">Optional. The maximum horizontal resolution of the encoded video. (optional)</param>
        /// <param name="maxHeight">Optional. The maximum vertical resolution of the encoded video. (optional)</param>
        /// <param name="videoBitRate">Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)</param>
        /// <param name="subtitleStreamIndex">Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)</param>
        /// <param name="subtitleMethod">Optional. Specify the subtitle delivery method. (optional)</param>
        /// <param name="maxRefFrames">Optional. (optional)</param>
        /// <param name="maxVideoBitDepth">Optional. (optional)</param>
        /// <param name="videoCodec">Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url&#x27;s extension. Options: h264, mpeg4, theora, vpx, wmv. (optional)</param>
        /// <param name="audioStreamIndex">Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)</param>
        /// <param name="videoStreamIndex">Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> HeadAudioByIdStreamByContainerAsyncWithHttpInfo (string id, string container, string deviceProfileId, string deviceId, string audioCodec, bool? enableAutoStreamCopy, int? audioSampleRate, int? audioBitRate, int? audioChannels, int? maxAudioChannels, bool? _static, string profile, string level, float? framerate, float? maxFramerate, bool? copyTimestamps, long? startTimeTicks, int? width, int? height, int? maxWidth, int? maxHeight, int? videoBitRate, int? subtitleStreamIndex, DlnaSubtitleDeliveryMethod subtitleMethod, int? maxRefFrames, int? maxVideoBitDepth, string videoCodec, int? audioStreamIndex, int? videoStreamIndex)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling AudioServiceApi->HeadAudioByIdStreamByContainer");
            // verify the required parameter 'container' is set
            if (container == null)
                throw new ApiException(400, "Missing required parameter 'container' when calling AudioServiceApi->HeadAudioByIdStreamByContainer");

            var localVarPath = "/Audio/{Id}/stream.{Container}";
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
            if (container != null) localVarPathParams.Add("Container", this.Configuration.ApiClient.ParameterToString(container)); // path parameter
            if (deviceProfileId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceProfileId", deviceProfileId)); // query parameter
            if (deviceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "DeviceId", deviceId)); // query parameter
            if (audioCodec != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioCodec", audioCodec)); // query parameter
            if (enableAutoStreamCopy != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "EnableAutoStreamCopy", enableAutoStreamCopy)); // query parameter
            if (audioSampleRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioSampleRate", audioSampleRate)); // query parameter
            if (audioBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioBitRate", audioBitRate)); // query parameter
            if (audioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "AudioChannels", audioChannels)); // query parameter
            if (maxAudioChannels != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxAudioChannels", maxAudioChannels)); // query parameter
            if (_static != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Static", _static)); // query parameter
            if (profile != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Profile", profile)); // query parameter
            if (level != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Level", level)); // query parameter
            if (framerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Framerate", framerate)); // query parameter
            if (maxFramerate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxFramerate", maxFramerate)); // query parameter
            if (copyTimestamps != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "CopyTimestamps", copyTimestamps)); // query parameter
            if (startTimeTicks != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartTimeTicks", startTimeTicks)); // query parameter
            if (width != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Width", width)); // query parameter
            if (height != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Height", height)); // query parameter
            if (maxWidth != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxWidth", maxWidth)); // query parameter
            if (maxHeight != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxHeight", maxHeight)); // query parameter
            if (videoBitRate != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "VideoBitRate", videoBitRate)); // query parameter
            if (subtitleStreamIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleStreamIndex", subtitleStreamIndex)); // query parameter
            if (subtitleMethod != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "SubtitleMethod", subtitleMethod)); // query parameter
            if (maxRefFrames != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "MaxRefFrames", maxRefFrames)); // query parameter
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
                Exception exception = ExceptionFactory("HeadAudioByIdStreamByContainer", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
