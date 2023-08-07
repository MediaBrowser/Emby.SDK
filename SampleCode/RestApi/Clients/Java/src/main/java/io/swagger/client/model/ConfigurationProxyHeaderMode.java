/*
 * Emby Server REST API (BETA)
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
 * Gets or Sets Configuration.ProxyHeaderMode
 */
@JsonAdapter(ConfigurationProxyHeaderMode.Adapter.class)
public enum ConfigurationProxyHeaderMode {
  NONE("None"),
  LANADDRESSESONLY("LanAddressesOnly"),
  ALLADDRESSES("AllAddresses");

  private String value;

  ConfigurationProxyHeaderMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationProxyHeaderMode fromValue(String input) {
    for (ConfigurationProxyHeaderMode b : ConfigurationProxyHeaderMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationProxyHeaderMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationProxyHeaderMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationProxyHeaderMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationProxyHeaderMode.fromValue((String)(value));
    }
  }
}
