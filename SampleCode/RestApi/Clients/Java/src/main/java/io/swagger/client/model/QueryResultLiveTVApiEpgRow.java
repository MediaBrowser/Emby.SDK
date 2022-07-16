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
import io.swagger.client.model.LiveTVApiEpgRow;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultLiveTVApiEpgRow
 */


public class QueryResultLiveTVApiEpgRow {
  @SerializedName("Items")
  private List<LiveTVApiEpgRow> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultLiveTVApiEpgRow items(List<LiveTVApiEpgRow> items) {
    this.items = items;
    return this;
  }

  public QueryResultLiveTVApiEpgRow addItemsItem(LiveTVApiEpgRow itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<LiveTVApiEpgRow>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<LiveTVApiEpgRow> getItems() {
    return items;
  }

  public void setItems(List<LiveTVApiEpgRow> items) {
    this.items = items;
  }

  public QueryResultLiveTVApiEpgRow totalRecordCount(Integer totalRecordCount) {
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
    QueryResultLiveTVApiEpgRow queryResultLiveTVApiEpgRow = (QueryResultLiveTVApiEpgRow) o;
    return Objects.equals(this.items, queryResultLiveTVApiEpgRow.items) &&
        Objects.equals(this.totalRecordCount, queryResultLiveTVApiEpgRow.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultLiveTVApiEpgRow {\n");
    
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
