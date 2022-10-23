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
import io.swagger.client.model.EmbyNotificationsNotificationTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyNotificationsNotificationCategoryInfo
 */


public class EmbyNotificationsNotificationCategoryInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Events")
  private List<EmbyNotificationsNotificationTypeInfo> events = null;

  public EmbyNotificationsNotificationCategoryInfo name(String name) {
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

  public EmbyNotificationsNotificationCategoryInfo id(String id) {
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

  public EmbyNotificationsNotificationCategoryInfo events(List<EmbyNotificationsNotificationTypeInfo> events) {
    this.events = events;
    return this;
  }

  public EmbyNotificationsNotificationCategoryInfo addEventsItem(EmbyNotificationsNotificationTypeInfo eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<EmbyNotificationsNotificationTypeInfo>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public List<EmbyNotificationsNotificationTypeInfo> getEvents() {
    return events;
  }

  public void setEvents(List<EmbyNotificationsNotificationTypeInfo> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyNotificationsNotificationCategoryInfo embyNotificationsNotificationCategoryInfo = (EmbyNotificationsNotificationCategoryInfo) o;
    return Objects.equals(this.name, embyNotificationsNotificationCategoryInfo.name) &&
        Objects.equals(this.id, embyNotificationsNotificationCategoryInfo.id) &&
        Objects.equals(this.events, embyNotificationsNotificationCategoryInfo.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyNotificationsNotificationCategoryInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
