/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.SyncModelSyncJobItemStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SyncModelSyncedItemProgress
 */


public class SyncModelSyncedItemProgress {
  @SerializedName("Progress")
  private Double progress = null;

  @SerializedName("Status")
  private SyncModelSyncJobItemStatus status = null;

  public SyncModelSyncedItemProgress progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public SyncModelSyncedItemProgress status(SyncModelSyncJobItemStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SyncModelSyncJobItemStatus getStatus() {
    return status;
  }

  public void setStatus(SyncModelSyncJobItemStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncedItemProgress syncModelSyncedItemProgress = (SyncModelSyncedItemProgress) o;
    return Objects.equals(this.progress, syncModelSyncedItemProgress.progress) &&
        Objects.equals(this.status, syncModelSyncedItemProgress.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progress, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncedItemProgress {\n");
    
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
