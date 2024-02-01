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
 * Gets or Sets Enums.UIViewType
 */
@JsonAdapter(EnumsUIViewType.Adapter.class)
public enum EnumsUIViewType {
  REGULARPAGE("RegularPage"),
  DIALOG("Dialog"),
  WIZARD("Wizard");

  private String value;

  EnumsUIViewType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumsUIViewType fromValue(String input) {
    for (EnumsUIViewType b : EnumsUIViewType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumsUIViewType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumsUIViewType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EnumsUIViewType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EnumsUIViewType.fromValue((String)(value));
    }
  }
}
