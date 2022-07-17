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
    /// SyncModelSyncDialogOptions
    /// </summary>
    [DataContract]
        public partial class SyncModelSyncDialogOptions :  IEquatable<SyncModelSyncDialogOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncModelSyncDialogOptions" /> class.
        /// </summary>
        /// <param name="targets">targets.</param>
        /// <param name="options">options.</param>
        /// <param name="qualityOptions">qualityOptions.</param>
        /// <param name="profileOptions">profileOptions.</param>
        public SyncModelSyncDialogOptions(List<SyncSyncTarget> targets = default(List<SyncSyncTarget>), List<SyncModelSyncJobOption> options = default(List<SyncModelSyncJobOption>), List<SyncModelSyncQualityOption> qualityOptions = default(List<SyncModelSyncQualityOption>), List<SyncModelSyncProfileOption> profileOptions = default(List<SyncModelSyncProfileOption>))
        {
            this.Targets = targets;
            this.Options = options;
            this.QualityOptions = qualityOptions;
            this.ProfileOptions = profileOptions;
        }
        
        /// <summary>
        /// Gets or Sets Targets
        /// </summary>
        [DataMember(Name="Targets", EmitDefaultValue=false)]
        public List<SyncSyncTarget> Targets { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name="Options", EmitDefaultValue=false)]
        public List<SyncModelSyncJobOption> Options { get; set; }

        /// <summary>
        /// Gets or Sets QualityOptions
        /// </summary>
        [DataMember(Name="QualityOptions", EmitDefaultValue=false)]
        public List<SyncModelSyncQualityOption> QualityOptions { get; set; }

        /// <summary>
        /// Gets or Sets ProfileOptions
        /// </summary>
        [DataMember(Name="ProfileOptions", EmitDefaultValue=false)]
        public List<SyncModelSyncProfileOption> ProfileOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncModelSyncDialogOptions {\n");
            sb.Append("  Targets: ").Append(Targets).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  QualityOptions: ").Append(QualityOptions).Append("\n");
            sb.Append("  ProfileOptions: ").Append(ProfileOptions).Append("\n");
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
            return this.Equals(input as SyncModelSyncDialogOptions);
        }

        /// <summary>
        /// Returns true if SyncModelSyncDialogOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncModelSyncDialogOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncModelSyncDialogOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Targets == input.Targets ||
                    this.Targets != null &&
                    input.Targets != null &&
                    this.Targets.SequenceEqual(input.Targets)
                ) && 
                (
                    this.Options == input.Options ||
                    this.Options != null &&
                    input.Options != null &&
                    this.Options.SequenceEqual(input.Options)
                ) && 
                (
                    this.QualityOptions == input.QualityOptions ||
                    this.QualityOptions != null &&
                    input.QualityOptions != null &&
                    this.QualityOptions.SequenceEqual(input.QualityOptions)
                ) && 
                (
                    this.ProfileOptions == input.ProfileOptions ||
                    this.ProfileOptions != null &&
                    input.ProfileOptions != null &&
                    this.ProfileOptions.SequenceEqual(input.ProfileOptions)
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
                if (this.Targets != null)
                    hashCode = hashCode * 59 + this.Targets.GetHashCode();
                if (this.Options != null)
                    hashCode = hashCode * 59 + this.Options.GetHashCode();
                if (this.QualityOptions != null)
                    hashCode = hashCode * 59 + this.QualityOptions.GetHashCode();
                if (this.ProfileOptions != null)
                    hashCode = hashCode * 59 + this.ProfileOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
