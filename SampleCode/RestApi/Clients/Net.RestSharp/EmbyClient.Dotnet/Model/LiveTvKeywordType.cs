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
    /// Defines LiveTv.KeywordType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LiveTvKeywordType
    {
        /// <summary>
        /// Enum Name for value: Name
        /// </summary>
        [EnumMember(Value = "Name")]
        Name = 1,
        /// <summary>
        /// Enum EpisodeTitle for value: EpisodeTitle
        /// </summary>
        [EnumMember(Value = "EpisodeTitle")]
        EpisodeTitle = 2,
        /// <summary>
        /// Enum Overview for value: Overview
        /// </summary>
        [EnumMember(Value = "Overview")]
        Overview = 3,
        /// <summary>
        /// Enum Actor for value: Actor
        /// </summary>
        [EnumMember(Value = "Actor")]
        Actor = 4,
        /// <summary>
        /// Enum Director for value: Director
        /// </summary>
        [EnumMember(Value = "Director")]
        Director = 5    }
}
