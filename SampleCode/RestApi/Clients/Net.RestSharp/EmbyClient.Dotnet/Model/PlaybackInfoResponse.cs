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
    /// PlaybackInfoResponse
    /// </summary>
    [DataContract]
        public partial class PlaybackInfoResponse :  IEquatable<PlaybackInfoResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlaybackInfoResponse" /> class.
        /// </summary>
        /// <param name="mediaSources">The media sources..</param>
        /// <param name="playSessionId">The play session identifier..</param>
        /// <param name="errorCode">errorCode.</param>
        public PlaybackInfoResponse(List<MediaSourceInfo> mediaSources = default(List<MediaSourceInfo>), string playSessionId = default(string), PlaybackErrorCode errorCode = default(PlaybackErrorCode))
        {
            this.MediaSources = mediaSources;
            this.PlaySessionId = playSessionId;
            this.ErrorCode = errorCode;
        }
        
        /// <summary>
        /// The media sources.
        /// </summary>
        /// <value>The media sources.</value>
        [DataMember(Name="MediaSources", EmitDefaultValue=false)]
        public List<MediaSourceInfo> MediaSources { get; set; }

        /// <summary>
        /// The play session identifier.
        /// </summary>
        /// <value>The play session identifier.</value>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=false)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// Gets or Sets ErrorCode
        /// </summary>
        [DataMember(Name="ErrorCode", EmitDefaultValue=false)]
        public PlaybackErrorCode ErrorCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlaybackInfoResponse {\n");
            sb.Append("  MediaSources: ").Append(MediaSources).Append("\n");
            sb.Append("  PlaySessionId: ").Append(PlaySessionId).Append("\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
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
            return this.Equals(input as PlaybackInfoResponse);
        }

        /// <summary>
        /// Returns true if PlaybackInfoResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of PlaybackInfoResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlaybackInfoResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MediaSources == input.MediaSources ||
                    this.MediaSources != null &&
                    input.MediaSources != null &&
                    this.MediaSources.SequenceEqual(input.MediaSources)
                ) && 
                (
                    this.PlaySessionId == input.PlaySessionId ||
                    (this.PlaySessionId != null &&
                    this.PlaySessionId.Equals(input.PlaySessionId))
                ) && 
                (
                    this.ErrorCode == input.ErrorCode ||
                    (this.ErrorCode != null &&
                    this.ErrorCode.Equals(input.ErrorCode))
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
                if (this.MediaSources != null)
                    hashCode = hashCode * 59 + this.MediaSources.GetHashCode();
                if (this.PlaySessionId != null)
                    hashCode = hashCode * 59 + this.PlaySessionId.GetHashCode();
                if (this.ErrorCode != null)
                    hashCode = hashCode * 59 + this.ErrorCode.GetHashCode();
                return hashCode;
            }
        }

    }
}
