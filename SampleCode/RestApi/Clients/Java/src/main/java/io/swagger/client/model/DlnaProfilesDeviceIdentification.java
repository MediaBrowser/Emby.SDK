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
import io.swagger.client.model.DlnaProfilesHttpHeaderInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DlnaProfilesDeviceIdentification
 */


public class DlnaProfilesDeviceIdentification {
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
  private List<DlnaProfilesHttpHeaderInfo> headers = null;

  public DlnaProfilesDeviceIdentification friendlyName(String friendlyName) {
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

  public DlnaProfilesDeviceIdentification modelNumber(String modelNumber) {
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

  public DlnaProfilesDeviceIdentification serialNumber(String serialNumber) {
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

  public DlnaProfilesDeviceIdentification modelName(String modelName) {
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

  public DlnaProfilesDeviceIdentification modelDescription(String modelDescription) {
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

  public DlnaProfilesDeviceIdentification deviceDescription(String deviceDescription) {
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

  public DlnaProfilesDeviceIdentification modelUrl(String modelUrl) {
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

  public DlnaProfilesDeviceIdentification manufacturer(String manufacturer) {
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

  public DlnaProfilesDeviceIdentification manufacturerUrl(String manufacturerUrl) {
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

  public DlnaProfilesDeviceIdentification headers(List<DlnaProfilesHttpHeaderInfo> headers) {
    this.headers = headers;
    return this;
  }

  public DlnaProfilesDeviceIdentification addHeadersItem(DlnaProfilesHttpHeaderInfo headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<DlnaProfilesHttpHeaderInfo>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Schema(description = "")
  public List<DlnaProfilesHttpHeaderInfo> getHeaders() {
    return headers;
  }

  public void setHeaders(List<DlnaProfilesHttpHeaderInfo> headers) {
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
    DlnaProfilesDeviceIdentification dlnaProfilesDeviceIdentification = (DlnaProfilesDeviceIdentification) o;
    return Objects.equals(this.friendlyName, dlnaProfilesDeviceIdentification.friendlyName) &&
        Objects.equals(this.modelNumber, dlnaProfilesDeviceIdentification.modelNumber) &&
        Objects.equals(this.serialNumber, dlnaProfilesDeviceIdentification.serialNumber) &&
        Objects.equals(this.modelName, dlnaProfilesDeviceIdentification.modelName) &&
        Objects.equals(this.modelDescription, dlnaProfilesDeviceIdentification.modelDescription) &&
        Objects.equals(this.deviceDescription, dlnaProfilesDeviceIdentification.deviceDescription) &&
        Objects.equals(this.modelUrl, dlnaProfilesDeviceIdentification.modelUrl) &&
        Objects.equals(this.manufacturer, dlnaProfilesDeviceIdentification.manufacturer) &&
        Objects.equals(this.manufacturerUrl, dlnaProfilesDeviceIdentification.manufacturerUrl) &&
        Objects.equals(this.headers, dlnaProfilesDeviceIdentification.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friendlyName, modelNumber, serialNumber, modelName, modelDescription, deviceDescription, modelUrl, manufacturer, manufacturerUrl, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaProfilesDeviceIdentification {\n");
    
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
