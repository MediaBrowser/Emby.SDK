/*
 * Emby REST API
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
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DevicesDeviceInfo lastUserName(String lastUserName) {
    this.lastUserName = lastUserName;
    return this;
  }

   /**
   * Get lastUserName
   * @return lastUserName
  **/
  @Schema(description = "")
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
   * Get appName
   * @return appName
  **/
  @Schema(description = "")
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
   * Get appVersion
   * @return appVersion
  **/
  @Schema(description = "")
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
   * Get lastUserId
   * @return lastUserId
  **/
  @Schema(description = "")
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
        Objects.equals(this.lastUserName, devicesDeviceInfo.lastUserName) &&
        Objects.equals(this.appName, devicesDeviceInfo.appName) &&
        Objects.equals(this.appVersion, devicesDeviceInfo.appVersion) &&
        Objects.equals(this.lastUserId, devicesDeviceInfo.lastUserId) &&
        Objects.equals(this.dateLastActivity, devicesDeviceInfo.dateLastActivity) &&
        Objects.equals(this.iconUrl, devicesDeviceInfo.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, lastUserName, appName, appVersion, lastUserId, dateLastActivity, iconUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesDeviceInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUserName: ").append(toIndentedString(lastUserName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    lastUserId: ").append(toIndentedString(lastUserId)).append("\n");
    sb.append("    dateLastActivity: ").append(toIndentedString(dateLastActivity)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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
