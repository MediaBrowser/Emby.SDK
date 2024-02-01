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
 * Enum defining the kind of media a codec is processing.  
 */
@JsonAdapter(CodecKinds.Adapter.class)
public enum CodecKinds {
  AUDIO("Audio"),
  VIDEO("Video"),
  SUBTITLES("SubTitles");

  private String value;

  CodecKinds(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodecKinds fromValue(String input) {
    for (CodecKinds b : CodecKinds.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CodecKinds> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodecKinds enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CodecKinds read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CodecKinds.fromValue((String)(value));
    }
  }
}
