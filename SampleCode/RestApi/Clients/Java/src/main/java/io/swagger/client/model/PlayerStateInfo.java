/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.PlayMethod;
import io.swagger.client.model.RepeatMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PlayerStateInfo
 */


public class PlayerStateInfo {
  @SerializedName("PositionTicks")
  private Long positionTicks = null;

  @SerializedName("CanSeek")
  private Boolean canSeek = null;

  @SerializedName("IsPaused")
  private Boolean isPaused = null;

  @SerializedName("IsMuted")
  private Boolean isMuted = null;

  @SerializedName("VolumeLevel")
  private Integer volumeLevel = null;

  @SerializedName("AudioStreamIndex")
  private Integer audioStreamIndex = null;

  @SerializedName("SubtitleStreamIndex")
  private Integer subtitleStreamIndex = null;

  @SerializedName("MediaSourceId")
  private String mediaSourceId = null;

  @SerializedName("PlayMethod")
  private PlayMethod playMethod = null;

  @SerializedName("RepeatMode")
  private RepeatMode repeatMode = null;

  @SerializedName("SubtitleOffset")
  private Integer subtitleOffset = null;

  @SerializedName("Shuffle")
  private Boolean shuffle = null;

  @SerializedName("PlaybackRate")
  private Double playbackRate = null;

  public PlayerStateInfo positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

   /**
   * The now playing position ticks.
   * @return positionTicks
  **/
  @Schema(description = "The now playing position ticks.")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public PlayerStateInfo canSeek(Boolean canSeek) {
    this.canSeek = canSeek;
    return this;
  }

   /**
   * A value indicating whether this instance can seek.
   * @return canSeek
  **/
  @Schema(description = "A value indicating whether this instance can seek.")
  public Boolean isCanSeek() {
    return canSeek;
  }

  public void setCanSeek(Boolean canSeek) {
    this.canSeek = canSeek;
  }

  public PlayerStateInfo isPaused(Boolean isPaused) {
    this.isPaused = isPaused;
    return this;
  }

   /**
   * A value indicating whether this instance is paused.
   * @return isPaused
  **/
  @Schema(description = "A value indicating whether this instance is paused.")
  public Boolean isIsPaused() {
    return isPaused;
  }

  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }

  public PlayerStateInfo isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

   /**
   * A value indicating whether this instance is muted.
   * @return isMuted
  **/
  @Schema(description = "A value indicating whether this instance is muted.")
  public Boolean isIsMuted() {
    return isMuted;
  }

  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  public PlayerStateInfo volumeLevel(Integer volumeLevel) {
    this.volumeLevel = volumeLevel;
    return this;
  }

   /**
   * The volume level.
   * @return volumeLevel
  **/
  @Schema(description = "The volume level.")
  public Integer getVolumeLevel() {
    return volumeLevel;
  }

  public void setVolumeLevel(Integer volumeLevel) {
    this.volumeLevel = volumeLevel;
  }

  public PlayerStateInfo audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
    return this;
  }

   /**
   * The index of the now playing audio stream.
   * @return audioStreamIndex
  **/
  @Schema(description = "The index of the now playing audio stream.")
  public Integer getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlayerStateInfo subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
    return this;
  }

   /**
   * The index of the now playing subtitle stream.
   * @return subtitleStreamIndex
  **/
  @Schema(description = "The index of the now playing subtitle stream.")
  public Integer getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlayerStateInfo mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
    return this;
  }

   /**
   * The now playing media version identifier.
   * @return mediaSourceId
  **/
  @Schema(description = "The now playing media version identifier.")
  public String getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlayerStateInfo playMethod(PlayMethod playMethod) {
    this.playMethod = playMethod;
    return this;
  }

   /**
   * Get playMethod
   * @return playMethod
  **/
  @Schema(description = "")
  public PlayMethod getPlayMethod() {
    return playMethod;
  }

  public void setPlayMethod(PlayMethod playMethod) {
    this.playMethod = playMethod;
  }

  public PlayerStateInfo repeatMode(RepeatMode repeatMode) {
    this.repeatMode = repeatMode;
    return this;
  }

   /**
   * Get repeatMode
   * @return repeatMode
  **/
  @Schema(description = "")
  public RepeatMode getRepeatMode() {
    return repeatMode;
  }

  public void setRepeatMode(RepeatMode repeatMode) {
    this.repeatMode = repeatMode;
  }

  public PlayerStateInfo subtitleOffset(Integer subtitleOffset) {
    this.subtitleOffset = subtitleOffset;
    return this;
  }

   /**
   * Get subtitleOffset
   * @return subtitleOffset
  **/
  @Schema(description = "")
  public Integer getSubtitleOffset() {
    return subtitleOffset;
  }

  public void setSubtitleOffset(Integer subtitleOffset) {
    this.subtitleOffset = subtitleOffset;
  }

  public PlayerStateInfo shuffle(Boolean shuffle) {
    this.shuffle = shuffle;
    return this;
  }

   /**
   * Get shuffle
   * @return shuffle
  **/
  @Schema(description = "")
  public Boolean isShuffle() {
    return shuffle;
  }

  public void setShuffle(Boolean shuffle) {
    this.shuffle = shuffle;
  }

  public PlayerStateInfo playbackRate(Double playbackRate) {
    this.playbackRate = playbackRate;
    return this;
  }

   /**
   * Get playbackRate
   * @return playbackRate
  **/
  @Schema(description = "")
  public Double getPlaybackRate() {
    return playbackRate;
  }

  public void setPlaybackRate(Double playbackRate) {
    this.playbackRate = playbackRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerStateInfo playerStateInfo = (PlayerStateInfo) o;
    return Objects.equals(this.positionTicks, playerStateInfo.positionTicks) &&
        Objects.equals(this.canSeek, playerStateInfo.canSeek) &&
        Objects.equals(this.isPaused, playerStateInfo.isPaused) &&
        Objects.equals(this.isMuted, playerStateInfo.isMuted) &&
        Objects.equals(this.volumeLevel, playerStateInfo.volumeLevel) &&
        Objects.equals(this.audioStreamIndex, playerStateInfo.audioStreamIndex) &&
        Objects.equals(this.subtitleStreamIndex, playerStateInfo.subtitleStreamIndex) &&
        Objects.equals(this.mediaSourceId, playerStateInfo.mediaSourceId) &&
        Objects.equals(this.playMethod, playerStateInfo.playMethod) &&
        Objects.equals(this.repeatMode, playerStateInfo.repeatMode) &&
        Objects.equals(this.subtitleOffset, playerStateInfo.subtitleOffset) &&
        Objects.equals(this.shuffle, playerStateInfo.shuffle) &&
        Objects.equals(this.playbackRate, playerStateInfo.playbackRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionTicks, canSeek, isPaused, isMuted, volumeLevel, audioStreamIndex, subtitleStreamIndex, mediaSourceId, playMethod, repeatMode, subtitleOffset, shuffle, playbackRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerStateInfo {\n");
    
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    volumeLevel: ").append(toIndentedString(volumeLevel)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    playMethod: ").append(toIndentedString(playMethod)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    subtitleOffset: ").append(toIndentedString(subtitleOffset)).append("\n");
    sb.append("    shuffle: ").append(toIndentedString(shuffle)).append("\n");
    sb.append("    playbackRate: ").append(toIndentedString(playbackRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
