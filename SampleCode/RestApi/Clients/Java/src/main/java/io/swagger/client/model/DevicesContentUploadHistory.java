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
import io.swagger.client.model.DevicesLocalFileInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DevicesContentUploadHistory
 */


public class DevicesContentUploadHistory {
  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("FilesUploaded")
  private List<DevicesLocalFileInfo> filesUploaded = null;

  public DevicesContentUploadHistory deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @Schema(description = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DevicesContentUploadHistory filesUploaded(List<DevicesLocalFileInfo> filesUploaded) {
    this.filesUploaded = filesUploaded;
    return this;
  }

  public DevicesContentUploadHistory addFilesUploadedItem(DevicesLocalFileInfo filesUploadedItem) {
    if (this.filesUploaded == null) {
      this.filesUploaded = new ArrayList<DevicesLocalFileInfo>();
    }
    this.filesUploaded.add(filesUploadedItem);
    return this;
  }

   /**
   * Get filesUploaded
   * @return filesUploaded
  **/
  @Schema(description = "")
  public List<DevicesLocalFileInfo> getFilesUploaded() {
    return filesUploaded;
  }

  public void setFilesUploaded(List<DevicesLocalFileInfo> filesUploaded) {
    this.filesUploaded = filesUploaded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesContentUploadHistory devicesContentUploadHistory = (DevicesContentUploadHistory) o;
    return Objects.equals(this.deviceId, devicesContentUploadHistory.deviceId) &&
        Objects.equals(this.filesUploaded, devicesContentUploadHistory.filesUploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, filesUploaded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesContentUploadHistory {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    filesUploaded: ").append(toIndentedString(filesUploaded)).append("\n");
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
