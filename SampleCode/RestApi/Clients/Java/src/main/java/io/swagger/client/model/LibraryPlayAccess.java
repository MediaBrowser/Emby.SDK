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
 * Gets or Sets Library.PlayAccess
 */
@JsonAdapter(LibraryPlayAccess.Adapter.class)
public enum LibraryPlayAccess {
  FULL("Full"),
  NONE("None");

  private String value;

  LibraryPlayAccess(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LibraryPlayAccess fromValue(String input) {
    for (LibraryPlayAccess b : LibraryPlayAccess.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LibraryPlayAccess> {
    @Override
    public void write(final JsonWriter jsonWriter, final LibraryPlayAccess enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LibraryPlayAccess read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LibraryPlayAccess.fromValue((String)(value));
    }
  }
}
