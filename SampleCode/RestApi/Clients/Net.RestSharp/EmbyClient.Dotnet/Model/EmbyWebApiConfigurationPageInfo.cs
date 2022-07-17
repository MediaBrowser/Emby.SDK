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
    /// EmbyWebApiConfigurationPageInfo
    /// </summary>
    [DataContract]
        public partial class EmbyWebApiConfigurationPageInfo :  IEquatable<EmbyWebApiConfigurationPageInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyWebApiConfigurationPageInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="enableInMainMenu">enableInMainMenu.</param>
        /// <param name="menuSection">menuSection.</param>
        /// <param name="menuIcon">menuIcon.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="configurationPageType">configurationPageType.</param>
        /// <param name="pluginId">pluginId.</param>
        /// <param name="plugin">plugin.</param>
        /// <param name="translations">translations.</param>
        public EmbyWebApiConfigurationPageInfo(string name = default(string), bool? enableInMainMenu = default(bool?), string menuSection = default(string), string menuIcon = default(string), string displayName = default(string), PluginsConfigurationPageType configurationPageType = default(PluginsConfigurationPageType), string pluginId = default(string), CommonPluginsIPlugin plugin = default(CommonPluginsIPlugin), List<string> translations = default(List<string>))
        {
            this.Name = name;
            this.EnableInMainMenu = enableInMainMenu;
            this.MenuSection = menuSection;
            this.MenuIcon = menuIcon;
            this.DisplayName = displayName;
            this.ConfigurationPageType = configurationPageType;
            this.PluginId = pluginId;
            this.Plugin = plugin;
            this.Translations = translations;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets EnableInMainMenu
        /// </summary>
        [DataMember(Name="EnableInMainMenu", EmitDefaultValue=false)]
        public bool? EnableInMainMenu { get; set; }

        /// <summary>
        /// Gets or Sets MenuSection
        /// </summary>
        [DataMember(Name="MenuSection", EmitDefaultValue=false)]
        public string MenuSection { get; set; }

        /// <summary>
        /// Gets or Sets MenuIcon
        /// </summary>
        [DataMember(Name="MenuIcon", EmitDefaultValue=false)]
        public string MenuIcon { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="DisplayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets ConfigurationPageType
        /// </summary>
        [DataMember(Name="ConfigurationPageType", EmitDefaultValue=false)]
        public PluginsConfigurationPageType ConfigurationPageType { get; set; }

        /// <summary>
        /// Gets or Sets PluginId
        /// </summary>
        [DataMember(Name="PluginId", EmitDefaultValue=false)]
        public string PluginId { get; set; }

        /// <summary>
        /// Gets or Sets Plugin
        /// </summary>
        [DataMember(Name="Plugin", EmitDefaultValue=false)]
        public CommonPluginsIPlugin Plugin { get; set; }

        /// <summary>
        /// Gets or Sets Translations
        /// </summary>
        [DataMember(Name="Translations", EmitDefaultValue=false)]
        public List<string> Translations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyWebApiConfigurationPageInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  EnableInMainMenu: ").Append(EnableInMainMenu).Append("\n");
            sb.Append("  MenuSection: ").Append(MenuSection).Append("\n");
            sb.Append("  MenuIcon: ").Append(MenuIcon).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  ConfigurationPageType: ").Append(ConfigurationPageType).Append("\n");
            sb.Append("  PluginId: ").Append(PluginId).Append("\n");
            sb.Append("  Plugin: ").Append(Plugin).Append("\n");
            sb.Append("  Translations: ").Append(Translations).Append("\n");
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
            return this.Equals(input as EmbyWebApiConfigurationPageInfo);
        }

        /// <summary>
        /// Returns true if EmbyWebApiConfigurationPageInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyWebApiConfigurationPageInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyWebApiConfigurationPageInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.EnableInMainMenu == input.EnableInMainMenu ||
                    (this.EnableInMainMenu != null &&
                    this.EnableInMainMenu.Equals(input.EnableInMainMenu))
                ) && 
                (
                    this.MenuSection == input.MenuSection ||
                    (this.MenuSection != null &&
                    this.MenuSection.Equals(input.MenuSection))
                ) && 
                (
                    this.MenuIcon == input.MenuIcon ||
                    (this.MenuIcon != null &&
                    this.MenuIcon.Equals(input.MenuIcon))
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.ConfigurationPageType == input.ConfigurationPageType ||
                    (this.ConfigurationPageType != null &&
                    this.ConfigurationPageType.Equals(input.ConfigurationPageType))
                ) && 
                (
                    this.PluginId == input.PluginId ||
                    (this.PluginId != null &&
                    this.PluginId.Equals(input.PluginId))
                ) && 
                (
                    this.Plugin == input.Plugin ||
                    (this.Plugin != null &&
                    this.Plugin.Equals(input.Plugin))
                ) && 
                (
                    this.Translations == input.Translations ||
                    this.Translations != null &&
                    input.Translations != null &&
                    this.Translations.SequenceEqual(input.Translations)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.EnableInMainMenu != null)
                    hashCode = hashCode * 59 + this.EnableInMainMenu.GetHashCode();
                if (this.MenuSection != null)
                    hashCode = hashCode * 59 + this.MenuSection.GetHashCode();
                if (this.MenuIcon != null)
                    hashCode = hashCode * 59 + this.MenuIcon.GetHashCode();
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.ConfigurationPageType != null)
                    hashCode = hashCode * 59 + this.ConfigurationPageType.GetHashCode();
                if (this.PluginId != null)
                    hashCode = hashCode * 59 + this.PluginId.GetHashCode();
                if (this.Plugin != null)
                    hashCode = hashCode * 59 + this.Plugin.GetHashCode();
                if (this.Translations != null)
                    hashCode = hashCode * 59 + this.Translations.GetHashCode();
                return hashCode;
            }
        }

    }
}
