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
    /// EmbyMediaModelTypesLevelInformation
    /// </summary>
    [DataContract]
        public partial class EmbyMediaModelTypesLevelInformation :  IEquatable<EmbyMediaModelTypesLevelInformation>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyMediaModelTypesLevelInformation" /> class.
        /// </summary>
        /// <param name="shortName">shortName.</param>
        /// <param name="description">description.</param>
        /// <param name="ordinal">ordinal.</param>
        /// <param name="maxBitRate">maxBitRate.</param>
        /// <param name="maxBitRateDisplay">maxBitRateDisplay.</param>
        /// <param name="id">id.</param>
        /// <param name="resolutionRates">resolutionRates.</param>
        /// <param name="resolutionRateStrings">resolutionRateStrings.</param>
        /// <param name="resolutionRatesDisplay">resolutionRatesDisplay.</param>
        public EmbyMediaModelTypesLevelInformation(string shortName = default(string), string description = default(string), int? ordinal = default(int?), EmbyMediaModelTypesBitRate maxBitRate = default(EmbyMediaModelTypesBitRate), string maxBitRateDisplay = default(string), string id = default(string), List<EmbyMediaModelTypesResolutionWithRate> resolutionRates = default(List<EmbyMediaModelTypesResolutionWithRate>), List<string> resolutionRateStrings = default(List<string>), string resolutionRatesDisplay = default(string))
        {
            this.ShortName = shortName;
            this.Description = description;
            this.Ordinal = ordinal;
            this.MaxBitRate = maxBitRate;
            this.MaxBitRateDisplay = maxBitRateDisplay;
            this.Id = id;
            this.ResolutionRates = resolutionRates;
            this.ResolutionRateStrings = resolutionRateStrings;
            this.ResolutionRatesDisplay = resolutionRatesDisplay;
        }
        
        /// <summary>
        /// Gets or Sets ShortName
        /// </summary>
        [DataMember(Name="ShortName", EmitDefaultValue=false)]
        public string ShortName { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Ordinal
        /// </summary>
        [DataMember(Name="Ordinal", EmitDefaultValue=false)]
        public int? Ordinal { get; set; }

        /// <summary>
        /// Gets or Sets MaxBitRate
        /// </summary>
        [DataMember(Name="MaxBitRate", EmitDefaultValue=false)]
        public EmbyMediaModelTypesBitRate MaxBitRate { get; set; }

        /// <summary>
        /// Gets or Sets MaxBitRateDisplay
        /// </summary>
        [DataMember(Name="MaxBitRateDisplay", EmitDefaultValue=false)]
        public string MaxBitRateDisplay { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ResolutionRates
        /// </summary>
        [DataMember(Name="ResolutionRates", EmitDefaultValue=false)]
        public List<EmbyMediaModelTypesResolutionWithRate> ResolutionRates { get; set; }

        /// <summary>
        /// Gets or Sets ResolutionRateStrings
        /// </summary>
        [DataMember(Name="ResolutionRateStrings", EmitDefaultValue=false)]
        public List<string> ResolutionRateStrings { get; set; }

        /// <summary>
        /// Gets or Sets ResolutionRatesDisplay
        /// </summary>
        [DataMember(Name="ResolutionRatesDisplay", EmitDefaultValue=false)]
        public string ResolutionRatesDisplay { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyMediaModelTypesLevelInformation {\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Ordinal: ").Append(Ordinal).Append("\n");
            sb.Append("  MaxBitRate: ").Append(MaxBitRate).Append("\n");
            sb.Append("  MaxBitRateDisplay: ").Append(MaxBitRateDisplay).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ResolutionRates: ").Append(ResolutionRates).Append("\n");
            sb.Append("  ResolutionRateStrings: ").Append(ResolutionRateStrings).Append("\n");
            sb.Append("  ResolutionRatesDisplay: ").Append(ResolutionRatesDisplay).Append("\n");
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
            return this.Equals(input as EmbyMediaModelTypesLevelInformation);
        }

        /// <summary>
        /// Returns true if EmbyMediaModelTypesLevelInformation instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyMediaModelTypesLevelInformation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyMediaModelTypesLevelInformation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ShortName == input.ShortName ||
                    (this.ShortName != null &&
                    this.ShortName.Equals(input.ShortName))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Ordinal == input.Ordinal ||
                    (this.Ordinal != null &&
                    this.Ordinal.Equals(input.Ordinal))
                ) && 
                (
                    this.MaxBitRate == input.MaxBitRate ||
                    (this.MaxBitRate != null &&
                    this.MaxBitRate.Equals(input.MaxBitRate))
                ) && 
                (
                    this.MaxBitRateDisplay == input.MaxBitRateDisplay ||
                    (this.MaxBitRateDisplay != null &&
                    this.MaxBitRateDisplay.Equals(input.MaxBitRateDisplay))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ResolutionRates == input.ResolutionRates ||
                    this.ResolutionRates != null &&
                    input.ResolutionRates != null &&
                    this.ResolutionRates.SequenceEqual(input.ResolutionRates)
                ) && 
                (
                    this.ResolutionRateStrings == input.ResolutionRateStrings ||
                    this.ResolutionRateStrings != null &&
                    input.ResolutionRateStrings != null &&
                    this.ResolutionRateStrings.SequenceEqual(input.ResolutionRateStrings)
                ) && 
                (
                    this.ResolutionRatesDisplay == input.ResolutionRatesDisplay ||
                    (this.ResolutionRatesDisplay != null &&
                    this.ResolutionRatesDisplay.Equals(input.ResolutionRatesDisplay))
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
                if (this.ShortName != null)
                    hashCode = hashCode * 59 + this.ShortName.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Ordinal != null)
                    hashCode = hashCode * 59 + this.Ordinal.GetHashCode();
                if (this.MaxBitRate != null)
                    hashCode = hashCode * 59 + this.MaxBitRate.GetHashCode();
                if (this.MaxBitRateDisplay != null)
                    hashCode = hashCode * 59 + this.MaxBitRateDisplay.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ResolutionRates != null)
                    hashCode = hashCode * 59 + this.ResolutionRates.GetHashCode();
                if (this.ResolutionRateStrings != null)
                    hashCode = hashCode * 59 + this.ResolutionRateStrings.GetHashCode();
                if (this.ResolutionRatesDisplay != null)
                    hashCode = hashCode * 59 + this.ResolutionRatesDisplay.GetHashCode();
                return hashCode;
            }
        }

    }
}
