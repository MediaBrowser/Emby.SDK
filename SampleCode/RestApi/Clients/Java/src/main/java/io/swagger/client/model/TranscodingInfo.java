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
import io.swagger.client.model.ProcessRunMetricsProcessStatistics;
import io.swagger.client.model.TranscodeReason;
import io.swagger.client.model.TranscodingVpStepInfo;
import io.swagger.client.model.TupleDoubleDouble;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TranscodingInfo
 */


public class TranscodingInfo {
  @SerializedName("AudioCodec")
  private String audioCodec = null;

  @SerializedName("VideoCodec")
  private String videoCodec = null;

  @SerializedName("SubProtocol")
  private String subProtocol = null;

  @SerializedName("Container")
  private String container = null;

  @SerializedName("IsVideoDirect")
  private Boolean isVideoDirect = null;

  @SerializedName("IsAudioDirect")
  private Boolean isAudioDirect = null;

  @SerializedName("Bitrate")
  private Integer bitrate = null;

  @SerializedName("AudioBitrate")
  private Integer audioBitrate = null;

  @SerializedName("VideoBitrate")
  private Integer videoBitrate = null;

  @SerializedName("Framerate")
  private Float framerate = null;

  @SerializedName("CompletionPercentage")
  private Double completionPercentage = null;

  @SerializedName("TranscodingPositionTicks")
  private Double transcodingPositionTicks = null;

  @SerializedName("TranscodingStartPositionTicks")
  private Double transcodingStartPositionTicks = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("AudioChannels")
  private Integer audioChannels = null;

  @SerializedName("TranscodeReasons")
  private List<TranscodeReason> transcodeReasons = null;

  @SerializedName("CurrentCpuUsage")
  private Double currentCpuUsage = null;

  @SerializedName("AverageCpuUsage")
  private Double averageCpuUsage = null;

  @SerializedName("CpuHistory")
  private List<TupleDoubleDouble> cpuHistory = null;

  @SerializedName("ProcessStatistics")
  private ProcessRunMetricsProcessStatistics processStatistics = null;

  @SerializedName("CurrentThrottle")
  private Integer currentThrottle = null;

  @SerializedName("VideoDecoder")
  private String videoDecoder = null;

  @SerializedName("VideoDecoderIsHardware")
  private Boolean videoDecoderIsHardware = null;

  @SerializedName("VideoDecoderMediaType")
  private String videoDecoderMediaType = null;

  @SerializedName("VideoDecoderHwAccel")
  private String videoDecoderHwAccel = null;

  @SerializedName("VideoEncoder")
  private String videoEncoder = null;

  @SerializedName("VideoEncoderIsHardware")
  private Boolean videoEncoderIsHardware = null;

  @SerializedName("VideoEncoderMediaType")
  private String videoEncoderMediaType = null;

  @SerializedName("VideoEncoderHwAccel")
  private String videoEncoderHwAccel = null;

  @SerializedName("VideoPipelineInfo")
  private List<TranscodingVpStepInfo> videoPipelineInfo = null;

  @SerializedName("SubtitlePipelineInfos")
  private List<List<TranscodingVpStepInfo>> subtitlePipelineInfos = null;

  public TranscodingInfo audioCodec(String audioCodec) {
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

  public TranscodingInfo videoCodec(String videoCodec) {
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

  public TranscodingInfo subProtocol(String subProtocol) {
    this.subProtocol = subProtocol;
    return this;
  }

   /**
   * Get subProtocol
   * @return subProtocol
  **/
  @Schema(description = "")
  public String getSubProtocol() {
    return subProtocol;
  }

  public void setSubProtocol(String subProtocol) {
    this.subProtocol = subProtocol;
  }

  public TranscodingInfo container(String container) {
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

  public TranscodingInfo isVideoDirect(Boolean isVideoDirect) {
    this.isVideoDirect = isVideoDirect;
    return this;
  }

   /**
   * Get isVideoDirect
   * @return isVideoDirect
  **/
  @Schema(description = "")
  public Boolean isIsVideoDirect() {
    return isVideoDirect;
  }

  public void setIsVideoDirect(Boolean isVideoDirect) {
    this.isVideoDirect = isVideoDirect;
  }

  public TranscodingInfo isAudioDirect(Boolean isAudioDirect) {
    this.isAudioDirect = isAudioDirect;
    return this;
  }

   /**
   * Get isAudioDirect
   * @return isAudioDirect
  **/
  @Schema(description = "")
  public Boolean isIsAudioDirect() {
    return isAudioDirect;
  }

  public void setIsAudioDirect(Boolean isAudioDirect) {
    this.isAudioDirect = isAudioDirect;
  }

  public TranscodingInfo bitrate(Integer bitrate) {
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

  public TranscodingInfo audioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
    return this;
  }

   /**
   * Get audioBitrate
   * @return audioBitrate
  **/
  @Schema(description = "")
  public Integer getAudioBitrate() {
    return audioBitrate;
  }

  public void setAudioBitrate(Integer audioBitrate) {
    this.audioBitrate = audioBitrate;
  }

  public TranscodingInfo videoBitrate(Integer videoBitrate) {
    this.videoBitrate = videoBitrate;
    return this;
  }

   /**
   * Get videoBitrate
   * @return videoBitrate
  **/
  @Schema(description = "")
  public Integer getVideoBitrate() {
    return videoBitrate;
  }

  public void setVideoBitrate(Integer videoBitrate) {
    this.videoBitrate = videoBitrate;
  }

  public TranscodingInfo framerate(Float framerate) {
    this.framerate = framerate;
    return this;
  }

   /**
   * Get framerate
   * @return framerate
  **/
  @Schema(description = "")
  public Float getFramerate() {
    return framerate;
  }

  public void setFramerate(Float framerate) {
    this.framerate = framerate;
  }

  public TranscodingInfo completionPercentage(Double completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Get completionPercentage
   * @return completionPercentage
  **/
  @Schema(description = "")
  public Double getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(Double completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public TranscodingInfo transcodingPositionTicks(Double transcodingPositionTicks) {
    this.transcodingPositionTicks = transcodingPositionTicks;
    return this;
  }

   /**
   * Get transcodingPositionTicks
   * @return transcodingPositionTicks
  **/
  @Schema(description = "")
  public Double getTranscodingPositionTicks() {
    return transcodingPositionTicks;
  }

  public void setTranscodingPositionTicks(Double transcodingPositionTicks) {
    this.transcodingPositionTicks = transcodingPositionTicks;
  }

  public TranscodingInfo transcodingStartPositionTicks(Double transcodingStartPositionTicks) {
    this.transcodingStartPositionTicks = transcodingStartPositionTicks;
    return this;
  }

   /**
   * Get transcodingStartPositionTicks
   * @return transcodingStartPositionTicks
  **/
  @Schema(description = "")
  public Double getTranscodingStartPositionTicks() {
    return transcodingStartPositionTicks;
  }

  public void setTranscodingStartPositionTicks(Double transcodingStartPositionTicks) {
    this.transcodingStartPositionTicks = transcodingStartPositionTicks;
  }

  public TranscodingInfo width(Integer width) {
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

  public TranscodingInfo height(Integer height) {
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

  public TranscodingInfo audioChannels(Integer audioChannels) {
    this.audioChannels = audioChannels;
    return this;
  }

   /**
   * Get audioChannels
   * @return audioChannels
  **/
  @Schema(description = "")
  public Integer getAudioChannels() {
    return audioChannels;
  }

  public void setAudioChannels(Integer audioChannels) {
    this.audioChannels = audioChannels;
  }

  public TranscodingInfo transcodeReasons(List<TranscodeReason> transcodeReasons) {
    this.transcodeReasons = transcodeReasons;
    return this;
  }

  public TranscodingInfo addTranscodeReasonsItem(TranscodeReason transcodeReasonsItem) {
    if (this.transcodeReasons == null) {
      this.transcodeReasons = new ArrayList<TranscodeReason>();
    }
    this.transcodeReasons.add(transcodeReasonsItem);
    return this;
  }

   /**
   * Get transcodeReasons
   * @return transcodeReasons
  **/
  @Schema(description = "")
  public List<TranscodeReason> getTranscodeReasons() {
    return transcodeReasons;
  }

  public void setTranscodeReasons(List<TranscodeReason> transcodeReasons) {
    this.transcodeReasons = transcodeReasons;
  }

  public TranscodingInfo currentCpuUsage(Double currentCpuUsage) {
    this.currentCpuUsage = currentCpuUsage;
    return this;
  }

   /**
   * Deprecated, please use ProcessStatistics instead
   * @return currentCpuUsage
  **/
  @Schema(description = "Deprecated, please use ProcessStatistics instead")
  public Double getCurrentCpuUsage() {
    return currentCpuUsage;
  }

  public void setCurrentCpuUsage(Double currentCpuUsage) {
    this.currentCpuUsage = currentCpuUsage;
  }

  public TranscodingInfo averageCpuUsage(Double averageCpuUsage) {
    this.averageCpuUsage = averageCpuUsage;
    return this;
  }

   /**
   * Deprecated, please use ProcessStatistics instead
   * @return averageCpuUsage
  **/
  @Schema(description = "Deprecated, please use ProcessStatistics instead")
  public Double getAverageCpuUsage() {
    return averageCpuUsage;
  }

  public void setAverageCpuUsage(Double averageCpuUsage) {
    this.averageCpuUsage = averageCpuUsage;
  }

  public TranscodingInfo cpuHistory(List<TupleDoubleDouble> cpuHistory) {
    this.cpuHistory = cpuHistory;
    return this;
  }

  public TranscodingInfo addCpuHistoryItem(TupleDoubleDouble cpuHistoryItem) {
    if (this.cpuHistory == null) {
      this.cpuHistory = new ArrayList<TupleDoubleDouble>();
    }
    this.cpuHistory.add(cpuHistoryItem);
    return this;
  }

   /**
   * Deprecated, please use ProcessStatistics instead
   * @return cpuHistory
  **/
  @Schema(description = "Deprecated, please use ProcessStatistics instead")
  public List<TupleDoubleDouble> getCpuHistory() {
    return cpuHistory;
  }

  public void setCpuHistory(List<TupleDoubleDouble> cpuHistory) {
    this.cpuHistory = cpuHistory;
  }

  public TranscodingInfo processStatistics(ProcessRunMetricsProcessStatistics processStatistics) {
    this.processStatistics = processStatistics;
    return this;
  }

   /**
   * Get processStatistics
   * @return processStatistics
  **/
  @Schema(description = "")
  public ProcessRunMetricsProcessStatistics getProcessStatistics() {
    return processStatistics;
  }

  public void setProcessStatistics(ProcessRunMetricsProcessStatistics processStatistics) {
    this.processStatistics = processStatistics;
  }

  public TranscodingInfo currentThrottle(Integer currentThrottle) {
    this.currentThrottle = currentThrottle;
    return this;
  }

   /**
   * Get currentThrottle
   * @return currentThrottle
  **/
  @Schema(description = "")
  public Integer getCurrentThrottle() {
    return currentThrottle;
  }

  public void setCurrentThrottle(Integer currentThrottle) {
    this.currentThrottle = currentThrottle;
  }

  public TranscodingInfo videoDecoder(String videoDecoder) {
    this.videoDecoder = videoDecoder;
    return this;
  }

   /**
   * Get videoDecoder
   * @return videoDecoder
  **/
  @Schema(description = "")
  public String getVideoDecoder() {
    return videoDecoder;
  }

  public void setVideoDecoder(String videoDecoder) {
    this.videoDecoder = videoDecoder;
  }

  public TranscodingInfo videoDecoderIsHardware(Boolean videoDecoderIsHardware) {
    this.videoDecoderIsHardware = videoDecoderIsHardware;
    return this;
  }

   /**
   * Get videoDecoderIsHardware
   * @return videoDecoderIsHardware
  **/
  @Schema(description = "")
  public Boolean isVideoDecoderIsHardware() {
    return videoDecoderIsHardware;
  }

  public void setVideoDecoderIsHardware(Boolean videoDecoderIsHardware) {
    this.videoDecoderIsHardware = videoDecoderIsHardware;
  }

  public TranscodingInfo videoDecoderMediaType(String videoDecoderMediaType) {
    this.videoDecoderMediaType = videoDecoderMediaType;
    return this;
  }

   /**
   * Get videoDecoderMediaType
   * @return videoDecoderMediaType
  **/
  @Schema(description = "")
  public String getVideoDecoderMediaType() {
    return videoDecoderMediaType;
  }

  public void setVideoDecoderMediaType(String videoDecoderMediaType) {
    this.videoDecoderMediaType = videoDecoderMediaType;
  }

  public TranscodingInfo videoDecoderHwAccel(String videoDecoderHwAccel) {
    this.videoDecoderHwAccel = videoDecoderHwAccel;
    return this;
  }

   /**
   * Get videoDecoderHwAccel
   * @return videoDecoderHwAccel
  **/
  @Schema(description = "")
  public String getVideoDecoderHwAccel() {
    return videoDecoderHwAccel;
  }

  public void setVideoDecoderHwAccel(String videoDecoderHwAccel) {
    this.videoDecoderHwAccel = videoDecoderHwAccel;
  }

  public TranscodingInfo videoEncoder(String videoEncoder) {
    this.videoEncoder = videoEncoder;
    return this;
  }

   /**
   * Get videoEncoder
   * @return videoEncoder
  **/
  @Schema(description = "")
  public String getVideoEncoder() {
    return videoEncoder;
  }

  public void setVideoEncoder(String videoEncoder) {
    this.videoEncoder = videoEncoder;
  }

  public TranscodingInfo videoEncoderIsHardware(Boolean videoEncoderIsHardware) {
    this.videoEncoderIsHardware = videoEncoderIsHardware;
    return this;
  }

   /**
   * Get videoEncoderIsHardware
   * @return videoEncoderIsHardware
  **/
  @Schema(description = "")
  public Boolean isVideoEncoderIsHardware() {
    return videoEncoderIsHardware;
  }

  public void setVideoEncoderIsHardware(Boolean videoEncoderIsHardware) {
    this.videoEncoderIsHardware = videoEncoderIsHardware;
  }

  public TranscodingInfo videoEncoderMediaType(String videoEncoderMediaType) {
    this.videoEncoderMediaType = videoEncoderMediaType;
    return this;
  }

   /**
   * Get videoEncoderMediaType
   * @return videoEncoderMediaType
  **/
  @Schema(description = "")
  public String getVideoEncoderMediaType() {
    return videoEncoderMediaType;
  }

  public void setVideoEncoderMediaType(String videoEncoderMediaType) {
    this.videoEncoderMediaType = videoEncoderMediaType;
  }

  public TranscodingInfo videoEncoderHwAccel(String videoEncoderHwAccel) {
    this.videoEncoderHwAccel = videoEncoderHwAccel;
    return this;
  }

   /**
   * Get videoEncoderHwAccel
   * @return videoEncoderHwAccel
  **/
  @Schema(description = "")
  public String getVideoEncoderHwAccel() {
    return videoEncoderHwAccel;
  }

  public void setVideoEncoderHwAccel(String videoEncoderHwAccel) {
    this.videoEncoderHwAccel = videoEncoderHwAccel;
  }

  public TranscodingInfo videoPipelineInfo(List<TranscodingVpStepInfo> videoPipelineInfo) {
    this.videoPipelineInfo = videoPipelineInfo;
    return this;
  }

  public TranscodingInfo addVideoPipelineInfoItem(TranscodingVpStepInfo videoPipelineInfoItem) {
    if (this.videoPipelineInfo == null) {
      this.videoPipelineInfo = new ArrayList<TranscodingVpStepInfo>();
    }
    this.videoPipelineInfo.add(videoPipelineInfoItem);
    return this;
  }

   /**
   * Get videoPipelineInfo
   * @return videoPipelineInfo
  **/
  @Schema(description = "")
  public List<TranscodingVpStepInfo> getVideoPipelineInfo() {
    return videoPipelineInfo;
  }

  public void setVideoPipelineInfo(List<TranscodingVpStepInfo> videoPipelineInfo) {
    this.videoPipelineInfo = videoPipelineInfo;
  }

  public TranscodingInfo subtitlePipelineInfos(List<List<TranscodingVpStepInfo>> subtitlePipelineInfos) {
    this.subtitlePipelineInfos = subtitlePipelineInfos;
    return this;
  }

  public TranscodingInfo addSubtitlePipelineInfosItem(List<TranscodingVpStepInfo> subtitlePipelineInfosItem) {
    if (this.subtitlePipelineInfos == null) {
      this.subtitlePipelineInfos = new ArrayList<List<TranscodingVpStepInfo>>();
    }
    this.subtitlePipelineInfos.add(subtitlePipelineInfosItem);
    return this;
  }

   /**
   * Get subtitlePipelineInfos
   * @return subtitlePipelineInfos
  **/
  @Schema(description = "")
  public List<List<TranscodingVpStepInfo>> getSubtitlePipelineInfos() {
    return subtitlePipelineInfos;
  }

  public void setSubtitlePipelineInfos(List<List<TranscodingVpStepInfo>> subtitlePipelineInfos) {
    this.subtitlePipelineInfos = subtitlePipelineInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingInfo transcodingInfo = (TranscodingInfo) o;
    return Objects.equals(this.audioCodec, transcodingInfo.audioCodec) &&
        Objects.equals(this.videoCodec, transcodingInfo.videoCodec) &&
        Objects.equals(this.subProtocol, transcodingInfo.subProtocol) &&
        Objects.equals(this.container, transcodingInfo.container) &&
        Objects.equals(this.isVideoDirect, transcodingInfo.isVideoDirect) &&
        Objects.equals(this.isAudioDirect, transcodingInfo.isAudioDirect) &&
        Objects.equals(this.bitrate, transcodingInfo.bitrate) &&
        Objects.equals(this.audioBitrate, transcodingInfo.audioBitrate) &&
        Objects.equals(this.videoBitrate, transcodingInfo.videoBitrate) &&
        Objects.equals(this.framerate, transcodingInfo.framerate) &&
        Objects.equals(this.completionPercentage, transcodingInfo.completionPercentage) &&
        Objects.equals(this.transcodingPositionTicks, transcodingInfo.transcodingPositionTicks) &&
        Objects.equals(this.transcodingStartPositionTicks, transcodingInfo.transcodingStartPositionTicks) &&
        Objects.equals(this.width, transcodingInfo.width) &&
        Objects.equals(this.height, transcodingInfo.height) &&
        Objects.equals(this.audioChannels, transcodingInfo.audioChannels) &&
        Objects.equals(this.transcodeReasons, transcodingInfo.transcodeReasons) &&
        Objects.equals(this.currentCpuUsage, transcodingInfo.currentCpuUsage) &&
        Objects.equals(this.averageCpuUsage, transcodingInfo.averageCpuUsage) &&
        Objects.equals(this.cpuHistory, transcodingInfo.cpuHistory) &&
        Objects.equals(this.processStatistics, transcodingInfo.processStatistics) &&
        Objects.equals(this.currentThrottle, transcodingInfo.currentThrottle) &&
        Objects.equals(this.videoDecoder, transcodingInfo.videoDecoder) &&
        Objects.equals(this.videoDecoderIsHardware, transcodingInfo.videoDecoderIsHardware) &&
        Objects.equals(this.videoDecoderMediaType, transcodingInfo.videoDecoderMediaType) &&
        Objects.equals(this.videoDecoderHwAccel, transcodingInfo.videoDecoderHwAccel) &&
        Objects.equals(this.videoEncoder, transcodingInfo.videoEncoder) &&
        Objects.equals(this.videoEncoderIsHardware, transcodingInfo.videoEncoderIsHardware) &&
        Objects.equals(this.videoEncoderMediaType, transcodingInfo.videoEncoderMediaType) &&
        Objects.equals(this.videoEncoderHwAccel, transcodingInfo.videoEncoderHwAccel) &&
        Objects.equals(this.videoPipelineInfo, transcodingInfo.videoPipelineInfo) &&
        Objects.equals(this.subtitlePipelineInfos, transcodingInfo.subtitlePipelineInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioCodec, videoCodec, subProtocol, container, isVideoDirect, isAudioDirect, bitrate, audioBitrate, videoBitrate, framerate, completionPercentage, transcodingPositionTicks, transcodingStartPositionTicks, width, height, audioChannels, transcodeReasons, currentCpuUsage, averageCpuUsage, cpuHistory, processStatistics, currentThrottle, videoDecoder, videoDecoderIsHardware, videoDecoderMediaType, videoDecoderHwAccel, videoEncoder, videoEncoderIsHardware, videoEncoderMediaType, videoEncoderHwAccel, videoPipelineInfo, subtitlePipelineInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscodingInfo {\n");
    
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    subProtocol: ").append(toIndentedString(subProtocol)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    isVideoDirect: ").append(toIndentedString(isVideoDirect)).append("\n");
    sb.append("    isAudioDirect: ").append(toIndentedString(isAudioDirect)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    framerate: ").append(toIndentedString(framerate)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    transcodingPositionTicks: ").append(toIndentedString(transcodingPositionTicks)).append("\n");
    sb.append("    transcodingStartPositionTicks: ").append(toIndentedString(transcodingStartPositionTicks)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
    sb.append("    transcodeReasons: ").append(toIndentedString(transcodeReasons)).append("\n");
    sb.append("    currentCpuUsage: ").append(toIndentedString(currentCpuUsage)).append("\n");
    sb.append("    averageCpuUsage: ").append(toIndentedString(averageCpuUsage)).append("\n");
    sb.append("    cpuHistory: ").append(toIndentedString(cpuHistory)).append("\n");
    sb.append("    processStatistics: ").append(toIndentedString(processStatistics)).append("\n");
    sb.append("    currentThrottle: ").append(toIndentedString(currentThrottle)).append("\n");
    sb.append("    videoDecoder: ").append(toIndentedString(videoDecoder)).append("\n");
    sb.append("    videoDecoderIsHardware: ").append(toIndentedString(videoDecoderIsHardware)).append("\n");
    sb.append("    videoDecoderMediaType: ").append(toIndentedString(videoDecoderMediaType)).append("\n");
    sb.append("    videoDecoderHwAccel: ").append(toIndentedString(videoDecoderHwAccel)).append("\n");
    sb.append("    videoEncoder: ").append(toIndentedString(videoEncoder)).append("\n");
    sb.append("    videoEncoderIsHardware: ").append(toIndentedString(videoEncoderIsHardware)).append("\n");
    sb.append("    videoEncoderMediaType: ").append(toIndentedString(videoEncoderMediaType)).append("\n");
    sb.append("    videoEncoderHwAccel: ").append(toIndentedString(videoEncoderHwAccel)).append("\n");
    sb.append("    videoPipelineInfo: ").append(toIndentedString(videoPipelineInfo)).append("\n");
    sb.append("    subtitlePipelineInfos: ").append(toIndentedString(subtitlePipelineInfos)).append("\n");
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
