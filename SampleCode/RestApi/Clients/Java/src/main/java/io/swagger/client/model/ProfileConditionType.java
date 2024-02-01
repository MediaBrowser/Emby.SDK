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
 * Gets or Sets ProfileConditionType
 */
@JsonAdapter(ProfileConditionType.Adapter.class)
public enum ProfileConditionType {
  EQUALS("Equals"),
  NOTEQUALS("NotEquals"),
  LESSTHANEQUAL("LessThanEqual"),
  GREATERTHANEQUAL("GreaterThanEqual"),
  EQUALSANY("EqualsAny");

  private String value;

  ProfileConditionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProfileConditionType fromValue(String input) {
    for (ProfileConditionType b : ProfileConditionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProfileConditionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProfileConditionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ProfileConditionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ProfileConditionType.fromValue((String)(value));
    }
  }
}
