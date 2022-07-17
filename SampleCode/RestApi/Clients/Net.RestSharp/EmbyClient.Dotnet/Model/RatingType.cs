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
    /// Defines RatingType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum RatingType
    {
        /// <summary>
        /// Enum Score for value: Score
        /// </summary>
        [EnumMember(Value = "Score")]
        Score = 1,
        /// <summary>
        /// Enum Likes for value: Likes
        /// </summary>
        [EnumMember(Value = "Likes")]
        Likes = 2    }
}
