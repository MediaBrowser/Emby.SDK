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
 * Gets or Sets Dlna.PlaybackErrorCode
 */
@JsonAdapter(DlnaPlaybackErrorCode.Adapter.class)
public enum DlnaPlaybackErrorCode {
  NOTALLOWED("NotAllowed"),
  NOCOMPATIBLESTREAM("NoCompatibleStream"),
  RATELIMITEXCEEDED("RateLimitExceeded");

  private String value;

  DlnaPlaybackErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaPlaybackErrorCode fromValue(String input) {
    for (DlnaPlaybackErrorCode b : DlnaPlaybackErrorCode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaPlaybackErrorCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaPlaybackErrorCode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaPlaybackErrorCode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaPlaybackErrorCode.fromValue((String)(value));
    }
  }
}
