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
 * Gets or Sets MarkerType
 */
@JsonAdapter(MarkerType.Adapter.class)
public enum MarkerType {
  CHAPTER("Chapter"),
  INTROSTART("IntroStart"),
  INTROEND("IntroEnd"),
  CREDITSSTART("CreditsStart");

  private String value;

  MarkerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarkerType fromValue(String input) {
    for (MarkerType b : MarkerType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MarkerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MarkerType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MarkerType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MarkerType.fromValue((String)(value));
    }
  }
}
