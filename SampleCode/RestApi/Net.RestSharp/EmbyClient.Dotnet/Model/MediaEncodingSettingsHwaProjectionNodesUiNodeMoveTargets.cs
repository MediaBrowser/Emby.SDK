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
    /// MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets :  IEquatable<MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets" /> class.
        /// </summary>
        /// <param name="up">up.</param>
        /// <param name="down">down.</param>
        /// <param name="left">left.</param>
        /// <param name="right">right.</param>
        /// <param name="hasAny">hasAny.</param>
        public MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets(string up = default(string), string down = default(string), string left = default(string), string right = default(string), bool? hasAny = default(bool?))
        {
            this.Up = up;
            this.Down = down;
            this.Left = left;
            this.Right = right;
            this.HasAny = hasAny;
        }
        
        /// <summary>
        /// Gets or Sets Up
        /// </summary>
        [DataMember(Name="Up", EmitDefaultValue=false)]
        public string Up { get; set; }

        /// <summary>
        /// Gets or Sets Down
        /// </summary>
        [DataMember(Name="Down", EmitDefaultValue=false)]
        public string Down { get; set; }

        /// <summary>
        /// Gets or Sets Left
        /// </summary>
        [DataMember(Name="Left", EmitDefaultValue=false)]
        public string Left { get; set; }

        /// <summary>
        /// Gets or Sets Right
        /// </summary>
        [DataMember(Name="Right", EmitDefaultValue=false)]
        public string Right { get; set; }

        /// <summary>
        /// Gets or Sets HasAny
        /// </summary>
        [DataMember(Name="HasAny", EmitDefaultValue=false)]
        public bool? HasAny { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets {\n");
            sb.Append("  Up: ").Append(Up).Append("\n");
            sb.Append("  Down: ").Append(Down).Append("\n");
            sb.Append("  Left: ").Append(Left).Append("\n");
            sb.Append("  Right: ").Append(Right).Append("\n");
            sb.Append("  HasAny: ").Append(HasAny).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Up == input.Up ||
                    (this.Up != null &&
                    this.Up.Equals(input.Up))
                ) && 
                (
                    this.Down == input.Down ||
                    (this.Down != null &&
                    this.Down.Equals(input.Down))
                ) && 
                (
                    this.Left == input.Left ||
                    (this.Left != null &&
                    this.Left.Equals(input.Left))
                ) && 
                (
                    this.Right == input.Right ||
                    (this.Right != null &&
                    this.Right.Equals(input.Right))
                ) && 
                (
                    this.HasAny == input.HasAny ||
                    (this.HasAny != null &&
                    this.HasAny.Equals(input.HasAny))
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
                if (this.Up != null)
                    hashCode = hashCode * 59 + this.Up.GetHashCode();
                if (this.Down != null)
                    hashCode = hashCode * 59 + this.Down.GetHashCode();
                if (this.Left != null)
                    hashCode = hashCode * 59 + this.Left.GetHashCode();
                if (this.Right != null)
                    hashCode = hashCode * 59 + this.Right.GetHashCode();
                if (this.HasAny != null)
                    hashCode = hashCode * 59 + this.HasAny.GetHashCode();
                return hashCode;
            }
        }

    }
}
