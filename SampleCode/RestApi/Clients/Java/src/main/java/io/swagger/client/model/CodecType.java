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
 * Gets or Sets CodecType
 */
@JsonAdapter(CodecType.Adapter.class)
public enum CodecType {
  VIDEO("Video"),
  VIDEOAUDIO("VideoAudio"),
  AUDIO("Audio");

  private String value;

  CodecType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CodecType fromValue(String input) {
    for (CodecType b : CodecType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CodecType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CodecType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CodecType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CodecType.fromValue((String)(value));
    }
  }
}
