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
 * Gets or Sets ProfileConditionValue
 */
@JsonAdapter(ProfileConditionValue.Adapter.class)
public enum ProfileConditionValue {
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
  VIDEORANGE("VideoRange"),
  VIDEOROTATION("VideoRotation");

  private String value;

  ProfileConditionValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProfileConditionValue fromValue(String input) {
    for (ProfileConditionValue b : ProfileConditionValue.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProfileConditionValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProfileConditionValue enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ProfileConditionValue read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ProfileConditionValue.fromValue((String)(value));
    }
  }
}
