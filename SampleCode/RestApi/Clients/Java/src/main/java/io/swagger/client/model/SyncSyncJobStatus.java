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
 * Gets or Sets Sync.SyncJobStatus
 */
@JsonAdapter(SyncSyncJobStatus.Adapter.class)
public enum SyncSyncJobStatus {
  QUEUED("Queued"),
  CONVERTING("Converting"),
  READYTOTRANSFER("ReadyToTransfer"),
  TRANSFERRING("Transferring"),
  COMPLETED("Completed"),
  COMPLETEDWITHERROR("CompletedWithError"),
  FAILED("Failed");

  private String value;

  SyncSyncJobStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SyncSyncJobStatus fromValue(String input) {
    for (SyncSyncJobStatus b : SyncSyncJobStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SyncSyncJobStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SyncSyncJobStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SyncSyncJobStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SyncSyncJobStatus.fromValue((String)(value));
    }
  }
}
