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
    /// MediaEncodingSettingsHwaProjectionHwaConfigView
    /// </summary>
    [DataContract]
        public partial class MediaEncodingSettingsHwaProjectionHwaConfigView :  IEquatable<MediaEncodingSettingsHwaProjectionHwaConfigView>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingSettingsHwaProjectionHwaConfigView" /> class.
        /// </summary>
        /// <param name="isInitialized">isInitialized.</param>
        /// <param name="configMode">configMode.</param>
        /// <param name="root">root.</param>
        /// <param name="focusNodeId">focusNodeId.</param>
        /// <param name="configName">configName.</param>
        /// <param name="configSavedOn">configSavedOn.</param>
        /// <param name="configSavedBy">configSavedBy.</param>
        /// <param name="configRevision">configRevision.</param>
        /// <param name="hasUnsavedChanges">hasUnsavedChanges.</param>
        /// <param name="basicModeOptions">basicModeOptions.</param>
        /// <param name="basicSelectedNodeId">basicSelectedNodeId.</param>
        /// <param name="modeLegend">modeLegend.</param>
        /// <param name="changeConfigWizardUrl">changeConfigWizardUrl.</param>
        /// <param name="helpUrl">helpUrl.</param>
        /// <param name="showDeviceSelector">showDeviceSelector.</param>
        /// <param name="showSavedConfigInfo">showSavedConfigInfo.</param>
        public MediaEncodingSettingsHwaProjectionHwaConfigView(bool? isInitialized = default(bool?), MediaEncodingHwaEnumsHwaConfigMode configMode = default(MediaEncodingHwaEnumsHwaConfigMode), MediaEncodingSettingsHwaProjectionNodesUiNodeRoot root = default(MediaEncodingSettingsHwaProjectionNodesUiNodeRoot), string focusNodeId = default(string), string configName = default(string), DateTimeOffset? configSavedOn = default(DateTimeOffset?), string configSavedBy = default(string), int? configRevision = default(int?), bool? hasUnsavedChanges = default(bool?), List<MediaEncodingSettingsHwaProjectionBasicModeOption> basicModeOptions = default(List<MediaEncodingSettingsHwaProjectionBasicModeOption>), string basicSelectedNodeId = default(string), string modeLegend = default(string), string changeConfigWizardUrl = default(string), string helpUrl = default(string), bool? showDeviceSelector = default(bool?), bool? showSavedConfigInfo = default(bool?))
        {
            this.IsInitialized = isInitialized;
            this.ConfigMode = configMode;
            this.Root = root;
            this.FocusNodeId = focusNodeId;
            this.ConfigName = configName;
            this.ConfigSavedOn = configSavedOn;
            this.ConfigSavedBy = configSavedBy;
            this.ConfigRevision = configRevision;
            this.HasUnsavedChanges = hasUnsavedChanges;
            this.BasicModeOptions = basicModeOptions;
            this.BasicSelectedNodeId = basicSelectedNodeId;
            this.ModeLegend = modeLegend;
            this.ChangeConfigWizardUrl = changeConfigWizardUrl;
            this.HelpUrl = helpUrl;
            this.ShowDeviceSelector = showDeviceSelector;
            this.ShowSavedConfigInfo = showSavedConfigInfo;
        }
        
        /// <summary>
        /// Gets or Sets IsInitialized
        /// </summary>
        [DataMember(Name="IsInitialized", EmitDefaultValue=false)]
        public bool? IsInitialized { get; set; }

        /// <summary>
        /// Gets or Sets ConfigMode
        /// </summary>
        [DataMember(Name="ConfigMode", EmitDefaultValue=false)]
        public MediaEncodingHwaEnumsHwaConfigMode ConfigMode { get; set; }

        /// <summary>
        /// Gets or Sets Root
        /// </summary>
        [DataMember(Name="Root", EmitDefaultValue=false)]
        public MediaEncodingSettingsHwaProjectionNodesUiNodeRoot Root { get; set; }

        /// <summary>
        /// Gets or Sets FocusNodeId
        /// </summary>
        [DataMember(Name="FocusNodeId", EmitDefaultValue=false)]
        public string FocusNodeId { get; set; }

        /// <summary>
        /// Gets or Sets ConfigName
        /// </summary>
        [DataMember(Name="ConfigName", EmitDefaultValue=false)]
        public string ConfigName { get; set; }

        /// <summary>
        /// Gets or Sets ConfigSavedOn
        /// </summary>
        [DataMember(Name="ConfigSavedOn", EmitDefaultValue=false)]
        public DateTimeOffset? ConfigSavedOn { get; set; }

        /// <summary>
        /// Gets or Sets ConfigSavedBy
        /// </summary>
        [DataMember(Name="ConfigSavedBy", EmitDefaultValue=false)]
        public string ConfigSavedBy { get; set; }

        /// <summary>
        /// Gets or Sets ConfigRevision
        /// </summary>
        [DataMember(Name="ConfigRevision", EmitDefaultValue=false)]
        public int? ConfigRevision { get; set; }

        /// <summary>
        /// Gets or Sets HasUnsavedChanges
        /// </summary>
        [DataMember(Name="HasUnsavedChanges", EmitDefaultValue=false)]
        public bool? HasUnsavedChanges { get; set; }

        /// <summary>
        /// Gets or Sets BasicModeOptions
        /// </summary>
        [DataMember(Name="BasicModeOptions", EmitDefaultValue=false)]
        public List<MediaEncodingSettingsHwaProjectionBasicModeOption> BasicModeOptions { get; set; }

        /// <summary>
        /// Gets or Sets BasicSelectedNodeId
        /// </summary>
        [DataMember(Name="BasicSelectedNodeId", EmitDefaultValue=false)]
        public string BasicSelectedNodeId { get; set; }

        /// <summary>
        /// Gets or Sets ModeLegend
        /// </summary>
        [DataMember(Name="ModeLegend", EmitDefaultValue=false)]
        public string ModeLegend { get; set; }

        /// <summary>
        /// Gets or Sets ChangeConfigWizardUrl
        /// </summary>
        [DataMember(Name="ChangeConfigWizardUrl", EmitDefaultValue=false)]
        public string ChangeConfigWizardUrl { get; set; }

        /// <summary>
        /// Gets or Sets HelpUrl
        /// </summary>
        [DataMember(Name="HelpUrl", EmitDefaultValue=false)]
        public string HelpUrl { get; set; }

        /// <summary>
        /// Gets or Sets ShowDeviceSelector
        /// </summary>
        [DataMember(Name="ShowDeviceSelector", EmitDefaultValue=false)]
        public bool? ShowDeviceSelector { get; set; }

        /// <summary>
        /// Gets or Sets ShowSavedConfigInfo
        /// </summary>
        [DataMember(Name="ShowSavedConfigInfo", EmitDefaultValue=false)]
        public bool? ShowSavedConfigInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingSettingsHwaProjectionHwaConfigView {\n");
            sb.Append("  IsInitialized: ").Append(IsInitialized).Append("\n");
            sb.Append("  ConfigMode: ").Append(ConfigMode).Append("\n");
            sb.Append("  Root: ").Append(Root).Append("\n");
            sb.Append("  FocusNodeId: ").Append(FocusNodeId).Append("\n");
            sb.Append("  ConfigName: ").Append(ConfigName).Append("\n");
            sb.Append("  ConfigSavedOn: ").Append(ConfigSavedOn).Append("\n");
            sb.Append("  ConfigSavedBy: ").Append(ConfigSavedBy).Append("\n");
            sb.Append("  ConfigRevision: ").Append(ConfigRevision).Append("\n");
            sb.Append("  HasUnsavedChanges: ").Append(HasUnsavedChanges).Append("\n");
            sb.Append("  BasicModeOptions: ").Append(BasicModeOptions).Append("\n");
            sb.Append("  BasicSelectedNodeId: ").Append(BasicSelectedNodeId).Append("\n");
            sb.Append("  ModeLegend: ").Append(ModeLegend).Append("\n");
            sb.Append("  ChangeConfigWizardUrl: ").Append(ChangeConfigWizardUrl).Append("\n");
            sb.Append("  HelpUrl: ").Append(HelpUrl).Append("\n");
            sb.Append("  ShowDeviceSelector: ").Append(ShowDeviceSelector).Append("\n");
            sb.Append("  ShowSavedConfigInfo: ").Append(ShowSavedConfigInfo).Append("\n");
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
            return this.Equals(input as MediaEncodingSettingsHwaProjectionHwaConfigView);
        }

        /// <summary>
        /// Returns true if MediaEncodingSettingsHwaProjectionHwaConfigView instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingSettingsHwaProjectionHwaConfigView to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingSettingsHwaProjectionHwaConfigView input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsInitialized == input.IsInitialized ||
                    (this.IsInitialized != null &&
                    this.IsInitialized.Equals(input.IsInitialized))
                ) && 
                (
                    this.ConfigMode == input.ConfigMode ||
                    (this.ConfigMode != null &&
                    this.ConfigMode.Equals(input.ConfigMode))
                ) && 
                (
                    this.Root == input.Root ||
                    (this.Root != null &&
                    this.Root.Equals(input.Root))
                ) && 
                (
                    this.FocusNodeId == input.FocusNodeId ||
                    (this.FocusNodeId != null &&
                    this.FocusNodeId.Equals(input.FocusNodeId))
                ) && 
                (
                    this.ConfigName == input.ConfigName ||
                    (this.ConfigName != null &&
                    this.ConfigName.Equals(input.ConfigName))
                ) && 
                (
                    this.ConfigSavedOn == input.ConfigSavedOn ||
                    (this.ConfigSavedOn != null &&
                    this.ConfigSavedOn.Equals(input.ConfigSavedOn))
                ) && 
                (
                    this.ConfigSavedBy == input.ConfigSavedBy ||
                    (this.ConfigSavedBy != null &&
                    this.ConfigSavedBy.Equals(input.ConfigSavedBy))
                ) && 
                (
                    this.ConfigRevision == input.ConfigRevision ||
                    (this.ConfigRevision != null &&
                    this.ConfigRevision.Equals(input.ConfigRevision))
                ) && 
                (
                    this.HasUnsavedChanges == input.HasUnsavedChanges ||
                    (this.HasUnsavedChanges != null &&
                    this.HasUnsavedChanges.Equals(input.HasUnsavedChanges))
                ) && 
                (
                    this.BasicModeOptions == input.BasicModeOptions ||
                    this.BasicModeOptions != null &&
                    input.BasicModeOptions != null &&
                    this.BasicModeOptions.SequenceEqual(input.BasicModeOptions)
                ) && 
                (
                    this.BasicSelectedNodeId == input.BasicSelectedNodeId ||
                    (this.BasicSelectedNodeId != null &&
                    this.BasicSelectedNodeId.Equals(input.BasicSelectedNodeId))
                ) && 
                (
                    this.ModeLegend == input.ModeLegend ||
                    (this.ModeLegend != null &&
                    this.ModeLegend.Equals(input.ModeLegend))
                ) && 
                (
                    this.ChangeConfigWizardUrl == input.ChangeConfigWizardUrl ||
                    (this.ChangeConfigWizardUrl != null &&
                    this.ChangeConfigWizardUrl.Equals(input.ChangeConfigWizardUrl))
                ) && 
                (
                    this.HelpUrl == input.HelpUrl ||
                    (this.HelpUrl != null &&
                    this.HelpUrl.Equals(input.HelpUrl))
                ) && 
                (
                    this.ShowDeviceSelector == input.ShowDeviceSelector ||
                    (this.ShowDeviceSelector != null &&
                    this.ShowDeviceSelector.Equals(input.ShowDeviceSelector))
                ) && 
                (
                    this.ShowSavedConfigInfo == input.ShowSavedConfigInfo ||
                    (this.ShowSavedConfigInfo != null &&
                    this.ShowSavedConfigInfo.Equals(input.ShowSavedConfigInfo))
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
                if (this.IsInitialized != null)
                    hashCode = hashCode * 59 + this.IsInitialized.GetHashCode();
                if (this.ConfigMode != null)
                    hashCode = hashCode * 59 + this.ConfigMode.GetHashCode();
                if (this.Root != null)
                    hashCode = hashCode * 59 + this.Root.GetHashCode();
                if (this.FocusNodeId != null)
                    hashCode = hashCode * 59 + this.FocusNodeId.GetHashCode();
                if (this.ConfigName != null)
                    hashCode = hashCode * 59 + this.ConfigName.GetHashCode();
                if (this.ConfigSavedOn != null)
                    hashCode = hashCode * 59 + this.ConfigSavedOn.GetHashCode();
                if (this.ConfigSavedBy != null)
                    hashCode = hashCode * 59 + this.ConfigSavedBy.GetHashCode();
                if (this.ConfigRevision != null)
                    hashCode = hashCode * 59 + this.ConfigRevision.GetHashCode();
                if (this.HasUnsavedChanges != null)
                    hashCode = hashCode * 59 + this.HasUnsavedChanges.GetHashCode();
                if (this.BasicModeOptions != null)
                    hashCode = hashCode * 59 + this.BasicModeOptions.GetHashCode();
                if (this.BasicSelectedNodeId != null)
                    hashCode = hashCode * 59 + this.BasicSelectedNodeId.GetHashCode();
                if (this.ModeLegend != null)
                    hashCode = hashCode * 59 + this.ModeLegend.GetHashCode();
                if (this.ChangeConfigWizardUrl != null)
                    hashCode = hashCode * 59 + this.ChangeConfigWizardUrl.GetHashCode();
                if (this.HelpUrl != null)
                    hashCode = hashCode * 59 + this.HelpUrl.GetHashCode();
                if (this.ShowDeviceSelector != null)
                    hashCode = hashCode * 59 + this.ShowDeviceSelector.GetHashCode();
                if (this.ShowSavedConfigInfo != null)
                    hashCode = hashCode * 59 + this.ShowSavedConfigInfo.GetHashCode();
                return hashCode;
            }
        }

    }
}
