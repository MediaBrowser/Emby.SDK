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
 * LibrarySubFolder
 */


public class LibrarySubFolder {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("IsUserAccessConfigurable")
  private Boolean isUserAccessConfigurable = null;

  public LibrarySubFolder name(String name) {
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

  public LibrarySubFolder id(String id) {
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

  public LibrarySubFolder path(String path) {
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

  public LibrarySubFolder isUserAccessConfigurable(Boolean isUserAccessConfigurable) {
    this.isUserAccessConfigurable = isUserAccessConfigurable;
    return this;
  }

   /**
   * Get isUserAccessConfigurable
   * @return isUserAccessConfigurable
  **/
  @Schema(description = "")
  public Boolean isIsUserAccessConfigurable() {
    return isUserAccessConfigurable;
  }

  public void setIsUserAccessConfigurable(Boolean isUserAccessConfigurable) {
    this.isUserAccessConfigurable = isUserAccessConfigurable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibrarySubFolder librarySubFolder = (LibrarySubFolder) o;
    return Objects.equals(this.name, librarySubFolder.name) &&
        Objects.equals(this.id, librarySubFolder.id) &&
        Objects.equals(this.path, librarySubFolder.path) &&
        Objects.equals(this.isUserAccessConfigurable, librarySubFolder.isUserAccessConfigurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, path, isUserAccessConfigurable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibrarySubFolder {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    isUserAccessConfigurable: ").append(toIndentedString(isUserAccessConfigurable)).append("\n");
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
