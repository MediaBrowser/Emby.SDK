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
 * MediaEncodingHwaConditionsConfigOperationConditions
 */


public class MediaEncodingHwaConditionsConfigOperationConditions {
  @SerializedName("Conversions")
  private Boolean conversions = null;

  @SerializedName("LiveTV")
  private Boolean liveTV = null;

  @SerializedName("Playback")
  private Boolean playback = null;

  @SerializedName("HlsPlayback")
  private Boolean hlsPlayback = null;

  @SerializedName("LiveStream")
  private Boolean liveStream = null;

  public MediaEncodingHwaConditionsConfigOperationConditions conversions(Boolean conversions) {
    this.conversions = conversions;
    return this;
  }

   /**
   * Offline conversions which are not related to an active playback session
   * @return conversions
  **/
  @Schema(description = "Offline conversions which are not related to an active playback session")
  public Boolean isConversions() {
    return conversions;
  }

  public void setConversions(Boolean conversions) {
    this.conversions = conversions;
  }

  public MediaEncodingHwaConditionsConfigOperationConditions liveTV(Boolean liveTV) {
    this.liveTV = liveTV;
    return this;
  }

   /**
   * Transcoding of Live TV
   * @return liveTV
  **/
  @Schema(description = "Transcoding of Live TV")
  public Boolean isLiveTV() {
    return liveTV;
  }

  public void setLiveTV(Boolean liveTV) {
    this.liveTV = liveTV;
  }

  public MediaEncodingHwaConditionsConfigOperationConditions playback(Boolean playback) {
    this.playback = playback;
    return this;
  }

   /**
   * Transcoding for an active playback session
   * @return playback
  **/
  @Schema(description = "Transcoding for an active playback session")
  public Boolean isPlayback() {
    return playback;
  }

  public void setPlayback(Boolean playback) {
    this.playback = playback;
  }

  public MediaEncodingHwaConditionsConfigOperationConditions hlsPlayback(Boolean hlsPlayback) {
    this.hlsPlayback = hlsPlayback;
    return this;
  }

   /**
   * HLS Transcoding for an active playback session
   * @return hlsPlayback
  **/
  @Schema(description = "HLS Transcoding for an active playback session")
  public Boolean isHlsPlayback() {
    return hlsPlayback;
  }

  public void setHlsPlayback(Boolean hlsPlayback) {
    this.hlsPlayback = hlsPlayback;
  }

  public MediaEncodingHwaConditionsConfigOperationConditions liveStream(Boolean liveStream) {
    this.liveStream = liveStream;
    return this;
  }

   /**
   * Transcoding of a live stream for an active playback session
   * @return liveStream
  **/
  @Schema(description = "Transcoding of a live stream for an active playback session")
  public Boolean isLiveStream() {
    return liveStream;
  }

  public void setLiveStream(Boolean liveStream) {
    this.liveStream = liveStream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncodingHwaConditionsConfigOperationConditions mediaEncodingHwaConditionsConfigOperationConditions = (MediaEncodingHwaConditionsConfigOperationConditions) o;
    return Objects.equals(this.conversions, mediaEncodingHwaConditionsConfigOperationConditions.conversions) &&
        Objects.equals(this.liveTV, mediaEncodingHwaConditionsConfigOperationConditions.liveTV) &&
        Objects.equals(this.playback, mediaEncodingHwaConditionsConfigOperationConditions.playback) &&
        Objects.equals(this.hlsPlayback, mediaEncodingHwaConditionsConfigOperationConditions.hlsPlayback) &&
        Objects.equals(this.liveStream, mediaEncodingHwaConditionsConfigOperationConditions.liveStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversions, liveTV, playback, hlsPlayback, liveStream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncodingHwaConditionsConfigOperationConditions {\n");
    
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    liveTV: ").append(toIndentedString(liveTV)).append("\n");
    sb.append("    playback: ").append(toIndentedString(playback)).append("\n");
    sb.append("    hlsPlayback: ").append(toIndentedString(hlsPlayback)).append("\n");
    sb.append("    liveStream: ").append(toIndentedString(liveStream)).append("\n");
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
