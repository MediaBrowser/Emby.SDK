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
 * Gets or Sets TranscodeReason
 */
@JsonAdapter(TranscodeReason.Adapter.class)
public enum TranscodeReason {
  CONTAINERNOTSUPPORTED("ContainerNotSupported"),
  VIDEOCODECNOTSUPPORTED("VideoCodecNotSupported"),
  AUDIOCODECNOTSUPPORTED("AudioCodecNotSupported"),
  CONTAINERBITRATEEXCEEDSLIMIT("ContainerBitrateExceedsLimit"),
  AUDIOBITRATENOTSUPPORTED("AudioBitrateNotSupported"),
  AUDIOCHANNELSNOTSUPPORTED("AudioChannelsNotSupported"),
  VIDEORESOLUTIONNOTSUPPORTED("VideoResolutionNotSupported"),
  UNKNOWNVIDEOSTREAMINFO("UnknownVideoStreamInfo"),
  UNKNOWNAUDIOSTREAMINFO("UnknownAudioStreamInfo"),
  AUDIOPROFILENOTSUPPORTED("AudioProfileNotSupported"),
  AUDIOSAMPLERATENOTSUPPORTED("AudioSampleRateNotSupported"),
  ANAMORPHICVIDEONOTSUPPORTED("AnamorphicVideoNotSupported"),
  INTERLACEDVIDEONOTSUPPORTED("InterlacedVideoNotSupported"),
  SECONDARYAUDIONOTSUPPORTED("SecondaryAudioNotSupported"),
  REFFRAMESNOTSUPPORTED("RefFramesNotSupported"),
  VIDEOBITDEPTHNOTSUPPORTED("VideoBitDepthNotSupported"),
  VIDEOBITRATENOTSUPPORTED("VideoBitrateNotSupported"),
  VIDEOFRAMERATENOTSUPPORTED("VideoFramerateNotSupported"),
  VIDEOLEVELNOTSUPPORTED("VideoLevelNotSupported"),
  VIDEOPROFILENOTSUPPORTED("VideoProfileNotSupported"),
  AUDIOBITDEPTHNOTSUPPORTED("AudioBitDepthNotSupported"),
  SUBTITLECODECNOTSUPPORTED("SubtitleCodecNotSupported"),
  DIRECTPLAYERROR("DirectPlayError"),
  VIDEORANGENOTSUPPORTED("VideoRangeNotSupported"),
  SUBTITLECONTENTOPTIONSENABLED("SubtitleContentOptionsEnabled");

  private String value;

  TranscodeReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TranscodeReason fromValue(String input) {
    for (TranscodeReason b : TranscodeReason.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TranscodeReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final TranscodeReason enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TranscodeReason read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TranscodeReason.fromValue((String)(value));
    }
  }
}
