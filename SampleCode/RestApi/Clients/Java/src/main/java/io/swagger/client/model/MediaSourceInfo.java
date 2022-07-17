/*
 * Emby Server REST API (BETA)
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
import io.swagger.client.model.MediaInfoMediaProtocol;
import io.swagger.client.model.MediaInfoTransportStreamTimestamp;
import io.swagger.client.model.MediaSourceType;
import io.swagger.client.model.MediaStream;
import io.swagger.client.model.Video3DFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * MediaSourceInfo
 */


public class MediaSourceInfo {
  @SerializedName("Protocol")
  private MediaInfoMediaProtocol protocol = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("EncoderPath")
  private String encoderPath = null;

  @SerializedName("EncoderProtocol")
  private MediaInfoMediaProtocol encoderProtocol = null;

  @SerializedName("Type")
  private MediaSourceType type = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SortName")
  private String sortName = null;

  @SerializedName("IsRemote")
  private Boolean isRemote = null;

  @SerializedName("RunTimeTicks")
  private Long runTimeTicks = null;

  @SerializedName("ContainerStartTimeTicks")
  private Long containerStartTimeTicks = null;

  @SerializedName("SupportsTranscoding")
  private Boolean supportsTranscoding = null;

  @SerializedName("SupportsDirectStream")
  private Boolean supportsDirectStream = null;

  @SerializedName("SupportsDirectPlay")
  private Boolean supportsDirectPlay = null;

  @SerializedName("IsInfiniteStream")
  private Boolean isInfiniteStream = null;

  @SerializedName("RequiresOpening")
  private Boolean requiresOpening = null;

  @SerializedName("OpenToken")
  private String openToken = null;

  @SerializedName("RequiresClosing")
  private Boolean requiresClosing = null;

  @SerializedName("LiveStreamId")
  private String liveStreamId = null;

  @SerializedName("BufferMs")
  private Integer bufferMs = null;

  @SerializedName("RequiresLooping")
  private Boolean requiresLooping = null;

  @SerializedName("SupportsProbing")
  private Boolean supportsProbing = null;

  @SerializedName("Video3DFormat")
  private Video3DFormat video3DFormat = null;

  @SerializedName("MediaStreams")
  private List<MediaStream> mediaStreams = null;

  @SerializedName("Formats")
  private List<String> formats = null;

  @SerializedName("Bitrate")
  private Integer bitrate = null;

  @SerializedName("Timestamp")
  private MediaInfoTransportStreamTimestamp timestamp = null;

  @SerializedName("RequiredHttpHeaders")
  private Map<String, String> requiredHttpHeaders = null;

  @SerializedName("DirectStreamUrl")
  private String directStreamUrl = null;

  @SerializedName("TranscodingUrl")
  private String transcodingUrl = null;

  @SerializedName("TranscodingSubProtocol")
  private String transcodingSubProtocol = null;

  @SerializedName("TranscodingContainer")
  private String transcodingContainer = null;

  @SerializedName("AnalyzeDurationMs")
  private Integer analyzeDurationMs = null;

  @SerializedName("ReadAtNativeFramerate")
  private Boolean readAtNativeFramerate = null;

  @SerializedName("DefaultAudioStreamIndex")
  private Integer defaultAudioStreamIndex = null;

  @SerializedName("DefaultSubtitleStreamIndex")
  private Integer defaultSubtitleStreamIndex = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("ServerId")
  private String serverId = null;

  public MediaSourceInfo protocol(MediaInfoMediaProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public MediaInfoMediaProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(MediaInfoMediaProtocol protocol) {
    this.protocol = protocol;
  }

  public MediaSourceInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediaSourceInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MediaSourceInfo encoderPath(String encoderPath) {
    this.encoderPath = encoderPath;
    return this;
  }

   /**
   * Get encoderPath
   * @return encoderPath
  **/
  @Schema(description = "")
  public String getEncoderPath() {
    return encoderPath;
  }

  public void setEncoderPath(String encoderPath) {
    this.encoderPath = encoderPath;
  }

  public MediaSourceInfo encoderProtocol(MediaInfoMediaProtocol encoderProtocol) {
    this.encoderProtocol = encoderProtocol;
    return this;
  }

   /**
   * Get encoderProtocol
   * @return encoderProtocol
  **/
  @Schema(description = "")
  public MediaInfoMediaProtocol getEncoderProtocol() {
    return encoderProtocol;
  }

  public void setEncoderProtocol(MediaInfoMediaProtocol encoderProtocol) {
    this.encoderProtocol = encoderProtocol;
  }

  public MediaSourceInfo type(MediaSourceType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public MediaSourceType getType() {
    return type;
  }

  public void setType(MediaSourceType type) {
    this.type = type;
  }

  public MediaSourceInfo container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public MediaSourceInfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public MediaSourceInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediaSourceInfo sortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

   /**
   * Get sortName
   * @return sortName
  **/
  @Schema(description = "")
  public String getSortName() {
    return sortName;
  }

  public void setSortName(String sortName) {
    this.sortName = sortName;
  }

  public MediaSourceInfo isRemote(Boolean isRemote) {
    this.isRemote = isRemote;
    return this;
  }

   /**
   * Get isRemote
   * @return isRemote
  **/
  @Schema(description = "")
  public Boolean isIsRemote() {
    return isRemote;
  }

  public void setIsRemote(Boolean isRemote) {
    this.isRemote = isRemote;
  }

  public MediaSourceInfo runTimeTicks(Long runTimeTicks) {
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

  public MediaSourceInfo containerStartTimeTicks(Long containerStartTimeTicks) {
    this.containerStartTimeTicks = containerStartTimeTicks;
    return this;
  }

   /**
   * Get containerStartTimeTicks
   * @return containerStartTimeTicks
  **/
  @Schema(description = "")
  public Long getContainerStartTimeTicks() {
    return containerStartTimeTicks;
  }

  public void setContainerStartTimeTicks(Long containerStartTimeTicks) {
    this.containerStartTimeTicks = containerStartTimeTicks;
  }

  public MediaSourceInfo supportsTranscoding(Boolean supportsTranscoding) {
    this.supportsTranscoding = supportsTranscoding;
    return this;
  }

   /**
   * Get supportsTranscoding
   * @return supportsTranscoding
  **/
  @Schema(description = "")
  public Boolean isSupportsTranscoding() {
    return supportsTranscoding;
  }

  public void setSupportsTranscoding(Boolean supportsTranscoding) {
    this.supportsTranscoding = supportsTranscoding;
  }

  public MediaSourceInfo supportsDirectStream(Boolean supportsDirectStream) {
    this.supportsDirectStream = supportsDirectStream;
    return this;
  }

   /**
   * Get supportsDirectStream
   * @return supportsDirectStream
  **/
  @Schema(description = "")
  public Boolean isSupportsDirectStream() {
    return supportsDirectStream;
  }

  public void setSupportsDirectStream(Boolean supportsDirectStream) {
    this.supportsDirectStream = supportsDirectStream;
  }

  public MediaSourceInfo supportsDirectPlay(Boolean supportsDirectPlay) {
    this.supportsDirectPlay = supportsDirectPlay;
    return this;
  }

   /**
   * Get supportsDirectPlay
   * @return supportsDirectPlay
  **/
  @Schema(description = "")
  public Boolean isSupportsDirectPlay() {
    return supportsDirectPlay;
  }

  public void setSupportsDirectPlay(Boolean supportsDirectPlay) {
    this.supportsDirectPlay = supportsDirectPlay;
  }

  public MediaSourceInfo isInfiniteStream(Boolean isInfiniteStream) {
    this.isInfiniteStream = isInfiniteStream;
    return this;
  }

   /**
   * Get isInfiniteStream
   * @return isInfiniteStream
  **/
  @Schema(description = "")
  public Boolean isIsInfiniteStream() {
    return isInfiniteStream;
  }

  public void setIsInfiniteStream(Boolean isInfiniteStream) {
    this.isInfiniteStream = isInfiniteStream;
  }

  public MediaSourceInfo requiresOpening(Boolean requiresOpening) {
    this.requiresOpening = requiresOpening;
    return this;
  }

   /**
   * Get requiresOpening
   * @return requiresOpening
  **/
  @Schema(description = "")
  public Boolean isRequiresOpening() {
    return requiresOpening;
  }

  public void setRequiresOpening(Boolean requiresOpening) {
    this.requiresOpening = requiresOpening;
  }

  public MediaSourceInfo openToken(String openToken) {
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

  public MediaSourceInfo requiresClosing(Boolean requiresClosing) {
    this.requiresClosing = requiresClosing;
    return this;
  }

   /**
   * Get requiresClosing
   * @return requiresClosing
  **/
  @Schema(description = "")
  public Boolean isRequiresClosing() {
    return requiresClosing;
  }

  public void setRequiresClosing(Boolean requiresClosing) {
    this.requiresClosing = requiresClosing;
  }

  public MediaSourceInfo liveStreamId(String liveStreamId) {
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

  public MediaSourceInfo bufferMs(Integer bufferMs) {
    this.bufferMs = bufferMs;
    return this;
  }

   /**
   * Get bufferMs
   * @return bufferMs
  **/
  @Schema(description = "")
  public Integer getBufferMs() {
    return bufferMs;
  }

  public void setBufferMs(Integer bufferMs) {
    this.bufferMs = bufferMs;
  }

  public MediaSourceInfo requiresLooping(Boolean requiresLooping) {
    this.requiresLooping = requiresLooping;
    return this;
  }

   /**
   * Get requiresLooping
   * @return requiresLooping
  **/
  @Schema(description = "")
  public Boolean isRequiresLooping() {
    return requiresLooping;
  }

  public void setRequiresLooping(Boolean requiresLooping) {
    this.requiresLooping = requiresLooping;
  }

  public MediaSourceInfo supportsProbing(Boolean supportsProbing) {
    this.supportsProbing = supportsProbing;
    return this;
  }

   /**
   * Get supportsProbing
   * @return supportsProbing
  **/
  @Schema(description = "")
  public Boolean isSupportsProbing() {
    return supportsProbing;
  }

  public void setSupportsProbing(Boolean supportsProbing) {
    this.supportsProbing = supportsProbing;
  }

  public MediaSourceInfo video3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
    return this;
  }

   /**
   * Get video3DFormat
   * @return video3DFormat
  **/
  @Schema(description = "")
  public Video3DFormat getVideo3DFormat() {
    return video3DFormat;
  }

  public void setVideo3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
  }

  public MediaSourceInfo mediaStreams(List<MediaStream> mediaStreams) {
    this.mediaStreams = mediaStreams;
    return this;
  }

  public MediaSourceInfo addMediaStreamsItem(MediaStream mediaStreamsItem) {
    if (this.mediaStreams == null) {
      this.mediaStreams = new ArrayList<MediaStream>();
    }
    this.mediaStreams.add(mediaStreamsItem);
    return this;
  }

   /**
   * Get mediaStreams
   * @return mediaStreams
  **/
  @Schema(description = "")
  public List<MediaStream> getMediaStreams() {
    return mediaStreams;
  }

  public void setMediaStreams(List<MediaStream> mediaStreams) {
    this.mediaStreams = mediaStreams;
  }

  public MediaSourceInfo formats(List<String> formats) {
    this.formats = formats;
    return this;
  }

  public MediaSourceInfo addFormatsItem(String formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<String>();
    }
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * Get formats
   * @return formats
  **/
  @Schema(description = "")
  public List<String> getFormats() {
    return formats;
  }

  public void setFormats(List<String> formats) {
    this.formats = formats;
  }

  public MediaSourceInfo bitrate(Integer bitrate) {
    this.bitrate = bitrate;
    return this;
  }

   /**
   * Get bitrate
   * @return bitrate
  **/
  @Schema(description = "")
  public Integer getBitrate() {
    return bitrate;
  }

  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }

  public MediaSourceInfo timestamp(MediaInfoTransportStreamTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public MediaInfoTransportStreamTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(MediaInfoTransportStreamTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public MediaSourceInfo requiredHttpHeaders(Map<String, String> requiredHttpHeaders) {
    this.requiredHttpHeaders = requiredHttpHeaders;
    return this;
  }

  public MediaSourceInfo putRequiredHttpHeadersItem(String key, String requiredHttpHeadersItem) {
    if (this.requiredHttpHeaders == null) {
      this.requiredHttpHeaders = new HashMap<String, String>();
    }
    this.requiredHttpHeaders.put(key, requiredHttpHeadersItem);
    return this;
  }

   /**
   * Get requiredHttpHeaders
   * @return requiredHttpHeaders
  **/
  @Schema(description = "")
  public Map<String, String> getRequiredHttpHeaders() {
    return requiredHttpHeaders;
  }

  public void setRequiredHttpHeaders(Map<String, String> requiredHttpHeaders) {
    this.requiredHttpHeaders = requiredHttpHeaders;
  }

  public MediaSourceInfo directStreamUrl(String directStreamUrl) {
    this.directStreamUrl = directStreamUrl;
    return this;
  }

   /**
   * Get directStreamUrl
   * @return directStreamUrl
  **/
  @Schema(description = "")
  public String getDirectStreamUrl() {
    return directStreamUrl;
  }

  public void setDirectStreamUrl(String directStreamUrl) {
    this.directStreamUrl = directStreamUrl;
  }

  public MediaSourceInfo transcodingUrl(String transcodingUrl) {
    this.transcodingUrl = transcodingUrl;
    return this;
  }

   /**
   * Get transcodingUrl
   * @return transcodingUrl
  **/
  @Schema(description = "")
  public String getTranscodingUrl() {
    return transcodingUrl;
  }

  public void setTranscodingUrl(String transcodingUrl) {
    this.transcodingUrl = transcodingUrl;
  }

  public MediaSourceInfo transcodingSubProtocol(String transcodingSubProtocol) {
    this.transcodingSubProtocol = transcodingSubProtocol;
    return this;
  }

   /**
   * Get transcodingSubProtocol
   * @return transcodingSubProtocol
  **/
  @Schema(description = "")
  public String getTranscodingSubProtocol() {
    return transcodingSubProtocol;
  }

  public void setTranscodingSubProtocol(String transcodingSubProtocol) {
    this.transcodingSubProtocol = transcodingSubProtocol;
  }

  public MediaSourceInfo transcodingContainer(String transcodingContainer) {
    this.transcodingContainer = transcodingContainer;
    return this;
  }

   /**
   * Get transcodingContainer
   * @return transcodingContainer
  **/
  @Schema(description = "")
  public String getTranscodingContainer() {
    return transcodingContainer;
  }

  public void setTranscodingContainer(String transcodingContainer) {
    this.transcodingContainer = transcodingContainer;
  }

  public MediaSourceInfo analyzeDurationMs(Integer analyzeDurationMs) {
    this.analyzeDurationMs = analyzeDurationMs;
    return this;
  }

   /**
   * Get analyzeDurationMs
   * @return analyzeDurationMs
  **/
  @Schema(description = "")
  public Integer getAnalyzeDurationMs() {
    return analyzeDurationMs;
  }

  public void setAnalyzeDurationMs(Integer analyzeDurationMs) {
    this.analyzeDurationMs = analyzeDurationMs;
  }

  public MediaSourceInfo readAtNativeFramerate(Boolean readAtNativeFramerate) {
    this.readAtNativeFramerate = readAtNativeFramerate;
    return this;
  }

   /**
   * Get readAtNativeFramerate
   * @return readAtNativeFramerate
  **/
  @Schema(description = "")
  public Boolean isReadAtNativeFramerate() {
    return readAtNativeFramerate;
  }

  public void setReadAtNativeFramerate(Boolean readAtNativeFramerate) {
    this.readAtNativeFramerate = readAtNativeFramerate;
  }

  public MediaSourceInfo defaultAudioStreamIndex(Integer defaultAudioStreamIndex) {
    this.defaultAudioStreamIndex = defaultAudioStreamIndex;
    return this;
  }

   /**
   * Get defaultAudioStreamIndex
   * @return defaultAudioStreamIndex
  **/
  @Schema(description = "")
  public Integer getDefaultAudioStreamIndex() {
    return defaultAudioStreamIndex;
  }

  public void setDefaultAudioStreamIndex(Integer defaultAudioStreamIndex) {
    this.defaultAudioStreamIndex = defaultAudioStreamIndex;
  }

  public MediaSourceInfo defaultSubtitleStreamIndex(Integer defaultSubtitleStreamIndex) {
    this.defaultSubtitleStreamIndex = defaultSubtitleStreamIndex;
    return this;
  }

   /**
   * Get defaultSubtitleStreamIndex
   * @return defaultSubtitleStreamIndex
  **/
  @Schema(description = "")
  public Integer getDefaultSubtitleStreamIndex() {
    return defaultSubtitleStreamIndex;
  }

  public void setDefaultSubtitleStreamIndex(Integer defaultSubtitleStreamIndex) {
    this.defaultSubtitleStreamIndex = defaultSubtitleStreamIndex;
  }

  public MediaSourceInfo itemId(String itemId) {
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

  public MediaSourceInfo serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSourceInfo mediaSourceInfo = (MediaSourceInfo) o;
    return Objects.equals(this.protocol, mediaSourceInfo.protocol) &&
        Objects.equals(this.id, mediaSourceInfo.id) &&
        Objects.equals(this.path, mediaSourceInfo.path) &&
        Objects.equals(this.encoderPath, mediaSourceInfo.encoderPath) &&
        Objects.equals(this.encoderProtocol, mediaSourceInfo.encoderProtocol) &&
        Objects.equals(this.type, mediaSourceInfo.type) &&
        Objects.equals(this.container, mediaSourceInfo.container) &&
        Objects.equals(this.size, mediaSourceInfo.size) &&
        Objects.equals(this.name, mediaSourceInfo.name) &&
        Objects.equals(this.sortName, mediaSourceInfo.sortName) &&
        Objects.equals(this.isRemote, mediaSourceInfo.isRemote) &&
        Objects.equals(this.runTimeTicks, mediaSourceInfo.runTimeTicks) &&
        Objects.equals(this.containerStartTimeTicks, mediaSourceInfo.containerStartTimeTicks) &&
        Objects.equals(this.supportsTranscoding, mediaSourceInfo.supportsTranscoding) &&
        Objects.equals(this.supportsDirectStream, mediaSourceInfo.supportsDirectStream) &&
        Objects.equals(this.supportsDirectPlay, mediaSourceInfo.supportsDirectPlay) &&
        Objects.equals(this.isInfiniteStream, mediaSourceInfo.isInfiniteStream) &&
        Objects.equals(this.requiresOpening, mediaSourceInfo.requiresOpening) &&
        Objects.equals(this.openToken, mediaSourceInfo.openToken) &&
        Objects.equals(this.requiresClosing, mediaSourceInfo.requiresClosing) &&
        Objects.equals(this.liveStreamId, mediaSourceInfo.liveStreamId) &&
        Objects.equals(this.bufferMs, mediaSourceInfo.bufferMs) &&
        Objects.equals(this.requiresLooping, mediaSourceInfo.requiresLooping) &&
        Objects.equals(this.supportsProbing, mediaSourceInfo.supportsProbing) &&
        Objects.equals(this.video3DFormat, mediaSourceInfo.video3DFormat) &&
        Objects.equals(this.mediaStreams, mediaSourceInfo.mediaStreams) &&
        Objects.equals(this.formats, mediaSourceInfo.formats) &&
        Objects.equals(this.bitrate, mediaSourceInfo.bitrate) &&
        Objects.equals(this.timestamp, mediaSourceInfo.timestamp) &&
        Objects.equals(this.requiredHttpHeaders, mediaSourceInfo.requiredHttpHeaders) &&
        Objects.equals(this.directStreamUrl, mediaSourceInfo.directStreamUrl) &&
        Objects.equals(this.transcodingUrl, mediaSourceInfo.transcodingUrl) &&
        Objects.equals(this.transcodingSubProtocol, mediaSourceInfo.transcodingSubProtocol) &&
        Objects.equals(this.transcodingContainer, mediaSourceInfo.transcodingContainer) &&
        Objects.equals(this.analyzeDurationMs, mediaSourceInfo.analyzeDurationMs) &&
        Objects.equals(this.readAtNativeFramerate, mediaSourceInfo.readAtNativeFramerate) &&
        Objects.equals(this.defaultAudioStreamIndex, mediaSourceInfo.defaultAudioStreamIndex) &&
        Objects.equals(this.defaultSubtitleStreamIndex, mediaSourceInfo.defaultSubtitleStreamIndex) &&
        Objects.equals(this.itemId, mediaSourceInfo.itemId) &&
        Objects.equals(this.serverId, mediaSourceInfo.serverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, id, path, encoderPath, encoderProtocol, type, container, size, name, sortName, isRemote, runTimeTicks, containerStartTimeTicks, supportsTranscoding, supportsDirectStream, supportsDirectPlay, isInfiniteStream, requiresOpening, openToken, requiresClosing, liveStreamId, bufferMs, requiresLooping, supportsProbing, video3DFormat, mediaStreams, formats, bitrate, timestamp, requiredHttpHeaders, directStreamUrl, transcodingUrl, transcodingSubProtocol, transcodingContainer, analyzeDurationMs, readAtNativeFramerate, defaultAudioStreamIndex, defaultSubtitleStreamIndex, itemId, serverId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaSourceInfo {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    encoderPath: ").append(toIndentedString(encoderPath)).append("\n");
    sb.append("    encoderProtocol: ").append(toIndentedString(encoderProtocol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
    sb.append("    isRemote: ").append(toIndentedString(isRemote)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    containerStartTimeTicks: ").append(toIndentedString(containerStartTimeTicks)).append("\n");
    sb.append("    supportsTranscoding: ").append(toIndentedString(supportsTranscoding)).append("\n");
    sb.append("    supportsDirectStream: ").append(toIndentedString(supportsDirectStream)).append("\n");
    sb.append("    supportsDirectPlay: ").append(toIndentedString(supportsDirectPlay)).append("\n");
    sb.append("    isInfiniteStream: ").append(toIndentedString(isInfiniteStream)).append("\n");
    sb.append("    requiresOpening: ").append(toIndentedString(requiresOpening)).append("\n");
    sb.append("    openToken: ").append(toIndentedString(openToken)).append("\n");
    sb.append("    requiresClosing: ").append(toIndentedString(requiresClosing)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    bufferMs: ").append(toIndentedString(bufferMs)).append("\n");
    sb.append("    requiresLooping: ").append(toIndentedString(requiresLooping)).append("\n");
    sb.append("    supportsProbing: ").append(toIndentedString(supportsProbing)).append("\n");
    sb.append("    video3DFormat: ").append(toIndentedString(video3DFormat)).append("\n");
    sb.append("    mediaStreams: ").append(toIndentedString(mediaStreams)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    requiredHttpHeaders: ").append(toIndentedString(requiredHttpHeaders)).append("\n");
    sb.append("    directStreamUrl: ").append(toIndentedString(directStreamUrl)).append("\n");
    sb.append("    transcodingUrl: ").append(toIndentedString(transcodingUrl)).append("\n");
    sb.append("    transcodingSubProtocol: ").append(toIndentedString(transcodingSubProtocol)).append("\n");
    sb.append("    transcodingContainer: ").append(toIndentedString(transcodingContainer)).append("\n");
    sb.append("    analyzeDurationMs: ").append(toIndentedString(analyzeDurationMs)).append("\n");
    sb.append("    readAtNativeFramerate: ").append(toIndentedString(readAtNativeFramerate)).append("\n");
    sb.append("    defaultAudioStreamIndex: ").append(toIndentedString(defaultAudioStreamIndex)).append("\n");
    sb.append("    defaultSubtitleStreamIndex: ").append(toIndentedString(defaultSubtitleStreamIndex)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
