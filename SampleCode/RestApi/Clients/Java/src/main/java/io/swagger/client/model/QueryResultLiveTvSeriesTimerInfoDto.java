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
import io.swagger.client.model.LiveTvSeriesTimerInfoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultLiveTvSeriesTimerInfoDto
 */


public class QueryResultLiveTvSeriesTimerInfoDto {
  @SerializedName("Items")
  private List<LiveTvSeriesTimerInfoDto> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultLiveTvSeriesTimerInfoDto items(List<LiveTvSeriesTimerInfoDto> items) {
    this.items = items;
    return this;
  }

  public QueryResultLiveTvSeriesTimerInfoDto addItemsItem(LiveTvSeriesTimerInfoDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<LiveTvSeriesTimerInfoDto>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<LiveTvSeriesTimerInfoDto> getItems() {
    return items;
  }

  public void setItems(List<LiveTvSeriesTimerInfoDto> items) {
    this.items = items;
  }

  public QueryResultLiveTvSeriesTimerInfoDto totalRecordCount(Integer totalRecordCount) {
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
    QueryResultLiveTvSeriesTimerInfoDto queryResultLiveTvSeriesTimerInfoDto = (QueryResultLiveTvSeriesTimerInfoDto) o;
    return Objects.equals(this.items, queryResultLiveTvSeriesTimerInfoDto.items) &&
        Objects.equals(this.totalRecordCount, queryResultLiveTvSeriesTimerInfoDto.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultLiveTvSeriesTimerInfoDto {\n");
    
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
