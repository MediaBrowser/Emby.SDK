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
    /// MediaEncodingApiOnPlaybackProgress
    /// </summary>
    [DataContract]
        public partial class MediaEncodingApiOnPlaybackProgress :  IEquatable<MediaEncodingApiOnPlaybackProgress>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaEncodingApiOnPlaybackProgress" /> class.
        /// </summary>
        /// <param name="playlistIndex">playlistIndex.</param>
        /// <param name="playlistLength">playlistLength.</param>
        /// <param name="eventName">eventName.</param>
        public MediaEncodingApiOnPlaybackProgress(int? playlistIndex = default(int?), int? playlistLength = default(int?), ProgressEvent eventName = default(ProgressEvent))
        {
            this.PlaylistIndex = playlistIndex;
            this.PlaylistLength = playlistLength;
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
            sb.Append("class MediaEncodingApiOnPlaybackProgress {\n");
            sb.Append("  PlaylistIndex: ").Append(PlaylistIndex).Append("\n");
            sb.Append("  PlaylistLength: ").Append(PlaylistLength).Append("\n");
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
            return this.Equals(input as MediaEncodingApiOnPlaybackProgress);
        }

        /// <summary>
        /// Returns true if MediaEncodingApiOnPlaybackProgress instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaEncodingApiOnPlaybackProgress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaEncodingApiOnPlaybackProgress input)
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
                if (this.EventName != null)
                    hashCode = hashCode * 59 + this.EventName.GetHashCode();
                return hashCode;
            }
        }

    }
}
