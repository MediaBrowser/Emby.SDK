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
    /// Defines LiveTv.TimerType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LiveTvTimerType
    {
        /// <summary>
        /// Enum Program for value: Program
        /// </summary>
        [EnumMember(Value = "Program")]
        Program = 1,
        /// <summary>
        /// Enum DateTime for value: DateTime
        /// </summary>
        [EnumMember(Value = "DateTime")]
        DateTime = 2,
        /// <summary>
        /// Enum Keyword for value: Keyword
        /// </summary>
        [EnumMember(Value = "Keyword")]
        Keyword = 3    }
}
