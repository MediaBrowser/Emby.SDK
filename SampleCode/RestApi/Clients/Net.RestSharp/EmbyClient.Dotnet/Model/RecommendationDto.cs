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
    /// RecommendationDto
    /// </summary>
    [DataContract]
        public partial class RecommendationDto :  IEquatable<RecommendationDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecommendationDto" /> class.
        /// </summary>
        /// <param name="items">items.</param>
        /// <param name="recommendationType">recommendationType.</param>
        /// <param name="baselineItemName">baselineItemName.</param>
        /// <param name="categoryId">categoryId.</param>
        public RecommendationDto(List<BaseItemDto> items = default(List<BaseItemDto>), RecommendationType recommendationType = default(RecommendationType), string baselineItemName = default(string), long? categoryId = default(long?))
        {
            this.Items = items;
            this.RecommendationType = recommendationType;
            this.BaselineItemName = baselineItemName;
            this.CategoryId = categoryId;
        }
        
        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="Items", EmitDefaultValue=false)]
        public List<BaseItemDto> Items { get; set; }

        /// <summary>
        /// Gets or Sets RecommendationType
        /// </summary>
        [DataMember(Name="RecommendationType", EmitDefaultValue=false)]
        public RecommendationType RecommendationType { get; set; }

        /// <summary>
        /// Gets or Sets BaselineItemName
        /// </summary>
        [DataMember(Name="BaselineItemName", EmitDefaultValue=false)]
        public string BaselineItemName { get; set; }

        /// <summary>
        /// Gets or Sets CategoryId
        /// </summary>
        [DataMember(Name="CategoryId", EmitDefaultValue=false)]
        public long? CategoryId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RecommendationDto {\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  RecommendationType: ").Append(RecommendationType).Append("\n");
            sb.Append("  BaselineItemName: ").Append(BaselineItemName).Append("\n");
            sb.Append("  CategoryId: ").Append(CategoryId).Append("\n");
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
            return this.Equals(input as RecommendationDto);
        }

        /// <summary>
        /// Returns true if RecommendationDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RecommendationDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecommendationDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Items == input.Items ||
                    this.Items != null &&
                    input.Items != null &&
                    this.Items.SequenceEqual(input.Items)
                ) && 
                (
                    this.RecommendationType == input.RecommendationType ||
                    (this.RecommendationType != null &&
                    this.RecommendationType.Equals(input.RecommendationType))
                ) && 
                (
                    this.BaselineItemName == input.BaselineItemName ||
                    (this.BaselineItemName != null &&
                    this.BaselineItemName.Equals(input.BaselineItemName))
                ) && 
                (
                    this.CategoryId == input.CategoryId ||
                    (this.CategoryId != null &&
                    this.CategoryId.Equals(input.CategoryId))
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
                if (this.Items != null)
                    hashCode = hashCode * 59 + this.Items.GetHashCode();
                if (this.RecommendationType != null)
                    hashCode = hashCode * 59 + this.RecommendationType.GetHashCode();
                if (this.BaselineItemName != null)
                    hashCode = hashCode * 59 + this.BaselineItemName.GetHashCode();
                if (this.CategoryId != null)
                    hashCode = hashCode * 59 + this.CategoryId.GetHashCode();
                return hashCode;
            }
        }

    }
}
