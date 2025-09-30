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
    /// RokuMetadataApiThumbnailInfo
    /// </summary>
    [DataContract]
        public partial class RokuMetadataApiThumbnailInfo :  IEquatable<RokuMetadataApiThumbnailInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RokuMetadataApiThumbnailInfo" /> class.
        /// </summary>
        /// <param name="positionTicks">positionTicks.</param>
        /// <param name="imageTag">imageTag.</param>
        public RokuMetadataApiThumbnailInfo(long? positionTicks = default(long?), string imageTag = default(string))
        {
            this.PositionTicks = positionTicks;
            this.ImageTag = imageTag;
        }
        
        /// <summary>
        /// Gets or Sets PositionTicks
        /// </summary>
        [DataMember(Name="PositionTicks", EmitDefaultValue=false)]
        public long? PositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets ImageTag
        /// </summary>
        [DataMember(Name="ImageTag", EmitDefaultValue=false)]
        public string ImageTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RokuMetadataApiThumbnailInfo {\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
            sb.Append("  ImageTag: ").Append(ImageTag).Append("\n");
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
            return this.Equals(input as RokuMetadataApiThumbnailInfo);
        }

        /// <summary>
        /// Returns true if RokuMetadataApiThumbnailInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RokuMetadataApiThumbnailInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RokuMetadataApiThumbnailInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PositionTicks == input.PositionTicks ||
                    (this.PositionTicks != null &&
                    this.PositionTicks.Equals(input.PositionTicks))
                ) && 
                (
                    this.ImageTag == input.ImageTag ||
                    (this.ImageTag != null &&
                    this.ImageTag.Equals(input.ImageTag))
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
                if (this.PositionTicks != null)
                    hashCode = hashCode * 59 + this.PositionTicks.GetHashCode();
                if (this.ImageTag != null)
                    hashCode = hashCode * 59 + this.ImageTag.GetHashCode();
                return hashCode;
            }
        }

    }
}
