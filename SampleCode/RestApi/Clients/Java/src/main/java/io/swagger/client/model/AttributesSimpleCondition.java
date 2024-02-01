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
 * Conditions on the source value.  
 */
@JsonAdapter(AttributesSimpleCondition.Adapter.class)
public enum AttributesSimpleCondition {
  ISTRUE("IsTrue"),
  ISFALSE("IsFalse"),
  ISNULL("IsNull"),
  ISNOTNULLOREMPTY("IsNotNullOrEmpty");

  private String value;

  AttributesSimpleCondition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttributesSimpleCondition fromValue(String input) {
    for (AttributesSimpleCondition b : AttributesSimpleCondition.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AttributesSimpleCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final AttributesSimpleCondition enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AttributesSimpleCondition read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return AttributesSimpleCondition.fromValue((String)(value));
    }
  }
}
