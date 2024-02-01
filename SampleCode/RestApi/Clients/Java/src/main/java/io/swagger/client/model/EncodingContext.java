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
 * Gets or Sets EncodingContext
 */
@JsonAdapter(EncodingContext.Adapter.class)
public enum EncodingContext {
  STREAMING("Streaming"),
  STATIC("Static");

  private String value;

  EncodingContext(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EncodingContext fromValue(String input) {
    for (EncodingContext b : EncodingContext.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EncodingContext> {
    @Override
    public void write(final JsonWriter jsonWriter, final EncodingContext enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EncodingContext read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EncodingContext.fromValue((String)(value));
    }
  }
}
