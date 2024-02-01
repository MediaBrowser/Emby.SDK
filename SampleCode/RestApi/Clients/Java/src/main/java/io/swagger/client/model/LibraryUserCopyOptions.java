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
 * Gets or Sets Library.UserCopyOptions
 */
@JsonAdapter(LibraryUserCopyOptions.Adapter.class)
public enum LibraryUserCopyOptions {
  USERPOLICY("UserPolicy"),
  USERCONFIGURATION("UserConfiguration");

  private String value;

  LibraryUserCopyOptions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LibraryUserCopyOptions fromValue(String input) {
    for (LibraryUserCopyOptions b : LibraryUserCopyOptions.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LibraryUserCopyOptions> {
    @Override
    public void write(final JsonWriter jsonWriter, final LibraryUserCopyOptions enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LibraryUserCopyOptions read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LibraryUserCopyOptions.fromValue((String)(value));
    }
  }
}
