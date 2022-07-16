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
 * Gets or Sets Sync.Model.SyncJobOption
 */
@JsonAdapter(SyncModelSyncJobOption.Adapter.class)
public enum SyncModelSyncJobOption {
  NAME("Name"),
  QUALITY("Quality"),
  UNWATCHEDONLY("UnwatchedOnly"),
  SYNCNEWCONTENT("SyncNewContent"),
  ITEMLIMIT("ItemLimit"),
  PROFILE("Profile");

  private String value;

  SyncModelSyncJobOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncModelSyncJobOption fromValue(String input) {
    for (SyncModelSyncJobOption b : SyncModelSyncJobOption.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncModelSyncJobOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncModelSyncJobOption enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncModelSyncJobOption read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncModelSyncJobOption.fromValue((String)(value));
    }
  }
}
