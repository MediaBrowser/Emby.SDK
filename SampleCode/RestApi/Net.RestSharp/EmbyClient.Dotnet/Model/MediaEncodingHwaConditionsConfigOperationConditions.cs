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
    /// MediaEncodingHwaConditionsConfigOperationConditions
    /// </summary>
    [DataContract]
        public partial class MediaEncodingHwaConditionsConfigOperationConditions :  IEquatable<MediaEncodingHwaConditionsConfigOperationConditions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingHwaConditionsConfigOperationConditions" /> class.
        /// </summary>
        /// <param name="conversions">Offline conversions which are not related to an active playback session.</param>
        /// <param name="liveTV">Transcoding of Live TV.</param>
        /// <param name="playback">Transcoding for an active playback session.</param>
        /// <param name="hlsPlayback">HLS Transcoding for an active playback session.</param>
        /// <param name="liveStream">Transcoding of a live stream for an active playback session.</param>
        public MediaEncodingHwaConditionsConfigOperationConditions(bool? conversions = default(bool?), bool? liveTV = default(bool?), bool? playback = default(bool?), bool? hlsPlayback = default(bool?), bool? liveStream = default(bool?))
        {
            this.Conversions = conversions;
            this.LiveTV = liveTV;
            this.Playback = playback;
            this.HlsPlayback = hlsPlayback;
            this.LiveStream = liveStream;
        }
        
        /// <summary>
        /// Offline conversions which are not related to an active playback session
        /// </summary>
        /// <value>Offline conversions which are not related to an active playback session</value>
        [DataMember(Name="Conversions", EmitDefaultValue=false)]
        public bool? Conversions { get; set; }

        /// <summary>
        /// Transcoding of Live TV
        /// </summary>
        /// <value>Transcoding of Live TV</value>
        [DataMember(Name="LiveTV", EmitDefaultValue=false)]
        public bool? LiveTV { get; set; }

        /// <summary>
        /// Transcoding for an active playback session
        /// </summary>
        /// <value>Transcoding for an active playback session</value>
        [DataMember(Name="Playback", EmitDefaultValue=false)]
        public bool? Playback { get; set; }

        /// <summary>
        /// HLS Transcoding for an active playback session
        /// </summary>
        /// <value>HLS Transcoding for an active playback session</value>
        [DataMember(Name="HlsPlayback", EmitDefaultValue=false)]
        public bool? HlsPlayback { get; set; }

        /// <summary>
        /// Transcoding of a live stream for an active playback session
        /// </summary>
        /// <value>Transcoding of a live stream for an active playback session</value>
        [DataMember(Name="LiveStream", EmitDefaultValue=false)]
        public bool? LiveStream { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaEncodingHwaConditionsConfigOperationConditions {\n");
            sb.Append("  Conversions: ").Append(Conversions).Append("\n");
            sb.Append("  LiveTV: ").Append(LiveTV).Append("\n");
            sb.Append("  Playback: ").Append(Playback).Append("\n");
            sb.Append("  HlsPlayback: ").Append(HlsPlayback).Append("\n");
            sb.Append("  LiveStream: ").Append(LiveStream).Append("\n");
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
            return this.Equals(input as MediaEncodingHwaConditionsConfigOperationConditions);
        }

        /// <summary>
        /// Returns true if MediaEncodingHwaConditionsConfigOperationConditions instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingHwaConditionsConfigOperationConditions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingHwaConditionsConfigOperationConditions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Conversions == input.Conversions ||
                    (this.Conversions != null &&
                    this.Conversions.Equals(input.Conversions))
                ) && 
                (
                    this.LiveTV == input.LiveTV ||
                    (this.LiveTV != null &&
                    this.LiveTV.Equals(input.LiveTV))
                ) && 
                (
                    this.Playback == input.Playback ||
                    (this.Playback != null &&
                    this.Playback.Equals(input.Playback))
                ) && 
                (
                    this.HlsPlayback == input.HlsPlayback ||
                    (this.HlsPlayback != null &&
                    this.HlsPlayback.Equals(input.HlsPlayback))
                ) && 
                (
                    this.LiveStream == input.LiveStream ||
                    (this.LiveStream != null &&
                    this.LiveStream.Equals(input.LiveStream))
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
                if (this.Conversions != null)
                    hashCode = hashCode * 59 + this.Conversions.GetHashCode();
                if (this.LiveTV != null)
                    hashCode = hashCode * 59 + this.LiveTV.GetHashCode();
                if (this.Playback != null)
                    hashCode = hashCode * 59 + this.Playback.GetHashCode();
                if (this.HlsPlayback != null)
                    hashCode = hashCode * 59 + this.HlsPlayback.GetHashCode();
                if (this.LiveStream != null)
                    hashCode = hashCode * 59 + this.LiveStream.GetHashCode();
                return hashCode;
            }
        }

    }
}
