/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.NotificationsNotificationLevel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyNotificationsApiNotificationsSummary
 */


public class EmbyNotificationsApiNotificationsSummary {
  @SerializedName("UnreadCount")
  private Integer unreadCount = null;

  @SerializedName("MaxUnreadNotificationLevel")
  private NotificationsNotificationLevel maxUnreadNotificationLevel = null;

  public EmbyNotificationsApiNotificationsSummary unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }

   /**
   * Get unreadCount
   * @return unreadCount
  **/
  @Schema(description = "")
  public Integer getUnreadCount() {
    return unreadCount;
  }

  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  public EmbyNotificationsApiNotificationsSummary maxUnreadNotificationLevel(NotificationsNotificationLevel maxUnreadNotificationLevel) {
    this.maxUnreadNotificationLevel = maxUnreadNotificationLevel;
    return this;
  }

   /**
   * Get maxUnreadNotificationLevel
   * @return maxUnreadNotificationLevel
  **/
  @Schema(description = "")
  public NotificationsNotificationLevel getMaxUnreadNotificationLevel() {
    return maxUnreadNotificationLevel;
  }

  public void setMaxUnreadNotificationLevel(NotificationsNotificationLevel maxUnreadNotificationLevel) {
    this.maxUnreadNotificationLevel = maxUnreadNotificationLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyNotificationsApiNotificationsSummary embyNotificationsApiNotificationsSummary = (EmbyNotificationsApiNotificationsSummary) o;
    return Objects.equals(this.unreadCount, embyNotificationsApiNotificationsSummary.unreadCount) &&
        Objects.equals(this.maxUnreadNotificationLevel, embyNotificationsApiNotificationsSummary.maxUnreadNotificationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unreadCount, maxUnreadNotificationLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyNotificationsApiNotificationsSummary {\n");
    
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    maxUnreadNotificationLevel: ").append(toIndentedString(maxUnreadNotificationLevel)).append("\n");
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
