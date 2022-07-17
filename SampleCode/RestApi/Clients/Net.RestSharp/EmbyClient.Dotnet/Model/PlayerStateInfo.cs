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
    /// PlayerStateInfo
    /// </summary>
    [DataContract]
        public partial class PlayerStateInfo :  IEquatable<PlayerStateInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlayerStateInfo" /> class.
        /// </summary>
        /// <param name="positionTicks">positionTicks.</param>
        /// <param name="canSeek">canSeek.</param>
        /// <param name="isPaused">isPaused.</param>
        /// <param name="isMuted">isMuted.</param>
        /// <param name="volumeLevel">volumeLevel.</param>
        /// <param name="audioStreamIndex">audioStreamIndex.</param>
        /// <param name="subtitleStreamIndex">subtitleStreamIndex.</param>
        /// <param name="mediaSourceId">mediaSourceId.</param>
        /// <param name="playMethod">playMethod.</param>
        /// <param name="repeatMode">repeatMode.</param>
        /// <param name="subtitleOffset">subtitleOffset.</param>
        /// <param name="playbackRate">playbackRate.</param>
        public PlayerStateInfo(long? positionTicks = default(long?), bool? canSeek = default(bool?), bool? isPaused = default(bool?), bool? isMuted = default(bool?), int? volumeLevel = default(int?), int? audioStreamIndex = default(int?), int? subtitleStreamIndex = default(int?), string mediaSourceId = default(string), PlayMethod playMethod = default(PlayMethod), RepeatMode repeatMode = default(RepeatMode), int? subtitleOffset = default(int?), double? playbackRate = default(double?))
        {
            this.PositionTicks = positionTicks;
            this.CanSeek = canSeek;
            this.IsPaused = isPaused;
            this.IsMuted = isMuted;
            this.VolumeLevel = volumeLevel;
            this.AudioStreamIndex = audioStreamIndex;
            this.SubtitleStreamIndex = subtitleStreamIndex;
            this.MediaSourceId = mediaSourceId;
            this.PlayMethod = playMethod;
            this.RepeatMode = repeatMode;
            this.SubtitleOffset = subtitleOffset;
            this.PlaybackRate = playbackRate;
        }
        
        /// <summary>
        /// Gets or Sets PositionTicks
        /// </summary>
        [DataMember(Name="PositionTicks", EmitDefaultValue=false)]
        public long? PositionTicks { get; set; }

        /// <summary>
        /// Gets or Sets CanSeek
        /// </summary>
        [DataMember(Name="CanSeek", EmitDefaultValue=false)]
        public bool? CanSeek { get; set; }

        /// <summary>
        /// Gets or Sets IsPaused
        /// </summary>
        [DataMember(Name="IsPaused", EmitDefaultValue=false)]
        public bool? IsPaused { get; set; }

        /// <summary>
        /// Gets or Sets IsMuted
        /// </summary>
        [DataMember(Name="IsMuted", EmitDefaultValue=false)]
        public bool? IsMuted { get; set; }

        /// <summary>
        /// Gets or Sets VolumeLevel
        /// </summary>
        [DataMember(Name="VolumeLevel", EmitDefaultValue=false)]
        public int? VolumeLevel { get; set; }

        /// <summary>
        /// Gets or Sets AudioStreamIndex
        /// </summary>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=false)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleStreamIndex
        /// </summary>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=false)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets PlayMethod
        /// </summary>
        [DataMember(Name="PlayMethod", EmitDefaultValue=false)]
        public PlayMethod PlayMethod { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlayerStateInfo {\n");
            sb.Append("  PositionTicks: ").Append(PositionTicks).Append("\n");
            sb.Append("  CanSeek: ").Append(CanSeek).Append("\n");
            sb.Append("  IsPaused: ").Append(IsPaused).Append("\n");
            sb.Append("  IsMuted: ").Append(IsMuted).Append("\n");
            sb.Append("  VolumeLevel: ").Append(VolumeLevel).Append("\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  PlayMethod: ").Append(PlayMethod).Append("\n");
            sb.Append("  RepeatMode: ").Append(RepeatMode).Append("\n");
            sb.Append("  SubtitleOffset: ").Append(SubtitleOffset).Append("\n");
            sb.Append("  PlaybackRate: ").Append(PlaybackRate).Append("\n");
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
            return this.Equals(input as PlayerStateInfo);
        }

        /// <summary>
        /// Returns true if PlayerStateInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of PlayerStateInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlayerStateInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PositionTicks == input.PositionTicks ||
                    (this.PositionTicks != null &&
                    this.PositionTicks.Equals(input.PositionTicks))
                ) && 
                (
                    this.CanSeek == input.CanSeek ||
                    (this.CanSeek != null &&
                    this.CanSeek.Equals(input.CanSeek))
                ) && 
                (
                    this.IsPaused == input.IsPaused ||
                    (this.IsPaused != null &&
                    this.IsPaused.Equals(input.IsPaused))
                ) && 
                (
                    this.IsMuted == input.IsMuted ||
                    (this.IsMuted != null &&
                    this.IsMuted.Equals(input.IsMuted))
                ) && 
                (
                    this.VolumeLevel == input.VolumeLevel ||
                    (this.VolumeLevel != null &&
                    this.VolumeLevel.Equals(input.VolumeLevel))
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
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.PlayMethod == input.PlayMethod ||
                    (this.PlayMethod != null &&
                    this.PlayMethod.Equals(input.PlayMethod))
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
                if (this.PositionTicks != null)
                    hashCode = hashCode * 59 + this.PositionTicks.GetHashCode();
                if (this.CanSeek != null)
                    hashCode = hashCode * 59 + this.CanSeek.GetHashCode();
                if (this.IsPaused != null)
                    hashCode = hashCode * 59 + this.IsPaused.GetHashCode();
                if (this.IsMuted != null)
                    hashCode = hashCode * 59 + this.IsMuted.GetHashCode();
                if (this.VolumeLevel != null)
                    hashCode = hashCode * 59 + this.VolumeLevel.GetHashCode();
                if (this.AudioStreamIndex != null)
                    hashCode = hashCode * 59 + this.AudioStreamIndex.GetHashCode();
                if (this.SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + this.SubtitleStreamIndex.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.PlayMethod != null)
                    hashCode = hashCode * 59 + this.PlayMethod.GetHashCode();
                if (this.RepeatMode != null)
                    hashCode = hashCode * 59 + this.RepeatMode.GetHashCode();
                if (this.SubtitleOffset != null)
                    hashCode = hashCode * 59 + this.SubtitleOffset.GetHashCode();
                if (this.PlaybackRate != null)
                    hashCode = hashCode * 59 + this.PlaybackRate.GetHashCode();
                return hashCode;
            }
        }

    }
}
