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
 * Gets or Sets LiveTv.ChannelType
 */
@JsonAdapter(LiveTvChannelType.Adapter.class)
public enum LiveTvChannelType {
  TV("TV"),
  RADIO("Radio");

  private String value;

  LiveTvChannelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveTvChannelType fromValue(String input) {
    for (LiveTvChannelType b : LiveTvChannelType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LiveTvChannelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveTvChannelType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LiveTvChannelType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LiveTvChannelType.fromValue((String)(value));
    }
  }
}
