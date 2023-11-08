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
    /// Defines UserActionType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum UserActionType
    {
        /// <summary>
        /// Enum PlayedItem for value: PlayedItem
        /// </summary>
        [EnumMember(Value = "PlayedItem")]
        PlayedItem = 1,
        /// <summary>
        /// Enum MarkPlayed for value: MarkPlayed
        /// </summary>
        [EnumMember(Value = "MarkPlayed")]
        MarkPlayed = 2,
        /// <summary>
        /// Enum MarkFavorite for value: MarkFavorite
        /// </summary>
        [EnumMember(Value = "MarkFavorite")]
        MarkFavorite = 3    }
}
