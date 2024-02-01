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
import io.swagger.client.model.BaseItemDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class ThemeMediaResult  
 */
@Schema(description = "Class ThemeMediaResult  ")

public class ThemeMediaResult {
  @SerializedName("OwnerId")
  private Long ownerId = null;

  @SerializedName("Items")
  private List<BaseItemDto> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public ThemeMediaResult ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The owner id.
   * @return ownerId
  **/
  @Schema(description = "The owner id.")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ThemeMediaResult items(List<BaseItemDto> items) {
    this.items = items;
    return this;
  }

  public ThemeMediaResult addItemsItem(BaseItemDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BaseItemDto>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<BaseItemDto> getItems() {
    return items;
  }

  public void setItems(List<BaseItemDto> items) {
    this.items = items;
  }

  public ThemeMediaResult totalRecordCount(Integer totalRecordCount) {
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
    ThemeMediaResult themeMediaResult = (ThemeMediaResult) o;
    return Objects.equals(this.ownerId, themeMediaResult.ownerId) &&
        Objects.equals(this.items, themeMediaResult.items) &&
        Objects.equals(this.totalRecordCount, themeMediaResult.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThemeMediaResult {\n");
    
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
