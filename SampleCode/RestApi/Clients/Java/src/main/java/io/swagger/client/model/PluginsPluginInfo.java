/*
 * Emby Server REST API
 * 
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
 * This is a serializable stub class that is used by the api to provide information about installed plugins.  
 */
@Schema(description = "This is a serializable stub class that is used by the api to provide information about installed plugins.  ")

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
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
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
   * The version.
   * @return version
  **/
  @Schema(description = "The version.")
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
   * The name of the configuration file.
   * @return configurationFileName
  **/
  @Schema(description = "The name of the configuration file.")
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
   * The description.
   * @return description
  **/
  @Schema(description = "The description.")
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
   * The unique id.
   * @return id
  **/
  @Schema(description = "The unique id.")
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
   * The image URL.
   * @return imageTag
  **/
  @Schema(description = "The image URL.")
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
