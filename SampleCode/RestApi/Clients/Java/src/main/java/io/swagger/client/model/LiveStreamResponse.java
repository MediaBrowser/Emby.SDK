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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LiveStreamResponse
 */


public class LiveStreamResponse {
  @SerializedName("MediaSource")
  private MediaSourceInfo mediaSource = null;

  public LiveStreamResponse mediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

   /**
   * Get mediaSource
   * @return mediaSource
  **/
  @Schema(description = "")
  public MediaSourceInfo getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamResponse liveStreamResponse = (LiveStreamResponse) o;
    return Objects.equals(this.mediaSource, liveStreamResponse.mediaSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamResponse {\n");
    
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
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
