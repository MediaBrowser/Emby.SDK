/*
 * Emby Server REST API
 * 
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
 * Gets or Sets LiveTv.RecordingStatus
 */
@JsonAdapter(LiveTvRecordingStatus.Adapter.class)
public enum LiveTvRecordingStatus {
  NEW("New"),
  INPROGRESS("InProgress"),
  COMPLETED("Completed"),
  CANCELLED("Cancelled"),
  CONFLICTEDOK("ConflictedOk"),
  CONFLICTEDNOTOK("ConflictedNotOk"),
  ERROR("Error");

  private String value;

  LiveTvRecordingStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveTvRecordingStatus fromValue(String input) {
    for (LiveTvRecordingStatus b : LiveTvRecordingStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LiveTvRecordingStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveTvRecordingStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LiveTvRecordingStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LiveTvRecordingStatus.fromValue((String)(value));
    }
  }
}
