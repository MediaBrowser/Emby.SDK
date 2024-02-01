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
 * RokuMetadataApiThumbnailInfo
 */


public class RokuMetadataApiThumbnailInfo {
  @SerializedName("PositionTicks")
  private Long positionTicks = null;

  @SerializedName("ImageTag")
  private String imageTag = null;

  public RokuMetadataApiThumbnailInfo positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

   /**
   * Get positionTicks
   * @return positionTicks
  **/
  @Schema(description = "")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public RokuMetadataApiThumbnailInfo imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Get imageTag
   * @return imageTag
  **/
  @Schema(description = "")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RokuMetadataApiThumbnailInfo rokuMetadataApiThumbnailInfo = (RokuMetadataApiThumbnailInfo) o;
    return Objects.equals(this.positionTicks, rokuMetadataApiThumbnailInfo.positionTicks) &&
        Objects.equals(this.imageTag, rokuMetadataApiThumbnailInfo.imageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionTicks, imageTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RokuMetadataApiThumbnailInfo {\n");
    
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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
