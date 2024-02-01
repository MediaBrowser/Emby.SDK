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
 * Gets or Sets TransportStreamTimestamp
 */
@JsonAdapter(TransportStreamTimestamp.Adapter.class)
public enum TransportStreamTimestamp {
  NONE("None"),
  ZERO("Zero"),
  VALID("Valid");

  private String value;

  TransportStreamTimestamp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransportStreamTimestamp fromValue(String input) {
    for (TransportStreamTimestamp b : TransportStreamTimestamp.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransportStreamTimestamp> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransportStreamTimestamp enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TransportStreamTimestamp read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TransportStreamTimestamp.fromValue((String)(value));
    }
  }
}
