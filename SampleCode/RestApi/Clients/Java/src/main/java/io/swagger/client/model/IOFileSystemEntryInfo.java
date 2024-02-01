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
import io.swagger.client.model.IOFileSystemEntryType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Class FileSystemEntryInfo  
 */
@Schema(description = "Class FileSystemEntryInfo  ")

public class IOFileSystemEntryInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Type")
  private IOFileSystemEntryType type = null;

  public IOFileSystemEntryInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IOFileSystemEntryInfo path(String path) {
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

  public IOFileSystemEntryInfo type(IOFileSystemEntryType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public IOFileSystemEntryType getType() {
    return type;
  }

  public void setType(IOFileSystemEntryType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IOFileSystemEntryInfo ioFileSystemEntryInfo = (IOFileSystemEntryInfo) o;
    return Objects.equals(this.name, ioFileSystemEntryInfo.name) &&
        Objects.equals(this.path, ioFileSystemEntryInfo.path) &&
        Objects.equals(this.type, ioFileSystemEntryInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IOFileSystemEntryInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
