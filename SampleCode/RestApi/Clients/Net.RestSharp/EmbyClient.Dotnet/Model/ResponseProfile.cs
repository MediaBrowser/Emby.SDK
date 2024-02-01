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
    /// ResponseProfile
    /// </summary>
    [DataContract]
        public partial class ResponseProfile :  IEquatable<ResponseProfile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseProfile" /> class.
        /// </summary>
        /// <param name="container">container.</param>
        /// <param name="audioCodec">audioCodec.</param>
        /// <param name="videoCodec">videoCodec.</param>
        /// <param name="type">type.</param>
        /// <param name="orgPn">orgPn.</param>
        /// <param name="mimeType">mimeType.</param>
        /// <param name="conditions">conditions.</param>
        public ResponseProfile(string container = default(string), string audioCodec = default(string), string videoCodec = default(string), DlnaProfileType type = default(DlnaProfileType), string orgPn = default(string), string mimeType = default(string), List<ProfileCondition> conditions = default(List<ProfileCondition>))
        {
            this.Container = container;
            this.AudioCodec = audioCodec;
            this.VideoCodec = videoCodec;
            this.Type = type;
            this.OrgPn = orgPn;
            this.MimeType = mimeType;
            this.Conditions = conditions;
        }
        
        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets AudioCodec
        /// </summary>
        [DataMember(Name="AudioCodec", EmitDefaultValue=false)]
        public string AudioCodec { get; set; }

        /// <summary>
        /// Gets or Sets VideoCodec
        /// </summary>
        [DataMember(Name="VideoCodec", EmitDefaultValue=false)]
        public string VideoCodec { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public DlnaProfileType Type { get; set; }

        /// <summary>
        /// Gets or Sets OrgPn
        /// </summary>
        [DataMember(Name="OrgPn", EmitDefaultValue=false)]
        public string OrgPn { get; set; }

        /// <summary>
        /// Gets or Sets MimeType
        /// </summary>
        [DataMember(Name="MimeType", EmitDefaultValue=false)]
        public string MimeType { get; set; }

        /// <summary>
        /// Gets or Sets Conditions
        /// </summary>
        [DataMember(Name="Conditions", EmitDefaultValue=false)]
        public List<ProfileCondition> Conditions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ResponseProfile {\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  AudioCodec: ").Append(AudioCodec).Append("\n");
            sb.Append("  VideoCodec: ").Append(VideoCodec).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  OrgPn: ").Append(OrgPn).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  Conditions: ").Append(Conditions).Append("\n");
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
            return this.Equals(input as ResponseProfile);
        }

        /// <summary>
        /// Returns true if ResponseProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseProfile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.AudioCodec == input.AudioCodec ||
                    (this.AudioCodec != null &&
                    this.AudioCodec.Equals(input.AudioCodec))
                ) && 
                (
                    this.VideoCodec == input.VideoCodec ||
                    (this.VideoCodec != null &&
                    this.VideoCodec.Equals(input.VideoCodec))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.OrgPn == input.OrgPn ||
                    (this.OrgPn != null &&
                    this.OrgPn.Equals(input.OrgPn))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
                ) && 
                (
                    this.Conditions == input.Conditions ||
                    this.Conditions != null &&
                    input.Conditions != null &&
                    this.Conditions.SequenceEqual(input.Conditions)
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
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.AudioCodec != null)
                    hashCode = hashCode * 59 + this.AudioCodec.GetHashCode();
                if (this.VideoCodec != null)
                    hashCode = hashCode * 59 + this.VideoCodec.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.OrgPn != null)
                    hashCode = hashCode * 59 + this.OrgPn.GetHashCode();
                if (this.MimeType != null)
                    hashCode = hashCode * 59 + this.MimeType.GetHashCode();
                if (this.Conditions != null)
                    hashCode = hashCode * 59 + this.Conditions.GetHashCode();
                return hashCode;
            }
        }

    }
}
