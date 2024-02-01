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
import io.swagger.client.model.ImageOption;
import io.swagger.client.model.ImageType;
import io.swagger.client.model.LibraryLibraryOptionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryLibraryTypeOptions
 */


public class LibraryLibraryTypeOptions {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("MetadataFetchers")
  private List<LibraryLibraryOptionInfo> metadataFetchers = null;

  @SerializedName("ImageFetchers")
  private List<LibraryLibraryOptionInfo> imageFetchers = null;

  @SerializedName("SupportedImageTypes")
  private List<ImageType> supportedImageTypes = null;

  @SerializedName("DefaultImageOptions")
  private List<ImageOption> defaultImageOptions = null;

  public LibraryLibraryTypeOptions type(String type) {
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

  public LibraryLibraryTypeOptions metadataFetchers(List<LibraryLibraryOptionInfo> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
    return this;
  }

  public LibraryLibraryTypeOptions addMetadataFetchersItem(LibraryLibraryOptionInfo metadataFetchersItem) {
    if (this.metadataFetchers == null) {
      this.metadataFetchers = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.metadataFetchers.add(metadataFetchersItem);
    return this;
  }

   /**
   * Get metadataFetchers
   * @return metadataFetchers
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getMetadataFetchers() {
    return metadataFetchers;
  }

  public void setMetadataFetchers(List<LibraryLibraryOptionInfo> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
  }

  public LibraryLibraryTypeOptions imageFetchers(List<LibraryLibraryOptionInfo> imageFetchers) {
    this.imageFetchers = imageFetchers;
    return this;
  }

  public LibraryLibraryTypeOptions addImageFetchersItem(LibraryLibraryOptionInfo imageFetchersItem) {
    if (this.imageFetchers == null) {
      this.imageFetchers = new ArrayList<LibraryLibraryOptionInfo>();
    }
    this.imageFetchers.add(imageFetchersItem);
    return this;
  }

   /**
   * Get imageFetchers
   * @return imageFetchers
  **/
  @Schema(description = "")
  public List<LibraryLibraryOptionInfo> getImageFetchers() {
    return imageFetchers;
  }

  public void setImageFetchers(List<LibraryLibraryOptionInfo> imageFetchers) {
    this.imageFetchers = imageFetchers;
  }

  public LibraryLibraryTypeOptions supportedImageTypes(List<ImageType> supportedImageTypes) {
    this.supportedImageTypes = supportedImageTypes;
    return this;
  }

  public LibraryLibraryTypeOptions addSupportedImageTypesItem(ImageType supportedImageTypesItem) {
    if (this.supportedImageTypes == null) {
      this.supportedImageTypes = new ArrayList<ImageType>();
    }
    this.supportedImageTypes.add(supportedImageTypesItem);
    return this;
  }

   /**
   * Get supportedImageTypes
   * @return supportedImageTypes
  **/
  @Schema(description = "")
  public List<ImageType> getSupportedImageTypes() {
    return supportedImageTypes;
  }

  public void setSupportedImageTypes(List<ImageType> supportedImageTypes) {
    this.supportedImageTypes = supportedImageTypes;
  }

  public LibraryLibraryTypeOptions defaultImageOptions(List<ImageOption> defaultImageOptions) {
    this.defaultImageOptions = defaultImageOptions;
    return this;
  }

  public LibraryLibraryTypeOptions addDefaultImageOptionsItem(ImageOption defaultImageOptionsItem) {
    if (this.defaultImageOptions == null) {
      this.defaultImageOptions = new ArrayList<ImageOption>();
    }
    this.defaultImageOptions.add(defaultImageOptionsItem);
    return this;
  }

   /**
   * Get defaultImageOptions
   * @return defaultImageOptions
  **/
  @Schema(description = "")
  public List<ImageOption> getDefaultImageOptions() {
    return defaultImageOptions;
  }

  public void setDefaultImageOptions(List<ImageOption> defaultImageOptions) {
    this.defaultImageOptions = defaultImageOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryLibraryTypeOptions libraryLibraryTypeOptions = (LibraryLibraryTypeOptions) o;
    return Objects.equals(this.type, libraryLibraryTypeOptions.type) &&
        Objects.equals(this.metadataFetchers, libraryLibraryTypeOptions.metadataFetchers) &&
        Objects.equals(this.imageFetchers, libraryLibraryTypeOptions.imageFetchers) &&
        Objects.equals(this.supportedImageTypes, libraryLibraryTypeOptions.supportedImageTypes) &&
        Objects.equals(this.defaultImageOptions, libraryLibraryTypeOptions.defaultImageOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadataFetchers, imageFetchers, supportedImageTypes, defaultImageOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryLibraryTypeOptions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadataFetchers: ").append(toIndentedString(metadataFetchers)).append("\n");
    sb.append("    imageFetchers: ").append(toIndentedString(imageFetchers)).append("\n");
    sb.append("    supportedImageTypes: ").append(toIndentedString(supportedImageTypes)).append("\n");
    sb.append("    defaultImageOptions: ").append(toIndentedString(defaultImageOptions)).append("\n");
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
