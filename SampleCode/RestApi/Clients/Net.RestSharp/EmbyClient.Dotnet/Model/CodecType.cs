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
    /// Defines CodecType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum CodecType
    {
        /// <summary>
        /// Enum Video for value: Video
        /// </summary>
        [EnumMember(Value = "Video")]
        Video = 1,
        /// <summary>
        /// Enum VideoAudio for value: VideoAudio
        /// </summary>
        [EnumMember(Value = "VideoAudio")]
        VideoAudio = 2,
        /// <summary>
        /// Enum Audio for value: Audio
        /// </summary>
        [EnumMember(Value = "Audio")]
        Audio = 3    }
}
