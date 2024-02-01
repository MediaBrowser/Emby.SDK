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
import io.swagger.client.model.ExtendedVideoSubTypes;
import io.swagger.client.model.ExtendedVideoTypes;
import io.swagger.client.model.MediaProtocol;
import io.swagger.client.model.MediaStreamType;
import io.swagger.client.model.SubtitleDeliveryMethod;
import io.swagger.client.model.SubtitleLocationType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MediaStream information.      MediaStream itens are typically included in a &#x60;MediaBrowser.Model.Dto.MediaSourceInfo&#x60; object.      &#x60;MediaBrowser.Model.Dto.MediaSourceInfo.MediaStreams&#x60;  
 */
@Schema(description = "MediaStream information.      MediaStream itens are typically included in a `MediaBrowser.Model.Dto.MediaSourceInfo` object.      `MediaBrowser.Model.Dto.MediaSourceInfo.MediaStreams`  ")

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

  @SerializedName("IsHearingImpaired")
  private Boolean isHearingImpaired = null;

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
  private SubtitleDeliveryMethod deliveryMethod = null;

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
  private MediaProtocol protocol = null;

  @SerializedName("PixelFormat")
  private String pixelFormat = null;

  @SerializedName("Level")
  private Double level = null;

  @SerializedName("IsAnamorphic")
  private Boolean isAnamorphic = null;

  @SerializedName("ExtendedVideoType")
  private ExtendedVideoTypes extendedVideoType = null;

  @SerializedName("ExtendedVideoSubType")
  private ExtendedVideoSubTypes extendedVideoSubType = null;

  @SerializedName("ExtendedVideoSubTypeDescription")
  private String extendedVideoSubTypeDescription = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("AttachmentSize")
  private Integer attachmentSize = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("SubtitleLocationType")
  private SubtitleLocationType subtitleLocationType = null;

  public MediaStream codec(String codec) {
    this.codec = codec;
    return this;
  }

   /**
   * The codec.    Probe Field: &#x60;codec_name&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;    Related Enums: &#x60;T:Emby.Media.Model.Enums.VideoMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.AudioMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes&#x60;.
   * @return codec
  **/
  @Schema(description = "The codec.    Probe Field: `codec_name`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`    Related Enums: `T:Emby.Media.Model.Enums.VideoMediaTypes`, `Emby.Media.Model.Enums.AudioMediaTypes`, `Emby.Media.Model.Enums.SubtitleMediaTypes`.")
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
   * The codec tag.    Probe Field: &#x60;codec_tag&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return codecTag
  **/
  @Schema(description = "The codec tag.    Probe Field: `codec_tag`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * The language.    Probe Field: &#x60;tags[\&quot;language\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return language
  **/
  @Schema(description = "The language.    Probe Field: `tags[\"language\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * The color transfer characteristics.    Probe Field: &#x60;color_transfer&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorTransfers&#x60;.
   * @return colorTransfer
  **/
  @Schema(description = "The color transfer characteristics.    Probe Field: `color_transfer`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorTransfers`.")
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
   * The chromaticity coordinates of the source primaries.    Probe Field: &#x60;color_primaries&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorPrimaries&#x60;.
   * @return colorPrimaries
  **/
  @Schema(description = "The chromaticity coordinates of the source primaries.    Probe Field: `color_primaries`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorPrimaries`.")
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
   * The YUV colorspace type.    Probe Field: &#x60;color_space&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorSpaces&#x60;.
   * @return colorSpace
  **/
  @Schema(description = "The YUV colorspace type.    Probe Field: `color_space`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorSpaces`.")
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
   * The comment.    Probe Field: &#x60;tags[\&quot;comment\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return comment
  **/
  @Schema(description = "The comment.    Probe Field: `tags[\"comment\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * The start time of the stream.    Probe Field: &#x60;start_time&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;System.TimeSpan&#x60;.
   * @return streamStartTimeTicks
  **/
  @Schema(description = "The start time of the stream.    Probe Field: `start_time`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `System.TimeSpan`.")
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
   * The time\\-base.    Probe Field: &#x60;time_base&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
   * @return timeBase
  **/
  @Schema(description = "The time\\-base.    Probe Field: `time_base`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `Emby.Media.Model.Types.Rational`.")
  public String getTimeBase() {
    return timeBase;
  }

  public void setTimeBase(String timeBase) {
    this.timeBase = timeBase;
  }

  public MediaStream title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title.    Probe Field: &#x60;tags[\&quot;title\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return title
  **/
  @Schema(description = "The title.    Probe Field: `tags[\"title\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * The extradata.    Probe Field: &#x60;extradata&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Currently, this value is only parsed for subtitle streams with codec &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext&#x60;.
   * @return extradata
  **/
  @Schema(description = "The extradata.    Probe Field: `extradata`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Currently, this value is only parsed for subtitle streams with codec `Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext`.")
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
   * The display title.    Custom property set by the application.
   * @return displayTitle
  **/
  @Schema(description = "The display title.    Custom property set by the application.")
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
   * The display language.    Custom property set by the application.
   * @return displayLanguage
  **/
  @Schema(description = "The display language.    Custom property set by the application.")
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
   * The nal length size.    Probe Field: &#x60;nal_length_size&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60; of type &#x60;Emby.Media.Model.Enums.VideoMediaTypes.h264&#x60;.    Actual type: &#x60;System.Int32&#x60;.
   * @return nalLengthSize
  **/
  @Schema(description = "The nal length size.    Probe Field: `nal_length_size`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video` of type `Emby.Media.Model.Enums.VideoMediaTypes.h264`.    Actual type: `System.Int32`.")
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
   * A value indicating whether this instance is interlaced.    Probe Field: &#x60;field_order&#x60; \\!\\&#x3D; &#x60;progressive&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
   * @return isInterlaced
  **/
  @Schema(description = "A value indicating whether this instance is interlaced.    Probe Field: `field_order` \\!\\= `progressive`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.")
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
   * The channel layout.    Probe Field: &#x60;channel_layout&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;MediaBrowser.Model.Entities.MediaStream.ChannelLayout&#x60;.
   * @return channelLayout
  **/
  @Schema(description = "The channel layout.    Probe Field: `channel_layout`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `MediaBrowser.Model.Entities.MediaStream.ChannelLayout`.")
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
   * The bit rate.    Probe Field: &#x60;bit_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!
   * @return bitRate
  **/
  @Schema(description = "The bit rate.    Probe Field: `bit_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!")
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
   * The bit depth.    Probe Field: &#x60;bits_per_sample&#x60; or &#x60;bits_per_raw_sample&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.
   * @return bitDepth
  **/
  @Schema(description = "The bit depth.    Probe Field: `bits_per_sample` or `bits_per_raw_sample`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.")
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
   * The reference frames.    Probe Field: &#x60;refs&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
   * @return refFrames
  **/
  @Schema(description = "The reference frames.    Probe Field: `refs`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.")
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
   * The audio channel count.    Probe Field: &#x60;channels&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.
   * @return channels
  **/
  @Schema(description = "The audio channel count.    Probe Field: `channels`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`.")
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
   * The sample rate.    Probe Field: &#x60;sample_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.SampleRates&#x60;.
   * @return sampleRate
  **/
  @Schema(description = "The sample rate.    Probe Field: `sample_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `Emby.Media.Model.Enums.SampleRates`.")
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
   * A value indicating whether this instance is default.    Probe Field: &#x60;disposition[\&quot;default\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return isDefault
  **/
  @Schema(description = "A value indicating whether this instance is default.    Probe Field: `disposition[\"default\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * A value indicating whether this instance is forced.    Probe Field: &#x60;disposition[\&quot;forced\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return isForced
  **/
  @Schema(description = "A value indicating whether this instance is forced.    Probe Field: `disposition[\"forced\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
  public Boolean isIsForced() {
    return isForced;
  }

  public void setIsForced(Boolean isForced) {
    this.isForced = isForced;
  }

  public MediaStream isHearingImpaired(Boolean isHearingImpaired) {
    this.isHearingImpaired = isHearingImpaired;
    return this;
  }

   /**
   * Get isHearingImpaired
   * @return isHearingImpaired
  **/
  @Schema(description = "")
  public Boolean isIsHearingImpaired() {
    return isHearingImpaired;
  }

  public void setIsHearingImpaired(Boolean isHearingImpaired) {
    this.isHearingImpaired = isHearingImpaired;
  }

  public MediaStream height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height.    Probe Field: &#x60;height&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
   * @return height
  **/
  @Schema(description = "The height.    Probe Field: `height`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.")
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
   * The width.    Probe Field: &#x60;width&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
   * @return width
  **/
  @Schema(description = "The width.    Probe Field: `width`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.")
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
   * The average frame rate..    Probe Field: &#x60;avg_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
   * @return averageFrameRate
  **/
  @Schema(description = "The average frame rate..    Probe Field: `avg_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.")
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
   * The real frame rate..    Probe Field: &#x60;r_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
   * @return realFrameRate
  **/
  @Schema(description = "The real frame rate..    Probe Field: `r_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.")
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
   * The profile.    Probe Field: &#x60;profile&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AacProfiles&#x60;, &#x60;Emby.Media.Model.Enums.AvcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.H263Profiles&#x60;, &#x60;Emby.Media.Model.Enums.HevcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Profiles&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Profiles&#x60;.
   * @return profile
  **/
  @Schema(description = "The profile.    Probe Field: `profile`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enums: `Emby.Media.Model.Enums.AacProfiles`, `Emby.Media.Model.Enums.AvcProfiles`, `Emby.Media.Model.Enums.H263Profiles`, `Emby.Media.Model.Enums.HevcProfiles`, `Emby.Media.Model.Enums.Mpeg2Profiles`,`Emby.Media.Model.Enums.Vc1Profiles`, `Emby.Media.Model.Enums.Mpeg4Profiles`, `Emby.Media.Model.Enums.Vp8Profiles`, `Emby.Media.Model.Enums.Vp9Profiles`.")
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
   * The aspect ratio.    Probe Field: &#x60;display_aspect_ratio&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
   * @return aspectRatio
  **/
  @Schema(description = "The aspect ratio.    Probe Field: `display_aspect_ratio`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.")
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
   * The index of the stream inside its container.    Probe Field: &#x60;index&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
   * @return index
  **/
  @Schema(description = "The index of the stream inside its container.    Probe Field: `index`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.")
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
   * A value indicating whether this instance is external.    Custom property set by the application.
   * @return isExternal
  **/
  @Schema(description = "A value indicating whether this instance is external.    Custom property set by the application.")
  public Boolean isIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public MediaStream deliveryMethod(SubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @Schema(description = "")
  public SubtitleDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public MediaStream deliveryUrl(String deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
    return this;
  }

   /**
   * The delivery URL.    Custom property set by the application.
   * @return deliveryUrl
  **/
  @Schema(description = "The delivery URL.    Custom property set by the application.")
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
   * A value indicating whether this instance is external URL.    Custom property set by the application.
   * @return isExternalUrl
  **/
  @Schema(description = "A value indicating whether this instance is external URL.    Custom property set by the application.")
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
   * A value indicating whether \\[supports external stream\\].
   * @return supportsExternalStream
  **/
  @Schema(description = "A value indicating whether \\[supports external stream\\].")
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
   * The filename.
   * @return path
  **/
  @Schema(description = "The filename.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MediaStream protocol(MediaProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public MediaProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(MediaProtocol protocol) {
    this.protocol = protocol;
  }

  public MediaStream pixelFormat(String pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * The pixel format.    Probe Field: &#x60;pix_fmt&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;MediaBrowser.Model.Entities.MediaStream.PixelFormat&#x60;.
   * @return pixelFormat
  **/
  @Schema(description = "The pixel format.    Probe Field: `pix_fmt`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `MediaBrowser.Model.Entities.MediaStream.PixelFormat`.")
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
   * The codec level.    Probe Field: &#x60;level&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AvcLevels&#x60;, &#x60;Emby.Media.Model.Enums.H263Levels&#x60;, &#x60;Emby.Media.Model.Enums.HevcLevels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Levels&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Levels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Levels&#x60;.
   * @return level
  **/
  @Schema(description = "The codec level.    Probe Field: `level`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enums: `Emby.Media.Model.Enums.AvcLevels`, `Emby.Media.Model.Enums.H263Levels`, `Emby.Media.Model.Enums.HevcLevels`, `Emby.Media.Model.Enums.Mpeg2Levels`,`Emby.Media.Model.Enums.Vc1Levels`, `Emby.Media.Model.Enums.Mpeg4Levels`, `Emby.Media.Model.Enums.Vp8Levels`, `Emby.Media.Model.Enums.Vp9Levels`.")
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
   * A value indicating whether this instance is anamorphic.
   * @return isAnamorphic
  **/
  @Schema(description = "A value indicating whether this instance is anamorphic.")
  public Boolean isIsAnamorphic() {
    return isAnamorphic;
  }

  public void setIsAnamorphic(Boolean isAnamorphic) {
    this.isAnamorphic = isAnamorphic;
  }

  public MediaStream extendedVideoType(ExtendedVideoTypes extendedVideoType) {
    this.extendedVideoType = extendedVideoType;
    return this;
  }

   /**
   * Get extendedVideoType
   * @return extendedVideoType
  **/
  @Schema(description = "")
  public ExtendedVideoTypes getExtendedVideoType() {
    return extendedVideoType;
  }

  public void setExtendedVideoType(ExtendedVideoTypes extendedVideoType) {
    this.extendedVideoType = extendedVideoType;
  }

  public MediaStream extendedVideoSubType(ExtendedVideoSubTypes extendedVideoSubType) {
    this.extendedVideoSubType = extendedVideoSubType;
    return this;
  }

   /**
   * Get extendedVideoSubType
   * @return extendedVideoSubType
  **/
  @Schema(description = "")
  public ExtendedVideoSubTypes getExtendedVideoSubType() {
    return extendedVideoSubType;
  }

  public void setExtendedVideoSubType(ExtendedVideoSubTypes extendedVideoSubType) {
    this.extendedVideoSubType = extendedVideoSubType;
  }

  public MediaStream extendedVideoSubTypeDescription(String extendedVideoSubTypeDescription) {
    this.extendedVideoSubTypeDescription = extendedVideoSubTypeDescription;
    return this;
  }

   /**
   * The extended video sub\\-type description.
   * @return extendedVideoSubTypeDescription
  **/
  @Schema(description = "The extended video sub\\-type description.")
  public String getExtendedVideoSubTypeDescription() {
    return extendedVideoSubTypeDescription;
  }

  public void setExtendedVideoSubTypeDescription(String extendedVideoSubTypeDescription) {
    this.extendedVideoSubTypeDescription = extendedVideoSubTypeDescription;
  }

  public MediaStream itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Used only by our Windows app. Not used by Emby Server.
   * @return itemId
  **/
  @Schema(description = "Used only by our Windows app. Not used by Emby Server.")
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
   * Used only by our Windows app. Not used by Emby Server.
   * @return serverId
  **/
  @Schema(description = "Used only by our Windows app. Not used by Emby Server.")
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
   * The size of the attachment.
   * @return attachmentSize
  **/
  @Schema(description = "The size of the attachment.")
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
   * The type of the MIME.
   * @return mimeType
  **/
  @Schema(description = "The type of the MIME.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
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
        Objects.equals(this.isHearingImpaired, mediaStream.isHearingImpaired) &&
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
        Objects.equals(this.extendedVideoType, mediaStream.extendedVideoType) &&
        Objects.equals(this.extendedVideoSubType, mediaStream.extendedVideoSubType) &&
        Objects.equals(this.extendedVideoSubTypeDescription, mediaStream.extendedVideoSubTypeDescription) &&
        Objects.equals(this.itemId, mediaStream.itemId) &&
        Objects.equals(this.serverId, mediaStream.serverId) &&
        Objects.equals(this.attachmentSize, mediaStream.attachmentSize) &&
        Objects.equals(this.mimeType, mediaStream.mimeType) &&
        Objects.equals(this.subtitleLocationType, mediaStream.subtitleLocationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, codecTag, language, colorTransfer, colorPrimaries, colorSpace, comment, streamStartTimeTicks, timeBase, title, extradata, videoRange, displayTitle, displayLanguage, nalLengthSize, isInterlaced, isAVC, channelLayout, bitRate, bitDepth, refFrames, rotation, channels, sampleRate, isDefault, isForced, isHearingImpaired, height, width, averageFrameRate, realFrameRate, profile, type, aspectRatio, index, isExternal, deliveryMethod, deliveryUrl, isExternalUrl, isTextSubtitleStream, supportsExternalStream, path, protocol, pixelFormat, level, isAnamorphic, extendedVideoType, extendedVideoSubType, extendedVideoSubTypeDescription, itemId, serverId, attachmentSize, mimeType, subtitleLocationType);
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
    sb.append("    isHearingImpaired: ").append(toIndentedString(isHearingImpaired)).append("\n");
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
    sb.append("    extendedVideoType: ").append(toIndentedString(extendedVideoType)).append("\n");
    sb.append("    extendedVideoSubType: ").append(toIndentedString(extendedVideoSubType)).append("\n");
    sb.append("    extendedVideoSubTypeDescription: ").append(toIndentedString(extendedVideoSubTypeDescription)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    attachmentSize: ").append(toIndentedString(attachmentSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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
