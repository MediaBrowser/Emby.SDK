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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * EmbyNotificationsUserNotificationInfo
 */


public class EmbyNotificationsUserNotificationInfo {
  @SerializedName("NotifierKey")
  private String notifierKey = null;

  @SerializedName("SetupModuleUrl")
  private String setupModuleUrl = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("FriendlyName")
  private String friendlyName = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("UserIds")
  private List<String> userIds = null;

  @SerializedName("LibraryIds")
  private List<String> libraryIds = null;

  @SerializedName("EventIds")
  private List<String> eventIds = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("IsSelfNotification")
  private Boolean isSelfNotification = null;

  @SerializedName("Options")
  private Map<String, String> options = null;

  public EmbyNotificationsUserNotificationInfo notifierKey(String notifierKey) {
    this.notifierKey = notifierKey;
    return this;
  }

   /**
   * Get notifierKey
   * @return notifierKey
  **/
  @Schema(description = "")
  public String getNotifierKey() {
    return notifierKey;
  }

  public void setNotifierKey(String notifierKey) {
    this.notifierKey = notifierKey;
  }

  public EmbyNotificationsUserNotificationInfo setupModuleUrl(String setupModuleUrl) {
    this.setupModuleUrl = setupModuleUrl;
    return this;
  }

   /**
   * Get setupModuleUrl
   * @return setupModuleUrl
  **/
  @Schema(description = "")
  public String getSetupModuleUrl() {
    return setupModuleUrl;
  }

  public void setSetupModuleUrl(String setupModuleUrl) {
    this.setupModuleUrl = setupModuleUrl;
  }

  public EmbyNotificationsUserNotificationInfo serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public EmbyNotificationsUserNotificationInfo friendlyName(String friendlyName) {
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

  public EmbyNotificationsUserNotificationInfo id(String id) {
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

  public EmbyNotificationsUserNotificationInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public EmbyNotificationsUserNotificationInfo userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public EmbyNotificationsUserNotificationInfo addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<String>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @Schema(description = "")
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  public EmbyNotificationsUserNotificationInfo libraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
    return this;
  }

  public EmbyNotificationsUserNotificationInfo addLibraryIdsItem(String libraryIdsItem) {
    if (this.libraryIds == null) {
      this.libraryIds = new ArrayList<String>();
    }
    this.libraryIds.add(libraryIdsItem);
    return this;
  }

   /**
   * Get libraryIds
   * @return libraryIds
  **/
  @Schema(description = "")
  public List<String> getLibraryIds() {
    return libraryIds;
  }

  public void setLibraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
  }

  public EmbyNotificationsUserNotificationInfo eventIds(List<String> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public EmbyNotificationsUserNotificationInfo addEventIdsItem(String eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<String>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @Schema(description = "")
  public List<String> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<String> eventIds) {
    this.eventIds = eventIds;
  }

  public EmbyNotificationsUserNotificationInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EmbyNotificationsUserNotificationInfo isSelfNotification(Boolean isSelfNotification) {
    this.isSelfNotification = isSelfNotification;
    return this;
  }

   /**
   * Get isSelfNotification
   * @return isSelfNotification
  **/
  @Schema(description = "")
  public Boolean isIsSelfNotification() {
    return isSelfNotification;
  }

  public void setIsSelfNotification(Boolean isSelfNotification) {
    this.isSelfNotification = isSelfNotification;
  }

  public EmbyNotificationsUserNotificationInfo options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public EmbyNotificationsUserNotificationInfo putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyNotificationsUserNotificationInfo embyNotificationsUserNotificationInfo = (EmbyNotificationsUserNotificationInfo) o;
    return Objects.equals(this.notifierKey, embyNotificationsUserNotificationInfo.notifierKey) &&
        Objects.equals(this.setupModuleUrl, embyNotificationsUserNotificationInfo.setupModuleUrl) &&
        Objects.equals(this.serviceName, embyNotificationsUserNotificationInfo.serviceName) &&
        Objects.equals(this.friendlyName, embyNotificationsUserNotificationInfo.friendlyName) &&
        Objects.equals(this.id, embyNotificationsUserNotificationInfo.id) &&
        Objects.equals(this.enabled, embyNotificationsUserNotificationInfo.enabled) &&
        Objects.equals(this.userIds, embyNotificationsUserNotificationInfo.userIds) &&
        Objects.equals(this.libraryIds, embyNotificationsUserNotificationInfo.libraryIds) &&
        Objects.equals(this.eventIds, embyNotificationsUserNotificationInfo.eventIds) &&
        Objects.equals(this.userId, embyNotificationsUserNotificationInfo.userId) &&
        Objects.equals(this.isSelfNotification, embyNotificationsUserNotificationInfo.isSelfNotification) &&
        Objects.equals(this.options, embyNotificationsUserNotificationInfo.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifierKey, setupModuleUrl, serviceName, friendlyName, id, enabled, userIds, libraryIds, eventIds, userId, isSelfNotification, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyNotificationsUserNotificationInfo {\n");
    
    sb.append("    notifierKey: ").append(toIndentedString(notifierKey)).append("\n");
    sb.append("    setupModuleUrl: ").append(toIndentedString(setupModuleUrl)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    libraryIds: ").append(toIndentedString(libraryIds)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isSelfNotification: ").append(toIndentedString(isSelfNotification)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
