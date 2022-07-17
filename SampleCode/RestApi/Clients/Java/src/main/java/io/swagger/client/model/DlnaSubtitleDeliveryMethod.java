/*
 * Emby Server REST API (BETA)
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
 * Gets or Sets Dlna.SubtitleDeliveryMethod
 */
@JsonAdapter(DlnaSubtitleDeliveryMethod.Adapter.class)
public enum DlnaSubtitleDeliveryMethod {
  ENCODE("Encode"),
  EMBED("Embed"),
  EXTERNAL("External"),
  HLS("Hls"),
  VIDEOSIDEDATA("VideoSideData");

  private String value;

  DlnaSubtitleDeliveryMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaSubtitleDeliveryMethod fromValue(String input) {
    for (DlnaSubtitleDeliveryMethod b : DlnaSubtitleDeliveryMethod.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaSubtitleDeliveryMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaSubtitleDeliveryMethod enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaSubtitleDeliveryMethod read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaSubtitleDeliveryMethod.fromValue((String)(value));
    }
  }
}
