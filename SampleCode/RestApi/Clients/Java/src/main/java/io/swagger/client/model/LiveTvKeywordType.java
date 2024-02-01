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
 * Gets or Sets LiveTv.KeywordType
 */
@JsonAdapter(LiveTvKeywordType.Adapter.class)
public enum LiveTvKeywordType {
  NAME("Name"),
  EPISODETITLE("EpisodeTitle"),
  OVERVIEW("Overview"),
  ACTOR("Actor"),
  DIRECTOR("Director");

  private String value;

  LiveTvKeywordType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveTvKeywordType fromValue(String input) {
    for (LiveTvKeywordType b : LiveTvKeywordType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LiveTvKeywordType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveTvKeywordType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LiveTvKeywordType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LiveTvKeywordType.fromValue((String)(value));
    }
  }
}
