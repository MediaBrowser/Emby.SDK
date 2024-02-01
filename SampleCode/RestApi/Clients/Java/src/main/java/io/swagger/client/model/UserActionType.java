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
 * Gets or Sets UserActionType
 */
@JsonAdapter(UserActionType.Adapter.class)
public enum UserActionType {
  PLAYEDITEM("PlayedItem"),
  MARKPLAYED("MarkPlayed"),
  MARKFAVORITE("MarkFavorite");

  private String value;

  UserActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserActionType fromValue(String input) {
    for (UserActionType b : UserActionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserActionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UserActionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UserActionType.fromValue((String)(value));
    }
  }
}
