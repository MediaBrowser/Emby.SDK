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
    /// MediaEncodingSettingsHwaProjectionNodesUiNodeCommand
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaProjectionNodesUiNodeCommand :  IEquatable<MediaEncodingSettingsHwaProjectionNodesUiNodeCommand>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaProjectionNodesUiNodeCommand" /> class.
        /// </summary>
        /// <param name="commandType">commandType.</param>
        /// <param name="caption">caption.</param>
        /// <param name="icon">icon.</param>
        /// <param name="isRemote">isRemote.</param>
        /// <param name="commandData">commandData.</param>
        /// <param name="opensForm">opensForm.</param>
        /// <param name="confirmationPrompt">confirmationPrompt.</param>
        public MediaEncodingSettingsHwaProjectionNodesUiNodeCommand(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType commandType = default(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType), string caption = default(string), ElementsIconNames icon = default(ElementsIconNames), bool? isRemote = default(bool?), string commandData = default(string), bool? opensForm = default(bool?), string confirmationPrompt = default(string))
        {
            this.CommandType = commandType;
            this.Caption = caption;
            this.Icon = icon;
            this.IsRemote = isRemote;
            this.CommandData = commandData;
            this.OpensForm = opensForm;
            this.ConfirmationPrompt = confirmationPrompt;
        }
        
        /// <summary>
        /// Gets or Sets CommandType
        /// </summary>
        [DataMember(Name="CommandType", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType CommandType { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name="Caption", EmitDefaultValue=false)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets Icon
        /// </summary>
        [DataMember(Name="Icon", EmitDefaultValue=false)]
        public ElementsIconNames Icon { get; set; }

        /// <summary>
        /// Gets or Sets IsRemote
        /// </summary>
        [DataMember(Name="IsRemote", EmitDefaultValue=false)]
        public bool? IsRemote { get; set; }

        /// <summary>
        /// Gets or Sets CommandData
        /// </summary>
        [DataMember(Name="CommandData", EmitDefaultValue=false)]
        public string CommandData { get; set; }

        /// <summary>
        /// Gets or Sets OpensForm
        /// </summary>
        [DataMember(Name="OpensForm", EmitDefaultValue=false)]
        public bool? OpensForm { get; set; }

        /// <summary>
        /// Gets or Sets ConfirmationPrompt
        /// </summary>
        [DataMember(Name="ConfirmationPrompt", EmitDefaultValue=false)]
        public string ConfirmationPrompt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaProjectionNodesUiNodeCommand {\n");
            sb.Append("  CommandType: ").Append(CommandType).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  IsRemote: ").Append(IsRemote).Append("\n");
            sb.Append("  CommandData: ").Append(CommandData).Append("\n");
            sb.Append("  OpensForm: ").Append(OpensForm).Append("\n");
            sb.Append("  ConfirmationPrompt: ").Append(ConfirmationPrompt).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsHwaProjectionNodesUiNodeCommand);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaProjectionNodesUiNodeCommand instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaProjectionNodesUiNodeCommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaProjectionNodesUiNodeCommand input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CommandType == input.CommandType ||
                    (this.CommandType != null &&
                    this.CommandType.Equals(input.CommandType))
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.Icon == input.Icon ||
                    (this.Icon != null &&
                    this.Icon.Equals(input.Icon))
                ) && 
                (
                    this.IsRemote == input.IsRemote ||
                    (this.IsRemote != null &&
                    this.IsRemote.Equals(input.IsRemote))
                ) && 
                (
                    this.CommandData == input.CommandData ||
                    (this.CommandData != null &&
                    this.CommandData.Equals(input.CommandData))
                ) && 
                (
                    this.OpensForm == input.OpensForm ||
                    (this.OpensForm != null &&
                    this.OpensForm.Equals(input.OpensForm))
                ) && 
                (
                    this.ConfirmationPrompt == input.ConfirmationPrompt ||
                    (this.ConfirmationPrompt != null &&
                    this.ConfirmationPrompt.Equals(input.ConfirmationPrompt))
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
                if (this.CommandType != null)
                    hashCode = hashCode * 59 + this.CommandType.GetHashCode();
                if (this.Caption != null)
                    hashCode = hashCode * 59 + this.Caption.GetHashCode();
                if (this.Icon != null)
                    hashCode = hashCode * 59 + this.Icon.GetHashCode();
                if (this.IsRemote != null)
                    hashCode = hashCode * 59 + this.IsRemote.GetHashCode();
                if (this.CommandData != null)
                    hashCode = hashCode * 59 + this.CommandData.GetHashCode();
                if (this.OpensForm != null)
                    hashCode = hashCode * 59 + this.OpensForm.GetHashCode();
                if (this.ConfirmationPrompt != null)
                    hashCode = hashCode * 59 + this.ConfirmationPrompt.GetHashCode();
                return hashCode;
            }
        }

    }
}
