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
 * UserLibraryLeaveSharedItems
 */


public class UserLibraryLeaveSharedItems {
  @SerializedName("ItemIds")
  private List<String> itemIds = null;

  @SerializedName("UserId")
  private String userId = null;

  public UserLibraryLeaveSharedItems itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public UserLibraryLeaveSharedItems addItemIdsItem(String itemIdsItem) {
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

  public UserLibraryLeaveSharedItems userId(String userId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryLeaveSharedItems userLibraryLeaveSharedItems = (UserLibraryLeaveSharedItems) o;
    return Objects.equals(this.itemIds, userLibraryLeaveSharedItems.itemIds) &&
        Objects.equals(this.userId, userLibraryLeaveSharedItems.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryLeaveSharedItems {\n");
    
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
