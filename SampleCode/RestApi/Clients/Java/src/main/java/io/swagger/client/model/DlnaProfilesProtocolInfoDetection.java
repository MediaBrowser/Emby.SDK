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
 * DlnaProfilesProtocolInfoDetection
 */


public class DlnaProfilesProtocolInfoDetection {
  @SerializedName("EnabledForVideo")
  private Boolean enabledForVideo = null;

  @SerializedName("EnabledForAudio")
  private Boolean enabledForAudio = null;

  @SerializedName("EnabledForPhotos")
  private Boolean enabledForPhotos = null;

  public DlnaProfilesProtocolInfoDetection enabledForVideo(Boolean enabledForVideo) {
    this.enabledForVideo = enabledForVideo;
    return this;
  }

   /**
   * Get enabledForVideo
   * @return enabledForVideo
  **/
  @Schema(description = "")
  public Boolean isEnabledForVideo() {
    return enabledForVideo;
  }

  public void setEnabledForVideo(Boolean enabledForVideo) {
    this.enabledForVideo = enabledForVideo;
  }

  public DlnaProfilesProtocolInfoDetection enabledForAudio(Boolean enabledForAudio) {
    this.enabledForAudio = enabledForAudio;
    return this;
  }

   /**
   * Get enabledForAudio
   * @return enabledForAudio
  **/
  @Schema(description = "")
  public Boolean isEnabledForAudio() {
    return enabledForAudio;
  }

  public void setEnabledForAudio(Boolean enabledForAudio) {
    this.enabledForAudio = enabledForAudio;
  }

  public DlnaProfilesProtocolInfoDetection enabledForPhotos(Boolean enabledForPhotos) {
    this.enabledForPhotos = enabledForPhotos;
    return this;
  }

   /**
   * Get enabledForPhotos
   * @return enabledForPhotos
  **/
  @Schema(description = "")
  public Boolean isEnabledForPhotos() {
    return enabledForPhotos;
  }

  public void setEnabledForPhotos(Boolean enabledForPhotos) {
    this.enabledForPhotos = enabledForPhotos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlnaProfilesProtocolInfoDetection dlnaProfilesProtocolInfoDetection = (DlnaProfilesProtocolInfoDetection) o;
    return Objects.equals(this.enabledForVideo, dlnaProfilesProtocolInfoDetection.enabledForVideo) &&
        Objects.equals(this.enabledForAudio, dlnaProfilesProtocolInfoDetection.enabledForAudio) &&
        Objects.equals(this.enabledForPhotos, dlnaProfilesProtocolInfoDetection.enabledForPhotos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledForVideo, enabledForAudio, enabledForPhotos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaProfilesProtocolInfoDetection {\n");
    
    sb.append("    enabledForVideo: ").append(toIndentedString(enabledForVideo)).append("\n");
    sb.append("    enabledForAudio: ").append(toIndentedString(enabledForAudio)).append("\n");
    sb.append("    enabledForPhotos: ").append(toIndentedString(enabledForPhotos)).append("\n");
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
