/*
 * Emby REST API
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
import io.swagger.client.model.ConfigurationImageOption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConfigurationTypeOptions
 */


public class ConfigurationTypeOptions {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("MetadataFetchers")
  private List<String> metadataFetchers = null;

  @SerializedName("MetadataFetcherOrder")
  private List<String> metadataFetcherOrder = null;

  @SerializedName("ImageFetchers")
  private List<String> imageFetchers = null;

  @SerializedName("ImageFetcherOrder")
  private List<String> imageFetcherOrder = null;

  @SerializedName("ImageOptions")
  private List<ConfigurationImageOption> imageOptions = null;

  public ConfigurationTypeOptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConfigurationTypeOptions metadataFetchers(List<String> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
    return this;
  }

  public ConfigurationTypeOptions addMetadataFetchersItem(String metadataFetchersItem) {
    if (this.metadataFetchers == null) {
      this.metadataFetchers = new ArrayList<String>();
    }
    this.metadataFetchers.add(metadataFetchersItem);
    return this;
  }

   /**
   * Get metadataFetchers
   * @return metadataFetchers
  **/
  @Schema(description = "")
  public List<String> getMetadataFetchers() {
    return metadataFetchers;
  }

  public void setMetadataFetchers(List<String> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
  }

  public ConfigurationTypeOptions metadataFetcherOrder(List<String> metadataFetcherOrder) {
    this.metadataFetcherOrder = metadataFetcherOrder;
    return this;
  }

  public ConfigurationTypeOptions addMetadataFetcherOrderItem(String metadataFetcherOrderItem) {
    if (this.metadataFetcherOrder == null) {
      this.metadataFetcherOrder = new ArrayList<String>();
    }
    this.metadataFetcherOrder.add(metadataFetcherOrderItem);
    return this;
  }

   /**
   * Get metadataFetcherOrder
   * @return metadataFetcherOrder
  **/
  @Schema(description = "")
  public List<String> getMetadataFetcherOrder() {
    return metadataFetcherOrder;
  }

  public void setMetadataFetcherOrder(List<String> metadataFetcherOrder) {
    this.metadataFetcherOrder = metadataFetcherOrder;
  }

  public ConfigurationTypeOptions imageFetchers(List<String> imageFetchers) {
    this.imageFetchers = imageFetchers;
    return this;
  }

  public ConfigurationTypeOptions addImageFetchersItem(String imageFetchersItem) {
    if (this.imageFetchers == null) {
      this.imageFetchers = new ArrayList<String>();
    }
    this.imageFetchers.add(imageFetchersItem);
    return this;
  }

   /**
   * Get imageFetchers
   * @return imageFetchers
  **/
  @Schema(description = "")
  public List<String> getImageFetchers() {
    return imageFetchers;
  }

  public void setImageFetchers(List<String> imageFetchers) {
    this.imageFetchers = imageFetchers;
  }

  public ConfigurationTypeOptions imageFetcherOrder(List<String> imageFetcherOrder) {
    this.imageFetcherOrder = imageFetcherOrder;
    return this;
  }

  public ConfigurationTypeOptions addImageFetcherOrderItem(String imageFetcherOrderItem) {
    if (this.imageFetcherOrder == null) {
      this.imageFetcherOrder = new ArrayList<String>();
    }
    this.imageFetcherOrder.add(imageFetcherOrderItem);
    return this;
  }

   /**
   * Get imageFetcherOrder
   * @return imageFetcherOrder
  **/
  @Schema(description = "")
  public List<String> getImageFetcherOrder() {
    return imageFetcherOrder;
  }

  public void setImageFetcherOrder(List<String> imageFetcherOrder) {
    this.imageFetcherOrder = imageFetcherOrder;
  }

  public ConfigurationTypeOptions imageOptions(List<ConfigurationImageOption> imageOptions) {
    this.imageOptions = imageOptions;
    return this;
  }

  public ConfigurationTypeOptions addImageOptionsItem(ConfigurationImageOption imageOptionsItem) {
    if (this.imageOptions == null) {
      this.imageOptions = new ArrayList<ConfigurationImageOption>();
    }
    this.imageOptions.add(imageOptionsItem);
    return this;
  }

   /**
   * Get imageOptions
   * @return imageOptions
  **/
  @Schema(description = "")
  public List<ConfigurationImageOption> getImageOptions() {
    return imageOptions;
  }

  public void setImageOptions(List<ConfigurationImageOption> imageOptions) {
    this.imageOptions = imageOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationTypeOptions configurationTypeOptions = (ConfigurationTypeOptions) o;
    return Objects.equals(this.type, configurationTypeOptions.type) &&
        Objects.equals(this.metadataFetchers, configurationTypeOptions.metadataFetchers) &&
        Objects.equals(this.metadataFetcherOrder, configurationTypeOptions.metadataFetcherOrder) &&
        Objects.equals(this.imageFetchers, configurationTypeOptions.imageFetchers) &&
        Objects.equals(this.imageFetcherOrder, configurationTypeOptions.imageFetcherOrder) &&
        Objects.equals(this.imageOptions, configurationTypeOptions.imageOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadataFetchers, metadataFetcherOrder, imageFetchers, imageFetcherOrder, imageOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationTypeOptions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadataFetchers: ").append(toIndentedString(metadataFetchers)).append("\n");
    sb.append("    metadataFetcherOrder: ").append(toIndentedString(metadataFetcherOrder)).append("\n");
    sb.append("    imageFetchers: ").append(toIndentedString(imageFetchers)).append("\n");
    sb.append("    imageFetcherOrder: ").append(toIndentedString(imageFetcherOrder)).append("\n");
    sb.append("    imageOptions: ").append(toIndentedString(imageOptions)).append("\n");
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
