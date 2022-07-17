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
    /// DlnaSubtitleProfile
    /// </summary>
    [DataContract]
        public partial class DlnaSubtitleProfile :  IEquatable<DlnaSubtitleProfile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaSubtitleProfile" /> class.
        /// </summary>
        /// <param name="format">format.</param>
        /// <param name="method">method.</param>
        /// <param name="didlMode">didlMode.</param>
        /// <param name="language">language.</param>
        /// <param name="container">container.</param>
        /// <param name="protocol">protocol.</param>
        public DlnaSubtitleProfile(string format = default(string), DlnaSubtitleDeliveryMethod method = default(DlnaSubtitleDeliveryMethod), string didlMode = default(string), string language = default(string), string container = default(string), string protocol = default(string))
        {
            this.Format = format;
            this.Method = method;
            this.DidlMode = didlMode;
            this.Language = language;
            this.Container = container;
            this.Protocol = protocol;
        }
        
        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="Format", EmitDefaultValue=false)]
        public string Format { get; set; }

        /// <summary>
        /// Gets or Sets Method
        /// </summary>
        [DataMember(Name="Method", EmitDefaultValue=false)]
        public DlnaSubtitleDeliveryMethod Method { get; set; }

        /// <summary>
        /// Gets or Sets DidlMode
        /// </summary>
        [DataMember(Name="DidlMode", EmitDefaultValue=false)]
        public string DidlMode { get; set; }

        /// <summary>
        /// Gets or Sets Language
        /// </summary>
        [DataMember(Name="Language", EmitDefaultValue=false)]
        public string Language { get; set; }

        /// <summary>
        /// Gets or Sets Container
        /// </summary>
        [DataMember(Name="Container", EmitDefaultValue=false)]
        public string Container { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public string Protocol { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DlnaSubtitleProfile {\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  DidlMode: ").Append(DidlMode).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Container: ").Append(Container).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
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
            return this.Equals(input as DlnaSubtitleProfile);
        }

        /// <summary>
        /// Returns true if DlnaSubtitleProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of DlnaSubtitleProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DlnaSubtitleProfile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Format == input.Format ||
                    (this.Format != null &&
                    this.Format.Equals(input.Format))
                ) && 
                (
                    this.Method == input.Method ||
                    (this.Method != null &&
                    this.Method.Equals(input.Method))
                ) && 
                (
                    this.DidlMode == input.DidlMode ||
                    (this.DidlMode != null &&
                    this.DidlMode.Equals(input.DidlMode))
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.Container == input.Container ||
                    (this.Container != null &&
                    this.Container.Equals(input.Container))
                ) && 
                (
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
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
                if (this.Format != null)
                    hashCode = hashCode * 59 + this.Format.GetHashCode();
                if (this.Method != null)
                    hashCode = hashCode * 59 + this.Method.GetHashCode();
                if (this.DidlMode != null)
                    hashCode = hashCode * 59 + this.DidlMode.GetHashCode();
                if (this.Language != null)
                    hashCode = hashCode * 59 + this.Language.GetHashCode();
                if (this.Container != null)
                    hashCode = hashCode * 59 + this.Container.GetHashCode();
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                return hashCode;
            }
        }

    }
}
