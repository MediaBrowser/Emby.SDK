/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.6
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// Defines Sync.SyncCategory
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SyncSyncCategory
    {
        /// <summary>
        /// Enum Latest for value: Latest
        /// </summary>
        [EnumMember(Value = "Latest")]
        Latest = 1,
        /// <summary>
        /// Enum NextUp for value: NextUp
        /// </summary>
        [EnumMember(Value = "NextUp")]
        NextUp = 2,
        /// <summary>
        /// Enum Resume for value: Resume
        /// </summary>
        [EnumMember(Value = "Resume")]
        Resume = 3    }
}