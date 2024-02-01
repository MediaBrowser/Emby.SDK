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
    /// Enum MediaStreamType  
    /// </summary>
    /// <value>Enum MediaStreamType  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaStreamType
    {
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 1,
        /// <summary>
        /// Enum Audio for value: Audio
        /// </summary>
        [EnumMember(Value = "Audio")]
        Audio = 2,
        /// <summary>
        /// Enum Video for value: Video
        /// </summary>
        [EnumMember(Value = "Video")]
        Video = 3,
        /// <summary>
        /// Enum Subtitle for value: Subtitle
        /// </summary>
        [EnumMember(Value = "Subtitle")]
        Subtitle = 4,
        /// <summary>
        /// Enum EmbeddedImage for value: EmbeddedImage
        /// </summary>
        [EnumMember(Value = "EmbeddedImage")]
        EmbeddedImage = 5,
        /// <summary>
        /// Enum Attachment for value: Attachment
        /// </summary>
        [EnumMember(Value = "Attachment")]
        Attachment = 6,
        /// <summary>
        /// Enum Data for value: Data
        /// </summary>
        [EnumMember(Value = "Data")]
        Data = 7    }
}
