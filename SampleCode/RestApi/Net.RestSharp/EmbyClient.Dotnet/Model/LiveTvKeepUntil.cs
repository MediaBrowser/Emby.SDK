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
    /// Defines LiveTv.KeepUntil
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LiveTvKeepUntil
    {
        /// <summary>
        /// Enum UntilDeleted for value: UntilDeleted
        /// </summary>
        [EnumMember(Value = "UntilDeleted")]
        UntilDeleted = 1,
        /// <summary>
        /// Enum UntilSpaceNeeded for value: UntilSpaceNeeded
        /// </summary>
        [EnumMember(Value = "UntilSpaceNeeded")]
        UntilSpaceNeeded = 2,
        /// <summary>
        /// Enum UntilWatched for value: UntilWatched
        /// </summary>
        [EnumMember(Value = "UntilWatched")]
        UntilWatched = 3,
        /// <summary>
        /// Enum UntilDate for value: UntilDate
        /// </summary>
        [EnumMember(Value = "UntilDate")]
        UntilDate = 4    }
}
