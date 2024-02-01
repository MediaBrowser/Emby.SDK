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
 * Gets or Sets SyncCategory
 */
@JsonAdapter(SyncCategory.Adapter.class)
public enum SyncCategory {
  LATEST("Latest"),
  NEXTUP("NextUp"),
  RESUME("Resume");

  private String value;

  SyncCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncCategory fromValue(String input) {
    for (SyncCategory b : SyncCategory.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncCategory enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncCategory read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncCategory.fromValue((String)(value));
    }
  }
}
