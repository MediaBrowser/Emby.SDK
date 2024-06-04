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
    /// PlaybackInfoRequest
    /// </summary>
    [DataContract]
        public partial class PlaybackInfoRequest :  IEquatable<PlaybackInfoRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaybackInfoRequest" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="userId">userId.</param>
        /// <param name="maxStreamingBitrate">maxStreamingBitrate.</param>
        /// <param name="startTimeTicks">startTimeTicks.</param>
        /// <param name="audioStreamIndex">audioStreamIndex.</param>
        /// <param name="subtitleStreamIndex">subtitleStreamIndex.</param>
        /// <param name="maxAudioChannels">maxAudioChannels.</param>
        /// <param name="mediaSourceId">mediaSourceId.</param>
        /// <param name="liveStreamId">liveStreamId.</param>
        /// <param name="deviceProfile">deviceProfile.</param>
        /// <param name="enableDirectPlay">enableDirectPlay.</param>
        /// <param name="enableDirectStream">enableDirectStream.</param>
        /// <param name="enableTranscoding">enableTranscoding.</param>
        /// <param name="allowInterlacedVideoStreamCopy">allowInterlacedVideoStreamCopy.</param>
        /// <param name="allowVideoStreamCopy">allowVideoStreamCopy.</param>
        /// <param name="allowAudioStreamCopy">allowAudioStreamCopy.</param>
        /// <param name="isPlayback">isPlayback.</param>
        /// <param name="autoOpenLiveStream">autoOpenLiveStream.</param>
        /// <param name="currentPlaySessionId">currentPlaySessionId.</param>
        public PlaybackInfoRequest(string id = default(string), string userId = default(string), long? maxStreamingBitrate = default(long?), long? startTimeTicks = default(long?), int? audioStreamIndex = default(int?), int? subtitleStreamIndex = default(int?), int? maxAudioChannels = default(int?), string mediaSourceId = default(string), string liveStreamId = default(string), DeviceProfile deviceProfile = default(DeviceProfile), bool? enableDirectPlay = default(bool?), bool? enableDirectStream = default(bool?), bool? enableTranscoding = default(bool?), bool? allowInterlacedVideoStreamCopy = default(bool?), bool? allowVideoStreamCopy = default(bool?), bool? allowAudioStreamCopy = default(bool?), bool? isPlayback = default(bool?), bool? autoOpenLiveStream = default(bool?), string currentPlaySessionId = default(string))
        {
            this.Id = id;
            this.UserId = userId;
            this.MaxStreamingBitrate = maxStreamingBitrate;
            this.StartTimeTicks = startTimeTicks;
            this.AudioStreamIndex = audioStreamIndex;
            this.SubtitleStreamIndex = subtitleStreamIndex;
            this.MaxAudioChannels = maxAudioChannels;
            this.MediaSourceId = mediaSourceId;
            this.LiveStreamId = liveStreamId;
            this.DeviceProfile = deviceProfile;
            this.EnableDirectPlay = enableDirectPlay;
            this.EnableDirectStream = enableDirectStream;
            this.EnableTranscoding = enableTranscoding;
            this.AllowInterlacedVideoStreamCopy = allowInterlacedVideoStreamCopy;
            this.AllowVideoStreamCopy = allowVideoStreamCopy;
            this.AllowAudioStreamCopy = allowAudioStreamCopy;
            this.IsPlayback = isPlayback;
            this.AutoOpenLiveStream = autoOpenLiveStream;
            this.CurrentPlaySessionId = currentPlaySessionId;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets MaxStreamingBitrate
        /// </summary>
        [DataMember(Name="MaxStreamingBitrate", EmitDefaultValue=false)]
        public long? MaxStreamingBitrate { get; set; }

        /// <summary>
        /// Gets or Sets StartTimeTicks
        /// </summary>
        [DataMember(Name="StartTimeTicks", EmitDefaultValue=false)]
        public long? StartTimeTicks { get; set; }

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
        /// Gets or Sets MaxAudioChannels
        /// </summary>
        [DataMember(Name="MaxAudioChannels", EmitDefaultValue=false)]
        public int? MaxAudioChannels { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets LiveStreamId
        /// </summary>
        [DataMember(Name="LiveStreamId", EmitDefaultValue=false)]
        public string LiveStreamId { get; set; }

        /// <summary>
        /// Gets or Sets DeviceProfile
        /// </summary>
        [DataMember(Name="DeviceProfile", EmitDefaultValue=false)]
        public DeviceProfile DeviceProfile { get; set; }

        /// <summary>
        /// Gets or Sets EnableDirectPlay
        /// </summary>
        [DataMember(Name="EnableDirectPlay", EmitDefaultValue=false)]
        public bool? EnableDirectPlay { get; set; }

        /// <summary>
        /// Gets or Sets EnableDirectStream
        /// </summary>
        [DataMember(Name="EnableDirectStream", EmitDefaultValue=false)]
        public bool? EnableDirectStream { get; set; }

        /// <summary>
        /// Gets or Sets EnableTranscoding
        /// </summary>
        [DataMember(Name="EnableTranscoding", EmitDefaultValue=false)]
        public bool? EnableTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets AllowInterlacedVideoStreamCopy
        /// </summary>
        [DataMember(Name="AllowInterlacedVideoStreamCopy", EmitDefaultValue=false)]
        public bool? AllowInterlacedVideoStreamCopy { get; set; }

        /// <summary>
        /// Gets or Sets AllowVideoStreamCopy
        /// </summary>
        [DataMember(Name="AllowVideoStreamCopy", EmitDefaultValue=false)]
        public bool? AllowVideoStreamCopy { get; set; }

        /// <summary>
        /// Gets or Sets AllowAudioStreamCopy
        /// </summary>
        [DataMember(Name="AllowAudioStreamCopy", EmitDefaultValue=false)]
        public bool? AllowAudioStreamCopy { get; set; }

        /// <summary>
        /// Gets or Sets IsPlayback
        /// </summary>
        [DataMember(Name="IsPlayback", EmitDefaultValue=false)]
        public bool? IsPlayback { get; set; }

        /// <summary>
        /// Gets or Sets AutoOpenLiveStream
        /// </summary>
        [DataMember(Name="AutoOpenLiveStream", EmitDefaultValue=false)]
        public bool? AutoOpenLiveStream { get; set; }

        /// <summary>
        /// Gets or Sets CurrentPlaySessionId
        /// </summary>
        [DataMember(Name="CurrentPlaySessionId", EmitDefaultValue=false)]
        public string CurrentPlaySessionId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaybackInfoRequest {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  MaxStreamingBitrate: ").Append(MaxStreamingBitrate).Append("\n");
            sb.Append("  StartTimeTicks: ").Append(StartTimeTicks).Append("\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  MaxAudioChannels: ").Append(MaxAudioChannels).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  LiveStreamId: ").Append(LiveStreamId).Append("\n");
            sb.Append("  DeviceProfile: ").Append(DeviceProfile).Append("\n");
            sb.Append("  EnableDirectPlay: ").Append(EnableDirectPlay).Append("\n");
            sb.Append("  EnableDirectStream: ").Append(EnableDirectStream).Append("\n");
            sb.Append("  EnableTranscoding: ").Append(EnableTranscoding).Append("\n");
            sb.Append("  AllowInterlacedVideoStreamCopy: ").Append(AllowInterlacedVideoStreamCopy).Append("\n");
            sb.Append("  AllowVideoStreamCopy: ").Append(AllowVideoStreamCopy).Append("\n");
            sb.Append("  AllowAudioStreamCopy: ").Append(AllowAudioStreamCopy).Append("\n");
            sb.Append("  IsPlayback: ").Append(IsPlayback).Append("\n");
            sb.Append("  AutoOpenLiveStream: ").Append(AutoOpenLiveStream).Append("\n");
            sb.Append("  CurrentPlaySessionId: ").Append(CurrentPlaySessionId).Append("\n");
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
            return this.Equals(input as PlaybackInfoRequest);
        }

        /// <summary>
        /// Returns true if PlaybackInfoRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaybackInfoRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaybackInfoRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.MaxStreamingBitrate == input.MaxStreamingBitrate ||
                    (this.MaxStreamingBitrate != null &&
                    this.MaxStreamingBitrate.Equals(input.MaxStreamingBitrate))
                ) && 
                (
                    this.StartTimeTicks == input.StartTimeTicks ||
                    (this.StartTimeTicks != null &&
                    this.StartTimeTicks.Equals(input.StartTimeTicks))
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
                    this.MaxAudioChannels == input.MaxAudioChannels ||
                    (this.MaxAudioChannels != null &&
                    this.MaxAudioChannels.Equals(input.MaxAudioChannels))
                ) && 
                (
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.LiveStreamId == input.LiveStreamId ||
                    (this.LiveStreamId != null &&
                    this.LiveStreamId.Equals(input.LiveStreamId))
                ) && 
                (
                    this.DeviceProfile == input.DeviceProfile ||
                    (this.DeviceProfile != null &&
                    this.DeviceProfile.Equals(input.DeviceProfile))
                ) && 
                (
                    this.EnableDirectPlay == input.EnableDirectPlay ||
                    (this.EnableDirectPlay != null &&
                    this.EnableDirectPlay.Equals(input.EnableDirectPlay))
                ) && 
                (
                    this.EnableDirectStream == input.EnableDirectStream ||
                    (this.EnableDirectStream != null &&
                    this.EnableDirectStream.Equals(input.EnableDirectStream))
                ) && 
                (
                    this.EnableTranscoding == input.EnableTranscoding ||
                    (this.EnableTranscoding != null &&
                    this.EnableTranscoding.Equals(input.EnableTranscoding))
                ) && 
                (
                    this.AllowInterlacedVideoStreamCopy == input.AllowInterlacedVideoStreamCopy ||
                    (this.AllowInterlacedVideoStreamCopy != null &&
                    this.AllowInterlacedVideoStreamCopy.Equals(input.AllowInterlacedVideoStreamCopy))
                ) && 
                (
                    this.AllowVideoStreamCopy == input.AllowVideoStreamCopy ||
                    (this.AllowVideoStreamCopy != null &&
                    this.AllowVideoStreamCopy.Equals(input.AllowVideoStreamCopy))
                ) && 
                (
                    this.AllowAudioStreamCopy == input.AllowAudioStreamCopy ||
                    (this.AllowAudioStreamCopy != null &&
                    this.AllowAudioStreamCopy.Equals(input.AllowAudioStreamCopy))
                ) && 
                (
                    this.IsPlayback == input.IsPlayback ||
                    (this.IsPlayback != null &&
                    this.IsPlayback.Equals(input.IsPlayback))
                ) && 
                (
                    this.AutoOpenLiveStream == input.AutoOpenLiveStream ||
                    (this.AutoOpenLiveStream != null &&
                    this.AutoOpenLiveStream.Equals(input.AutoOpenLiveStream))
                ) && 
                (
                    this.CurrentPlaySessionId == input.CurrentPlaySessionId ||
                    (this.CurrentPlaySessionId != null &&
                    this.CurrentPlaySessionId.Equals(input.CurrentPlaySessionId))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.MaxStreamingBitrate != null)
                    hashCode = hashCode * 59 + this.MaxStreamingBitrate.GetHashCode();
                if (this.StartTimeTicks != null)
                    hashCode = hashCode * 59 + this.StartTimeTicks.GetHashCode();
                if (this.AudioStreamIndex != null)
                    hashCode = hashCode * 59 + this.AudioStreamIndex.GetHashCode();
                if (this.SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + this.SubtitleStreamIndex.GetHashCode();
                if (this.MaxAudioChannels != null)
                    hashCode = hashCode * 59 + this.MaxAudioChannels.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.LiveStreamId != null)
                    hashCode = hashCode * 59 + this.LiveStreamId.GetHashCode();
                if (this.DeviceProfile != null)
                    hashCode = hashCode * 59 + this.DeviceProfile.GetHashCode();
                if (this.EnableDirectPlay != null)
                    hashCode = hashCode * 59 + this.EnableDirectPlay.GetHashCode();
                if (this.EnableDirectStream != null)
                    hashCode = hashCode * 59 + this.EnableDirectStream.GetHashCode();
                if (this.EnableTranscoding != null)
                    hashCode = hashCode * 59 + this.EnableTranscoding.GetHashCode();
                if (this.AllowInterlacedVideoStreamCopy != null)
                    hashCode = hashCode * 59 + this.AllowInterlacedVideoStreamCopy.GetHashCode();
                if (this.AllowVideoStreamCopy != null)
                    hashCode = hashCode * 59 + this.AllowVideoStreamCopy.GetHashCode();
                if (this.AllowAudioStreamCopy != null)
                    hashCode = hashCode * 59 + this.AllowAudioStreamCopy.GetHashCode();
                if (this.IsPlayback != null)
                    hashCode = hashCode * 59 + this.IsPlayback.GetHashCode();
                if (this.AutoOpenLiveStream != null)
                    hashCode = hashCode * 59 + this.AutoOpenLiveStream.GetHashCode();
                if (this.CurrentPlaySessionId != null)
                    hashCode = hashCode * 59 + this.CurrentPlaySessionId.GetHashCode();
                return hashCode;
            }
        }

    }
}
