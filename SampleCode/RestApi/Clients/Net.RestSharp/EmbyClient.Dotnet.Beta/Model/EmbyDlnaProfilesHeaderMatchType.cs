/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.6
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// Defines Emby.Dlna.Profiles.HeaderMatchType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EmbyDlnaProfilesHeaderMatchType
    {
        /// <summary>
        /// Enum Equals for value: Equals
        /// </summary>
        [EnumMember(Value = "Equals")]
        Equals = 1,
        /// <summary>
        /// Enum Regex for value: Regex
        /// </summary>
        [EnumMember(Value = "Regex")]
        Regex = 2,
        /// <summary>
        /// Enum Substring for value: Substring
        /// </summary>
        [EnumMember(Value = "Substring")]
        Substring = 3    }
}
