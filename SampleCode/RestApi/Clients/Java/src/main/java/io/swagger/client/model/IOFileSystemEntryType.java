/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum FileSystemEntryType  
 */
@JsonAdapter(IOFileSystemEntryType.Adapter.class)
public enum IOFileSystemEntryType {
  FILE("File"),
  DIRECTORY("Directory"),
  NETWORKCOMPUTER("NetworkComputer"),
  NETWORKSHARE("NetworkShare");

  private String value;

  IOFileSystemEntryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IOFileSystemEntryType fromValue(String input) {
    for (IOFileSystemEntryType b : IOFileSystemEntryType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IOFileSystemEntryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IOFileSystemEntryType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public IOFileSystemEntryType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return IOFileSystemEntryType.fromValue((String)(value));
    }
  }
}
