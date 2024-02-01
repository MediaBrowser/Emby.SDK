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
 * Gets or Sets Video3DFormat
 */
@JsonAdapter(Video3DFormat.Adapter.class)
public enum Video3DFormat {
  HALFSIDEBYSIDE("HalfSideBySide"),
  FULLSIDEBYSIDE("FullSideBySide"),
  FULLTOPANDBOTTOM("FullTopAndBottom"),
  HALFTOPANDBOTTOM("HalfTopAndBottom"),
  MVC("MVC");

  private String value;

  Video3DFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Video3DFormat fromValue(String input) {
    for (Video3DFormat b : Video3DFormat.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Video3DFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final Video3DFormat enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Video3DFormat read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Video3DFormat.fromValue((String)(value));
    }
  }
}
