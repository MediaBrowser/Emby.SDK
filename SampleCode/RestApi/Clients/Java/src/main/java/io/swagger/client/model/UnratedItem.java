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
 * Gets or Sets UnratedItem
 */
@JsonAdapter(UnratedItem.Adapter.class)
public enum UnratedItem {
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

  UnratedItem(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UnratedItem fromValue(String input) {
    for (UnratedItem b : UnratedItem.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UnratedItem> {
    @Override
    public void write(final JsonWriter jsonWriter, final UnratedItem enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UnratedItem read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UnratedItem.fromValue((String)(value));
    }
  }
}
