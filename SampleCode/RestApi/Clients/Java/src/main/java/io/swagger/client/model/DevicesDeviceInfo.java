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
import org.threeten.bp.OffsetDateTime;
/**
 * DevicesDeviceInfo
 */


public class DevicesDeviceInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InternalId")
  private Long internalId = null;

  @SerializedName("ReportedDeviceId")
  private String reportedDeviceId = null;

  @SerializedName("LastUserName")
  private String lastUserName = null;

  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("AppVersion")
  private String appVersion = null;

  @SerializedName("LastUserId")
  private String lastUserId = null;

  @SerializedName("DateLastActivity")
  private OffsetDateTime dateLastActivity = null;

  @SerializedName("IconUrl")
  private String iconUrl = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public DevicesDeviceInfo name(String name) {
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

  public DevicesDeviceInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier.
   * @return id
  **/
  @Schema(description = "The identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DevicesDeviceInfo internalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @Schema(description = "")
  public Long getInternalId() {
    return internalId;
  }

  public void setInternalId(Long internalId) {
    this.internalId = internalId;
  }

  public DevicesDeviceInfo reportedDeviceId(String reportedDeviceId) {
    this.reportedDeviceId = reportedDeviceId;
    return this;
  }

   /**
   * Get reportedDeviceId
   * @return reportedDeviceId
  **/
  @Schema(description = "")
  public String getReportedDeviceId() {
    return reportedDeviceId;
  }

  public void setReportedDeviceId(String reportedDeviceId) {
    this.reportedDeviceId = reportedDeviceId;
  }

  public DevicesDeviceInfo lastUserName(String lastUserName) {
    this.lastUserName = lastUserName;
    return this;
  }

   /**
   * The last name of the user.
   * @return lastUserName
  **/
  @Schema(description = "The last name of the user.")
  public String getLastUserName() {
    return lastUserName;
  }

  public void setLastUserName(String lastUserName) {
    this.lastUserName = lastUserName;
  }

  public DevicesDeviceInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * The name of the application.
   * @return appName
  **/
  @Schema(description = "The name of the application.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public DevicesDeviceInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * The application version.
   * @return appVersion
  **/
  @Schema(description = "The application version.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public DevicesDeviceInfo lastUserId(String lastUserId) {
    this.lastUserId = lastUserId;
    return this;
  }

   /**
   * The last user identifier.
   * @return lastUserId
  **/
  @Schema(description = "The last user identifier.")
  public String getLastUserId() {
    return lastUserId;
  }

  public void setLastUserId(String lastUserId) {
    this.lastUserId = lastUserId;
  }

  public DevicesDeviceInfo dateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
    return this;
  }

   /**
   * Get dateLastActivity
   * @return dateLastActivity
  **/
  @Schema(description = "")
  public OffsetDateTime getDateLastActivity() {
    return dateLastActivity;
  }

  public void setDateLastActivity(OffsetDateTime dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
  }

  public DevicesDeviceInfo iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @Schema(description = "")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public DevicesDeviceInfo ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesDeviceInfo devicesDeviceInfo = (DevicesDeviceInfo) o;
    return Objects.equals(this.name, devicesDeviceInfo.name) &&
        Objects.equals(this.id, devicesDeviceInfo.id) &&
        Objects.equals(this.internalId, devicesDeviceInfo.internalId) &&
        Objects.equals(this.reportedDeviceId, devicesDeviceInfo.reportedDeviceId) &&
        Objects.equals(this.lastUserName, devicesDeviceInfo.lastUserName) &&
        Objects.equals(this.appName, devicesDeviceInfo.appName) &&
        Objects.equals(this.appVersion, devicesDeviceInfo.appVersion) &&
        Objects.equals(this.lastUserId, devicesDeviceInfo.lastUserId) &&
        Objects.equals(this.dateLastActivity, devicesDeviceInfo.dateLastActivity) &&
        Objects.equals(this.iconUrl, devicesDeviceInfo.iconUrl) &&
        Objects.equals(this.ipAddress, devicesDeviceInfo.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, internalId, reportedDeviceId, lastUserName, appName, appVersion, lastUserId, dateLastActivity, iconUrl, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesDeviceInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    reportedDeviceId: ").append(toIndentedString(reportedDeviceId)).append("\n");
    sb.append("    lastUserName: ").append(toIndentedString(lastUserName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    lastUserId: ").append(toIndentedString(lastUserId)).append("\n");
    sb.append("    dateLastActivity: ").append(toIndentedString(dateLastActivity)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
