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
/**
 * ApiSetChannelSortIndex
 */


public class ApiSetChannelSortIndex {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ManagementId")
  private String managementId = null;

  @SerializedName("NewIndex")
  private Integer newIndex = null;

  public ApiSetChannelSortIndex id(String id) {
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

  public ApiSetChannelSortIndex managementId(String managementId) {
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

  public ApiSetChannelSortIndex newIndex(Integer newIndex) {
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
    ApiSetChannelSortIndex apiSetChannelSortIndex = (ApiSetChannelSortIndex) o;
    return Objects.equals(this.id, apiSetChannelSortIndex.id) &&
        Objects.equals(this.managementId, apiSetChannelSortIndex.managementId) &&
        Objects.equals(this.newIndex, apiSetChannelSortIndex.newIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementId, newIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSetChannelSortIndex {\n");
    
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
