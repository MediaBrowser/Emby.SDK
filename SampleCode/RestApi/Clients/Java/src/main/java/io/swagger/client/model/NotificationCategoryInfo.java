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
import io.swagger.client.model.NotificationTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NotificationCategoryInfo
 */


public class NotificationCategoryInfo {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Events")
  private List<NotificationTypeInfo> events = null;

  public NotificationCategoryInfo name(String name) {
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

  public NotificationCategoryInfo id(String id) {
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

  public NotificationCategoryInfo events(List<NotificationTypeInfo> events) {
    this.events = events;
    return this;
  }

  public NotificationCategoryInfo addEventsItem(NotificationTypeInfo eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<NotificationTypeInfo>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public List<NotificationTypeInfo> getEvents() {
    return events;
  }

  public void setEvents(List<NotificationTypeInfo> events) {
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
    NotificationCategoryInfo notificationCategoryInfo = (NotificationCategoryInfo) o;
    return Objects.equals(this.name, notificationCategoryInfo.name) &&
        Objects.equals(this.id, notificationCategoryInfo.id) &&
        Objects.equals(this.events, notificationCategoryInfo.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationCategoryInfo {\n");
    
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
