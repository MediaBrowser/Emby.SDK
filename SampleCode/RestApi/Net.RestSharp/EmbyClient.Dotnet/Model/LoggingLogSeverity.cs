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
    /// Enum LogSeverity  
    /// </summary>
    /// <value>Enum LogSeverity  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LoggingLogSeverity
    {
        /// <summary>
        /// Enum Info for value: Info
        /// </summary>
        [EnumMember(Value = "Info")]
        Info = 1,
        /// <summary>
        /// Enum Debug for value: Debug
        /// </summary>
        [EnumMember(Value = "Debug")]
        Debug = 2,
        /// <summary>
        /// Enum Warn for value: Warn
        /// </summary>
        [EnumMember(Value = "Warn")]
        Warn = 3,
        /// <summary>
        /// Enum Error for value: Error
        /// </summary>
        [EnumMember(Value = "Error")]
        Error = 4,
        /// <summary>
        /// Enum Fatal for value: Fatal
        /// </summary>
        [EnumMember(Value = "Fatal")]
        Fatal = 5    }
}
