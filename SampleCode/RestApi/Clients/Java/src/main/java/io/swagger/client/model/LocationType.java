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
 * Enum LocationType  
 */
@JsonAdapter(LocationType.Adapter.class)
public enum LocationType {
  FILESYSTEM("FileSystem"),
  VIRTUAL("Virtual");

  private String value;

  LocationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocationType fromValue(String input) {
    for (LocationType b : LocationType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocationType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LocationType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LocationType.fromValue((String)(value));
    }
  }
}
