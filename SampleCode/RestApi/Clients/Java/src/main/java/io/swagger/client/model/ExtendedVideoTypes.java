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
 * Gets or Sets ExtendedVideoTypes
 */
@JsonAdapter(ExtendedVideoTypes.Adapter.class)
public enum ExtendedVideoTypes {
  NONE("None"),
  HDR10("Hdr10"),
  HDR10PLUS("Hdr10Plus"),
  HYPERLOGGAMMA("HyperLogGamma"),
  DOLBYVISION("DolbyVision");

  private String value;

  ExtendedVideoTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExtendedVideoTypes fromValue(String input) {
    for (ExtendedVideoTypes b : ExtendedVideoTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExtendedVideoTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExtendedVideoTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ExtendedVideoTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ExtendedVideoTypes.fromValue((String)(value));
    }
  }
}
