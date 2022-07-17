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
    /// EmbyMediaModelTypesBitRate
    /// </summary>
    [DataContract]
        public partial class EmbyMediaModelTypesBitRate :  IEquatable<EmbyMediaModelTypesBitRate>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyMediaModelTypesBitRate" /> class.
        /// </summary>
        /// <param name="bps">bps.</param>
        /// <param name="kbps">kbps.</param>
        /// <param name="mbps">mbps.</param>
        public EmbyMediaModelTypesBitRate(long? bps = default(long?), double? kbps = default(double?), double? mbps = default(double?))
        {
            this.Bps = bps;
            this.Kbps = kbps;
            this.Mbps = mbps;
        }
        
        /// <summary>
        /// Gets or Sets Bps
        /// </summary>
        [DataMember(Name="bps", EmitDefaultValue=false)]
        public long? Bps { get; set; }

        /// <summary>
        /// Gets or Sets Kbps
        /// </summary>
        [DataMember(Name="kbps", EmitDefaultValue=false)]
        public double? Kbps { get; set; }

        /// <summary>
        /// Gets or Sets Mbps
        /// </summary>
        [DataMember(Name="Mbps", EmitDefaultValue=false)]
        public double? Mbps { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyMediaModelTypesBitRate {\n");
            sb.Append("  Bps: ").Append(Bps).Append("\n");
            sb.Append("  Kbps: ").Append(Kbps).Append("\n");
            sb.Append("  Mbps: ").Append(Mbps).Append("\n");
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
            return this.Equals(input as EmbyMediaModelTypesBitRate);
        }

        /// <summary>
        /// Returns true if EmbyMediaModelTypesBitRate instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyMediaModelTypesBitRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyMediaModelTypesBitRate input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Bps == input.Bps ||
                    (this.Bps != null &&
                    this.Bps.Equals(input.Bps))
                ) && 
                (
                    this.Kbps == input.Kbps ||
                    (this.Kbps != null &&
                    this.Kbps.Equals(input.Kbps))
                ) && 
                (
                    this.Mbps == input.Mbps ||
                    (this.Mbps != null &&
                    this.Mbps.Equals(input.Mbps))
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
                if (this.Bps != null)
                    hashCode = hashCode * 59 + this.Bps.GetHashCode();
                if (this.Kbps != null)
                    hashCode = hashCode * 59 + this.Kbps.GetHashCode();
                if (this.Mbps != null)
                    hashCode = hashCode * 59 + this.Mbps.GetHashCode();
                return hashCode;
            }
        }

    }
}
