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
    /// Defines OperatingSystem
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum OperatingSystem
    {
        /// <summary>
        /// Enum Windows for value: Windows
        /// </summary>
        [EnumMember(Value = "Windows")]
        Windows = 1,
        /// <summary>
        /// Enum Linux for value: Linux
        /// </summary>
        [EnumMember(Value = "Linux")]
        Linux = 2,
        /// <summary>
        /// Enum OSX for value: OSX
        /// </summary>
        [EnumMember(Value = "OSX")]
        OSX = 3,
        /// <summary>
        /// Enum BSD for value: BSD
        /// </summary>
        [EnumMember(Value = "BSD")]
        BSD = 4,
        /// <summary>
        /// Enum Android for value: Android
        /// </summary>
        [EnumMember(Value = "Android")]
        Android = 5    }
}
