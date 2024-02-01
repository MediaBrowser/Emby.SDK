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
 * Gets or Sets MetadataFeatures
 */
@JsonAdapter(MetadataFeatures.Adapter.class)
public enum MetadataFeatures {
  COLLECTIONS("Collections"),
  ADULT("Adult"),
  REQUIREDSETUP("RequiredSetup");

  private String value;

  MetadataFeatures(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetadataFeatures fromValue(String input) {
    for (MetadataFeatures b : MetadataFeatures.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MetadataFeatures> {
    @Override
    public void write(final JsonWriter jsonWriter, final MetadataFeatures enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MetadataFeatures read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MetadataFeatures.fromValue((String)(value));
    }
  }
}
