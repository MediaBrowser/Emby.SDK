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
import io.swagger.client.model.LibraryMediaUpdateInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LibraryPostUpdatedMedia
 */


public class LibraryPostUpdatedMedia {
  @SerializedName("Updates")
  private List<LibraryMediaUpdateInfo> updates = null;

  public LibraryPostUpdatedMedia updates(List<LibraryMediaUpdateInfo> updates) {
    this.updates = updates;
    return this;
  }

  public LibraryPostUpdatedMedia addUpdatesItem(LibraryMediaUpdateInfo updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<LibraryMediaUpdateInfo>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * Get updates
   * @return updates
  **/
  @Schema(description = "")
  public List<LibraryMediaUpdateInfo> getUpdates() {
    return updates;
  }

  public void setUpdates(List<LibraryMediaUpdateInfo> updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryPostUpdatedMedia libraryPostUpdatedMedia = (LibraryPostUpdatedMedia) o;
    return Objects.equals(this.updates, libraryPostUpdatedMedia.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryPostUpdatedMedia {\n");
    
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
