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
    /// Defines Dlna.Profiles.HeaderMatchType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DlnaProfilesHeaderMatchType
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
