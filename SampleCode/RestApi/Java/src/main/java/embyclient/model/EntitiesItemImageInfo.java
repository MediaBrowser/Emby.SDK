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
import embyclient.model.DrawingImageOrientation;
import embyclient.model.ImageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * EntitiesItemImageInfo
 */


public class EntitiesItemImageInfo {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Type")
  private ImageType type = null;

  @SerializedName("Orientation")
  private DrawingImageOrientation orientation = null;

  @SerializedName("DateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  public EntitiesItemImageInfo path(String path) {
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

  public EntitiesItemImageInfo type(ImageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ImageType getType() {
    return type;
  }

  public void setType(ImageType type) {
    this.type = type;
  }

  public EntitiesItemImageInfo orientation(DrawingImageOrientation orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @Schema(description = "")
  public DrawingImageOrientation getOrientation() {
    return orientation;
  }

  public void setOrientation(DrawingImageOrientation orientation) {
    this.orientation = orientation;
  }

  public EntitiesItemImageInfo dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The date modified.
   * @return dateModified
  **/
  @Schema(description = "The date modified.")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public EntitiesItemImageInfo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public EntitiesItemImageInfo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitiesItemImageInfo entitiesItemImageInfo = (EntitiesItemImageInfo) o;
    return Objects.equals(this.path, entitiesItemImageInfo.path) &&
        Objects.equals(this.type, entitiesItemImageInfo.type) &&
        Objects.equals(this.orientation, entitiesItemImageInfo.orientation) &&
        Objects.equals(this.dateModified, entitiesItemImageInfo.dateModified) &&
        Objects.equals(this.width, entitiesItemImageInfo.width) &&
        Objects.equals(this.height, entitiesItemImageInfo.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type, orientation, dateModified, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesItemImageInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
