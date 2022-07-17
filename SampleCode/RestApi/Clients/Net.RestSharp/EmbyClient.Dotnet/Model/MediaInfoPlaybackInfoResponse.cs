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
    /// MediaInfoPlaybackInfoResponse
    /// </summary>
    [DataContract]
        public partial class MediaInfoPlaybackInfoResponse :  IEquatable<MediaInfoPlaybackInfoResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaInfoPlaybackInfoResponse" /> class.
        /// </summary>
        /// <param name="mediaSources">mediaSources.</param>
        /// <param name="playSessionId">playSessionId.</param>
        /// <param name="errorCode">errorCode.</param>
        public MediaInfoPlaybackInfoResponse(List<MediaSourceInfo> mediaSources = default(List<MediaSourceInfo>), string playSessionId = default(string), DlnaPlaybackErrorCode errorCode = default(DlnaPlaybackErrorCode))
        {
            this.MediaSources = mediaSources;
            this.PlaySessionId = playSessionId;
            this.ErrorCode = errorCode;
        }
        
        /// <summary>
        /// Gets or Sets MediaSources
        /// </summary>
        [DataMember(Name="MediaSources", EmitDefaultValue=false)]
        public List<MediaSourceInfo> MediaSources { get; set; }

        /// <summary>
        /// Gets or Sets PlaySessionId
        /// </summary>
        [DataMember(Name="PlaySessionId", EmitDefaultValue=false)]
        public string PlaySessionId { get; set; }

        /// <summary>
        /// Gets or Sets ErrorCode
        /// </summary>
        [DataMember(Name="ErrorCode", EmitDefaultValue=false)]
        public DlnaPlaybackErrorCode ErrorCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaInfoPlaybackInfoResponse {\n");
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
            return this.Equals(input as MediaInfoPlaybackInfoResponse);
        }

        /// <summary>
        /// Returns true if MediaInfoPlaybackInfoResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaInfoPlaybackInfoResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaInfoPlaybackInfoResponse input)
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
