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
 * Gets or Sets ProgressEvent
 */
@JsonAdapter(ProgressEvent.Adapter.class)
public enum ProgressEvent {
  TIMEUPDATE("TimeUpdate"),
  PAUSE("Pause"),
  UNPAUSE("Unpause"),
  VOLUMECHANGE("VolumeChange"),
  REPEATMODECHANGE("RepeatModeChange"),
  AUDIOTRACKCHANGE("AudioTrackChange"),
  SUBTITLETRACKCHANGE("SubtitleTrackChange"),
  PLAYLISTITEMMOVE("PlaylistItemMove"),
  PLAYLISTITEMREMOVE("PlaylistItemRemove"),
  PLAYLISTITEMADD("PlaylistItemAdd"),
  QUALITYCHANGE("QualityChange"),
  STATECHANGE("StateChange"),
  SUBTITLEOFFSETCHANGE("SubtitleOffsetChange"),
  PLAYBACKRATECHANGE("PlaybackRateChange"),
  SHUFFLECHANGE("ShuffleChange");

  private String value;

  ProgressEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProgressEvent fromValue(String input) {
    for (ProgressEvent b : ProgressEvent.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProgressEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProgressEvent enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ProgressEvent read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ProgressEvent.fromValue((String)(value));
    }
  }
}
