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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LibraryRemoveMediaPath
 */


public class LibraryRemoveMediaPath {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("RefreshLibrary")
  private Boolean refreshLibrary = null;

  public LibraryRemoveMediaPath id(String id) {
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

  public LibraryRemoveMediaPath path(String path) {
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

  public LibraryRemoveMediaPath refreshLibrary(Boolean refreshLibrary) {
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
    LibraryRemoveMediaPath libraryRemoveMediaPath = (LibraryRemoveMediaPath) o;
    return Objects.equals(this.id, libraryRemoveMediaPath.id) &&
        Objects.equals(this.path, libraryRemoveMediaPath.path) &&
        Objects.equals(this.refreshLibrary, libraryRemoveMediaPath.refreshLibrary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, refreshLibrary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryRemoveMediaPath {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
