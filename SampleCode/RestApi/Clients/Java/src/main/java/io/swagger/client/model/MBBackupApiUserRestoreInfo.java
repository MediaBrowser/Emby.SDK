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
 * MBBackupApiUserRestoreInfo
 */


public class MBBackupApiUserRestoreInfo {
  @SerializedName("SourceUserId")
  private String sourceUserId = null;

  @SerializedName("TargetUserId")
  private String targetUserId = null;

  public MBBackupApiUserRestoreInfo sourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
    return this;
  }

   /**
   * Get sourceUserId
   * @return sourceUserId
  **/
  @Schema(description = "")
  public String getSourceUserId() {
    return sourceUserId;
  }

  public void setSourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
  }

  public MBBackupApiUserRestoreInfo targetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
    return this;
  }

   /**
   * Get targetUserId
   * @return targetUserId
  **/
  @Schema(description = "")
  public String getTargetUserId() {
    return targetUserId;
  }

  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBBackupApiUserRestoreInfo mbBackupApiUserRestoreInfo = (MBBackupApiUserRestoreInfo) o;
    return Objects.equals(this.sourceUserId, mbBackupApiUserRestoreInfo.sourceUserId) &&
        Objects.equals(this.targetUserId, mbBackupApiUserRestoreInfo.targetUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceUserId, targetUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBBackupApiUserRestoreInfo {\n");
    
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
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
