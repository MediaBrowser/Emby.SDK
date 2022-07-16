/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
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
 * Gets or Sets Configuration.UnratedItem
 */
@JsonAdapter(ConfigurationUnratedItem.Adapter.class)
public enum ConfigurationUnratedItem {
  MOVIE("Movie"),
  TRAILER("Trailer"),
  SERIES("Series"),
  MUSIC("Music"),
  GAME("Game"),
  BOOK("Book"),
  LIVETVCHANNEL("LiveTvChannel"),
  LIVETVPROGRAM("LiveTvProgram"),
  CHANNELCONTENT("ChannelContent"),
  OTHER("Other");

  private String value;

  ConfigurationUnratedItem(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationUnratedItem fromValue(String input) {
    for (ConfigurationUnratedItem b : ConfigurationUnratedItem.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationUnratedItem> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationUnratedItem enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationUnratedItem read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationUnratedItem.fromValue((String)(value));
    }
  }
}
