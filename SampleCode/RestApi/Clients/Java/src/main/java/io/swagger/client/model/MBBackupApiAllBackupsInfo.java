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
import io.swagger.client.model.MBBackupBackupInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MBBackupApiAllBackupsInfo
 */


public class MBBackupApiAllBackupsInfo {
  @SerializedName("FullBackupInfo")
  private MBBackupBackupInfo fullBackupInfo = null;

  @SerializedName("LightBackups")
  private List<MBBackupBackupInfo> lightBackups = null;

  public MBBackupApiAllBackupsInfo fullBackupInfo(MBBackupBackupInfo fullBackupInfo) {
    this.fullBackupInfo = fullBackupInfo;
    return this;
  }

   /**
   * Get fullBackupInfo
   * @return fullBackupInfo
  **/
  @Schema(description = "")
  public MBBackupBackupInfo getFullBackupInfo() {
    return fullBackupInfo;
  }

  public void setFullBackupInfo(MBBackupBackupInfo fullBackupInfo) {
    this.fullBackupInfo = fullBackupInfo;
  }

  public MBBackupApiAllBackupsInfo lightBackups(List<MBBackupBackupInfo> lightBackups) {
    this.lightBackups = lightBackups;
    return this;
  }

  public MBBackupApiAllBackupsInfo addLightBackupsItem(MBBackupBackupInfo lightBackupsItem) {
    if (this.lightBackups == null) {
      this.lightBackups = new ArrayList<MBBackupBackupInfo>();
    }
    this.lightBackups.add(lightBackupsItem);
    return this;
  }

   /**
   * Get lightBackups
   * @return lightBackups
  **/
  @Schema(description = "")
  public List<MBBackupBackupInfo> getLightBackups() {
    return lightBackups;
  }

  public void setLightBackups(List<MBBackupBackupInfo> lightBackups) {
    this.lightBackups = lightBackups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBBackupApiAllBackupsInfo mbBackupApiAllBackupsInfo = (MBBackupApiAllBackupsInfo) o;
    return Objects.equals(this.fullBackupInfo, mbBackupApiAllBackupsInfo.fullBackupInfo) &&
        Objects.equals(this.lightBackups, mbBackupApiAllBackupsInfo.lightBackups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullBackupInfo, lightBackups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBBackupApiAllBackupsInfo {\n");
    
    sb.append("    fullBackupInfo: ").append(toIndentedString(fullBackupInfo)).append("\n");
    sb.append("    lightBackups: ").append(toIndentedString(lightBackups)).append("\n");
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
