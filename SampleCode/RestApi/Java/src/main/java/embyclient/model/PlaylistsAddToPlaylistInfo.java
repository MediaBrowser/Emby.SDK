/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

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
 * PlaylistsAddToPlaylistInfo
 */


public class PlaylistsAddToPlaylistInfo {
  @SerializedName("ItemCount")
  private Integer itemCount = null;

  @SerializedName("ContainsDuplicates")
  private Boolean containsDuplicates = null;

  public PlaylistsAddToPlaylistInfo itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @Schema(description = "")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public PlaylistsAddToPlaylistInfo containsDuplicates(Boolean containsDuplicates) {
    this.containsDuplicates = containsDuplicates;
    return this;
  }

   /**
   * Get containsDuplicates
   * @return containsDuplicates
  **/
  @Schema(description = "")
  public Boolean isContainsDuplicates() {
    return containsDuplicates;
  }

  public void setContainsDuplicates(Boolean containsDuplicates) {
    this.containsDuplicates = containsDuplicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistsAddToPlaylistInfo playlistsAddToPlaylistInfo = (PlaylistsAddToPlaylistInfo) o;
    return Objects.equals(this.itemCount, playlistsAddToPlaylistInfo.itemCount) &&
        Objects.equals(this.containsDuplicates, playlistsAddToPlaylistInfo.containsDuplicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount, containsDuplicates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsAddToPlaylistInfo {\n");
    
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    containsDuplicates: ").append(toIndentedString(containsDuplicates)).append("\n");
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
