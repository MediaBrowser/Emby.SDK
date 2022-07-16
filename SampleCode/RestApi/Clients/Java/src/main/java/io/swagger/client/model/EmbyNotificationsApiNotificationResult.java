/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EmbyNotificationsApiNotification;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyNotificationsApiNotificationResult
 */


public class EmbyNotificationsApiNotificationResult {
  @SerializedName("Notifications")
  private List<EmbyNotificationsApiNotification> notifications = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public EmbyNotificationsApiNotificationResult notifications(List<EmbyNotificationsApiNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public EmbyNotificationsApiNotificationResult addNotificationsItem(EmbyNotificationsApiNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<EmbyNotificationsApiNotification>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @Schema(description = "")
  public List<EmbyNotificationsApiNotification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<EmbyNotificationsApiNotification> notifications) {
    this.notifications = notifications;
  }

  public EmbyNotificationsApiNotificationResult totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * Get totalRecordCount
   * @return totalRecordCount
  **/
  @Schema(description = "")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyNotificationsApiNotificationResult embyNotificationsApiNotificationResult = (EmbyNotificationsApiNotificationResult) o;
    return Objects.equals(this.notifications, embyNotificationsApiNotificationResult.notifications) &&
        Objects.equals(this.totalRecordCount, embyNotificationsApiNotificationResult.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyNotificationsApiNotificationResult {\n");
    
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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
