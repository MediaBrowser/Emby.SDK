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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LiveTVApiSetChannelSortIndex
 */


public class LiveTVApiSetChannelSortIndex {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ManagementId")
  private String managementId = null;

  @SerializedName("NewIndex")
  private Integer newIndex = null;

  public LiveTVApiSetChannelSortIndex id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LiveTVApiSetChannelSortIndex managementId(String managementId) {
    this.managementId = managementId;
    return this;
  }

   /**
   * Get managementId
   * @return managementId
  **/
  @Schema(description = "")
  public String getManagementId() {
    return managementId;
  }

  public void setManagementId(String managementId) {
    this.managementId = managementId;
  }

  public LiveTVApiSetChannelSortIndex newIndex(Integer newIndex) {
    this.newIndex = newIndex;
    return this;
  }

   /**
   * Get newIndex
   * @return newIndex
  **/
  @Schema(description = "")
  public Integer getNewIndex() {
    return newIndex;
  }

  public void setNewIndex(Integer newIndex) {
    this.newIndex = newIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTVApiSetChannelSortIndex liveTVApiSetChannelSortIndex = (LiveTVApiSetChannelSortIndex) o;
    return Objects.equals(this.id, liveTVApiSetChannelSortIndex.id) &&
        Objects.equals(this.managementId, liveTVApiSetChannelSortIndex.managementId) &&
        Objects.equals(this.newIndex, liveTVApiSetChannelSortIndex.newIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementId, newIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTVApiSetChannelSortIndex {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementId: ").append(toIndentedString(managementId)).append("\n");
    sb.append("    newIndex: ").append(toIndentedString(newIndex)).append("\n");
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
