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
 * Gets or Sets Dlna.DlnaProfileType
 */
@JsonAdapter(DlnaDlnaProfileType.Adapter.class)
public enum DlnaDlnaProfileType {
  AUDIO("Audio"),
  VIDEO("Video"),
  PHOTO("Photo");

  private String value;

  DlnaDlnaProfileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaDlnaProfileType fromValue(String input) {
    for (DlnaDlnaProfileType b : DlnaDlnaProfileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaDlnaProfileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaDlnaProfileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaDlnaProfileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaDlnaProfileType.fromValue((String)(value));
    }
  }
}
