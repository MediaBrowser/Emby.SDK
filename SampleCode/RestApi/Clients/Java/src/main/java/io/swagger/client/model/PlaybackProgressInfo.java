/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * PlaybackProgressInfo
 */


public class PlaybackProgressInfo {
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

  @SerializedName("SubtitleOffset")
  private Integer subtitleOffset = null;

  @SerializedName("PlaybackRate")
  private Double playbackRate = null;

  @SerializedName("PlaylistItemIds")
  private List<String> playlistItemIds = null;

  public PlaybackProgressInfo canSeek(Boolean canSeek) {
    this.canSeek = canSeek;
    return this;
  }

   /**
   * Get canSeek
   * @return canSeek
  **/
  @Schema(description = "")
  public Boolean isCanSeek() {
    return canSeek;
  }

  public void setCanSeek(Boolean canSeek) {
    this.canSeek = canSeek;
  }

  public PlaybackProgressInfo item(BaseItemDto item) {
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

  public PlaybackProgressInfo nowPlayingQueue(List<QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
    return this;
  }

  public PlaybackProgressInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
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

  public PlaybackProgressInfo playlistItemId(String playlistItemId) {
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

  public PlaybackProgressInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public PlaybackProgressInfo sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @Schema(description = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public PlaybackProgressInfo mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
    return this;
  }

   /**
   * Get mediaSourceId
   * @return mediaSourceId
  **/
  @Schema(description = "")
  public String getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(String mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlaybackProgressInfo audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
    return this;
  }

   /**
   * Get audioStreamIndex
   * @return audioStreamIndex
  **/
  @Schema(description = "")
  public Integer getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlaybackProgressInfo subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
    return this;
  }

   /**
   * Get subtitleStreamIndex
   * @return subtitleStreamIndex
  **/
  @Schema(description = "")
  public Integer getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlaybackProgressInfo isPaused(Boolean isPaused) {
    this.isPaused = isPaused;
    return this;
  }

   /**
   * Get isPaused
   * @return isPaused
  **/
  @Schema(description = "")
  public Boolean isIsPaused() {
    return isPaused;
  }

  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }

  public PlaybackProgressInfo playlistIndex(Integer playlistIndex) {
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

  public PlaybackProgressInfo playlistLength(Integer playlistLength) {
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

  public PlaybackProgressInfo isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @Schema(description = "")
  public Boolean isIsMuted() {
    return isMuted;
  }

  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  public PlaybackProgressInfo positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

   /**
   * Get positionTicks
   * @return positionTicks
  **/
  @Schema(description = "")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public PlaybackProgressInfo runTimeTicks(Long runTimeTicks) {
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

  public PlaybackProgressInfo playbackStartTimeTicks(Long playbackStartTimeTicks) {
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

  public PlaybackProgressInfo volumeLevel(Integer volumeLevel) {
    this.volumeLevel = volumeLevel;
    return this;
  }

   /**
   * Get volumeLevel
   * @return volumeLevel
  **/
  @Schema(description = "")
  public Integer getVolumeLevel() {
    return volumeLevel;
  }

  public void setVolumeLevel(Integer volumeLevel) {
    this.volumeLevel = volumeLevel;
  }

  public PlaybackProgressInfo brightness(Integer brightness) {
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

  public PlaybackProgressInfo aspectRatio(String aspectRatio) {
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

  public PlaybackProgressInfo eventName(ProgressEvent eventName) {
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

  public PlaybackProgressInfo playMethod(PlayMethod playMethod) {
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

  public PlaybackProgressInfo liveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * Get liveStreamId
   * @return liveStreamId
  **/
  @Schema(description = "")
  public String getLiveStreamId() {
    return liveStreamId;
  }

  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }

  public PlaybackProgressInfo playSessionId(String playSessionId) {
    this.playSessionId = playSessionId;
    return this;
  }

   /**
   * Get playSessionId
   * @return playSessionId
  **/
  @Schema(description = "")
  public String getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(String playSessionId) {
    this.playSessionId = playSessionId;
  }

  public PlaybackProgressInfo repeatMode(RepeatMode repeatMode) {
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

  public PlaybackProgressInfo subtitleOffset(Integer subtitleOffset) {
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

  public PlaybackProgressInfo playbackRate(Double playbackRate) {
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

  public PlaybackProgressInfo playlistItemIds(List<String> playlistItemIds) {
    this.playlistItemIds = playlistItemIds;
    return this;
  }

  public PlaybackProgressInfo addPlaylistItemIdsItem(String playlistItemIdsItem) {
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
    PlaybackProgressInfo playbackProgressInfo = (PlaybackProgressInfo) o;
    return Objects.equals(this.canSeek, playbackProgressInfo.canSeek) &&
        Objects.equals(this.item, playbackProgressInfo.item) &&
        Objects.equals(this.nowPlayingQueue, playbackProgressInfo.nowPlayingQueue) &&
        Objects.equals(this.playlistItemId, playbackProgressInfo.playlistItemId) &&
        Objects.equals(this.itemId, playbackProgressInfo.itemId) &&
        Objects.equals(this.sessionId, playbackProgressInfo.sessionId) &&
        Objects.equals(this.mediaSourceId, playbackProgressInfo.mediaSourceId) &&
        Objects.equals(this.audioStreamIndex, playbackProgressInfo.audioStreamIndex) &&
        Objects.equals(this.subtitleStreamIndex, playbackProgressInfo.subtitleStreamIndex) &&
        Objects.equals(this.isPaused, playbackProgressInfo.isPaused) &&
        Objects.equals(this.playlistIndex, playbackProgressInfo.playlistIndex) &&
        Objects.equals(this.playlistLength, playbackProgressInfo.playlistLength) &&
        Objects.equals(this.isMuted, playbackProgressInfo.isMuted) &&
        Objects.equals(this.positionTicks, playbackProgressInfo.positionTicks) &&
        Objects.equals(this.runTimeTicks, playbackProgressInfo.runTimeTicks) &&
        Objects.equals(this.playbackStartTimeTicks, playbackProgressInfo.playbackStartTimeTicks) &&
        Objects.equals(this.volumeLevel, playbackProgressInfo.volumeLevel) &&
        Objects.equals(this.brightness, playbackProgressInfo.brightness) &&
        Objects.equals(this.aspectRatio, playbackProgressInfo.aspectRatio) &&
        Objects.equals(this.eventName, playbackProgressInfo.eventName) &&
        Objects.equals(this.playMethod, playbackProgressInfo.playMethod) &&
        Objects.equals(this.liveStreamId, playbackProgressInfo.liveStreamId) &&
        Objects.equals(this.playSessionId, playbackProgressInfo.playSessionId) &&
        Objects.equals(this.repeatMode, playbackProgressInfo.repeatMode) &&
        Objects.equals(this.subtitleOffset, playbackProgressInfo.subtitleOffset) &&
        Objects.equals(this.playbackRate, playbackProgressInfo.playbackRate) &&
        Objects.equals(this.playlistItemIds, playbackProgressInfo.playlistItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSeek, item, nowPlayingQueue, playlistItemId, itemId, sessionId, mediaSourceId, audioStreamIndex, subtitleStreamIndex, isPaused, playlistIndex, playlistLength, isMuted, positionTicks, runTimeTicks, playbackStartTimeTicks, volumeLevel, brightness, aspectRatio, eventName, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate, playlistItemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackProgressInfo {\n");
    
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
