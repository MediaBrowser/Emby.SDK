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
import io.swagger.client.model.NameIdPair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UserLibraryRemoveTags
 */


public class UserLibraryRemoveTags {
  @SerializedName("Tags")
  private List<NameIdPair> tags = null;

  public UserLibraryRemoveTags tags(List<NameIdPair> tags) {
    this.tags = tags;
    return this;
  }

  public UserLibraryRemoveTags addTagsItem(NameIdPair tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<NameIdPair>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<NameIdPair> getTags() {
    return tags;
  }

  public void setTags(List<NameIdPair> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryRemoveTags userLibraryRemoveTags = (UserLibraryRemoveTags) o;
    return Objects.equals(this.tags, userLibraryRemoveTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryRemoveTags {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
