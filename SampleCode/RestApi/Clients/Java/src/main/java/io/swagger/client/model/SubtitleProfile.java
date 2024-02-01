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
import io.swagger.client.model.SubtitleDeliveryMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SubtitleProfile
 */


public class SubtitleProfile {
  @SerializedName("Format")
  private String format = null;

  @SerializedName("Method")
  private SubtitleDeliveryMethod method = null;

  @SerializedName("DidlMode")
  private String didlMode = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public SubtitleProfile format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public SubtitleProfile method(SubtitleDeliveryMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public SubtitleDeliveryMethod getMethod() {
    return method;
  }

  public void setMethod(SubtitleDeliveryMethod method) {
    this.method = method;
  }

  public SubtitleProfile didlMode(String didlMode) {
    this.didlMode = didlMode;
    return this;
  }

   /**
   * Get didlMode
   * @return didlMode
  **/
  @Schema(description = "")
  public String getDidlMode() {
    return didlMode;
  }

  public void setDidlMode(String didlMode) {
    this.didlMode = didlMode;
  }

  public SubtitleProfile language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public SubtitleProfile container(String container) {
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

  public SubtitleProfile protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtitleProfile subtitleProfile = (SubtitleProfile) o;
    return Objects.equals(this.format, subtitleProfile.format) &&
        Objects.equals(this.method, subtitleProfile.method) &&
        Objects.equals(this.didlMode, subtitleProfile.didlMode) &&
        Objects.equals(this.language, subtitleProfile.language) &&
        Objects.equals(this.container, subtitleProfile.container) &&
        Objects.equals(this.protocol, subtitleProfile.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, method, didlMode, language, container, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtitleProfile {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    didlMode: ").append(toIndentedString(didlMode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
