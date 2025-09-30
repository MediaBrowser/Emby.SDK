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
    /// Enum FileSystemEntryType  
    /// </summary>
    /// <value>Enum FileSystemEntryType  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum IOFileSystemEntryType
    {
        /// <summary>
        /// Enum File for value: File
        /// </summary>
        [EnumMember(Value = "File")]
        File = 1,
        /// <summary>
        /// Enum Directory for value: Directory
        /// </summary>
        [EnumMember(Value = "Directory")]
        Directory = 2,
        /// <summary>
        /// Enum NetworkComputer for value: NetworkComputer
        /// </summary>
        [EnumMember(Value = "NetworkComputer")]
        NetworkComputer = 3,
        /// <summary>
        /// Enum NetworkShare for value: NetworkShare
        /// </summary>
        [EnumMember(Value = "NetworkShare")]
        NetworkShare = 4    }
}
