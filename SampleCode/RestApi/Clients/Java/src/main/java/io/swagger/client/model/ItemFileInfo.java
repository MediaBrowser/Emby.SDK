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
import io.swagger.client.model.ItemFileType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ItemFileInfo
 */


public class ItemFileInfo {
  @SerializedName("Type")
  private ItemFileType type = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("ImageType")
  private ImageType imageType = null;

  @SerializedName("Index")
  private Integer index = null;

  public ItemFileInfo type(ItemFileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ItemFileType getType() {
    return type;
  }

  public void setType(ItemFileType type) {
    this.type = type;
  }

  public ItemFileInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemFileInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ItemFileInfo imageType(ImageType imageType) {
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

  public ItemFileInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemFileInfo itemFileInfo = (ItemFileInfo) o;
    return Objects.equals(this.type, itemFileInfo.type) &&
        Objects.equals(this.name, itemFileInfo.name) &&
        Objects.equals(this.path, itemFileInfo.path) &&
        Objects.equals(this.imageType, itemFileInfo.imageType) &&
        Objects.equals(this.index, itemFileInfo.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, path, imageType, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFileInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
