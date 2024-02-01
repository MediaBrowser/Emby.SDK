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
 * PlaylistsPlaylistCreationResult
 */


public class PlaylistsPlaylistCreationResult {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ItemAddedCount")
  private Integer itemAddedCount = null;

  public PlaylistsPlaylistCreationResult id(String id) {
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

  public PlaylistsPlaylistCreationResult name(String name) {
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

  public PlaylistsPlaylistCreationResult itemAddedCount(Integer itemAddedCount) {
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
    PlaylistsPlaylistCreationResult playlistsPlaylistCreationResult = (PlaylistsPlaylistCreationResult) o;
    return Objects.equals(this.id, playlistsPlaylistCreationResult.id) &&
        Objects.equals(this.name, playlistsPlaylistCreationResult.name) &&
        Objects.equals(this.itemAddedCount, playlistsPlaylistCreationResult.itemAddedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, itemAddedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsPlaylistCreationResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
