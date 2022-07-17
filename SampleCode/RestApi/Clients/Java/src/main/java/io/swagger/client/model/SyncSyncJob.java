/*
 * Emby REST API
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
import io.swagger.client.model.SyncSyncCategory;
import io.swagger.client.model.SyncSyncJobStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncSyncJob
 */


public class SyncSyncJob {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("TargetId")
  private String targetId = null;

  @SerializedName("TargetName")
  private String targetName = null;

  @SerializedName("Quality")
  private String quality = null;

  @SerializedName("Bitrate")
  private Integer bitrate = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("Profile")
  private String profile = null;

  @SerializedName("Category")
  private SyncSyncCategory category = null;

  @SerializedName("ParentId")
  private Long parentId = null;

  @SerializedName("Progress")
  private Double progress = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Status")
  private SyncSyncJobStatus status = null;

  @SerializedName("UserId")
  private Long userId = null;

  @SerializedName("UnwatchedOnly")
  private Boolean unwatchedOnly = null;

  @SerializedName("SyncNewContent")
  private Boolean syncNewContent = null;

  @SerializedName("ItemLimit")
  private Integer itemLimit = null;

  @SerializedName("RequestedItemIds")
  private List<Long> requestedItemIds = null;

  @SerializedName("DateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("DateLastModified")
  private OffsetDateTime dateLastModified = null;

  @SerializedName("ItemCount")
  private Integer itemCount = null;

  @SerializedName("ParentName")
  private String parentName = null;

  @SerializedName("PrimaryImageItemId")
  private String primaryImageItemId = null;

  @SerializedName("PrimaryImageTag")
  private String primaryImageTag = null;

  public SyncSyncJob id(Long id) {
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

  public SyncSyncJob targetId(String targetId) {
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

  public SyncSyncJob targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

   /**
   * Get targetName
   * @return targetName
  **/
  @Schema(description = "")
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  public SyncSyncJob quality(String quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @Schema(description = "")
  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }

  public SyncSyncJob bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * Get bitrate
   * @return bitrate
  **/
  @Schema(description = "")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public SyncSyncJob container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public SyncSyncJob videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * Get videoCodec
   * @return videoCodec
  **/
  @Schema(description = "")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public SyncSyncJob audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * Get audioCodec
   * @return audioCodec
  **/
  @Schema(description = "")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public SyncSyncJob profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public SyncSyncJob category(SyncSyncCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public SyncSyncCategory getCategory() {
    return category;
  }

  public void setCategory(SyncSyncCategory category) {
    this.category = category;
  }

  public SyncSyncJob parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public SyncSyncJob progress(Double progress) {
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

  public SyncSyncJob name(String name) {
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

  public SyncSyncJob status(SyncSyncJobStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SyncSyncJobStatus getStatus() {
    return status;
  }

  public void setStatus(SyncSyncJobStatus status) {
    this.status = status;
  }

  public SyncSyncJob userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public SyncSyncJob unwatchedOnly(Boolean unwatchedOnly) {
    this.unwatchedOnly = unwatchedOnly;
    return this;
  }

   /**
   * Get unwatchedOnly
   * @return unwatchedOnly
  **/
  @Schema(description = "")
  public Boolean isUnwatchedOnly() {
    return unwatchedOnly;
  }

  public void setUnwatchedOnly(Boolean unwatchedOnly) {
    this.unwatchedOnly = unwatchedOnly;
  }

  public SyncSyncJob syncNewContent(Boolean syncNewContent) {
    this.syncNewContent = syncNewContent;
    return this;
  }

   /**
   * Get syncNewContent
   * @return syncNewContent
  **/
  @Schema(description = "")
  public Boolean isSyncNewContent() {
    return syncNewContent;
  }

  public void setSyncNewContent(Boolean syncNewContent) {
    this.syncNewContent = syncNewContent;
  }

  public SyncSyncJob itemLimit(Integer itemLimit) {
    this.itemLimit = itemLimit;
    return this;
  }

   /**
   * Get itemLimit
   * @return itemLimit
  **/
  @Schema(description = "")
  public Integer getItemLimit() {
    return itemLimit;
  }

  public void setItemLimit(Integer itemLimit) {
    this.itemLimit = itemLimit;
  }

  public SyncSyncJob requestedItemIds(List<Long> requestedItemIds) {
    this.requestedItemIds = requestedItemIds;
    return this;
  }

  public SyncSyncJob addRequestedItemIdsItem(Long requestedItemIdsItem) {
    if (this.requestedItemIds == null) {
      this.requestedItemIds = new ArrayList<Long>();
    }
    this.requestedItemIds.add(requestedItemIdsItem);
    return this;
  }

   /**
   * Get requestedItemIds
   * @return requestedItemIds
  **/
  @Schema(description = "")
  public List<Long> getRequestedItemIds() {
    return requestedItemIds;
  }

  public void setRequestedItemIds(List<Long> requestedItemIds) {
    this.requestedItemIds = requestedItemIds;
  }

  public SyncSyncJob dateCreated(OffsetDateTime dateCreated) {
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

  public SyncSyncJob dateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
    return this;
  }

   /**
   * Get dateLastModified
   * @return dateLastModified
  **/
  @Schema(description = "")
  public OffsetDateTime getDateLastModified() {
    return dateLastModified;
  }

  public void setDateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
  }

  public SyncSyncJob itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @Schema(description = "")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public SyncSyncJob parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Get parentName
   * @return parentName
  **/
  @Schema(description = "")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public SyncSyncJob primaryImageItemId(String primaryImageItemId) {
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

  public SyncSyncJob primaryImageTag(String primaryImageTag) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncSyncJob syncSyncJob = (SyncSyncJob) o;
    return Objects.equals(this.id, syncSyncJob.id) &&
        Objects.equals(this.targetId, syncSyncJob.targetId) &&
        Objects.equals(this.targetName, syncSyncJob.targetName) &&
        Objects.equals(this.quality, syncSyncJob.quality) &&
        Objects.equals(this.bitrate, syncSyncJob.bitrate) &&
        Objects.equals(this.container, syncSyncJob.container) &&
        Objects.equals(this.videoCodec, syncSyncJob.videoCodec) &&
        Objects.equals(this.audioCodec, syncSyncJob.audioCodec) &&
        Objects.equals(this.profile, syncSyncJob.profile) &&
        Objects.equals(this.category, syncSyncJob.category) &&
        Objects.equals(this.parentId, syncSyncJob.parentId) &&
        Objects.equals(this.progress, syncSyncJob.progress) &&
        Objects.equals(this.name, syncSyncJob.name) &&
        Objects.equals(this.status, syncSyncJob.status) &&
        Objects.equals(this.userId, syncSyncJob.userId) &&
        Objects.equals(this.unwatchedOnly, syncSyncJob.unwatchedOnly) &&
        Objects.equals(this.syncNewContent, syncSyncJob.syncNewContent) &&
        Objects.equals(this.itemLimit, syncSyncJob.itemLimit) &&
        Objects.equals(this.requestedItemIds, syncSyncJob.requestedItemIds) &&
        Objects.equals(this.dateCreated, syncSyncJob.dateCreated) &&
        Objects.equals(this.dateLastModified, syncSyncJob.dateLastModified) &&
        Objects.equals(this.itemCount, syncSyncJob.itemCount) &&
        Objects.equals(this.parentName, syncSyncJob.parentName) &&
        Objects.equals(this.primaryImageItemId, syncSyncJob.primaryImageItemId) &&
        Objects.equals(this.primaryImageTag, syncSyncJob.primaryImageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetId, targetName, quality, bitrate, container, videoCodec, audioCodec, profile, category, parentId, progress, name, status, userId, unwatchedOnly, syncNewContent, itemLimit, requestedItemIds, dateCreated, dateLastModified, itemCount, parentName, primaryImageItemId, primaryImageTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncSyncJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    unwatchedOnly: ").append(toIndentedString(unwatchedOnly)).append("\n");
    sb.append("    syncNewContent: ").append(toIndentedString(syncNewContent)).append("\n");
    sb.append("    itemLimit: ").append(toIndentedString(itemLimit)).append("\n");
    sb.append("    requestedItemIds: ").append(toIndentedString(requestedItemIds)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateLastModified: ").append(toIndentedString(dateLastModified)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    primaryImageItemId: ").append(toIndentedString(primaryImageItemId)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
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
