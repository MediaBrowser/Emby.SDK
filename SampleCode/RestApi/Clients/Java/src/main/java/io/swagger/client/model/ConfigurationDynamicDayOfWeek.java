/*
 * Emby REST API
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
 * Gets or Sets Configuration.DynamicDayOfWeek
 */
@JsonAdapter(ConfigurationDynamicDayOfWeek.Adapter.class)
public enum ConfigurationDynamicDayOfWeek {
  SUNDAY("Sunday"),
  MONDAY("Monday"),
  TUESDAY("Tuesday"),
  WEDNESDAY("Wednesday"),
  THURSDAY("Thursday"),
  FRIDAY("Friday"),
  SATURDAY("Saturday"),
  EVERYDAY("Everyday"),
  WEEKDAY("Weekday"),
  WEEKEND("Weekend");

  private String value;

  ConfigurationDynamicDayOfWeek(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConfigurationDynamicDayOfWeek fromValue(String input) {
    for (ConfigurationDynamicDayOfWeek b : ConfigurationDynamicDayOfWeek.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConfigurationDynamicDayOfWeek> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConfigurationDynamicDayOfWeek enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConfigurationDynamicDayOfWeek read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConfigurationDynamicDayOfWeek.fromValue((String)(value));
    }
  }
}
