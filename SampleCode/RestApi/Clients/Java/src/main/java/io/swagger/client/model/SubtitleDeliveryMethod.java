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
 * Gets or Sets SubtitleDeliveryMethod
 */
@JsonAdapter(SubtitleDeliveryMethod.Adapter.class)
public enum SubtitleDeliveryMethod {
  ENCODE("Encode"),
  EMBED("Embed"),
  EXTERNAL("External"),
  HLS("Hls"),
  VIDEOSIDEDATA("VideoSideData");

  private String value;

  SubtitleDeliveryMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubtitleDeliveryMethod fromValue(String input) {
    for (SubtitleDeliveryMethod b : SubtitleDeliveryMethod.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SubtitleDeliveryMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubtitleDeliveryMethod enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SubtitleDeliveryMethod read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SubtitleDeliveryMethod.fromValue((String)(value));
    }
  }
}
