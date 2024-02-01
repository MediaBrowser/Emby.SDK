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
import io.swagger.client.model.ItemFileInfo;
import io.swagger.client.model.MediaSourceInfo;
import io.swagger.client.model.SyncJobItemStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncJobItem
 */


public class SyncJobItem {
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

  @SerializedName("InternalTargetId")
  private Long internalTargetId = null;

  @SerializedName("OutputPath")
  private String outputPath = null;

  @SerializedName("Status")
  private SyncJobItemStatus status = null;

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
  private List<ItemFileInfo> additionalFiles = null;

  public SyncJobItem id(Long id) {
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

  public SyncJobItem jobId(Long jobId) {
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

  public SyncJobItem itemId(Long itemId) {
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

  public SyncJobItem itemName(String itemName) {
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

  public SyncJobItem mediaSourceId(String mediaSourceId) {
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

  public SyncJobItem mediaSource(MediaSourceInfo mediaSource) {
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

  public SyncJobItem targetId(String targetId) {
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

  public SyncJobItem internalTargetId(Long internalTargetId) {
    this.internalTargetId = internalTargetId;
    return this;
  }

   /**
   * Get internalTargetId
   * @return internalTargetId
  **/
  @Schema(description = "")
  public Long getInternalTargetId() {
    return internalTargetId;
  }

  public void setInternalTargetId(Long internalTargetId) {
    this.internalTargetId = internalTargetId;
  }

  public SyncJobItem outputPath(String outputPath) {
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

  public SyncJobItem status(SyncJobItemStatus status) {
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

  public SyncJobItem progress(Double progress) {
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

  public SyncJobItem dateCreated(OffsetDateTime dateCreated) {
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

  public SyncJobItem primaryImageItemId(String primaryImageItemId) {
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

  public SyncJobItem primaryImageTag(String primaryImageTag) {
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

  public SyncJobItem temporaryPath(String temporaryPath) {
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

  public SyncJobItem additionalFiles(List<ItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
    return this;
  }

  public SyncJobItem addAdditionalFilesItem(ItemFileInfo additionalFilesItem) {
    if (this.additionalFiles == null) {
      this.additionalFiles = new ArrayList<ItemFileInfo>();
    }
    this.additionalFiles.add(additionalFilesItem);
    return this;
  }

   /**
   * Get additionalFiles
   * @return additionalFiles
  **/
  @Schema(description = "")
  public List<ItemFileInfo> getAdditionalFiles() {
    return additionalFiles;
  }

  public void setAdditionalFiles(List<ItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncJobItem syncJobItem = (SyncJobItem) o;
    return Objects.equals(this.id, syncJobItem.id) &&
        Objects.equals(this.jobId, syncJobItem.jobId) &&
        Objects.equals(this.itemId, syncJobItem.itemId) &&
        Objects.equals(this.itemName, syncJobItem.itemName) &&
        Objects.equals(this.mediaSourceId, syncJobItem.mediaSourceId) &&
        Objects.equals(this.mediaSource, syncJobItem.mediaSource) &&
        Objects.equals(this.targetId, syncJobItem.targetId) &&
        Objects.equals(this.internalTargetId, syncJobItem.internalTargetId) &&
        Objects.equals(this.outputPath, syncJobItem.outputPath) &&
        Objects.equals(this.status, syncJobItem.status) &&
        Objects.equals(this.progress, syncJobItem.progress) &&
        Objects.equals(this.dateCreated, syncJobItem.dateCreated) &&
        Objects.equals(this.primaryImageItemId, syncJobItem.primaryImageItemId) &&
        Objects.equals(this.primaryImageTag, syncJobItem.primaryImageTag) &&
        Objects.equals(this.temporaryPath, syncJobItem.temporaryPath) &&
        Objects.equals(this.additionalFiles, syncJobItem.additionalFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, itemId, itemName, mediaSourceId, mediaSource, targetId, internalTargetId, outputPath, status, progress, dateCreated, primaryImageItemId, primaryImageTag, temporaryPath, additionalFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    internalTargetId: ").append(toIndentedString(internalTargetId)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    primaryImageItemId: ").append(toIndentedString(primaryImageItemId)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    temporaryPath: ").append(toIndentedString(temporaryPath)).append("\n");
    sb.append("    additionalFiles: ").append(toIndentedString(additionalFiles)).append("\n");
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
