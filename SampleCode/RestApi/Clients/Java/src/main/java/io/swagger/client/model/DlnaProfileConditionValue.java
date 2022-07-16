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
 * Gets or Sets Dlna.ProfileConditionValue
 */
@JsonAdapter(DlnaProfileConditionValue.Adapter.class)
public enum DlnaProfileConditionValue {
  AUDIOCHANNELS("AudioChannels"),
  AUDIOBITRATE("AudioBitrate"),
  AUDIOPROFILE("AudioProfile"),
  WIDTH("Width"),
  HEIGHT("Height"),
  HAS64BITOFFSETS("Has64BitOffsets"),
  PACKETLENGTH("PacketLength"),
  VIDEOBITDEPTH("VideoBitDepth"),
  VIDEOBITRATE("VideoBitrate"),
  VIDEOFRAMERATE("VideoFramerate"),
  VIDEOLEVEL("VideoLevel"),
  VIDEOPROFILE("VideoProfile"),
  VIDEOTIMESTAMP("VideoTimestamp"),
  ISANAMORPHIC("IsAnamorphic"),
  REFFRAMES("RefFrames"),
  NUMAUDIOSTREAMS("NumAudioStreams"),
  NUMVIDEOSTREAMS("NumVideoStreams"),
  ISSECONDARYAUDIO("IsSecondaryAudio"),
  VIDEOCODECTAG("VideoCodecTag"),
  ISAVC("IsAvc"),
  ISINTERLACED("IsInterlaced"),
  AUDIOSAMPLERATE("AudioSampleRate"),
  AUDIOBITDEPTH("AudioBitDepth"),
  VIDEORANGE("VideoRange");

  private String value;

  DlnaProfileConditionValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DlnaProfileConditionValue fromValue(String input) {
    for (DlnaProfileConditionValue b : DlnaProfileConditionValue.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DlnaProfileConditionValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final DlnaProfileConditionValue enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DlnaProfileConditionValue read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DlnaProfileConditionValue.fromValue((String)(value));
    }
  }
}
