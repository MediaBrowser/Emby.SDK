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
    /// MetadataEditorInfo
    /// </summary>
    [DataContract]
        public partial class MetadataEditorInfo :  IEquatable<MetadataEditorInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEditorInfo" /> class.
        /// </summary>
        /// <param name="parentalRatingOptions">parentalRatingOptions.</param>
        /// <param name="countries">countries.</param>
        /// <param name="cultures">cultures.</param>
        /// <param name="externalIdInfos">externalIdInfos.</param>
        /// <param name="personExternalIdInfos">personExternalIdInfos.</param>
        public MetadataEditorInfo(List<ParentalRating> parentalRatingOptions = default(List<ParentalRating>), List<GlobalizationCountryInfo> countries = default(List<GlobalizationCountryInfo>), List<GlobalizationCultureDto> cultures = default(List<GlobalizationCultureDto>), List<ExternalIdInfo> externalIdInfos = default(List<ExternalIdInfo>), List<ExternalIdInfo> personExternalIdInfos = default(List<ExternalIdInfo>))
        {
            this.ParentalRatingOptions = parentalRatingOptions;
            this.Countries = countries;
            this.Cultures = cultures;
            this.ExternalIdInfos = externalIdInfos;
            this.PersonExternalIdInfos = personExternalIdInfos;
        }
        
        /// <summary>
        /// Gets or Sets ParentalRatingOptions
        /// </summary>
        [DataMember(Name="ParentalRatingOptions", EmitDefaultValue=false)]
        public List<ParentalRating> ParentalRatingOptions { get; set; }

        /// <summary>
        /// Gets or Sets Countries
        /// </summary>
        [DataMember(Name="Countries", EmitDefaultValue=false)]
        public List<GlobalizationCountryInfo> Countries { get; set; }

        /// <summary>
        /// Gets or Sets Cultures
        /// </summary>
        [DataMember(Name="Cultures", EmitDefaultValue=false)]
        public List<GlobalizationCultureDto> Cultures { get; set; }

        /// <summary>
        /// Gets or Sets ExternalIdInfos
        /// </summary>
        [DataMember(Name="ExternalIdInfos", EmitDefaultValue=false)]
        public List<ExternalIdInfo> ExternalIdInfos { get; set; }

        /// <summary>
        /// Gets or Sets PersonExternalIdInfos
        /// </summary>
        [DataMember(Name="PersonExternalIdInfos", EmitDefaultValue=false)]
        public List<ExternalIdInfo> PersonExternalIdInfos { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MetadataEditorInfo {\n");
            sb.Append("  ParentalRatingOptions: ").Append(ParentalRatingOptions).Append("\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
            sb.Append("  Cultures: ").Append(Cultures).Append("\n");
            sb.Append("  ExternalIdInfos: ").Append(ExternalIdInfos).Append("\n");
            sb.Append("  PersonExternalIdInfos: ").Append(PersonExternalIdInfos).Append("\n");
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
            return this.Equals(input as MetadataEditorInfo);
        }

        /// <summary>
        /// Returns true if MetadataEditorInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MetadataEditorInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MetadataEditorInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ParentalRatingOptions == input.ParentalRatingOptions ||
                    this.ParentalRatingOptions != null &&
                    input.ParentalRatingOptions != null &&
                    this.ParentalRatingOptions.SequenceEqual(input.ParentalRatingOptions)
                ) && 
                (
                    this.Countries == input.Countries ||
                    this.Countries != null &&
                    input.Countries != null &&
                    this.Countries.SequenceEqual(input.Countries)
                ) && 
                (
                    this.Cultures == input.Cultures ||
                    this.Cultures != null &&
                    input.Cultures != null &&
                    this.Cultures.SequenceEqual(input.Cultures)
                ) && 
                (
                    this.ExternalIdInfos == input.ExternalIdInfos ||
                    this.ExternalIdInfos != null &&
                    input.ExternalIdInfos != null &&
                    this.ExternalIdInfos.SequenceEqual(input.ExternalIdInfos)
                ) && 
                (
                    this.PersonExternalIdInfos == input.PersonExternalIdInfos ||
                    this.PersonExternalIdInfos != null &&
                    input.PersonExternalIdInfos != null &&
                    this.PersonExternalIdInfos.SequenceEqual(input.PersonExternalIdInfos)
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
                if (this.ParentalRatingOptions != null)
                    hashCode = hashCode * 59 + this.ParentalRatingOptions.GetHashCode();
                if (this.Countries != null)
                    hashCode = hashCode * 59 + this.Countries.GetHashCode();
                if (this.Cultures != null)
                    hashCode = hashCode * 59 + this.Cultures.GetHashCode();
                if (this.ExternalIdInfos != null)
                    hashCode = hashCode * 59 + this.ExternalIdInfos.GetHashCode();
                if (this.PersonExternalIdInfos != null)
                    hashCode = hashCode * 59 + this.PersonExternalIdInfos.GetHashCode();
                return hashCode;
            }
        }

    }
}
