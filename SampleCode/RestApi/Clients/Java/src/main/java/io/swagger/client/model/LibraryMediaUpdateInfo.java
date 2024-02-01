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
 * LibraryMediaUpdateInfo
 */


public class LibraryMediaUpdateInfo {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("UpdateType")
  private String updateType = null;

  public LibraryMediaUpdateInfo path(String path) {
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

  public LibraryMediaUpdateInfo updateType(String updateType) {
    this.updateType = updateType;
    return this;
  }

   /**
   * Get updateType
   * @return updateType
  **/
  @Schema(description = "")
  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryMediaUpdateInfo libraryMediaUpdateInfo = (LibraryMediaUpdateInfo) o;
    return Objects.equals(this.path, libraryMediaUpdateInfo.path) &&
        Objects.equals(this.updateType, libraryMediaUpdateInfo.updateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, updateType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryMediaUpdateInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
