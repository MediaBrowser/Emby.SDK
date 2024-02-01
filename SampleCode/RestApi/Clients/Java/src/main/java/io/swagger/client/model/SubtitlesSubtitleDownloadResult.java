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
 * SubtitlesSubtitleDownloadResult
 */


public class SubtitlesSubtitleDownloadResult {
  @SerializedName("NewIndex")
  private Integer newIndex = null;

  public SubtitlesSubtitleDownloadResult newIndex(Integer newIndex) {
    this.newIndex = newIndex;
    return this;
  }

   /**
   * Get newIndex
   * @return newIndex
  **/
  @Schema(description = "")
  public Integer getNewIndex() {
    return newIndex;
  }

  public void setNewIndex(Integer newIndex) {
    this.newIndex = newIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtitlesSubtitleDownloadResult subtitlesSubtitleDownloadResult = (SubtitlesSubtitleDownloadResult) o;
    return Objects.equals(this.newIndex, subtitlesSubtitleDownloadResult.newIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtitlesSubtitleDownloadResult {\n");
    
    sb.append("    newIndex: ").append(toIndentedString(newIndex)).append("\n");
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
