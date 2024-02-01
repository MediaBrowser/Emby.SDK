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
import io.swagger.client.model.UserLibraryOfficialRatingItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultUserLibraryOfficialRatingItem
 */


public class QueryResultUserLibraryOfficialRatingItem {
  @SerializedName("Items")
  private List<UserLibraryOfficialRatingItem> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultUserLibraryOfficialRatingItem items(List<UserLibraryOfficialRatingItem> items) {
    this.items = items;
    return this;
  }

  public QueryResultUserLibraryOfficialRatingItem addItemsItem(UserLibraryOfficialRatingItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<UserLibraryOfficialRatingItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<UserLibraryOfficialRatingItem> getItems() {
    return items;
  }

  public void setItems(List<UserLibraryOfficialRatingItem> items) {
    this.items = items;
  }

  public QueryResultUserLibraryOfficialRatingItem totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * Get totalRecordCount
   * @return totalRecordCount
  **/
  @Schema(description = "")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResultUserLibraryOfficialRatingItem queryResultUserLibraryOfficialRatingItem = (QueryResultUserLibraryOfficialRatingItem) o;
    return Objects.equals(this.items, queryResultUserLibraryOfficialRatingItem.items) &&
        Objects.equals(this.totalRecordCount, queryResultUserLibraryOfficialRatingItem.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultUserLibraryOfficialRatingItem {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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
