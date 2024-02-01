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
 * Gets or Sets SubtitlePlaybackMode
 */
@JsonAdapter(SubtitlePlaybackMode.Adapter.class)
public enum SubtitlePlaybackMode {
  DEFAULT("Default"),
  ALWAYS("Always"),
  ONLYFORCED("OnlyForced"),
  NONE("None"),
  SMART("Smart"),
  HEARINGIMPAIRED("HearingImpaired");

  private String value;

  SubtitlePlaybackMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubtitlePlaybackMode fromValue(String input) {
    for (SubtitlePlaybackMode b : SubtitlePlaybackMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubtitlePlaybackMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubtitlePlaybackMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SubtitlePlaybackMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SubtitlePlaybackMode.fromValue((String)(value));
    }
  }
}
