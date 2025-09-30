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
    /// A type for handling bit rates.      The purpose of this type is to avoid manual calculations and conversions in code,             unified handling and conversion as well as presentation through its various To\\*\\*\\*String methods.      &#x60;System.IComparable&#x60;      &#x60;System.IEquatable&#x60;1&#x60;  
    /// </summary>
    [DataContract]
        public partial class BitRate :  IEquatable<BitRate>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BitRate" /> class.
        /// </summary>
        /// <param name="bps">bps.</param>
        /// <param name="kbps">kbps.</param>
        /// <param name="mbps">mbps.</param>
        public BitRate(long? bps = default(long?), double? kbps = default(double?), double? mbps = default(double?))
        {
            this.bps = bps;
            this.kbps = kbps;
            this.Mbps = mbps;
        }
        
        /// <summary>
        /// Gets or Sets bps
        /// </summary>
        [DataMember(Name="bps", EmitDefaultValue=false)]
        public long? bps { get; set; }

        /// <summary>
        /// Gets or Sets kbps
        /// </summary>
        [DataMember(Name="kbps", EmitDefaultValue=false)]
        public double? kbps { get; set; }

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
            sb.Append("class BitRate {\n");
            sb.Append("  bps: ").Append(bps).Append("\n");
            sb.Append("  kbps: ").Append(kbps).Append("\n");
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
            return this.Equals(input as BitRate);
        }

        /// <summary>
        /// Returns true if BitRate instances are equal
        /// </summary>
        /// <param name="input">Instance of BitRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BitRate input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.bps == input.bps ||
                    (this.bps != null &&
                    this.bps.Equals(input.bps))
                ) && 
                (
                    this.kbps == input.kbps ||
                    (this.kbps != null &&
                    this.kbps.Equals(input.kbps))
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
                if (this.bps != null)
                    hashCode = hashCode * 59 + this.bps.GetHashCode();
                if (this.kbps != null)
                    hashCode = hashCode * 59 + this.kbps.GetHashCode();
                if (this.Mbps != null)
                    hashCode = hashCode * 59 + this.Mbps.GetHashCode();
                return hashCode;
            }
        }

    }
}
