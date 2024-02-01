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
 * Gets or Sets DynamicDayOfWeek
 */
@JsonAdapter(DynamicDayOfWeek.Adapter.class)
public enum DynamicDayOfWeek {
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

  DynamicDayOfWeek(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DynamicDayOfWeek fromValue(String input) {
    for (DynamicDayOfWeek b : DynamicDayOfWeek.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DynamicDayOfWeek> {
    @Override
    public void write(final JsonWriter jsonWriter, final DynamicDayOfWeek enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DynamicDayOfWeek read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DynamicDayOfWeek.fromValue((String)(value));
    }
  }
}
