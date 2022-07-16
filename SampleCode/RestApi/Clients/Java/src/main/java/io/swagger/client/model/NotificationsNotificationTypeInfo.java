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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NotificationsNotificationTypeInfo
 */


public class NotificationsNotificationTypeInfo {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("Category")
  private String category = null;

  @SerializedName("IsBasedOnUserEvent")
  private Boolean isBasedOnUserEvent = null;

  public NotificationsNotificationTypeInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationsNotificationTypeInfo name(String name) {
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

  public NotificationsNotificationTypeInfo enabled(Boolean enabled) {
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

  public NotificationsNotificationTypeInfo category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public NotificationsNotificationTypeInfo isBasedOnUserEvent(Boolean isBasedOnUserEvent) {
    this.isBasedOnUserEvent = isBasedOnUserEvent;
    return this;
  }

   /**
   * Get isBasedOnUserEvent
   * @return isBasedOnUserEvent
  **/
  @Schema(description = "")
  public Boolean isIsBasedOnUserEvent() {
    return isBasedOnUserEvent;
  }

  public void setIsBasedOnUserEvent(Boolean isBasedOnUserEvent) {
    this.isBasedOnUserEvent = isBasedOnUserEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsNotificationTypeInfo notificationsNotificationTypeInfo = (NotificationsNotificationTypeInfo) o;
    return Objects.equals(this.type, notificationsNotificationTypeInfo.type) &&
        Objects.equals(this.name, notificationsNotificationTypeInfo.name) &&
        Objects.equals(this.enabled, notificationsNotificationTypeInfo.enabled) &&
        Objects.equals(this.category, notificationsNotificationTypeInfo.category) &&
        Objects.equals(this.isBasedOnUserEvent, notificationsNotificationTypeInfo.isBasedOnUserEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, enabled, category, isBasedOnUserEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsNotificationTypeInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isBasedOnUserEvent: ").append(toIndentedString(isBasedOnUserEvent)).append("\n");
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
