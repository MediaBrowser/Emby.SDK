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
    /// Class for unified presentation of all information associated with a specific codec level.  
    /// </summary>
    [DataContract]
        public partial class LevelInformation :  IEquatable<LevelInformation>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LevelInformation" /> class.
        /// </summary>
        /// <param name="shortName">The enum member name of the level..</param>
        /// <param name="description">The common name of the level..</param>
        /// <param name="ordinal">A value indicating the level&#x27;s ranking relative to other levels..</param>
        /// <param name="maxBitRate">maxBitRate.</param>
        /// <param name="maxBitRateDisplay">A display value of the &#x60;Emby.Media.Model.Types.LevelInformation.MaxBitRate&#x60; property..</param>
        /// <param name="id">A unique identifier..</param>
        /// <param name="resolutionRates">Examples for the maximum supported combinations of resolution and rate for this level..</param>
        /// <param name="resolutionRateStrings">Examples for the maximum supported combinations of resolution and rate for this level as string values..</param>
        /// <param name="resolutionRatesDisplay">A single string from the &#x60;Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings&#x60; list..</param>
        public LevelInformation(string shortName = default(string), string description = default(string), int? ordinal = default(int?), BitRate maxBitRate = default(BitRate), string maxBitRateDisplay = default(string), string id = default(string), List<ResolutionWithRate> resolutionRates = default(List<ResolutionWithRate>), List<string> resolutionRateStrings = default(List<string>), string resolutionRatesDisplay = default(string))
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
        /// The enum member name of the level.
        /// </summary>
        /// <value>The enum member name of the level.</value>
        [DataMember(Name="ShortName", EmitDefaultValue=false)]
        public string ShortName { get; set; }

        /// <summary>
        /// The common name of the level.
        /// </summary>
        /// <value>The common name of the level.</value>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// A value indicating the level&#x27;s ranking relative to other levels.
        /// </summary>
        /// <value>A value indicating the level&#x27;s ranking relative to other levels.</value>
        [DataMember(Name="Ordinal", EmitDefaultValue=false)]
        public int? Ordinal { get; set; }

        /// <summary>
        /// Gets or Sets MaxBitRate
        /// </summary>
        [DataMember(Name="MaxBitRate", EmitDefaultValue=false)]
        public BitRate MaxBitRate { get; set; }

        /// <summary>
        /// A display value of the &#x60;Emby.Media.Model.Types.LevelInformation.MaxBitRate&#x60; property.
        /// </summary>
        /// <value>A display value of the &#x60;Emby.Media.Model.Types.LevelInformation.MaxBitRate&#x60; property.</value>
        [DataMember(Name="MaxBitRateDisplay", EmitDefaultValue=false)]
        public string MaxBitRateDisplay { get; set; }

        /// <summary>
        /// A unique identifier.
        /// </summary>
        /// <value>A unique identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Examples for the maximum supported combinations of resolution and rate for this level.
        /// </summary>
        /// <value>Examples for the maximum supported combinations of resolution and rate for this level.</value>
        [DataMember(Name="ResolutionRates", EmitDefaultValue=false)]
        public List<ResolutionWithRate> ResolutionRates { get; set; }

        /// <summary>
        /// Examples for the maximum supported combinations of resolution and rate for this level as string values.
        /// </summary>
        /// <value>Examples for the maximum supported combinations of resolution and rate for this level as string values.</value>
        [DataMember(Name="ResolutionRateStrings", EmitDefaultValue=false)]
        public List<string> ResolutionRateStrings { get; set; }

        /// <summary>
        /// A single string from the &#x60;Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings&#x60; list.
        /// </summary>
        /// <value>A single string from the &#x60;Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings&#x60; list.</value>
        [DataMember(Name="ResolutionRatesDisplay", EmitDefaultValue=false)]
        public string ResolutionRatesDisplay { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LevelInformation {\n");
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
            return this.Equals(input as LevelInformation);
        }

        /// <summary>
        /// Returns true if LevelInformation instances are equal
        /// </summary>
        /// <param name="input">Instance of LevelInformation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LevelInformation input)
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
