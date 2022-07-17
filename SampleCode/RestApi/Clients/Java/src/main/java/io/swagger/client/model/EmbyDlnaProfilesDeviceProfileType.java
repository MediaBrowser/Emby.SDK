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
 * Gets or Sets Emby.Dlna.Profiles.DeviceProfileType
 */
@JsonAdapter(EmbyDlnaProfilesDeviceProfileType.Adapter.class)
public enum EmbyDlnaProfilesDeviceProfileType {
  SYSTEM("System"),
  USER("User");

  private String value;

  EmbyDlnaProfilesDeviceProfileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyDlnaProfilesDeviceProfileType fromValue(String input) {
    for (EmbyDlnaProfilesDeviceProfileType b : EmbyDlnaProfilesDeviceProfileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyDlnaProfilesDeviceProfileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyDlnaProfilesDeviceProfileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyDlnaProfilesDeviceProfileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyDlnaProfilesDeviceProfileType.fromValue((String)(value));
    }
  }
}
