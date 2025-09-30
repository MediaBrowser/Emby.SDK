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
    /// Class PlaybackStopInfo.  
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
        /// <param name="sessionId">The session id..</param>
        /// <param name="isAutomated">isAutomated.</param>
        /// <param name="failed">A value indicating whether this &#x60;MediaBrowser.Model.Session.PlaybackStopInfo&#x60; is failed..</param>
        /// <param name="nextMediaType">nextMediaType.</param>
        /// <param name="playSessionId">The play session identifier..</param>
        /// <param name="itemId">The item identifier..</param>
        /// <param name="liveStreamId">The live stream identifier..</param>
        /// <param name="mediaSourceId">The media version identifier..</param>
        /// <param name="item">item.</param>
        /// <param name="positionTicks">The position ticks..</param>
        public PlaybackStopInfo(List<QueueItem> nowPlayingQueue = default(List<QueueItem>), string playlistItemId = default(string), int? playlistIndex = default(int?), int? playlistLength = default(int?), string sessionId = default(string), bool? isAutomated = default(bool?), bool? failed = default(bool?), string nextMediaType = default(string), string playSessionId = default(string), string itemId = default(string), string liveStreamId = default(string), string mediaSourceId = default(string), BaseItemDto item = default(BaseItemDto), long? positionTicks = default(long?))
        {
            this.NowPlayingQueue = nowPlayingQueue;
            this.PlaylistItemId = playlistItemId;
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
            this.SessionId = sessionId;
            this.IsAutomated = isAutomated;
            this.Failed = failed;
            this.NextMediaType = nextMediaType;
            this.PlaySessionId = playSessionId;
            this.ItemId = itemId;
            this.LiveStreamId = liveStreamId;
            this.MediaSourceId = mediaSourceId;
            this.Item = item;
            this.PositionTicks = positionTicks;
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
        /// The session id.
        /// </summary>
        /// <value>The session id.</value>
        [DataMember(Name="SessionId", EmitDefaultValue=false)]
        public string SessionId { get; set; }

        /// <summary>
        /// Gets or Sets IsAutomated
        /// </summary>
        [DataMember(Name="IsAutomated", EmitDefaultValue=false)]
        public bool? IsAutomated { get; set; }

        /// <summary>
        /// A value indicating whether this &#x60;MediaBrowser.Model.Session.PlaybackStopInfo&#x60; is failed.
        /// </summary>
        /// <value>A value indicating whether this &#x60;MediaBrowser.Model.Session.PlaybackStopInfo&#x60; is failed.</value>
        [DataMember(Name="Failed", EmitDefaultValue=false)]
        public bool? Failed { get; set; }

        /// <summary>
        /// Gets or Sets NextMediaType
        /// </summary>
        [DataMember(Name="NextMediaType", EmitDefaultValue=false)]
        public string NextMediaType { get; set; }

        /// <summary>
        /// The play session identifier.
        /// </summary>
        /// <value>The play session identifier.</value>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=false)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// The item identifier.
        /// </summary>
        /// <value>The item identifier.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// The live stream identifier.
        /// </summary>
        /// <value>The live stream identifier.</value>
        [DataMember(Name="LiveStreamId", EmitDefaultValue=false)]
        public string LiveStreamId { get; set; }

        /// <summary>
        /// The media version identifier.
        /// </summary>
        /// <value>The media version identifier.</value>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets Item
        /// </summary>
        [DataMember(Name="Item", EmitDefaultValue=false)]
        public BaseItemDto Item { get; set; }

        /// <summary>
        /// The position ticks.
        /// </summary>
        /// <value>The position ticks.</value>
        [DataMember(Name="PositionTicks", EmitDefaultValue=false)]
        public long? PositionTicks { get; set; }

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
            sb.Append("  SessionId: ").Append(SessionId).Append("\n");
            sb.Append("  IsAutomated: ").Append(IsAutomated).Append("\n");
            sb.Append("  Failed: ").Append(Failed).Append("\n");
            sb.Append("  NextMediaType: ").Append(NextMediaType).Append("\n");
            sb.Append("  PlaySessionId: ").Append(PlaySessionId).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  LiveStreamId: ").Append(LiveStreamId).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
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
                    this.SessionId == input.SessionId ||
                    (this.SessionId != null &&
                    this.SessionId.Equals(input.SessionId))
                ) && 
                (
                    this.IsAutomated == input.IsAutomated ||
                    (this.IsAutomated != null &&
                    this.IsAutomated.Equals(input.IsAutomated))
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
                ) && 
                (
                    this.PlaySessionId == input.PlaySessionId ||
                    (this.PlaySessionId != null &&
                    this.PlaySessionId.Equals(input.PlaySessionId))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.LiveStreamId == input.LiveStreamId ||
                    (this.LiveStreamId != null &&
                    this.LiveStreamId.Equals(input.LiveStreamId))
                ) && 
                (
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.Item == input.Item ||
                    (this.Item != null &&
                    this.Item.Equals(input.Item))
                ) && 
                (
                    this.PositionTicks == input.PositionTicks ||
                    (this.PositionTicks != null &&
                    this.PositionTicks.Equals(input.PositionTicks))
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
                if (this.SessionId != null)
                    hashCode = hashCode * 59 + this.SessionId.GetHashCode();
                if (this.IsAutomated != null)
                    hashCode = hashCode * 59 + this.IsAutomated.GetHashCode();
                if (this.Failed != null)
                    hashCode = hashCode * 59 + this.Failed.GetHashCode();
                if (this.NextMediaType != null)
                    hashCode = hashCode * 59 + this.NextMediaType.GetHashCode();
                if (this.PlaySessionId != null)
                    hashCode = hashCode * 59 + this.PlaySessionId.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.LiveStreamId != null)
                    hashCode = hashCode * 59 + this.LiveStreamId.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.Item != null)
                    hashCode = hashCode * 59 + this.Item.GetHashCode();
                if (this.PositionTicks != null)
                    hashCode = hashCode * 59 + this.PositionTicks.GetHashCode();
                return hashCode;
            }
        }

    }
}
