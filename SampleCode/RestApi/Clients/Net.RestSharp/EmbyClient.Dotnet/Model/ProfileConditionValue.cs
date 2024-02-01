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
    /// Defines ProfileConditionValue
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ProfileConditionValue
    {
        /// <summary>
        /// Enum AudioChannels for value: AudioChannels
        /// </summary>
        [EnumMember(Value = "AudioChannels")]
        AudioChannels = 1,
        /// <summary>
        /// Enum AudioBitrate for value: AudioBitrate
        /// </summary>
        [EnumMember(Value = "AudioBitrate")]
        AudioBitrate = 2,
        /// <summary>
        /// Enum AudioProfile for value: AudioProfile
        /// </summary>
        [EnumMember(Value = "AudioProfile")]
        AudioProfile = 3,
        /// <summary>
        /// Enum Width for value: Width
        /// </summary>
        [EnumMember(Value = "Width")]
        Width = 4,
        /// <summary>
        /// Enum Height for value: Height
        /// </summary>
        [EnumMember(Value = "Height")]
        Height = 5,
        /// <summary>
        /// Enum Has64BitOffsets for value: Has64BitOffsets
        /// </summary>
        [EnumMember(Value = "Has64BitOffsets")]
        Has64BitOffsets = 6,
        /// <summary>
        /// Enum PacketLength for value: PacketLength
        /// </summary>
        [EnumMember(Value = "PacketLength")]
        PacketLength = 7,
        /// <summary>
        /// Enum VideoBitDepth for value: VideoBitDepth
        /// </summary>
        [EnumMember(Value = "VideoBitDepth")]
        VideoBitDepth = 8,
        /// <summary>
        /// Enum VideoBitrate for value: VideoBitrate
        /// </summary>
        [EnumMember(Value = "VideoBitrate")]
        VideoBitrate = 9,
        /// <summary>
        /// Enum VideoFramerate for value: VideoFramerate
        /// </summary>
        [EnumMember(Value = "VideoFramerate")]
        VideoFramerate = 10,
        /// <summary>
        /// Enum VideoLevel for value: VideoLevel
        /// </summary>
        [EnumMember(Value = "VideoLevel")]
        VideoLevel = 11,
        /// <summary>
        /// Enum VideoProfile for value: VideoProfile
        /// </summary>
        [EnumMember(Value = "VideoProfile")]
        VideoProfile = 12,
        /// <summary>
        /// Enum VideoTimestamp for value: VideoTimestamp
        /// </summary>
        [EnumMember(Value = "VideoTimestamp")]
        VideoTimestamp = 13,
        /// <summary>
        /// Enum IsAnamorphic for value: IsAnamorphic
        /// </summary>
        [EnumMember(Value = "IsAnamorphic")]
        IsAnamorphic = 14,
        /// <summary>
        /// Enum RefFrames for value: RefFrames
        /// </summary>
        [EnumMember(Value = "RefFrames")]
        RefFrames = 15,
        /// <summary>
        /// Enum NumAudioStreams for value: NumAudioStreams
        /// </summary>
        [EnumMember(Value = "NumAudioStreams")]
        NumAudioStreams = 16,
        /// <summary>
        /// Enum NumVideoStreams for value: NumVideoStreams
        /// </summary>
        [EnumMember(Value = "NumVideoStreams")]
        NumVideoStreams = 17,
        /// <summary>
        /// Enum IsSecondaryAudio for value: IsSecondaryAudio
        /// </summary>
        [EnumMember(Value = "IsSecondaryAudio")]
        IsSecondaryAudio = 18,
        /// <summary>
        /// Enum VideoCodecTag for value: VideoCodecTag
        /// </summary>
        [EnumMember(Value = "VideoCodecTag")]
        VideoCodecTag = 19,
        /// <summary>
        /// Enum IsAvc for value: IsAvc
        /// </summary>
        [EnumMember(Value = "IsAvc")]
        IsAvc = 20,
        /// <summary>
        /// Enum IsInterlaced for value: IsInterlaced
        /// </summary>
        [EnumMember(Value = "IsInterlaced")]
        IsInterlaced = 21,
        /// <summary>
        /// Enum AudioSampleRate for value: AudioSampleRate
        /// </summary>
        [EnumMember(Value = "AudioSampleRate")]
        AudioSampleRate = 22,
        /// <summary>
        /// Enum AudioBitDepth for value: AudioBitDepth
        /// </summary>
        [EnumMember(Value = "AudioBitDepth")]
        AudioBitDepth = 23,
        /// <summary>
        /// Enum VideoRange for value: VideoRange
        /// </summary>
        [EnumMember(Value = "VideoRange")]
        VideoRange = 24,
        /// <summary>
        /// Enum VideoRotation for value: VideoRotation
        /// </summary>
        [EnumMember(Value = "VideoRotation")]
        VideoRotation = 25    }
}
