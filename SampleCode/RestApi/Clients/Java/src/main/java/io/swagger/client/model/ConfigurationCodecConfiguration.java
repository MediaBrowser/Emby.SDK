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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConfigurationCodecConfiguration
 */


public class ConfigurationCodecConfiguration {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("CodecId")
  private String codecId = null;

  public ConfigurationCodecConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public ConfigurationCodecConfiguration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ConfigurationCodecConfiguration codecId(String codecId) {
    this.codecId = codecId;
    return this;
  }

   /**
   * Get codecId
   * @return codecId
  **/
  @Schema(description = "")
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
    ConfigurationCodecConfiguration configurationCodecConfiguration = (ConfigurationCodecConfiguration) o;
    return Objects.equals(this.isEnabled, configurationCodecConfiguration.isEnabled) &&
        Objects.equals(this.priority, configurationCodecConfiguration.priority) &&
        Objects.equals(this.codecId, configurationCodecConfiguration.codecId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, priority, codecId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationCodecConfiguration {\n");
    
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
