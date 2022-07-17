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
    /// EmbyDlnaProfilesProtocolInfoDetection
    /// </summary>
    [DataContract]
        public partial class EmbyDlnaProfilesProtocolInfoDetection :  IEquatable<EmbyDlnaProfilesProtocolInfoDetection>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyDlnaProfilesProtocolInfoDetection" /> class.
        /// </summary>
        /// <param name="enabledForVideo">enabledForVideo.</param>
        /// <param name="enabledForAudio">enabledForAudio.</param>
        /// <param name="enabledForPhotos">enabledForPhotos.</param>
        public EmbyDlnaProfilesProtocolInfoDetection(bool? enabledForVideo = default(bool?), bool? enabledForAudio = default(bool?), bool? enabledForPhotos = default(bool?))
        {
            this.EnabledForVideo = enabledForVideo;
            this.EnabledForAudio = enabledForAudio;
            this.EnabledForPhotos = enabledForPhotos;
        }
        
        /// <summary>
        /// Gets or Sets EnabledForVideo
        /// </summary>
        [DataMember(Name="EnabledForVideo", EmitDefaultValue=false)]
        public bool? EnabledForVideo { get; set; }

        /// <summary>
        /// Gets or Sets EnabledForAudio
        /// </summary>
        [DataMember(Name="EnabledForAudio", EmitDefaultValue=false)]
        public bool? EnabledForAudio { get; set; }

        /// <summary>
        /// Gets or Sets EnabledForPhotos
        /// </summary>
        [DataMember(Name="EnabledForPhotos", EmitDefaultValue=false)]
        public bool? EnabledForPhotos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyDlnaProfilesProtocolInfoDetection {\n");
            sb.Append("  EnabledForVideo: ").Append(EnabledForVideo).Append("\n");
            sb.Append("  EnabledForAudio: ").Append(EnabledForAudio).Append("\n");
            sb.Append("  EnabledForPhotos: ").Append(EnabledForPhotos).Append("\n");
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
            return this.Equals(input as EmbyDlnaProfilesProtocolInfoDetection);
        }

        /// <summary>
        /// Returns true if EmbyDlnaProfilesProtocolInfoDetection instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyDlnaProfilesProtocolInfoDetection to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyDlnaProfilesProtocolInfoDetection input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EnabledForVideo == input.EnabledForVideo ||
                    (this.EnabledForVideo != null &&
                    this.EnabledForVideo.Equals(input.EnabledForVideo))
                ) && 
                (
                    this.EnabledForAudio == input.EnabledForAudio ||
                    (this.EnabledForAudio != null &&
                    this.EnabledForAudio.Equals(input.EnabledForAudio))
                ) && 
                (
                    this.EnabledForPhotos == input.EnabledForPhotos ||
                    (this.EnabledForPhotos != null &&
                    this.EnabledForPhotos.Equals(input.EnabledForPhotos))
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
                if (this.EnabledForVideo != null)
                    hashCode = hashCode * 59 + this.EnabledForVideo.GetHashCode();
                if (this.EnabledForAudio != null)
                    hashCode = hashCode * 59 + this.EnabledForAudio.GetHashCode();
                if (this.EnabledForPhotos != null)
                    hashCode = hashCode * 59 + this.EnabledForPhotos.GetHashCode();
                return hashCode;
            }
        }

    }
}
