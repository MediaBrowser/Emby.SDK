/*
 * Emby REST API
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
 * Gets or Sets MediaInfo.TransportStreamTimestamp
 */
@JsonAdapter(MediaInfoTransportStreamTimestamp.Adapter.class)
public enum MediaInfoTransportStreamTimestamp {
  NONE("None"),
  ZERO("Zero"),
  VALID("Valid");

  private String value;

  MediaInfoTransportStreamTimestamp(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaInfoTransportStreamTimestamp fromValue(String input) {
    for (MediaInfoTransportStreamTimestamp b : MediaInfoTransportStreamTimestamp.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaInfoTransportStreamTimestamp> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaInfoTransportStreamTimestamp enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaInfoTransportStreamTimestamp read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaInfoTransportStreamTimestamp.fromValue((String)(value));
    }
  }
}
