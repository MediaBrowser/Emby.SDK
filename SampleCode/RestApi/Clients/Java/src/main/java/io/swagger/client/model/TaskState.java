/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum TaskState  
 */
@JsonAdapter(TaskState.Adapter.class)
public enum TaskState {
  IDLE("Idle"),
  CANCELLING("Cancelling"),
  RUNNING("Running");

  private String value;

  TaskState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskState fromValue(String input) {
    for (TaskState b : TaskState.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskState enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TaskState read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TaskState.fromValue((String)(value));
    }
  }
}
