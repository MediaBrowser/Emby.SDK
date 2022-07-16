/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Notifications.NotificationLevel
 */
@JsonAdapter(NotificationsNotificationLevel.Adapter.class)
public enum NotificationsNotificationLevel {
  NORMAL("Normal"),
  WARNING("Warning"),
  ERROR("Error");

  private String value;

  NotificationsNotificationLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NotificationsNotificationLevel fromValue(String input) {
    for (NotificationsNotificationLevel b : NotificationsNotificationLevel.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NotificationsNotificationLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final NotificationsNotificationLevel enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public NotificationsNotificationLevel read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return NotificationsNotificationLevel.fromValue((String)(value));
    }
  }
}
