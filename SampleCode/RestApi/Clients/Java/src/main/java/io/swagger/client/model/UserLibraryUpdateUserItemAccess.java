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
import io.swagger.client.model.UserItemShareLevel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UserLibraryUpdateUserItemAccess
 */


public class UserLibraryUpdateUserItemAccess {
  @SerializedName("ItemIds")
  private List<String> itemIds = null;

  @SerializedName("UserIds")
  private List<String> userIds = null;

  @SerializedName("ItemAccess")
  private UserItemShareLevel itemAccess = null;

  public UserLibraryUpdateUserItemAccess itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public UserLibraryUpdateUserItemAccess addItemIdsItem(String itemIdsItem) {
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

  public UserLibraryUpdateUserItemAccess userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public UserLibraryUpdateUserItemAccess addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<String>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @Schema(description = "")
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  public UserLibraryUpdateUserItemAccess itemAccess(UserItemShareLevel itemAccess) {
    this.itemAccess = itemAccess;
    return this;
  }

   /**
   * Get itemAccess
   * @return itemAccess
  **/
  @Schema(description = "")
  public UserItemShareLevel getItemAccess() {
    return itemAccess;
  }

  public void setItemAccess(UserItemShareLevel itemAccess) {
    this.itemAccess = itemAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryUpdateUserItemAccess userLibraryUpdateUserItemAccess = (UserLibraryUpdateUserItemAccess) o;
    return Objects.equals(this.itemIds, userLibraryUpdateUserItemAccess.itemIds) &&
        Objects.equals(this.userIds, userLibraryUpdateUserItemAccess.userIds) &&
        Objects.equals(this.itemAccess, userLibraryUpdateUserItemAccess.itemAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, userIds, itemAccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryUpdateUserItemAccess {\n");
    
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    itemAccess: ").append(toIndentedString(itemAccess)).append("\n");
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
