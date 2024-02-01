/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum ConfigurationPageType  
 */
@JsonAdapter(PluginsConfigurationPageType.Adapter.class)
public enum PluginsConfigurationPageType {
  PLUGINCONFIGURATION("PluginConfiguration"),
  NONE("None");

  private String value;

  PluginsConfigurationPageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PluginsConfigurationPageType fromValue(String input) {
    for (PluginsConfigurationPageType b : PluginsConfigurationPageType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PluginsConfigurationPageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PluginsConfigurationPageType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PluginsConfigurationPageType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PluginsConfigurationPageType.fromValue((String)(value));
    }
  }
}
