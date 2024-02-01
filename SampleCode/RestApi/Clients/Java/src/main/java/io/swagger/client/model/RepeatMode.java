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
 * Gets or Sets RepeatMode
 */
@JsonAdapter(RepeatMode.Adapter.class)
public enum RepeatMode {
  REPEATNONE("RepeatNone"),
  REPEATALL("RepeatAll"),
  REPEATONE("RepeatOne");

  private String value;

  RepeatMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RepeatMode fromValue(String input) {
    for (RepeatMode b : RepeatMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RepeatMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final RepeatMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RepeatMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return RepeatMode.fromValue((String)(value));
    }
  }
}
