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
/**
 * LibraryUpdateLibraryOptions
 */


public class LibraryUpdateLibraryOptions {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("LibraryOptions")
  private LibraryOptions libraryOptions = null;

  public LibraryUpdateLibraryOptions id(String id) {
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

  public LibraryUpdateLibraryOptions libraryOptions(LibraryOptions libraryOptions) {
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
    LibraryUpdateLibraryOptions libraryUpdateLibraryOptions = (LibraryUpdateLibraryOptions) o;
    return Objects.equals(this.id, libraryUpdateLibraryOptions.id) &&
        Objects.equals(this.libraryOptions, libraryUpdateLibraryOptions.libraryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, libraryOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryUpdateLibraryOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
