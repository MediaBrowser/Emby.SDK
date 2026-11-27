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
    /// Defines MediaEncoding.Settings.Hwa.Projection.Enums.UiNodeState
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingSettingsHwaProjectionEnumsUiNodeState
    {
        /// <summary>
        /// Enum Normal for value: Normal
        /// </summary>
        [EnumMember(Value = "Normal")]
        Normal = 1,
        /// <summary>
        /// Enum Disabled for value: Disabled
        /// </summary>
        [EnumMember(Value = "Disabled")]
        Disabled = 2,
        /// <summary>
        /// Enum Unavailable for value: Unavailable
        /// </summary>
        [EnumMember(Value = "Unavailable")]
        Unavailable = 3,
        /// <summary>
        /// Enum Error for value: Error
        /// </summary>
        [EnumMember(Value = "Error")]
        Error = 4,
        /// <summary>
        /// Enum Fallback for value: Fallback
        /// </summary>
        [EnumMember(Value = "Fallback")]
        Fallback = 5    }
}
