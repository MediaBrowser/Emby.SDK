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
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.SyncModelItemFileInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncModelSyncedItem
 */


public class SyncModelSyncedItem {
  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("SyncJobId")
  private Long syncJobId = null;

  @SerializedName("SyncJobName")
  private String syncJobName = null;

  @SerializedName("SyncJobDateCreated")
  private OffsetDateTime syncJobDateCreated = null;

  @SerializedName("SyncJobItemId")
  private Long syncJobItemId = null;

  @SerializedName("OriginalFileName")
  private String originalFileName = null;

  @SerializedName("Item")
  private BaseItemDto item = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("AdditionalFiles")
  private List<SyncModelItemFileInfo> additionalFiles = null;

  public SyncModelSyncedItem serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public SyncModelSyncedItem syncJobId(Long syncJobId) {
    this.syncJobId = syncJobId;
    return this;
  }

   /**
   * Get syncJobId
   * @return syncJobId
  **/
  @Schema(description = "")
  public Long getSyncJobId() {
    return syncJobId;
  }

  public void setSyncJobId(Long syncJobId) {
    this.syncJobId = syncJobId;
  }

  public SyncModelSyncedItem syncJobName(String syncJobName) {
    this.syncJobName = syncJobName;
    return this;
  }

   /**
   * Get syncJobName
   * @return syncJobName
  **/
  @Schema(description = "")
  public String getSyncJobName() {
    return syncJobName;
  }

  public void setSyncJobName(String syncJobName) {
    this.syncJobName = syncJobName;
  }

  public SyncModelSyncedItem syncJobDateCreated(OffsetDateTime syncJobDateCreated) {
    this.syncJobDateCreated = syncJobDateCreated;
    return this;
  }

   /**
   * Get syncJobDateCreated
   * @return syncJobDateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getSyncJobDateCreated() {
    return syncJobDateCreated;
  }

  public void setSyncJobDateCreated(OffsetDateTime syncJobDateCreated) {
    this.syncJobDateCreated = syncJobDateCreated;
  }

  public SyncModelSyncedItem syncJobItemId(Long syncJobItemId) {
    this.syncJobItemId = syncJobItemId;
    return this;
  }

   /**
   * Get syncJobItemId
   * @return syncJobItemId
  **/
  @Schema(description = "")
  public Long getSyncJobItemId() {
    return syncJobItemId;
  }

  public void setSyncJobItemId(Long syncJobItemId) {
    this.syncJobItemId = syncJobItemId;
  }

  public SyncModelSyncedItem originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

   /**
   * Get originalFileName
   * @return originalFileName
  **/
  @Schema(description = "")
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public SyncModelSyncedItem item(BaseItemDto item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @Schema(description = "")
  public BaseItemDto getItem() {
    return item;
  }

  public void setItem(BaseItemDto item) {
    this.item = item;
  }

  public SyncModelSyncedItem userId(String userId) {
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

  public SyncModelSyncedItem additionalFiles(List<SyncModelItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
    return this;
  }

  public SyncModelSyncedItem addAdditionalFilesItem(SyncModelItemFileInfo additionalFilesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncedItem syncModelSyncedItem = (SyncModelSyncedItem) o;
    return Objects.equals(this.serverId, syncModelSyncedItem.serverId) &&
        Objects.equals(this.syncJobId, syncModelSyncedItem.syncJobId) &&
        Objects.equals(this.syncJobName, syncModelSyncedItem.syncJobName) &&
        Objects.equals(this.syncJobDateCreated, syncModelSyncedItem.syncJobDateCreated) &&
        Objects.equals(this.syncJobItemId, syncModelSyncedItem.syncJobItemId) &&
        Objects.equals(this.originalFileName, syncModelSyncedItem.originalFileName) &&
        Objects.equals(this.item, syncModelSyncedItem.item) &&
        Objects.equals(this.userId, syncModelSyncedItem.userId) &&
        Objects.equals(this.additionalFiles, syncModelSyncedItem.additionalFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverId, syncJobId, syncJobName, syncJobDateCreated, syncJobItemId, originalFileName, item, userId, additionalFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncedItem {\n");
    
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    syncJobId: ").append(toIndentedString(syncJobId)).append("\n");
    sb.append("    syncJobName: ").append(toIndentedString(syncJobName)).append("\n");
    sb.append("    syncJobDateCreated: ").append(toIndentedString(syncJobDateCreated)).append("\n");
    sb.append("    syncJobItemId: ").append(toIndentedString(syncJobItemId)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
