/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
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
 * Gets or Sets Users.UserActionType
 */
@JsonAdapter(UsersUserActionType.Adapter.class)
public enum UsersUserActionType {
  PLAYEDITEM("PlayedItem");

  private String value;

  UsersUserActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UsersUserActionType fromValue(String input) {
    for (UsersUserActionType b : UsersUserActionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UsersUserActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UsersUserActionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public UsersUserActionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return UsersUserActionType.fromValue((String)(value));
    }
  }
}