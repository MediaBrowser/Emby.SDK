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
import io.swagger.client.model.SyncModelSyncJobItem;
import io.swagger.client.model.SyncSyncJob;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncModelSyncJobCreationResult
 */


public class SyncModelSyncJobCreationResult {
  @SerializedName("Job")
  private SyncSyncJob job = null;

  @SerializedName("JobItems")
  private List<SyncModelSyncJobItem> jobItems = null;

  public SyncModelSyncJobCreationResult job(SyncSyncJob job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @Schema(description = "")
  public SyncSyncJob getJob() {
    return job;
  }

  public void setJob(SyncSyncJob job) {
    this.job = job;
  }

  public SyncModelSyncJobCreationResult jobItems(List<SyncModelSyncJobItem> jobItems) {
    this.jobItems = jobItems;
    return this;
  }

  public SyncModelSyncJobCreationResult addJobItemsItem(SyncModelSyncJobItem jobItemsItem) {
    if (this.jobItems == null) {
      this.jobItems = new ArrayList<SyncModelSyncJobItem>();
    }
    this.jobItems.add(jobItemsItem);
    return this;
  }

   /**
   * Get jobItems
   * @return jobItems
  **/
  @Schema(description = "")
  public List<SyncModelSyncJobItem> getJobItems() {
    return jobItems;
  }

  public void setJobItems(List<SyncModelSyncJobItem> jobItems) {
    this.jobItems = jobItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncJobCreationResult syncModelSyncJobCreationResult = (SyncModelSyncJobCreationResult) o;
    return Objects.equals(this.job, syncModelSyncJobCreationResult.job) &&
        Objects.equals(this.jobItems, syncModelSyncJobCreationResult.jobItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, jobItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncJobCreationResult {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    jobItems: ").append(toIndentedString(jobItems)).append("\n");
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
