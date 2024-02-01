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
 * Enum SortOrder  
 */
@JsonAdapter(SortOrder.Adapter.class)
public enum SortOrder {
  ASCENDING("Ascending"),
  DESCENDING("Descending");

  private String value;

  SortOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SortOrder fromValue(String input) {
    for (SortOrder b : SortOrder.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SortOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final SortOrder enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SortOrder read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SortOrder.fromValue((String)(value));
    }
  }
}
