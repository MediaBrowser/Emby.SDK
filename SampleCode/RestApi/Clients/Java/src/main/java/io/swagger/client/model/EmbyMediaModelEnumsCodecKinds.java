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
 * Gets or Sets Emby.Media.Model.Enums.CodecKinds
 */
@JsonAdapter(EmbyMediaModelEnumsCodecKinds.Adapter.class)
public enum EmbyMediaModelEnumsCodecKinds {
  AUDIO("Audio"),
  VIDEO("Video"),
  SUBTITLES("SubTitles");

  private String value;

  EmbyMediaModelEnumsCodecKinds(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyMediaModelEnumsCodecKinds fromValue(String input) {
    for (EmbyMediaModelEnumsCodecKinds b : EmbyMediaModelEnumsCodecKinds.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyMediaModelEnumsCodecKinds> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyMediaModelEnumsCodecKinds enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyMediaModelEnumsCodecKinds read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyMediaModelEnumsCodecKinds.fromValue((String)(value));
    }
  }
}
