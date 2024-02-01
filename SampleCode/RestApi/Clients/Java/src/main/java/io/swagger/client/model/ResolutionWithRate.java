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
import io.swagger.client.model.Resolution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Struct representing a combination of video resolution and frame rate.      &#x60;System.IEquatable&#x60;1&#x60;  
 */
@Schema(description = "Struct representing a combination of video resolution and frame rate.      `System.IEquatable`1`  ")

public class ResolutionWithRate {
  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("FrameRate")
  private Double frameRate = null;

  @SerializedName("Resolution")
  private Resolution resolution = null;

  public ResolutionWithRate width(Integer width) {
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

  public ResolutionWithRate height(Integer height) {
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

  public ResolutionWithRate frameRate(Double frameRate) {
    this.frameRate = frameRate;
    return this;
  }

   /**
   * The frame rate in frames/second (fps).
   * @return frameRate
  **/
  @Schema(description = "The frame rate in frames/second (fps).")
  public Double getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(Double frameRate) {
    this.frameRate = frameRate;
  }

  public ResolutionWithRate resolution(Resolution resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @Schema(description = "")
  public Resolution getResolution() {
    return resolution;
  }

  public void setResolution(Resolution resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolutionWithRate resolutionWithRate = (ResolutionWithRate) o;
    return Objects.equals(this.width, resolutionWithRate.width) &&
        Objects.equals(this.height, resolutionWithRate.height) &&
        Objects.equals(this.frameRate, resolutionWithRate.frameRate) &&
        Objects.equals(this.resolution, resolutionWithRate.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, frameRate, resolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolutionWithRate {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
