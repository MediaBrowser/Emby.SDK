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
    /// Defines SleepTimerMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SleepTimerMode
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        /// <summary>
        /// Enum AfterItem for value: AfterItem
        /// </summary>
        [EnumMember(Value = "AfterItem")]
        AfterItem = 2,
        /// <summary>
        /// Enum AtTime for value: AtTime
        /// </summary>
        [EnumMember(Value = "AtTime")]
        AtTime = 3    }
}
