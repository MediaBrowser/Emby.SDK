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
 * Gets or Sets Dlna.TranscodeSeekInfo
 */
@JsonAdapter(DlnaTranscodeSeekInfo.Adapter.class)
public enum DlnaTranscodeSeekInfo {
  AUTO("Auto"),
  BYTES("Bytes");

  private String value;

  DlnaTranscodeSeekInfo(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaTranscodeSeekInfo fromValue(String input) {
    for (DlnaTranscodeSeekInfo b : DlnaTranscodeSeekInfo.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaTranscodeSeekInfo> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaTranscodeSeekInfo enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaTranscodeSeekInfo read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaTranscodeSeekInfo.fromValue((String)(value));
    }
  }
}
