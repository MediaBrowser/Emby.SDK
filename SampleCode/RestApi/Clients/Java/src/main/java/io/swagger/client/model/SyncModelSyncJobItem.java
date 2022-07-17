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
import io.swagger.client.model.MediaSourceInfo;
import io.swagger.client.model.SyncModelItemFileInfo;
import io.swagger.client.model.SyncModelSyncJobItemStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncModelSyncJobItem
 */


public class SyncModelSyncJobItem {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("JobId")
  private Long jobId = null;

  @SerializedName("ItemId")
  private Long itemId = null;

  @SerializedName("ItemName")
  private String itemName = null;

  @SerializedName("MediaSourceId")
  private String mediaSourceId = null;

  @SerializedName("MediaSource")
  private MediaSourceInfo mediaSource = null;

  @SerializedName("TargetId")
  private String targetId = null;

  @SerializedName("OutputPath")
  private String outputPath = null;

  @SerializedName("Status")
  private SyncModelSyncJobItemStatus status = null;

  @SerializedName("Progress")
  private Double progress = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("PrimaryImageItemId")
  private String primaryImageItemId = null;

  @SerializedName("PrimaryImageTag")
  private String primaryImageTag = null;

  @SerializedName("TemporaryPath")
  private String temporaryPath = null;

  @SerializedName("AdditionalFiles")
  private List<SyncModelItemFileInfo> additionalFiles = null;

  @SerializedName("ItemDateModifiedTicks")
  private Long itemDateModifiedTicks = null;

  public SyncModelSyncJobItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SyncModelSyncJobItem jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @Schema(description = "")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public SyncModelSyncJobItem itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public SyncModelSyncJobItem itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @Schema(description = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public SyncModelSyncJobItem mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
    return this;
  }

   /**
   * Get mediaSourceId
   * @return mediaSourceId
  **/
  @Schema(description = "")
  public String getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public SyncModelSyncJobItem mediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

   /**
   * Get mediaSource
   * @return mediaSource
  **/
  @Schema(description = "")
  public MediaSourceInfo getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
  }

  public SyncModelSyncJobItem targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @Schema(description = "")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public SyncModelSyncJobItem outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Get outputPath
   * @return outputPath
  **/
  @Schema(description = "")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public SyncModelSyncJobItem status(SyncModelSyncJobItemStatus status) {
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

  public SyncModelSyncJobItem progress(Double progress) {
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

  public SyncModelSyncJobItem dateCreated(OffsetDateTime dateCreated) {
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

  public SyncModelSyncJobItem primaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
    return this;
  }

   /**
   * Get primaryImageItemId
   * @return primaryImageItemId
  **/
  @Schema(description = "")
  public String getPrimaryImageItemId() {
    return primaryImageItemId;
  }

  public void setPrimaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
  }

  public SyncModelSyncJobItem primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
    return this;
  }

   /**
   * Get primaryImageTag
   * @return primaryImageTag
  **/
  @Schema(description = "")
  public String getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }

  public SyncModelSyncJobItem temporaryPath(String temporaryPath) {
    this.temporaryPath = temporaryPath;
    return this;
  }

   /**
   * Get temporaryPath
   * @return temporaryPath
  **/
  @Schema(description = "")
  public String getTemporaryPath() {
    return temporaryPath;
  }

  public void setTemporaryPath(String temporaryPath) {
    this.temporaryPath = temporaryPath;
  }

  public SyncModelSyncJobItem additionalFiles(List<SyncModelItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
    return this;
  }

  public SyncModelSyncJobItem addAdditionalFilesItem(SyncModelItemFileInfo additionalFilesItem) {
    if (this.additionalFiles == null) {
      this.additionalFiles = new ArrayList<SyncModelItemFileInfo>();
    }
    this.additionalFiles.add(additionalFilesItem);
    return this;
  }

   /**
   * Get additionalFiles
   * @return additionalFiles
  **/
  @Schema(description = "")
  public List<SyncModelItemFileInfo> getAdditionalFiles() {
    return additionalFiles;
  }

  public void setAdditionalFiles(List<SyncModelItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
  }

  public SyncModelSyncJobItem itemDateModifiedTicks(Long itemDateModifiedTicks) {
    this.itemDateModifiedTicks = itemDateModifiedTicks;
    return this;
  }

   /**
   * Get itemDateModifiedTicks
   * @return itemDateModifiedTicks
  **/
  @Schema(description = "")
  public Long getItemDateModifiedTicks() {
    return itemDateModifiedTicks;
  }

  public void setItemDateModifiedTicks(Long itemDateModifiedTicks) {
    this.itemDateModifiedTicks = itemDateModifiedTicks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncJobItem syncModelSyncJobItem = (SyncModelSyncJobItem) o;
    return Objects.equals(this.id, syncModelSyncJobItem.id) &&
        Objects.equals(this.jobId, syncModelSyncJobItem.jobId) &&
        Objects.equals(this.itemId, syncModelSyncJobItem.itemId) &&
        Objects.equals(this.itemName, syncModelSyncJobItem.itemName) &&
        Objects.equals(this.mediaSourceId, syncModelSyncJobItem.mediaSourceId) &&
        Objects.equals(this.mediaSource, syncModelSyncJobItem.mediaSource) &&
        Objects.equals(this.targetId, syncModelSyncJobItem.targetId) &&
        Objects.equals(this.outputPath, syncModelSyncJobItem.outputPath) &&
        Objects.equals(this.status, syncModelSyncJobItem.status) &&
        Objects.equals(this.progress, syncModelSyncJobItem.progress) &&
        Objects.equals(this.dateCreated, syncModelSyncJobItem.dateCreated) &&
        Objects.equals(this.primaryImageItemId, syncModelSyncJobItem.primaryImageItemId) &&
        Objects.equals(this.primaryImageTag, syncModelSyncJobItem.primaryImageTag) &&
        Objects.equals(this.temporaryPath, syncModelSyncJobItem.temporaryPath) &&
        Objects.equals(this.additionalFiles, syncModelSyncJobItem.additionalFiles) &&
        Objects.equals(this.itemDateModifiedTicks, syncModelSyncJobItem.itemDateModifiedTicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, itemId, itemName, mediaSourceId, mediaSource, targetId, outputPath, status, progress, dateCreated, primaryImageItemId, primaryImageTag, temporaryPath, additionalFiles, itemDateModifiedTicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncJobItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    primaryImageItemId: ").append(toIndentedString(primaryImageItemId)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    temporaryPath: ").append(toIndentedString(temporaryPath)).append("\n");
    sb.append("    additionalFiles: ").append(toIndentedString(additionalFiles)).append("\n");
    sb.append("    itemDateModifiedTicks: ").append(toIndentedString(itemDateModifiedTicks)).append("\n");
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
