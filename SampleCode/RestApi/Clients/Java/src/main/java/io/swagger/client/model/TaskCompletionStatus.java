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
 * Enum TaskCompletionStatus  
 */
@JsonAdapter(TaskCompletionStatus.Adapter.class)
public enum TaskCompletionStatus {
  COMPLETED("Completed"),
  FAILED("Failed"),
  CANCELLED("Cancelled"),
  ABORTED("Aborted");

  private String value;

  TaskCompletionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskCompletionStatus fromValue(String input) {
    for (TaskCompletionStatus b : TaskCompletionStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskCompletionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskCompletionStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TaskCompletionStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TaskCompletionStatus.fromValue((String)(value));
    }
  }
}
