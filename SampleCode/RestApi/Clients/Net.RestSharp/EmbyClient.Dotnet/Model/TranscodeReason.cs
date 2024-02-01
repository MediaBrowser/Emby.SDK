/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// Defines TranscodeReason
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum TranscodeReason
    {
        /// <summary>
        /// Enum ContainerNotSupported for value: ContainerNotSupported
        /// </summary>
        [EnumMember(Value = "ContainerNotSupported")]
        ContainerNotSupported = 1,
        /// <summary>
        /// Enum VideoCodecNotSupported for value: VideoCodecNotSupported
        /// </summary>
        [EnumMember(Value = "VideoCodecNotSupported")]
        VideoCodecNotSupported = 2,
        /// <summary>
        /// Enum AudioCodecNotSupported for value: AudioCodecNotSupported
        /// </summary>
        [EnumMember(Value = "AudioCodecNotSupported")]
        AudioCodecNotSupported = 3,
        /// <summary>
        /// Enum ContainerBitrateExceedsLimit for value: ContainerBitrateExceedsLimit
        /// </summary>
        [EnumMember(Value = "ContainerBitrateExceedsLimit")]
        ContainerBitrateExceedsLimit = 4,
        /// <summary>
        /// Enum AudioBitrateNotSupported for value: AudioBitrateNotSupported
        /// </summary>
        [EnumMember(Value = "AudioBitrateNotSupported")]
        AudioBitrateNotSupported = 5,
        /// <summary>
        /// Enum AudioChannelsNotSupported for value: AudioChannelsNotSupported
        /// </summary>
        [EnumMember(Value = "AudioChannelsNotSupported")]
        AudioChannelsNotSupported = 6,
        /// <summary>
        /// Enum VideoResolutionNotSupported for value: VideoResolutionNotSupported
        /// </summary>
        [EnumMember(Value = "VideoResolutionNotSupported")]
        VideoResolutionNotSupported = 7,
        /// <summary>
        /// Enum UnknownVideoStreamInfo for value: UnknownVideoStreamInfo
        /// </summary>
        [EnumMember(Value = "UnknownVideoStreamInfo")]
        UnknownVideoStreamInfo = 8,
        /// <summary>
        /// Enum UnknownAudioStreamInfo for value: UnknownAudioStreamInfo
        /// </summary>
        [EnumMember(Value = "UnknownAudioStreamInfo")]
        UnknownAudioStreamInfo = 9,
        /// <summary>
        /// Enum AudioProfileNotSupported for value: AudioProfileNotSupported
        /// </summary>
        [EnumMember(Value = "AudioProfileNotSupported")]
        AudioProfileNotSupported = 10,
        /// <summary>
        /// Enum AudioSampleRateNotSupported for value: AudioSampleRateNotSupported
        /// </summary>
        [EnumMember(Value = "AudioSampleRateNotSupported")]
        AudioSampleRateNotSupported = 11,
        /// <summary>
        /// Enum AnamorphicVideoNotSupported for value: AnamorphicVideoNotSupported
        /// </summary>
        [EnumMember(Value = "AnamorphicVideoNotSupported")]
        AnamorphicVideoNotSupported = 12,
        /// <summary>
        /// Enum InterlacedVideoNotSupported for value: InterlacedVideoNotSupported
        /// </summary>
        [EnumMember(Value = "InterlacedVideoNotSupported")]
        InterlacedVideoNotSupported = 13,
        /// <summary>
        /// Enum SecondaryAudioNotSupported for value: SecondaryAudioNotSupported
        /// </summary>
        [EnumMember(Value = "SecondaryAudioNotSupported")]
        SecondaryAudioNotSupported = 14,
        /// <summary>
        /// Enum RefFramesNotSupported for value: RefFramesNotSupported
        /// </summary>
        [EnumMember(Value = "RefFramesNotSupported")]
        RefFramesNotSupported = 15,
        /// <summary>
        /// Enum VideoBitDepthNotSupported for value: VideoBitDepthNotSupported
        /// </summary>
        [EnumMember(Value = "VideoBitDepthNotSupported")]
        VideoBitDepthNotSupported = 16,
        /// <summary>
        /// Enum VideoBitrateNotSupported for value: VideoBitrateNotSupported
        /// </summary>
        [EnumMember(Value = "VideoBitrateNotSupported")]
        VideoBitrateNotSupported = 17,
        /// <summary>
        /// Enum VideoFramerateNotSupported for value: VideoFramerateNotSupported
        /// </summary>
        [EnumMember(Value = "VideoFramerateNotSupported")]
        VideoFramerateNotSupported = 18,
        /// <summary>
        /// Enum VideoLevelNotSupported for value: VideoLevelNotSupported
        /// </summary>
        [EnumMember(Value = "VideoLevelNotSupported")]
        VideoLevelNotSupported = 19,
        /// <summary>
        /// Enum VideoProfileNotSupported for value: VideoProfileNotSupported
        /// </summary>
        [EnumMember(Value = "VideoProfileNotSupported")]
        VideoProfileNotSupported = 20,
        /// <summary>
        /// Enum AudioBitDepthNotSupported for value: AudioBitDepthNotSupported
        /// </summary>
        [EnumMember(Value = "AudioBitDepthNotSupported")]
        AudioBitDepthNotSupported = 21,
        /// <summary>
        /// Enum SubtitleCodecNotSupported for value: SubtitleCodecNotSupported
        /// </summary>
        [EnumMember(Value = "SubtitleCodecNotSupported")]
        SubtitleCodecNotSupported = 22,
        /// <summary>
        /// Enum DirectPlayError for value: DirectPlayError
        /// </summary>
        [EnumMember(Value = "DirectPlayError")]
        DirectPlayError = 23,
        /// <summary>
        /// Enum VideoRangeNotSupported for value: VideoRangeNotSupported
        /// </summary>
        [EnumMember(Value = "VideoRangeNotSupported")]
        VideoRangeNotSupported = 24,
        /// <summary>
        /// Enum SubtitleContentOptionsEnabled for value: SubtitleContentOptionsEnabled
        /// </summary>
        [EnumMember(Value = "SubtitleContentOptionsEnabled")]
        SubtitleContentOptionsEnabled = 25    }
}
