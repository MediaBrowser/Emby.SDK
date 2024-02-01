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
import io.swagger.client.model.QueueItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class PlaybackStopInfo.  
 */
@Schema(description = "Class PlaybackStopInfo.  ")

public class PlaybackStopInfo {
  @SerializedName("NowPlayingQueue")
  private List<QueueItem> nowPlayingQueue = null;

  @SerializedName("PlaylistItemId")
  private String playlistItemId = null;

  @SerializedName("PlaylistIndex")
  private Integer playlistIndex = null;

  @SerializedName("PlaylistLength")
  private Integer playlistLength = null;

  @SerializedName("Item")
  private BaseItemDto item = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("SessionId")
  private String sessionId = null;

  @SerializedName("MediaSourceId")
  private String mediaSourceId = null;

  @SerializedName("PositionTicks")
  private Long positionTicks = null;

  @SerializedName("LiveStreamId")
  private String liveStreamId = null;

  @SerializedName("PlaySessionId")
  private String playSessionId = null;

  @SerializedName("Failed")
  private Boolean failed = null;

  @SerializedName("IsAutomated")
  private Boolean isAutomated = null;

  @SerializedName("NextMediaType")
  private String nextMediaType = null;

  public PlaybackStopInfo nowPlayingQueue(List<QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
    return this;
  }

  public PlaybackStopInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
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

  public PlaybackStopInfo playlistItemId(String playlistItemId) {
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

  public PlaybackStopInfo playlistIndex(Integer playlistIndex) {
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

  public PlaybackStopInfo playlistLength(Integer playlistLength) {
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

  public PlaybackStopInfo item(BaseItemDto item) {
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

  public PlaybackStopInfo itemId(String itemId) {
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

  public PlaybackStopInfo sessionId(String sessionId) {
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

  public PlaybackStopInfo mediaSourceId(String mediaSourceId) {
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

  public PlaybackStopInfo positionTicks(Long positionTicks) {
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

  public PlaybackStopInfo liveStreamId(String liveStreamId) {
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

  public PlaybackStopInfo playSessionId(String playSessionId) {
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

  public PlaybackStopInfo failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

   /**
   * A value indicating whether this &#x60;MediaBrowser.Model.Session.PlaybackStopInfo&#x60; is failed.
   * @return failed
  **/
  @Schema(description = "A value indicating whether this `MediaBrowser.Model.Session.PlaybackStopInfo` is failed.")
  public Boolean isFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public PlaybackStopInfo isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @Schema(description = "")
  public Boolean isIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public PlaybackStopInfo nextMediaType(String nextMediaType) {
    this.nextMediaType = nextMediaType;
    return this;
  }

   /**
   * Get nextMediaType
   * @return nextMediaType
  **/
  @Schema(description = "")
  public String getNextMediaType() {
    return nextMediaType;
  }

  public void setNextMediaType(String nextMediaType) {
    this.nextMediaType = nextMediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackStopInfo playbackStopInfo = (PlaybackStopInfo) o;
    return Objects.equals(this.nowPlayingQueue, playbackStopInfo.nowPlayingQueue) &&
        Objects.equals(this.playlistItemId, playbackStopInfo.playlistItemId) &&
        Objects.equals(this.playlistIndex, playbackStopInfo.playlistIndex) &&
        Objects.equals(this.playlistLength, playbackStopInfo.playlistLength) &&
        Objects.equals(this.item, playbackStopInfo.item) &&
        Objects.equals(this.itemId, playbackStopInfo.itemId) &&
        Objects.equals(this.sessionId, playbackStopInfo.sessionId) &&
        Objects.equals(this.mediaSourceId, playbackStopInfo.mediaSourceId) &&
        Objects.equals(this.positionTicks, playbackStopInfo.positionTicks) &&
        Objects.equals(this.liveStreamId, playbackStopInfo.liveStreamId) &&
        Objects.equals(this.playSessionId, playbackStopInfo.playSessionId) &&
        Objects.equals(this.failed, playbackStopInfo.failed) &&
        Objects.equals(this.isAutomated, playbackStopInfo.isAutomated) &&
        Objects.equals(this.nextMediaType, playbackStopInfo.nextMediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nowPlayingQueue, playlistItemId, playlistIndex, playlistLength, item, itemId, sessionId, mediaSourceId, positionTicks, liveStreamId, playSessionId, failed, isAutomated, nextMediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackStopInfo {\n");
    
    sb.append("    nowPlayingQueue: ").append(toIndentedString(nowPlayingQueue)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    playlistIndex: ").append(toIndentedString(playlistIndex)).append("\n");
    sb.append("    playlistLength: ").append(toIndentedString(playlistLength)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    nextMediaType: ").append(toIndentedString(nextMediaType)).append("\n");
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
