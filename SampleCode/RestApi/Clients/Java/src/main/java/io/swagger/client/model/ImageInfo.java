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
/**
 * Class ImageInfo  
 */
@Schema(description = "Class ImageInfo  ")

public class ImageInfo {
  @SerializedName("ImageType")
  private ImageType imageType = null;

  @SerializedName("ImageIndex")
  private Integer imageIndex = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Filename")
  private String filename = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Size")
  private Long size = null;

  public ImageInfo imageType(ImageType imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @Schema(description = "")
  public ImageType getImageType() {
    return imageType;
  }

  public void setImageType(ImageType imageType) {
    this.imageType = imageType;
  }

  public ImageInfo imageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
    return this;
  }

   /**
   * The index of the image.
   * @return imageIndex
  **/
  @Schema(description = "The index of the image.")
  public Integer getImageIndex() {
    return imageIndex;
  }

  public void setImageIndex(Integer imageIndex) {
    this.imageIndex = imageIndex;
  }

  public ImageInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path.
   * @return path
  **/
  @Schema(description = "The path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ImageInfo filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @Schema(description = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public ImageInfo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height.
   * @return height
  **/
  @Schema(description = "The height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageInfo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width.
   * @return width
  **/
  @Schema(description = "The width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageInfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size.
   * @return size
  **/
  @Schema(description = "The size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInfo imageInfo = (ImageInfo) o;
    return Objects.equals(this.imageType, imageInfo.imageType) &&
        Objects.equals(this.imageIndex, imageInfo.imageIndex) &&
        Objects.equals(this.path, imageInfo.path) &&
        Objects.equals(this.filename, imageInfo.filename) &&
        Objects.equals(this.height, imageInfo.height) &&
        Objects.equals(this.width, imageInfo.width) &&
        Objects.equals(this.size, imageInfo.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageType, imageIndex, path, filename, height, width, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfo {\n");
    
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    imageIndex: ").append(toIndentedString(imageIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
