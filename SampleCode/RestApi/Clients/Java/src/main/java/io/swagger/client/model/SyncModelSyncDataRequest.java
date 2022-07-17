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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncModelSyncDataRequest
 */


public class SyncModelSyncDataRequest {
  @SerializedName("LocalItemIds")
  private List<String> localItemIds = null;

  @SerializedName("TargetId")
  private String targetId = null;

  public SyncModelSyncDataRequest localItemIds(List<String> localItemIds) {
    this.localItemIds = localItemIds;
    return this;
  }

  public SyncModelSyncDataRequest addLocalItemIdsItem(String localItemIdsItem) {
    if (this.localItemIds == null) {
      this.localItemIds = new ArrayList<String>();
    }
    this.localItemIds.add(localItemIdsItem);
    return this;
  }

   /**
   * Get localItemIds
   * @return localItemIds
  **/
  @Schema(description = "")
  public List<String> getLocalItemIds() {
    return localItemIds;
  }

  public void setLocalItemIds(List<String> localItemIds) {
    this.localItemIds = localItemIds;
  }

  public SyncModelSyncDataRequest targetId(String targetId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncModelSyncDataRequest syncModelSyncDataRequest = (SyncModelSyncDataRequest) o;
    return Objects.equals(this.localItemIds, syncModelSyncDataRequest.localItemIds) &&
        Objects.equals(this.targetId, syncModelSyncDataRequest.targetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localItemIds, targetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncModelSyncDataRequest {\n");
    
    sb.append("    localItemIds: ").append(toIndentedString(localItemIds)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
