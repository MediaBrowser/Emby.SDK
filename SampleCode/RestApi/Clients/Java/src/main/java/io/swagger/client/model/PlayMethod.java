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
 * Gets or Sets PlayMethod
 */
@JsonAdapter(PlayMethod.Adapter.class)
public enum PlayMethod {
  TRANSCODE("Transcode"),
  DIRECTSTREAM("DirectStream"),
  DIRECTPLAY("DirectPlay");

  private String value;

  PlayMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayMethod fromValue(String input) {
    for (PlayMethod b : PlayMethod.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayMethod enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PlayMethod read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PlayMethod.fromValue((String)(value));
    }
  }
}
