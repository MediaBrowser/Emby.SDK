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
 * Enum for indicating the processing direction of a codec.  
 */
@JsonAdapter(CodecDirections.Adapter.class)
public enum CodecDirections {
  ENCODER("Encoder"),
  DECODER("Decoder");

  private String value;

  CodecDirections(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodecDirections fromValue(String input) {
    for (CodecDirections b : CodecDirections.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CodecDirections> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodecDirections enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CodecDirections read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CodecDirections.fromValue((String)(value));
    }
  }
}
