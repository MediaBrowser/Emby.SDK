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
    /// RemoteSearchResult
    /// </summary>
    [DataContract]
        public partial class RemoteSearchResult :  IEquatable<RemoteSearchResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteSearchResult" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="originalTitle">originalTitle.</param>
        /// <param name="providerIds">providerIds.</param>
        /// <param name="productionYear">The year..</param>
        /// <param name="indexNumber">indexNumber.</param>
        /// <param name="indexNumberEnd">indexNumberEnd.</param>
        /// <param name="parentIndexNumber">parentIndexNumber.</param>
        /// <param name="sortIndexNumber">sortIndexNumber.</param>
        /// <param name="sortParentIndexNumber">sortParentIndexNumber.</param>
        /// <param name="premiereDate">premiereDate.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="imageUrl">imageUrl.</param>
        /// <param name="searchProviderName">searchProviderName.</param>
        /// <param name="gameSystem">gameSystem.</param>
        /// <param name="overview">overview.</param>
        /// <param name="disambiguationComment">disambiguationComment.</param>
        /// <param name="albumArtist">albumArtist.</param>
        /// <param name="artists">artists.</param>
        public RemoteSearchResult(string name = default(string), string originalTitle = default(string), ProviderIdDictionary providerIds = default(ProviderIdDictionary), int? productionYear = default(int?), int? indexNumber = default(int?), int? indexNumberEnd = default(int?), int? parentIndexNumber = default(int?), int? sortIndexNumber = default(int?), int? sortParentIndexNumber = default(int?), DateTimeOffset? premiereDate = default(DateTimeOffset?), DateTimeOffset? startDate = default(DateTimeOffset?), DateTimeOffset? endDate = default(DateTimeOffset?), string imageUrl = default(string), string searchProviderName = default(string), string gameSystem = default(string), string overview = default(string), string disambiguationComment = default(string), RemoteSearchResult albumArtist = default(RemoteSearchResult), List<RemoteSearchResult> artists = default(List<RemoteSearchResult>))
        {
            this.Name = name;
            this.OriginalTitle = originalTitle;
            this.ProviderIds = providerIds;
            this.ProductionYear = productionYear;
            this.IndexNumber = indexNumber;
            this.IndexNumberEnd = indexNumberEnd;
            this.ParentIndexNumber = parentIndexNumber;
            this.SortIndexNumber = sortIndexNumber;
            this.SortParentIndexNumber = sortParentIndexNumber;
            this.PremiereDate = premiereDate;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.ImageUrl = imageUrl;
            this.SearchProviderName = searchProviderName;
            this.GameSystem = gameSystem;
            this.Overview = overview;
            this.DisambiguationComment = disambiguationComment;
            this.AlbumArtist = albumArtist;
            this.Artists = artists;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets OriginalTitle
        /// </summary>
        [DataMember(Name="OriginalTitle", EmitDefaultValue=false)]
        public string OriginalTitle { get; set; }

        /// <summary>
        /// Gets or Sets ProviderIds
        /// </summary>
        [DataMember(Name="ProviderIds", EmitDefaultValue=false)]
        public ProviderIdDictionary ProviderIds { get; set; }

        /// <summary>
        /// The year.
        /// </summary>
        /// <value>The year.</value>
        [DataMember(Name="ProductionYear", EmitDefaultValue=false)]
        public int? ProductionYear { get; set; }

        /// <summary>
        /// Gets or Sets IndexNumber
        /// </summary>
        [DataMember(Name="IndexNumber", EmitDefaultValue=false)]
        public int? IndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets IndexNumberEnd
        /// </summary>
        [DataMember(Name="IndexNumberEnd", EmitDefaultValue=false)]
        public int? IndexNumberEnd { get; set; }

        /// <summary>
        /// Gets or Sets ParentIndexNumber
        /// </summary>
        [DataMember(Name="ParentIndexNumber", EmitDefaultValue=false)]
        public int? ParentIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets SortIndexNumber
        /// </summary>
        [DataMember(Name="SortIndexNumber", EmitDefaultValue=false)]
        public int? SortIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets SortParentIndexNumber
        /// </summary>
        [DataMember(Name="SortParentIndexNumber", EmitDefaultValue=false)]
        public int? SortParentIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets PremiereDate
        /// </summary>
        [DataMember(Name="PremiereDate", EmitDefaultValue=false)]
        public DateTimeOffset? PremiereDate { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="StartDate", EmitDefaultValue=false)]
        public DateTimeOffset? StartDate { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="EndDate", EmitDefaultValue=false)]
        public DateTimeOffset? EndDate { get; set; }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name="ImageUrl", EmitDefaultValue=false)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets SearchProviderName
        /// </summary>
        [DataMember(Name="SearchProviderName", EmitDefaultValue=false)]
        public string SearchProviderName { get; set; }

        /// <summary>
        /// Gets or Sets GameSystem
        /// </summary>
        [DataMember(Name="GameSystem", EmitDefaultValue=false)]
        public string GameSystem { get; set; }

        /// <summary>
        /// Gets or Sets Overview
        /// </summary>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// Gets or Sets DisambiguationComment
        /// </summary>
        [DataMember(Name="DisambiguationComment", EmitDefaultValue=false)]
        public string DisambiguationComment { get; set; }

        /// <summary>
        /// Gets or Sets AlbumArtist
        /// </summary>
        [DataMember(Name="AlbumArtist", EmitDefaultValue=false)]
        public RemoteSearchResult AlbumArtist { get; set; }

        /// <summary>
        /// Gets or Sets Artists
        /// </summary>
        [DataMember(Name="Artists", EmitDefaultValue=false)]
        public List<RemoteSearchResult> Artists { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RemoteSearchResult {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OriginalTitle: ").Append(OriginalTitle).Append("\n");
            sb.Append("  ProviderIds: ").Append(ProviderIds).Append("\n");
            sb.Append("  ProductionYear: ").Append(ProductionYear).Append("\n");
            sb.Append("  IndexNumber: ").Append(IndexNumber).Append("\n");
            sb.Append("  IndexNumberEnd: ").Append(IndexNumberEnd).Append("\n");
            sb.Append("  ParentIndexNumber: ").Append(ParentIndexNumber).Append("\n");
            sb.Append("  SortIndexNumber: ").Append(SortIndexNumber).Append("\n");
            sb.Append("  SortParentIndexNumber: ").Append(SortParentIndexNumber).Append("\n");
            sb.Append("  PremiereDate: ").Append(PremiereDate).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  SearchProviderName: ").Append(SearchProviderName).Append("\n");
            sb.Append("  GameSystem: ").Append(GameSystem).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  DisambiguationComment: ").Append(DisambiguationComment).Append("\n");
            sb.Append("  AlbumArtist: ").Append(AlbumArtist).Append("\n");
            sb.Append("  Artists: ").Append(Artists).Append("\n");
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
            return this.Equals(input as RemoteSearchResult);
        }

        /// <summary>
        /// Returns true if RemoteSearchResult instances are equal
        /// </summary>
        /// <param name="input">Instance of RemoteSearchResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RemoteSearchResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OriginalTitle == input.OriginalTitle ||
                    (this.OriginalTitle != null &&
                    this.OriginalTitle.Equals(input.OriginalTitle))
                ) && 
                (
                    this.ProviderIds == input.ProviderIds ||
                    (this.ProviderIds != null &&
                    this.ProviderIds.Equals(input.ProviderIds))
                ) && 
                (
                    this.ProductionYear == input.ProductionYear ||
                    (this.ProductionYear != null &&
                    this.ProductionYear.Equals(input.ProductionYear))
                ) && 
                (
                    this.IndexNumber == input.IndexNumber ||
                    (this.IndexNumber != null &&
                    this.IndexNumber.Equals(input.IndexNumber))
                ) && 
                (
                    this.IndexNumberEnd == input.IndexNumberEnd ||
                    (this.IndexNumberEnd != null &&
                    this.IndexNumberEnd.Equals(input.IndexNumberEnd))
                ) && 
                (
                    this.ParentIndexNumber == input.ParentIndexNumber ||
                    (this.ParentIndexNumber != null &&
                    this.ParentIndexNumber.Equals(input.ParentIndexNumber))
                ) && 
                (
                    this.SortIndexNumber == input.SortIndexNumber ||
                    (this.SortIndexNumber != null &&
                    this.SortIndexNumber.Equals(input.SortIndexNumber))
                ) && 
                (
                    this.SortParentIndexNumber == input.SortParentIndexNumber ||
                    (this.SortParentIndexNumber != null &&
                    this.SortParentIndexNumber.Equals(input.SortParentIndexNumber))
                ) && 
                (
                    this.PremiereDate == input.PremiereDate ||
                    (this.PremiereDate != null &&
                    this.PremiereDate.Equals(input.PremiereDate))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.ImageUrl == input.ImageUrl ||
                    (this.ImageUrl != null &&
                    this.ImageUrl.Equals(input.ImageUrl))
                ) && 
                (
                    this.SearchProviderName == input.SearchProviderName ||
                    (this.SearchProviderName != null &&
                    this.SearchProviderName.Equals(input.SearchProviderName))
                ) && 
                (
                    this.GameSystem == input.GameSystem ||
                    (this.GameSystem != null &&
                    this.GameSystem.Equals(input.GameSystem))
                ) && 
                (
                    this.Overview == input.Overview ||
                    (this.Overview != null &&
                    this.Overview.Equals(input.Overview))
                ) && 
                (
                    this.DisambiguationComment == input.DisambiguationComment ||
                    (this.DisambiguationComment != null &&
                    this.DisambiguationComment.Equals(input.DisambiguationComment))
                ) && 
                (
                    this.AlbumArtist == input.AlbumArtist ||
                    (this.AlbumArtist != null &&
                    this.AlbumArtist.Equals(input.AlbumArtist))
                ) && 
                (
                    this.Artists == input.Artists ||
                    this.Artists != null &&
                    input.Artists != null &&
                    this.Artists.SequenceEqual(input.Artists)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.OriginalTitle != null)
                    hashCode = hashCode * 59 + this.OriginalTitle.GetHashCode();
                if (this.ProviderIds != null)
                    hashCode = hashCode * 59 + this.ProviderIds.GetHashCode();
                if (this.ProductionYear != null)
                    hashCode = hashCode * 59 + this.ProductionYear.GetHashCode();
                if (this.IndexNumber != null)
                    hashCode = hashCode * 59 + this.IndexNumber.GetHashCode();
                if (this.IndexNumberEnd != null)
                    hashCode = hashCode * 59 + this.IndexNumberEnd.GetHashCode();
                if (this.ParentIndexNumber != null)
                    hashCode = hashCode * 59 + this.ParentIndexNumber.GetHashCode();
                if (this.SortIndexNumber != null)
                    hashCode = hashCode * 59 + this.SortIndexNumber.GetHashCode();
                if (this.SortParentIndexNumber != null)
                    hashCode = hashCode * 59 + this.SortParentIndexNumber.GetHashCode();
                if (this.PremiereDate != null)
                    hashCode = hashCode * 59 + this.PremiereDate.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.ImageUrl != null)
                    hashCode = hashCode * 59 + this.ImageUrl.GetHashCode();
                if (this.SearchProviderName != null)
                    hashCode = hashCode * 59 + this.SearchProviderName.GetHashCode();
                if (this.GameSystem != null)
                    hashCode = hashCode * 59 + this.GameSystem.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.DisambiguationComment != null)
                    hashCode = hashCode * 59 + this.DisambiguationComment.GetHashCode();
                if (this.AlbumArtist != null)
                    hashCode = hashCode * 59 + this.AlbumArtist.GetHashCode();
                if (this.Artists != null)
                    hashCode = hashCode * 59 + this.Artists.GetHashCode();
                return hashCode;
            }
        }

    }
}
