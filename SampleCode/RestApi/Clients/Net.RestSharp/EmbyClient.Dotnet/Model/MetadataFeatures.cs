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
    /// Defines MetadataFeatures
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MetadataFeatures
    {
        /// <summary>
        /// Enum Collections for value: Collections
        /// </summary>
        [EnumMember(Value = "Collections")]
        Collections = 1,
        /// <summary>
        /// Enum Adult for value: Adult
        /// </summary>
        [EnumMember(Value = "Adult")]
        Adult = 2,
        /// <summary>
        /// Enum RequiredSetup for value: RequiredSetup
        /// </summary>
        [EnumMember(Value = "RequiredSetup")]
        RequiredSetup = 3    }
}
