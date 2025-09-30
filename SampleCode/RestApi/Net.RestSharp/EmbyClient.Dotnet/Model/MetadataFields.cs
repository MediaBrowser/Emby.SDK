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
    /// Enum MetadataFields  
    /// </summary>
    /// <value>Enum MetadataFields  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MetadataFields
    {
        /// <summary>
        /// Enum Cast for value: Cast
        /// </summary>
        [EnumMember(Value = "Cast")]
        Cast = 1,
        /// <summary>
        /// Enum Genres for value: Genres
        /// </summary>
        [EnumMember(Value = "Genres")]
        Genres = 2,
        /// <summary>
        /// Enum ProductionLocations for value: ProductionLocations
        /// </summary>
        [EnumMember(Value = "ProductionLocations")]
        ProductionLocations = 3,
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
        /// Enum Name for value: Name
        /// </summary>
        [EnumMember(Value = "Name")]
        Name = 6,
        /// <summary>
        /// Enum Overview for value: Overview
        /// </summary>
        [EnumMember(Value = "Overview")]
        Overview = 7,
        /// <summary>
        /// Enum Runtime for value: Runtime
        /// </summary>
        [EnumMember(Value = "Runtime")]
        Runtime = 8,
        /// <summary>
        /// Enum OfficialRating for value: OfficialRating
        /// </summary>
        [EnumMember(Value = "OfficialRating")]
        OfficialRating = 9,
        /// <summary>
        /// Enum Collections for value: Collections
        /// </summary>
        [EnumMember(Value = "Collections")]
        Collections = 10,
        /// <summary>
        /// Enum ChannelNumber for value: ChannelNumber
        /// </summary>
        [EnumMember(Value = "ChannelNumber")]
        ChannelNumber = 11,
        /// <summary>
        /// Enum SortName for value: SortName
        /// </summary>
        [EnumMember(Value = "SortName")]
        SortName = 12,
        /// <summary>
        /// Enum OriginalTitle for value: OriginalTitle
        /// </summary>
        [EnumMember(Value = "OriginalTitle")]
        OriginalTitle = 13,
        /// <summary>
        /// Enum SortIndexNumber for value: SortIndexNumber
        /// </summary>
        [EnumMember(Value = "SortIndexNumber")]
        SortIndexNumber = 14,
        /// <summary>
        /// Enum SortParentIndexNumber for value: SortParentIndexNumber
        /// </summary>
        [EnumMember(Value = "SortParentIndexNumber")]
        SortParentIndexNumber = 15,
        /// <summary>
        /// Enum CommunityRating for value: CommunityRating
        /// </summary>
        [EnumMember(Value = "CommunityRating")]
        CommunityRating = 16,
        /// <summary>
        /// Enum CriticRating for value: CriticRating
        /// </summary>
        [EnumMember(Value = "CriticRating")]
        CriticRating = 17,
        /// <summary>
        /// Enum Tagline for value: Tagline
        /// </summary>
        [EnumMember(Value = "Tagline")]
        Tagline = 18,
        /// <summary>
        /// Enum Composers for value: Composers
        /// </summary>
        [EnumMember(Value = "Composers")]
        Composers = 19,
        /// <summary>
        /// Enum Artists for value: Artists
        /// </summary>
        [EnumMember(Value = "Artists")]
        Artists = 20,
        /// <summary>
        /// Enum AlbumArtists for value: AlbumArtists
        /// </summary>
        [EnumMember(Value = "AlbumArtists")]
        AlbumArtists = 21    }
}
