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
import java.util.ArrayList;
import java.util.List;
/**
 * Class ImageProviderInfo.  
 */
@Schema(description = "Class ImageProviderInfo.  ")

public class ImageProviderInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("SupportedImages")
  private List<ImageType> supportedImages = null;

  public ImageProviderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageProviderInfo supportedImages(List<ImageType> supportedImages) {
    this.supportedImages = supportedImages;
    return this;
  }

  public ImageProviderInfo addSupportedImagesItem(ImageType supportedImagesItem) {
    if (this.supportedImages == null) {
      this.supportedImages = new ArrayList<ImageType>();
    }
    this.supportedImages.add(supportedImagesItem);
    return this;
  }

   /**
   * Get supportedImages
   * @return supportedImages
  **/
  @Schema(description = "")
  public List<ImageType> getSupportedImages() {
    return supportedImages;
  }

  public void setSupportedImages(List<ImageType> supportedImages) {
    this.supportedImages = supportedImages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageProviderInfo imageProviderInfo = (ImageProviderInfo) o;
    return Objects.equals(this.name, imageProviderInfo.name) &&
        Objects.equals(this.supportedImages, imageProviderInfo.supportedImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, supportedImages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProviderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedImages: ").append(toIndentedString(supportedImages)).append("\n");
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
