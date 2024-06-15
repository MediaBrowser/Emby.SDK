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
    /// MediaSourceInfo
    /// </summary>
    [DataContract]
        public partial class MediaSourceInfo :  IEquatable<MediaSourceInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaSourceInfo" /> class.
        /// </summary>
        /// <param name="chapters">chapters.</param>
        /// <param name="protocol">protocol.</param>
        /// <param name="id">id.</param>
        /// <param name="path">path.</param>
        /// <param name="encoderPath">encoderPath.</param>
        /// <param name="encoderProtocol">encoderProtocol.</param>
        /// <param name="type">type.</param>
        /// <param name="probePath">probePath.</param>
        /// <param name="probeProtocol">probeProtocol.</param>
        /// <param name="container">container.</param>
        /// <param name="size">size.</param>
        /// <param name="name">name.</param>
        /// <param name="sortName">sortName.</param>
        /// <param name="isRemote">Differentiate internet url vs local network.</param>
        /// <param name="hasMixedProtocols">hasMixedProtocols.</param>
        /// <param name="runTimeTicks">runTimeTicks.</param>
        /// <param name="containerStartTimeTicks">containerStartTimeTicks.</param>
        /// <param name="supportsTranscoding">supportsTranscoding.</param>
        /// <param name="trancodeLiveStartIndex">trancodeLiveStartIndex.</param>
        /// <param name="wallClockStart">wallClockStart.</param>
        /// <param name="supportsDirectStream">supportsDirectStream.</param>
        /// <param name="supportsDirectPlay">supportsDirectPlay.</param>
        /// <param name="isInfiniteStream">isInfiniteStream.</param>
        /// <param name="requiresOpening">requiresOpening.</param>
        /// <param name="openToken">openToken.</param>
        /// <param name="requiresClosing">requiresClosing.</param>
        /// <param name="liveStreamId">liveStreamId.</param>
        /// <param name="bufferMs">bufferMs.</param>
        /// <param name="requiresLooping">requiresLooping.</param>
        /// <param name="supportsProbing">supportsProbing.</param>
        /// <param name="video3DFormat">video3DFormat.</param>
        /// <param name="mediaStreams">mediaStreams.</param>
        /// <param name="formats">formats.</param>
        /// <param name="bitrate">bitrate.</param>
        /// <param name="timestamp">timestamp.</param>
        /// <param name="requiredHttpHeaders">requiredHttpHeaders.</param>
        /// <param name="directStreamUrl">directStreamUrl.</param>
        /// <param name="addApiKeyToDirectStreamUrl">addApiKeyToDirectStreamUrl.</param>
        /// <param name="transcodingUrl">transcodingUrl.</param>
        /// <param name="transcodingSubProtocol">transcodingSubProtocol.</param>
        /// <param name="transcodingContainer">transcodingContainer.</param>
        /// <param name="analyzeDurationMs">analyzeDurationMs.</param>
        /// <param name="readAtNativeFramerate">readAtNativeFramerate.</param>
        /// <param name="defaultAudioStreamIndex">defaultAudioStreamIndex.</param>
        /// <param name="defaultSubtitleStreamIndex">defaultSubtitleStreamIndex.</param>
        /// <param name="itemId">Used only by our Windows app. Not used by Emby Server. The id of the item that this mediasource belongs to, if there is one Also used by Emby for Kodi.</param>
        /// <param name="serverId">Used only by our Windows app. Not used by Emby Server..</param>
        public MediaSourceInfo(List<ChapterInfo> chapters = default(List<ChapterInfo>), MediaProtocol protocol = default(MediaProtocol), string id = default(string), string path = default(string), string encoderPath = default(string), MediaProtocol encoderProtocol = default(MediaProtocol), MediaSourceType type = default(MediaSourceType), string probePath = default(string), MediaProtocol probeProtocol = default(MediaProtocol), string container = default(string), long? size = default(long?), string name = default(string), string sortName = default(string), bool? isRemote = default(bool?), bool? hasMixedProtocols = default(bool?), long? runTimeTicks = default(long?), long? containerStartTimeTicks = default(long?), bool? supportsTranscoding = default(bool?), int? trancodeLiveStartIndex = default(int?), DateTimeOffset? wallClockStart = default(DateTimeOffset?), bool? supportsDirectStream = default(bool?), bool? supportsDirectPlay = default(bool?), bool? isInfiniteStream = default(bool?), bool? requiresOpening = default(bool?), string openToken = default(string), bool? requiresClosing = default(bool?), string liveStreamId = default(string), int? bufferMs = default(int?), bool? requiresLooping = default(bool?), bool? supportsProbing = default(bool?), Video3DFormat video3DFormat = default(Video3DFormat), List<MediaStream> mediaStreams = default(List<MediaStream>), List<string> formats = default(List<string>), int? bitrate = default(int?), TransportStreamTimestamp timestamp = default(TransportStreamTimestamp), Dictionary<string, string> requiredHttpHeaders = default(Dictionary<string, string>), string directStreamUrl = default(string), bool? addApiKeyToDirectStreamUrl = default(bool?), string transcodingUrl = default(string), string transcodingSubProtocol = default(string), string transcodingContainer = default(string), int? analyzeDurationMs = default(int?), bool? readAtNativeFramerate = default(bool?), int? defaultAudioStreamIndex = default(int?), int? defaultSubtitleStreamIndex = default(int?), string itemId = default(string), string serverId = default(string))
        {
            this.Chapters = chapters;
            this.Protocol = protocol;
            this.Id = id;
            this.Path = path;
            this.EncoderPath = encoderPath;
            this.EncoderProtocol = encoderProtocol;
            this.Type = type;
            this.ProbePath = probePath;
            this.ProbeProtocol = probeProtocol;
            this.Container = container;
            this.Size = size;
            this.Name = name;
            this.SortName = sortName;
            this.IsRemote = isRemote;
            this.HasMixedProtocols = hasMixedProtocols;
            this.RunTimeTicks = runTimeTicks;
            this.ContainerStartTimeTicks = containerStartTimeTicks;
            this.SupportsTranscoding = supportsTranscoding;
            this.TrancodeLiveStartIndex = trancodeLiveStartIndex;
            this.WallClockStart = wallClockStart;
            this.SupportsDirectStream = supportsDirectStream;
            this.SupportsDirectPlay = supportsDirectPlay;
            this.IsInfiniteStream = isInfiniteStream;
            this.RequiresOpening = requiresOpening;
            this.OpenToken = openToken;
            this.RequiresClosing = requiresClosing;
            this.LiveStreamId = liveStreamId;
            this.BufferMs = bufferMs;
            this.RequiresLooping = requiresLooping;
            this.SupportsProbing = supportsProbing;
            this.Video3DFormat = video3DFormat;
            this.MediaStreams = mediaStreams;
            this.Formats = formats;
            this.Bitrate = bitrate;
            this.Timestamp = timestamp;
            this.RequiredHttpHeaders = requiredHttpHeaders;
            this.DirectStreamUrl = directStreamUrl;
            this.AddApiKeyToDirectStreamUrl = addApiKeyToDirectStreamUrl;
            this.TranscodingUrl = transcodingUrl;
            this.TranscodingSubProtocol = transcodingSubProtocol;
            this.TranscodingContainer = transcodingContainer;
            this.AnalyzeDurationMs = analyzeDurationMs;
            this.ReadAtNativeFramerate = readAtNativeFramerate;
            this.DefaultAudioStreamIndex = defaultAudioStreamIndex;
            this.DefaultSubtitleStreamIndex = defaultSubtitleStreamIndex;
            this.ItemId = itemId;
            this.ServerId = serverId;
        }
        
        /// <summary>
        /// Gets or Sets Chapters
        /// </summary>
        [DataMember(Name="Chapters", EmitDefaultValue=false)]
        public List<ChapterInfo> Chapters { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public MediaProtocol Protocol { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets EncoderPath
        /// </summary>
        [DataMember(Name="EncoderPath", EmitDefaultValue=false)]
        public string EncoderPath { get; set; }

        /// <summary>
        /// Gets or Sets EncoderProtocol
        /// </summary>
        [DataMember(Name="EncoderProtocol", EmitDefaultValue=false)]
        public MediaProtocol EncoderProtocol { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public MediaSourceType Type { get; set; }

        /// <summary>
        /// Gets or Sets ProbePath
        /// </summary>
        [DataMember(Name="ProbePath", EmitDefaultValue=false)]
        public string ProbePath { get; set; }

        /// <summary>
        /// Gets or Sets ProbeProtocol
        /// </summary>
        [DataMember(Name="ProbeProtocol", EmitDefaultValue=false)]
        public MediaProtocol ProbeProtocol { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name="Size", EmitDefaultValue=false)]
        public long? Size { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SortName
        /// </summary>
        [DataMember(Name="SortName", EmitDefaultValue=false)]
        public string SortName { get; set; }

        /// <summary>
        /// Differentiate internet url vs local network
        /// </summary>
        /// <value>Differentiate internet url vs local network</value>
        [DataMember(Name="IsRemote", EmitDefaultValue=false)]
        public bool? IsRemote { get; set; }

        /// <summary>
        /// Gets or Sets HasMixedProtocols
        /// </summary>
        [DataMember(Name="HasMixedProtocols", EmitDefaultValue=false)]
        public bool? HasMixedProtocols { get; set; }

        /// <summary>
        /// Gets or Sets RunTimeTicks
        /// </summary>
        [DataMember(Name="RunTimeTicks", EmitDefaultValue=false)]
        public long? RunTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets ContainerStartTimeTicks
        /// </summary>
        [DataMember(Name="ContainerStartTimeTicks", EmitDefaultValue=false)]
        public long? ContainerStartTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets SupportsTranscoding
        /// </summary>
        [DataMember(Name="SupportsTranscoding", EmitDefaultValue=false)]
        public bool? SupportsTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets TrancodeLiveStartIndex
        /// </summary>
        [DataMember(Name="TrancodeLiveStartIndex", EmitDefaultValue=false)]
        public int? TrancodeLiveStartIndex { get; set; }

        /// <summary>
        /// Gets or Sets WallClockStart
        /// </summary>
        [DataMember(Name="WallClockStart", EmitDefaultValue=false)]
        public DateTimeOffset? WallClockStart { get; set; }

        /// <summary>
        /// Gets or Sets SupportsDirectStream
        /// </summary>
        [DataMember(Name="SupportsDirectStream", EmitDefaultValue=false)]
        public bool? SupportsDirectStream { get; set; }

        /// <summary>
        /// Gets or Sets SupportsDirectPlay
        /// </summary>
        [DataMember(Name="SupportsDirectPlay", EmitDefaultValue=false)]
        public bool? SupportsDirectPlay { get; set; }

        /// <summary>
        /// Gets or Sets IsInfiniteStream
        /// </summary>
        [DataMember(Name="IsInfiniteStream", EmitDefaultValue=false)]
        public bool? IsInfiniteStream { get; set; }

        /// <summary>
        /// Gets or Sets RequiresOpening
        /// </summary>
        [DataMember(Name="RequiresOpening", EmitDefaultValue=false)]
        public bool? RequiresOpening { get; set; }

        /// <summary>
        /// Gets or Sets OpenToken
        /// </summary>
        [DataMember(Name="OpenToken", EmitDefaultValue=false)]
        public string OpenToken { get; set; }

        /// <summary>
        /// Gets or Sets RequiresClosing
        /// </summary>
        [DataMember(Name="RequiresClosing", EmitDefaultValue=false)]
        public bool? RequiresClosing { get; set; }

        /// <summary>
        /// Gets or Sets LiveStreamId
        /// </summary>
        [DataMember(Name="LiveStreamId", EmitDefaultValue=false)]
        public string LiveStreamId { get; set; }

        /// <summary>
        /// Gets or Sets BufferMs
        /// </summary>
        [DataMember(Name="BufferMs", EmitDefaultValue=false)]
        public int? BufferMs { get; set; }

        /// <summary>
        /// Gets or Sets RequiresLooping
        /// </summary>
        [DataMember(Name="RequiresLooping", EmitDefaultValue=false)]
        public bool? RequiresLooping { get; set; }

        /// <summary>
        /// Gets or Sets SupportsProbing
        /// </summary>
        [DataMember(Name="SupportsProbing", EmitDefaultValue=false)]
        public bool? SupportsProbing { get; set; }

        /// <summary>
        /// Gets or Sets Video3DFormat
        /// </summary>
        [DataMember(Name="Video3DFormat", EmitDefaultValue=false)]
        public Video3DFormat Video3DFormat { get; set; }

        /// <summary>
        /// Gets or Sets MediaStreams
        /// </summary>
        [DataMember(Name="MediaStreams", EmitDefaultValue=false)]
        public List<MediaStream> MediaStreams { get; set; }

        /// <summary>
        /// Gets or Sets Formats
        /// </summary>
        [DataMember(Name="Formats", EmitDefaultValue=false)]
        public List<string> Formats { get; set; }

        /// <summary>
        /// Gets or Sets Bitrate
        /// </summary>
        [DataMember(Name="Bitrate", EmitDefaultValue=false)]
        public int? Bitrate { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="Timestamp", EmitDefaultValue=false)]
        public TransportStreamTimestamp Timestamp { get; set; }

        /// <summary>
        /// Gets or Sets RequiredHttpHeaders
        /// </summary>
        [DataMember(Name="RequiredHttpHeaders", EmitDefaultValue=false)]
        public Dictionary<string, string> RequiredHttpHeaders { get; set; }

        /// <summary>
        /// Gets or Sets DirectStreamUrl
        /// </summary>
        [DataMember(Name="DirectStreamUrl", EmitDefaultValue=false)]
        public string DirectStreamUrl { get; set; }

        /// <summary>
        /// Gets or Sets AddApiKeyToDirectStreamUrl
        /// </summary>
        [DataMember(Name="AddApiKeyToDirectStreamUrl", EmitDefaultValue=false)]
        public bool? AddApiKeyToDirectStreamUrl { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingUrl
        /// </summary>
        [DataMember(Name="TranscodingUrl", EmitDefaultValue=false)]
        public string TranscodingUrl { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingSubProtocol
        /// </summary>
        [DataMember(Name="TranscodingSubProtocol", EmitDefaultValue=false)]
        public string TranscodingSubProtocol { get; set; }

        /// <summary>
        /// Gets or Sets TranscodingContainer
        /// </summary>
        [DataMember(Name="TranscodingContainer", EmitDefaultValue=false)]
        public string TranscodingContainer { get; set; }

        /// <summary>
        /// Gets or Sets AnalyzeDurationMs
        /// </summary>
        [DataMember(Name="AnalyzeDurationMs", EmitDefaultValue=false)]
        public int? AnalyzeDurationMs { get; set; }

        /// <summary>
        /// Gets or Sets ReadAtNativeFramerate
        /// </summary>
        [DataMember(Name="ReadAtNativeFramerate", EmitDefaultValue=false)]
        public bool? ReadAtNativeFramerate { get; set; }

        /// <summary>
        /// Gets or Sets DefaultAudioStreamIndex
        /// </summary>
        [DataMember(Name="DefaultAudioStreamIndex", EmitDefaultValue=false)]
        public int? DefaultAudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets DefaultSubtitleStreamIndex
        /// </summary>
        [DataMember(Name="DefaultSubtitleStreamIndex", EmitDefaultValue=false)]
        public int? DefaultSubtitleStreamIndex { get; set; }

        /// <summary>
        /// Used only by our Windows app. Not used by Emby Server. The id of the item that this mediasource belongs to, if there is one Also used by Emby for Kodi
        /// </summary>
        /// <value>Used only by our Windows app. Not used by Emby Server. The id of the item that this mediasource belongs to, if there is one Also used by Emby for Kodi</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Used only by our Windows app. Not used by Emby Server.
        /// </summary>
        /// <value>Used only by our Windows app. Not used by Emby Server.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaSourceInfo {\n");
            sb.Append("  Chapters: ").Append(Chapters).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  EncoderPath: ").Append(EncoderPath).Append("\n");
            sb.Append("  EncoderProtocol: ").Append(EncoderProtocol).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ProbePath: ").Append(ProbePath).Append("\n");
            sb.Append("  ProbeProtocol: ").Append(ProbeProtocol).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SortName: ").Append(SortName).Append("\n");
            sb.Append("  IsRemote: ").Append(IsRemote).Append("\n");
            sb.Append("  HasMixedProtocols: ").Append(HasMixedProtocols).Append("\n");
            sb.Append("  RunTimeTicks: ").Append(RunTimeTicks).Append("\n");
            sb.Append("  ContainerStartTimeTicks: ").Append(ContainerStartTimeTicks).Append("\n");
            sb.Append("  SupportsTranscoding: ").Append(SupportsTranscoding).Append("\n");
            sb.Append("  TrancodeLiveStartIndex: ").Append(TrancodeLiveStartIndex).Append("\n");
            sb.Append("  WallClockStart: ").Append(WallClockStart).Append("\n");
            sb.Append("  SupportsDirectStream: ").Append(SupportsDirectStream).Append("\n");
            sb.Append("  SupportsDirectPlay: ").Append(SupportsDirectPlay).Append("\n");
            sb.Append("  IsInfiniteStream: ").Append(IsInfiniteStream).Append("\n");
            sb.Append("  RequiresOpening: ").Append(RequiresOpening).Append("\n");
            sb.Append("  OpenToken: ").Append(OpenToken).Append("\n");
            sb.Append("  RequiresClosing: ").Append(RequiresClosing).Append("\n");
            sb.Append("  LiveStreamId: ").Append(LiveStreamId).Append("\n");
            sb.Append("  BufferMs: ").Append(BufferMs).Append("\n");
            sb.Append("  RequiresLooping: ").Append(RequiresLooping).Append("\n");
            sb.Append("  SupportsProbing: ").Append(SupportsProbing).Append("\n");
            sb.Append("  Video3DFormat: ").Append(Video3DFormat).Append("\n");
            sb.Append("  MediaStreams: ").Append(MediaStreams).Append("\n");
            sb.Append("  Formats: ").Append(Formats).Append("\n");
            sb.Append("  Bitrate: ").Append(Bitrate).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  RequiredHttpHeaders: ").Append(RequiredHttpHeaders).Append("\n");
            sb.Append("  DirectStreamUrl: ").Append(DirectStreamUrl).Append("\n");
            sb.Append("  AddApiKeyToDirectStreamUrl: ").Append(AddApiKeyToDirectStreamUrl).Append("\n");
            sb.Append("  TranscodingUrl: ").Append(TranscodingUrl).Append("\n");
            sb.Append("  TranscodingSubProtocol: ").Append(TranscodingSubProtocol).Append("\n");
            sb.Append("  TranscodingContainer: ").Append(TranscodingContainer).Append("\n");
            sb.Append("  AnalyzeDurationMs: ").Append(AnalyzeDurationMs).Append("\n");
            sb.Append("  ReadAtNativeFramerate: ").Append(ReadAtNativeFramerate).Append("\n");
            sb.Append("  DefaultAudioStreamIndex: ").Append(DefaultAudioStreamIndex).Append("\n");
            sb.Append("  DefaultSubtitleStreamIndex: ").Append(DefaultSubtitleStreamIndex).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
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
            return this.Equals(input as MediaSourceInfo);
        }

        /// <summary>
        /// Returns true if MediaSourceInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaSourceInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaSourceInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Chapters == input.Chapters ||
                    this.Chapters != null &&
                    input.Chapters != null &&
                    this.Chapters.SequenceEqual(input.Chapters)
                ) && 
                (
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.EncoderPath == input.EncoderPath ||
                    (this.EncoderPath != null &&
                    this.EncoderPath.Equals(input.EncoderPath))
                ) && 
                (
                    this.EncoderProtocol == input.EncoderProtocol ||
                    (this.EncoderProtocol != null &&
                    this.EncoderProtocol.Equals(input.EncoderProtocol))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.ProbePath == input.ProbePath ||
                    (this.ProbePath != null &&
                    this.ProbePath.Equals(input.ProbePath))
                ) && 
                (
                    this.ProbeProtocol == input.ProbeProtocol ||
                    (this.ProbeProtocol != null &&
                    this.ProbeProtocol.Equals(input.ProbeProtocol))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.SortName == input.SortName ||
                    (this.SortName != null &&
                    this.SortName.Equals(input.SortName))
                ) && 
                (
                    this.IsRemote == input.IsRemote ||
                    (this.IsRemote != null &&
                    this.IsRemote.Equals(input.IsRemote))
                ) && 
                (
                    this.HasMixedProtocols == input.HasMixedProtocols ||
                    (this.HasMixedProtocols != null &&
                    this.HasMixedProtocols.Equals(input.HasMixedProtocols))
                ) && 
                (
                    this.RunTimeTicks == input.RunTimeTicks ||
                    (this.RunTimeTicks != null &&
                    this.RunTimeTicks.Equals(input.RunTimeTicks))
                ) && 
                (
                    this.ContainerStartTimeTicks == input.ContainerStartTimeTicks ||
                    (this.ContainerStartTimeTicks != null &&
                    this.ContainerStartTimeTicks.Equals(input.ContainerStartTimeTicks))
                ) && 
                (
                    this.SupportsTranscoding == input.SupportsTranscoding ||
                    (this.SupportsTranscoding != null &&
                    this.SupportsTranscoding.Equals(input.SupportsTranscoding))
                ) && 
                (
                    this.TrancodeLiveStartIndex == input.TrancodeLiveStartIndex ||
                    (this.TrancodeLiveStartIndex != null &&
                    this.TrancodeLiveStartIndex.Equals(input.TrancodeLiveStartIndex))
                ) && 
                (
                    this.WallClockStart == input.WallClockStart ||
                    (this.WallClockStart != null &&
                    this.WallClockStart.Equals(input.WallClockStart))
                ) && 
                (
                    this.SupportsDirectStream == input.SupportsDirectStream ||
                    (this.SupportsDirectStream != null &&
                    this.SupportsDirectStream.Equals(input.SupportsDirectStream))
                ) && 
                (
                    this.SupportsDirectPlay == input.SupportsDirectPlay ||
                    (this.SupportsDirectPlay != null &&
                    this.SupportsDirectPlay.Equals(input.SupportsDirectPlay))
                ) && 
                (
                    this.IsInfiniteStream == input.IsInfiniteStream ||
                    (this.IsInfiniteStream != null &&
                    this.IsInfiniteStream.Equals(input.IsInfiniteStream))
                ) && 
                (
                    this.RequiresOpening == input.RequiresOpening ||
                    (this.RequiresOpening != null &&
                    this.RequiresOpening.Equals(input.RequiresOpening))
                ) && 
                (
                    this.OpenToken == input.OpenToken ||
                    (this.OpenToken != null &&
                    this.OpenToken.Equals(input.OpenToken))
                ) && 
                (
                    this.RequiresClosing == input.RequiresClosing ||
                    (this.RequiresClosing != null &&
                    this.RequiresClosing.Equals(input.RequiresClosing))
                ) && 
                (
                    this.LiveStreamId == input.LiveStreamId ||
                    (this.LiveStreamId != null &&
                    this.LiveStreamId.Equals(input.LiveStreamId))
                ) && 
                (
                    this.BufferMs == input.BufferMs ||
                    (this.BufferMs != null &&
                    this.BufferMs.Equals(input.BufferMs))
                ) && 
                (
                    this.RequiresLooping == input.RequiresLooping ||
                    (this.RequiresLooping != null &&
                    this.RequiresLooping.Equals(input.RequiresLooping))
                ) && 
                (
                    this.SupportsProbing == input.SupportsProbing ||
                    (this.SupportsProbing != null &&
                    this.SupportsProbing.Equals(input.SupportsProbing))
                ) && 
                (
                    this.Video3DFormat == input.Video3DFormat ||
                    (this.Video3DFormat != null &&
                    this.Video3DFormat.Equals(input.Video3DFormat))
                ) && 
                (
                    this.MediaStreams == input.MediaStreams ||
                    this.MediaStreams != null &&
                    input.MediaStreams != null &&
                    this.MediaStreams.SequenceEqual(input.MediaStreams)
                ) && 
                (
                    this.Formats == input.Formats ||
                    this.Formats != null &&
                    input.Formats != null &&
                    this.Formats.SequenceEqual(input.Formats)
                ) && 
                (
                    this.Bitrate == input.Bitrate ||
                    (this.Bitrate != null &&
                    this.Bitrate.Equals(input.Bitrate))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.RequiredHttpHeaders == input.RequiredHttpHeaders ||
                    this.RequiredHttpHeaders != null &&
                    input.RequiredHttpHeaders != null &&
                    this.RequiredHttpHeaders.SequenceEqual(input.RequiredHttpHeaders)
                ) && 
                (
                    this.DirectStreamUrl == input.DirectStreamUrl ||
                    (this.DirectStreamUrl != null &&
                    this.DirectStreamUrl.Equals(input.DirectStreamUrl))
                ) && 
                (
                    this.AddApiKeyToDirectStreamUrl == input.AddApiKeyToDirectStreamUrl ||
                    (this.AddApiKeyToDirectStreamUrl != null &&
                    this.AddApiKeyToDirectStreamUrl.Equals(input.AddApiKeyToDirectStreamUrl))
                ) && 
                (
                    this.TranscodingUrl == input.TranscodingUrl ||
                    (this.TranscodingUrl != null &&
                    this.TranscodingUrl.Equals(input.TranscodingUrl))
                ) && 
                (
                    this.TranscodingSubProtocol == input.TranscodingSubProtocol ||
                    (this.TranscodingSubProtocol != null &&
                    this.TranscodingSubProtocol.Equals(input.TranscodingSubProtocol))
                ) && 
                (
                    this.TranscodingContainer == input.TranscodingContainer ||
                    (this.TranscodingContainer != null &&
                    this.TranscodingContainer.Equals(input.TranscodingContainer))
                ) && 
                (
                    this.AnalyzeDurationMs == input.AnalyzeDurationMs ||
                    (this.AnalyzeDurationMs != null &&
                    this.AnalyzeDurationMs.Equals(input.AnalyzeDurationMs))
                ) && 
                (
                    this.ReadAtNativeFramerate == input.ReadAtNativeFramerate ||
                    (this.ReadAtNativeFramerate != null &&
                    this.ReadAtNativeFramerate.Equals(input.ReadAtNativeFramerate))
                ) && 
                (
                    this.DefaultAudioStreamIndex == input.DefaultAudioStreamIndex ||
                    (this.DefaultAudioStreamIndex != null &&
                    this.DefaultAudioStreamIndex.Equals(input.DefaultAudioStreamIndex))
                ) && 
                (
                    this.DefaultSubtitleStreamIndex == input.DefaultSubtitleStreamIndex ||
                    (this.DefaultSubtitleStreamIndex != null &&
                    this.DefaultSubtitleStreamIndex.Equals(input.DefaultSubtitleStreamIndex))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
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
                if (this.Chapters != null)
                    hashCode = hashCode * 59 + this.Chapters.GetHashCode();
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.EncoderPath != null)
                    hashCode = hashCode * 59 + this.EncoderPath.GetHashCode();
                if (this.EncoderProtocol != null)
                    hashCode = hashCode * 59 + this.EncoderProtocol.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.ProbePath != null)
                    hashCode = hashCode * 59 + this.ProbePath.GetHashCode();
                if (this.ProbeProtocol != null)
                    hashCode = hashCode * 59 + this.ProbeProtocol.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.Size != null)
                    hashCode = hashCode * 59 + this.Size.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.SortName != null)
                    hashCode = hashCode * 59 + this.SortName.GetHashCode();
                if (this.IsRemote != null)
                    hashCode = hashCode * 59 + this.IsRemote.GetHashCode();
                if (this.HasMixedProtocols != null)
                    hashCode = hashCode * 59 + this.HasMixedProtocols.GetHashCode();
                if (this.RunTimeTicks != null)
                    hashCode = hashCode * 59 + this.RunTimeTicks.GetHashCode();
                if (this.ContainerStartTimeTicks != null)
                    hashCode = hashCode * 59 + this.ContainerStartTimeTicks.GetHashCode();
                if (this.SupportsTranscoding != null)
                    hashCode = hashCode * 59 + this.SupportsTranscoding.GetHashCode();
                if (this.TrancodeLiveStartIndex != null)
                    hashCode = hashCode * 59 + this.TrancodeLiveStartIndex.GetHashCode();
                if (this.WallClockStart != null)
                    hashCode = hashCode * 59 + this.WallClockStart.GetHashCode();
                if (this.SupportsDirectStream != null)
                    hashCode = hashCode * 59 + this.SupportsDirectStream.GetHashCode();
                if (this.SupportsDirectPlay != null)
                    hashCode = hashCode * 59 + this.SupportsDirectPlay.GetHashCode();
                if (this.IsInfiniteStream != null)
                    hashCode = hashCode * 59 + this.IsInfiniteStream.GetHashCode();
                if (this.RequiresOpening != null)
                    hashCode = hashCode * 59 + this.RequiresOpening.GetHashCode();
                if (this.OpenToken != null)
                    hashCode = hashCode * 59 + this.OpenToken.GetHashCode();
                if (this.RequiresClosing != null)
                    hashCode = hashCode * 59 + this.RequiresClosing.GetHashCode();
                if (this.LiveStreamId != null)
                    hashCode = hashCode * 59 + this.LiveStreamId.GetHashCode();
                if (this.BufferMs != null)
                    hashCode = hashCode * 59 + this.BufferMs.GetHashCode();
                if (this.RequiresLooping != null)
                    hashCode = hashCode * 59 + this.RequiresLooping.GetHashCode();
                if (this.SupportsProbing != null)
                    hashCode = hashCode * 59 + this.SupportsProbing.GetHashCode();
                if (this.Video3DFormat != null)
                    hashCode = hashCode * 59 + this.Video3DFormat.GetHashCode();
                if (this.MediaStreams != null)
                    hashCode = hashCode * 59 + this.MediaStreams.GetHashCode();
                if (this.Formats != null)
                    hashCode = hashCode * 59 + this.Formats.GetHashCode();
                if (this.Bitrate != null)
                    hashCode = hashCode * 59 + this.Bitrate.GetHashCode();
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.RequiredHttpHeaders != null)
                    hashCode = hashCode * 59 + this.RequiredHttpHeaders.GetHashCode();
                if (this.DirectStreamUrl != null)
                    hashCode = hashCode * 59 + this.DirectStreamUrl.GetHashCode();
                if (this.AddApiKeyToDirectStreamUrl != null)
                    hashCode = hashCode * 59 + this.AddApiKeyToDirectStreamUrl.GetHashCode();
                if (this.TranscodingUrl != null)
                    hashCode = hashCode * 59 + this.TranscodingUrl.GetHashCode();
                if (this.TranscodingSubProtocol != null)
                    hashCode = hashCode * 59 + this.TranscodingSubProtocol.GetHashCode();
                if (this.TranscodingContainer != null)
                    hashCode = hashCode * 59 + this.TranscodingContainer.GetHashCode();
                if (this.AnalyzeDurationMs != null)
                    hashCode = hashCode * 59 + this.AnalyzeDurationMs.GetHashCode();
                if (this.ReadAtNativeFramerate != null)
                    hashCode = hashCode * 59 + this.ReadAtNativeFramerate.GetHashCode();
                if (this.DefaultAudioStreamIndex != null)
                    hashCode = hashCode * 59 + this.DefaultAudioStreamIndex.GetHashCode();
                if (this.DefaultSubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + this.DefaultSubtitleStreamIndex.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                return hashCode;
            }
        }

    }
}
