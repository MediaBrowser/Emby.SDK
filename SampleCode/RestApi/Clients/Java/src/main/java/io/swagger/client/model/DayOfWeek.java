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
 * Gets or Sets DayOfWeek
 */
@JsonAdapter(DayOfWeek.Adapter.class)
public enum DayOfWeek {
  SUNDAY("Sunday"),
  MONDAY("Monday"),
  TUESDAY("Tuesday"),
  WEDNESDAY("Wednesday"),
  THURSDAY("Thursday"),
  FRIDAY("Friday"),
  SATURDAY("Saturday");

  private String value;

  DayOfWeek(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DayOfWeek fromValue(String input) {
    for (DayOfWeek b : DayOfWeek.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DayOfWeek> {
    @Override
    public void write(final JsonWriter jsonWriter, final DayOfWeek enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DayOfWeek read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DayOfWeek.fromValue((String)(value));
    }
  }
}
