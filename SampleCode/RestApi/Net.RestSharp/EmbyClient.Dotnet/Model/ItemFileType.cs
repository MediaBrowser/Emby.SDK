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
    /// Defines ItemFileType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ItemFileType
    {
        /// <summary>
        /// Enum Media for value: Media
        /// </summary>
        [EnumMember(Value = "Media")]
        Media = 1,
        /// <summary>
        /// Enum Image for value: Image
        /// </summary>
        [EnumMember(Value = "Image")]
        Image = 2,
        /// <summary>
        /// Enum Subtitles for value: Subtitles
        /// </summary>
        [EnumMember(Value = "Subtitles")]
        Subtitles = 3    }
}
