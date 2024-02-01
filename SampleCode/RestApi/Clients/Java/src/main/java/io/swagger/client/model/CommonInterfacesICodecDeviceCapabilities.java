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
 * CommonInterfacesICodecDeviceCapabilities
 */


public class CommonInterfacesICodecDeviceCapabilities {
  @SerializedName("SupportsHwUpload")
  private Boolean supportsHwUpload = null;

  @SerializedName("SupportsHwDownload")
  private Boolean supportsHwDownload = null;

  @SerializedName("SupportsStandaloneDeviceInit")
  private Boolean supportsStandaloneDeviceInit = null;

  @SerializedName("Supports10BitProcessing")
  private Boolean supports10BitProcessing = null;

  @SerializedName("SupportsNativeToneMapping")
  private Boolean supportsNativeToneMapping = null;

  public CommonInterfacesICodecDeviceCapabilities supportsHwUpload(Boolean supportsHwUpload) {
    this.supportsHwUpload = supportsHwUpload;
    return this;
  }

   /**
   * Get supportsHwUpload
   * @return supportsHwUpload
  **/
  @Schema(description = "")
  public Boolean isSupportsHwUpload() {
    return supportsHwUpload;
  }

  public void setSupportsHwUpload(Boolean supportsHwUpload) {
    this.supportsHwUpload = supportsHwUpload;
  }

  public CommonInterfacesICodecDeviceCapabilities supportsHwDownload(Boolean supportsHwDownload) {
    this.supportsHwDownload = supportsHwDownload;
    return this;
  }

   /**
   * Get supportsHwDownload
   * @return supportsHwDownload
  **/
  @Schema(description = "")
  public Boolean isSupportsHwDownload() {
    return supportsHwDownload;
  }

  public void setSupportsHwDownload(Boolean supportsHwDownload) {
    this.supportsHwDownload = supportsHwDownload;
  }

  public CommonInterfacesICodecDeviceCapabilities supportsStandaloneDeviceInit(Boolean supportsStandaloneDeviceInit) {
    this.supportsStandaloneDeviceInit = supportsStandaloneDeviceInit;
    return this;
  }

   /**
   * Get supportsStandaloneDeviceInit
   * @return supportsStandaloneDeviceInit
  **/
  @Schema(description = "")
  public Boolean isSupportsStandaloneDeviceInit() {
    return supportsStandaloneDeviceInit;
  }

  public void setSupportsStandaloneDeviceInit(Boolean supportsStandaloneDeviceInit) {
    this.supportsStandaloneDeviceInit = supportsStandaloneDeviceInit;
  }

  public CommonInterfacesICodecDeviceCapabilities supports10BitProcessing(Boolean supports10BitProcessing) {
    this.supports10BitProcessing = supports10BitProcessing;
    return this;
  }

   /**
   * Get supports10BitProcessing
   * @return supports10BitProcessing
  **/
  @Schema(description = "")
  public Boolean isSupports10BitProcessing() {
    return supports10BitProcessing;
  }

  public void setSupports10BitProcessing(Boolean supports10BitProcessing) {
    this.supports10BitProcessing = supports10BitProcessing;
  }

  public CommonInterfacesICodecDeviceCapabilities supportsNativeToneMapping(Boolean supportsNativeToneMapping) {
    this.supportsNativeToneMapping = supportsNativeToneMapping;
    return this;
  }

   /**
   * Get supportsNativeToneMapping
   * @return supportsNativeToneMapping
  **/
  @Schema(description = "")
  public Boolean isSupportsNativeToneMapping() {
    return supportsNativeToneMapping;
  }

  public void setSupportsNativeToneMapping(Boolean supportsNativeToneMapping) {
    this.supportsNativeToneMapping = supportsNativeToneMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonInterfacesICodecDeviceCapabilities commonInterfacesICodecDeviceCapabilities = (CommonInterfacesICodecDeviceCapabilities) o;
    return Objects.equals(this.supportsHwUpload, commonInterfacesICodecDeviceCapabilities.supportsHwUpload) &&
        Objects.equals(this.supportsHwDownload, commonInterfacesICodecDeviceCapabilities.supportsHwDownload) &&
        Objects.equals(this.supportsStandaloneDeviceInit, commonInterfacesICodecDeviceCapabilities.supportsStandaloneDeviceInit) &&
        Objects.equals(this.supports10BitProcessing, commonInterfacesICodecDeviceCapabilities.supports10BitProcessing) &&
        Objects.equals(this.supportsNativeToneMapping, commonInterfacesICodecDeviceCapabilities.supportsNativeToneMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsHwUpload, supportsHwDownload, supportsStandaloneDeviceInit, supports10BitProcessing, supportsNativeToneMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonInterfacesICodecDeviceCapabilities {\n");
    
    sb.append("    supportsHwUpload: ").append(toIndentedString(supportsHwUpload)).append("\n");
    sb.append("    supportsHwDownload: ").append(toIndentedString(supportsHwDownload)).append("\n");
    sb.append("    supportsStandaloneDeviceInit: ").append(toIndentedString(supportsStandaloneDeviceInit)).append("\n");
    sb.append("    supports10BitProcessing: ").append(toIndentedString(supports10BitProcessing)).append("\n");
    sb.append("    supportsNativeToneMapping: ").append(toIndentedString(supportsNativeToneMapping)).append("\n");
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
