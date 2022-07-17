/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.UpdatesPackageVersionClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdatesInstallationInfo
 */


public class UpdatesInstallationInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AssemblyGuid")
  private String assemblyGuid = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("UpdateClass")
  private UpdatesPackageVersionClass updateClass = null;

  @SerializedName("PercentComplete")
  private Double percentComplete = null;

  public UpdatesInstallationInfo id(String id) {
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

  public UpdatesInstallationInfo name(String name) {
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

  public UpdatesInstallationInfo assemblyGuid(String assemblyGuid) {
    this.assemblyGuid = assemblyGuid;
    return this;
  }

   /**
   * Get assemblyGuid
   * @return assemblyGuid
  **/
  @Schema(description = "")
  public String getAssemblyGuid() {
    return assemblyGuid;
  }

  public void setAssemblyGuid(String assemblyGuid) {
    this.assemblyGuid = assemblyGuid;
  }

  public UpdatesInstallationInfo version(String version) {
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

  public UpdatesInstallationInfo updateClass(UpdatesPackageVersionClass updateClass) {
    this.updateClass = updateClass;
    return this;
  }

   /**
   * Get updateClass
   * @return updateClass
  **/
  @Schema(description = "")
  public UpdatesPackageVersionClass getUpdateClass() {
    return updateClass;
  }

  public void setUpdateClass(UpdatesPackageVersionClass updateClass) {
    this.updateClass = updateClass;
  }

  public UpdatesInstallationInfo percentComplete(Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }

   /**
   * Get percentComplete
   * @return percentComplete
  **/
  @Schema(description = "")
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
    UpdatesInstallationInfo updatesInstallationInfo = (UpdatesInstallationInfo) o;
    return Objects.equals(this.id, updatesInstallationInfo.id) &&
        Objects.equals(this.name, updatesInstallationInfo.name) &&
        Objects.equals(this.assemblyGuid, updatesInstallationInfo.assemblyGuid) &&
        Objects.equals(this.version, updatesInstallationInfo.version) &&
        Objects.equals(this.updateClass, updatesInstallationInfo.updateClass) &&
        Objects.equals(this.percentComplete, updatesInstallationInfo.percentComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, assemblyGuid, version, updateClass, percentComplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatesInstallationInfo {\n");
    
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
