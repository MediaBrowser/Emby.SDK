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
    /// LiveTVApiSetChannelDisabled
    /// </summary>
    [DataContract]
        public partial class LiveTVApiSetChannelDisabled :  IEquatable<LiveTVApiSetChannelDisabled>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTVApiSetChannelDisabled" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="managementId">managementId.</param>
        /// <param name="disabled">disabled.</param>
        public LiveTVApiSetChannelDisabled(string id = default(string), string managementId = default(string), bool? disabled = default(bool?))
        {
            this.Id = id;
            this.ManagementId = managementId;
            this.Disabled = disabled;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ManagementId
        /// </summary>
        [DataMember(Name="ManagementId", EmitDefaultValue=false)]
        public string ManagementId { get; set; }

        /// <summary>
        /// Gets or Sets Disabled
        /// </summary>
        [DataMember(Name="Disabled", EmitDefaultValue=false)]
        public bool? Disabled { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTVApiSetChannelDisabled {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ManagementId: ").Append(ManagementId).Append("\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
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
            return this.Equals(input as LiveTVApiSetChannelDisabled);
        }

        /// <summary>
        /// Returns true if LiveTVApiSetChannelDisabled instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTVApiSetChannelDisabled to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTVApiSetChannelDisabled input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ManagementId == input.ManagementId ||
                    (this.ManagementId != null &&
                    this.ManagementId.Equals(input.ManagementId))
                ) && 
                (
                    this.Disabled == input.Disabled ||
                    (this.Disabled != null &&
                    this.Disabled.Equals(input.Disabled))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ManagementId != null)
                    hashCode = hashCode * 59 + this.ManagementId.GetHashCode();
                if (this.Disabled != null)
                    hashCode = hashCode * 59 + this.Disabled.GetHashCode();
                return hashCode;
            }
        }

    }
}
