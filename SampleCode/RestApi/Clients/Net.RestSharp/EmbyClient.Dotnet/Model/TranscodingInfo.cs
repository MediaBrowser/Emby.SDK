/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// TranscodingInfo
    /// </summary>
    [DataContract]
        public partial class TranscodingInfo :  IEquatable<TranscodingInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscodingInfo" /> class.
        /// </summary>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="subProtocol">subProtocol.</param>
        /// <param name="container">container.</param>
        /// <param name="isVideoDirect">isVideoDirect.</param>
        /// <param name="isAudioDirect">isAudioDirect.</param>
        /// <param name="bitrate">bitrate.</param>
        /// <param name="audioBitrate">audioBitrate.</param>
        /// <param name="videoBitrate">videoBitrate.</param>
        /// <param name="framerate">framerate.</param>
        /// <param name="completionPercentage">completionPercentage.</param>
        /// <param name="transcodingPositionTicks">transcodingPositionTicks.</param>
        /// <param name="transcodingStartPositionTicks">transcodingStartPositionTicks.</param>
        /// <param name="width">width.</param>
        /// <param name="height">height.</param>
        /// <param name="audioChannels">audioChannels.</param>
        /// <param name="transcodeReasons">transcodeReasons.</param>
        /// <param name="currentCpuUsage">Deprecated, please use ProcessStatistics instead.</param>
        /// <param name="averageCpuUsage">Deprecated, please use ProcessStatistics instead.</param>
        /// <param name="cpuHistory">Deprecated, please use ProcessStatistics instead.</param>
        /// <param name="processStatistics">processStatistics.</param>
        /// <param name="currentThrottle">currentThrottle.</param>
        /// <param name="videoDecoder">videoDecoder.</param>
        /// <param name="videoDecoderIsHardware">videoDecoderIsHardware.</param>
        /// <param name="videoDecoderMediaType">videoDecoderMediaType.</param>
        /// <param name="videoDecoderHwAccel">videoDecoderHwAccel.</param>
        /// <param name="videoEncoder">videoEncoder.</param>
        /// <param name="videoEncoderIsHardware">videoEncoderIsHardware.</param>
        /// <param name="videoEncoderMediaType">videoEncoderMediaType.</param>
        /// <param name="videoEncoderHwAccel">videoEncoderHwAccel.</param>
        /// <param name="videoPipelineInfo">videoPipelineInfo.</param>
        /// <param name="subtitlePipelineInfos">subtitlePipelineInfos.</param>
        public TranscodingInfo(string audioCodec = default(string), string videoCodec = default(string), string subProtocol = default(string), string container = default(string), bool? isVideoDirect = default(bool?), bool? isAudioDirect = default(bool?), int? bitrate = default(int?), int? audioBitrate = default(int?), int? videoBitrate = default(int?), float? framerate = default(float?), double? completionPercentage = default(double?), double? transcodingPositionTicks = default(double?), double? transcodingStartPositionTicks = default(double?), int? width = default(int?), int? height = default(int?), int? audioChannels = default(int?), List<TranscodeReason> transcodeReasons = default(List<TranscodeReason>), double? currentCpuUsage = default(double?), double? averageCpuUsage = default(double?), List<TupleDoubleDouble> cpuHistory = default(List<TupleDoubleDouble>), ProcessRunMetricsProcessStatistics processStatistics = default(ProcessRunMetricsProcessStatistics), int? currentThrottle = default(int?), string videoDecoder = default(string), bool? videoDecoderIsHardware = default(bool?), string videoDecoderMediaType = default(string), string videoDecoderHwAccel = default(string), string videoEncoder = default(string), bool? videoEncoderIsHardware = default(bool?), string videoEncoderMediaType = default(string), string videoEncoderHwAccel = default(string), List<TranscodingVpStepInfo> videoPipelineInfo = default(List<TranscodingVpStepInfo>), List<List<TranscodingVpStepInfo>> subtitlePipelineInfos = default(List<List<TranscodingVpStepInfo>>))
        {
            this.AudioCodec = audioCodec;
            this.VideoCodec = videoCodec;
            this.SubProtocol = subProtocol;
            this.Container = container;
            this.IsVideoDirect = isVideoDirect;
            this.IsAudioDirect = isAudioDirect;
            this.Bitrate = bitrate;
            this.AudioBitrate = audioBitrate;
            this.VideoBitrate = videoBitrate;
            this.Framerate = framerate;
            this.CompletionPercentage = completionPercentage;
            this.TranscodingPositionTicks = transcodingPositionTicks;
            this.TranscodingStartPositionTicks = transcodingStartPositionTicks;
            this.Width = width;
            this.Height = height;
            this.AudioChannels = audioChannels;
            this.TranscodeReasons = transcodeReasons;
            this.CurrentCpuUsage = currentCpuUsage;
            this.AverageCpuUsage = averageCpuUsage;
            this.CpuHistory = cpuHistory;
            this.ProcessStatistics = processStatistics;
            this.CurrentThrottle = currentThrottle;
            this.VideoDecoder = videoDecoder;
            this.VideoDecoderIsHardware = videoDecoderIsHardware;
            this.VideoDecoderMediaType = videoDecoderMediaType;
            this.VideoDecoderHwAccel = videoDecoderHwAccel;
            this.VideoEncoder = videoEncoder;
            this.VideoEncoderIsHardware = videoEncoderIsHardware;
            this.VideoEncoderMediaType = videoEncoderMediaType;
            this.VideoEncoderHwAccel = videoEncoderHwAccel;
            this.VideoPipelineInfo = videoPipelineInfo;
            this.SubtitlePipelineInfos = subtitlePipelineInfos;
        }
        
        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=false)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=false)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Gets or Sets SubProtocol
        /// </summary>
        [DataMember(Name="SubProtocol", EmitDefaultValue=false)]
        public string SubProtocol { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets IsVideoDirect
        /// </summary>
        [DataMember(Name="IsVideoDirect", EmitDefaultValue=false)]
        public bool? IsVideoDirect { get; set; }

        /// <summary>
        /// Gets or Sets IsAudioDirect
        /// </summary>
        [DataMember(Name="IsAudioDirect", EmitDefaultValue=false)]
        public bool? IsAudioDirect { get; set; }

        /// <summary>
        /// Gets or Sets Bitrate
        /// </summary>
        [DataMember(Name="Bitrate", EmitDefaultValue=false)]
        public int? Bitrate { get; set; }

        /// <summary>
        /// Gets or Sets AudioBitrate
        /// </summary>
        [DataMember(Name="AudioBitrate", EmitDefaultValue=false)]
        public int? AudioBitrate { get; set; }

        /// <summary>
        /// Gets or Sets VideoBitrate
        /// </summary>
        [DataMember(Name="VideoBitrate", EmitDefaultValue=false)]
        public int? VideoBitrate { get; set; }

        /// <summary>
        /// Gets or Sets Framerate
        /// </summary>
        [DataMember(Name="Framerate", EmitDefaultValue=false)]
        public float? Framerate { get; set; }

        /// <summary>
        /// Gets or Sets CompletionPercentage
        /// </summary>
        [DataMember(Name="CompletionPercentage", EmitDefaultValue=false)]
        public double? CompletionPercentage { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingPositionTicks
        /// </summary>
        [DataMember(Name="TranscodingPositionTicks", EmitDefaultValue=false)]
        public double? TranscodingPositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingStartPositionTicks
        /// </summary>
        [DataMember(Name="TranscodingStartPositionTicks", EmitDefaultValue=false)]
        public double? TranscodingStartPositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// Gets or Sets AudioChannels
        /// </summary>
        [DataMember(Name="AudioChannels", EmitDefaultValue=false)]
        public int? AudioChannels { get; set; }

        /// <summary>
        /// Gets or Sets TranscodeReasons
        /// </summary>
        [DataMember(Name="TranscodeReasons", EmitDefaultValue=false)]
        public List<TranscodeReason> TranscodeReasons { get; set; }

        /// <summary>
        /// Deprecated, please use ProcessStatistics instead
        /// </summary>
        /// <value>Deprecated, please use ProcessStatistics instead</value>
        [DataMember(Name="CurrentCpuUsage", EmitDefaultValue=false)]
        public double? CurrentCpuUsage { get; set; }

        /// <summary>
        /// Deprecated, please use ProcessStatistics instead
        /// </summary>
        /// <value>Deprecated, please use ProcessStatistics instead</value>
        [DataMember(Name="AverageCpuUsage", EmitDefaultValue=false)]
        public double? AverageCpuUsage { get; set; }

        /// <summary>
        /// Deprecated, please use ProcessStatistics instead
        /// </summary>
        /// <value>Deprecated, please use ProcessStatistics instead</value>
        [DataMember(Name="CpuHistory", EmitDefaultValue=false)]
        public List<TupleDoubleDouble> CpuHistory { get; set; }

        /// <summary>
        /// Gets or Sets ProcessStatistics
        /// </summary>
        [DataMember(Name="ProcessStatistics", EmitDefaultValue=false)]
        public ProcessRunMetricsProcessStatistics ProcessStatistics { get; set; }

        /// <summary>
        /// Gets or Sets CurrentThrottle
        /// </summary>
        [DataMember(Name="CurrentThrottle", EmitDefaultValue=false)]
        public int? CurrentThrottle { get; set; }

        /// <summary>
        /// Gets or Sets VideoDecoder
        /// </summary>
        [DataMember(Name="VideoDecoder", EmitDefaultValue=false)]
        public string VideoDecoder { get; set; }

        /// <summary>
        /// Gets or Sets VideoDecoderIsHardware
        /// </summary>
        [DataMember(Name="VideoDecoderIsHardware", EmitDefaultValue=false)]
        public bool? VideoDecoderIsHardware { get; set; }

        /// <summary>
        /// Gets or Sets VideoDecoderMediaType
        /// </summary>
        [DataMember(Name="VideoDecoderMediaType", EmitDefaultValue=false)]
        public string VideoDecoderMediaType { get; set; }

        /// <summary>
        /// Gets or Sets VideoDecoderHwAccel
        /// </summary>
        [DataMember(Name="VideoDecoderHwAccel", EmitDefaultValue=false)]
        public string VideoDecoderHwAccel { get; set; }

        /// <summary>
        /// Gets or Sets VideoEncoder
        /// </summary>
        [DataMember(Name="VideoEncoder", EmitDefaultValue=false)]
        public string VideoEncoder { get; set; }

        /// <summary>
        /// Gets or Sets VideoEncoderIsHardware
        /// </summary>
        [DataMember(Name="VideoEncoderIsHardware", EmitDefaultValue=false)]
        public bool? VideoEncoderIsHardware { get; set; }

        /// <summary>
        /// Gets or Sets VideoEncoderMediaType
        /// </summary>
        [DataMember(Name="VideoEncoderMediaType", EmitDefaultValue=false)]
        public string VideoEncoderMediaType { get; set; }

        /// <summary>
        /// Gets or Sets VideoEncoderHwAccel
        /// </summary>
        [DataMember(Name="VideoEncoderHwAccel", EmitDefaultValue=false)]
        public string VideoEncoderHwAccel { get; set; }

        /// <summary>
        /// Gets or Sets VideoPipelineInfo
        /// </summary>
        [DataMember(Name="VideoPipelineInfo", EmitDefaultValue=false)]
        public List<TranscodingVpStepInfo> VideoPipelineInfo { get; set; }

        /// <summary>
        /// Gets or Sets SubtitlePipelineInfos
        /// </summary>
        [DataMember(Name="SubtitlePipelineInfos", EmitDefaultValue=false)]
        public List<List<TranscodingVpStepInfo>> SubtitlePipelineInfos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TranscodingInfo {\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  SubProtocol: ").Append(SubProtocol).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  IsVideoDirect: ").Append(IsVideoDirect).Append("\n");
            sb.Append("  IsAudioDirect: ").Append(IsAudioDirect).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
            sb.Append("  AudioBitrate: ").Append(AudioBitrate).Append("\n");
            sb.Append("  VideoBitrate: ").Append(VideoBitrate).Append("\n");
            sb.Append("  Framerate: ").Append(Framerate).Append("\n");
            sb.Append("  CompletionPercentage: ").Append(CompletionPercentage).Append("\n");
            sb.Append("  TranscodingPositionTicks: ").Append(TranscodingPositionTicks).Append("\n");
            sb.Append("  TranscodingStartPositionTicks: ").Append(TranscodingStartPositionTicks).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  AudioChannels: ").Append(AudioChannels).Append("\n");
            sb.Append("  TranscodeReasons: ").Append(TranscodeReasons).Append("\n");
            sb.Append("  CurrentCpuUsage: ").Append(CurrentCpuUsage).Append("\n");
            sb.Append("  AverageCpuUsage: ").Append(AverageCpuUsage).Append("\n");
            sb.Append("  CpuHistory: ").Append(CpuHistory).Append("\n");
            sb.Append("  ProcessStatistics: ").Append(ProcessStatistics).Append("\n");
            sb.Append("  CurrentThrottle: ").Append(CurrentThrottle).Append("\n");
            sb.Append("  VideoDecoder: ").Append(VideoDecoder).Append("\n");
            sb.Append("  VideoDecoderIsHardware: ").Append(VideoDecoderIsHardware).Append("\n");
            sb.Append("  VideoDecoderMediaType: ").Append(VideoDecoderMediaType).Append("\n");
            sb.Append("  VideoDecoderHwAccel: ").Append(VideoDecoderHwAccel).Append("\n");
            sb.Append("  VideoEncoder: ").Append(VideoEncoder).Append("\n");
            sb.Append("  VideoEncoderIsHardware: ").Append(VideoEncoderIsHardware).Append("\n");
            sb.Append("  VideoEncoderMediaType: ").Append(VideoEncoderMediaType).Append("\n");
            sb.Append("  VideoEncoderHwAccel: ").Append(VideoEncoderHwAccel).Append("\n");
            sb.Append("  VideoPipelineInfo: ").Append(VideoPipelineInfo).Append("\n");
            sb.Append("  SubtitlePipelineInfos: ").Append(SubtitlePipelineInfos).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TranscodingInfo);
        }

        /// <summary>
        /// Returns true if TranscodingInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of TranscodingInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TranscodingInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AudioCodec == input.AudioCodec ||
                    (this.AudioCodec != null &&
                    this.AudioCodec.Equals(input.AudioCodec))
                ) && 
                (
                    this.VideoCodec == input.VideoCodec ||
                    (this.VideoCodec != null &&
                    this.VideoCodec.Equals(input.VideoCodec))
                ) && 
                (
                    this.SubProtocol == input.SubProtocol ||
                    (this.SubProtocol != null &&
                    this.SubProtocol.Equals(input.SubProtocol))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.IsVideoDirect == input.IsVideoDirect ||
                    (this.IsVideoDirect != null &&
                    this.IsVideoDirect.Equals(input.IsVideoDirect))
                ) && 
                (
                    this.IsAudioDirect == input.IsAudioDirect ||
                    (this.IsAudioDirect != null &&
                    this.IsAudioDirect.Equals(input.IsAudioDirect))
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
                ) && 
                (
                    this.AudioBitrate == input.AudioBitrate ||
                    (this.AudioBitrate != null &&
                    this.AudioBitrate.Equals(input.AudioBitrate))
                ) && 
                (
                    this.VideoBitrate == input.VideoBitrate ||
                    (this.VideoBitrate != null &&
                    this.VideoBitrate.Equals(input.VideoBitrate))
                ) && 
                (
                    this.Framerate == input.Framerate ||
                    (this.Framerate != null &&
                    this.Framerate.Equals(input.Framerate))
                ) && 
                (
                    this.CompletionPercentage == input.CompletionPercentage ||
                    (this.CompletionPercentage != null &&
                    this.CompletionPercentage.Equals(input.CompletionPercentage))
                ) && 
                (
                    this.TranscodingPositionTicks == input.TranscodingPositionTicks ||
                    (this.TranscodingPositionTicks != null &&
                    this.TranscodingPositionTicks.Equals(input.TranscodingPositionTicks))
                ) && 
                (
                    this.TranscodingStartPositionTicks == input.TranscodingStartPositionTicks ||
                    (this.TranscodingStartPositionTicks != null &&
                    this.TranscodingStartPositionTicks.Equals(input.TranscodingStartPositionTicks))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.AudioChannels == input.AudioChannels ||
                    (this.AudioChannels != null &&
                    this.AudioChannels.Equals(input.AudioChannels))
                ) && 
                (
                    this.TranscodeReasons == input.TranscodeReasons ||
                    this.TranscodeReasons != null &&
                    input.TranscodeReasons != null &&
                    this.TranscodeReasons.SequenceEqual(input.TranscodeReasons)
                ) && 
                (
                    this.CurrentCpuUsage == input.CurrentCpuUsage ||
                    (this.CurrentCpuUsage != null &&
                    this.CurrentCpuUsage.Equals(input.CurrentCpuUsage))
                ) && 
                (
                    this.AverageCpuUsage == input.AverageCpuUsage ||
                    (this.AverageCpuUsage != null &&
                    this.AverageCpuUsage.Equals(input.AverageCpuUsage))
                ) && 
                (
                    this.CpuHistory == input.CpuHistory ||
                    this.CpuHistory != null &&
                    input.CpuHistory != null &&
                    this.CpuHistory.SequenceEqual(input.CpuHistory)
                ) && 
                (
                    this.ProcessStatistics == input.ProcessStatistics ||
                    (this.ProcessStatistics != null &&
                    this.ProcessStatistics.Equals(input.ProcessStatistics))
                ) && 
                (
                    this.CurrentThrottle == input.CurrentThrottle ||
                    (this.CurrentThrottle != null &&
                    this.CurrentThrottle.Equals(input.CurrentThrottle))
                ) && 
                (
                    this.VideoDecoder == input.VideoDecoder ||
                    (this.VideoDecoder != null &&
                    this.VideoDecoder.Equals(input.VideoDecoder))
                ) && 
                (
                    this.VideoDecoderIsHardware == input.VideoDecoderIsHardware ||
                    (this.VideoDecoderIsHardware != null &&
                    this.VideoDecoderIsHardware.Equals(input.VideoDecoderIsHardware))
                ) && 
                (
                    this.VideoDecoderMediaType == input.VideoDecoderMediaType ||
                    (this.VideoDecoderMediaType != null &&
                    this.VideoDecoderMediaType.Equals(input.VideoDecoderMediaType))
                ) && 
                (
                    this.VideoDecoderHwAccel == input.VideoDecoderHwAccel ||
                    (this.VideoDecoderHwAccel != null &&
                    this.VideoDecoderHwAccel.Equals(input.VideoDecoderHwAccel))
                ) && 
                (
                    this.VideoEncoder == input.VideoEncoder ||
                    (this.VideoEncoder != null &&
                    this.VideoEncoder.Equals(input.VideoEncoder))
                ) && 
                (
                    this.VideoEncoderIsHardware == input.VideoEncoderIsHardware ||
                    (this.VideoEncoderIsHardware != null &&
                    this.VideoEncoderIsHardware.Equals(input.VideoEncoderIsHardware))
                ) && 
                (
                    this.VideoEncoderMediaType == input.VideoEncoderMediaType ||
                    (this.VideoEncoderMediaType != null &&
                    this.VideoEncoderMediaType.Equals(input.VideoEncoderMediaType))
                ) && 
                (
                    this.VideoEncoderHwAccel == input.VideoEncoderHwAccel ||
                    (this.VideoEncoderHwAccel != null &&
                    this.VideoEncoderHwAccel.Equals(input.VideoEncoderHwAccel))
                ) && 
                (
                    this.VideoPipelineInfo == input.VideoPipelineInfo ||
                    this.VideoPipelineInfo != null &&
                    input.VideoPipelineInfo != null &&
                    this.VideoPipelineInfo.SequenceEqual(input.VideoPipelineInfo)
                ) && 
                (
                    this.SubtitlePipelineInfos == input.SubtitlePipelineInfos ||
                    this.SubtitlePipelineInfos != null &&
                    input.SubtitlePipelineInfos != null &&
                    this.SubtitlePipelineInfos.SequenceEqual(input.SubtitlePipelineInfos)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.SubProtocol != null)
                    hashCode = hashCode * 59 + this.SubProtocol.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.IsVideoDirect != null)
                    hashCode = hashCode * 59 + this.IsVideoDirect.GetHashCode();
                if (this.IsAudioDirect != null)
                    hashCode = hashCode * 59 + this.IsAudioDirect.GetHashCode();
                if (this.Bitrate != null)
                    hashCode = hashCode * 59 + this.Bitrate.GetHashCode();
                if (this.AudioBitrate != null)
                    hashCode = hashCode * 59 + this.AudioBitrate.GetHashCode();
                if (this.VideoBitrate != null)
                    hashCode = hashCode * 59 + this.VideoBitrate.GetHashCode();
                if (this.Framerate != null)
                    hashCode = hashCode * 59 + this.Framerate.GetHashCode();
                if (this.CompletionPercentage != null)
                    hashCode = hashCode * 59 + this.CompletionPercentage.GetHashCode();
                if (this.TranscodingPositionTicks != null)
                    hashCode = hashCode * 59 + this.TranscodingPositionTicks.GetHashCode();
                if (this.TranscodingStartPositionTicks != null)
                    hashCode = hashCode * 59 + this.TranscodingStartPositionTicks.GetHashCode();
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.AudioChannels != null)
                    hashCode = hashCode * 59 + this.AudioChannels.GetHashCode();
                if (this.TranscodeReasons != null)
                    hashCode = hashCode * 59 + this.TranscodeReasons.GetHashCode();
                if (this.CurrentCpuUsage != null)
                    hashCode = hashCode * 59 + this.CurrentCpuUsage.GetHashCode();
                if (this.AverageCpuUsage != null)
                    hashCode = hashCode * 59 + this.AverageCpuUsage.GetHashCode();
                if (this.CpuHistory != null)
                    hashCode = hashCode * 59 + this.CpuHistory.GetHashCode();
                if (this.ProcessStatistics != null)
                    hashCode = hashCode * 59 + this.ProcessStatistics.GetHashCode();
                if (this.CurrentThrottle != null)
                    hashCode = hashCode * 59 + this.CurrentThrottle.GetHashCode();
                if (this.VideoDecoder != null)
                    hashCode = hashCode * 59 + this.VideoDecoder.GetHashCode();
                if (this.VideoDecoderIsHardware != null)
                    hashCode = hashCode * 59 + this.VideoDecoderIsHardware.GetHashCode();
                if (this.VideoDecoderMediaType != null)
                    hashCode = hashCode * 59 + this.VideoDecoderMediaType.GetHashCode();
                if (this.VideoDecoderHwAccel != null)
                    hashCode = hashCode * 59 + this.VideoDecoderHwAccel.GetHashCode();
                if (this.VideoEncoder != null)
                    hashCode = hashCode * 59 + this.VideoEncoder.GetHashCode();
                if (this.VideoEncoderIsHardware != null)
                    hashCode = hashCode * 59 + this.VideoEncoderIsHardware.GetHashCode();
                if (this.VideoEncoderMediaType != null)
                    hashCode = hashCode * 59 + this.VideoEncoderMediaType.GetHashCode();
                if (this.VideoEncoderHwAccel != null)
                    hashCode = hashCode * 59 + this.VideoEncoderHwAccel.GetHashCode();
                if (this.VideoPipelineInfo != null)
                    hashCode = hashCode * 59 + this.VideoPipelineInfo.GetHashCode();
                if (this.SubtitlePipelineInfos != null)
                    hashCode = hashCode * 59 + this.SubtitlePipelineInfos.GetHashCode();
                return hashCode;
            }
        }

    }
}
