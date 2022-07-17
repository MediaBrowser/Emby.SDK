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
    /// PlaybackStopInfo
    /// </summary>
    [DataContract]
        public partial class PlaybackStopInfo :  IEquatable<PlaybackStopInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaybackStopInfo" /> class.
        /// </summary>
        /// <param name="nowPlayingQueue">nowPlayingQueue.</param>
        /// <param name="playlistItemId">playlistItemId.</param>
        /// <param name="playlistIndex">playlistIndex.</param>
        /// <param name="playlistLength">playlistLength.</param>
        /// <param name="item">item.</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="sessionId">sessionId.</param>
        /// <param name="mediaSourceId">mediaSourceId.</param>
        /// <param name="positionTicks">positionTicks.</param>
        /// <param name="liveStreamId">liveStreamId.</param>
        /// <param name="playSessionId">playSessionId.</param>
        /// <param name="failed">failed.</param>
        /// <param name="nextMediaType">nextMediaType.</param>
        public PlaybackStopInfo(List<QueueItem> nowPlayingQueue = default(List<QueueItem>), string playlistItemId = default(string), int? playlistIndex = default(int?), int? playlistLength = default(int?), BaseItemDto item = default(BaseItemDto), string itemId = default(string), string sessionId = default(string), string mediaSourceId = default(string), long? positionTicks = default(long?), string liveStreamId = default(string), string playSessionId = default(string), bool? failed = default(bool?), string nextMediaType = default(string))
        {
            this.NowPlayingQueue = nowPlayingQueue;
            this.PlaylistItemId = playlistItemId;
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
            this.Item = item;
            this.ItemId = itemId;
            this.SessionId = sessionId;
            this.MediaSourceId = mediaSourceId;
            this.PositionTicks = positionTicks;
            this.LiveStreamId = liveStreamId;
            this.PlaySessionId = playSessionId;
            this.Failed = failed;
            this.NextMediaType = nextMediaType;
        }
        
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
        /// Gets or Sets Item
        /// </summary>
        [DataMember(Name="Item", EmitDefaultValue=false)]
        public BaseItemDto Item { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets SessionId
        /// </summary>
        [DataMember(Name="SessionId", EmitDefaultValue=false)]
        public string SessionId { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets PositionTicks
        /// </summary>
        [DataMember(Name="PositionTicks", EmitDefaultValue=false)]
        public long? PositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets LiveStreamId
        /// </summary>
        [DataMember(Name="LiveStreamId", EmitDefaultValue=false)]
        public string LiveStreamId { get; set; }

        /// <summary>
        /// Gets or Sets PlaySessionId
        /// </summary>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=false)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// Gets or Sets Failed
        /// </summary>
        [DataMember(Name="Failed", EmitDefaultValue=false)]
        public bool? Failed { get; set; }

        /// <summary>
        /// Gets or Sets NextMediaType
        /// </summary>
        [DataMember(Name="NextMediaType", EmitDefaultValue=false)]
        public string NextMediaType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaybackStopInfo {\n");
            sb.Append("  NowPlayingQueue: ").Append(NowPlayingQueue).Append("\n");
            sb.Append("  PlaylistItemId: ").Append(PlaylistItemId).Append("\n");
            sb.Append("  PlaylistIndex: ").Append(PlaylistIndex).Append("\n");
            sb.Append("  PlaylistLength: ").Append(PlaylistLength).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  SessionId: ").Append(SessionId).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
            sb.Append("  LiveStreamId: ").Append(LiveStreamId).Append("\n");
            sb.Append("  PlaySessionId: ").Append(PlaySessionId).Append("\n");
            sb.Append("  Failed: ").Append(Failed).Append("\n");
            sb.Append("  NextMediaType: ").Append(NextMediaType).Append("\n");
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
            return this.Equals(input as PlaybackStopInfo);
        }

        /// <summary>
        /// Returns true if PlaybackStopInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaybackStopInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaybackStopInfo input)
        {
            if (input == null)
                return false;

            return 
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
                    this.Item == input.Item ||
                    (this.Item != null &&
                    this.Item.Equals(input.Item))
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
                    this.PositionTicks == input.PositionTicks ||
                    (this.PositionTicks != null &&
                    this.PositionTicks.Equals(input.PositionTicks))
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
                    this.Failed == input.Failed ||
                    (this.Failed != null &&
                    this.Failed.Equals(input.Failed))
                ) && 
                (
                    this.NextMediaType == input.NextMediaType ||
                    (this.NextMediaType != null &&
                    this.NextMediaType.Equals(input.NextMediaType))
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
                if (this.NowPlayingQueue != null)
                    hashCode = hashCode * 59 + this.NowPlayingQueue.GetHashCode();
                if (this.PlaylistItemId != null)
                    hashCode = hashCode * 59 + this.PlaylistItemId.GetHashCode();
                if (this.PlaylistIndex != null)
                    hashCode = hashCode * 59 + this.PlaylistIndex.GetHashCode();
                if (this.PlaylistLength != null)
                    hashCode = hashCode * 59 + this.PlaylistLength.GetHashCode();
                if (this.Item != null)
                    hashCode = hashCode * 59 + this.Item.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.SessionId != null)
                    hashCode = hashCode * 59 + this.SessionId.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.PositionTicks != null)
                    hashCode = hashCode * 59 + this.PositionTicks.GetHashCode();
                if (this.LiveStreamId != null)
                    hashCode = hashCode * 59 + this.LiveStreamId.GetHashCode();
                if (this.PlaySessionId != null)
                    hashCode = hashCode * 59 + this.PlaySessionId.GetHashCode();
                if (this.Failed != null)
                    hashCode = hashCode * 59 + this.Failed.GetHashCode();
                if (this.NextMediaType != null)
                    hashCode = hashCode * 59 + this.NextMediaType.GetHashCode();
                return hashCode;
            }
        }

    }
}
