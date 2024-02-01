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
    /// Enum defining the kind of media a codec is processing.  
    /// </summary>
    /// <value>Enum defining the kind of media a codec is processing.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum CodecKinds
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
