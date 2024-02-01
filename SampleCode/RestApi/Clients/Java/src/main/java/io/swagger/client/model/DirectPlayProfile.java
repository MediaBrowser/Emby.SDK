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
import io.swagger.client.model.DlnaProfileType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DirectPlayProfile
 */


public class DirectPlayProfile {
  @SerializedName("Container")
  private String container = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("Type")
  private DlnaProfileType type = null;

  public DirectPlayProfile container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public DirectPlayProfile audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * Get audioCodec
   * @return audioCodec
  **/
  @Schema(description = "")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public DirectPlayProfile videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * Get videoCodec
   * @return videoCodec
  **/
  @Schema(description = "")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public DirectPlayProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectPlayProfile directPlayProfile = (DirectPlayProfile) o;
    return Objects.equals(this.container, directPlayProfile.container) &&
        Objects.equals(this.audioCodec, directPlayProfile.audioCodec) &&
        Objects.equals(this.videoCodec, directPlayProfile.videoCodec) &&
        Objects.equals(this.type, directPlayProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, audioCodec, videoCodec, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectPlayProfile {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
