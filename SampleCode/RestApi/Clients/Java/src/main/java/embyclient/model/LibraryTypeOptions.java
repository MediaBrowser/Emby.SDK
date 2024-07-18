/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.ImageOption;
import embyclient.model.ImageType;
import embyclient.model.LibraryOptionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryTypeOptions
 */


public class LibraryTypeOptions {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("MetadataFetchers")
  private List<LibraryOptionInfo> metadataFetchers = null;

  @SerializedName("ImageFetchers")
  private List<LibraryOptionInfo> imageFetchers = null;

  @SerializedName("SupportedImageTypes")
  private List<ImageType> supportedImageTypes = null;

  @SerializedName("DefaultImageOptions")
  private List<ImageOption> defaultImageOptions = null;

  public LibraryTypeOptions type(String type) {
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

  public LibraryTypeOptions metadataFetchers(List<LibraryOptionInfo> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
    return this;
  }

  public LibraryTypeOptions addMetadataFetchersItem(LibraryOptionInfo metadataFetchersItem) {
    if (this.metadataFetchers == null) {
      this.metadataFetchers = new ArrayList<LibraryOptionInfo>();
    }
    this.metadataFetchers.add(metadataFetchersItem);
    return this;
  }

   /**
   * Get metadataFetchers
   * @return metadataFetchers
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getMetadataFetchers() {
    return metadataFetchers;
  }

  public void setMetadataFetchers(List<LibraryOptionInfo> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
  }

  public LibraryTypeOptions imageFetchers(List<LibraryOptionInfo> imageFetchers) {
    this.imageFetchers = imageFetchers;
    return this;
  }

  public LibraryTypeOptions addImageFetchersItem(LibraryOptionInfo imageFetchersItem) {
    if (this.imageFetchers == null) {
      this.imageFetchers = new ArrayList<LibraryOptionInfo>();
    }
    this.imageFetchers.add(imageFetchersItem);
    return this;
  }

   /**
   * Get imageFetchers
   * @return imageFetchers
  **/
  @Schema(description = "")
  public List<LibraryOptionInfo> getImageFetchers() {
    return imageFetchers;
  }

  public void setImageFetchers(List<LibraryOptionInfo> imageFetchers) {
    this.imageFetchers = imageFetchers;
  }

  public LibraryTypeOptions supportedImageTypes(List<ImageType> supportedImageTypes) {
    this.supportedImageTypes = supportedImageTypes;
    return this;
  }

  public LibraryTypeOptions addSupportedImageTypesItem(ImageType supportedImageTypesItem) {
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

  public LibraryTypeOptions defaultImageOptions(List<ImageOption> defaultImageOptions) {
    this.defaultImageOptions = defaultImageOptions;
    return this;
  }

  public LibraryTypeOptions addDefaultImageOptionsItem(ImageOption defaultImageOptionsItem) {
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
    LibraryTypeOptions libraryTypeOptions = (LibraryTypeOptions) o;
    return Objects.equals(this.type, libraryTypeOptions.type) &&
        Objects.equals(this.metadataFetchers, libraryTypeOptions.metadataFetchers) &&
        Objects.equals(this.imageFetchers, libraryTypeOptions.imageFetchers) &&
        Objects.equals(this.supportedImageTypes, libraryTypeOptions.supportedImageTypes) &&
        Objects.equals(this.defaultImageOptions, libraryTypeOptions.defaultImageOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadataFetchers, imageFetchers, supportedImageTypes, defaultImageOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryTypeOptions {\n");
    
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
