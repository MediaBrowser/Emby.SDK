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
    /// Defines RecommendationType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum RecommendationType
    {
        /// <summary>
        /// Enum SimilarToRecentlyPlayed for value: SimilarToRecentlyPlayed
        /// </summary>
        [EnumMember(Value = "SimilarToRecentlyPlayed")]
        SimilarToRecentlyPlayed = 1,
        /// <summary>
        /// Enum SimilarToLikedItem for value: SimilarToLikedItem
        /// </summary>
        [EnumMember(Value = "SimilarToLikedItem")]
        SimilarToLikedItem = 2,
        /// <summary>
        /// Enum HasDirectorFromRecentlyPlayed for value: HasDirectorFromRecentlyPlayed
        /// </summary>
        [EnumMember(Value = "HasDirectorFromRecentlyPlayed")]
        HasDirectorFromRecentlyPlayed = 3,
        /// <summary>
        /// Enum HasActorFromRecentlyPlayed for value: HasActorFromRecentlyPlayed
        /// </summary>
        [EnumMember(Value = "HasActorFromRecentlyPlayed")]
        HasActorFromRecentlyPlayed = 4,
        /// <summary>
        /// Enum HasLikedDirector for value: HasLikedDirector
        /// </summary>
        [EnumMember(Value = "HasLikedDirector")]
        HasLikedDirector = 5,
        /// <summary>
        /// Enum HasLikedActor for value: HasLikedActor
        /// </summary>
        [EnumMember(Value = "HasLikedActor")]
        HasLikedActor = 6    }
}
