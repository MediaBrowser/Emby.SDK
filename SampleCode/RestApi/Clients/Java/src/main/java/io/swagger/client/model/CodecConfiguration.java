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
 * CodecConfiguration
 */


public class CodecConfiguration {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("CodecId")
  private String codecId = null;

  public CodecConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * A value indicating whether the codec is enabled.
   * @return isEnabled
  **/
  @Schema(description = "A value indicating whether the codec is enabled.")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public CodecConfiguration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The selection priority for the codec.    Higher values mean higher priority.
   * @return priority
  **/
  @Schema(description = "The selection priority for the codec.    Higher values mean higher priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public CodecConfiguration codecId(String codecId) {
    this.codecId = codecId;
    return this;
  }

   /**
   * The codec identifier.
   * @return codecId
  **/
  @Schema(description = "The codec identifier.")
  public String getCodecId() {
    return codecId;
  }

  public void setCodecId(String codecId) {
    this.codecId = codecId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodecConfiguration codecConfiguration = (CodecConfiguration) o;
    return Objects.equals(this.isEnabled, codecConfiguration.isEnabled) &&
        Objects.equals(this.priority, codecConfiguration.priority) &&
        Objects.equals(this.codecId, codecConfiguration.codecId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, priority, codecId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodecConfiguration {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    codecId: ").append(toIndentedString(codecId)).append("\n");
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
