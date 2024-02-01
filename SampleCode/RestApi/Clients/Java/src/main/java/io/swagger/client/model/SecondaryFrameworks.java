/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum defining secondary frameworks for encoding and decoding.      While most of these are hardware acceleration frameworks, this is not a necessity             (e.g. Android MediaCodec offers software codecs as well).  
 */
@JsonAdapter(SecondaryFrameworks.Adapter.class)
public enum SecondaryFrameworks {
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

  SecondaryFrameworks(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecondaryFrameworks fromValue(String input) {
    for (SecondaryFrameworks b : SecondaryFrameworks.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecondaryFrameworks> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecondaryFrameworks enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SecondaryFrameworks read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SecondaryFrameworks.fromValue((String)(value));
    }
  }
}
