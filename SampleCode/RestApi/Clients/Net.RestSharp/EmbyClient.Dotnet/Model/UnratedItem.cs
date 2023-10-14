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
    /// Defines UnratedItem
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum UnratedItem
    {
        /// <summary>
        /// Enum Movie for value: Movie
        /// </summary>
        [EnumMember(Value = "Movie")]
        Movie = 1,
        /// <summary>
        /// Enum Trailer for value: Trailer
        /// </summary>
        [EnumMember(Value = "Trailer")]
        Trailer = 2,
        /// <summary>
        /// Enum Series for value: Series
        /// </summary>
        [EnumMember(Value = "Series")]
        Series = 3,
        /// <summary>
        /// Enum Music for value: Music
        /// </summary>
        [EnumMember(Value = "Music")]
        Music = 4,
        /// <summary>
        /// Enum Game for value: Game
        /// </summary>
        [EnumMember(Value = "Game")]
        Game = 5,
        /// <summary>
        /// Enum Book for value: Book
        /// </summary>
        [EnumMember(Value = "Book")]
        Book = 6,
        /// <summary>
        /// Enum LiveTvChannel for value: LiveTvChannel
        /// </summary>
        [EnumMember(Value = "LiveTvChannel")]
        LiveTvChannel = 7,
        /// <summary>
        /// Enum LiveTvProgram for value: LiveTvProgram
        /// </summary>
        [EnumMember(Value = "LiveTvProgram")]
        LiveTvProgram = 8,
        /// <summary>
        /// Enum ChannelContent for value: ChannelContent
        /// </summary>
        [EnumMember(Value = "ChannelContent")]
        ChannelContent = 9,
        /// <summary>
        /// Enum Other for value: Other
        /// </summary>
        [EnumMember(Value = "Other")]
        Other = 10    }
}
