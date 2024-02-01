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
 * Gets or Sets RatingType
 */
@JsonAdapter(RatingType.Adapter.class)
public enum RatingType {
  SCORE("Score"),
  LIKES("Likes");

  private String value;

  RatingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RatingType fromValue(String input) {
    for (RatingType b : RatingType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RatingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RatingType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RatingType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return RatingType.fromValue((String)(value));
    }
  }
}
