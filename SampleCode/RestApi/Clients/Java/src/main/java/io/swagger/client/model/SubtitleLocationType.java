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
 * Gets or Sets SubtitleLocationType
 */
@JsonAdapter(SubtitleLocationType.Adapter.class)
public enum SubtitleLocationType {
  INTERNALSTREAM("InternalStream"),
  VIDEOSIDEDATA("VideoSideData");

  private String value;

  SubtitleLocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubtitleLocationType fromValue(String input) {
    for (SubtitleLocationType b : SubtitleLocationType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubtitleLocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubtitleLocationType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SubtitleLocationType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SubtitleLocationType.fromValue((String)(value));
    }
  }
}
