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
    /// MediaEncodingSettingsApiHwaCancelHwaNodeOptions
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsApiHwaCancelHwaNodeOptions :  IEquatable<MediaEncodingSettingsApiHwaCancelHwaNodeOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsApiHwaCancelHwaNodeOptions" /> class.
        /// </summary>
        /// <param name="nodeId">nodeId.</param>
        /// <param name="editorType">editorType.</param>
        public MediaEncodingSettingsApiHwaCancelHwaNodeOptions(string nodeId = default(string), MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = default(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType))
        {
            this.NodeId = nodeId;
            this.EditorType = editorType;
        }
        
        /// <summary>
        /// Gets or Sets NodeId
        /// </summary>
        [DataMember(Name="NodeId", EmitDefaultValue=false)]
        public string NodeId { get; set; }

        /// <summary>
        /// Gets or Sets EditorType
        /// </summary>
        [DataMember(Name="EditorType", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType EditorType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsApiHwaCancelHwaNodeOptions {\n");
            sb.Append("  NodeId: ").Append(NodeId).Append("\n");
            sb.Append("  EditorType: ").Append(EditorType).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsApiHwaCancelHwaNodeOptions);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsApiHwaCancelHwaNodeOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsApiHwaCancelHwaNodeOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsApiHwaCancelHwaNodeOptions input)
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
                    this.EditorType == input.EditorType ||
                    (this.EditorType != null &&
                    this.EditorType.Equals(input.EditorType))
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
                if (this.EditorType != null)
                    hashCode = hashCode * 59 + this.EditorType.GetHashCode();
                return hashCode;
            }
        }

    }
}
