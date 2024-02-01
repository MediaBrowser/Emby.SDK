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
import io.swagger.client.model.RemoteImageInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class RemoteImageResult.  
 */
@Schema(description = "Class RemoteImageResult.  ")

public class RemoteImageResult {
  @SerializedName("Images")
  private List<RemoteImageInfo> images = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  @SerializedName("Providers")
  private List<String> providers = null;

  public RemoteImageResult images(List<RemoteImageInfo> images) {
    this.images = images;
    return this;
  }

  public RemoteImageResult addImagesItem(RemoteImageInfo imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<RemoteImageInfo>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The images.
   * @return images
  **/
  @Schema(description = "The images.")
  public List<RemoteImageInfo> getImages() {
    return images;
  }

  public void setImages(List<RemoteImageInfo> images) {
    this.images = images;
  }

  public RemoteImageResult totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * The total record count.
   * @return totalRecordCount
  **/
  @Schema(description = "The total record count.")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

  public RemoteImageResult providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public RemoteImageResult addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<String>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * The providers.
   * @return providers
  **/
  @Schema(description = "The providers.")
  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteImageResult remoteImageResult = (RemoteImageResult) o;
    return Objects.equals(this.images, remoteImageResult.images) &&
        Objects.equals(this.totalRecordCount, remoteImageResult.totalRecordCount) &&
        Objects.equals(this.providers, remoteImageResult.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, totalRecordCount, providers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteImageResult {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
