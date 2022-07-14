/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * ImageByNameInfo
 */


public class ImageByNameInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Theme")
  private String theme = null;

  @SerializedName("Context")
  private String context = null;

  @SerializedName("FileLength")
  private Long fileLength = null;

  @SerializedName("Format")
  private String format = null;

  public ImageByNameInfo name(String name) {
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

  public ImageByNameInfo theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @Schema(description = "")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public ImageByNameInfo context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public ImageByNameInfo fileLength(Long fileLength) {
    this.fileLength = fileLength;
    return this;
  }

   /**
   * Get fileLength
   * @return fileLength
  **/
  @Schema(description = "")
  public Long getFileLength() {
    return fileLength;
  }

  public void setFileLength(Long fileLength) {
    this.fileLength = fileLength;
  }

  public ImageByNameInfo format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageByNameInfo imageByNameInfo = (ImageByNameInfo) o;
    return Objects.equals(this.name, imageByNameInfo.name) &&
        Objects.equals(this.theme, imageByNameInfo.theme) &&
        Objects.equals(this.context, imageByNameInfo.context) &&
        Objects.equals(this.fileLength, imageByNameInfo.fileLength) &&
        Objects.equals(this.format, imageByNameInfo.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, theme, context, fileLength, format);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageByNameInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    fileLength: ").append(toIndentedString(fileLength)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
