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
 * Gets or Sets RecommendationType
 */
@JsonAdapter(RecommendationType.Adapter.class)
public enum RecommendationType {
  SIMILARTORECENTLYPLAYED("SimilarToRecentlyPlayed"),
  SIMILARTOLIKEDITEM("SimilarToLikedItem"),
  HASDIRECTORFROMRECENTLYPLAYED("HasDirectorFromRecentlyPlayed"),
  HASACTORFROMRECENTLYPLAYED("HasActorFromRecentlyPlayed"),
  HASLIKEDDIRECTOR("HasLikedDirector"),
  HASLIKEDACTOR("HasLikedActor");

  private String value;

  RecommendationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecommendationType fromValue(String input) {
    for (RecommendationType b : RecommendationType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RecommendationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecommendationType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RecommendationType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return RecommendationType.fromValue((String)(value));
    }
  }
}
