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
import io.swagger.client.model.DevicesDeviceInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultDevicesDeviceInfo
 */


public class QueryResultDevicesDeviceInfo {
  @SerializedName("Items")
  private List<DevicesDeviceInfo> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultDevicesDeviceInfo items(List<DevicesDeviceInfo> items) {
    this.items = items;
    return this;
  }

  public QueryResultDevicesDeviceInfo addItemsItem(DevicesDeviceInfo itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<DevicesDeviceInfo>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<DevicesDeviceInfo> getItems() {
    return items;
  }

  public void setItems(List<DevicesDeviceInfo> items) {
    this.items = items;
  }

  public QueryResultDevicesDeviceInfo totalRecordCount(Integer totalRecordCount) {
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
    QueryResultDevicesDeviceInfo queryResultDevicesDeviceInfo = (QueryResultDevicesDeviceInfo) o;
    return Objects.equals(this.items, queryResultDevicesDeviceInfo.items) &&
        Objects.equals(this.totalRecordCount, queryResultDevicesDeviceInfo.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultDevicesDeviceInfo {\n");
    
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
