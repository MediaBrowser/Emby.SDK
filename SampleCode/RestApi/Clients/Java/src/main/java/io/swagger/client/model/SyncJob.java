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
import io.swagger.client.model.SyncCategory;
import io.swagger.client.model.SyncJobStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncJob
 */


public class SyncJob {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("TargetId")
  private String targetId = null;

  @SerializedName("InternalTargetId")
  private Long internalTargetId = null;

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
  private SyncCategory category = null;

  @SerializedName("ParentId")
  private Long parentId = null;

  @SerializedName("Progress")
  private Double progress = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Status")
  private SyncJobStatus status = null;

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

  @SerializedName("ItemId")
  private Long itemId = null;

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

  public SyncJob id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier.
   * @return id
  **/
  @Schema(description = "The identifier.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SyncJob targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * The device identifier.
   * @return targetId
  **/
  @Schema(description = "The device identifier.")
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public SyncJob internalTargetId(Long internalTargetId) {
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

  public SyncJob targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

   /**
   * The name of the target.
   * @return targetName
  **/
  @Schema(description = "The name of the target.")
  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  public SyncJob quality(String quality) {
    this.quality = quality;
    return this;
  }

   /**
   * The quality.
   * @return quality
  **/
  @Schema(description = "The quality.")
  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }

  public SyncJob bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * The bitrate.
   * @return bitrate
  **/
  @Schema(description = "The bitrate.")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public SyncJob container(String container) {
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

  public SyncJob videoCodec(String videoCodec) {
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

  public SyncJob audioCodec(String audioCodec) {
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

  public SyncJob profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * The profile.
   * @return profile
  **/
  @Schema(description = "The profile.")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public SyncJob category(SyncCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public SyncCategory getCategory() {
    return category;
  }

  public void setCategory(SyncCategory category) {
    this.category = category;
  }

  public SyncJob parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The parent identifier.
   * @return parentId
  **/
  @Schema(description = "The parent identifier.")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public SyncJob progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The current progress.
   * @return progress
  **/
  @Schema(description = "The current progress.")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public SyncJob name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyncJob status(SyncJobStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SyncJobStatus getStatus() {
    return status;
  }

  public void setStatus(SyncJobStatus status) {
    this.status = status;
  }

  public SyncJob userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user identifier.
   * @return userId
  **/
  @Schema(description = "The user identifier.")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public SyncJob unwatchedOnly(Boolean unwatchedOnly) {
    this.unwatchedOnly = unwatchedOnly;
    return this;
  }

   /**
   * A value indicating whether \\[unwatched only\\].
   * @return unwatchedOnly
  **/
  @Schema(description = "A value indicating whether \\[unwatched only\\].")
  public Boolean isUnwatchedOnly() {
    return unwatchedOnly;
  }

  public void setUnwatchedOnly(Boolean unwatchedOnly) {
    this.unwatchedOnly = unwatchedOnly;
  }

  public SyncJob syncNewContent(Boolean syncNewContent) {
    this.syncNewContent = syncNewContent;
    return this;
  }

   /**
   * A value indicating whether \\[synchronize new content\\].
   * @return syncNewContent
  **/
  @Schema(description = "A value indicating whether \\[synchronize new content\\].")
  public Boolean isSyncNewContent() {
    return syncNewContent;
  }

  public void setSyncNewContent(Boolean syncNewContent) {
    this.syncNewContent = syncNewContent;
  }

  public SyncJob itemLimit(Integer itemLimit) {
    this.itemLimit = itemLimit;
    return this;
  }

   /**
   * The item limit.
   * @return itemLimit
  **/
  @Schema(description = "The item limit.")
  public Integer getItemLimit() {
    return itemLimit;
  }

  public void setItemLimit(Integer itemLimit) {
    this.itemLimit = itemLimit;
  }

  public SyncJob requestedItemIds(List<Long> requestedItemIds) {
    this.requestedItemIds = requestedItemIds;
    return this;
  }

  public SyncJob addRequestedItemIdsItem(Long requestedItemIdsItem) {
    if (this.requestedItemIds == null) {
      this.requestedItemIds = new ArrayList<Long>();
    }
    this.requestedItemIds.add(requestedItemIdsItem);
    return this;
  }

   /**
   * The requested item ids.
   * @return requestedItemIds
  **/
  @Schema(description = "The requested item ids.")
  public List<Long> getRequestedItemIds() {
    return requestedItemIds;
  }

  public void setRequestedItemIds(List<Long> requestedItemIds) {
    this.requestedItemIds = requestedItemIds;
  }

  public SyncJob itemId(Long itemId) {
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

  public SyncJob dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date created.
   * @return dateCreated
  **/
  @Schema(description = "The date created.")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public SyncJob dateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
    return this;
  }

   /**
   * The date last modified.
   * @return dateLastModified
  **/
  @Schema(description = "The date last modified.")
  public OffsetDateTime getDateLastModified() {
    return dateLastModified;
  }

  public void setDateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
  }

  public SyncJob itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The item count.
   * @return itemCount
  **/
  @Schema(description = "The item count.")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public SyncJob parentName(String parentName) {
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

  public SyncJob primaryImageItemId(String primaryImageItemId) {
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

  public SyncJob primaryImageTag(String primaryImageTag) {
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
    SyncJob syncJob = (SyncJob) o;
    return Objects.equals(this.id, syncJob.id) &&
        Objects.equals(this.targetId, syncJob.targetId) &&
        Objects.equals(this.internalTargetId, syncJob.internalTargetId) &&
        Objects.equals(this.targetName, syncJob.targetName) &&
        Objects.equals(this.quality, syncJob.quality) &&
        Objects.equals(this.bitrate, syncJob.bitrate) &&
        Objects.equals(this.container, syncJob.container) &&
        Objects.equals(this.videoCodec, syncJob.videoCodec) &&
        Objects.equals(this.audioCodec, syncJob.audioCodec) &&
        Objects.equals(this.profile, syncJob.profile) &&
        Objects.equals(this.category, syncJob.category) &&
        Objects.equals(this.parentId, syncJob.parentId) &&
        Objects.equals(this.progress, syncJob.progress) &&
        Objects.equals(this.name, syncJob.name) &&
        Objects.equals(this.status, syncJob.status) &&
        Objects.equals(this.userId, syncJob.userId) &&
        Objects.equals(this.unwatchedOnly, syncJob.unwatchedOnly) &&
        Objects.equals(this.syncNewContent, syncJob.syncNewContent) &&
        Objects.equals(this.itemLimit, syncJob.itemLimit) &&
        Objects.equals(this.requestedItemIds, syncJob.requestedItemIds) &&
        Objects.equals(this.itemId, syncJob.itemId) &&
        Objects.equals(this.dateCreated, syncJob.dateCreated) &&
        Objects.equals(this.dateLastModified, syncJob.dateLastModified) &&
        Objects.equals(this.itemCount, syncJob.itemCount) &&
        Objects.equals(this.parentName, syncJob.parentName) &&
        Objects.equals(this.primaryImageItemId, syncJob.primaryImageItemId) &&
        Objects.equals(this.primaryImageTag, syncJob.primaryImageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetId, internalTargetId, targetName, quality, bitrate, container, videoCodec, audioCodec, profile, category, parentId, progress, name, status, userId, unwatchedOnly, syncNewContent, itemLimit, requestedItemIds, itemId, dateCreated, dateLastModified, itemCount, parentName, primaryImageItemId, primaryImageTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    internalTargetId: ").append(toIndentedString(internalTargetId)).append("\n");
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
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
