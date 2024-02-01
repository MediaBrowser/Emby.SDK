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
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.ItemFileInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SyncedItem
 */


public class SyncedItem {
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
  private List<ItemFileInfo> additionalFiles = null;

  public SyncedItem serverId(String serverId) {
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

  public SyncedItem syncJobId(Long syncJobId) {
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

  public SyncedItem syncJobName(String syncJobName) {
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

  public SyncedItem syncJobDateCreated(OffsetDateTime syncJobDateCreated) {
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

  public SyncedItem syncJobItemId(Long syncJobItemId) {
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

  public SyncedItem originalFileName(String originalFileName) {
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

  public SyncedItem item(BaseItemDto item) {
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

  public SyncedItem userId(String userId) {
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

  public SyncedItem additionalFiles(List<ItemFileInfo> additionalFiles) {
    this.additionalFiles = additionalFiles;
    return this;
  }

  public SyncedItem addAdditionalFilesItem(ItemFileInfo additionalFilesItem) {
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
    SyncedItem syncedItem = (SyncedItem) o;
    return Objects.equals(this.serverId, syncedItem.serverId) &&
        Objects.equals(this.syncJobId, syncedItem.syncJobId) &&
        Objects.equals(this.syncJobName, syncedItem.syncJobName) &&
        Objects.equals(this.syncJobDateCreated, syncedItem.syncJobDateCreated) &&
        Objects.equals(this.syncJobItemId, syncedItem.syncJobItemId) &&
        Objects.equals(this.originalFileName, syncedItem.originalFileName) &&
        Objects.equals(this.item, syncedItem.item) &&
        Objects.equals(this.userId, syncedItem.userId) &&
        Objects.equals(this.additionalFiles, syncedItem.additionalFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverId, syncJobId, syncJobName, syncJobDateCreated, syncJobItemId, originalFileName, item, userId, additionalFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncedItem {\n");
    
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
