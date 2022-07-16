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
import io.swagger.client.model.DlnaSubtitleDeliveryMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DlnaSubtitleProfile
 */


public class DlnaSubtitleProfile {
  @SerializedName("Format")
  private String format = null;

  @SerializedName("Method")
  private DlnaSubtitleDeliveryMethod method = null;

  @SerializedName("DidlMode")
  private String didlMode = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public DlnaSubtitleProfile format(String format) {
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

  public DlnaSubtitleProfile method(DlnaSubtitleDeliveryMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public DlnaSubtitleDeliveryMethod getMethod() {
    return method;
  }

  public void setMethod(DlnaSubtitleDeliveryMethod method) {
    this.method = method;
  }

  public DlnaSubtitleProfile didlMode(String didlMode) {
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

  public DlnaSubtitleProfile language(String language) {
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

  public DlnaSubtitleProfile container(String container) {
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

  public DlnaSubtitleProfile protocol(String protocol) {
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
    DlnaSubtitleProfile dlnaSubtitleProfile = (DlnaSubtitleProfile) o;
    return Objects.equals(this.format, dlnaSubtitleProfile.format) &&
        Objects.equals(this.method, dlnaSubtitleProfile.method) &&
        Objects.equals(this.didlMode, dlnaSubtitleProfile.didlMode) &&
        Objects.equals(this.language, dlnaSubtitleProfile.language) &&
        Objects.equals(this.container, dlnaSubtitleProfile.container) &&
        Objects.equals(this.protocol, dlnaSubtitleProfile.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, method, didlMode, language, container, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaSubtitleProfile {\n");
    
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
