/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
import org.threeten.bp.OffsetDateTime;
/**
 * EmbyNotificationsApiNotification
 */


public class EmbyNotificationsApiNotification {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("IsRead")
  private Boolean isRead = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("Level")
  private NotificationsNotificationLevel level = null;

  public EmbyNotificationsApiNotification id(String id) {
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

  public EmbyNotificationsApiNotification userId(String userId) {
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

  public EmbyNotificationsApiNotification date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public EmbyNotificationsApiNotification isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Get isRead
   * @return isRead
  **/
  @Schema(description = "")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public EmbyNotificationsApiNotification name(String name) {
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

  public EmbyNotificationsApiNotification description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmbyNotificationsApiNotification url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public EmbyNotificationsApiNotification level(NotificationsNotificationLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public NotificationsNotificationLevel getLevel() {
    return level;
  }

  public void setLevel(NotificationsNotificationLevel level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyNotificationsApiNotification embyNotificationsApiNotification = (EmbyNotificationsApiNotification) o;
    return Objects.equals(this.id, embyNotificationsApiNotification.id) &&
        Objects.equals(this.userId, embyNotificationsApiNotification.userId) &&
        Objects.equals(this.date, embyNotificationsApiNotification.date) &&
        Objects.equals(this.isRead, embyNotificationsApiNotification.isRead) &&
        Objects.equals(this.name, embyNotificationsApiNotification.name) &&
        Objects.equals(this.description, embyNotificationsApiNotification.description) &&
        Objects.equals(this.url, embyNotificationsApiNotification.url) &&
        Objects.equals(this.level, embyNotificationsApiNotification.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, date, isRead, name, description, url, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyNotificationsApiNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
