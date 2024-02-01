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
 * Gets or Sets UserItemShareLevel
 */
@JsonAdapter(UserItemShareLevel.Adapter.class)
public enum UserItemShareLevel {
  NONE("None"),
  READ("Read"),
  WRITE("Write"),
  MANAGE("Manage"),
  MANAGEDELETE("ManageDelete");

  private String value;

  UserItemShareLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserItemShareLevel fromValue(String input) {
    for (UserItemShareLevel b : UserItemShareLevel.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserItemShareLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserItemShareLevel enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UserItemShareLevel read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UserItemShareLevel.fromValue((String)(value));
    }
  }
}
