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
import io.swagger.client.model.PackageVersionClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Class InstallationInfo  
 */
@Schema(description = "Class InstallationInfo  ")

public class InstallationInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AssemblyGuid")
  private String assemblyGuid = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("UpdateClass")
  private PackageVersionClass updateClass = null;

  @SerializedName("PercentComplete")
  private Double percentComplete = null;

  public InstallationInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id.
   * @return id
  **/
  @Schema(description = "The id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InstallationInfo name(String name) {
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

  public InstallationInfo assemblyGuid(String assemblyGuid) {
    this.assemblyGuid = assemblyGuid;
    return this;
  }

   /**
   * The assembly guid.
   * @return assemblyGuid
  **/
  @Schema(description = "The assembly guid.")
  public String getAssemblyGuid() {
    return assemblyGuid;
  }

  public void setAssemblyGuid(String assemblyGuid) {
    this.assemblyGuid = assemblyGuid;
  }

  public InstallationInfo version(String version) {
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

  public InstallationInfo updateClass(PackageVersionClass updateClass) {
    this.updateClass = updateClass;
    return this;
  }

   /**
   * Get updateClass
   * @return updateClass
  **/
  @Schema(description = "")
  public PackageVersionClass getUpdateClass() {
    return updateClass;
  }

  public void setUpdateClass(PackageVersionClass updateClass) {
    this.updateClass = updateClass;
  }

  public InstallationInfo percentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }

   /**
   * The percent complete.
   * @return percentComplete
  **/
  @Schema(description = "The percent complete.")
  public Double getPercentComplete() {
    return percentComplete;
  }

  public void setPercentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallationInfo installationInfo = (InstallationInfo) o;
    return Objects.equals(this.id, installationInfo.id) &&
        Objects.equals(this.name, installationInfo.name) &&
        Objects.equals(this.assemblyGuid, installationInfo.assemblyGuid) &&
        Objects.equals(this.version, installationInfo.version) &&
        Objects.equals(this.updateClass, installationInfo.updateClass) &&
        Objects.equals(this.percentComplete, installationInfo.percentComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, assemblyGuid, version, updateClass, percentComplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallationInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assemblyGuid: ").append(toIndentedString(assemblyGuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    updateClass: ").append(toIndentedString(updateClass)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
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
