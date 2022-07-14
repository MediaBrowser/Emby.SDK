/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * Gets or Sets Emby.Media.Model.Enums.CodecDirections
 */
@JsonAdapter(EmbyMediaModelEnumsCodecDirections.Adapter.class)
public enum EmbyMediaModelEnumsCodecDirections {
  ENCODER("Encoder"),
  DECODER("Decoder");

  private String value;

  EmbyMediaModelEnumsCodecDirections(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyMediaModelEnumsCodecDirections fromValue(String input) {
    for (EmbyMediaModelEnumsCodecDirections b : EmbyMediaModelEnumsCodecDirections.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyMediaModelEnumsCodecDirections> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyMediaModelEnumsCodecDirections enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyMediaModelEnumsCodecDirections read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyMediaModelEnumsCodecDirections.fromValue((String)(value));
    }
  }
}
