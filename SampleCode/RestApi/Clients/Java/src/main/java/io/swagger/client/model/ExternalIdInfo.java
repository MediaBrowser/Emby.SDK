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
 * ExternalIdInfo
 */


public class ExternalIdInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Website")
  private String website = null;

  @SerializedName("UrlFormatString")
  private String urlFormatString = null;

  @SerializedName("IsSupportedAsIdentifier")
  private Boolean isSupportedAsIdentifier = null;

  public ExternalIdInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
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
   * The key.
   * @return key
  **/
  @Schema(description = "The key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ExternalIdInfo website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public ExternalIdInfo urlFormatString(String urlFormatString) {
    this.urlFormatString = urlFormatString;
    return this;
  }

   /**
   * The URL format string.
   * @return urlFormatString
  **/
  @Schema(description = "The URL format string.")
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
        Objects.equals(this.website, externalIdInfo.website) &&
        Objects.equals(this.urlFormatString, externalIdInfo.urlFormatString) &&
        Objects.equals(this.isSupportedAsIdentifier, externalIdInfo.isSupportedAsIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, website, urlFormatString, isSupportedAsIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
