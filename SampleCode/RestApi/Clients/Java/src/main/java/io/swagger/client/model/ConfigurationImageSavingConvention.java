/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * Gets or Sets Configuration.ImageSavingConvention
 */
@JsonAdapter(ConfigurationImageSavingConvention.Adapter.class)
public enum ConfigurationImageSavingConvention {
  LEGACY("Legacy"),
  COMPATIBLE("Compatible");

  private String value;

  ConfigurationImageSavingConvention(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationImageSavingConvention fromValue(String input) {
    for (ConfigurationImageSavingConvention b : ConfigurationImageSavingConvention.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationImageSavingConvention> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationImageSavingConvention enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationImageSavingConvention read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationImageSavingConvention.fromValue((String)(value));
    }
  }
}
