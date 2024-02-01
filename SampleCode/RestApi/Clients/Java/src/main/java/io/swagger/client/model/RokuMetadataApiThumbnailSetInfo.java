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
import io.swagger.client.model.RokuMetadataApiThumbnailInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RokuMetadataApiThumbnailSetInfo
 */


public class RokuMetadataApiThumbnailSetInfo {
  @SerializedName("AspectRatio")
  private Double aspectRatio = null;

  @SerializedName("Thumbnails")
  private List<RokuMetadataApiThumbnailInfo> thumbnails = null;

  public RokuMetadataApiThumbnailSetInfo aspectRatio(Double aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Get aspectRatio
   * @return aspectRatio
  **/
  @Schema(description = "")
  public Double getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(Double aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public RokuMetadataApiThumbnailSetInfo thumbnails(List<RokuMetadataApiThumbnailInfo> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  public RokuMetadataApiThumbnailSetInfo addThumbnailsItem(RokuMetadataApiThumbnailInfo thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<RokuMetadataApiThumbnailInfo>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @Schema(description = "")
  public List<RokuMetadataApiThumbnailInfo> getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(List<RokuMetadataApiThumbnailInfo> thumbnails) {
    this.thumbnails = thumbnails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RokuMetadataApiThumbnailSetInfo rokuMetadataApiThumbnailSetInfo = (RokuMetadataApiThumbnailSetInfo) o;
    return Objects.equals(this.aspectRatio, rokuMetadataApiThumbnailSetInfo.aspectRatio) &&
        Objects.equals(this.thumbnails, rokuMetadataApiThumbnailSetInfo.thumbnails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, thumbnails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RokuMetadataApiThumbnailSetInfo {\n");
    
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
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
