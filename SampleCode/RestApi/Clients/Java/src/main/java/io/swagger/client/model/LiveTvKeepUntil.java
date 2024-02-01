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
 * Gets or Sets LiveTv.KeepUntil
 */
@JsonAdapter(LiveTvKeepUntil.Adapter.class)
public enum LiveTvKeepUntil {
  UNTILDELETED("UntilDeleted"),
  UNTILSPACENEEDED("UntilSpaceNeeded"),
  UNTILWATCHED("UntilWatched"),
  UNTILDATE("UntilDate");

  private String value;

  LiveTvKeepUntil(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveTvKeepUntil fromValue(String input) {
    for (LiveTvKeepUntil b : LiveTvKeepUntil.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LiveTvKeepUntil> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveTvKeepUntil enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LiveTvKeepUntil read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LiveTvKeepUntil.fromValue((String)(value));
    }
  }
}
