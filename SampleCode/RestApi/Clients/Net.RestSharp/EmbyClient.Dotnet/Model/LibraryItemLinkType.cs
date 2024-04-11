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
    /// Defines Library.ItemLinkType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LibraryItemLinkType
    {
        /// <summary>
        /// Enum Artists for value: Artists
        /// </summary>
        [EnumMember(Value = "Artists")]
        Artists = 1,
        /// <summary>
        /// Enum AlbumArtists for value: AlbumArtists
        /// </summary>
        [EnumMember(Value = "AlbumArtists")]
        AlbumArtists = 2,
        /// <summary>
        /// Enum Genres for value: Genres
        /// </summary>
        [EnumMember(Value = "Genres")]
        Genres = 3,
        /// <summary>
        /// Enum Studios for value: Studios
        /// </summary>
        [EnumMember(Value = "Studios")]
        Studios = 4,
        /// <summary>
        /// Enum Tags for value: Tags
        /// </summary>
        [EnumMember(Value = "Tags")]
        Tags = 5,
        /// <summary>
        /// Enum Composers for value: Composers
        /// </summary>
        [EnumMember(Value = "Composers")]
        Composers = 6,
        /// <summary>
        /// Enum Collections for value: Collections
        /// </summary>
        [EnumMember(Value = "Collections")]
        Collections = 7,
        /// <summary>
        /// Enum Albums for value: Albums
        /// </summary>
        [EnumMember(Value = "Albums")]
        Albums = 8,
        /// <summary>
        /// Enum CollectionFolders for value: CollectionFolders
        /// </summary>
        [EnumMember(Value = "CollectionFolders")]
        CollectionFolders = 9,
        /// <summary>
        /// Enum LiveTVSeries for value: LiveTVSeries
        /// </summary>
        [EnumMember(Value = "LiveTVSeries")]
        LiveTVSeries = 10,
        /// <summary>
        /// Enum GameSystems for value: GameSystems
        /// </summary>
        [EnumMember(Value = "GameSystems")]
        GameSystems = 11    }
}
