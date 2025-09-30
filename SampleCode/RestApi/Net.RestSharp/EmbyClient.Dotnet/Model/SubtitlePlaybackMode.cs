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
    /// Defines SubtitlePlaybackMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SubtitlePlaybackMode
    {
        /// <summary>
        /// Enum Default for value: Default
        /// </summary>
        [EnumMember(Value = "Default")]
        Default = 1,
        /// <summary>
        /// Enum Always for value: Always
        /// </summary>
        [EnumMember(Value = "Always")]
        Always = 2,
        /// <summary>
        /// Enum OnlyForced for value: OnlyForced
        /// </summary>
        [EnumMember(Value = "OnlyForced")]
        OnlyForced = 3,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 4,
        /// <summary>
        /// Enum Smart for value: Smart
        /// </summary>
        [EnumMember(Value = "Smart")]
        Smart = 5,
        /// <summary>
        /// Enum HearingImpaired for value: HearingImpaired
        /// </summary>
        [EnumMember(Value = "HearingImpaired")]
        HearingImpaired = 6    }
}
