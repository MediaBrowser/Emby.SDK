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
 * SyncDataResponse
 */


public class SyncDataResponse {
  @SerializedName("ItemIdsToRemove")
  private List<String> itemIdsToRemove = null;

  public SyncDataResponse itemIdsToRemove(List<String> itemIdsToRemove) {
    this.itemIdsToRemove = itemIdsToRemove;
    return this;
  }

  public SyncDataResponse addItemIdsToRemoveItem(String itemIdsToRemoveItem) {
    if (this.itemIdsToRemove == null) {
      this.itemIdsToRemove = new ArrayList<String>();
    }
    this.itemIdsToRemove.add(itemIdsToRemoveItem);
    return this;
  }

   /**
   * Get itemIdsToRemove
   * @return itemIdsToRemove
  **/
  @Schema(description = "")
  public List<String> getItemIdsToRemove() {
    return itemIdsToRemove;
  }

  public void setItemIdsToRemove(List<String> itemIdsToRemove) {
    this.itemIdsToRemove = itemIdsToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncDataResponse syncDataResponse = (SyncDataResponse) o;
    return Objects.equals(this.itemIdsToRemove, syncDataResponse.itemIdsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIdsToRemove);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncDataResponse {\n");
    
    sb.append("    itemIdsToRemove: ").append(toIndentedString(itemIdsToRemove)).append("\n");
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
