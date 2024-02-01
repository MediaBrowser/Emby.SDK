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
 * PlaylistsAddToPlaylistResult
 */


public class PlaylistsAddToPlaylistResult {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("ItemAddedCount")
  private Integer itemAddedCount = null;

  public PlaylistsAddToPlaylistResult id(String id) {
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

  public PlaylistsAddToPlaylistResult itemAddedCount(Integer itemAddedCount) {
    this.itemAddedCount = itemAddedCount;
    return this;
  }

   /**
   * Get itemAddedCount
   * @return itemAddedCount
  **/
  @Schema(description = "")
  public Integer getItemAddedCount() {
    return itemAddedCount;
  }

  public void setItemAddedCount(Integer itemAddedCount) {
    this.itemAddedCount = itemAddedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistsAddToPlaylistResult playlistsAddToPlaylistResult = (PlaylistsAddToPlaylistResult) o;
    return Objects.equals(this.id, playlistsAddToPlaylistResult.id) &&
        Objects.equals(this.itemAddedCount, playlistsAddToPlaylistResult.itemAddedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemAddedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsAddToPlaylistResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemAddedCount: ").append(toIndentedString(itemAddedCount)).append("\n");
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
