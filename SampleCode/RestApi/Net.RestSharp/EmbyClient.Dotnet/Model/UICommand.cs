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
    /// UICommand
    /// </summary>
    [DataContract]
        public partial class UICommand :  IEquatable<UICommand>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UICommand" /> class.
        /// </summary>
        /// <param name="commandType">commandType.</param>
        /// <param name="commandId">commandId.</param>
        /// <param name="isVisible">isVisible.</param>
        /// <param name="isEnabled">isEnabled.</param>
        /// <param name="caption">caption.</param>
        /// <param name="setFocus">setFocus.</param>
        /// <param name="confirmationPrompt">confirmationPrompt.</param>
        public UICommand(EnumsUICommandType commandType = default(EnumsUICommandType), string commandId = default(string), bool? isVisible = default(bool?), bool? isEnabled = default(bool?), string caption = default(string), bool? setFocus = default(bool?), string confirmationPrompt = default(string))
        {
            this.CommandType = commandType;
            this.CommandId = commandId;
            this.IsVisible = isVisible;
            this.IsEnabled = isEnabled;
            this.Caption = caption;
            this.SetFocus = setFocus;
            this.ConfirmationPrompt = confirmationPrompt;
        }
        
        /// <summary>
        /// Gets or Sets CommandType
        /// </summary>
        [DataMember(Name="CommandType", EmitDefaultValue=false)]
        public EnumsUICommandType CommandType { get; set; }

        /// <summary>
        /// Gets or Sets CommandId
        /// </summary>
        [DataMember(Name="CommandId", EmitDefaultValue=false)]
        public string CommandId { get; set; }

        /// <summary>
        /// Gets or Sets IsVisible
        /// </summary>
        [DataMember(Name="IsVisible", EmitDefaultValue=false)]
        public bool? IsVisible { get; set; }

        /// <summary>
        /// Gets or Sets IsEnabled
        /// </summary>
        [DataMember(Name="IsEnabled", EmitDefaultValue=false)]
        public bool? IsEnabled { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name="Caption", EmitDefaultValue=false)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets SetFocus
        /// </summary>
        [DataMember(Name="SetFocus", EmitDefaultValue=false)]
        public bool? SetFocus { get; set; }

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
            sb.Append("class UICommand {\n");
            sb.Append("  CommandType: ").Append(CommandType).Append("\n");
            sb.Append("  CommandId: ").Append(CommandId).Append("\n");
            sb.Append("  IsVisible: ").Append(IsVisible).Append("\n");
            sb.Append("  IsEnabled: ").Append(IsEnabled).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  SetFocus: ").Append(SetFocus).Append("\n");
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
            return this.Equals(input as UICommand);
        }

        /// <summary>
        /// Returns true if UICommand instances are equal
        /// </summary>
        /// <param name="input">Instance of UICommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UICommand input)
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
                    this.CommandId == input.CommandId ||
                    (this.CommandId != null &&
                    this.CommandId.Equals(input.CommandId))
                ) && 
                (
                    this.IsVisible == input.IsVisible ||
                    (this.IsVisible != null &&
                    this.IsVisible.Equals(input.IsVisible))
                ) && 
                (
                    this.IsEnabled == input.IsEnabled ||
                    (this.IsEnabled != null &&
                    this.IsEnabled.Equals(input.IsEnabled))
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.SetFocus == input.SetFocus ||
                    (this.SetFocus != null &&
                    this.SetFocus.Equals(input.SetFocus))
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
                if (this.CommandId != null)
                    hashCode = hashCode * 59 + this.CommandId.GetHashCode();
                if (this.IsVisible != null)
                    hashCode = hashCode * 59 + this.IsVisible.GetHashCode();
                if (this.IsEnabled != null)
                    hashCode = hashCode * 59 + this.IsEnabled.GetHashCode();
                if (this.Caption != null)
                    hashCode = hashCode * 59 + this.Caption.GetHashCode();
                if (this.SetFocus != null)
                    hashCode = hashCode * 59 + this.SetFocus.GetHashCode();
                if (this.ConfirmationPrompt != null)
                    hashCode = hashCode * 59 + this.ConfirmationPrompt.GetHashCode();
                return hashCode;
            }
        }

    }
}
