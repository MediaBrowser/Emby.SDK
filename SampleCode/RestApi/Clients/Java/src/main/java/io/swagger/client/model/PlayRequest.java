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
 * Class PlayRequest  
 */
@Schema(description = "Class PlayRequest  ")

public class PlayRequest {
  @SerializedName("ControllingUserId")
  private String controllingUserId = null;

  @SerializedName("SubtitleStreamIndex")
  private Integer subtitleStreamIndex = null;

  @SerializedName("AudioStreamIndex")
  private Integer audioStreamIndex = null;

  @SerializedName("MediaSourceId")
  private String mediaSourceId = null;

  @SerializedName("StartIndex")
  private Integer startIndex = null;

  public PlayRequest controllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
    return this;
  }

   /**
   * The controlling user identifier.
   * @return controllingUserId
  **/
  @Schema(description = "The controlling user identifier.")
  public String getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(String controllingUserId) {
    this.controllingUserId = controllingUserId;
  }

  public PlayRequest subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
    return this;
  }

   /**
   * Get subtitleStreamIndex
   * @return subtitleStreamIndex
  **/
  @Schema(description = "")
  public Integer getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlayRequest audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
    return this;
  }

   /**
   * Get audioStreamIndex
   * @return audioStreamIndex
  **/
  @Schema(description = "")
  public Integer getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlayRequest mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
    return this;
  }

   /**
   * Get mediaSourceId
   * @return mediaSourceId
  **/
  @Schema(description = "")
  public String getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlayRequest startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @Schema(description = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayRequest playRequest = (PlayRequest) o;
    return Objects.equals(this.controllingUserId, playRequest.controllingUserId) &&
        Objects.equals(this.subtitleStreamIndex, playRequest.subtitleStreamIndex) &&
        Objects.equals(this.audioStreamIndex, playRequest.audioStreamIndex) &&
        Objects.equals(this.mediaSourceId, playRequest.mediaSourceId) &&
        Objects.equals(this.startIndex, playRequest.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllingUserId, subtitleStreamIndex, audioStreamIndex, mediaSourceId, startIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayRequest {\n");
    
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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
