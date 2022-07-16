/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
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
 * Gets or Sets ScrollDirection
 */
@JsonAdapter(ScrollDirection.Adapter.class)
public enum ScrollDirection {
  HORIZONTAL("Horizontal"),
  VERTICAL("Vertical");

  private String value;

  ScrollDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScrollDirection fromValue(String input) {
    for (ScrollDirection b : ScrollDirection.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ScrollDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScrollDirection enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ScrollDirection read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ScrollDirection.fromValue((String)(value));
    }
  }
}
