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
import io.swagger.client.model.LibrarySubFolder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryMediaFolder
 */


public class LibraryMediaFolder {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("SubFolders")
  private List<LibrarySubFolder> subFolders = null;

  @SerializedName("IsUserAccessConfigurable")
  private Boolean isUserAccessConfigurable = null;

  public LibraryMediaFolder name(String name) {
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

  public LibraryMediaFolder id(String id) {
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

  public LibraryMediaFolder guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @Schema(description = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public LibraryMediaFolder subFolders(List<LibrarySubFolder> subFolders) {
    this.subFolders = subFolders;
    return this;
  }

  public LibraryMediaFolder addSubFoldersItem(LibrarySubFolder subFoldersItem) {
    if (this.subFolders == null) {
      this.subFolders = new ArrayList<LibrarySubFolder>();
    }
    this.subFolders.add(subFoldersItem);
    return this;
  }

   /**
   * Get subFolders
   * @return subFolders
  **/
  @Schema(description = "")
  public List<LibrarySubFolder> getSubFolders() {
    return subFolders;
  }

  public void setSubFolders(List<LibrarySubFolder> subFolders) {
    this.subFolders = subFolders;
  }

  public LibraryMediaFolder isUserAccessConfigurable(Boolean isUserAccessConfigurable) {
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
    LibraryMediaFolder libraryMediaFolder = (LibraryMediaFolder) o;
    return Objects.equals(this.name, libraryMediaFolder.name) &&
        Objects.equals(this.id, libraryMediaFolder.id) &&
        Objects.equals(this.guid, libraryMediaFolder.guid) &&
        Objects.equals(this.subFolders, libraryMediaFolder.subFolders) &&
        Objects.equals(this.isUserAccessConfigurable, libraryMediaFolder.isUserAccessConfigurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, guid, subFolders, isUserAccessConfigurable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryMediaFolder {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    subFolders: ").append(toIndentedString(subFolders)).append("\n");
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
