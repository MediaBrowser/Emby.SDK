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
 * Gets or Sets Dlna.Profiles.DeviceProfileType
 */
@JsonAdapter(DlnaProfilesDeviceProfileType.Adapter.class)
public enum DlnaProfilesDeviceProfileType {
  SYSTEM("System"),
  USER("User");

  private String value;

  DlnaProfilesDeviceProfileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaProfilesDeviceProfileType fromValue(String input) {
    for (DlnaProfilesDeviceProfileType b : DlnaProfilesDeviceProfileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaProfilesDeviceProfileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaProfilesDeviceProfileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaProfilesDeviceProfileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaProfilesDeviceProfileType.fromValue((String)(value));
    }
  }
}
