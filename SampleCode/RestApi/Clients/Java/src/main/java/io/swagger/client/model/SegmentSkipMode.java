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
 * Gets or Sets SegmentSkipMode
 */
@JsonAdapter(SegmentSkipMode.Adapter.class)
public enum SegmentSkipMode {
  SHOWBUTTON("ShowButton"),
  AUTOSKIP("AutoSkip"),
  NONE("None");

  private String value;

  SegmentSkipMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SegmentSkipMode fromValue(String input) {
    for (SegmentSkipMode b : SegmentSkipMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SegmentSkipMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SegmentSkipMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SegmentSkipMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SegmentSkipMode.fromValue((String)(value));
    }
  }
}
