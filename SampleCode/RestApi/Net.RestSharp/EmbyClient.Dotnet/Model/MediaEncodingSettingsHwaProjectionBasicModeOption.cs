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
    /// MediaEncodingSettingsHwaProjectionBasicModeOption
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaProjectionBasicModeOption :  IEquatable<MediaEncodingSettingsHwaProjectionBasicModeOption>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaProjectionBasicModeOption" /> class.
        /// </summary>
        /// <param name="nodeId">nodeId.</param>
        /// <param name="text">text.</param>
        public MediaEncodingSettingsHwaProjectionBasicModeOption(string nodeId = default(string), string text = default(string))
        {
            this.NodeId = nodeId;
            this.Text = text;
        }
        
        /// <summary>
        /// Gets or Sets NodeId
        /// </summary>
        [DataMember(Name="NodeId", EmitDefaultValue=false)]
        public string NodeId { get; set; }

        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name="Text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaProjectionBasicModeOption {\n");
            sb.Append("  NodeId: ").Append(NodeId).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsHwaProjectionBasicModeOption);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaProjectionBasicModeOption instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaProjectionBasicModeOption to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaProjectionBasicModeOption input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NodeId == input.NodeId ||
                    (this.NodeId != null &&
                    this.NodeId.Equals(input.NodeId))
                ) && 
                (
                    this.Text == input.Text ||
                    (this.Text != null &&
                    this.Text.Equals(input.Text))
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
                if (this.NodeId != null)
                    hashCode = hashCode * 59 + this.NodeId.GetHashCode();
                if (this.Text != null)
                    hashCode = hashCode * 59 + this.Text.GetHashCode();
                return hashCode;
            }
        }

    }
}
