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
    /// Defines PlayCommand
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PlayCommand
    {
        /// <summary>
        /// Enum PlayNow for value: PlayNow
        /// </summary>
        [EnumMember(Value = "PlayNow")]
        PlayNow = 1,
        /// <summary>
        /// Enum PlayNext for value: PlayNext
        /// </summary>
        [EnumMember(Value = "PlayNext")]
        PlayNext = 2,
        /// <summary>
        /// Enum PlayLast for value: PlayLast
        /// </summary>
        [EnumMember(Value = "PlayLast")]
        PlayLast = 3,
        /// <summary>
        /// Enum PlayInstantMix for value: PlayInstantMix
        /// </summary>
        [EnumMember(Value = "PlayInstantMix")]
        PlayInstantMix = 4,
        /// <summary>
        /// Enum PlayShuffle for value: PlayShuffle
        /// </summary>
        [EnumMember(Value = "PlayShuffle")]
        PlayShuffle = 5    }
}