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
import io.swagger.client.model.SyncJobItemStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SyncedItemProgress
 */


public class SyncedItemProgress {
  @SerializedName("Progress")
  private Double progress = null;

  @SerializedName("Status")
  private SyncJobItemStatus status = null;

  public SyncedItemProgress progress(Double progress) {
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

  public SyncedItemProgress status(SyncJobItemStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SyncJobItemStatus getStatus() {
    return status;
  }

  public void setStatus(SyncJobItemStatus status) {
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
    SyncedItemProgress syncedItemProgress = (SyncedItemProgress) o;
    return Objects.equals(this.progress, syncedItemProgress.progress) &&
        Objects.equals(this.status, syncedItemProgress.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progress, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncedItemProgress {\n");
    
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
