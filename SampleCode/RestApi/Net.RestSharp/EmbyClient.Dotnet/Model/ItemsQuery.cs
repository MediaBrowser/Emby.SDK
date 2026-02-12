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
        public ItemsQuery(List<string> studioIds = default(List<string>), List<string> tagIds = default(List<string>), List<string> genreIds = default(List<string>), List<string> collectionTypes = default(List<string>), bool? isFavorite = default(bool?))
        {
            this.StudioIds = studioIds;
            this.TagIds = tagIds;
            this.GenreIds = genreIds;
            this.CollectionTypes = collectionTypes;
            this.IsFavorite = isFavorite;
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
                return hashCode;
            }
        }

    }
}
