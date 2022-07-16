/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
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
 * Gets or Sets Sync.SyncCategory
 */
@JsonAdapter(SyncSyncCategory.Adapter.class)
public enum SyncSyncCategory {
  LATEST("Latest"),
  NEXTUP("NextUp"),
  RESUME("Resume");

  private String value;

  SyncSyncCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncSyncCategory fromValue(String input) {
    for (SyncSyncCategory b : SyncSyncCategory.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncSyncCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncSyncCategory enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncSyncCategory read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncSyncCategory.fromValue((String)(value));
    }
  }
}
