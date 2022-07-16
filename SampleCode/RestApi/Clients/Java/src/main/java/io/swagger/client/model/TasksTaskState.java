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
 * Gets or Sets Tasks.TaskState
 */
@JsonAdapter(TasksTaskState.Adapter.class)
public enum TasksTaskState {
  IDLE("Idle"),
  CANCELLING("Cancelling"),
  RUNNING("Running");

  private String value;

  TasksTaskState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TasksTaskState fromValue(String input) {
    for (TasksTaskState b : TasksTaskState.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TasksTaskState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TasksTaskState enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TasksTaskState read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TasksTaskState.fromValue((String)(value));
    }
  }
}
