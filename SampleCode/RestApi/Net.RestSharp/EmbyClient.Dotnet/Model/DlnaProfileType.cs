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
    /// Defines DlnaProfileType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DlnaProfileType
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
        /// Enum Photo for value: Photo
        /// </summary>
        [EnumMember(Value = "Photo")]
        Photo = 3    }
}
