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
    /// Class ChapterInfo  
    /// </summary>
    [DataContract]
        public partial class ChapterInfo :  IEquatable<ChapterInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChapterInfo" /> class.
        /// </summary>
        /// <param name="startPositionTicks">The start position ticks..</param>
        /// <param name="name">The name..</param>
        /// <param name="imageTag">imageTag.</param>
        /// <param name="markerType">markerType.</param>
        /// <param name="chapterIndex">chapterIndex.</param>
        public ChapterInfo(long? startPositionTicks = default(long?), string name = default(string), string imageTag = default(string), MarkerType markerType = default(MarkerType), int? chapterIndex = default(int?))
        {
            this.StartPositionTicks = startPositionTicks;
            this.Name = name;
            this.ImageTag = imageTag;
            this.MarkerType = markerType;
            this.ChapterIndex = chapterIndex;
        }
        
        /// <summary>
        /// The start position ticks.
        /// </summary>
        /// <value>The start position ticks.</value>
        [DataMember(Name="StartPositionTicks", EmitDefaultValue=false)]
        public long? StartPositionTicks { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ImageTag
        /// </summary>
        [DataMember(Name="ImageTag", EmitDefaultValue=false)]
        public string ImageTag { get; set; }

        /// <summary>
        /// Gets or Sets MarkerType
        /// </summary>
        [DataMember(Name="MarkerType", EmitDefaultValue=false)]
        public MarkerType MarkerType { get; set; }

        /// <summary>
        /// Gets or Sets ChapterIndex
        /// </summary>
        [DataMember(Name="ChapterIndex", EmitDefaultValue=false)]
        public int? ChapterIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChapterInfo {\n");
            sb.Append("  StartPositionTicks: ").Append(StartPositionTicks).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ImageTag: ").Append(ImageTag).Append("\n");
            sb.Append("  MarkerType: ").Append(MarkerType).Append("\n");
            sb.Append("  ChapterIndex: ").Append(ChapterIndex).Append("\n");
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
            return this.Equals(input as ChapterInfo);
        }

        /// <summary>
        /// Returns true if ChapterInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ChapterInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChapterInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StartPositionTicks == input.StartPositionTicks ||
                    (this.StartPositionTicks != null &&
                    this.StartPositionTicks.Equals(input.StartPositionTicks))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ImageTag == input.ImageTag ||
                    (this.ImageTag != null &&
                    this.ImageTag.Equals(input.ImageTag))
                ) && 
                (
                    this.MarkerType == input.MarkerType ||
                    (this.MarkerType != null &&
                    this.MarkerType.Equals(input.MarkerType))
                ) && 
                (
                    this.ChapterIndex == input.ChapterIndex ||
                    (this.ChapterIndex != null &&
                    this.ChapterIndex.Equals(input.ChapterIndex))
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
                if (this.StartPositionTicks != null)
                    hashCode = hashCode * 59 + this.StartPositionTicks.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ImageTag != null)
                    hashCode = hashCode * 59 + this.ImageTag.GetHashCode();
                if (this.MarkerType != null)
                    hashCode = hashCode * 59 + this.MarkerType.GetHashCode();
                if (this.ChapterIndex != null)
                    hashCode = hashCode * 59 + this.ChapterIndex.GetHashCode();
                return hashCode;
            }
        }

    }
}
