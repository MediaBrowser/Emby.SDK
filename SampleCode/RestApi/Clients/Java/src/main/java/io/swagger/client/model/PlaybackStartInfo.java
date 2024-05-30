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
import io.swagger.client.model.BaseItemDto;
import io.swagger.client.model.PlayMethod;
import io.swagger.client.model.ProgressEvent;
import io.swagger.client.model.QueueItem;
import io.swagger.client.model.RepeatMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class PlaybackStartInfo.  
 */
@Schema(description = "Class PlaybackStartInfo.  ")

public class PlaybackStartInfo {
  @SerializedName("CanSeek")
  private Boolean canSeek = null;

  @SerializedName("Item")
  private BaseItemDto item = null;

  @SerializedName("NowPlayingQueue")
  private List<QueueItem> nowPlayingQueue = null;

  @SerializedName("PlaylistItemId")
  private String playlistItemId = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("SessionId")
  private String sessionId = null;

  @SerializedName("MediaSourceId")
  private String mediaSourceId = null;

  @SerializedName("AudioStreamIndex")
  private Integer audioStreamIndex = null;

  @SerializedName("SubtitleStreamIndex")
  private Integer subtitleStreamIndex = null;

  @SerializedName("IsPaused")
  private Boolean isPaused = null;

  @SerializedName("PlaylistIndex")
  private Integer playlistIndex = null;

  @SerializedName("PlaylistLength")
  private Integer playlistLength = null;

  @SerializedName("IsMuted")
  private Boolean isMuted = null;

  @SerializedName("PositionTicks")
  private Long positionTicks = null;

  @SerializedName("RunTimeTicks")
  private Long runTimeTicks = null;

  @SerializedName("PlaybackStartTimeTicks")
  private Long playbackStartTimeTicks = null;

  @SerializedName("VolumeLevel")
  private Integer volumeLevel = null;

  @SerializedName("Brightness")
  private Integer brightness = null;

  @SerializedName("AspectRatio")
  private String aspectRatio = null;

  @SerializedName("EventName")
  private ProgressEvent eventName = null;

  @SerializedName("PlayMethod")
  private PlayMethod playMethod = null;

  @SerializedName("LiveStreamId")
  private String liveStreamId = null;

  @SerializedName("PlaySessionId")
  private String playSessionId = null;

  @SerializedName("RepeatMode")
  private RepeatMode repeatMode = null;

  @SerializedName("Shuffle")
  private Boolean shuffle = null;

  @SerializedName("SubtitleOffset")
  private Integer subtitleOffset = null;

  @SerializedName("PlaybackRate")
  private Double playbackRate = null;

  @SerializedName("PlaylistItemIds")
  private List<String> playlistItemIds = null;

  public PlaybackStartInfo canSeek(Boolean canSeek) {
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

  public PlaybackStartInfo item(BaseItemDto item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @Schema(description = "")
  public BaseItemDto getItem() {
    return item;
  }

  public void setItem(BaseItemDto item) {
    this.item = item;
  }

  public PlaybackStartInfo nowPlayingQueue(List<QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
    return this;
  }

  public PlaybackStartInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
    if (this.nowPlayingQueue == null) {
      this.nowPlayingQueue = new ArrayList<QueueItem>();
    }
    this.nowPlayingQueue.add(nowPlayingQueueItem);
    return this;
  }

   /**
   * Get nowPlayingQueue
   * @return nowPlayingQueue
  **/
  @Schema(description = "")
  public List<QueueItem> getNowPlayingQueue() {
    return nowPlayingQueue;
  }

  public void setNowPlayingQueue(List<QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
  }

  public PlaybackStartInfo playlistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

   /**
   * Get playlistItemId
   * @return playlistItemId
  **/
  @Schema(description = "")
  public String getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(String playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public PlaybackStartInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The item identifier.
   * @return itemId
  **/
  @Schema(description = "The item identifier.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public PlaybackStartInfo sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The session id.
   * @return sessionId
  **/
  @Schema(description = "The session id.")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public PlaybackStartInfo mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
    return this;
  }

   /**
   * The media version identifier.
   * @return mediaSourceId
  **/
  @Schema(description = "The media version identifier.")
  public String getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlaybackStartInfo audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
    return this;
  }

   /**
   * The index of the audio stream.
   * @return audioStreamIndex
  **/
  @Schema(description = "The index of the audio stream.")
  public Integer getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlaybackStartInfo subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
    return this;
  }

   /**
   * The index of the subtitle stream.
   * @return subtitleStreamIndex
  **/
  @Schema(description = "The index of the subtitle stream.")
  public Integer getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlaybackStartInfo isPaused(Boolean isPaused) {
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

  public PlaybackStartInfo playlistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
    return this;
  }

   /**
   * Get playlistIndex
   * @return playlistIndex
  **/
  @Schema(description = "")
  public Integer getPlaylistIndex() {
    return playlistIndex;
  }

  public void setPlaylistIndex(Integer playlistIndex) {
    this.playlistIndex = playlistIndex;
  }

  public PlaybackStartInfo playlistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
    return this;
  }

   /**
   * Get playlistLength
   * @return playlistLength
  **/
  @Schema(description = "")
  public Integer getPlaylistLength() {
    return playlistLength;
  }

  public void setPlaylistLength(Integer playlistLength) {
    this.playlistLength = playlistLength;
  }

  public PlaybackStartInfo isMuted(Boolean isMuted) {
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

  public PlaybackStartInfo positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

   /**
   * The position ticks.
   * @return positionTicks
  **/
  @Schema(description = "The position ticks.")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public PlaybackStartInfo runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
    return this;
  }

   /**
   * Get runTimeTicks
   * @return runTimeTicks
  **/
  @Schema(description = "")
  public Long getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public PlaybackStartInfo playbackStartTimeTicks(Long playbackStartTimeTicks) {
    this.playbackStartTimeTicks = playbackStartTimeTicks;
    return this;
  }

   /**
   * Get playbackStartTimeTicks
   * @return playbackStartTimeTicks
  **/
  @Schema(description = "")
  public Long getPlaybackStartTimeTicks() {
    return playbackStartTimeTicks;
  }

  public void setPlaybackStartTimeTicks(Long playbackStartTimeTicks) {
    this.playbackStartTimeTicks = playbackStartTimeTicks;
  }

  public PlaybackStartInfo volumeLevel(Integer volumeLevel) {
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

  public PlaybackStartInfo brightness(Integer brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Get brightness
   * @return brightness
  **/
  @Schema(description = "")
  public Integer getBrightness() {
    return brightness;
  }

  public void setBrightness(Integer brightness) {
    this.brightness = brightness;
  }

  public PlaybackStartInfo aspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Get aspectRatio
   * @return aspectRatio
  **/
  @Schema(description = "")
  public String getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public PlaybackStartInfo eventName(ProgressEvent eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @Schema(description = "")
  public ProgressEvent getEventName() {
    return eventName;
  }

  public void setEventName(ProgressEvent eventName) {
    this.eventName = eventName;
  }

  public PlaybackStartInfo playMethod(PlayMethod playMethod) {
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

  public PlaybackStartInfo liveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * The live stream identifier.
   * @return liveStreamId
  **/
  @Schema(description = "The live stream identifier.")
  public String getLiveStreamId() {
    return liveStreamId;
  }

  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }

  public PlaybackStartInfo playSessionId(String playSessionId) {
    this.playSessionId = playSessionId;
    return this;
  }

   /**
   * The play session identifier.
   * @return playSessionId
  **/
  @Schema(description = "The play session identifier.")
  public String getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(String playSessionId) {
    this.playSessionId = playSessionId;
  }

  public PlaybackStartInfo repeatMode(RepeatMode repeatMode) {
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

  public PlaybackStartInfo shuffle(Boolean shuffle) {
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

  public PlaybackStartInfo subtitleOffset(Integer subtitleOffset) {
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

  public PlaybackStartInfo playbackRate(Double playbackRate) {
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

  public PlaybackStartInfo playlistItemIds(List<String> playlistItemIds) {
    this.playlistItemIds = playlistItemIds;
    return this;
  }

  public PlaybackStartInfo addPlaylistItemIdsItem(String playlistItemIdsItem) {
    if (this.playlistItemIds == null) {
      this.playlistItemIds = new ArrayList<String>();
    }
    this.playlistItemIds.add(playlistItemIdsItem);
    return this;
  }

   /**
   * Get playlistItemIds
   * @return playlistItemIds
  **/
  @Schema(description = "")
  public List<String> getPlaylistItemIds() {
    return playlistItemIds;
  }

  public void setPlaylistItemIds(List<String> playlistItemIds) {
    this.playlistItemIds = playlistItemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackStartInfo playbackStartInfo = (PlaybackStartInfo) o;
    return Objects.equals(this.canSeek, playbackStartInfo.canSeek) &&
        Objects.equals(this.item, playbackStartInfo.item) &&
        Objects.equals(this.nowPlayingQueue, playbackStartInfo.nowPlayingQueue) &&
        Objects.equals(this.playlistItemId, playbackStartInfo.playlistItemId) &&
        Objects.equals(this.itemId, playbackStartInfo.itemId) &&
        Objects.equals(this.sessionId, playbackStartInfo.sessionId) &&
        Objects.equals(this.mediaSourceId, playbackStartInfo.mediaSourceId) &&
        Objects.equals(this.audioStreamIndex, playbackStartInfo.audioStreamIndex) &&
        Objects.equals(this.subtitleStreamIndex, playbackStartInfo.subtitleStreamIndex) &&
        Objects.equals(this.isPaused, playbackStartInfo.isPaused) &&
        Objects.equals(this.playlistIndex, playbackStartInfo.playlistIndex) &&
        Objects.equals(this.playlistLength, playbackStartInfo.playlistLength) &&
        Objects.equals(this.isMuted, playbackStartInfo.isMuted) &&
        Objects.equals(this.positionTicks, playbackStartInfo.positionTicks) &&
        Objects.equals(this.runTimeTicks, playbackStartInfo.runTimeTicks) &&
        Objects.equals(this.playbackStartTimeTicks, playbackStartInfo.playbackStartTimeTicks) &&
        Objects.equals(this.volumeLevel, playbackStartInfo.volumeLevel) &&
        Objects.equals(this.brightness, playbackStartInfo.brightness) &&
        Objects.equals(this.aspectRatio, playbackStartInfo.aspectRatio) &&
        Objects.equals(this.eventName, playbackStartInfo.eventName) &&
        Objects.equals(this.playMethod, playbackStartInfo.playMethod) &&
        Objects.equals(this.liveStreamId, playbackStartInfo.liveStreamId) &&
        Objects.equals(this.playSessionId, playbackStartInfo.playSessionId) &&
        Objects.equals(this.repeatMode, playbackStartInfo.repeatMode) &&
        Objects.equals(this.shuffle, playbackStartInfo.shuffle) &&
        Objects.equals(this.subtitleOffset, playbackStartInfo.subtitleOffset) &&
        Objects.equals(this.playbackRate, playbackStartInfo.playbackRate) &&
        Objects.equals(this.playlistItemIds, playbackStartInfo.playlistItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSeek, item, nowPlayingQueue, playlistItemId, itemId, sessionId, mediaSourceId, audioStreamIndex, subtitleStreamIndex, isPaused, playlistIndex, playlistLength, isMuted, positionTicks, runTimeTicks, playbackStartTimeTicks, volumeLevel, brightness, aspectRatio, eventName, playMethod, liveStreamId, playSessionId, repeatMode, shuffle, subtitleOffset, playbackRate, playlistItemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackStartInfo {\n");
    
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    nowPlayingQueue: ").append(toIndentedString(nowPlayingQueue)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    playlistIndex: ").append(toIndentedString(playlistIndex)).append("\n");
    sb.append("    playlistLength: ").append(toIndentedString(playlistLength)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    playbackStartTimeTicks: ").append(toIndentedString(playbackStartTimeTicks)).append("\n");
    sb.append("    volumeLevel: ").append(toIndentedString(volumeLevel)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    playMethod: ").append(toIndentedString(playMethod)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    shuffle: ").append(toIndentedString(shuffle)).append("\n");
    sb.append("    subtitleOffset: ").append(toIndentedString(subtitleOffset)).append("\n");
    sb.append("    playbackRate: ").append(toIndentedString(playbackRate)).append("\n");
    sb.append("    playlistItemIds: ").append(toIndentedString(playlistItemIds)).append("\n");
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
