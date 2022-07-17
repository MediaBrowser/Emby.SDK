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
    /// Defines RepeatMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum RepeatMode
    {
        /// <summary>
        /// Enum RepeatNone for value: RepeatNone
        /// </summary>
        [EnumMember(Value = "RepeatNone")]
        RepeatNone = 1,
        /// <summary>
        /// Enum RepeatAll for value: RepeatAll
        /// </summary>
        [EnumMember(Value = "RepeatAll")]
        RepeatAll = 2,
        /// <summary>
        /// Enum RepeatOne for value: RepeatOne
        /// </summary>
        [EnumMember(Value = "RepeatOne")]
        RepeatOne = 3    }
}
