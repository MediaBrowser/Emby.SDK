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
 * Gets or Sets DlnaProfileType
 */
@JsonAdapter(DlnaProfileType.Adapter.class)
public enum DlnaProfileType {
  AUDIO("Audio"),
  VIDEO("Video"),
  PHOTO("Photo");

  private String value;

  DlnaProfileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaProfileType fromValue(String input) {
    for (DlnaProfileType b : DlnaProfileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaProfileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaProfileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaProfileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaProfileType.fromValue((String)(value));
    }
  }
}
