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
 * LibraryAddMediaPath
 */


public class LibraryAddMediaPath {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("PathInfo")
  private MediaPathInfo pathInfo = null;

  @SerializedName("RefreshLibrary")
  private Boolean refreshLibrary = null;

  public LibraryAddMediaPath id(String id) {
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

  public LibraryAddMediaPath path(String path) {
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

  public LibraryAddMediaPath pathInfo(MediaPathInfo pathInfo) {
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

  public LibraryAddMediaPath refreshLibrary(Boolean refreshLibrary) {
    this.refreshLibrary = refreshLibrary;
    return this;
  }

   /**
   * Get refreshLibrary
   * @return refreshLibrary
  **/
  @Schema(description = "")
  public Boolean isRefreshLibrary() {
    return refreshLibrary;
  }

  public void setRefreshLibrary(Boolean refreshLibrary) {
    this.refreshLibrary = refreshLibrary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryAddMediaPath libraryAddMediaPath = (LibraryAddMediaPath) o;
    return Objects.equals(this.id, libraryAddMediaPath.id) &&
        Objects.equals(this.path, libraryAddMediaPath.path) &&
        Objects.equals(this.pathInfo, libraryAddMediaPath.pathInfo) &&
        Objects.equals(this.refreshLibrary, libraryAddMediaPath.refreshLibrary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, pathInfo, refreshLibrary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryAddMediaPath {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathInfo: ").append(toIndentedString(pathInfo)).append("\n");
    sb.append("    refreshLibrary: ").append(toIndentedString(refreshLibrary)).append("\n");
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
