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
    /// Enum PackageType  
    /// </summary>
    /// <value>Enum PackageType  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PackageTargetSystem
    {
        /// <summary>
        /// Enum Server for value: Server
        /// </summary>
        [EnumMember(Value = "Server")]
        Server = 1,
        /// <summary>
        /// Enum MBTheater for value: MBTheater
        /// </summary>
        [EnumMember(Value = "MBTheater")]
        MBTheater = 2,
        /// <summary>
        /// Enum MBClassic for value: MBClassic
        /// </summary>
        [EnumMember(Value = "MBClassic")]
        MBClassic = 3,
        /// <summary>
        /// Enum Other for value: Other
        /// </summary>
        [EnumMember(Value = "Other")]
        Other = 4    }
}
