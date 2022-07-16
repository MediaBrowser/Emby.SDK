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
 * ExternalIdInfo
 */


public class ExternalIdInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("UrlFormatString")
  private String urlFormatString = null;

  @SerializedName("IsSupportedAsIdentifier")
  private Boolean isSupportedAsIdentifier = null;

  public ExternalIdInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalIdInfo key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ExternalIdInfo urlFormatString(String urlFormatString) {
    this.urlFormatString = urlFormatString;
    return this;
  }

   /**
   * Get urlFormatString
   * @return urlFormatString
  **/
  @Schema(description = "")
  public String getUrlFormatString() {
    return urlFormatString;
  }

  public void setUrlFormatString(String urlFormatString) {
    this.urlFormatString = urlFormatString;
  }

  public ExternalIdInfo isSupportedAsIdentifier(Boolean isSupportedAsIdentifier) {
    this.isSupportedAsIdentifier = isSupportedAsIdentifier;
    return this;
  }

   /**
   * Get isSupportedAsIdentifier
   * @return isSupportedAsIdentifier
  **/
  @Schema(description = "")
  public Boolean isIsSupportedAsIdentifier() {
    return isSupportedAsIdentifier;
  }

  public void setIsSupportedAsIdentifier(Boolean isSupportedAsIdentifier) {
    this.isSupportedAsIdentifier = isSupportedAsIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdInfo externalIdInfo = (ExternalIdInfo) o;
    return Objects.equals(this.name, externalIdInfo.name) &&
        Objects.equals(this.key, externalIdInfo.key) &&
        Objects.equals(this.urlFormatString, externalIdInfo.urlFormatString) &&
        Objects.equals(this.isSupportedAsIdentifier, externalIdInfo.isSupportedAsIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, urlFormatString, isSupportedAsIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    urlFormatString: ").append(toIndentedString(urlFormatString)).append("\n");
    sb.append("    isSupportedAsIdentifier: ").append(toIndentedString(isSupportedAsIdentifier)).append("\n");
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
