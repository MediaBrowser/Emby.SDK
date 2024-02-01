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
 * Gets or Sets MetadataRefreshMode
 */
@JsonAdapter(MetadataRefreshMode.Adapter.class)
public enum MetadataRefreshMode {
  VALIDATIONONLY("ValidationOnly"),
  DEFAULT("Default"),
  FULLREFRESH("FullRefresh");

  private String value;

  MetadataRefreshMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetadataRefreshMode fromValue(String input) {
    for (MetadataRefreshMode b : MetadataRefreshMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MetadataRefreshMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final MetadataRefreshMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MetadataRefreshMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MetadataRefreshMode.fromValue((String)(value));
    }
  }
}
