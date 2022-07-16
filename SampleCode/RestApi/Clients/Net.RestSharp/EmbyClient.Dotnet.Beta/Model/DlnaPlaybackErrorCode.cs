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
    /// Defines Dlna.PlaybackErrorCode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DlnaPlaybackErrorCode
    {
        /// <summary>
        /// Enum NotAllowed for value: NotAllowed
        /// </summary>
        [EnumMember(Value = "NotAllowed")]
        NotAllowed = 1,
        /// <summary>
        /// Enum NoCompatibleStream for value: NoCompatibleStream
        /// </summary>
        [EnumMember(Value = "NoCompatibleStream")]
        NoCompatibleStream = 2,
        /// <summary>
        /// Enum RateLimitExceeded for value: RateLimitExceeded
        /// </summary>
        [EnumMember(Value = "RateLimitExceeded")]
        RateLimitExceeded = 3    }
}
