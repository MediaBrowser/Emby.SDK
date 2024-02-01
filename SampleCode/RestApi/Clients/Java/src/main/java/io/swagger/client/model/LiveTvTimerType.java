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
 * Gets or Sets LiveTv.TimerType
 */
@JsonAdapter(LiveTvTimerType.Adapter.class)
public enum LiveTvTimerType {
  PROGRAM("Program"),
  DATETIME("DateTime"),
  KEYWORD("Keyword");

  private String value;

  LiveTvTimerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveTvTimerType fromValue(String input) {
    for (LiveTvTimerType b : LiveTvTimerType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LiveTvTimerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveTvTimerType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LiveTvTimerType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LiveTvTimerType.fromValue((String)(value));
    }
  }
}
