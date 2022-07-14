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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PluginsPluginInfo
 */


public class PluginsPluginInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("ConfigurationFileName")
  private String configurationFileName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ImageTag")
  private String imageTag = null;

  public PluginsPluginInfo name(String name) {
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

  public PluginsPluginInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PluginsPluginInfo configurationFileName(String configurationFileName) {
    this.configurationFileName = configurationFileName;
    return this;
  }

   /**
   * Get configurationFileName
   * @return configurationFileName
  **/
  @Schema(description = "")
  public String getConfigurationFileName() {
    return configurationFileName;
  }

  public void setConfigurationFileName(String configurationFileName) {
    this.configurationFileName = configurationFileName;
  }

  public PluginsPluginInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginsPluginInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PluginsPluginInfo imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Get imageTag
   * @return imageTag
  **/
  @Schema(description = "")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsPluginInfo pluginsPluginInfo = (PluginsPluginInfo) o;
    return Objects.equals(this.name, pluginsPluginInfo.name) &&
        Objects.equals(this.version, pluginsPluginInfo.version) &&
        Objects.equals(this.configurationFileName, pluginsPluginInfo.configurationFileName) &&
        Objects.equals(this.description, pluginsPluginInfo.description) &&
        Objects.equals(this.id, pluginsPluginInfo.id) &&
        Objects.equals(this.imageTag, pluginsPluginInfo.imageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, configurationFileName, description, id, imageTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsPluginInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    configurationFileName: ").append(toIndentedString(configurationFileName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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
