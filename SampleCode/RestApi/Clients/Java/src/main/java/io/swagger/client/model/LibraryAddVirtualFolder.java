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
import io.swagger.client.model.LibraryOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryAddVirtualFolder
 */


public class LibraryAddVirtualFolder {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CollectionType")
  private String collectionType = null;

  @SerializedName("RefreshLibrary")
  private Boolean refreshLibrary = null;

  @SerializedName("Paths")
  private List<String> paths = null;

  @SerializedName("LibraryOptions")
  private LibraryOptions libraryOptions = null;

  public LibraryAddVirtualFolder name(String name) {
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

  public LibraryAddVirtualFolder collectionType(String collectionType) {
    this.collectionType = collectionType;
    return this;
  }

   /**
   * Get collectionType
   * @return collectionType
  **/
  @Schema(description = "")
  public String getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  public LibraryAddVirtualFolder refreshLibrary(Boolean refreshLibrary) {
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

  public LibraryAddVirtualFolder paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public LibraryAddVirtualFolder addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @Schema(description = "")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }

  public LibraryAddVirtualFolder libraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
    return this;
  }

   /**
   * Get libraryOptions
   * @return libraryOptions
  **/
  @Schema(description = "")
  public LibraryOptions getLibraryOptions() {
    return libraryOptions;
  }

  public void setLibraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryAddVirtualFolder libraryAddVirtualFolder = (LibraryAddVirtualFolder) o;
    return Objects.equals(this.name, libraryAddVirtualFolder.name) &&
        Objects.equals(this.collectionType, libraryAddVirtualFolder.collectionType) &&
        Objects.equals(this.refreshLibrary, libraryAddVirtualFolder.refreshLibrary) &&
        Objects.equals(this.paths, libraryAddVirtualFolder.paths) &&
        Objects.equals(this.libraryOptions, libraryAddVirtualFolder.libraryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, collectionType, refreshLibrary, paths, libraryOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryAddVirtualFolder {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    refreshLibrary: ").append(toIndentedString(refreshLibrary)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    libraryOptions: ").append(toIndentedString(libraryOptions)).append("\n");
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
