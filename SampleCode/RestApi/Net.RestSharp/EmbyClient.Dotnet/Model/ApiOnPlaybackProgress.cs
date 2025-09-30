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
    /// ApiOnPlaybackProgress
    /// </summary>
    [DataContract]
        public partial class ApiOnPlaybackProgress :  IEquatable<ApiOnPlaybackProgress>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiOnPlaybackProgress" /> class.
        /// </summary>
        /// <param name="playlistIndex">playlistIndex.</param>
        /// <param name="playlistLength">playlistLength.</param>
        /// <param name="shuffle">shuffle.</param>
        /// <param name="sleepTimerMode">sleepTimerMode.</param>
        /// <param name="sleepTimerEndTime">sleepTimerEndTime.</param>
        /// <param name="eventName">eventName.</param>
        public ApiOnPlaybackProgress(int? playlistIndex = default(int?), int? playlistLength = default(int?), bool? shuffle = default(bool?), SleepTimerMode sleepTimerMode = default(SleepTimerMode), DateTimeOffset? sleepTimerEndTime = default(DateTimeOffset?), ProgressEvent eventName = default(ProgressEvent))
        {
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
            this.Shuffle = shuffle;
            this.SleepTimerMode = sleepTimerMode;
            this.SleepTimerEndTime = sleepTimerEndTime;
            this.EventName = eventName;
        }
        
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
        /// Gets or Sets Shuffle
        /// </summary>
        [DataMember(Name="Shuffle", EmitDefaultValue=false)]
        public bool? Shuffle { get; set; }

        /// <summary>
        /// Gets or Sets SleepTimerMode
        /// </summary>
        [DataMember(Name="SleepTimerMode", EmitDefaultValue=false)]
        public SleepTimerMode SleepTimerMode { get; set; }

        /// <summary>
        /// Gets or Sets SleepTimerEndTime
        /// </summary>
        [DataMember(Name="SleepTimerEndTime", EmitDefaultValue=false)]
        public DateTimeOffset? SleepTimerEndTime { get; set; }

        /// <summary>
        /// Gets or Sets EventName
        /// </summary>
        [DataMember(Name="EventName", EmitDefaultValue=false)]
        public ProgressEvent EventName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiOnPlaybackProgress {\n");
            sb.Append("  PlaylistIndex: ").Append(PlaylistIndex).Append("\n");
            sb.Append("  PlaylistLength: ").Append(PlaylistLength).Append("\n");
            sb.Append("  Shuffle: ").Append(Shuffle).Append("\n");
            sb.Append("  SleepTimerMode: ").Append(SleepTimerMode).Append("\n");
            sb.Append("  SleepTimerEndTime: ").Append(SleepTimerEndTime).Append("\n");
            sb.Append("  EventName: ").Append(EventName).Append("\n");
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
            return this.Equals(input as ApiOnPlaybackProgress);
        }

        /// <summary>
        /// Returns true if ApiOnPlaybackProgress instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiOnPlaybackProgress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiOnPlaybackProgress input)
        {
            if (input == null)
                return false;

            return 
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
                    this.Shuffle == input.Shuffle ||
                    (this.Shuffle != null &&
                    this.Shuffle.Equals(input.Shuffle))
                ) && 
                (
                    this.SleepTimerMode == input.SleepTimerMode ||
                    (this.SleepTimerMode != null &&
                    this.SleepTimerMode.Equals(input.SleepTimerMode))
                ) && 
                (
                    this.SleepTimerEndTime == input.SleepTimerEndTime ||
                    (this.SleepTimerEndTime != null &&
                    this.SleepTimerEndTime.Equals(input.SleepTimerEndTime))
                ) && 
                (
                    this.EventName == input.EventName ||
                    (this.EventName != null &&
                    this.EventName.Equals(input.EventName))
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
                if (this.PlaylistIndex != null)
                    hashCode = hashCode * 59 + this.PlaylistIndex.GetHashCode();
                if (this.PlaylistLength != null)
                    hashCode = hashCode * 59 + this.PlaylistLength.GetHashCode();
                if (this.Shuffle != null)
                    hashCode = hashCode * 59 + this.Shuffle.GetHashCode();
                if (this.SleepTimerMode != null)
                    hashCode = hashCode * 59 + this.SleepTimerMode.GetHashCode();
                if (this.SleepTimerEndTime != null)
                    hashCode = hashCode * 59 + this.SleepTimerEndTime.GetHashCode();
                if (this.EventName != null)
                    hashCode = hashCode * 59 + this.EventName.GetHashCode();
                return hashCode;
            }
        }

    }
}
