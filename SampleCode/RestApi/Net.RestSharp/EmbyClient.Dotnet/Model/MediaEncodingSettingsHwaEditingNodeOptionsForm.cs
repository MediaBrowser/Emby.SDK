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
    /// MediaEncodingSettingsHwaEditingNodeOptionsForm
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaEditingNodeOptionsForm :  IEquatable<MediaEncodingSettingsHwaEditingNodeOptionsForm>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaEditingNodeOptionsForm" /> class.
        /// </summary>
        /// <param name="isSeparateForm">isSeparateForm.</param>
        /// <param name="showResetToDefaults">showResetToDefaults.</param>
        /// <param name="caption">caption.</param>
        /// <param name="helpUrl">helpUrl.</param>
        /// <param name="form">form.</param>
        public MediaEncodingSettingsHwaEditingNodeOptionsForm(bool? isSeparateForm = default(bool?), bool? showResetToDefaults = default(bool?), string caption = default(string), string helpUrl = default(string), GenericEditIEditObjectContainer form = default(GenericEditIEditObjectContainer))
        {
            this.IsSeparateForm = isSeparateForm;
            this.ShowResetToDefaults = showResetToDefaults;
            this.Caption = caption;
            this.HelpUrl = helpUrl;
            this.Form = form;
        }
        
        /// <summary>
        /// Gets or Sets IsSeparateForm
        /// </summary>
        [DataMember(Name="IsSeparateForm", EmitDefaultValue=false)]
        public bool? IsSeparateForm { get; set; }

        /// <summary>
        /// Gets or Sets ShowResetToDefaults
        /// </summary>
        [DataMember(Name="ShowResetToDefaults", EmitDefaultValue=false)]
        public bool? ShowResetToDefaults { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name="Caption", EmitDefaultValue=false)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets HelpUrl
        /// </summary>
        [DataMember(Name="HelpUrl", EmitDefaultValue=false)]
        public string HelpUrl { get; set; }

        /// <summary>
        /// Gets or Sets Form
        /// </summary>
        [DataMember(Name="Form", EmitDefaultValue=false)]
        public GenericEditIEditObjectContainer Form { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaEditingNodeOptionsForm {\n");
            sb.Append("  IsSeparateForm: ").Append(IsSeparateForm).Append("\n");
            sb.Append("  ShowResetToDefaults: ").Append(ShowResetToDefaults).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  HelpUrl: ").Append(HelpUrl).Append("\n");
            sb.Append("  Form: ").Append(Form).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsHwaEditingNodeOptionsForm);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaEditingNodeOptionsForm instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaEditingNodeOptionsForm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaEditingNodeOptionsForm input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsSeparateForm == input.IsSeparateForm ||
                    (this.IsSeparateForm != null &&
                    this.IsSeparateForm.Equals(input.IsSeparateForm))
                ) && 
                (
                    this.ShowResetToDefaults == input.ShowResetToDefaults ||
                    (this.ShowResetToDefaults != null &&
                    this.ShowResetToDefaults.Equals(input.ShowResetToDefaults))
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.HelpUrl == input.HelpUrl ||
                    (this.HelpUrl != null &&
                    this.HelpUrl.Equals(input.HelpUrl))
                ) && 
                (
                    this.Form == input.Form ||
                    (this.Form != null &&
                    this.Form.Equals(input.Form))
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
                if (this.IsSeparateForm != null)
                    hashCode = hashCode * 59 + this.IsSeparateForm.GetHashCode();
                if (this.ShowResetToDefaults != null)
                    hashCode = hashCode * 59 + this.ShowResetToDefaults.GetHashCode();
                if (this.Caption != null)
                    hashCode = hashCode * 59 + this.Caption.GetHashCode();
                if (this.HelpUrl != null)
                    hashCode = hashCode * 59 + this.HelpUrl.GetHashCode();
                if (this.Form != null)
                    hashCode = hashCode * 59 + this.Form.GetHashCode();
                return hashCode;
            }
        }

    }
}
