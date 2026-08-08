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
    /// ItemsQuery
    /// </summary>
    [DataContract]
        public partial class ItemsQuery :  IEquatable<ItemsQuery>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemsQuery" /> class.
        /// </summary>
        /// <param name="studioIds">studioIds.</param>
        /// <param name="tagIds">tagIds.</param>
        /// <param name="genreIds">genreIds.</param>
        /// <param name="collectionTypes">collectionTypes.</param>
        /// <param name="isFavorite">isFavorite.</param>
        /// <param name="isPlayed">isPlayed.</param>
        /// <param name="isResumable">isResumable.</param>
        /// <param name="isSports">isSports.</param>
        /// <param name="isNews">isNews.</param>
        /// <param name="isSeries">isSeries.</param>
        /// <param name="isMovie">isMovie.</param>
        /// <param name="isRepeat">isRepeat.</param>
        public ItemsQuery(List<string> studioIds = default(List<string>), List<string> tagIds = default(List<string>), List<string> genreIds = default(List<string>), List<string> collectionTypes = default(List<string>), bool? isFavorite = default(bool?), bool? isPlayed = default(bool?), bool? isResumable = default(bool?), bool? isSports = default(bool?), bool? isNews = default(bool?), bool? isSeries = default(bool?), bool? isMovie = default(bool?), bool? isRepeat = default(bool?))
        {
            this.StudioIds = studioIds;
            this.TagIds = tagIds;
            this.GenreIds = genreIds;
            this.CollectionTypes = collectionTypes;
            this.IsFavorite = isFavorite;
            this.IsPlayed = isPlayed;
            this.IsResumable = isResumable;
            this.IsSports = isSports;
            this.IsNews = isNews;
            this.IsSeries = isSeries;
            this.IsMovie = isMovie;
            this.IsRepeat = isRepeat;
        }
        
        /// <summary>
        /// Gets or Sets StudioIds
        /// </summary>
        [DataMember(Name="StudioIds", EmitDefaultValue=false)]
        public List<string> StudioIds { get; set; }

        /// <summary>
        /// Gets or Sets TagIds
        /// </summary>
        [DataMember(Name="TagIds", EmitDefaultValue=false)]
        public List<string> TagIds { get; set; }

        /// <summary>
        /// Gets or Sets GenreIds
        /// </summary>
        [DataMember(Name="GenreIds", EmitDefaultValue=false)]
        public List<string> GenreIds { get; set; }

        /// <summary>
        /// Gets or Sets CollectionTypes
        /// </summary>
        [DataMember(Name="CollectionTypes", EmitDefaultValue=false)]
        public List<string> CollectionTypes { get; set; }

        /// <summary>
        /// Gets or Sets IsFavorite
        /// </summary>
        [DataMember(Name="IsFavorite", EmitDefaultValue=false)]
        public bool? IsFavorite { get; set; }

        /// <summary>
        /// Gets or Sets IsPlayed
        /// </summary>
        [DataMember(Name="IsPlayed", EmitDefaultValue=false)]
        public bool? IsPlayed { get; set; }

        /// <summary>
        /// Gets or Sets IsResumable
        /// </summary>
        [DataMember(Name="IsResumable", EmitDefaultValue=false)]
        public bool? IsResumable { get; set; }

        /// <summary>
        /// Gets or Sets IsSports
        /// </summary>
        [DataMember(Name="IsSports", EmitDefaultValue=false)]
        public bool? IsSports { get; set; }

        /// <summary>
        /// Gets or Sets IsNews
        /// </summary>
        [DataMember(Name="IsNews", EmitDefaultValue=false)]
        public bool? IsNews { get; set; }

        /// <summary>
        /// Gets or Sets IsSeries
        /// </summary>
        [DataMember(Name="IsSeries", EmitDefaultValue=false)]
        public bool? IsSeries { get; set; }

        /// <summary>
        /// Gets or Sets IsMovie
        /// </summary>
        [DataMember(Name="IsMovie", EmitDefaultValue=false)]
        public bool? IsMovie { get; set; }

        /// <summary>
        /// Gets or Sets IsRepeat
        /// </summary>
        [DataMember(Name="IsRepeat", EmitDefaultValue=false)]
        public bool? IsRepeat { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ItemsQuery {\n");
            sb.Append("  StudioIds: ").Append(StudioIds).Append("\n");
            sb.Append("  TagIds: ").Append(TagIds).Append("\n");
            sb.Append("  GenreIds: ").Append(GenreIds).Append("\n");
            sb.Append("  CollectionTypes: ").Append(CollectionTypes).Append("\n");
            sb.Append("  IsFavorite: ").Append(IsFavorite).Append("\n");
            sb.Append("  IsPlayed: ").Append(IsPlayed).Append("\n");
            sb.Append("  IsResumable: ").Append(IsResumable).Append("\n");
            sb.Append("  IsSports: ").Append(IsSports).Append("\n");
            sb.Append("  IsNews: ").Append(IsNews).Append("\n");
            sb.Append("  IsSeries: ").Append(IsSeries).Append("\n");
            sb.Append("  IsMovie: ").Append(IsMovie).Append("\n");
            sb.Append("  IsRepeat: ").Append(IsRepeat).Append("\n");
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
            return this.Equals(input as ItemsQuery);
        }

        /// <summary>
        /// Returns true if ItemsQuery instances are equal
        /// </summary>
        /// <param name="input">Instance of ItemsQuery to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ItemsQuery input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StudioIds == input.StudioIds ||
                    this.StudioIds != null &&
                    input.StudioIds != null &&
                    this.StudioIds.SequenceEqual(input.StudioIds)
                ) && 
                (
                    this.TagIds == input.TagIds ||
                    this.TagIds != null &&
                    input.TagIds != null &&
                    this.TagIds.SequenceEqual(input.TagIds)
                ) && 
                (
                    this.GenreIds == input.GenreIds ||
                    this.GenreIds != null &&
                    input.GenreIds != null &&
                    this.GenreIds.SequenceEqual(input.GenreIds)
                ) && 
                (
                    this.CollectionTypes == input.CollectionTypes ||
                    this.CollectionTypes != null &&
                    input.CollectionTypes != null &&
                    this.CollectionTypes.SequenceEqual(input.CollectionTypes)
                ) && 
                (
                    this.IsFavorite == input.IsFavorite ||
                    (this.IsFavorite != null &&
                    this.IsFavorite.Equals(input.IsFavorite))
                ) && 
                (
                    this.IsPlayed == input.IsPlayed ||
                    (this.IsPlayed != null &&
                    this.IsPlayed.Equals(input.IsPlayed))
                ) && 
                (
                    this.IsResumable == input.IsResumable ||
                    (this.IsResumable != null &&
                    this.IsResumable.Equals(input.IsResumable))
                ) && 
                (
                    this.IsSports == input.IsSports ||
                    (this.IsSports != null &&
                    this.IsSports.Equals(input.IsSports))
                ) && 
                (
                    this.IsNews == input.IsNews ||
                    (this.IsNews != null &&
                    this.IsNews.Equals(input.IsNews))
                ) && 
                (
                    this.IsSeries == input.IsSeries ||
                    (this.IsSeries != null &&
                    this.IsSeries.Equals(input.IsSeries))
                ) && 
                (
                    this.IsMovie == input.IsMovie ||
                    (this.IsMovie != null &&
                    this.IsMovie.Equals(input.IsMovie))
                ) && 
                (
                    this.IsRepeat == input.IsRepeat ||
                    (this.IsRepeat != null &&
                    this.IsRepeat.Equals(input.IsRepeat))
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
                if (this.StudioIds != null)
                    hashCode = hashCode * 59 + this.StudioIds.GetHashCode();
                if (this.TagIds != null)
                    hashCode = hashCode * 59 + this.TagIds.GetHashCode();
                if (this.GenreIds != null)
                    hashCode = hashCode * 59 + this.GenreIds.GetHashCode();
                if (this.CollectionTypes != null)
                    hashCode = hashCode * 59 + this.CollectionTypes.GetHashCode();
                if (this.IsFavorite != null)
                    hashCode = hashCode * 59 + this.IsFavorite.GetHashCode();
                if (this.IsPlayed != null)
                    hashCode = hashCode * 59 + this.IsPlayed.GetHashCode();
                if (this.IsResumable != null)
                    hashCode = hashCode * 59 + this.IsResumable.GetHashCode();
                if (this.IsSports != null)
                    hashCode = hashCode * 59 + this.IsSports.GetHashCode();
                if (this.IsNews != null)
                    hashCode = hashCode * 59 + this.IsNews.GetHashCode();
                if (this.IsSeries != null)
                    hashCode = hashCode * 59 + this.IsSeries.GetHashCode();
                if (this.IsMovie != null)
                    hashCode = hashCode * 59 + this.IsMovie.GetHashCode();
                if (this.IsRepeat != null)
                    hashCode = hashCode * 59 + this.IsRepeat.GetHashCode();
                return hashCode;
            }
        }

    }
}
