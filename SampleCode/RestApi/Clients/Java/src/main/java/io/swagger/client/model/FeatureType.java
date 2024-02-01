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
 * Gets or Sets FeatureType
 */
@JsonAdapter(FeatureType.Adapter.class)
public enum FeatureType {
  SYSTEM("System"),
  USER("User");

  private String value;

  FeatureType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeatureType fromValue(String input) {
    for (FeatureType b : FeatureType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FeatureType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeatureType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public FeatureType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return FeatureType.fromValue((String)(value));
    }
  }
}
