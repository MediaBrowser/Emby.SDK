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
import io.swagger.client.model.ApiEpgRow;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultApiEpgRow
 */


public class QueryResultApiEpgRow {
  @SerializedName("Items")
  private List<ApiEpgRow> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultApiEpgRow items(List<ApiEpgRow> items) {
    this.items = items;
    return this;
  }

  public QueryResultApiEpgRow addItemsItem(ApiEpgRow itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ApiEpgRow>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<ApiEpgRow> getItems() {
    return items;
  }

  public void setItems(List<ApiEpgRow> items) {
    this.items = items;
  }

  public QueryResultApiEpgRow totalRecordCount(Integer totalRecordCount) {
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
    QueryResultApiEpgRow queryResultApiEpgRow = (QueryResultApiEpgRow) o;
    return Objects.equals(this.items, queryResultApiEpgRow.items) &&
        Objects.equals(this.totalRecordCount, queryResultApiEpgRow.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultApiEpgRow {\n");
    
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
