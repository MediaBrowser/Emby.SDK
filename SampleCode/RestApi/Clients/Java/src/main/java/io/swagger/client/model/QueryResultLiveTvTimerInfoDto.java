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
import io.swagger.client.model.LiveTvTimerInfoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultLiveTvTimerInfoDto
 */


public class QueryResultLiveTvTimerInfoDto {
  @SerializedName("Items")
  private List<LiveTvTimerInfoDto> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultLiveTvTimerInfoDto items(List<LiveTvTimerInfoDto> items) {
    this.items = items;
    return this;
  }

  public QueryResultLiveTvTimerInfoDto addItemsItem(LiveTvTimerInfoDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<LiveTvTimerInfoDto>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<LiveTvTimerInfoDto> getItems() {
    return items;
  }

  public void setItems(List<LiveTvTimerInfoDto> items) {
    this.items = items;
  }

  public QueryResultLiveTvTimerInfoDto totalRecordCount(Integer totalRecordCount) {
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
    QueryResultLiveTvTimerInfoDto queryResultLiveTvTimerInfoDto = (QueryResultLiveTvTimerInfoDto) o;
    return Objects.equals(this.items, queryResultLiveTvTimerInfoDto.items) &&
        Objects.equals(this.totalRecordCount, queryResultLiveTvTimerInfoDto.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultLiveTvTimerInfoDto {\n");
    
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
