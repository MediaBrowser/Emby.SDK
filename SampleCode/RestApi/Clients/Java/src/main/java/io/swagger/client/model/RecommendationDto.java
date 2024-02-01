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
import io.swagger.client.model.RecommendationType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RecommendationDto
 */


public class RecommendationDto {
  @SerializedName("Items")
  private List<BaseItemDto> items = null;

  @SerializedName("RecommendationType")
  private RecommendationType recommendationType = null;

  @SerializedName("BaselineItemName")
  private String baselineItemName = null;

  @SerializedName("CategoryId")
  private Long categoryId = null;

  public RecommendationDto items(List<BaseItemDto> items) {
    this.items = items;
    return this;
  }

  public RecommendationDto addItemsItem(BaseItemDto itemsItem) {
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

  public RecommendationDto recommendationType(RecommendationType recommendationType) {
    this.recommendationType = recommendationType;
    return this;
  }

   /**
   * Get recommendationType
   * @return recommendationType
  **/
  @Schema(description = "")
  public RecommendationType getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(RecommendationType recommendationType) {
    this.recommendationType = recommendationType;
  }

  public RecommendationDto baselineItemName(String baselineItemName) {
    this.baselineItemName = baselineItemName;
    return this;
  }

   /**
   * Get baselineItemName
   * @return baselineItemName
  **/
  @Schema(description = "")
  public String getBaselineItemName() {
    return baselineItemName;
  }

  public void setBaselineItemName(String baselineItemName) {
    this.baselineItemName = baselineItemName;
  }

  public RecommendationDto categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @Schema(description = "")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationDto recommendationDto = (RecommendationDto) o;
    return Objects.equals(this.items, recommendationDto.items) &&
        Objects.equals(this.recommendationType, recommendationDto.recommendationType) &&
        Objects.equals(this.baselineItemName, recommendationDto.baselineItemName) &&
        Objects.equals(this.categoryId, recommendationDto.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, recommendationType, baselineItemName, categoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationDto {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
    sb.append("    baselineItemName: ").append(toIndentedString(baselineItemName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
