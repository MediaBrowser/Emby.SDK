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
 * Enum PlaystateCommand  
 */
@JsonAdapter(PlaystateCommand.Adapter.class)
public enum PlaystateCommand {
  STOP("Stop"),
  PAUSE("Pause"),
  UNPAUSE("Unpause"),
  NEXTTRACK("NextTrack"),
  PREVIOUSTRACK("PreviousTrack"),
  SEEK("Seek"),
  REWIND("Rewind"),
  FASTFORWARD("FastForward"),
  PLAYPAUSE("PlayPause"),
  SEEKRELATIVE("SeekRelative");

  private String value;

  PlaystateCommand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlaystateCommand fromValue(String input) {
    for (PlaystateCommand b : PlaystateCommand.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlaystateCommand> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlaystateCommand enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PlaystateCommand read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PlaystateCommand.fromValue((String)(value));
    }
  }
}
