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
    /// Class PlaybackStartInfo.  
    /// </summary>
    [DataContract]
        public partial class PlaybackStartInfo :  IEquatable<PlaybackStartInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaybackStartInfo" /> class.
        /// </summary>
        /// <param name="canSeek">A value indicating whether this instance can seek..</param>
        /// <param name="item">item.</param>
        /// <param name="nowPlayingQueue">nowPlayingQueue.</param>
        /// <param name="playlistItemId">playlistItemId.</param>
        /// <param name="itemId">The item identifier..</param>
        /// <param name="sessionId">The session id..</param>
        /// <param name="mediaSourceId">The media version identifier..</param>
        /// <param name="audioStreamIndex">The index of the audio stream..</param>
        /// <param name="subtitleStreamIndex">The index of the subtitle stream..</param>
        /// <param name="isPaused">A value indicating whether this instance is paused..</param>
        /// <param name="playlistIndex">playlistIndex.</param>
        /// <param name="playlistLength">playlistLength.</param>
        /// <param name="isMuted">A value indicating whether this instance is muted..</param>
        /// <param name="positionTicks">The position ticks..</param>
        /// <param name="runTimeTicks">runTimeTicks.</param>
        /// <param name="playbackStartTimeTicks">playbackStartTimeTicks.</param>
        /// <param name="volumeLevel">The volume level..</param>
        /// <param name="brightness">brightness.</param>
        /// <param name="aspectRatio">aspectRatio.</param>
        /// <param name="eventName">eventName.</param>
        /// <param name="playMethod">playMethod.</param>
        /// <param name="liveStreamId">The live stream identifier..</param>
        /// <param name="playSessionId">The play session identifier..</param>
        /// <param name="repeatMode">repeatMode.</param>
        /// <param name="subtitleOffset">subtitleOffset.</param>
        /// <param name="playbackRate">playbackRate.</param>
        /// <param name="playlistItemIds">playlistItemIds.</param>
        public PlaybackStartInfo(bool? canSeek = default(bool?), BaseItemDto item = default(BaseItemDto), List<QueueItem> nowPlayingQueue = default(List<QueueItem>), string playlistItemId = default(string), string itemId = default(string), string sessionId = default(string), string mediaSourceId = default(string), int? audioStreamIndex = default(int?), int? subtitleStreamIndex = default(int?), bool? isPaused = default(bool?), int? playlistIndex = default(int?), int? playlistLength = default(int?), bool? isMuted = default(bool?), long? positionTicks = default(long?), long? runTimeTicks = default(long?), long? playbackStartTimeTicks = default(long?), int? volumeLevel = default(int?), int? brightness = default(int?), string aspectRatio = default(string), ProgressEvent eventName = default(ProgressEvent), PlayMethod playMethod = default(PlayMethod), string liveStreamId = default(string), string playSessionId = default(string), RepeatMode repeatMode = default(RepeatMode), int? subtitleOffset = default(int?), double? playbackRate = default(double?), List<string> playlistItemIds = default(List<string>))
        {
            this.CanSeek = canSeek;
            this.Item = item;
            this.NowPlayingQueue = nowPlayingQueue;
            this.PlaylistItemId = playlistItemId;
            this.ItemId = itemId;
            this.SessionId = sessionId;
            this.MediaSourceId = mediaSourceId;
            this.AudioStreamIndex = audioStreamIndex;
            this.SubtitleStreamIndex = subtitleStreamIndex;
            this.IsPaused = isPaused;
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
            this.IsMuted = isMuted;
            this.PositionTicks = positionTicks;
            this.RunTimeTicks = runTimeTicks;
            this.PlaybackStartTimeTicks = playbackStartTimeTicks;
            this.VolumeLevel = volumeLevel;
            this.Brightness = brightness;
            this.AspectRatio = aspectRatio;
            this.EventName = eventName;
            this.PlayMethod = playMethod;
            this.LiveStreamId = liveStreamId;
            this.PlaySessionId = playSessionId;
            this.RepeatMode = repeatMode;
            this.SubtitleOffset = subtitleOffset;
            this.PlaybackRate = playbackRate;
            this.PlaylistItemIds = playlistItemIds;
        }
        
        /// <summary>
        /// A value indicating whether this instance can seek.
        /// </summary>
        /// <value>A value indicating whether this instance can seek.</value>
        [DataMember(Name="CanSeek", EmitDefaultValue=false)]
        public bool? CanSeek { get; set; }

        /// <summary>
        /// Gets or Sets Item
        /// </summary>
        [DataMember(Name="Item", EmitDefaultValue=false)]
        public BaseItemDto Item { get; set; }

        /// <summary>
        /// Gets or Sets NowPlayingQueue
        /// </summary>
        [DataMember(Name="NowPlayingQueue", EmitDefaultValue=false)]
        public List<QueueItem> NowPlayingQueue { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistItemId
        /// </summary>
        [DataMember(Name="PlaylistItemId", EmitDefaultValue=false)]
        public string PlaylistItemId { get; set; }

        /// <summary>
        /// The item identifier.
        /// </summary>
        /// <value>The item identifier.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// The session id.
        /// </summary>
        /// <value>The session id.</value>
        [DataMember(Name="SessionId", EmitDefaultValue=false)]
        public string SessionId { get; set; }

        /// <summary>
        /// The media version identifier.
        /// </summary>
        /// <value>The media version identifier.</value>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// The index of the audio stream.
        /// </summary>
        /// <value>The index of the audio stream.</value>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=false)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// The index of the subtitle stream.
        /// </summary>
        /// <value>The index of the subtitle stream.</value>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=false)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// A value indicating whether this instance is paused.
        /// </summary>
        /// <value>A value indicating whether this instance is paused.</value>
        [DataMember(Name="IsPaused", EmitDefaultValue=false)]
        public bool? IsPaused { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistIndex
        /// </summary>
        [DataMember(Name="PlaylistIndex", EmitDefaultValue=false)]
        public int? PlaylistIndex { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistLength
        /// </summary>
        [DataMember(Name="PlaylistLength", EmitDefaultValue=false)]
        public int? PlaylistLength { get; set; }

        /// <summary>
        /// A value indicating whether this instance is muted.
        /// </summary>
        /// <value>A value indicating whether this instance is muted.</value>
        [DataMember(Name="IsMuted", EmitDefaultValue=false)]
        public bool? IsMuted { get; set; }

        /// <summary>
        /// The position ticks.
        /// </summary>
        /// <value>The position ticks.</value>
        [DataMember(Name="PositionTicks", EmitDefaultValue=false)]
        public long? PositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets RunTimeTicks
        /// </summary>
        [DataMember(Name="RunTimeTicks", EmitDefaultValue=false)]
        public long? RunTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets PlaybackStartTimeTicks
        /// </summary>
        [DataMember(Name="PlaybackStartTimeTicks", EmitDefaultValue=false)]
        public long? PlaybackStartTimeTicks { get; set; }

        /// <summary>
        /// The volume level.
        /// </summary>
        /// <value>The volume level.</value>
        [DataMember(Name="VolumeLevel", EmitDefaultValue=false)]
        public int? VolumeLevel { get; set; }

        /// <summary>
        /// Gets or Sets Brightness
        /// </summary>
        [DataMember(Name="Brightness", EmitDefaultValue=false)]
        public int? Brightness { get; set; }

        /// <summary>
        /// Gets or Sets AspectRatio
        /// </summary>
        [DataMember(Name="AspectRatio", EmitDefaultValue=false)]
        public string AspectRatio { get; set; }

        /// <summary>
        /// Gets or Sets EventName
        /// </summary>
        [DataMember(Name="EventName", EmitDefaultValue=false)]
        public ProgressEvent EventName { get; set; }

        /// <summary>
        /// Gets or Sets PlayMethod
        /// </summary>
        [DataMember(Name="PlayMethod", EmitDefaultValue=false)]
        public PlayMethod PlayMethod { get; set; }

        /// <summary>
        /// The live stream identifier.
        /// </summary>
        /// <value>The live stream identifier.</value>
        [DataMember(Name="LiveStreamId", EmitDefaultValue=false)]
        public string LiveStreamId { get; set; }

        /// <summary>
        /// The play session identifier.
        /// </summary>
        /// <value>The play session identifier.</value>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=false)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// Gets or Sets RepeatMode
        /// </summary>
        [DataMember(Name="RepeatMode", EmitDefaultValue=false)]
        public RepeatMode RepeatMode { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleOffset
        /// </summary>
        [DataMember(Name="SubtitleOffset", EmitDefaultValue=false)]
        public int? SubtitleOffset { get; set; }

        /// <summary>
        /// Gets or Sets PlaybackRate
        /// </summary>
        [DataMember(Name="PlaybackRate", EmitDefaultValue=false)]
        public double? PlaybackRate { get; set; }

        /// <summary>
        /// Gets or Sets PlaylistItemIds
        /// </summary>
        [DataMember(Name="PlaylistItemIds", EmitDefaultValue=false)]
        public List<string> PlaylistItemIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaybackStartInfo {\n");
            sb.Append("  CanSeek: ").Append(CanSeek).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  NowPlayingQueue: ").Append(NowPlayingQueue).Append("\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  SessionId: ").Append(SessionId).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  IsPaused: ").Append(IsPaused).Append("\n");
            sb.Append("  PlaylistIndex: ").Append(PlaylistIndex).Append("\n");
            sb.Append("  PlaylistLength: ").Append(PlaylistLength).Append("\n");
            sb.Append("  IsMuted: ").Append(IsMuted).Append("\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
            sb.Append("  RunTimeTicks: ").Append(RunTimeTicks).Append("\n");
            sb.Append("  PlaybackStartTimeTicks: ").Append(PlaybackStartTimeTicks).Append("\n");
            sb.Append("  VolumeLevel: ").Append(VolumeLevel).Append("\n");
            sb.Append("  Brightness: ").Append(Brightness).Append("\n");
            sb.Append("  AspectRatio: ").Append(AspectRatio).Append("\n");
            sb.Append("  EventName: ").Append(EventName).Append("\n");
            sb.Append("  PlayMethod: ").Append(PlayMethod).Append("\n");
            sb.Append("  LiveStreamId: ").Append(LiveStreamId).Append("\n");
            sb.Append("  PlaySessionId: ").Append(PlaySessionId).Append("\n");
            sb.Append("  RepeatMode: ").Append(RepeatMode).Append("\n");
            sb.Append("  SubtitleOffset: ").Append(SubtitleOffset).Append("\n");
            sb.Append("  PlaybackRate: ").Append(PlaybackRate).Append("\n");
            sb.Append("  PlaylistItemIds: ").Append(PlaylistItemIds).Append("\n");
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
            return this.Equals(input as PlaybackStartInfo);
        }

        /// <summary>
        /// Returns true if PlaybackStartInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaybackStartInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaybackStartInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CanSeek == input.CanSeek ||
                    (this.CanSeek != null &&
                    this.CanSeek.Equals(input.CanSeek))
                ) && 
                (
                    this.Item == input.Item ||
                    (this.Item != null &&
                    this.Item.Equals(input.Item))
                ) && 
                (
                    this.NowPlayingQueue == input.NowPlayingQueue ||
                    this.NowPlayingQueue != null &&
                    input.NowPlayingQueue != null &&
                    this.NowPlayingQueue.SequenceEqual(input.NowPlayingQueue)
                ) && 
                (
                    this.PlaylistItemId == input.PlaylistItemId ||
                    (this.PlaylistItemId != null &&
                    this.PlaylistItemId.Equals(input.PlaylistItemId))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.SessionId == input.SessionId ||
                    (this.SessionId != null &&
                    this.SessionId.Equals(input.SessionId))
                ) && 
                (
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.AudioStreamIndex == input.AudioStreamIndex ||
                    (this.AudioStreamIndex != null &&
                    this.AudioStreamIndex.Equals(input.AudioStreamIndex))
                ) && 
                (
                    this.SubtitleStreamIndex == input.SubtitleStreamIndex ||
                    (this.SubtitleStreamIndex != null &&
                    this.SubtitleStreamIndex.Equals(input.SubtitleStreamIndex))
                ) && 
                (
                    this.IsPaused == input.IsPaused ||
                    (this.IsPaused != null &&
                    this.IsPaused.Equals(input.IsPaused))
                ) && 
                (
                    this.PlaylistIndex == input.PlaylistIndex ||
                    (this.PlaylistIndex != null &&
                    this.PlaylistIndex.Equals(input.PlaylistIndex))
                ) && 
                (
                    this.PlaylistLength == input.PlaylistLength ||
                    (this.PlaylistLength != null &&
                    this.PlaylistLength.Equals(input.PlaylistLength))
                ) && 
                (
                    this.IsMuted == input.IsMuted ||
                    (this.IsMuted != null &&
                    this.IsMuted.Equals(input.IsMuted))
                ) && 
                (
                    this.PositionTicks == input.PositionTicks ||
                    (this.PositionTicks != null &&
                    this.PositionTicks.Equals(input.PositionTicks))
                ) && 
                (
                    this.RunTimeTicks == input.RunTimeTicks ||
                    (this.RunTimeTicks != null &&
                    this.RunTimeTicks.Equals(input.RunTimeTicks))
                ) && 
                (
                    this.PlaybackStartTimeTicks == input.PlaybackStartTimeTicks ||
                    (this.PlaybackStartTimeTicks != null &&
                    this.PlaybackStartTimeTicks.Equals(input.PlaybackStartTimeTicks))
                ) && 
                (
                    this.VolumeLevel == input.VolumeLevel ||
                    (this.VolumeLevel != null &&
                    this.VolumeLevel.Equals(input.VolumeLevel))
                ) && 
                (
                    this.Brightness == input.Brightness ||
                    (this.Brightness != null &&
                    this.Brightness.Equals(input.Brightness))
                ) && 
                (
                    this.AspectRatio == input.AspectRatio ||
                    (this.AspectRatio != null &&
                    this.AspectRatio.Equals(input.AspectRatio))
                ) && 
                (
                    this.EventName == input.EventName ||
                    (this.EventName != null &&
                    this.EventName.Equals(input.EventName))
                ) && 
                (
                    this.PlayMethod == input.PlayMethod ||
                    (this.PlayMethod != null &&
                    this.PlayMethod.Equals(input.PlayMethod))
                ) && 
                (
                    this.LiveStreamId == input.LiveStreamId ||
                    (this.LiveStreamId != null &&
                    this.LiveStreamId.Equals(input.LiveStreamId))
                ) && 
                (
                    this.PlaySessionId == input.PlaySessionId ||
                    (this.PlaySessionId != null &&
                    this.PlaySessionId.Equals(input.PlaySessionId))
                ) && 
                (
                    this.RepeatMode == input.RepeatMode ||
                    (this.RepeatMode != null &&
                    this.RepeatMode.Equals(input.RepeatMode))
                ) && 
                (
                    this.SubtitleOffset == input.SubtitleOffset ||
                    (this.SubtitleOffset != null &&
                    this.SubtitleOffset.Equals(input.SubtitleOffset))
                ) && 
                (
                    this.PlaybackRate == input.PlaybackRate ||
                    (this.PlaybackRate != null &&
                    this.PlaybackRate.Equals(input.PlaybackRate))
                ) && 
                (
                    this.PlaylistItemIds == input.PlaylistItemIds ||
                    this.PlaylistItemIds != null &&
                    input.PlaylistItemIds != null &&
                    this.PlaylistItemIds.SequenceEqual(input.PlaylistItemIds)
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
                if (this.CanSeek != null)
                    hashCode = hashCode * 59 + this.CanSeek.GetHashCode();
                if (this.Item != null)
                    hashCode = hashCode * 59 + this.Item.GetHashCode();
                if (this.NowPlayingQueue != null)
                    hashCode = hashCode * 59 + this.NowPlayingQueue.GetHashCode();
                if (this.PlaylistItemId != null)
                    hashCode = hashCode * 59 + this.PlaylistItemId.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.SessionId != null)
                    hashCode = hashCode * 59 + this.SessionId.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.AudioStreamIndex != null)
                    hashCode = hashCode * 59 + this.AudioStreamIndex.GetHashCode();
                if (this.SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + this.SubtitleStreamIndex.GetHashCode();
                if (this.IsPaused != null)
                    hashCode = hashCode * 59 + this.IsPaused.GetHashCode();
                if (this.PlaylistIndex != null)
                    hashCode = hashCode * 59 + this.PlaylistIndex.GetHashCode();
                if (this.PlaylistLength != null)
                    hashCode = hashCode * 59 + this.PlaylistLength.GetHashCode();
                if (this.IsMuted != null)
                    hashCode = hashCode * 59 + this.IsMuted.GetHashCode();
                if (this.PositionTicks != null)
                    hashCode = hashCode * 59 + this.PositionTicks.GetHashCode();
                if (this.RunTimeTicks != null)
                    hashCode = hashCode * 59 + this.RunTimeTicks.GetHashCode();
                if (this.PlaybackStartTimeTicks != null)
                    hashCode = hashCode * 59 + this.PlaybackStartTimeTicks.GetHashCode();
                if (this.VolumeLevel != null)
                    hashCode = hashCode * 59 + this.VolumeLevel.GetHashCode();
                if (this.Brightness != null)
                    hashCode = hashCode * 59 + this.Brightness.GetHashCode();
                if (this.AspectRatio != null)
                    hashCode = hashCode * 59 + this.AspectRatio.GetHashCode();
                if (this.EventName != null)
                    hashCode = hashCode * 59 + this.EventName.GetHashCode();
                if (this.PlayMethod != null)
                    hashCode = hashCode * 59 + this.PlayMethod.GetHashCode();
                if (this.LiveStreamId != null)
                    hashCode = hashCode * 59 + this.LiveStreamId.GetHashCode();
                if (this.PlaySessionId != null)
                    hashCode = hashCode * 59 + this.PlaySessionId.GetHashCode();
                if (this.RepeatMode != null)
                    hashCode = hashCode * 59 + this.RepeatMode.GetHashCode();
                if (this.SubtitleOffset != null)
                    hashCode = hashCode * 59 + this.SubtitleOffset.GetHashCode();
                if (this.PlaybackRate != null)
                    hashCode = hashCode * 59 + this.PlaybackRate.GetHashCode();
                if (this.PlaylistItemIds != null)
                    hashCode = hashCode * 59 + this.PlaylistItemIds.GetHashCode();
                return hashCode;
            }
        }

    }
}
