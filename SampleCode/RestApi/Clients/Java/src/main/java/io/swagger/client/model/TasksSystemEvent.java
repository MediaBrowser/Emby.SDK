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
 * Gets or Sets Tasks.SystemEvent
 */
@JsonAdapter(TasksSystemEvent.Adapter.class)
public enum TasksSystemEvent {
  WAKEFROMSLEEP("WakeFromSleep"),
  DISPLAYCONFIGURATIONCHANGE("DisplayConfigurationChange"),
  NETWORKCHANGE("NetworkChange");

  private String value;

  TasksSystemEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TasksSystemEvent fromValue(String input) {
    for (TasksSystemEvent b : TasksSystemEvent.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TasksSystemEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final TasksSystemEvent enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TasksSystemEvent read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TasksSystemEvent.fromValue((String)(value));
    }
  }
}
