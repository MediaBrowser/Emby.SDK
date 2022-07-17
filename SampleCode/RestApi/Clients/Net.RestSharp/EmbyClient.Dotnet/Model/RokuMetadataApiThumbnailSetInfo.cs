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
    /// RokuMetadataApiThumbnailSetInfo
    /// </summary>
    [DataContract]
        public partial class RokuMetadataApiThumbnailSetInfo :  IEquatable<RokuMetadataApiThumbnailSetInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RokuMetadataApiThumbnailSetInfo" /> class.
        /// </summary>
        /// <param name="aspectRatio">aspectRatio.</param>
        /// <param name="thumbnails">thumbnails.</param>
        public RokuMetadataApiThumbnailSetInfo(double? aspectRatio = default(double?), List<RokuMetadataApiThumbnailInfo> thumbnails = default(List<RokuMetadataApiThumbnailInfo>))
        {
            this.AspectRatio = aspectRatio;
            this.Thumbnails = thumbnails;
        }
        
        /// <summary>
        /// Gets or Sets AspectRatio
        /// </summary>
        [DataMember(Name="AspectRatio", EmitDefaultValue=false)]
        public double? AspectRatio { get; set; }

        /// <summary>
        /// Gets or Sets Thumbnails
        /// </summary>
        [DataMember(Name="Thumbnails", EmitDefaultValue=false)]
        public List<RokuMetadataApiThumbnailInfo> Thumbnails { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RokuMetadataApiThumbnailSetInfo {\n");
            sb.Append("  AspectRatio: ").Append(AspectRatio).Append("\n");
            sb.Append("  Thumbnails: ").Append(Thumbnails).Append("\n");
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
            return this.Equals(input as RokuMetadataApiThumbnailSetInfo);
        }

        /// <summary>
        /// Returns true if RokuMetadataApiThumbnailSetInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RokuMetadataApiThumbnailSetInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RokuMetadataApiThumbnailSetInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AspectRatio == input.AspectRatio ||
                    (this.AspectRatio != null &&
                    this.AspectRatio.Equals(input.AspectRatio))
                ) && 
                (
                    this.Thumbnails == input.Thumbnails ||
                    this.Thumbnails != null &&
                    input.Thumbnails != null &&
                    this.Thumbnails.SequenceEqual(input.Thumbnails)
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
                if (this.AspectRatio != null)
                    hashCode = hashCode * 59 + this.AspectRatio.GetHashCode();
                if (this.Thumbnails != null)
                    hashCode = hashCode * 59 + this.Thumbnails.GetHashCode();
                return hashCode;
            }
        }

    }
}
