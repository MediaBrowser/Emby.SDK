/*
 * Emby REST API
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
 * Gets or Sets Configuration.SubtitlePlaybackMode
 */
@JsonAdapter(ConfigurationSubtitlePlaybackMode.Adapter.class)
public enum ConfigurationSubtitlePlaybackMode {
  DEFAULT("Default"),
  ALWAYS("Always"),
  ONLYFORCED("OnlyForced"),
  NONE("None"),
  SMART("Smart");

  private String value;

  ConfigurationSubtitlePlaybackMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationSubtitlePlaybackMode fromValue(String input) {
    for (ConfigurationSubtitlePlaybackMode b : ConfigurationSubtitlePlaybackMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationSubtitlePlaybackMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationSubtitlePlaybackMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationSubtitlePlaybackMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationSubtitlePlaybackMode.fromValue((String)(value));
    }
  }
}
