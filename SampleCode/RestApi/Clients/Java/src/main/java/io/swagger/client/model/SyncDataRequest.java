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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SyncDataRequest
 */


public class SyncDataRequest {
  @SerializedName("LocalItemIds")
  private List<String> localItemIds = null;

  @SerializedName("InternalTargetIds")
  private List<Long> internalTargetIds = null;

  public SyncDataRequest localItemIds(List<String> localItemIds) {
    this.localItemIds = localItemIds;
    return this;
  }

  public SyncDataRequest addLocalItemIdsItem(String localItemIdsItem) {
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

  public SyncDataRequest internalTargetIds(List<Long> internalTargetIds) {
    this.internalTargetIds = internalTargetIds;
    return this;
  }

  public SyncDataRequest addInternalTargetIdsItem(Long internalTargetIdsItem) {
    if (this.internalTargetIds == null) {
      this.internalTargetIds = new ArrayList<Long>();
    }
    this.internalTargetIds.add(internalTargetIdsItem);
    return this;
  }

   /**
   * Get internalTargetIds
   * @return internalTargetIds
  **/
  @Schema(description = "")
  public List<Long> getInternalTargetIds() {
    return internalTargetIds;
  }

  public void setInternalTargetIds(List<Long> internalTargetIds) {
    this.internalTargetIds = internalTargetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncDataRequest syncDataRequest = (SyncDataRequest) o;
    return Objects.equals(this.localItemIds, syncDataRequest.localItemIds) &&
        Objects.equals(this.internalTargetIds, syncDataRequest.internalTargetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localItemIds, internalTargetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncDataRequest {\n");
    
    sb.append("    localItemIds: ").append(toIndentedString(localItemIds)).append("\n");
    sb.append("    internalTargetIds: ").append(toIndentedString(internalTargetIds)).append("\n");
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
