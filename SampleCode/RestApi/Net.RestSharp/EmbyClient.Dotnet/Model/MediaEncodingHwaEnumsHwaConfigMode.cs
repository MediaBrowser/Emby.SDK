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
    /// Defines MediaEncoding.Hwa.Enums.HwaConfigMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingHwaEnumsHwaConfigMode
    {
        /// <summary>
        /// Enum Basic for value: Basic
        /// </summary>
        [EnumMember(Value = "Basic")]
        Basic = 1,
        /// <summary>
        /// Enum Advanced for value: Advanced
        /// </summary>
        [EnumMember(Value = "Advanced")]
        Advanced = 2,
        /// <summary>
        /// Enum Expert for value: Expert
        /// </summary>
        [EnumMember(Value = "Expert")]
        Expert = 3    }
}
