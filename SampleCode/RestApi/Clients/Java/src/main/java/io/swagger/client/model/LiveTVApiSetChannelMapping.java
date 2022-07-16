/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
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
 * LiveTVApiSetChannelMapping
 */


public class LiveTVApiSetChannelMapping {
  @SerializedName("TunerChannelId")
  private String tunerChannelId = null;

  @SerializedName("ProviderChannelId")
  private String providerChannelId = null;

  public LiveTVApiSetChannelMapping tunerChannelId(String tunerChannelId) {
    this.tunerChannelId = tunerChannelId;
    return this;
  }

   /**
   * Get tunerChannelId
   * @return tunerChannelId
  **/
  @Schema(description = "")
  public String getTunerChannelId() {
    return tunerChannelId;
  }

  public void setTunerChannelId(String tunerChannelId) {
    this.tunerChannelId = tunerChannelId;
  }

  public LiveTVApiSetChannelMapping providerChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
    return this;
  }

   /**
   * Get providerChannelId
   * @return providerChannelId
  **/
  @Schema(description = "")
  public String getProviderChannelId() {
    return providerChannelId;
  }

  public void setProviderChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveTVApiSetChannelMapping liveTVApiSetChannelMapping = (LiveTVApiSetChannelMapping) o;
    return Objects.equals(this.tunerChannelId, liveTVApiSetChannelMapping.tunerChannelId) &&
        Objects.equals(this.providerChannelId, liveTVApiSetChannelMapping.providerChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tunerChannelId, providerChannelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveTVApiSetChannelMapping {\n");
    
    sb.append("    tunerChannelId: ").append(toIndentedString(tunerChannelId)).append("\n");
    sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
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
