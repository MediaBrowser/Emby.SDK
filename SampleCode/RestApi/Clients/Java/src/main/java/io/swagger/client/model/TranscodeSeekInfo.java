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
 * Gets or Sets TranscodeSeekInfo
 */
@JsonAdapter(TranscodeSeekInfo.Adapter.class)
public enum TranscodeSeekInfo {
  AUTO("Auto"),
  BYTES("Bytes");

  private String value;

  TranscodeSeekInfo(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TranscodeSeekInfo fromValue(String input) {
    for (TranscodeSeekInfo b : TranscodeSeekInfo.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TranscodeSeekInfo> {
    @Override
    public void write(final JsonWriter jsonWriter, final TranscodeSeekInfo enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TranscodeSeekInfo read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TranscodeSeekInfo.fromValue((String)(value));
    }
  }
}
