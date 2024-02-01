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
 * Gets or Sets Connect.UserLinkType
 */
@JsonAdapter(ConnectUserLinkType.Adapter.class)
public enum ConnectUserLinkType {
  LINKEDUSER("LinkedUser"),
  GUEST("Guest");

  private String value;

  ConnectUserLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConnectUserLinkType fromValue(String input) {
    for (ConnectUserLinkType b : ConnectUserLinkType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConnectUserLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConnectUserLinkType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ConnectUserLinkType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ConnectUserLinkType.fromValue((String)(value));
    }
  }
}
