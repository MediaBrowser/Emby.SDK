// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class EmbyWebApiConfigurationPageInfo
    {
        /// <summary>
        /// Initializes a new instance of the EmbyWebApiConfigurationPageInfo
        /// class.
        /// </summary>
        public EmbyWebApiConfigurationPageInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the EmbyWebApiConfigurationPageInfo
        /// class.
        /// </summary>
        /// <param name="configurationPageType">Possible values include:
        /// 'PluginConfiguration', 'None'</param>
        public EmbyWebApiConfigurationPageInfo(string name = default(string), bool? enableInMainMenu = default(bool?), bool? enableInUserMenu = default(bool?), string featureId = default(string), string menuSection = default(string), string menuIcon = default(string), string displayName = default(string), string configurationPageType = default(string), string pluginId = default(string), string href = default(string), string navMenuId = default(string), CommonPluginsIPlugin plugin = default(CommonPluginsIPlugin), IList<string> translations = default(IList<string>))
        {
            Name = name;
            EnableInMainMenu = enableInMainMenu;
            EnableInUserMenu = enableInUserMenu;
            FeatureId = featureId;
            MenuSection = menuSection;
            MenuIcon = menuIcon;
            DisplayName = displayName;
            ConfigurationPageType = configurationPageType;
            PluginId = pluginId;
            Href = href;
            NavMenuId = navMenuId;
            Plugin = plugin;
            Translations = translations;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "EnableInMainMenu")]
        public bool? EnableInMainMenu { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "EnableInUserMenu")]
        public bool? EnableInUserMenu { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "FeatureId")]
        public string FeatureId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MenuSection")]
        public string MenuSection { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MenuIcon")]
        public string MenuIcon { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DisplayName")]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'PluginConfiguration', 'None'
        /// </summary>
        [JsonProperty(PropertyName = "ConfigurationPageType")]
        public string ConfigurationPageType { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "PluginId")]
        public string PluginId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Href")]
        public string Href { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "NavMenuId")]
        public string NavMenuId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Plugin")]
        public CommonPluginsIPlugin Plugin { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Translations")]
        public IList<string> Translations { get; set; }

    }
}