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
 * Video Processing Step Type enum.  
 */
@JsonAdapter(TranscodingVpStepTypes.Adapter.class)
public enum TranscodingVpStepTypes {
  DECODER("Decoder"),
  ENCODER("Encoder"),
  SCALING("Scaling"),
  DEINTERLACE("Deinterlace"),
  SUBTITLEOVERLAY("SubtitleOverlay"),
  TONEMAPPING("ToneMapping"),
  COLORCONVERSION("ColorConversion"),
  SPLITCAPTIONS("SplitCaptions"),
  TEXTSUB2VIDEO("TextSub2Video"),
  GRAPHICSUB2VIDEO("GraphicSub2Video"),
  GRAPHICSUB2TEXT("GraphicSub2Text"),
  BURNINTEXTSUBS("BurnInTextSubs"),
  BURNINGRAPHICSUBS("BurnInGraphicSubs"),
  SCALESUBS("ScaleSubs"),
  TEXTMOD("TextMod"),
  CENSOR("Censor"),
  SHOWSPEAKER("ShowSpeaker"),
  STRIPSTYLES("StripStyles"),
  CONNECTTO("ConnectTo");

  private String value;

  TranscodingVpStepTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TranscodingVpStepTypes fromValue(String input) {
    for (TranscodingVpStepTypes b : TranscodingVpStepTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TranscodingVpStepTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final TranscodingVpStepTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TranscodingVpStepTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TranscodingVpStepTypes.fromValue((String)(value));
    }
  }
}
