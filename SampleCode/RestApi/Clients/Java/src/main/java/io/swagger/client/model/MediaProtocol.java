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
 * Gets or Sets MediaProtocol
 */
@JsonAdapter(MediaProtocol.Adapter.class)
public enum MediaProtocol {
  FILE("File"),
  HTTP("Http"),
  RTMP("Rtmp"),
  RTSP("Rtsp"),
  UDP("Udp"),
  RTP("Rtp"),
  FTP("Ftp"),
  MMS("Mms");

  private String value;

  MediaProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaProtocol fromValue(String input) {
    for (MediaProtocol b : MediaProtocol.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaProtocol enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaProtocol read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaProtocol.fromValue((String)(value));
    }
  }
}
