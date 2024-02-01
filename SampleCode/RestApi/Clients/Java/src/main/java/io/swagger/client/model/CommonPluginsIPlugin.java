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
import io.swagger.client.model.Version;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Interface IPlugin  
 */
@Schema(description = "Interface IPlugin  ")

public class CommonPluginsIPlugin {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Version")
  private Version version = null;

  @SerializedName("AssemblyFilePath")
  private String assemblyFilePath = null;

  @SerializedName("DataFolderPath")
  private String dataFolderPath = null;

  public CommonPluginsIPlugin name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the plugin
   * @return name
  **/
  @Schema(description = "The name of the plugin")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommonPluginsIPlugin description(String description) {
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

  public CommonPluginsIPlugin id(String id) {
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

  public CommonPluginsIPlugin version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public CommonPluginsIPlugin assemblyFilePath(String assemblyFilePath) {
    this.assemblyFilePath = assemblyFilePath;
    return this;
  }

   /**
   * The path to the assembly file
   * @return assemblyFilePath
  **/
  @Schema(description = "The path to the assembly file")
  public String getAssemblyFilePath() {
    return assemblyFilePath;
  }

  public void setAssemblyFilePath(String assemblyFilePath) {
    this.assemblyFilePath = assemblyFilePath;
  }

  public CommonPluginsIPlugin dataFolderPath(String dataFolderPath) {
    this.dataFolderPath = dataFolderPath;
    return this;
  }

   /**
   * The full path to the data folder, where the plugin can store any miscellaneous files needed
   * @return dataFolderPath
  **/
  @Schema(description = "The full path to the data folder, where the plugin can store any miscellaneous files needed")
  public String getDataFolderPath() {
    return dataFolderPath;
  }

  public void setDataFolderPath(String dataFolderPath) {
    this.dataFolderPath = dataFolderPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonPluginsIPlugin commonPluginsIPlugin = (CommonPluginsIPlugin) o;
    return Objects.equals(this.name, commonPluginsIPlugin.name) &&
        Objects.equals(this.description, commonPluginsIPlugin.description) &&
        Objects.equals(this.id, commonPluginsIPlugin.id) &&
        Objects.equals(this.version, commonPluginsIPlugin.version) &&
        Objects.equals(this.assemblyFilePath, commonPluginsIPlugin.assemblyFilePath) &&
        Objects.equals(this.dataFolderPath, commonPluginsIPlugin.dataFolderPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, id, version, assemblyFilePath, dataFolderPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonPluginsIPlugin {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    assemblyFilePath: ").append(toIndentedString(assemblyFilePath)).append("\n");
    sb.append("    dataFolderPath: ").append(toIndentedString(dataFolderPath)).append("\n");
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
