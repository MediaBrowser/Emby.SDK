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
    /// Defines TranscodeSeekInfo
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum TranscodeSeekInfo
    {
        /// <summary>
        /// Enum Auto for value: Auto
        /// </summary>
        [EnumMember(Value = "Auto")]
        Auto = 1,
        /// <summary>
        /// Enum Bytes for value: Bytes
        /// </summary>
        [EnumMember(Value = "Bytes")]
        Bytes = 2    }
}
