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
    /// MediaEncodingSettingsApiHwaExecuteHwaConfigCommand
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsApiHwaExecuteHwaConfigCommand :  IEquatable<MediaEncodingSettingsApiHwaExecuteHwaConfigCommand>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsApiHwaExecuteHwaConfigCommand" /> class.
        /// </summary>
        /// <param name="nodeId">nodeId.</param>
        /// <param name="commandType">commandType.</param>
        /// <param name="targetId">targetId.</param>
        /// <param name="data">data.</param>
        public MediaEncodingSettingsApiHwaExecuteHwaConfigCommand(string nodeId = default(string), MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType = default(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType), string targetId = default(string), string data = default(string))
        {
            this.NodeId = nodeId;
            this.CommandType = commandType;
            this.TargetId = targetId;
            this.Data = data;
        }
        
        /// <summary>
        /// Gets or Sets NodeId
        /// </summary>
        [DataMember(Name="NodeId", EmitDefaultValue=false)]
        public string NodeId { get; set; }

        /// <summary>
        /// Gets or Sets CommandType
        /// </summary>
        [DataMember(Name="CommandType", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType CommandType { get; set; }

        /// <summary>
        /// Gets or Sets TargetId
        /// </summary>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name="Data", EmitDefaultValue=false)]
        public string Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsApiHwaExecuteHwaConfigCommand {\n");
            sb.Append("  NodeId: ").Append(NodeId).Append("\n");
            sb.Append("  CommandType: ").Append(CommandType).Append("\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsApiHwaExecuteHwaConfigCommand);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsApiHwaExecuteHwaConfigCommand instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsApiHwaExecuteHwaConfigCommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsApiHwaExecuteHwaConfigCommand input)
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
                    this.CommandType == input.CommandType ||
                    (this.CommandType != null &&
                    this.CommandType.Equals(input.CommandType))
                ) && 
                (
                    this.TargetId == input.TargetId ||
                    (this.TargetId != null &&
                    this.TargetId.Equals(input.TargetId))
                ) && 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
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
                if (this.CommandType != null)
                    hashCode = hashCode * 59 + this.CommandType.GetHashCode();
                if (this.TargetId != null)
                    hashCode = hashCode * 59 + this.TargetId.GetHashCode();
                if (this.Data != null)
                    hashCode = hashCode * 59 + this.Data.GetHashCode();
                return hashCode;
            }
        }

    }
}
