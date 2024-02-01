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
import io.swagger.client.model.SyncJob;
import io.swagger.client.model.SyncJobItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncJobCreationResult
 */


public class SyncJobCreationResult {
  @SerializedName("Job")
  private SyncJob job = null;

  @SerializedName("JobItems")
  private List<SyncJobItem> jobItems = null;

  public SyncJobCreationResult job(SyncJob job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @Schema(description = "")
  public SyncJob getJob() {
    return job;
  }

  public void setJob(SyncJob job) {
    this.job = job;
  }

  public SyncJobCreationResult jobItems(List<SyncJobItem> jobItems) {
    this.jobItems = jobItems;
    return this;
  }

  public SyncJobCreationResult addJobItemsItem(SyncJobItem jobItemsItem) {
    if (this.jobItems == null) {
      this.jobItems = new ArrayList<SyncJobItem>();
    }
    this.jobItems.add(jobItemsItem);
    return this;
  }

   /**
   * Get jobItems
   * @return jobItems
  **/
  @Schema(description = "")
  public List<SyncJobItem> getJobItems() {
    return jobItems;
  }

  public void setJobItems(List<SyncJobItem> jobItems) {
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
    SyncJobCreationResult syncJobCreationResult = (SyncJobCreationResult) o;
    return Objects.equals(this.job, syncJobCreationResult.job) &&
        Objects.equals(this.jobItems, syncJobCreationResult.jobItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, jobItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobCreationResult {\n");
    
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
