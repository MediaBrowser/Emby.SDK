/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DlnaPlaybackErrorCode;
import io.swagger.client.model.MediaSourceInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MediaInfoPlaybackInfoResponse
 */


public class MediaInfoPlaybackInfoResponse {
  @SerializedName("MediaSources")
  private List<MediaSourceInfo> mediaSources = null;

  @SerializedName("PlaySessionId")
  private String playSessionId = null;

  @SerializedName("ErrorCode")
  private DlnaPlaybackErrorCode errorCode = null;

  public MediaInfoPlaybackInfoResponse mediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
    return this;
  }

  public MediaInfoPlaybackInfoResponse addMediaSourcesItem(MediaSourceInfo mediaSourcesItem) {
    if (this.mediaSources == null) {
      this.mediaSources = new ArrayList<MediaSourceInfo>();
    }
    this.mediaSources.add(mediaSourcesItem);
    return this;
  }

   /**
   * Get mediaSources
   * @return mediaSources
  **/
  @Schema(description = "")
  public List<MediaSourceInfo> getMediaSources() {
    return mediaSources;
  }

  public void setMediaSources(List<MediaSourceInfo> mediaSources) {
    this.mediaSources = mediaSources;
  }

  public MediaInfoPlaybackInfoResponse playSessionId(String playSessionId) {
    this.playSessionId = playSessionId;
    return this;
  }

   /**
   * Get playSessionId
   * @return playSessionId
  **/
  @Schema(description = "")
  public String getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(String playSessionId) {
    this.playSessionId = playSessionId;
  }

  public MediaInfoPlaybackInfoResponse errorCode(DlnaPlaybackErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public DlnaPlaybackErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(DlnaPlaybackErrorCode errorCode) {
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
    MediaInfoPlaybackInfoResponse mediaInfoPlaybackInfoResponse = (MediaInfoPlaybackInfoResponse) o;
    return Objects.equals(this.mediaSources, mediaInfoPlaybackInfoResponse.mediaSources) &&
        Objects.equals(this.playSessionId, mediaInfoPlaybackInfoResponse.playSessionId) &&
        Objects.equals(this.errorCode, mediaInfoPlaybackInfoResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaSources, playSessionId, errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaInfoPlaybackInfoResponse {\n");
    
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
