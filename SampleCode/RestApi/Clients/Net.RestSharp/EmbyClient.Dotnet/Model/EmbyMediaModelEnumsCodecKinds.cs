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
    /// Defines Emby.Media.Model.Enums.CodecKinds
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EmbyMediaModelEnumsCodecKinds
    {
        /// <summary>
        /// Enum Audio for value: Audio
        /// </summary>
        [EnumMember(Value = "Audio")]
        Audio = 1,
        /// <summary>
        /// Enum Video for value: Video
        /// </summary>
        [EnumMember(Value = "Video")]
        Video = 2,
        /// <summary>
        /// Enum SubTitles for value: SubTitles
        /// </summary>
        [EnumMember(Value = "SubTitles")]
        SubTitles = 3    }
}
