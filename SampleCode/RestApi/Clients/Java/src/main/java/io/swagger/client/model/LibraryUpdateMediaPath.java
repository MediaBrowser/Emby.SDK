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
import io.swagger.client.model.MediaPathInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LibraryUpdateMediaPath
 */


public class LibraryUpdateMediaPath {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("PathInfo")
  private MediaPathInfo pathInfo = null;

  public LibraryUpdateMediaPath id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LibraryUpdateMediaPath pathInfo(MediaPathInfo pathInfo) {
    this.pathInfo = pathInfo;
    return this;
  }

   /**
   * Get pathInfo
   * @return pathInfo
  **/
  @Schema(description = "")
  public MediaPathInfo getPathInfo() {
    return pathInfo;
  }

  public void setPathInfo(MediaPathInfo pathInfo) {
    this.pathInfo = pathInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryUpdateMediaPath libraryUpdateMediaPath = (LibraryUpdateMediaPath) o;
    return Objects.equals(this.id, libraryUpdateMediaPath.id) &&
        Objects.equals(this.pathInfo, libraryUpdateMediaPath.pathInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pathInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryUpdateMediaPath {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pathInfo: ").append(toIndentedString(pathInfo)).append("\n");
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
