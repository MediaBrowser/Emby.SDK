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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * UserNotificationInfo
 */


public class UserNotificationInfo {
  @SerializedName("NotifierKey")
  private String notifierKey = null;

  @SerializedName("SetupModuleUrl")
  private String setupModuleUrl = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("PluginId")
  private String pluginId = null;

  @SerializedName("FriendlyName")
  private String friendlyName = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("UserIds")
  private List<String> userIds = null;

  @SerializedName("DeviceIds")
  private List<String> deviceIds = null;

  @SerializedName("LibraryIds")
  private List<String> libraryIds = null;

  @SerializedName("EventIds")
  private List<String> eventIds = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("IsSelfNotification")
  private Boolean isSelfNotification = null;

  @SerializedName("GroupItems")
  private Boolean groupItems = null;

  @SerializedName("Options")
  private Map<String, String> options = null;

  public UserNotificationInfo notifierKey(String notifierKey) {
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

  public UserNotificationInfo setupModuleUrl(String setupModuleUrl) {
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

  public UserNotificationInfo serviceName(String serviceName) {
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

  public UserNotificationInfo pluginId(String pluginId) {
    this.pluginId = pluginId;
    return this;
  }

   /**
   * Get pluginId
   * @return pluginId
  **/
  @Schema(description = "")
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }

  public UserNotificationInfo friendlyName(String friendlyName) {
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

  public UserNotificationInfo id(String id) {
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

  public UserNotificationInfo enabled(Boolean enabled) {
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

  public UserNotificationInfo userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public UserNotificationInfo addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<String>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Limit events based on user ids, for admin notifications
   * @return userIds
  **/
  @Schema(description = "Limit events based on user ids, for admin notifications")
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  public UserNotificationInfo deviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public UserNotificationInfo addDeviceIdsItem(String deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<String>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @Schema(description = "")
  public List<String> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public UserNotificationInfo libraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
    return this;
  }

  public UserNotificationInfo addLibraryIdsItem(String libraryIdsItem) {
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

  public UserNotificationInfo eventIds(List<String> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public UserNotificationInfo addEventIdsItem(String eventIdsItem) {
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

  public UserNotificationInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Notification intended for a specific user
   * @return userId
  **/
  @Schema(description = "Notification intended for a specific user")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserNotificationInfo isSelfNotification(Boolean isSelfNotification) {
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

  public UserNotificationInfo groupItems(Boolean groupItems) {
    this.groupItems = groupItems;
    return this;
  }

   /**
   * Get groupItems
   * @return groupItems
  **/
  @Schema(description = "")
  public Boolean isGroupItems() {
    return groupItems;
  }

  public void setGroupItems(Boolean groupItems) {
    this.groupItems = groupItems;
  }

  public UserNotificationInfo options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public UserNotificationInfo putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * This is for webhooks since this will cause xml serialization to fail
   * @return options
  **/
  @Schema(description = "This is for webhooks since this will cause xml serialization to fail")
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
    UserNotificationInfo userNotificationInfo = (UserNotificationInfo) o;
    return Objects.equals(this.notifierKey, userNotificationInfo.notifierKey) &&
        Objects.equals(this.setupModuleUrl, userNotificationInfo.setupModuleUrl) &&
        Objects.equals(this.serviceName, userNotificationInfo.serviceName) &&
        Objects.equals(this.pluginId, userNotificationInfo.pluginId) &&
        Objects.equals(this.friendlyName, userNotificationInfo.friendlyName) &&
        Objects.equals(this.id, userNotificationInfo.id) &&
        Objects.equals(this.enabled, userNotificationInfo.enabled) &&
        Objects.equals(this.userIds, userNotificationInfo.userIds) &&
        Objects.equals(this.deviceIds, userNotificationInfo.deviceIds) &&
        Objects.equals(this.libraryIds, userNotificationInfo.libraryIds) &&
        Objects.equals(this.eventIds, userNotificationInfo.eventIds) &&
        Objects.equals(this.userId, userNotificationInfo.userId) &&
        Objects.equals(this.isSelfNotification, userNotificationInfo.isSelfNotification) &&
        Objects.equals(this.groupItems, userNotificationInfo.groupItems) &&
        Objects.equals(this.options, userNotificationInfo.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifierKey, setupModuleUrl, serviceName, pluginId, friendlyName, id, enabled, userIds, deviceIds, libraryIds, eventIds, userId, isSelfNotification, groupItems, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationInfo {\n");
    
    sb.append("    notifierKey: ").append(toIndentedString(notifierKey)).append("\n");
    sb.append("    setupModuleUrl: ").append(toIndentedString(setupModuleUrl)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    libraryIds: ").append(toIndentedString(libraryIds)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isSelfNotification: ").append(toIndentedString(isSelfNotification)).append("\n");
    sb.append("    groupItems: ").append(toIndentedString(groupItems)).append("\n");
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
