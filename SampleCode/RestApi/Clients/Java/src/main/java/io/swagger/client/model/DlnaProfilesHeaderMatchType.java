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
 * Gets or Sets Dlna.Profiles.HeaderMatchType
 */
@JsonAdapter(DlnaProfilesHeaderMatchType.Adapter.class)
public enum DlnaProfilesHeaderMatchType {
  EQUALS("Equals"),
  REGEX("Regex"),
  SUBSTRING("Substring");

  private String value;

  DlnaProfilesHeaderMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaProfilesHeaderMatchType fromValue(String input) {
    for (DlnaProfilesHeaderMatchType b : DlnaProfilesHeaderMatchType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaProfilesHeaderMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaProfilesHeaderMatchType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaProfilesHeaderMatchType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaProfilesHeaderMatchType.fromValue((String)(value));
    }
  }
}
