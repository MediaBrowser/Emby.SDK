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
    /// Class ThemeMediaResult  
    /// </summary>
    [DataContract]
        public partial class ThemeMediaResult :  IEquatable<ThemeMediaResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ThemeMediaResult" /> class.
        /// </summary>
        /// <param name="ownerId">The owner id..</param>
        /// <param name="items">items.</param>
        /// <param name="totalRecordCount">totalRecordCount.</param>
        public ThemeMediaResult(long? ownerId = default(long?), List<BaseItemDto> items = default(List<BaseItemDto>), int? totalRecordCount = default(int?))
        {
            this.OwnerId = ownerId;
            this.Items = items;
            this.TotalRecordCount = totalRecordCount;
        }
        
        /// <summary>
        /// The owner id.
        /// </summary>
        /// <value>The owner id.</value>
        [DataMember(Name="OwnerId", EmitDefaultValue=false)]
        public long? OwnerId { get; set; }

        /// <summary>
        /// Gets or Sets Items
        /// </summary>
        [DataMember(Name="Items", EmitDefaultValue=false)]
        public List<BaseItemDto> Items { get; set; }

        /// <summary>
        /// Gets or Sets TotalRecordCount
        /// </summary>
        [DataMember(Name="TotalRecordCount", EmitDefaultValue=false)]
        public int? TotalRecordCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ThemeMediaResult {\n");
            sb.Append("  OwnerId: ").Append(OwnerId).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  TotalRecordCount: ").Append(TotalRecordCount).Append("\n");
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
            return this.Equals(input as ThemeMediaResult);
        }

        /// <summary>
        /// Returns true if ThemeMediaResult instances are equal
        /// </summary>
        /// <param name="input">Instance of ThemeMediaResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ThemeMediaResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OwnerId == input.OwnerId ||
                    (this.OwnerId != null &&
                    this.OwnerId.Equals(input.OwnerId))
                ) && 
                (
                    this.Items == input.Items ||
                    this.Items != null &&
                    input.Items != null &&
                    this.Items.SequenceEqual(input.Items)
                ) && 
                (
                    this.TotalRecordCount == input.TotalRecordCount ||
                    (this.TotalRecordCount != null &&
                    this.TotalRecordCount.Equals(input.TotalRecordCount))
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
                if (this.OwnerId != null)
                    hashCode = hashCode * 59 + this.OwnerId.GetHashCode();
                if (this.Items != null)
                    hashCode = hashCode * 59 + this.Items.GetHashCode();
                if (this.TotalRecordCount != null)
                    hashCode = hashCode * 59 + this.TotalRecordCount.GetHashCode();
                return hashCode;
            }
        }

    }
}
