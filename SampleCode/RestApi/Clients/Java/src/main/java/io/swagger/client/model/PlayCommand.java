/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum PlayCommand  
 */
@JsonAdapter(PlayCommand.Adapter.class)
public enum PlayCommand {
  PLAYNOW("PlayNow"),
  PLAYNEXT("PlayNext"),
  PLAYLAST("PlayLast"),
  PLAYINSTANTMIX("PlayInstantMix"),
  PLAYSHUFFLE("PlayShuffle");

  private String value;

  PlayCommand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayCommand fromValue(String input) {
    for (PlayCommand b : PlayCommand.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayCommand> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayCommand enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PlayCommand read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PlayCommand.fromValue((String)(value));
    }
  }
}
