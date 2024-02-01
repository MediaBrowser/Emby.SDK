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
import io.swagger.client.model.ImageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ImageOption
 */


public class ImageOption {
  @SerializedName("Type")
  private ImageType type = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("MinWidth")
  private Integer minWidth = null;

  public ImageOption type(ImageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public ImageOption limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The limit.
   * @return limit
  **/
  @Schema(description = "The limit.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ImageOption minWidth(Integer minWidth) {
    this.minWidth = minWidth;
    return this;
  }

   /**
   * The minimum width.
   * @return minWidth
  **/
  @Schema(description = "The minimum width.")
  public Integer getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Integer minWidth) {
    this.minWidth = minWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageOption imageOption = (ImageOption) o;
    return Objects.equals(this.type, imageOption.type) &&
        Objects.equals(this.limit, imageOption.limit) &&
        Objects.equals(this.minWidth, imageOption.minWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, limit, minWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageOption {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
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
