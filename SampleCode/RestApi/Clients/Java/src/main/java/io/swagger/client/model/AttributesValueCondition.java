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
 * Gets or Sets Attributes.ValueCondition
 */
@JsonAdapter(AttributesValueCondition.Adapter.class)
public enum AttributesValueCondition {
  ISEQUAL("IsEqual"),
  ISNOTEQUAL("IsNotEqual"),
  ISGREATER("IsGreater"),
  ISGREATEROREQUAL("IsGreaterOrEqual"),
  ISLESS("IsLess"),
  ISLESSOREQUAL("IsLessOrEqual");

  private String value;

  AttributesValueCondition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttributesValueCondition fromValue(String input) {
    for (AttributesValueCondition b : AttributesValueCondition.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AttributesValueCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final AttributesValueCondition enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AttributesValueCondition read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return AttributesValueCondition.fromValue((String)(value));
    }
  }
}
