/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * Gets or Sets Emby.Media.Model.Enums.SecondaryFrameworks
 */
@JsonAdapter(EmbyMediaModelEnumsSecondaryFrameworks.Adapter.class)
public enum EmbyMediaModelEnumsSecondaryFrameworks {
  UNKNOWN("Unknown"),
  NONE("None"),
  AMDAMF("AmdAmf"),
  MEDIACODEC("MediaCodec"),
  NVENCDEC("NvEncDec"),
  OPENMAX("OpenMax"),
  QUICKSYNC("QuickSync"),
  VAAPI("VaApi"),
  V4L2("V4L2"),
  DXVA("DxVa"),
  D3D11VA("D3d11va"),
  VIDEOTOOLBOX("VideoToolbox"),
  MMAL("Mmal");

  private String value;

  EmbyMediaModelEnumsSecondaryFrameworks(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyMediaModelEnumsSecondaryFrameworks fromValue(String input) {
    for (EmbyMediaModelEnumsSecondaryFrameworks b : EmbyMediaModelEnumsSecondaryFrameworks.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyMediaModelEnumsSecondaryFrameworks> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyMediaModelEnumsSecondaryFrameworks enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyMediaModelEnumsSecondaryFrameworks read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyMediaModelEnumsSecondaryFrameworks.fromValue((String)(value));
    }
  }
}
