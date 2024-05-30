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
import io.swagger.client.model.ProgressEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiOnPlaybackProgress
 */


public class ApiOnPlaybackProgress {
  @SerializedName("PlaylistIndex")
  private Integer playlistIndex = null;

  @SerializedName("PlaylistLength")
  private Integer playlistLength = null;

  @SerializedName("Shuffle")
  private Boolean shuffle = null;

  @SerializedName("EventName")
  private ProgressEvent eventName = null;

  public ApiOnPlaybackProgress playlistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
    return this;
  }

   /**
   * Get playlistIndex
   * @return playlistIndex
  **/
  @Schema(description = "")
  public Integer getPlaylistIndex() {
    return playlistIndex;
  }

  public void setPlaylistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
  }

  public ApiOnPlaybackProgress playlistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
    return this;
  }

   /**
   * Get playlistLength
   * @return playlistLength
  **/
  @Schema(description = "")
  public Integer getPlaylistLength() {
    return playlistLength;
  }

  public void setPlaylistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
  }

  public ApiOnPlaybackProgress shuffle(Boolean shuffle) {
    this.shuffle = shuffle;
    return this;
  }

   /**
   * Get shuffle
   * @return shuffle
  **/
  @Schema(description = "")
  public Boolean isShuffle() {
    return shuffle;
  }

  public void setShuffle(Boolean shuffle) {
    this.shuffle = shuffle;
  }

  public ApiOnPlaybackProgress eventName(ProgressEvent eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @Schema(description = "")
  public ProgressEvent getEventName() {
    return eventName;
  }

  public void setEventName(ProgressEvent eventName) {
    this.eventName = eventName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOnPlaybackProgress apiOnPlaybackProgress = (ApiOnPlaybackProgress) o;
    return Objects.equals(this.playlistIndex, apiOnPlaybackProgress.playlistIndex) &&
        Objects.equals(this.playlistLength, apiOnPlaybackProgress.playlistLength) &&
        Objects.equals(this.shuffle, apiOnPlaybackProgress.shuffle) &&
        Objects.equals(this.eventName, apiOnPlaybackProgress.eventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playlistIndex, playlistLength, shuffle, eventName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOnPlaybackProgress {\n");
    
    sb.append("    playlistIndex: ").append(toIndentedString(playlistIndex)).append("\n");
    sb.append("    playlistLength: ").append(toIndentedString(playlistLength)).append("\n");
    sb.append("    shuffle: ").append(toIndentedString(shuffle)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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
