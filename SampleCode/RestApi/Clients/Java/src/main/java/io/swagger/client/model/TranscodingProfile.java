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
import io.swagger.client.model.DlnaProfileType;
import io.swagger.client.model.EncodingContext;
import io.swagger.client.model.TranscodeSeekInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TranscodingProfile
 */


public class TranscodingProfile {
  @SerializedName("Container")
  private String container = null;

  @SerializedName("Type")
  private DlnaProfileType type = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("EstimateContentLength")
  private Boolean estimateContentLength = null;

  @SerializedName("EnableMpegtsM2TsMode")
  private Boolean enableMpegtsM2TsMode = null;

  @SerializedName("TranscodeSeekInfo")
  private TranscodeSeekInfo transcodeSeekInfo = null;

  @SerializedName("CopyTimestamps")
  private Boolean copyTimestamps = null;

  @SerializedName("Context")
  private EncodingContext context = null;

  @SerializedName("MaxAudioChannels")
  private String maxAudioChannels = null;

  @SerializedName("MinSegments")
  private Integer minSegments = null;

  @SerializedName("SegmentLength")
  private Integer segmentLength = null;

  @SerializedName("BreakOnNonKeyFrames")
  private Boolean breakOnNonKeyFrames = null;

  @SerializedName("AllowInterlacedVideoStreamCopy")
  private Boolean allowInterlacedVideoStreamCopy = null;

  @SerializedName("ManifestSubtitles")
  private String manifestSubtitles = null;

  @SerializedName("MaxManifestSubtitles")
  private Integer maxManifestSubtitles = null;

  @SerializedName("MaxWidth")
  private Integer maxWidth = null;

  @SerializedName("MaxHeight")
  private Integer maxHeight = null;

  @SerializedName("FillEmptySubtitleSegments")
  private Boolean fillEmptySubtitleSegments = null;

  public TranscodingProfile container(String container) {
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

  public TranscodingProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }

  public TranscodingProfile videoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * Get videoCodec
   * @return videoCodec
  **/
  @Schema(description = "")
  public String getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }

  public TranscodingProfile audioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * Get audioCodec
   * @return audioCodec
  **/
  @Schema(description = "")
  public String getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }

  public TranscodingProfile protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public TranscodingProfile estimateContentLength(Boolean estimateContentLength) {
    this.estimateContentLength = estimateContentLength;
    return this;
  }

   /**
   * Get estimateContentLength
   * @return estimateContentLength
  **/
  @Schema(description = "")
  public Boolean isEstimateContentLength() {
    return estimateContentLength;
  }

  public void setEstimateContentLength(Boolean estimateContentLength) {
    this.estimateContentLength = estimateContentLength;
  }

  public TranscodingProfile enableMpegtsM2TsMode(Boolean enableMpegtsM2TsMode) {
    this.enableMpegtsM2TsMode = enableMpegtsM2TsMode;
    return this;
  }

   /**
   * Get enableMpegtsM2TsMode
   * @return enableMpegtsM2TsMode
  **/
  @Schema(description = "")
  public Boolean isEnableMpegtsM2TsMode() {
    return enableMpegtsM2TsMode;
  }

  public void setEnableMpegtsM2TsMode(Boolean enableMpegtsM2TsMode) {
    this.enableMpegtsM2TsMode = enableMpegtsM2TsMode;
  }

  public TranscodingProfile transcodeSeekInfo(TranscodeSeekInfo transcodeSeekInfo) {
    this.transcodeSeekInfo = transcodeSeekInfo;
    return this;
  }

   /**
   * Get transcodeSeekInfo
   * @return transcodeSeekInfo
  **/
  @Schema(description = "")
  public TranscodeSeekInfo getTranscodeSeekInfo() {
    return transcodeSeekInfo;
  }

  public void setTranscodeSeekInfo(TranscodeSeekInfo transcodeSeekInfo) {
    this.transcodeSeekInfo = transcodeSeekInfo;
  }

  public TranscodingProfile copyTimestamps(Boolean copyTimestamps) {
    this.copyTimestamps = copyTimestamps;
    return this;
  }

   /**
   * Get copyTimestamps
   * @return copyTimestamps
  **/
  @Schema(description = "")
  public Boolean isCopyTimestamps() {
    return copyTimestamps;
  }

  public void setCopyTimestamps(Boolean copyTimestamps) {
    this.copyTimestamps = copyTimestamps;
  }

  public TranscodingProfile context(EncodingContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public EncodingContext getContext() {
    return context;
  }

  public void setContext(EncodingContext context) {
    this.context = context;
  }

  public TranscodingProfile maxAudioChannels(String maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
    return this;
  }

   /**
   * Get maxAudioChannels
   * @return maxAudioChannels
  **/
  @Schema(description = "")
  public String getMaxAudioChannels() {
    return maxAudioChannels;
  }

  public void setMaxAudioChannels(String maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
  }

  public TranscodingProfile minSegments(Integer minSegments) {
    this.minSegments = minSegments;
    return this;
  }

   /**
   * Get minSegments
   * @return minSegments
  **/
  @Schema(description = "")
  public Integer getMinSegments() {
    return minSegments;
  }

  public void setMinSegments(Integer minSegments) {
    this.minSegments = minSegments;
  }

  public TranscodingProfile segmentLength(Integer segmentLength) {
    this.segmentLength = segmentLength;
    return this;
  }

   /**
   * Get segmentLength
   * @return segmentLength
  **/
  @Schema(description = "")
  public Integer getSegmentLength() {
    return segmentLength;
  }

  public void setSegmentLength(Integer segmentLength) {
    this.segmentLength = segmentLength;
  }

  public TranscodingProfile breakOnNonKeyFrames(Boolean breakOnNonKeyFrames) {
    this.breakOnNonKeyFrames = breakOnNonKeyFrames;
    return this;
  }

   /**
   * Get breakOnNonKeyFrames
   * @return breakOnNonKeyFrames
  **/
  @Schema(description = "")
  public Boolean isBreakOnNonKeyFrames() {
    return breakOnNonKeyFrames;
  }

  public void setBreakOnNonKeyFrames(Boolean breakOnNonKeyFrames) {
    this.breakOnNonKeyFrames = breakOnNonKeyFrames;
  }

  public TranscodingProfile allowInterlacedVideoStreamCopy(Boolean allowInterlacedVideoStreamCopy) {
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

  public TranscodingProfile manifestSubtitles(String manifestSubtitles) {
    this.manifestSubtitles = manifestSubtitles;
    return this;
  }

   /**
   * Get manifestSubtitles
   * @return manifestSubtitles
  **/
  @Schema(description = "")
  public String getManifestSubtitles() {
    return manifestSubtitles;
  }

  public void setManifestSubtitles(String manifestSubtitles) {
    this.manifestSubtitles = manifestSubtitles;
  }

  public TranscodingProfile maxManifestSubtitles(Integer maxManifestSubtitles) {
    this.maxManifestSubtitles = maxManifestSubtitles;
    return this;
  }

   /**
   * Get maxManifestSubtitles
   * @return maxManifestSubtitles
  **/
  @Schema(description = "")
  public Integer getMaxManifestSubtitles() {
    return maxManifestSubtitles;
  }

  public void setMaxManifestSubtitles(Integer maxManifestSubtitles) {
    this.maxManifestSubtitles = maxManifestSubtitles;
  }

  public TranscodingProfile maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @Schema(description = "")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public TranscodingProfile maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @Schema(description = "")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }

  public TranscodingProfile fillEmptySubtitleSegments(Boolean fillEmptySubtitleSegments) {
    this.fillEmptySubtitleSegments = fillEmptySubtitleSegments;
    return this;
  }

   /**
   * Get fillEmptySubtitleSegments
   * @return fillEmptySubtitleSegments
  **/
  @Schema(description = "")
  public Boolean isFillEmptySubtitleSegments() {
    return fillEmptySubtitleSegments;
  }

  public void setFillEmptySubtitleSegments(Boolean fillEmptySubtitleSegments) {
    this.fillEmptySubtitleSegments = fillEmptySubtitleSegments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingProfile transcodingProfile = (TranscodingProfile) o;
    return Objects.equals(this.container, transcodingProfile.container) &&
        Objects.equals(this.type, transcodingProfile.type) &&
        Objects.equals(this.videoCodec, transcodingProfile.videoCodec) &&
        Objects.equals(this.audioCodec, transcodingProfile.audioCodec) &&
        Objects.equals(this.protocol, transcodingProfile.protocol) &&
        Objects.equals(this.estimateContentLength, transcodingProfile.estimateContentLength) &&
        Objects.equals(this.enableMpegtsM2TsMode, transcodingProfile.enableMpegtsM2TsMode) &&
        Objects.equals(this.transcodeSeekInfo, transcodingProfile.transcodeSeekInfo) &&
        Objects.equals(this.copyTimestamps, transcodingProfile.copyTimestamps) &&
        Objects.equals(this.context, transcodingProfile.context) &&
        Objects.equals(this.maxAudioChannels, transcodingProfile.maxAudioChannels) &&
        Objects.equals(this.minSegments, transcodingProfile.minSegments) &&
        Objects.equals(this.segmentLength, transcodingProfile.segmentLength) &&
        Objects.equals(this.breakOnNonKeyFrames, transcodingProfile.breakOnNonKeyFrames) &&
        Objects.equals(this.allowInterlacedVideoStreamCopy, transcodingProfile.allowInterlacedVideoStreamCopy) &&
        Objects.equals(this.manifestSubtitles, transcodingProfile.manifestSubtitles) &&
        Objects.equals(this.maxManifestSubtitles, transcodingProfile.maxManifestSubtitles) &&
        Objects.equals(this.maxWidth, transcodingProfile.maxWidth) &&
        Objects.equals(this.maxHeight, transcodingProfile.maxHeight) &&
        Objects.equals(this.fillEmptySubtitleSegments, transcodingProfile.fillEmptySubtitleSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, type, videoCodec, audioCodec, protocol, estimateContentLength, enableMpegtsM2TsMode, transcodeSeekInfo, copyTimestamps, context, maxAudioChannels, minSegments, segmentLength, breakOnNonKeyFrames, allowInterlacedVideoStreamCopy, manifestSubtitles, maxManifestSubtitles, maxWidth, maxHeight, fillEmptySubtitleSegments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscodingProfile {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    estimateContentLength: ").append(toIndentedString(estimateContentLength)).append("\n");
    sb.append("    enableMpegtsM2TsMode: ").append(toIndentedString(enableMpegtsM2TsMode)).append("\n");
    sb.append("    transcodeSeekInfo: ").append(toIndentedString(transcodeSeekInfo)).append("\n");
    sb.append("    copyTimestamps: ").append(toIndentedString(copyTimestamps)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    maxAudioChannels: ").append(toIndentedString(maxAudioChannels)).append("\n");
    sb.append("    minSegments: ").append(toIndentedString(minSegments)).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    breakOnNonKeyFrames: ").append(toIndentedString(breakOnNonKeyFrames)).append("\n");
    sb.append("    allowInterlacedVideoStreamCopy: ").append(toIndentedString(allowInterlacedVideoStreamCopy)).append("\n");
    sb.append("    manifestSubtitles: ").append(toIndentedString(manifestSubtitles)).append("\n");
    sb.append("    maxManifestSubtitles: ").append(toIndentedString(maxManifestSubtitles)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    fillEmptySubtitleSegments: ").append(toIndentedString(fillEmptySubtitleSegments)).append("\n");
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
