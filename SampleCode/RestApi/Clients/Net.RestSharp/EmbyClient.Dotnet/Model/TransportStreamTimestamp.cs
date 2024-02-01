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
    /// Defines TransportStreamTimestamp
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum TransportStreamTimestamp
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        /// <summary>
        /// Enum Zero for value: Zero
        /// </summary>
        [EnumMember(Value = "Zero")]
        Zero = 2,
        /// <summary>
        /// Enum Valid for value: Valid
        /// </summary>
        [EnumMember(Value = "Valid")]
        Valid = 3    }
}
