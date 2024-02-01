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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Struct representing a video resolution specified in X and Y dimension.      &#x60;System.IComparable&#x60;      &#x60;System.IEquatable&#x60;1&#x60;  
 */
@Schema(description = "Struct representing a video resolution specified in X and Y dimension.      `System.IComparable`      `System.IEquatable`1`  ")

public class Resolution {
  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  public Resolution width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The resolution width.
   * @return width
  **/
  @Schema(description = "The resolution width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Resolution height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The resolution height.
   * @return height
  **/
  @Schema(description = "The resolution height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resolution resolution = (Resolution) o;
    return Objects.equals(this.width, resolution.width) &&
        Objects.equals(this.height, resolution.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resolution {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
