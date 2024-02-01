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
 * Gets or Sets MediaEncoding.CodecParameterContext
 */
@JsonAdapter(MediaEncodingCodecParameterContext.Adapter.class)
public enum MediaEncodingCodecParameterContext {
  PLAYBACK("Playback"),
  CONVERSION("Conversion");

  private String value;

  MediaEncodingCodecParameterContext(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaEncodingCodecParameterContext fromValue(String input) {
    for (MediaEncodingCodecParameterContext b : MediaEncodingCodecParameterContext.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaEncodingCodecParameterContext> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaEncodingCodecParameterContext enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaEncodingCodecParameterContext read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaEncodingCodecParameterContext.fromValue((String)(value));
    }
  }
}
