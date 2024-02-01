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
    /// Defines SegmentSkipMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SegmentSkipMode
    {
        /// <summary>
        /// Enum ShowButton for value: ShowButton
        /// </summary>
        [EnumMember(Value = "ShowButton")]
        ShowButton = 1,
        /// <summary>
        /// Enum AutoSkip for value: AutoSkip
        /// </summary>
        [EnumMember(Value = "AutoSkip")]
        AutoSkip = 2,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 3    }
}
