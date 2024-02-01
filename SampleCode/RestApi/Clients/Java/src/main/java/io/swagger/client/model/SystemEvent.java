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
 * Enum SystemEvent  
 */
@JsonAdapter(SystemEvent.Adapter.class)
public enum SystemEvent {
  WAKEFROMSLEEP("WakeFromSleep"),
  DISPLAYCONFIGURATIONCHANGE("DisplayConfigurationChange"),
  NETWORKCHANGE("NetworkChange");

  private String value;

  SystemEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SystemEvent fromValue(String input) {
    for (SystemEvent b : SystemEvent.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SystemEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final SystemEvent enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SystemEvent read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SystemEvent.fromValue((String)(value));
    }
  }
}
