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
 * Gets or Sets SyncJobItemStatus
 */
@JsonAdapter(SyncJobItemStatus.Adapter.class)
public enum SyncJobItemStatus {
  QUEUED("Queued"),
  CONVERTING("Converting"),
  READYTOTRANSFER("ReadyToTransfer"),
  TRANSFERRING("Transferring"),
  SYNCED("Synced"),
  FAILED("Failed");

  private String value;

  SyncJobItemStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncJobItemStatus fromValue(String input) {
    for (SyncJobItemStatus b : SyncJobItemStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncJobItemStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncJobItemStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncJobItemStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncJobItemStatus.fromValue((String)(value));
    }
  }
}
