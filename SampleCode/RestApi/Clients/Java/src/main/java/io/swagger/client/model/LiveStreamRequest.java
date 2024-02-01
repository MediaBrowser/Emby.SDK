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
import io.swagger.client.model.DeviceProfile;
import io.swagger.client.model.MediaProtocol;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LiveStreamRequest
 */


public class LiveStreamRequest {
  @SerializedName("OpenToken")
  private String openToken = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("PlaySessionId")
  private String playSessionId = null;

  @SerializedName("MaxStreamingBitrate")
  private Long maxStreamingBitrate = null;

  @SerializedName("StartTimeTicks")
  private Long startTimeTicks = null;

  @SerializedName("AudioStreamIndex")
  private Integer audioStreamIndex = null;

  @SerializedName("SubtitleStreamIndex")
  private Integer subtitleStreamIndex = null;

  @SerializedName("MaxAudioChannels")
  private Integer maxAudioChannels = null;

  @SerializedName("ItemId")
  private Long itemId = null;

  @SerializedName("DeviceProfile")
  private DeviceProfile deviceProfile = null;

  @SerializedName("EnableDirectPlay")
  private Boolean enableDirectPlay = null;

  @SerializedName("EnableDirectStream")
  private Boolean enableDirectStream = null;

  @SerializedName("EnableTranscoding")
  private Boolean enableTranscoding = null;

  @SerializedName("AllowVideoStreamCopy")
  private Boolean allowVideoStreamCopy = null;

  @SerializedName("AllowInterlacedVideoStreamCopy")
  private Boolean allowInterlacedVideoStreamCopy = null;

  @SerializedName("AllowAudioStreamCopy")
  private Boolean allowAudioStreamCopy = null;

  @SerializedName("DirectPlayProtocols")
  private List<MediaProtocol> directPlayProtocols = null;

  public LiveStreamRequest openToken(String openToken) {
    this.openToken = openToken;
    return this;
  }

   /**
   * Get openToken
   * @return openToken
  **/
  @Schema(description = "")
  public String getOpenToken() {
    return openToken;
  }

  public void setOpenToken(String openToken) {
    this.openToken = openToken;
  }

  public LiveStreamRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public LiveStreamRequest playSessionId(String playSessionId) {
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

  public LiveStreamRequest maxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
    return this;
  }

   /**
   * Get maxStreamingBitrate
   * @return maxStreamingBitrate
  **/
  @Schema(description = "")
  public Long getMaxStreamingBitrate() {
    return maxStreamingBitrate;
  }

  public void setMaxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
  }

  public LiveStreamRequest startTimeTicks(Long startTimeTicks) {
    this.startTimeTicks = startTimeTicks;
    return this;
  }

   /**
   * Get startTimeTicks
   * @return startTimeTicks
  **/
  @Schema(description = "")
  public Long getStartTimeTicks() {
    return startTimeTicks;
  }

  public void setStartTimeTicks(Long startTimeTicks) {
    this.startTimeTicks = startTimeTicks;
  }

  public LiveStreamRequest audioStreamIndex(Integer audioStreamIndex) {
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

  public LiveStreamRequest subtitleStreamIndex(Integer subtitleStreamIndex) {
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

  public LiveStreamRequest maxAudioChannels(Integer maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
    return this;
  }

   /**
   * Get maxAudioChannels
   * @return maxAudioChannels
  **/
  @Schema(description = "")
  public Integer getMaxAudioChannels() {
    return maxAudioChannels;
  }

  public void setMaxAudioChannels(Integer maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
  }

  public LiveStreamRequest itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @Schema(description = "")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public LiveStreamRequest deviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
    return this;
  }

   /**
   * Get deviceProfile
   * @return deviceProfile
  **/
  @Schema(description = "")
  public DeviceProfile getDeviceProfile() {
    return deviceProfile;
  }

  public void setDeviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
  }

  public LiveStreamRequest enableDirectPlay(Boolean enableDirectPlay) {
    this.enableDirectPlay = enableDirectPlay;
    return this;
  }

   /**
   * Get enableDirectPlay
   * @return enableDirectPlay
  **/
  @Schema(description = "")
  public Boolean isEnableDirectPlay() {
    return enableDirectPlay;
  }

  public void setEnableDirectPlay(Boolean enableDirectPlay) {
    this.enableDirectPlay = enableDirectPlay;
  }

  public LiveStreamRequest enableDirectStream(Boolean enableDirectStream) {
    this.enableDirectStream = enableDirectStream;
    return this;
  }

   /**
   * Get enableDirectStream
   * @return enableDirectStream
  **/
  @Schema(description = "")
  public Boolean isEnableDirectStream() {
    return enableDirectStream;
  }

  public void setEnableDirectStream(Boolean enableDirectStream) {
    this.enableDirectStream = enableDirectStream;
  }

  public LiveStreamRequest enableTranscoding(Boolean enableTranscoding) {
    this.enableTranscoding = enableTranscoding;
    return this;
  }

   /**
   * Get enableTranscoding
   * @return enableTranscoding
  **/
  @Schema(description = "")
  public Boolean isEnableTranscoding() {
    return enableTranscoding;
  }

  public void setEnableTranscoding(Boolean enableTranscoding) {
    this.enableTranscoding = enableTranscoding;
  }

  public LiveStreamRequest allowVideoStreamCopy(Boolean allowVideoStreamCopy) {
    this.allowVideoStreamCopy = allowVideoStreamCopy;
    return this;
  }

   /**
   * Get allowVideoStreamCopy
   * @return allowVideoStreamCopy
  **/
  @Schema(description = "")
  public Boolean isAllowVideoStreamCopy() {
    return allowVideoStreamCopy;
  }

  public void setAllowVideoStreamCopy(Boolean allowVideoStreamCopy) {
    this.allowVideoStreamCopy = allowVideoStreamCopy;
  }

  public LiveStreamRequest allowInterlacedVideoStreamCopy(Boolean allowInterlacedVideoStreamCopy) {
    this.allowInterlacedVideoStreamCopy = allowInterlacedVideoStreamCopy;
    return this;
  }

   /**
   * Get allowInterlacedVideoStreamCopy
   * @return allowInterlacedVideoStreamCopy
  **/
  @Schema(description = "")
  public Boolean isAllowInterlacedVideoStreamCopy() {
    return allowInterlacedVideoStreamCopy;
  }

  public void setAllowInterlacedVideoStreamCopy(Boolean allowInterlacedVideoStreamCopy) {
    this.allowInterlacedVideoStreamCopy = allowInterlacedVideoStreamCopy;
  }

  public LiveStreamRequest allowAudioStreamCopy(Boolean allowAudioStreamCopy) {
    this.allowAudioStreamCopy = allowAudioStreamCopy;
    return this;
  }

   /**
   * Get allowAudioStreamCopy
   * @return allowAudioStreamCopy
  **/
  @Schema(description = "")
  public Boolean isAllowAudioStreamCopy() {
    return allowAudioStreamCopy;
  }

  public void setAllowAudioStreamCopy(Boolean allowAudioStreamCopy) {
    this.allowAudioStreamCopy = allowAudioStreamCopy;
  }

  public LiveStreamRequest directPlayProtocols(List<MediaProtocol> directPlayProtocols) {
    this.directPlayProtocols = directPlayProtocols;
    return this;
  }

  public LiveStreamRequest addDirectPlayProtocolsItem(MediaProtocol directPlayProtocolsItem) {
    if (this.directPlayProtocols == null) {
      this.directPlayProtocols = new ArrayList<MediaProtocol>();
    }
    this.directPlayProtocols.add(directPlayProtocolsItem);
    return this;
  }

   /**
   * Get directPlayProtocols
   * @return directPlayProtocols
  **/
  @Schema(description = "")
  public List<MediaProtocol> getDirectPlayProtocols() {
    return directPlayProtocols;
  }

  public void setDirectPlayProtocols(List<MediaProtocol> directPlayProtocols) {
    this.directPlayProtocols = directPlayProtocols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamRequest liveStreamRequest = (LiveStreamRequest) o;
    return Objects.equals(this.openToken, liveStreamRequest.openToken) &&
        Objects.equals(this.userId, liveStreamRequest.userId) &&
        Objects.equals(this.playSessionId, liveStreamRequest.playSessionId) &&
        Objects.equals(this.maxStreamingBitrate, liveStreamRequest.maxStreamingBitrate) &&
        Objects.equals(this.startTimeTicks, liveStreamRequest.startTimeTicks) &&
        Objects.equals(this.audioStreamIndex, liveStreamRequest.audioStreamIndex) &&
        Objects.equals(this.subtitleStreamIndex, liveStreamRequest.subtitleStreamIndex) &&
        Objects.equals(this.maxAudioChannels, liveStreamRequest.maxAudioChannels) &&
        Objects.equals(this.itemId, liveStreamRequest.itemId) &&
        Objects.equals(this.deviceProfile, liveStreamRequest.deviceProfile) &&
        Objects.equals(this.enableDirectPlay, liveStreamRequest.enableDirectPlay) &&
        Objects.equals(this.enableDirectStream, liveStreamRequest.enableDirectStream) &&
        Objects.equals(this.enableTranscoding, liveStreamRequest.enableTranscoding) &&
        Objects.equals(this.allowVideoStreamCopy, liveStreamRequest.allowVideoStreamCopy) &&
        Objects.equals(this.allowInterlacedVideoStreamCopy, liveStreamRequest.allowInterlacedVideoStreamCopy) &&
        Objects.equals(this.allowAudioStreamCopy, liveStreamRequest.allowAudioStreamCopy) &&
        Objects.equals(this.directPlayProtocols, liveStreamRequest.directPlayProtocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openToken, userId, playSessionId, maxStreamingBitrate, startTimeTicks, audioStreamIndex, subtitleStreamIndex, maxAudioChannels, itemId, deviceProfile, enableDirectPlay, enableDirectStream, enableTranscoding, allowVideoStreamCopy, allowInterlacedVideoStreamCopy, allowAudioStreamCopy, directPlayProtocols);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamRequest {\n");
    
    sb.append("    openToken: ").append(toIndentedString(openToken)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    startTimeTicks: ").append(toIndentedString(startTimeTicks)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
    sb.append("    maxAudioChannels: ").append(toIndentedString(maxAudioChannels)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    deviceProfile: ").append(toIndentedString(deviceProfile)).append("\n");
    sb.append("    enableDirectPlay: ").append(toIndentedString(enableDirectPlay)).append("\n");
    sb.append("    enableDirectStream: ").append(toIndentedString(enableDirectStream)).append("\n");
    sb.append("    enableTranscoding: ").append(toIndentedString(enableTranscoding)).append("\n");
    sb.append("    allowVideoStreamCopy: ").append(toIndentedString(allowVideoStreamCopy)).append("\n");
    sb.append("    allowInterlacedVideoStreamCopy: ").append(toIndentedString(allowInterlacedVideoStreamCopy)).append("\n");
    sb.append("    allowAudioStreamCopy: ").append(toIndentedString(allowAudioStreamCopy)).append("\n");
    sb.append("    directPlayProtocols: ").append(toIndentedString(directPlayProtocols)).append("\n");
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
