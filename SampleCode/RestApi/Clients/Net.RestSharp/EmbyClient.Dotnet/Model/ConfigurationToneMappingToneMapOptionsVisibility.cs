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
    /// ConfigurationToneMappingToneMapOptionsVisibility
    /// </summary>
    [DataContract]
        public partial class ConfigurationToneMappingToneMapOptionsVisibility :  IEquatable<ConfigurationToneMappingToneMapOptionsVisibility>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationToneMappingToneMapOptionsVisibility" /> class.
        /// </summary>
        /// <param name="showAdvanced">showAdvanced.</param>
        /// <param name="isSoftwareToneMappingAvailable">isSoftwareToneMappingAvailable.</param>
        /// <param name="isAnyHardwareToneMappingAvailable">isAnyHardwareToneMappingAvailable.</param>
        /// <param name="showNvidiaOptions">showNvidiaOptions.</param>
        /// <param name="showQuickSyncOptions">showQuickSyncOptions.</param>
        /// <param name="showVaapiOptions">showVaapiOptions.</param>
        /// <param name="isOpenClAvailable">isOpenClAvailable.</param>
        /// <param name="isOpenClSuperTAvailable">isOpenClSuperTAvailable.</param>
        /// <param name="isVaapiNativeAvailable">isVaapiNativeAvailable.</param>
        /// <param name="isQuickSyncNativeAvailable">isQuickSyncNativeAvailable.</param>
        /// <param name="operatingSystem">operatingSystem.</param>
        public ConfigurationToneMappingToneMapOptionsVisibility(bool? showAdvanced = default(bool?), bool? isSoftwareToneMappingAvailable = default(bool?), bool? isAnyHardwareToneMappingAvailable = default(bool?), bool? showNvidiaOptions = default(bool?), bool? showQuickSyncOptions = default(bool?), bool? showVaapiOptions = default(bool?), bool? isOpenClAvailable = default(bool?), bool? isOpenClSuperTAvailable = default(bool?), bool? isVaapiNativeAvailable = default(bool?), bool? isQuickSyncNativeAvailable = default(bool?), OperatingSystem operatingSystem = default(OperatingSystem))
        {
            this.ShowAdvanced = showAdvanced;
            this.IsSoftwareToneMappingAvailable = isSoftwareToneMappingAvailable;
            this.IsAnyHardwareToneMappingAvailable = isAnyHardwareToneMappingAvailable;
            this.ShowNvidiaOptions = showNvidiaOptions;
            this.ShowQuickSyncOptions = showQuickSyncOptions;
            this.ShowVaapiOptions = showVaapiOptions;
            this.IsOpenClAvailable = isOpenClAvailable;
            this.IsOpenClSuperTAvailable = isOpenClSuperTAvailable;
            this.IsVaapiNativeAvailable = isVaapiNativeAvailable;
            this.IsQuickSyncNativeAvailable = isQuickSyncNativeAvailable;
            this.OperatingSystem = operatingSystem;
        }
        
        /// <summary>
        /// Gets or Sets ShowAdvanced
        /// </summary>
        [DataMember(Name="ShowAdvanced", EmitDefaultValue=false)]
        public bool? ShowAdvanced { get; set; }

        /// <summary>
        /// Gets or Sets IsSoftwareToneMappingAvailable
        /// </summary>
        [DataMember(Name="IsSoftwareToneMappingAvailable", EmitDefaultValue=false)]
        public bool? IsSoftwareToneMappingAvailable { get; set; }

        /// <summary>
        /// Gets or Sets IsAnyHardwareToneMappingAvailable
        /// </summary>
        [DataMember(Name="IsAnyHardwareToneMappingAvailable", EmitDefaultValue=false)]
        public bool? IsAnyHardwareToneMappingAvailable { get; set; }

        /// <summary>
        /// Gets or Sets ShowNvidiaOptions
        /// </summary>
        [DataMember(Name="ShowNvidiaOptions", EmitDefaultValue=false)]
        public bool? ShowNvidiaOptions { get; set; }

        /// <summary>
        /// Gets or Sets ShowQuickSyncOptions
        /// </summary>
        [DataMember(Name="ShowQuickSyncOptions", EmitDefaultValue=false)]
        public bool? ShowQuickSyncOptions { get; set; }

        /// <summary>
        /// Gets or Sets ShowVaapiOptions
        /// </summary>
        [DataMember(Name="ShowVaapiOptions", EmitDefaultValue=false)]
        public bool? ShowVaapiOptions { get; set; }

        /// <summary>
        /// Gets or Sets IsOpenClAvailable
        /// </summary>
        [DataMember(Name="IsOpenClAvailable", EmitDefaultValue=false)]
        public bool? IsOpenClAvailable { get; set; }

        /// <summary>
        /// Gets or Sets IsOpenClSuperTAvailable
        /// </summary>
        [DataMember(Name="IsOpenClSuperTAvailable", EmitDefaultValue=false)]
        public bool? IsOpenClSuperTAvailable { get; set; }

        /// <summary>
        /// Gets or Sets IsVaapiNativeAvailable
        /// </summary>
        [DataMember(Name="IsVaapiNativeAvailable", EmitDefaultValue=false)]
        public bool? IsVaapiNativeAvailable { get; set; }

        /// <summary>
        /// Gets or Sets IsQuickSyncNativeAvailable
        /// </summary>
        [DataMember(Name="IsQuickSyncNativeAvailable", EmitDefaultValue=false)]
        public bool? IsQuickSyncNativeAvailable { get; set; }

        /// <summary>
        /// Gets or Sets OperatingSystem
        /// </summary>
        [DataMember(Name="OperatingSystem", EmitDefaultValue=false)]
        public OperatingSystem OperatingSystem { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationToneMappingToneMapOptionsVisibility {\n");
            sb.Append("  ShowAdvanced: ").Append(ShowAdvanced).Append("\n");
            sb.Append("  IsSoftwareToneMappingAvailable: ").Append(IsSoftwareToneMappingAvailable).Append("\n");
            sb.Append("  IsAnyHardwareToneMappingAvailable: ").Append(IsAnyHardwareToneMappingAvailable).Append("\n");
            sb.Append("  ShowNvidiaOptions: ").Append(ShowNvidiaOptions).Append("\n");
            sb.Append("  ShowQuickSyncOptions: ").Append(ShowQuickSyncOptions).Append("\n");
            sb.Append("  ShowVaapiOptions: ").Append(ShowVaapiOptions).Append("\n");
            sb.Append("  IsOpenClAvailable: ").Append(IsOpenClAvailable).Append("\n");
            sb.Append("  IsOpenClSuperTAvailable: ").Append(IsOpenClSuperTAvailable).Append("\n");
            sb.Append("  IsVaapiNativeAvailable: ").Append(IsVaapiNativeAvailable).Append("\n");
            sb.Append("  IsQuickSyncNativeAvailable: ").Append(IsQuickSyncNativeAvailable).Append("\n");
            sb.Append("  OperatingSystem: ").Append(OperatingSystem).Append("\n");
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
            return this.Equals(input as ConfigurationToneMappingToneMapOptionsVisibility);
        }

        /// <summary>
        /// Returns true if ConfigurationToneMappingToneMapOptionsVisibility instances are equal
        /// </summary>
        /// <param name="input">Instance of ConfigurationToneMappingToneMapOptionsVisibility to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationToneMappingToneMapOptionsVisibility input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ShowAdvanced == input.ShowAdvanced ||
                    (this.ShowAdvanced != null &&
                    this.ShowAdvanced.Equals(input.ShowAdvanced))
                ) && 
                (
                    this.IsSoftwareToneMappingAvailable == input.IsSoftwareToneMappingAvailable ||
                    (this.IsSoftwareToneMappingAvailable != null &&
                    this.IsSoftwareToneMappingAvailable.Equals(input.IsSoftwareToneMappingAvailable))
                ) && 
                (
                    this.IsAnyHardwareToneMappingAvailable == input.IsAnyHardwareToneMappingAvailable ||
                    (this.IsAnyHardwareToneMappingAvailable != null &&
                    this.IsAnyHardwareToneMappingAvailable.Equals(input.IsAnyHardwareToneMappingAvailable))
                ) && 
                (
                    this.ShowNvidiaOptions == input.ShowNvidiaOptions ||
                    (this.ShowNvidiaOptions != null &&
                    this.ShowNvidiaOptions.Equals(input.ShowNvidiaOptions))
                ) && 
                (
                    this.ShowQuickSyncOptions == input.ShowQuickSyncOptions ||
                    (this.ShowQuickSyncOptions != null &&
                    this.ShowQuickSyncOptions.Equals(input.ShowQuickSyncOptions))
                ) && 
                (
                    this.ShowVaapiOptions == input.ShowVaapiOptions ||
                    (this.ShowVaapiOptions != null &&
                    this.ShowVaapiOptions.Equals(input.ShowVaapiOptions))
                ) && 
                (
                    this.IsOpenClAvailable == input.IsOpenClAvailable ||
                    (this.IsOpenClAvailable != null &&
                    this.IsOpenClAvailable.Equals(input.IsOpenClAvailable))
                ) && 
                (
                    this.IsOpenClSuperTAvailable == input.IsOpenClSuperTAvailable ||
                    (this.IsOpenClSuperTAvailable != null &&
                    this.IsOpenClSuperTAvailable.Equals(input.IsOpenClSuperTAvailable))
                ) && 
                (
                    this.IsVaapiNativeAvailable == input.IsVaapiNativeAvailable ||
                    (this.IsVaapiNativeAvailable != null &&
                    this.IsVaapiNativeAvailable.Equals(input.IsVaapiNativeAvailable))
                ) && 
                (
                    this.IsQuickSyncNativeAvailable == input.IsQuickSyncNativeAvailable ||
                    (this.IsQuickSyncNativeAvailable != null &&
                    this.IsQuickSyncNativeAvailable.Equals(input.IsQuickSyncNativeAvailable))
                ) && 
                (
                    this.OperatingSystem == input.OperatingSystem ||
                    (this.OperatingSystem != null &&
                    this.OperatingSystem.Equals(input.OperatingSystem))
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
                if (this.ShowAdvanced != null)
                    hashCode = hashCode * 59 + this.ShowAdvanced.GetHashCode();
                if (this.IsSoftwareToneMappingAvailable != null)
                    hashCode = hashCode * 59 + this.IsSoftwareToneMappingAvailable.GetHashCode();
                if (this.IsAnyHardwareToneMappingAvailable != null)
                    hashCode = hashCode * 59 + this.IsAnyHardwareToneMappingAvailable.GetHashCode();
                if (this.ShowNvidiaOptions != null)
                    hashCode = hashCode * 59 + this.ShowNvidiaOptions.GetHashCode();
                if (this.ShowQuickSyncOptions != null)
                    hashCode = hashCode * 59 + this.ShowQuickSyncOptions.GetHashCode();
                if (this.ShowVaapiOptions != null)
                    hashCode = hashCode * 59 + this.ShowVaapiOptions.GetHashCode();
                if (this.IsOpenClAvailable != null)
                    hashCode = hashCode * 59 + this.IsOpenClAvailable.GetHashCode();
                if (this.IsOpenClSuperTAvailable != null)
                    hashCode = hashCode * 59 + this.IsOpenClSuperTAvailable.GetHashCode();
                if (this.IsVaapiNativeAvailable != null)
                    hashCode = hashCode * 59 + this.IsVaapiNativeAvailable.GetHashCode();
                if (this.IsQuickSyncNativeAvailable != null)
                    hashCode = hashCode * 59 + this.IsQuickSyncNativeAvailable.GetHashCode();
                if (this.OperatingSystem != null)
                    hashCode = hashCode * 59 + this.OperatingSystem.GetHashCode();
                return hashCode;
            }
        }

    }
}
