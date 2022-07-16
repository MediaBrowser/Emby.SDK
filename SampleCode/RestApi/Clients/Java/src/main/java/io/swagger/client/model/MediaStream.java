/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DlnaSubtitleDeliveryMethod;
import io.swagger.client.model.MediaInfoMediaProtocol;
import io.swagger.client.model.MediaStreamType;
import io.swagger.client.model.SubtitleLocationType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaStream
 */


public class MediaStream {
  @SerializedName("Codec")
  private String codec = null;

  @SerializedName("CodecTag")
  private String codecTag = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("ColorTransfer")
  private String colorTransfer = null;

  @SerializedName("ColorPrimaries")
  private String colorPrimaries = null;

  @SerializedName("ColorSpace")
  private String colorSpace = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("StreamStartTimeTicks")
  private Long streamStartTimeTicks = null;

  @SerializedName("TimeBase")
  private String timeBase = null;

  @SerializedName("CodecTimeBase")
  private String codecTimeBase = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Extradata")
  private String extradata = null;

  @SerializedName("VideoRange")
  private String videoRange = null;

  @SerializedName("DisplayTitle")
  private String displayTitle = null;

  @SerializedName("DisplayLanguage")
  private String displayLanguage = null;

  @SerializedName("NalLengthSize")
  private String nalLengthSize = null;

  @SerializedName("IsInterlaced")
  private Boolean isInterlaced = null;

  @SerializedName("IsAVC")
  private Boolean isAVC = null;

  @SerializedName("ChannelLayout")
  private String channelLayout = null;

  @SerializedName("BitRate")
  private Integer bitRate = null;

  @SerializedName("BitDepth")
  private Integer bitDepth = null;

  @SerializedName("RefFrames")
  private Integer refFrames = null;

  @SerializedName("Rotation")
  private Integer rotation = null;

  @SerializedName("Channels")
  private Integer channels = null;

  @SerializedName("SampleRate")
  private Integer sampleRate = null;

  @SerializedName("IsDefault")
  private Boolean isDefault = null;

  @SerializedName("IsForced")
  private Boolean isForced = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("AverageFrameRate")
  private Float averageFrameRate = null;

  @SerializedName("RealFrameRate")
  private Float realFrameRate = null;

  @SerializedName("Profile")
  private String profile = null;

  @SerializedName("Type")
  private MediaStreamType type = null;

  @SerializedName("AspectRatio")
  private String aspectRatio = null;

  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("IsExternal")
  private Boolean isExternal = null;

  @SerializedName("DeliveryMethod")
  private DlnaSubtitleDeliveryMethod deliveryMethod = null;

  @SerializedName("DeliveryUrl")
  private String deliveryUrl = null;

  @SerializedName("IsExternalUrl")
  private Boolean isExternalUrl = null;

  @SerializedName("IsTextSubtitleStream")
  private Boolean isTextSubtitleStream = null;

  @SerializedName("SupportsExternalStream")
  private Boolean supportsExternalStream = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Protocol")
  private MediaInfoMediaProtocol protocol = null;

  @SerializedName("PixelFormat")
  private String pixelFormat = null;

  @SerializedName("Level")
  private Double level = null;

  @SerializedName("IsAnamorphic")
  private Boolean isAnamorphic = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("AttachmentSize")
  private Integer attachmentSize = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("IsClosedCaptions")
  private Boolean isClosedCaptions = null;

  @SerializedName("SubtitleLocationType")
  private SubtitleLocationType subtitleLocationType = null;

  public MediaStream codec(String codec) {
    this.codec = codec;
    return this;
  }

   /**
   * Get codec
   * @return codec
  **/
  @Schema(description = "")
  public String getCodec() {
    return codec;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public MediaStream codecTag(String codecTag) {
    this.codecTag = codecTag;
    return this;
  }

   /**
   * Get codecTag
   * @return codecTag
  **/
  @Schema(description = "")
  public String getCodecTag() {
    return codecTag;
  }

  public void setCodecTag(String codecTag) {
    this.codecTag = codecTag;
  }

  public MediaStream language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public MediaStream colorTransfer(String colorTransfer) {
    this.colorTransfer = colorTransfer;
    return this;
  }

   /**
   * Get colorTransfer
   * @return colorTransfer
  **/
  @Schema(description = "")
  public String getColorTransfer() {
    return colorTransfer;
  }

  public void setColorTransfer(String colorTransfer) {
    this.colorTransfer = colorTransfer;
  }

  public MediaStream colorPrimaries(String colorPrimaries) {
    this.colorPrimaries = colorPrimaries;
    return this;
  }

   /**
   * Get colorPrimaries
   * @return colorPrimaries
  **/
  @Schema(description = "")
  public String getColorPrimaries() {
    return colorPrimaries;
  }

  public void setColorPrimaries(String colorPrimaries) {
    this.colorPrimaries = colorPrimaries;
  }

  public MediaStream colorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

   /**
   * Get colorSpace
   * @return colorSpace
  **/
  @Schema(description = "")
  public String getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }

  public MediaStream comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MediaStream streamStartTimeTicks(Long streamStartTimeTicks) {
    this.streamStartTimeTicks = streamStartTimeTicks;
    return this;
  }

   /**
   * Get streamStartTimeTicks
   * @return streamStartTimeTicks
  **/
  @Schema(description = "")
  public Long getStreamStartTimeTicks() {
    return streamStartTimeTicks;
  }

  public void setStreamStartTimeTicks(Long streamStartTimeTicks) {
    this.streamStartTimeTicks = streamStartTimeTicks;
  }

  public MediaStream timeBase(String timeBase) {
    this.timeBase = timeBase;
    return this;
  }

   /**
   * Get timeBase
   * @return timeBase
  **/
  @Schema(description = "")
  public String getTimeBase() {
    return timeBase;
  }

  public void setTimeBase(String timeBase) {
    this.timeBase = timeBase;
  }

  public MediaStream codecTimeBase(String codecTimeBase) {
    this.codecTimeBase = codecTimeBase;
    return this;
  }

   /**
   * Get codecTimeBase
   * @return codecTimeBase
  **/
  @Schema(description = "")
  public String getCodecTimeBase() {
    return codecTimeBase;
  }

  public void setCodecTimeBase(String codecTimeBase) {
    this.codecTimeBase = codecTimeBase;
  }

  public MediaStream title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MediaStream extradata(String extradata) {
    this.extradata = extradata;
    return this;
  }

   /**
   * Get extradata
   * @return extradata
  **/
  @Schema(description = "")
  public String getExtradata() {
    return extradata;
  }

  public void setExtradata(String extradata) {
    this.extradata = extradata;
  }

  public MediaStream videoRange(String videoRange) {
    this.videoRange = videoRange;
    return this;
  }

   /**
   * Get videoRange
   * @return videoRange
  **/
  @Schema(description = "")
  public String getVideoRange() {
    return videoRange;
  }

  public void setVideoRange(String videoRange) {
    this.videoRange = videoRange;
  }

  public MediaStream displayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
    return this;
  }

   /**
   * Get displayTitle
   * @return displayTitle
  **/
  @Schema(description = "")
  public String getDisplayTitle() {
    return displayTitle;
  }

  public void setDisplayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
  }

  public MediaStream displayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
    return this;
  }

   /**
   * Get displayLanguage
   * @return displayLanguage
  **/
  @Schema(description = "")
  public String getDisplayLanguage() {
    return displayLanguage;
  }

  public void setDisplayLanguage(String displayLanguage) {
    this.displayLanguage = displayLanguage;
  }

  public MediaStream nalLengthSize(String nalLengthSize) {
    this.nalLengthSize = nalLengthSize;
    return this;
  }

   /**
   * Get nalLengthSize
   * @return nalLengthSize
  **/
  @Schema(description = "")
  public String getNalLengthSize() {
    return nalLengthSize;
  }

  public void setNalLengthSize(String nalLengthSize) {
    this.nalLengthSize = nalLengthSize;
  }

  public MediaStream isInterlaced(Boolean isInterlaced) {
    this.isInterlaced = isInterlaced;
    return this;
  }

   /**
   * Get isInterlaced
   * @return isInterlaced
  **/
  @Schema(description = "")
  public Boolean isIsInterlaced() {
    return isInterlaced;
  }

  public void setIsInterlaced(Boolean isInterlaced) {
    this.isInterlaced = isInterlaced;
  }

  public MediaStream isAVC(Boolean isAVC) {
    this.isAVC = isAVC;
    return this;
  }

   /**
   * Get isAVC
   * @return isAVC
  **/
  @Schema(description = "")
  public Boolean isIsAVC() {
    return isAVC;
  }

  public void setIsAVC(Boolean isAVC) {
    this.isAVC = isAVC;
  }

  public MediaStream channelLayout(String channelLayout) {
    this.channelLayout = channelLayout;
    return this;
  }

   /**
   * Get channelLayout
   * @return channelLayout
  **/
  @Schema(description = "")
  public String getChannelLayout() {
    return channelLayout;
  }

  public void setChannelLayout(String channelLayout) {
    this.channelLayout = channelLayout;
  }

  public MediaStream bitRate(Integer bitRate) {
    this.bitRate = bitRate;
    return this;
  }

   /**
   * Get bitRate
   * @return bitRate
  **/
  @Schema(description = "")
  public Integer getBitRate() {
    return bitRate;
  }

  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }

  public MediaStream bitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
    return this;
  }

   /**
   * Get bitDepth
   * @return bitDepth
  **/
  @Schema(description = "")
  public Integer getBitDepth() {
    return bitDepth;
  }

  public void setBitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
  }

  public MediaStream refFrames(Integer refFrames) {
    this.refFrames = refFrames;
    return this;
  }

   /**
   * Get refFrames
   * @return refFrames
  **/
  @Schema(description = "")
  public Integer getRefFrames() {
    return refFrames;
  }

  public void setRefFrames(Integer refFrames) {
    this.refFrames = refFrames;
  }

  public MediaStream rotation(Integer rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @Schema(description = "")
  public Integer getRotation() {
    return rotation;
  }

  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }

  public MediaStream channels(Integer channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @Schema(description = "")
  public Integer getChannels() {
    return channels;
  }

  public void setChannels(Integer channels) {
    this.channels = channels;
  }

  public MediaStream sampleRate(Integer sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

   /**
   * Get sampleRate
   * @return sampleRate
  **/
  @Schema(description = "")
  public Integer getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Integer sampleRate) {
    this.sampleRate = sampleRate;
  }

  public MediaStream isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @Schema(description = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public MediaStream isForced(Boolean isForced) {
    this.isForced = isForced;
    return this;
  }

   /**
   * Get isForced
   * @return isForced
  **/
  @Schema(description = "")
  public Boolean isIsForced() {
    return isForced;
  }

  public void setIsForced(Boolean isForced) {
    this.isForced = isForced;
  }

  public MediaStream height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public MediaStream width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public MediaStream averageFrameRate(Float averageFrameRate) {
    this.averageFrameRate = averageFrameRate;
    return this;
  }

   /**
   * Get averageFrameRate
   * @return averageFrameRate
  **/
  @Schema(description = "")
  public Float getAverageFrameRate() {
    return averageFrameRate;
  }

  public void setAverageFrameRate(Float averageFrameRate) {
    this.averageFrameRate = averageFrameRate;
  }

  public MediaStream realFrameRate(Float realFrameRate) {
    this.realFrameRate = realFrameRate;
    return this;
  }

   /**
   * Get realFrameRate
   * @return realFrameRate
  **/
  @Schema(description = "")
  public Float getRealFrameRate() {
    return realFrameRate;
  }

  public void setRealFrameRate(Float realFrameRate) {
    this.realFrameRate = realFrameRate;
  }

  public MediaStream profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public MediaStream type(MediaStreamType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public MediaStreamType getType() {
    return type;
  }

  public void setType(MediaStreamType type) {
    this.type = type;
  }

  public MediaStream aspectRatio(String aspectRatio) {
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

  public MediaStream index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MediaStream isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Get isExternal
   * @return isExternal
  **/
  @Schema(description = "")
  public Boolean isIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public MediaStream deliveryMethod(DlnaSubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @Schema(description = "")
  public DlnaSubtitleDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DlnaSubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public MediaStream deliveryUrl(String deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
    return this;
  }

   /**
   * Get deliveryUrl
   * @return deliveryUrl
  **/
  @Schema(description = "")
  public String getDeliveryUrl() {
    return deliveryUrl;
  }

  public void setDeliveryUrl(String deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
  }

  public MediaStream isExternalUrl(Boolean isExternalUrl) {
    this.isExternalUrl = isExternalUrl;
    return this;
  }

   /**
   * Get isExternalUrl
   * @return isExternalUrl
  **/
  @Schema(description = "")
  public Boolean isIsExternalUrl() {
    return isExternalUrl;
  }

  public void setIsExternalUrl(Boolean isExternalUrl) {
    this.isExternalUrl = isExternalUrl;
  }

  public MediaStream isTextSubtitleStream(Boolean isTextSubtitleStream) {
    this.isTextSubtitleStream = isTextSubtitleStream;
    return this;
  }

   /**
   * Get isTextSubtitleStream
   * @return isTextSubtitleStream
  **/
  @Schema(description = "")
  public Boolean isIsTextSubtitleStream() {
    return isTextSubtitleStream;
  }

  public void setIsTextSubtitleStream(Boolean isTextSubtitleStream) {
    this.isTextSubtitleStream = isTextSubtitleStream;
  }

  public MediaStream supportsExternalStream(Boolean supportsExternalStream) {
    this.supportsExternalStream = supportsExternalStream;
    return this;
  }

   /**
   * Get supportsExternalStream
   * @return supportsExternalStream
  **/
  @Schema(description = "")
  public Boolean isSupportsExternalStream() {
    return supportsExternalStream;
  }

  public void setSupportsExternalStream(Boolean supportsExternalStream) {
    this.supportsExternalStream = supportsExternalStream;
  }

  public MediaStream path(String path) {
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

  public MediaStream protocol(MediaInfoMediaProtocol protocol) {
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

  public MediaStream pixelFormat(String pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * Get pixelFormat
   * @return pixelFormat
  **/
  @Schema(description = "")
  public String getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(String pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public MediaStream level(Double level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public Double getLevel() {
    return level;
  }

  public void setLevel(Double level) {
    this.level = level;
  }

  public MediaStream isAnamorphic(Boolean isAnamorphic) {
    this.isAnamorphic = isAnamorphic;
    return this;
  }

   /**
   * Get isAnamorphic
   * @return isAnamorphic
  **/
  @Schema(description = "")
  public Boolean isIsAnamorphic() {
    return isAnamorphic;
  }

  public void setIsAnamorphic(Boolean isAnamorphic) {
    this.isAnamorphic = isAnamorphic;
  }

  public MediaStream itemId(String itemId) {
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

  public MediaStream serverId(String serverId) {
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

  public MediaStream attachmentSize(Integer attachmentSize) {
    this.attachmentSize = attachmentSize;
    return this;
  }

   /**
   * Get attachmentSize
   * @return attachmentSize
  **/
  @Schema(description = "")
  public Integer getAttachmentSize() {
    return attachmentSize;
  }

  public void setAttachmentSize(Integer attachmentSize) {
    this.attachmentSize = attachmentSize;
  }

  public MediaStream mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public MediaStream isClosedCaptions(Boolean isClosedCaptions) {
    this.isClosedCaptions = isClosedCaptions;
    return this;
  }

   /**
   * Get isClosedCaptions
   * @return isClosedCaptions
  **/
  @Schema(description = "")
  public Boolean isIsClosedCaptions() {
    return isClosedCaptions;
  }

  public void setIsClosedCaptions(Boolean isClosedCaptions) {
    this.isClosedCaptions = isClosedCaptions;
  }

  public MediaStream subtitleLocationType(SubtitleLocationType subtitleLocationType) {
    this.subtitleLocationType = subtitleLocationType;
    return this;
  }

   /**
   * Get subtitleLocationType
   * @return subtitleLocationType
  **/
  @Schema(description = "")
  public SubtitleLocationType getSubtitleLocationType() {
    return subtitleLocationType;
  }

  public void setSubtitleLocationType(SubtitleLocationType subtitleLocationType) {
    this.subtitleLocationType = subtitleLocationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStream mediaStream = (MediaStream) o;
    return Objects.equals(this.codec, mediaStream.codec) &&
        Objects.equals(this.codecTag, mediaStream.codecTag) &&
        Objects.equals(this.language, mediaStream.language) &&
        Objects.equals(this.colorTransfer, mediaStream.colorTransfer) &&
        Objects.equals(this.colorPrimaries, mediaStream.colorPrimaries) &&
        Objects.equals(this.colorSpace, mediaStream.colorSpace) &&
        Objects.equals(this.comment, mediaStream.comment) &&
        Objects.equals(this.streamStartTimeTicks, mediaStream.streamStartTimeTicks) &&
        Objects.equals(this.timeBase, mediaStream.timeBase) &&
        Objects.equals(this.codecTimeBase, mediaStream.codecTimeBase) &&
        Objects.equals(this.title, mediaStream.title) &&
        Objects.equals(this.extradata, mediaStream.extradata) &&
        Objects.equals(this.videoRange, mediaStream.videoRange) &&
        Objects.equals(this.displayTitle, mediaStream.displayTitle) &&
        Objects.equals(this.displayLanguage, mediaStream.displayLanguage) &&
        Objects.equals(this.nalLengthSize, mediaStream.nalLengthSize) &&
        Objects.equals(this.isInterlaced, mediaStream.isInterlaced) &&
        Objects.equals(this.isAVC, mediaStream.isAVC) &&
        Objects.equals(this.channelLayout, mediaStream.channelLayout) &&
        Objects.equals(this.bitRate, mediaStream.bitRate) &&
        Objects.equals(this.bitDepth, mediaStream.bitDepth) &&
        Objects.equals(this.refFrames, mediaStream.refFrames) &&
        Objects.equals(this.rotation, mediaStream.rotation) &&
        Objects.equals(this.channels, mediaStream.channels) &&
        Objects.equals(this.sampleRate, mediaStream.sampleRate) &&
        Objects.equals(this.isDefault, mediaStream.isDefault) &&
        Objects.equals(this.isForced, mediaStream.isForced) &&
        Objects.equals(this.height, mediaStream.height) &&
        Objects.equals(this.width, mediaStream.width) &&
        Objects.equals(this.averageFrameRate, mediaStream.averageFrameRate) &&
        Objects.equals(this.realFrameRate, mediaStream.realFrameRate) &&
        Objects.equals(this.profile, mediaStream.profile) &&
        Objects.equals(this.type, mediaStream.type) &&
        Objects.equals(this.aspectRatio, mediaStream.aspectRatio) &&
        Objects.equals(this.index, mediaStream.index) &&
        Objects.equals(this.isExternal, mediaStream.isExternal) &&
        Objects.equals(this.deliveryMethod, mediaStream.deliveryMethod) &&
        Objects.equals(this.deliveryUrl, mediaStream.deliveryUrl) &&
        Objects.equals(this.isExternalUrl, mediaStream.isExternalUrl) &&
        Objects.equals(this.isTextSubtitleStream, mediaStream.isTextSubtitleStream) &&
        Objects.equals(this.supportsExternalStream, mediaStream.supportsExternalStream) &&
        Objects.equals(this.path, mediaStream.path) &&
        Objects.equals(this.protocol, mediaStream.protocol) &&
        Objects.equals(this.pixelFormat, mediaStream.pixelFormat) &&
        Objects.equals(this.level, mediaStream.level) &&
        Objects.equals(this.isAnamorphic, mediaStream.isAnamorphic) &&
        Objects.equals(this.itemId, mediaStream.itemId) &&
        Objects.equals(this.serverId, mediaStream.serverId) &&
        Objects.equals(this.attachmentSize, mediaStream.attachmentSize) &&
        Objects.equals(this.mimeType, mediaStream.mimeType) &&
        Objects.equals(this.isClosedCaptions, mediaStream.isClosedCaptions) &&
        Objects.equals(this.subtitleLocationType, mediaStream.subtitleLocationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, codecTag, language, colorTransfer, colorPrimaries, colorSpace, comment, streamStartTimeTicks, timeBase, codecTimeBase, title, extradata, videoRange, displayTitle, displayLanguage, nalLengthSize, isInterlaced, isAVC, channelLayout, bitRate, bitDepth, refFrames, rotation, channels, sampleRate, isDefault, isForced, height, width, averageFrameRate, realFrameRate, profile, type, aspectRatio, index, isExternal, deliveryMethod, deliveryUrl, isExternalUrl, isTextSubtitleStream, supportsExternalStream, path, protocol, pixelFormat, level, isAnamorphic, itemId, serverId, attachmentSize, mimeType, isClosedCaptions, subtitleLocationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStream {\n");
    
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecTag: ").append(toIndentedString(codecTag)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    colorTransfer: ").append(toIndentedString(colorTransfer)).append("\n");
    sb.append("    colorPrimaries: ").append(toIndentedString(colorPrimaries)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    streamStartTimeTicks: ").append(toIndentedString(streamStartTimeTicks)).append("\n");
    sb.append("    timeBase: ").append(toIndentedString(timeBase)).append("\n");
    sb.append("    codecTimeBase: ").append(toIndentedString(codecTimeBase)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    extradata: ").append(toIndentedString(extradata)).append("\n");
    sb.append("    videoRange: ").append(toIndentedString(videoRange)).append("\n");
    sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
    sb.append("    displayLanguage: ").append(toIndentedString(displayLanguage)).append("\n");
    sb.append("    nalLengthSize: ").append(toIndentedString(nalLengthSize)).append("\n");
    sb.append("    isInterlaced: ").append(toIndentedString(isInterlaced)).append("\n");
    sb.append("    isAVC: ").append(toIndentedString(isAVC)).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
    sb.append("    refFrames: ").append(toIndentedString(refFrames)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isForced: ").append(toIndentedString(isForced)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    averageFrameRate: ").append(toIndentedString(averageFrameRate)).append("\n");
    sb.append("    realFrameRate: ").append(toIndentedString(realFrameRate)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryUrl: ").append(toIndentedString(deliveryUrl)).append("\n");
    sb.append("    isExternalUrl: ").append(toIndentedString(isExternalUrl)).append("\n");
    sb.append("    isTextSubtitleStream: ").append(toIndentedString(isTextSubtitleStream)).append("\n");
    sb.append("    supportsExternalStream: ").append(toIndentedString(supportsExternalStream)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    isAnamorphic: ").append(toIndentedString(isAnamorphic)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    attachmentSize: ").append(toIndentedString(attachmentSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    isClosedCaptions: ").append(toIndentedString(isClosedCaptions)).append("\n");
    sb.append("    subtitleLocationType: ").append(toIndentedString(subtitleLocationType)).append("\n");
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
