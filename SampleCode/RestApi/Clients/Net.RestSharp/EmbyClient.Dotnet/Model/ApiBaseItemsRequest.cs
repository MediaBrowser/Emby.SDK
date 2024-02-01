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
    /// ApiBaseItemsRequest
    /// </summary>
    [DataContract]
        public partial class ApiBaseItemsRequest :  IEquatable<ApiBaseItemsRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiBaseItemsRequest" /> class.
        /// </summary>
        /// <param name="is4K">is4K.</param>
        /// <param name="enableTotalRecordCount">enableTotalRecordCount.</param>
        /// <param name="recordingKeyword">recordingKeyword.</param>
        /// <param name="recordingKeywordType">recordingKeywordType.</param>
        /// <param name="randomSeed">randomSeed.</param>
        /// <param name="genreIds">genreIds.</param>
        /// <param name="collectionIds">collectionIds.</param>
        /// <param name="tagIds">tagIds.</param>
        /// <param name="excludeTagIds">excludeTagIds.</param>
        /// <param name="excludeArtistIds">excludeArtistIds.</param>
        /// <param name="albumArtistIds">albumArtistIds.</param>
        /// <param name="contributingArtistIds">contributingArtistIds.</param>
        /// <param name="albumIds">albumIds.</param>
        /// <param name="outerIds">outerIds.</param>
        /// <param name="listItemIds">listItemIds.</param>
        /// <param name="audioLanguages">audioLanguages.</param>
        /// <param name="subtitleLanguages">subtitleLanguages.</param>
        /// <param name="canEditItems">canEditItems.</param>
        /// <param name="groupItemsInto">groupItemsInto.</param>
        /// <param name="minWidth">minWidth.</param>
        /// <param name="minHeight">minHeight.</param>
        /// <param name="maxWidth">maxWidth.</param>
        /// <param name="maxHeight">maxHeight.</param>
        /// <param name="groupProgramsBySeries">groupProgramsBySeries.</param>
        /// <param name="airDays">airDays.</param>
        /// <param name="isAiring">isAiring.</param>
        /// <param name="hasAired">hasAired.</param>
        public ApiBaseItemsRequest(bool? is4K = default(bool?), bool? enableTotalRecordCount = default(bool?), string recordingKeyword = default(string), LiveTvKeywordType recordingKeywordType = default(LiveTvKeywordType), int? randomSeed = default(int?), string genreIds = default(string), string collectionIds = default(string), string tagIds = default(string), string excludeTagIds = default(string), string excludeArtistIds = default(string), string albumArtistIds = default(string), string contributingArtistIds = default(string), string albumIds = default(string), string outerIds = default(string), string listItemIds = default(string), string audioLanguages = default(string), string subtitleLanguages = default(string), bool? canEditItems = default(bool?), LibraryItemLinkType groupItemsInto = default(LibraryItemLinkType), int? minWidth = default(int?), int? minHeight = default(int?), int? maxWidth = default(int?), int? maxHeight = default(int?), bool? groupProgramsBySeries = default(bool?), List<DayOfWeek> airDays = default(List<DayOfWeek>), bool? isAiring = default(bool?), bool? hasAired = default(bool?))
        {
            this.Is4K = is4K;
            this.EnableTotalRecordCount = enableTotalRecordCount;
            this.RecordingKeyword = recordingKeyword;
            this.RecordingKeywordType = recordingKeywordType;
            this.RandomSeed = randomSeed;
            this.GenreIds = genreIds;
            this.CollectionIds = collectionIds;
            this.TagIds = tagIds;
            this.ExcludeTagIds = excludeTagIds;
            this.ExcludeArtistIds = excludeArtistIds;
            this.AlbumArtistIds = albumArtistIds;
            this.ContributingArtistIds = contributingArtistIds;
            this.AlbumIds = albumIds;
            this.OuterIds = outerIds;
            this.ListItemIds = listItemIds;
            this.AudioLanguages = audioLanguages;
            this.SubtitleLanguages = subtitleLanguages;
            this.CanEditItems = canEditItems;
            this.GroupItemsInto = groupItemsInto;
            this.MinWidth = minWidth;
            this.MinHeight = minHeight;
            this.MaxWidth = maxWidth;
            this.MaxHeight = maxHeight;
            this.GroupProgramsBySeries = groupProgramsBySeries;
            this.AirDays = airDays;
            this.IsAiring = isAiring;
            this.HasAired = hasAired;
        }
        
        /// <summary>
        /// Gets or Sets Is4K
        /// </summary>
        [DataMember(Name="Is4K", EmitDefaultValue=false)]
        public bool? Is4K { get; set; }

        /// <summary>
        /// Gets or Sets EnableTotalRecordCount
        /// </summary>
        [DataMember(Name="EnableTotalRecordCount", EmitDefaultValue=false)]
        public bool? EnableTotalRecordCount { get; set; }

        /// <summary>
        /// Gets or Sets RecordingKeyword
        /// </summary>
        [DataMember(Name="RecordingKeyword", EmitDefaultValue=false)]
        public string RecordingKeyword { get; set; }

        /// <summary>
        /// Gets or Sets RecordingKeywordType
        /// </summary>
        [DataMember(Name="RecordingKeywordType", EmitDefaultValue=false)]
        public LiveTvKeywordType RecordingKeywordType { get; set; }

        /// <summary>
        /// Gets or Sets RandomSeed
        /// </summary>
        [DataMember(Name="RandomSeed", EmitDefaultValue=false)]
        public int? RandomSeed { get; set; }

        /// <summary>
        /// Gets or Sets GenreIds
        /// </summary>
        [DataMember(Name="GenreIds", EmitDefaultValue=false)]
        public string GenreIds { get; set; }

        /// <summary>
        /// Gets or Sets CollectionIds
        /// </summary>
        [DataMember(Name="CollectionIds", EmitDefaultValue=false)]
        public string CollectionIds { get; set; }

        /// <summary>
        /// Gets or Sets TagIds
        /// </summary>
        [DataMember(Name="TagIds", EmitDefaultValue=false)]
        public string TagIds { get; set; }

        /// <summary>
        /// Gets or Sets ExcludeTagIds
        /// </summary>
        [DataMember(Name="ExcludeTagIds", EmitDefaultValue=false)]
        public string ExcludeTagIds { get; set; }

        /// <summary>
        /// Gets or Sets ExcludeArtistIds
        /// </summary>
        [DataMember(Name="ExcludeArtistIds", EmitDefaultValue=false)]
        public string ExcludeArtistIds { get; set; }

        /// <summary>
        /// Gets or Sets AlbumArtistIds
        /// </summary>
        [DataMember(Name="AlbumArtistIds", EmitDefaultValue=false)]
        public string AlbumArtistIds { get; set; }

        /// <summary>
        /// Gets or Sets ContributingArtistIds
        /// </summary>
        [DataMember(Name="ContributingArtistIds", EmitDefaultValue=false)]
        public string ContributingArtistIds { get; set; }

        /// <summary>
        /// Gets or Sets AlbumIds
        /// </summary>
        [DataMember(Name="AlbumIds", EmitDefaultValue=false)]
        public string AlbumIds { get; set; }

        /// <summary>
        /// Gets or Sets OuterIds
        /// </summary>
        [DataMember(Name="OuterIds", EmitDefaultValue=false)]
        public string OuterIds { get; set; }

        /// <summary>
        /// Gets or Sets ListItemIds
        /// </summary>
        [DataMember(Name="ListItemIds", EmitDefaultValue=false)]
        public string ListItemIds { get; set; }

        /// <summary>
        /// Gets or Sets AudioLanguages
        /// </summary>
        [DataMember(Name="AudioLanguages", EmitDefaultValue=false)]
        public string AudioLanguages { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleLanguages
        /// </summary>
        [DataMember(Name="SubtitleLanguages", EmitDefaultValue=false)]
        public string SubtitleLanguages { get; set; }

        /// <summary>
        /// Gets or Sets CanEditItems
        /// </summary>
        [DataMember(Name="CanEditItems", EmitDefaultValue=false)]
        public bool? CanEditItems { get; set; }

        /// <summary>
        /// Gets or Sets GroupItemsInto
        /// </summary>
        [DataMember(Name="GroupItemsInto", EmitDefaultValue=false)]
        public LibraryItemLinkType GroupItemsInto { get; set; }

        /// <summary>
        /// Gets or Sets MinWidth
        /// </summary>
        [DataMember(Name="MinWidth", EmitDefaultValue=false)]
        public int? MinWidth { get; set; }

        /// <summary>
        /// Gets or Sets MinHeight
        /// </summary>
        [DataMember(Name="MinHeight", EmitDefaultValue=false)]
        public int? MinHeight { get; set; }

        /// <summary>
        /// Gets or Sets MaxWidth
        /// </summary>
        [DataMember(Name="MaxWidth", EmitDefaultValue=false)]
        public int? MaxWidth { get; set; }

        /// <summary>
        /// Gets or Sets MaxHeight
        /// </summary>
        [DataMember(Name="MaxHeight", EmitDefaultValue=false)]
        public int? MaxHeight { get; set; }

        /// <summary>
        /// Gets or Sets GroupProgramsBySeries
        /// </summary>
        [DataMember(Name="GroupProgramsBySeries", EmitDefaultValue=false)]
        public bool? GroupProgramsBySeries { get; set; }

        /// <summary>
        /// Gets or Sets AirDays
        /// </summary>
        [DataMember(Name="AirDays", EmitDefaultValue=false)]
        public List<DayOfWeek> AirDays { get; set; }

        /// <summary>
        /// Gets or Sets IsAiring
        /// </summary>
        [DataMember(Name="IsAiring", EmitDefaultValue=false)]
        public bool? IsAiring { get; set; }

        /// <summary>
        /// Gets or Sets HasAired
        /// </summary>
        [DataMember(Name="HasAired", EmitDefaultValue=false)]
        public bool? HasAired { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiBaseItemsRequest {\n");
            sb.Append("  Is4K: ").Append(Is4K).Append("\n");
            sb.Append("  EnableTotalRecordCount: ").Append(EnableTotalRecordCount).Append("\n");
            sb.Append("  RecordingKeyword: ").Append(RecordingKeyword).Append("\n");
            sb.Append("  RecordingKeywordType: ").Append(RecordingKeywordType).Append("\n");
            sb.Append("  RandomSeed: ").Append(RandomSeed).Append("\n");
            sb.Append("  GenreIds: ").Append(GenreIds).Append("\n");
            sb.Append("  CollectionIds: ").Append(CollectionIds).Append("\n");
            sb.Append("  TagIds: ").Append(TagIds).Append("\n");
            sb.Append("  ExcludeTagIds: ").Append(ExcludeTagIds).Append("\n");
            sb.Append("  ExcludeArtistIds: ").Append(ExcludeArtistIds).Append("\n");
            sb.Append("  AlbumArtistIds: ").Append(AlbumArtistIds).Append("\n");
            sb.Append("  ContributingArtistIds: ").Append(ContributingArtistIds).Append("\n");
            sb.Append("  AlbumIds: ").Append(AlbumIds).Append("\n");
            sb.Append("  OuterIds: ").Append(OuterIds).Append("\n");
            sb.Append("  ListItemIds: ").Append(ListItemIds).Append("\n");
            sb.Append("  AudioLanguages: ").Append(AudioLanguages).Append("\n");
            sb.Append("  SubtitleLanguages: ").Append(SubtitleLanguages).Append("\n");
            sb.Append("  CanEditItems: ").Append(CanEditItems).Append("\n");
            sb.Append("  GroupItemsInto: ").Append(GroupItemsInto).Append("\n");
            sb.Append("  MinWidth: ").Append(MinWidth).Append("\n");
            sb.Append("  MinHeight: ").Append(MinHeight).Append("\n");
            sb.Append("  MaxWidth: ").Append(MaxWidth).Append("\n");
            sb.Append("  MaxHeight: ").Append(MaxHeight).Append("\n");
            sb.Append("  GroupProgramsBySeries: ").Append(GroupProgramsBySeries).Append("\n");
            sb.Append("  AirDays: ").Append(AirDays).Append("\n");
            sb.Append("  IsAiring: ").Append(IsAiring).Append("\n");
            sb.Append("  HasAired: ").Append(HasAired).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ApiBaseItemsRequest);
        }

        /// <summary>
        /// Returns true if ApiBaseItemsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiBaseItemsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiBaseItemsRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Is4K == input.Is4K ||
                    (this.Is4K != null &&
                    this.Is4K.Equals(input.Is4K))
                ) && 
                (
                    this.EnableTotalRecordCount == input.EnableTotalRecordCount ||
                    (this.EnableTotalRecordCount != null &&
                    this.EnableTotalRecordCount.Equals(input.EnableTotalRecordCount))
                ) && 
                (
                    this.RecordingKeyword == input.RecordingKeyword ||
                    (this.RecordingKeyword != null &&
                    this.RecordingKeyword.Equals(input.RecordingKeyword))
                ) && 
                (
                    this.RecordingKeywordType == input.RecordingKeywordType ||
                    (this.RecordingKeywordType != null &&
                    this.RecordingKeywordType.Equals(input.RecordingKeywordType))
                ) && 
                (
                    this.RandomSeed == input.RandomSeed ||
                    (this.RandomSeed != null &&
                    this.RandomSeed.Equals(input.RandomSeed))
                ) && 
                (
                    this.GenreIds == input.GenreIds ||
                    (this.GenreIds != null &&
                    this.GenreIds.Equals(input.GenreIds))
                ) && 
                (
                    this.CollectionIds == input.CollectionIds ||
                    (this.CollectionIds != null &&
                    this.CollectionIds.Equals(input.CollectionIds))
                ) && 
                (
                    this.TagIds == input.TagIds ||
                    (this.TagIds != null &&
                    this.TagIds.Equals(input.TagIds))
                ) && 
                (
                    this.ExcludeTagIds == input.ExcludeTagIds ||
                    (this.ExcludeTagIds != null &&
                    this.ExcludeTagIds.Equals(input.ExcludeTagIds))
                ) && 
                (
                    this.ExcludeArtistIds == input.ExcludeArtistIds ||
                    (this.ExcludeArtistIds != null &&
                    this.ExcludeArtistIds.Equals(input.ExcludeArtistIds))
                ) && 
                (
                    this.AlbumArtistIds == input.AlbumArtistIds ||
                    (this.AlbumArtistIds != null &&
                    this.AlbumArtistIds.Equals(input.AlbumArtistIds))
                ) && 
                (
                    this.ContributingArtistIds == input.ContributingArtistIds ||
                    (this.ContributingArtistIds != null &&
                    this.ContributingArtistIds.Equals(input.ContributingArtistIds))
                ) && 
                (
                    this.AlbumIds == input.AlbumIds ||
                    (this.AlbumIds != null &&
                    this.AlbumIds.Equals(input.AlbumIds))
                ) && 
                (
                    this.OuterIds == input.OuterIds ||
                    (this.OuterIds != null &&
                    this.OuterIds.Equals(input.OuterIds))
                ) && 
                (
                    this.ListItemIds == input.ListItemIds ||
                    (this.ListItemIds != null &&
                    this.ListItemIds.Equals(input.ListItemIds))
                ) && 
                (
                    this.AudioLanguages == input.AudioLanguages ||
                    (this.AudioLanguages != null &&
                    this.AudioLanguages.Equals(input.AudioLanguages))
                ) && 
                (
                    this.SubtitleLanguages == input.SubtitleLanguages ||
                    (this.SubtitleLanguages != null &&
                    this.SubtitleLanguages.Equals(input.SubtitleLanguages))
                ) && 
                (
                    this.CanEditItems == input.CanEditItems ||
                    (this.CanEditItems != null &&
                    this.CanEditItems.Equals(input.CanEditItems))
                ) && 
                (
                    this.GroupItemsInto == input.GroupItemsInto ||
                    (this.GroupItemsInto != null &&
                    this.GroupItemsInto.Equals(input.GroupItemsInto))
                ) && 
                (
                    this.MinWidth == input.MinWidth ||
                    (this.MinWidth != null &&
                    this.MinWidth.Equals(input.MinWidth))
                ) && 
                (
                    this.MinHeight == input.MinHeight ||
                    (this.MinHeight != null &&
                    this.MinHeight.Equals(input.MinHeight))
                ) && 
                (
                    this.MaxWidth == input.MaxWidth ||
                    (this.MaxWidth != null &&
                    this.MaxWidth.Equals(input.MaxWidth))
                ) && 
                (
                    this.MaxHeight == input.MaxHeight ||
                    (this.MaxHeight != null &&
                    this.MaxHeight.Equals(input.MaxHeight))
                ) && 
                (
                    this.GroupProgramsBySeries == input.GroupProgramsBySeries ||
                    (this.GroupProgramsBySeries != null &&
                    this.GroupProgramsBySeries.Equals(input.GroupProgramsBySeries))
                ) && 
                (
                    this.AirDays == input.AirDays ||
                    this.AirDays != null &&
                    input.AirDays != null &&
                    this.AirDays.SequenceEqual(input.AirDays)
                ) && 
                (
                    this.IsAiring == input.IsAiring ||
                    (this.IsAiring != null &&
                    this.IsAiring.Equals(input.IsAiring))
                ) && 
                (
                    this.HasAired == input.HasAired ||
                    (this.HasAired != null &&
                    this.HasAired.Equals(input.HasAired))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Is4K != null)
                    hashCode = hashCode * 59 + this.Is4K.GetHashCode();
                if (this.EnableTotalRecordCount != null)
                    hashCode = hashCode * 59 + this.EnableTotalRecordCount.GetHashCode();
                if (this.RecordingKeyword != null)
                    hashCode = hashCode * 59 + this.RecordingKeyword.GetHashCode();
                if (this.RecordingKeywordType != null)
                    hashCode = hashCode * 59 + this.RecordingKeywordType.GetHashCode();
                if (this.RandomSeed != null)
                    hashCode = hashCode * 59 + this.RandomSeed.GetHashCode();
                if (this.GenreIds != null)
                    hashCode = hashCode * 59 + this.GenreIds.GetHashCode();
                if (this.CollectionIds != null)
                    hashCode = hashCode * 59 + this.CollectionIds.GetHashCode();
                if (this.TagIds != null)
                    hashCode = hashCode * 59 + this.TagIds.GetHashCode();
                if (this.ExcludeTagIds != null)
                    hashCode = hashCode * 59 + this.ExcludeTagIds.GetHashCode();
                if (this.ExcludeArtistIds != null)
                    hashCode = hashCode * 59 + this.ExcludeArtistIds.GetHashCode();
                if (this.AlbumArtistIds != null)
                    hashCode = hashCode * 59 + this.AlbumArtistIds.GetHashCode();
                if (this.ContributingArtistIds != null)
                    hashCode = hashCode * 59 + this.ContributingArtistIds.GetHashCode();
                if (this.AlbumIds != null)
                    hashCode = hashCode * 59 + this.AlbumIds.GetHashCode();
                if (this.OuterIds != null)
                    hashCode = hashCode * 59 + this.OuterIds.GetHashCode();
                if (this.ListItemIds != null)
                    hashCode = hashCode * 59 + this.ListItemIds.GetHashCode();
                if (this.AudioLanguages != null)
                    hashCode = hashCode * 59 + this.AudioLanguages.GetHashCode();
                if (this.SubtitleLanguages != null)
                    hashCode = hashCode * 59 + this.SubtitleLanguages.GetHashCode();
                if (this.CanEditItems != null)
                    hashCode = hashCode * 59 + this.CanEditItems.GetHashCode();
                if (this.GroupItemsInto != null)
                    hashCode = hashCode * 59 + this.GroupItemsInto.GetHashCode();
                if (this.MinWidth != null)
                    hashCode = hashCode * 59 + this.MinWidth.GetHashCode();
                if (this.MinHeight != null)
                    hashCode = hashCode * 59 + this.MinHeight.GetHashCode();
                if (this.MaxWidth != null)
                    hashCode = hashCode * 59 + this.MaxWidth.GetHashCode();
                if (this.MaxHeight != null)
                    hashCode = hashCode * 59 + this.MaxHeight.GetHashCode();
                if (this.GroupProgramsBySeries != null)
                    hashCode = hashCode * 59 + this.GroupProgramsBySeries.GetHashCode();
                if (this.AirDays != null)
                    hashCode = hashCode * 59 + this.AirDays.GetHashCode();
                if (this.IsAiring != null)
                    hashCode = hashCode * 59 + this.IsAiring.GetHashCode();
                if (this.HasAired != null)
                    hashCode = hashCode * 59 + this.HasAired.GetHashCode();
                return hashCode;
            }
        }

    }
}
