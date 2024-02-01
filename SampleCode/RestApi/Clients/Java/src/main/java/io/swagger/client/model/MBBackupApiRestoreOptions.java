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
 * MBBackupApiRestoreOptions
 */


public class MBBackupApiRestoreOptions {
  @SerializedName("RestoreServerId")
  private Boolean restoreServerId = null;

  @SerializedName("UseFiles")
  private String useFiles = null;

  public MBBackupApiRestoreOptions restoreServerId(Boolean restoreServerId) {
    this.restoreServerId = restoreServerId;
    return this;
  }

   /**
   * Get restoreServerId
   * @return restoreServerId
  **/
  @Schema(description = "")
  public Boolean isRestoreServerId() {
    return restoreServerId;
  }

  public void setRestoreServerId(Boolean restoreServerId) {
    this.restoreServerId = restoreServerId;
  }

  public MBBackupApiRestoreOptions useFiles(String useFiles) {
    this.useFiles = useFiles;
    return this;
  }

   /**
   * Get useFiles
   * @return useFiles
  **/
  @Schema(description = "")
  public String getUseFiles() {
    return useFiles;
  }

  public void setUseFiles(String useFiles) {
    this.useFiles = useFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MBBackupApiRestoreOptions mbBackupApiRestoreOptions = (MBBackupApiRestoreOptions) o;
    return Objects.equals(this.restoreServerId, mbBackupApiRestoreOptions.restoreServerId) &&
        Objects.equals(this.useFiles, mbBackupApiRestoreOptions.useFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreServerId, useFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MBBackupApiRestoreOptions {\n");
    
    sb.append("    restoreServerId: ").append(toIndentedString(restoreServerId)).append("\n");
    sb.append("    useFiles: ").append(toIndentedString(useFiles)).append("\n");
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
