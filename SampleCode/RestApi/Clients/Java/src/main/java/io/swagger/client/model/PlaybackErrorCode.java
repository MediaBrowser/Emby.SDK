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
 * Gets or Sets PlaybackErrorCode
 */
@JsonAdapter(PlaybackErrorCode.Adapter.class)
public enum PlaybackErrorCode {
  NOTALLOWED("NotAllowed"),
  NOCOMPATIBLESTREAM("NoCompatibleStream"),
  RATELIMITEXCEEDED("RateLimitExceeded");

  private String value;

  PlaybackErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlaybackErrorCode fromValue(String input) {
    for (PlaybackErrorCode b : PlaybackErrorCode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlaybackErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlaybackErrorCode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PlaybackErrorCode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PlaybackErrorCode.fromValue((String)(value));
    }
  }
}
