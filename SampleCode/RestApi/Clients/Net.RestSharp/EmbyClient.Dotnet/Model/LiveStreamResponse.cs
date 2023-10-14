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
    /// LiveStreamResponse
    /// </summary>
    [DataContract]
        public partial class LiveStreamResponse :  IEquatable<LiveStreamResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveStreamResponse" /> class.
        /// </summary>
        /// <param name="mediaSource">mediaSource.</param>
        public LiveStreamResponse(MediaSourceInfo mediaSource = default(MediaSourceInfo))
        {
            this.MediaSource = mediaSource;
        }
        
        /// <summary>
        /// Gets or Sets MediaSource
        /// </summary>
        [DataMember(Name="MediaSource", EmitDefaultValue=false)]
        public MediaSourceInfo MediaSource { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveStreamResponse {\n");
            sb.Append("  MediaSource: ").Append(MediaSource).Append("\n");
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
            return this.Equals(input as LiveStreamResponse);
        }

        /// <summary>
        /// Returns true if LiveStreamResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveStreamResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveStreamResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MediaSource == input.MediaSource ||
                    (this.MediaSource != null &&
                    this.MediaSource.Equals(input.MediaSource))
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
                if (this.MediaSource != null)
                    hashCode = hashCode * 59 + this.MediaSource.GetHashCode();
                return hashCode;
            }
        }

    }
}
