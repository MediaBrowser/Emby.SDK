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
    /// SecurityAttestationReply
    /// </summary>
    [DataContract]
        public partial class SecurityAttestationReply :  IEquatable<SecurityAttestationReply>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityAttestationReply" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="requestId">requestId.</param>
        /// <param name="appAttestation">appAttestation.</param>
        public SecurityAttestationReply(string type = default(string), string requestId = default(string), string appAttestation = default(string))
        {
            this.type = type;
            this.requestId = requestId;
            this.appAttestation = appAttestation;
        }
        
        /// <summary>
        /// Gets or Sets type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string type { get; set; }

        /// <summary>
        /// Gets or Sets requestId
        /// </summary>
        [DataMember(Name="requestId", EmitDefaultValue=false)]
        public string requestId { get; set; }

        /// <summary>
        /// Gets or Sets appAttestation
        /// </summary>
        [DataMember(Name="appAttestation", EmitDefaultValue=false)]
        public string appAttestation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecurityAttestationReply {\n");
            sb.Append("  type: ").Append(type).Append("\n");
            sb.Append("  requestId: ").Append(requestId).Append("\n");
            sb.Append("  appAttestation: ").Append(appAttestation).Append("\n");
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
            return this.Equals(input as SecurityAttestationReply);
        }

        /// <summary>
        /// Returns true if SecurityAttestationReply instances are equal
        /// </summary>
        /// <param name="input">Instance of SecurityAttestationReply to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecurityAttestationReply input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.type == input.type ||
                    (this.type != null &&
                    this.type.Equals(input.type))
                ) && 
                (
                    this.requestId == input.requestId ||
                    (this.requestId != null &&
                    this.requestId.Equals(input.requestId))
                ) && 
                (
                    this.appAttestation == input.appAttestation ||
                    (this.appAttestation != null &&
                    this.appAttestation.Equals(input.appAttestation))
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
                if (this.type != null)
                    hashCode = hashCode * 59 + this.type.GetHashCode();
                if (this.requestId != null)
                    hashCode = hashCode * 59 + this.requestId.GetHashCode();
                if (this.appAttestation != null)
                    hashCode = hashCode * 59 + this.appAttestation.GetHashCode();
                return hashCode;
            }
        }

    }
}
