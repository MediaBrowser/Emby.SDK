/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EmbyMediaModelTypesResolution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyMediaModelTypesResolutionWithRate
 */


public class EmbyMediaModelTypesResolutionWithRate {
  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("FrameRate")
  private Double frameRate = null;

  @SerializedName("Resolution")
  private EmbyMediaModelTypesResolution resolution = null;

  public EmbyMediaModelTypesResolutionWithRate width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public EmbyMediaModelTypesResolutionWithRate height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public EmbyMediaModelTypesResolutionWithRate frameRate(Double frameRate) {
    this.frameRate = frameRate;
    return this;
  }

   /**
   * Get frameRate
   * @return frameRate
  **/
  @Schema(description = "")
  public Double getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(Double frameRate) {
    this.frameRate = frameRate;
  }

  public EmbyMediaModelTypesResolutionWithRate resolution(EmbyMediaModelTypesResolution resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @Schema(description = "")
  public EmbyMediaModelTypesResolution getResolution() {
    return resolution;
  }

  public void setResolution(EmbyMediaModelTypesResolution resolution) {
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
    EmbyMediaModelTypesResolutionWithRate embyMediaModelTypesResolutionWithRate = (EmbyMediaModelTypesResolutionWithRate) o;
    return Objects.equals(this.width, embyMediaModelTypesResolutionWithRate.width) &&
        Objects.equals(this.height, embyMediaModelTypesResolutionWithRate.height) &&
        Objects.equals(this.frameRate, embyMediaModelTypesResolutionWithRate.frameRate) &&
        Objects.equals(this.resolution, embyMediaModelTypesResolutionWithRate.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, frameRate, resolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyMediaModelTypesResolutionWithRate {\n");
    
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
