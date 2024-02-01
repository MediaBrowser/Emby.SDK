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
import io.swagger.client.model.ChannelManagementInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultChannelManagementInfo
 */


public class QueryResultChannelManagementInfo {
  @SerializedName("Items")
  private List<ChannelManagementInfo> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultChannelManagementInfo items(List<ChannelManagementInfo> items) {
    this.items = items;
    return this;
  }

  public QueryResultChannelManagementInfo addItemsItem(ChannelManagementInfo itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ChannelManagementInfo>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<ChannelManagementInfo> getItems() {
    return items;
  }

  public void setItems(List<ChannelManagementInfo> items) {
    this.items = items;
  }

  public QueryResultChannelManagementInfo totalRecordCount(Integer totalRecordCount) {
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
    QueryResultChannelManagementInfo queryResultChannelManagementInfo = (QueryResultChannelManagementInfo) o;
    return Objects.equals(this.items, queryResultChannelManagementInfo.items) &&
        Objects.equals(this.totalRecordCount, queryResultChannelManagementInfo.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultChannelManagementInfo {\n");
    
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
