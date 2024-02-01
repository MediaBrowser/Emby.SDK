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
 * Gets or Sets OperatingSystem
 */
@JsonAdapter(OperatingSystem.Adapter.class)
public enum OperatingSystem {
  WINDOWS("Windows"),
  LINUX("Linux"),
  OSX("OSX"),
  BSD("BSD"),
  ANDROID("Android");

  private String value;

  OperatingSystem(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperatingSystem fromValue(String input) {
    for (OperatingSystem b : OperatingSystem.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperatingSystem> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperatingSystem enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OperatingSystem read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OperatingSystem.fromValue((String)(value));
    }
  }
}
