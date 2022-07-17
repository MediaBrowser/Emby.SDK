/*
 * Emby Server REST API (BETA)
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
 * Gets or Sets Configuration.SegmentSkipMode
 */
@JsonAdapter(ConfigurationSegmentSkipMode.Adapter.class)
public enum ConfigurationSegmentSkipMode {
  SHOWBUTTON("ShowButton"),
  AUTOSKIP("AutoSkip"),
  NONE("None");

  private String value;

  ConfigurationSegmentSkipMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationSegmentSkipMode fromValue(String input) {
    for (ConfigurationSegmentSkipMode b : ConfigurationSegmentSkipMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationSegmentSkipMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationSegmentSkipMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationSegmentSkipMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationSegmentSkipMode.fromValue((String)(value));
    }
  }
}
