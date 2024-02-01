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
import org.threeten.bp.OffsetDateTime;
/**
 * MBBackupBackupInfo
 */


public class MBBackupBackupInfo {
  @SerializedName("ServerVersion")
  private String serverVersion = null;

  @SerializedName("PluginVersion")
  private String pluginVersion = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CanRestore")
  private Boolean canRestore = null;

  @SerializedName("IsFullBackup")
  private Boolean isFullBackup = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  public MBBackupBackupInfo serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

   /**
   * Get serverVersion
   * @return serverVersion
  **/
  @Schema(description = "")
  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public MBBackupBackupInfo pluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * Get pluginVersion
   * @return pluginVersion
  **/
  @Schema(description = "")
  public String getPluginVersion() {
    return pluginVersion;
  }

  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }

  public MBBackupBackupInfo name(String name) {
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

  public MBBackupBackupInfo canRestore(Boolean canRestore) {
    this.canRestore = canRestore;
    return this;
  }

   /**
   * Get canRestore
   * @return canRestore
  **/
  @Schema(description = "")
  public Boolean isCanRestore() {
    return canRestore;
  }

  public void setCanRestore(Boolean canRestore) {
    this.canRestore = canRestore;
  }

  public MBBackupBackupInfo isFullBackup(Boolean isFullBackup) {
    this.isFullBackup = isFullBackup;
    return this;
  }

   /**
   * Get isFullBackup
   * @return isFullBackup
  **/
  @Schema(description = "")
  public Boolean isIsFullBackup() {
    return isFullBackup;
  }

  public void setIsFullBackup(Boolean isFullBackup) {
    this.isFullBackup = isFullBackup;
  }

  public MBBackupBackupInfo dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBBackupBackupInfo mbBackupBackupInfo = (MBBackupBackupInfo) o;
    return Objects.equals(this.serverVersion, mbBackupBackupInfo.serverVersion) &&
        Objects.equals(this.pluginVersion, mbBackupBackupInfo.pluginVersion) &&
        Objects.equals(this.name, mbBackupBackupInfo.name) &&
        Objects.equals(this.canRestore, mbBackupBackupInfo.canRestore) &&
        Objects.equals(this.isFullBackup, mbBackupBackupInfo.isFullBackup) &&
        Objects.equals(this.dateCreated, mbBackupBackupInfo.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverVersion, pluginVersion, name, canRestore, isFullBackup, dateCreated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBBackupBackupInfo {\n");
    
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    canRestore: ").append(toIndentedString(canRestore)).append("\n");
    sb.append("    isFullBackup: ").append(toIndentedString(isFullBackup)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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
