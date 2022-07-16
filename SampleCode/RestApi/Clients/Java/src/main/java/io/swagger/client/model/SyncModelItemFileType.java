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
 * Gets or Sets Sync.Model.ItemFileType
 */
@JsonAdapter(SyncModelItemFileType.Adapter.class)
public enum SyncModelItemFileType {
  MEDIA("Media"),
  IMAGE("Image"),
  SUBTITLES("Subtitles");

  private String value;

  SyncModelItemFileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncModelItemFileType fromValue(String input) {
    for (SyncModelItemFileType b : SyncModelItemFileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncModelItemFileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncModelItemFileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncModelItemFileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncModelItemFileType.fromValue((String)(value));
    }
  }
}
