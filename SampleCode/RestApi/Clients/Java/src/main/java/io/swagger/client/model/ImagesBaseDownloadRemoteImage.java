/*
 * Emby Server REST API (BETA)
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
 * ImagesBaseDownloadRemoteImage
 */


public class ImagesBaseDownloadRemoteImage {
  @SerializedName("ImageIndex")
  private Integer imageIndex = null;

  public ImagesBaseDownloadRemoteImage imageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
    return this;
  }

   /**
   * Get imageIndex
   * @return imageIndex
  **/
  @Schema(description = "")
  public Integer getImageIndex() {
    return imageIndex;
  }

  public void setImageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesBaseDownloadRemoteImage imagesBaseDownloadRemoteImage = (ImagesBaseDownloadRemoteImage) o;
    return Objects.equals(this.imageIndex, imagesBaseDownloadRemoteImage.imageIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesBaseDownloadRemoteImage {\n");
    
    sb.append("    imageIndex: ").append(toIndentedString(imageIndex)).append("\n");
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