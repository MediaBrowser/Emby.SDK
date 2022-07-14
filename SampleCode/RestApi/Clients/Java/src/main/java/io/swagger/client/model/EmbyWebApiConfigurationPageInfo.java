/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CommonPluginsIPlugin;
import io.swagger.client.model.PluginsConfigurationPageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyWebApiConfigurationPageInfo
 */


public class EmbyWebApiConfigurationPageInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("EnableInMainMenu")
  private Boolean enableInMainMenu = null;

  @SerializedName("MenuSection")
  private String menuSection = null;

  @SerializedName("MenuIcon")
  private String menuIcon = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ConfigurationPageType")
  private PluginsConfigurationPageType configurationPageType = null;

  @SerializedName("PluginId")
  private String pluginId = null;

  @SerializedName("Plugin")
  private CommonPluginsIPlugin plugin = null;

  @SerializedName("Translations")
  private List<String> translations = null;

  public EmbyWebApiConfigurationPageInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmbyWebApiConfigurationPageInfo enableInMainMenu(Boolean enableInMainMenu) {
    this.enableInMainMenu = enableInMainMenu;
    return this;
  }

   /**
   * Get enableInMainMenu
   * @return enableInMainMenu
  **/
  @Schema(description = "")
  public Boolean isEnableInMainMenu() {
    return enableInMainMenu;
  }

  public void setEnableInMainMenu(Boolean enableInMainMenu) {
    this.enableInMainMenu = enableInMainMenu;
  }

  public EmbyWebApiConfigurationPageInfo menuSection(String menuSection) {
    this.menuSection = menuSection;
    return this;
  }

   /**
   * Get menuSection
   * @return menuSection
  **/
  @Schema(description = "")
  public String getMenuSection() {
    return menuSection;
  }

  public void setMenuSection(String menuSection) {
    this.menuSection = menuSection;
  }

  public EmbyWebApiConfigurationPageInfo menuIcon(String menuIcon) {
    this.menuIcon = menuIcon;
    return this;
  }

   /**
   * Get menuIcon
   * @return menuIcon
  **/
  @Schema(description = "")
  public String getMenuIcon() {
    return menuIcon;
  }

  public void setMenuIcon(String menuIcon) {
    this.menuIcon = menuIcon;
  }

  public EmbyWebApiConfigurationPageInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EmbyWebApiConfigurationPageInfo configurationPageType(PluginsConfigurationPageType configurationPageType) {
    this.configurationPageType = configurationPageType;
    return this;
  }

   /**
   * Get configurationPageType
   * @return configurationPageType
  **/
  @Schema(description = "")
  public PluginsConfigurationPageType getConfigurationPageType() {
    return configurationPageType;
  }

  public void setConfigurationPageType(PluginsConfigurationPageType configurationPageType) {
    this.configurationPageType = configurationPageType;
  }

  public EmbyWebApiConfigurationPageInfo pluginId(String pluginId) {
    this.pluginId = pluginId;
    return this;
  }

   /**
   * Get pluginId
   * @return pluginId
  **/
  @Schema(description = "")
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }

  public EmbyWebApiConfigurationPageInfo plugin(CommonPluginsIPlugin plugin) {
    this.plugin = plugin;
    return this;
  }

   /**
   * Get plugin
   * @return plugin
  **/
  @Schema(description = "")
  public CommonPluginsIPlugin getPlugin() {
    return plugin;
  }

  public void setPlugin(CommonPluginsIPlugin plugin) {
    this.plugin = plugin;
  }

  public EmbyWebApiConfigurationPageInfo translations(List<String> translations) {
    this.translations = translations;
    return this;
  }

  public EmbyWebApiConfigurationPageInfo addTranslationsItem(String translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<String>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @Schema(description = "")
  public List<String> getTranslations() {
    return translations;
  }

  public void setTranslations(List<String> translations) {
    this.translations = translations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyWebApiConfigurationPageInfo embyWebApiConfigurationPageInfo = (EmbyWebApiConfigurationPageInfo) o;
    return Objects.equals(this.name, embyWebApiConfigurationPageInfo.name) &&
        Objects.equals(this.enableInMainMenu, embyWebApiConfigurationPageInfo.enableInMainMenu) &&
        Objects.equals(this.menuSection, embyWebApiConfigurationPageInfo.menuSection) &&
        Objects.equals(this.menuIcon, embyWebApiConfigurationPageInfo.menuIcon) &&
        Objects.equals(this.displayName, embyWebApiConfigurationPageInfo.displayName) &&
        Objects.equals(this.configurationPageType, embyWebApiConfigurationPageInfo.configurationPageType) &&
        Objects.equals(this.pluginId, embyWebApiConfigurationPageInfo.pluginId) &&
        Objects.equals(this.plugin, embyWebApiConfigurationPageInfo.plugin) &&
        Objects.equals(this.translations, embyWebApiConfigurationPageInfo.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enableInMainMenu, menuSection, menuIcon, displayName, configurationPageType, pluginId, plugin, translations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebApiConfigurationPageInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enableInMainMenu: ").append(toIndentedString(enableInMainMenu)).append("\n");
    sb.append("    menuSection: ").append(toIndentedString(menuSection)).append("\n");
    sb.append("    menuIcon: ").append(toIndentedString(menuIcon)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    configurationPageType: ").append(toIndentedString(configurationPageType)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
