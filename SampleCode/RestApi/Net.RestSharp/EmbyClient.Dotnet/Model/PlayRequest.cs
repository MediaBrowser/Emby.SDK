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
    /// Class PlayRequest  
    /// </summary>
    [DataContract]
        public partial class PlayRequest :  IEquatable<PlayRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlayRequest" /> class.
        /// </summary>
        /// <param name="controllingUserId">The controlling user identifier..</param>
        /// <param name="subtitleStreamIndex">subtitleStreamIndex.</param>
        /// <param name="audioStreamIndex">audioStreamIndex.</param>
        /// <param name="mediaSourceId">mediaSourceId.</param>
        /// <param name="startIndex">startIndex.</param>
        public PlayRequest(string controllingUserId = default(string), int? subtitleStreamIndex = default(int?), int? audioStreamIndex = default(int?), string mediaSourceId = default(string), int? startIndex = default(int?))
        {
            this.ControllingUserId = controllingUserId;
            this.SubtitleStreamIndex = subtitleStreamIndex;
            this.AudioStreamIndex = audioStreamIndex;
            this.MediaSourceId = mediaSourceId;
            this.StartIndex = startIndex;
        }
        
        /// <summary>
        /// The controlling user identifier.
        /// </summary>
        /// <value>The controlling user identifier.</value>
        [DataMember(Name="ControllingUserId", EmitDefaultValue=false)]
        public string ControllingUserId { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleStreamIndex
        /// </summary>
        [DataMember(Name="SubtitleStreamIndex", EmitDefaultValue=false)]
        public int? SubtitleStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets AudioStreamIndex
        /// </summary>
        [DataMember(Name="AudioStreamIndex", EmitDefaultValue=false)]
        public int? AudioStreamIndex { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets StartIndex
        /// </summary>
        [DataMember(Name="StartIndex", EmitDefaultValue=false)]
        public int? StartIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlayRequest {\n");
            sb.Append("  ControllingUserId: ").Append(ControllingUserId).Append("\n");
            sb.Append("  SubtitleStreamIndex: ").Append(SubtitleStreamIndex).Append("\n");
            sb.Append("  AudioStreamIndex: ").Append(AudioStreamIndex).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  StartIndex: ").Append(StartIndex).Append("\n");
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
            return this.Equals(input as PlayRequest);
        }

        /// <summary>
        /// Returns true if PlayRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PlayRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlayRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ControllingUserId == input.ControllingUserId ||
                    (this.ControllingUserId != null &&
                    this.ControllingUserId.Equals(input.ControllingUserId))
                ) && 
                (
                    this.SubtitleStreamIndex == input.SubtitleStreamIndex ||
                    (this.SubtitleStreamIndex != null &&
                    this.SubtitleStreamIndex.Equals(input.SubtitleStreamIndex))
                ) && 
                (
                    this.AudioStreamIndex == input.AudioStreamIndex ||
                    (this.AudioStreamIndex != null &&
                    this.AudioStreamIndex.Equals(input.AudioStreamIndex))
                ) && 
                (
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.StartIndex == input.StartIndex ||
                    (this.StartIndex != null &&
                    this.StartIndex.Equals(input.StartIndex))
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
                if (this.ControllingUserId != null)
                    hashCode = hashCode * 59 + this.ControllingUserId.GetHashCode();
                if (this.SubtitleStreamIndex != null)
                    hashCode = hashCode * 59 + this.SubtitleStreamIndex.GetHashCode();
                if (this.AudioStreamIndex != null)
                    hashCode = hashCode * 59 + this.AudioStreamIndex.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.StartIndex != null)
                    hashCode = hashCode * 59 + this.StartIndex.GetHashCode();
                return hashCode;
            }
        }

    }
}
