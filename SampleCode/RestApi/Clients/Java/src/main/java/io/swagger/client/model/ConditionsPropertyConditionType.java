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
 * Gets or Sets Conditions.PropertyConditionType
 */
@JsonAdapter(ConditionsPropertyConditionType.Adapter.class)
public enum ConditionsPropertyConditionType {
  VISIBLE("Visible"),
  ENABLED("Enabled");

  private String value;

  ConditionsPropertyConditionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConditionsPropertyConditionType fromValue(String input) {
    for (ConditionsPropertyConditionType b : ConditionsPropertyConditionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConditionsPropertyConditionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConditionsPropertyConditionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConditionsPropertyConditionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConditionsPropertyConditionType.fromValue((String)(value));
    }
  }
}
