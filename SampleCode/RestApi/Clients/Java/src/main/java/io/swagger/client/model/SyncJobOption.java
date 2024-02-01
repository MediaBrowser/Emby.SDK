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
 * Gets or Sets SyncJobOption
 */
@JsonAdapter(SyncJobOption.Adapter.class)
public enum SyncJobOption {
  NAME("Name"),
  QUALITY("Quality"),
  UNWATCHEDONLY("UnwatchedOnly"),
  SYNCNEWCONTENT("SyncNewContent"),
  ITEMLIMIT("ItemLimit"),
  PROFILE("Profile");

  private String value;

  SyncJobOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncJobOption fromValue(String input) {
    for (SyncJobOption b : SyncJobOption.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncJobOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncJobOption enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncJobOption read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncJobOption.fromValue((String)(value));
    }
  }
}
