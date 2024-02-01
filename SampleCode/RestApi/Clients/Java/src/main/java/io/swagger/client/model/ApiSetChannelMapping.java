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
 * ApiSetChannelMapping
 */


public class ApiSetChannelMapping {
  @SerializedName("TunerChannelId")
  private String tunerChannelId = null;

  @SerializedName("ProviderChannelId")
  private String providerChannelId = null;

  public ApiSetChannelMapping tunerChannelId(String tunerChannelId) {
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

  public ApiSetChannelMapping providerChannelId(String providerChannelId) {
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
    ApiSetChannelMapping apiSetChannelMapping = (ApiSetChannelMapping) o;
    return Objects.equals(this.tunerChannelId, apiSetChannelMapping.tunerChannelId) &&
        Objects.equals(this.providerChannelId, apiSetChannelMapping.providerChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tunerChannelId, providerChannelId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSetChannelMapping {\n");
    
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
