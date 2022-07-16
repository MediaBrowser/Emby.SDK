/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncModelSyncJobRequest
 */


public class SyncModelSyncJobRequest {
  @SerializedName("TargetId")
  private String targetId = null;

  @SerializedName("ItemIds")
  private List<String> itemIds = null;

  @SerializedName("Category")
  private SyncSyncCategory category = null;

  @SerializedName("ParentId")
  private String parentId = null;

  @SerializedName("Quality")
  private String quality = null;

  @SerializedName("Profile")
  private String profile = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("UnwatchedOnly")
  private Boolean unwatchedOnly = null;

  @SerializedName("SyncNewContent")
  private Boolean syncNewContent = null;

  @SerializedName("ItemLimit")
  private Integer itemLimit = null;

  @SerializedName("Bitrate")
  private Integer bitrate = null;

  @SerializedName("Downloaded")
  private Boolean downloaded = null;

  public SyncModelSyncJobRequest targetId(String targetId) {
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

  public SyncModelSyncJobRequest itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public SyncModelSyncJobRequest addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<String>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * Get itemIds
   * @return itemIds
  **/
  @Schema(description = "")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public SyncModelSyncJobRequest category(SyncSyncCategory category) {
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

  public SyncModelSyncJobRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public SyncModelSyncJobRequest quality(String quality) {
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

  public SyncModelSyncJobRequest profile(String profile) {
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

  public SyncModelSyncJobRequest container(String container) {
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

  public SyncModelSyncJobRequest videoCodec(String videoCodec) {
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

  public SyncModelSyncJobRequest audioCodec(String audioCodec) {
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

  public SyncModelSyncJobRequest name(String name) {
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

  public SyncModelSyncJobRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SyncModelSyncJobRequest unwatchedOnly(Boolean unwatchedOnly) {
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

  public SyncModelSyncJobRequest syncNewContent(Boolean syncNewContent) {
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

  public SyncModelSyncJobRequest itemLimit(Integer itemLimit) {
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

  public SyncModelSyncJobRequest bitrate(Integer bitrate) {
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

  public SyncModelSyncJobRequest downloaded(Boolean downloaded) {
    this.downloaded = downloaded;
    return this;
  }

   /**
   * Get downloaded
   * @return downloaded
  **/
  @Schema(description = "")
  public Boolean isDownloaded() {
    return downloaded;
  }

  public void setDownloaded(Boolean downloaded) {
    this.downloaded = downloaded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncJobRequest syncModelSyncJobRequest = (SyncModelSyncJobRequest) o;
    return Objects.equals(this.targetId, syncModelSyncJobRequest.targetId) &&
        Objects.equals(this.itemIds, syncModelSyncJobRequest.itemIds) &&
        Objects.equals(this.category, syncModelSyncJobRequest.category) &&
        Objects.equals(this.parentId, syncModelSyncJobRequest.parentId) &&
        Objects.equals(this.quality, syncModelSyncJobRequest.quality) &&
        Objects.equals(this.profile, syncModelSyncJobRequest.profile) &&
        Objects.equals(this.container, syncModelSyncJobRequest.container) &&
        Objects.equals(this.videoCodec, syncModelSyncJobRequest.videoCodec) &&
        Objects.equals(this.audioCodec, syncModelSyncJobRequest.audioCodec) &&
        Objects.equals(this.name, syncModelSyncJobRequest.name) &&
        Objects.equals(this.userId, syncModelSyncJobRequest.userId) &&
        Objects.equals(this.unwatchedOnly, syncModelSyncJobRequest.unwatchedOnly) &&
        Objects.equals(this.syncNewContent, syncModelSyncJobRequest.syncNewContent) &&
        Objects.equals(this.itemLimit, syncModelSyncJobRequest.itemLimit) &&
        Objects.equals(this.bitrate, syncModelSyncJobRequest.bitrate) &&
        Objects.equals(this.downloaded, syncModelSyncJobRequest.downloaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, itemIds, category, parentId, quality, profile, container, videoCodec, audioCodec, name, userId, unwatchedOnly, syncNewContent, itemLimit, bitrate, downloaded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncJobRequest {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    unwatchedOnly: ").append(toIndentedString(unwatchedOnly)).append("\n");
    sb.append("    syncNewContent: ").append(toIndentedString(syncNewContent)).append("\n");
    sb.append("    itemLimit: ").append(toIndentedString(itemLimit)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    downloaded: ").append(toIndentedString(downloaded)).append("\n");
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
