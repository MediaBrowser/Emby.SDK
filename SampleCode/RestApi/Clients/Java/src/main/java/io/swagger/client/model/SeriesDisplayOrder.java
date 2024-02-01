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
 * Gets or Sets SeriesDisplayOrder
 */
@JsonAdapter(SeriesDisplayOrder.Adapter.class)
public enum SeriesDisplayOrder {
  AIRED("Aired"),
  DVD("Dvd"),
  ABSOLUTE("Absolute");

  private String value;

  SeriesDisplayOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SeriesDisplayOrder fromValue(String input) {
    for (SeriesDisplayOrder b : SeriesDisplayOrder.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SeriesDisplayOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final SeriesDisplayOrder enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SeriesDisplayOrder read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SeriesDisplayOrder.fromValue((String)(value));
    }
  }
}
