/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.EmbyDlnaProfilesHttpHeaderInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyDlnaProfilesDeviceIdentification
 */


public class EmbyDlnaProfilesDeviceIdentification {
  @SerializedName("FriendlyName")
  private String friendlyName = null;

  @SerializedName("ModelNumber")
  private String modelNumber = null;

  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("ModelName")
  private String modelName = null;

  @SerializedName("ModelDescription")
  private String modelDescription = null;

  @SerializedName("DeviceDescription")
  private String deviceDescription = null;

  @SerializedName("ModelUrl")
  private String modelUrl = null;

  @SerializedName("Manufacturer")
  private String manufacturer = null;

  @SerializedName("ManufacturerUrl")
  private String manufacturerUrl = null;

  @SerializedName("Headers")
  private List<EmbyDlnaProfilesHttpHeaderInfo> headers = null;

  public EmbyDlnaProfilesDeviceIdentification friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @Schema(description = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public EmbyDlnaProfilesDeviceIdentification modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

   /**
   * Get modelNumber
   * @return modelNumber
  **/
  @Schema(description = "")
  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public EmbyDlnaProfilesDeviceIdentification serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @Schema(description = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public EmbyDlnaProfilesDeviceIdentification modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @Schema(description = "")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public EmbyDlnaProfilesDeviceIdentification modelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
    return this;
  }

   /**
   * Get modelDescription
   * @return modelDescription
  **/
  @Schema(description = "")
  public String getModelDescription() {
    return modelDescription;
  }

  public void setModelDescription(String modelDescription) {
    this.modelDescription = modelDescription;
  }

  public EmbyDlnaProfilesDeviceIdentification deviceDescription(String deviceDescription) {
    this.deviceDescription = deviceDescription;
    return this;
  }

   /**
   * Get deviceDescription
   * @return deviceDescription
  **/
  @Schema(description = "")
  public String getDeviceDescription() {
    return deviceDescription;
  }

  public void setDeviceDescription(String deviceDescription) {
    this.deviceDescription = deviceDescription;
  }

  public EmbyDlnaProfilesDeviceIdentification modelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
    return this;
  }

   /**
   * Get modelUrl
   * @return modelUrl
  **/
  @Schema(description = "")
  public String getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
  }

  public EmbyDlnaProfilesDeviceIdentification manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @Schema(description = "")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public EmbyDlnaProfilesDeviceIdentification manufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
    return this;
  }

   /**
   * Get manufacturerUrl
   * @return manufacturerUrl
  **/
  @Schema(description = "")
  public String getManufacturerUrl() {
    return manufacturerUrl;
  }

  public void setManufacturerUrl(String manufacturerUrl) {
    this.manufacturerUrl = manufacturerUrl;
  }

  public EmbyDlnaProfilesDeviceIdentification headers(List<EmbyDlnaProfilesHttpHeaderInfo> headers) {
    this.headers = headers;
    return this;
  }

  public EmbyDlnaProfilesDeviceIdentification addHeadersItem(EmbyDlnaProfilesHttpHeaderInfo headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<EmbyDlnaProfilesHttpHeaderInfo>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Schema(description = "")
  public List<EmbyDlnaProfilesHttpHeaderInfo> getHeaders() {
    return headers;
  }

  public void setHeaders(List<EmbyDlnaProfilesHttpHeaderInfo> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyDlnaProfilesDeviceIdentification embyDlnaProfilesDeviceIdentification = (EmbyDlnaProfilesDeviceIdentification) o;
    return Objects.equals(this.friendlyName, embyDlnaProfilesDeviceIdentification.friendlyName) &&
        Objects.equals(this.modelNumber, embyDlnaProfilesDeviceIdentification.modelNumber) &&
        Objects.equals(this.serialNumber, embyDlnaProfilesDeviceIdentification.serialNumber) &&
        Objects.equals(this.modelName, embyDlnaProfilesDeviceIdentification.modelName) &&
        Objects.equals(this.modelDescription, embyDlnaProfilesDeviceIdentification.modelDescription) &&
        Objects.equals(this.deviceDescription, embyDlnaProfilesDeviceIdentification.deviceDescription) &&
        Objects.equals(this.modelUrl, embyDlnaProfilesDeviceIdentification.modelUrl) &&
        Objects.equals(this.manufacturer, embyDlnaProfilesDeviceIdentification.manufacturer) &&
        Objects.equals(this.manufacturerUrl, embyDlnaProfilesDeviceIdentification.manufacturerUrl) &&
        Objects.equals(this.headers, embyDlnaProfilesDeviceIdentification.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendlyName, modelNumber, serialNumber, modelName, modelDescription, deviceDescription, modelUrl, manufacturer, manufacturerUrl, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyDlnaProfilesDeviceIdentification {\n");
    
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelDescription: ").append(toIndentedString(modelDescription)).append("\n");
    sb.append("    deviceDescription: ").append(toIndentedString(deviceDescription)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerUrl: ").append(toIndentedString(manufacturerUrl)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
