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
import io.swagger.client.model.MediaSourceInfo;
import io.swagger.client.model.PlaybackErrorCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PlaybackInfoResponse
 */


public class PlaybackInfoResponse {
  @SerializedName("MediaSources")
  private List<MediaSourceInfo> mediaSources = null;

  @SerializedName("PlaySessionId")
  private String playSessionId = null;

  @SerializedName("ErrorCode")
  private PlaybackErrorCode errorCode = null;

  public PlaybackInfoResponse mediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
    return this;
  }

  public PlaybackInfoResponse addMediaSourcesItem(MediaSourceInfo mediaSourcesItem) {
    if (this.mediaSources == null) {
      this.mediaSources = new ArrayList<MediaSourceInfo>();
    }
    this.mediaSources.add(mediaSourcesItem);
    return this;
  }

   /**
   * The media sources.
   * @return mediaSources
  **/
  @Schema(description = "The media sources.")
  public List<MediaSourceInfo> getMediaSources() {
    return mediaSources;
  }

  public void setMediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
  }

  public PlaybackInfoResponse playSessionId(String playSessionId) {
    this.playSessionId = playSessionId;
    return this;
  }

   /**
   * The play session identifier.
   * @return playSessionId
  **/
  @Schema(description = "The play session identifier.")
  public String getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(String playSessionId) {
    this.playSessionId = playSessionId;
  }

  public PlaybackInfoResponse errorCode(PlaybackErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public PlaybackErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(PlaybackErrorCode errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackInfoResponse playbackInfoResponse = (PlaybackInfoResponse) o;
    return Objects.equals(this.mediaSources, playbackInfoResponse.mediaSources) &&
        Objects.equals(this.playSessionId, playbackInfoResponse.playSessionId) &&
        Objects.equals(this.errorCode, playbackInfoResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaSources, playSessionId, errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackInfoResponse {\n");
    
    sb.append("    mediaSources: ").append(toIndentedString(mediaSources)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
