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
 * Gets or Sets Emby.Web.GenericEdit.Conditions.PropertyConditionType
 */
@JsonAdapter(EmbyWebGenericEditConditionsPropertyConditionType.Adapter.class)
public enum EmbyWebGenericEditConditionsPropertyConditionType {
  VISIBLE("Visible"),
  ENABLED("Enabled");

  private String value;

  EmbyWebGenericEditConditionsPropertyConditionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyWebGenericEditConditionsPropertyConditionType fromValue(String input) {
    for (EmbyWebGenericEditConditionsPropertyConditionType b : EmbyWebGenericEditConditionsPropertyConditionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyWebGenericEditConditionsPropertyConditionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyWebGenericEditConditionsPropertyConditionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyWebGenericEditConditionsPropertyConditionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyWebGenericEditConditionsPropertyConditionType.fromValue((String)(value));
    }
  }
}
