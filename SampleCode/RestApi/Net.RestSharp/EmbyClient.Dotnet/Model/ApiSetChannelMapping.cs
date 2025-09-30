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
    /// ApiSetChannelMapping
    /// </summary>
    [DataContract]
        public partial class ApiSetChannelMapping :  IEquatable<ApiSetChannelMapping>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiSetChannelMapping" /> class.
        /// </summary>
        /// <param name="tunerChannelId">tunerChannelId.</param>
        /// <param name="providerChannelId">providerChannelId.</param>
        public ApiSetChannelMapping(string tunerChannelId = default(string), string providerChannelId = default(string))
        {
            this.TunerChannelId = tunerChannelId;
            this.ProviderChannelId = providerChannelId;
        }
        
        /// <summary>
        /// Gets or Sets TunerChannelId
        /// </summary>
        [DataMember(Name="TunerChannelId", EmitDefaultValue=false)]
        public string TunerChannelId { get; set; }

        /// <summary>
        /// Gets or Sets ProviderChannelId
        /// </summary>
        [DataMember(Name="ProviderChannelId", EmitDefaultValue=false)]
        public string ProviderChannelId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiSetChannelMapping {\n");
            sb.Append("  TunerChannelId: ").Append(TunerChannelId).Append("\n");
            sb.Append("  ProviderChannelId: ").Append(ProviderChannelId).Append("\n");
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
            return this.Equals(input as ApiSetChannelMapping);
        }

        /// <summary>
        /// Returns true if ApiSetChannelMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiSetChannelMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiSetChannelMapping input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TunerChannelId == input.TunerChannelId ||
                    (this.TunerChannelId != null &&
                    this.TunerChannelId.Equals(input.TunerChannelId))
                ) && 
                (
                    this.ProviderChannelId == input.ProviderChannelId ||
                    (this.ProviderChannelId != null &&
                    this.ProviderChannelId.Equals(input.ProviderChannelId))
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
                if (this.TunerChannelId != null)
                    hashCode = hashCode * 59 + this.TunerChannelId.GetHashCode();
                if (this.ProviderChannelId != null)
                    hashCode = hashCode * 59 + this.ProviderChannelId.GetHashCode();
                return hashCode;
            }
        }

    }
}
