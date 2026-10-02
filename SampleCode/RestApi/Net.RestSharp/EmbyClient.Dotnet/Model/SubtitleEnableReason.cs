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
    /// Defines SubtitleEnableReason
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SubtitleEnableReason
    {
        /// <summary>
        /// Enum UserEnabled for value: UserEnabled
        /// </summary>
        [EnumMember(Value = "UserEnabled")]
        UserEnabled = 1,
        /// <summary>
        /// Enum SkipBack for value: SkipBack
        /// </summary>
        [EnumMember(Value = "SkipBack")]
        SkipBack = 2,
        /// <summary>
        /// Enum LowVolume for value: LowVolume
        /// </summary>
        [EnumMember(Value = "LowVolume")]
        LowVolume = 3    }
}
