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
    /// TranscodingProfile
    /// </summary>
    [DataContract]
        public partial class TranscodingProfile :  IEquatable<TranscodingProfile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscodingProfile" /> class.
        /// </summary>
        /// <param name="container">container.</param>
        /// <param name="type">type.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="protocol">protocol.</param>
        /// <param name="estimateContentLength">estimateContentLength.</param>
        /// <param name="enableMpegtsM2TsMode">enableMpegtsM2TsMode.</param>
        /// <param name="transcodeSeekInfo">transcodeSeekInfo.</param>
        /// <param name="copyTimestamps">copyTimestamps.</param>
        /// <param name="context">context.</param>
        /// <param name="maxAudioChannels">maxAudioChannels.</param>
        /// <param name="minSegments">minSegments.</param>
        /// <param name="segmentLength">segmentLength.</param>
        /// <param name="breakOnNonKeyFrames">breakOnNonKeyFrames.</param>
        /// <param name="allowInterlacedVideoStreamCopy">allowInterlacedVideoStreamCopy.</param>
        /// <param name="manifestSubtitles">manifestSubtitles.</param>
        /// <param name="maxManifestSubtitles">maxManifestSubtitles.</param>
        /// <param name="maxWidth">maxWidth.</param>
        /// <param name="maxHeight">maxHeight.</param>
        /// <param name="fillEmptySubtitleSegments">fillEmptySubtitleSegments.</param>
        public TranscodingProfile(string container = default(string), DlnaProfileType type = default(DlnaProfileType), string videoCodec = default(string), string audioCodec = default(string), string protocol = default(string), bool? estimateContentLength = default(bool?), bool? enableMpegtsM2TsMode = default(bool?), TranscodeSeekInfo transcodeSeekInfo = default(TranscodeSeekInfo), bool? copyTimestamps = default(bool?), EncodingContext context = default(EncodingContext), string maxAudioChannels = default(string), int? minSegments = default(int?), int? segmentLength = default(int?), bool? breakOnNonKeyFrames = default(bool?), bool? allowInterlacedVideoStreamCopy = default(bool?), string manifestSubtitles = default(string), int? maxManifestSubtitles = default(int?), int? maxWidth = default(int?), int? maxHeight = default(int?), bool? fillEmptySubtitleSegments = default(bool?))
        {
            this.Container = container;
            this.Type = type;
            this.VideoCodec = videoCodec;
            this.AudioCodec = audioCodec;
            this.Protocol = protocol;
            this.EstimateContentLength = estimateContentLength;
            this.EnableMpegtsM2TsMode = enableMpegtsM2TsMode;
            this.TranscodeSeekInfo = transcodeSeekInfo;
            this.CopyTimestamps = copyTimestamps;
            this.Context = context;
            this.MaxAudioChannels = maxAudioChannels;
            this.MinSegments = minSegments;
            this.SegmentLength = segmentLength;
            this.BreakOnNonKeyFrames = breakOnNonKeyFrames;
            this.AllowInterlacedVideoStreamCopy = allowInterlacedVideoStreamCopy;
            this.ManifestSubtitles = manifestSubtitles;
            this.MaxManifestSubtitles = maxManifestSubtitles;
            this.MaxWidth = maxWidth;
            this.MaxHeight = maxHeight;
            this.FillEmptySubtitleSegments = fillEmptySubtitleSegments;
        }
        
        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public DlnaProfileType Type { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=false)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=false)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public string Protocol { get; set; }

        /// <summary>
        /// Gets or Sets EstimateContentLength
        /// </summary>
        [DataMember(Name="EstimateContentLength", EmitDefaultValue=false)]
        public bool? EstimateContentLength { get; set; }

        /// <summary>
        /// Gets or Sets EnableMpegtsM2TsMode
        /// </summary>
        [DataMember(Name="EnableMpegtsM2TsMode", EmitDefaultValue=false)]
        public bool? EnableMpegtsM2TsMode { get; set; }

        /// <summary>
        /// Gets or Sets TranscodeSeekInfo
        /// </summary>
        [DataMember(Name="TranscodeSeekInfo", EmitDefaultValue=false)]
        public TranscodeSeekInfo TranscodeSeekInfo { get; set; }

        /// <summary>
        /// Gets or Sets CopyTimestamps
        /// </summary>
        [DataMember(Name="CopyTimestamps", EmitDefaultValue=false)]
        public bool? CopyTimestamps { get; set; }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name="Context", EmitDefaultValue=false)]
        public EncodingContext Context { get; set; }

        /// <summary>
        /// Gets or Sets MaxAudioChannels
        /// </summary>
        [DataMember(Name="MaxAudioChannels", EmitDefaultValue=false)]
        public string MaxAudioChannels { get; set; }

        /// <summary>
        /// Gets or Sets MinSegments
        /// </summary>
        [DataMember(Name="MinSegments", EmitDefaultValue=false)]
        public int? MinSegments { get; set; }

        /// <summary>
        /// Gets or Sets SegmentLength
        /// </summary>
        [DataMember(Name="SegmentLength", EmitDefaultValue=false)]
        public int? SegmentLength { get; set; }

        /// <summary>
        /// Gets or Sets BreakOnNonKeyFrames
        /// </summary>
        [DataMember(Name="BreakOnNonKeyFrames", EmitDefaultValue=false)]
        public bool? BreakOnNonKeyFrames { get; set; }

        /// <summary>
        /// Gets or Sets AllowInterlacedVideoStreamCopy
        /// </summary>
        [DataMember(Name="AllowInterlacedVideoStreamCopy", EmitDefaultValue=false)]
        public bool? AllowInterlacedVideoStreamCopy { get; set; }

        /// <summary>
        /// Gets or Sets ManifestSubtitles
        /// </summary>
        [DataMember(Name="ManifestSubtitles", EmitDefaultValue=false)]
        public string ManifestSubtitles { get; set; }

        /// <summary>
        /// Gets or Sets MaxManifestSubtitles
        /// </summary>
        [DataMember(Name="MaxManifestSubtitles", EmitDefaultValue=false)]
        public int? MaxManifestSubtitles { get; set; }

        /// <summary>
        /// Gets or Sets MaxWidth
        /// </summary>
        [DataMember(Name="MaxWidth", EmitDefaultValue=false)]
        public int? MaxWidth { get; set; }

        /// <summary>
        /// Gets or Sets MaxHeight
        /// </summary>
        [DataMember(Name="MaxHeight", EmitDefaultValue=false)]
        public int? MaxHeight { get; set; }

        /// <summary>
        /// Gets or Sets FillEmptySubtitleSegments
        /// </summary>
        [DataMember(Name="FillEmptySubtitleSegments", EmitDefaultValue=false)]
        public bool? FillEmptySubtitleSegments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TranscodingProfile {\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  EstimateContentLength: ").Append(EstimateContentLength).Append("\n");
            sb.Append("  EnableMpegtsM2TsMode: ").Append(EnableMpegtsM2TsMode).Append("\n");
            sb.Append("  TranscodeSeekInfo: ").Append(TranscodeSeekInfo).Append("\n");
            sb.Append("  CopyTimestamps: ").Append(CopyTimestamps).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  MaxAudioChannels: ").Append(MaxAudioChannels).Append("\n");
            sb.Append("  MinSegments: ").Append(MinSegments).Append("\n");
            sb.Append("  SegmentLength: ").Append(SegmentLength).Append("\n");
            sb.Append("  BreakOnNonKeyFrames: ").Append(BreakOnNonKeyFrames).Append("\n");
            sb.Append("  AllowInterlacedVideoStreamCopy: ").Append(AllowInterlacedVideoStreamCopy).Append("\n");
            sb.Append("  ManifestSubtitles: ").Append(ManifestSubtitles).Append("\n");
            sb.Append("  MaxManifestSubtitles: ").Append(MaxManifestSubtitles).Append("\n");
            sb.Append("  MaxWidth: ").Append(MaxWidth).Append("\n");
            sb.Append("  MaxHeight: ").Append(MaxHeight).Append("\n");
            sb.Append("  FillEmptySubtitleSegments: ").Append(FillEmptySubtitleSegments).Append("\n");
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
            return this.Equals(input as TranscodingProfile);
        }

        /// <summary>
        /// Returns true if TranscodingProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of TranscodingProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TranscodingProfile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.VideoCodec == input.VideoCodec ||
                    (this.VideoCodec != null &&
                    this.VideoCodec.Equals(input.VideoCodec))
                ) && 
                (
                    this.AudioCodec == input.AudioCodec ||
                    (this.AudioCodec != null &&
                    this.AudioCodec.Equals(input.AudioCodec))
                ) && 
                (
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
                ) && 
                (
                    this.EstimateContentLength == input.EstimateContentLength ||
                    (this.EstimateContentLength != null &&
                    this.EstimateContentLength.Equals(input.EstimateContentLength))
                ) && 
                (
                    this.EnableMpegtsM2TsMode == input.EnableMpegtsM2TsMode ||
                    (this.EnableMpegtsM2TsMode != null &&
                    this.EnableMpegtsM2TsMode.Equals(input.EnableMpegtsM2TsMode))
                ) && 
                (
                    this.TranscodeSeekInfo == input.TranscodeSeekInfo ||
                    (this.TranscodeSeekInfo != null &&
                    this.TranscodeSeekInfo.Equals(input.TranscodeSeekInfo))
                ) && 
                (
                    this.CopyTimestamps == input.CopyTimestamps ||
                    (this.CopyTimestamps != null &&
                    this.CopyTimestamps.Equals(input.CopyTimestamps))
                ) && 
                (
                    this.Context == input.Context ||
                    (this.Context != null &&
                    this.Context.Equals(input.Context))
                ) && 
                (
                    this.MaxAudioChannels == input.MaxAudioChannels ||
                    (this.MaxAudioChannels != null &&
                    this.MaxAudioChannels.Equals(input.MaxAudioChannels))
                ) && 
                (
                    this.MinSegments == input.MinSegments ||
                    (this.MinSegments != null &&
                    this.MinSegments.Equals(input.MinSegments))
                ) && 
                (
                    this.SegmentLength == input.SegmentLength ||
                    (this.SegmentLength != null &&
                    this.SegmentLength.Equals(input.SegmentLength))
                ) && 
                (
                    this.BreakOnNonKeyFrames == input.BreakOnNonKeyFrames ||
                    (this.BreakOnNonKeyFrames != null &&
                    this.BreakOnNonKeyFrames.Equals(input.BreakOnNonKeyFrames))
                ) && 
                (
                    this.AllowInterlacedVideoStreamCopy == input.AllowInterlacedVideoStreamCopy ||
                    (this.AllowInterlacedVideoStreamCopy != null &&
                    this.AllowInterlacedVideoStreamCopy.Equals(input.AllowInterlacedVideoStreamCopy))
                ) && 
                (
                    this.ManifestSubtitles == input.ManifestSubtitles ||
                    (this.ManifestSubtitles != null &&
                    this.ManifestSubtitles.Equals(input.ManifestSubtitles))
                ) && 
                (
                    this.MaxManifestSubtitles == input.MaxManifestSubtitles ||
                    (this.MaxManifestSubtitles != null &&
                    this.MaxManifestSubtitles.Equals(input.MaxManifestSubtitles))
                ) && 
                (
                    this.MaxWidth == input.MaxWidth ||
                    (this.MaxWidth != null &&
                    this.MaxWidth.Equals(input.MaxWidth))
                ) && 
                (
                    this.MaxHeight == input.MaxHeight ||
                    (this.MaxHeight != null &&
                    this.MaxHeight.Equals(input.MaxHeight))
                ) && 
                (
                    this.FillEmptySubtitleSegments == input.FillEmptySubtitleSegments ||
                    (this.FillEmptySubtitleSegments != null &&
                    this.FillEmptySubtitleSegments.Equals(input.FillEmptySubtitleSegments))
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
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                if (this.EstimateContentLength != null)
                    hashCode = hashCode * 59 + this.EstimateContentLength.GetHashCode();
                if (this.EnableMpegtsM2TsMode != null)
                    hashCode = hashCode * 59 + this.EnableMpegtsM2TsMode.GetHashCode();
                if (this.TranscodeSeekInfo != null)
                    hashCode = hashCode * 59 + this.TranscodeSeekInfo.GetHashCode();
                if (this.CopyTimestamps != null)
                    hashCode = hashCode * 59 + this.CopyTimestamps.GetHashCode();
                if (this.Context != null)
                    hashCode = hashCode * 59 + this.Context.GetHashCode();
                if (this.MaxAudioChannels != null)
                    hashCode = hashCode * 59 + this.MaxAudioChannels.GetHashCode();
                if (this.MinSegments != null)
                    hashCode = hashCode * 59 + this.MinSegments.GetHashCode();
                if (this.SegmentLength != null)
                    hashCode = hashCode * 59 + this.SegmentLength.GetHashCode();
                if (this.BreakOnNonKeyFrames != null)
                    hashCode = hashCode * 59 + this.BreakOnNonKeyFrames.GetHashCode();
                if (this.AllowInterlacedVideoStreamCopy != null)
                    hashCode = hashCode * 59 + this.AllowInterlacedVideoStreamCopy.GetHashCode();
                if (this.ManifestSubtitles != null)
                    hashCode = hashCode * 59 + this.ManifestSubtitles.GetHashCode();
                if (this.MaxManifestSubtitles != null)
                    hashCode = hashCode * 59 + this.MaxManifestSubtitles.GetHashCode();
                if (this.MaxWidth != null)
                    hashCode = hashCode * 59 + this.MaxWidth.GetHashCode();
                if (this.MaxHeight != null)
                    hashCode = hashCode * 59 + this.MaxHeight.GetHashCode();
                if (this.FillEmptySubtitleSegments != null)
                    hashCode = hashCode * 59 + this.FillEmptySubtitleSegments.GetHashCode();
                return hashCode;
            }
        }

    }
}
