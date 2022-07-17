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
    /// ProvidersBookInfo
    /// </summary>
    [DataContract]
        public partial class ProvidersBookInfo :  IEquatable<ProvidersBookInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProvidersBookInfo" /> class.
        /// </summary>
        /// <param name="seriesName">seriesName.</param>
        /// <param name="name">name.</param>
        /// <param name="metadataLanguage">metadataLanguage.</param>
        /// <param name="metadataCountryCode">metadataCountryCode.</param>
        /// <param name="providerIds">providerIds.</param>
        /// <param name="year">year.</param>
        /// <param name="indexNumber">indexNumber.</param>
        /// <param name="parentIndexNumber">parentIndexNumber.</param>
        /// <param name="premiereDate">premiereDate.</param>
        /// <param name="isAutomated">isAutomated.</param>
        /// <param name="enableAdultMetadata">enableAdultMetadata.</param>
        public ProvidersBookInfo(string seriesName = default(string), string name = default(string), string metadataLanguage = default(string), string metadataCountryCode = default(string), ProviderIdDictionary providerIds = default(ProviderIdDictionary), int? year = default(int?), int? indexNumber = default(int?), int? parentIndexNumber = default(int?), DateTimeOffset? premiereDate = default(DateTimeOffset?), bool? isAutomated = default(bool?), bool? enableAdultMetadata = default(bool?))
        {
            this.SeriesName = seriesName;
            this.Name = name;
            this.MetadataLanguage = metadataLanguage;
            this.MetadataCountryCode = metadataCountryCode;
            this.ProviderIds = providerIds;
            this.Year = year;
            this.IndexNumber = indexNumber;
            this.ParentIndexNumber = parentIndexNumber;
            this.PremiereDate = premiereDate;
            this.IsAutomated = isAutomated;
            this.EnableAdultMetadata = enableAdultMetadata;
        }
        
        /// <summary>
        /// Gets or Sets SeriesName
        /// </summary>
        [DataMember(Name="SeriesName", EmitDefaultValue=false)]
        public string SeriesName { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets MetadataLanguage
        /// </summary>
        [DataMember(Name="MetadataLanguage", EmitDefaultValue=false)]
        public string MetadataLanguage { get; set; }

        /// <summary>
        /// Gets or Sets MetadataCountryCode
        /// </summary>
        [DataMember(Name="MetadataCountryCode", EmitDefaultValue=false)]
        public string MetadataCountryCode { get; set; }

        /// <summary>
        /// Gets or Sets ProviderIds
        /// </summary>
        [DataMember(Name="ProviderIds", EmitDefaultValue=false)]
        public ProviderIdDictionary ProviderIds { get; set; }

        /// <summary>
        /// Gets or Sets Year
        /// </summary>
        [DataMember(Name="Year", EmitDefaultValue=false)]
        public int? Year { get; set; }

        /// <summary>
        /// Gets or Sets IndexNumber
        /// </summary>
        [DataMember(Name="IndexNumber", EmitDefaultValue=false)]
        public int? IndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets ParentIndexNumber
        /// </summary>
        [DataMember(Name="ParentIndexNumber", EmitDefaultValue=false)]
        public int? ParentIndexNumber { get; set; }

        /// <summary>
        /// Gets or Sets PremiereDate
        /// </summary>
        [DataMember(Name="PremiereDate", EmitDefaultValue=false)]
        public DateTimeOffset? PremiereDate { get; set; }

        /// <summary>
        /// Gets or Sets IsAutomated
        /// </summary>
        [DataMember(Name="IsAutomated", EmitDefaultValue=false)]
        public bool? IsAutomated { get; set; }

        /// <summary>
        /// Gets or Sets EnableAdultMetadata
        /// </summary>
        [DataMember(Name="EnableAdultMetadata", EmitDefaultValue=false)]
        public bool? EnableAdultMetadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProvidersBookInfo {\n");
            sb.Append("  SeriesName: ").Append(SeriesName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MetadataLanguage: ").Append(MetadataLanguage).Append("\n");
            sb.Append("  MetadataCountryCode: ").Append(MetadataCountryCode).Append("\n");
            sb.Append("  ProviderIds: ").Append(ProviderIds).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
            sb.Append("  IndexNumber: ").Append(IndexNumber).Append("\n");
            sb.Append("  ParentIndexNumber: ").Append(ParentIndexNumber).Append("\n");
            sb.Append("  PremiereDate: ").Append(PremiereDate).Append("\n");
            sb.Append("  IsAutomated: ").Append(IsAutomated).Append("\n");
            sb.Append("  EnableAdultMetadata: ").Append(EnableAdultMetadata).Append("\n");
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
            return this.Equals(input as ProvidersBookInfo);
        }

        /// <summary>
        /// Returns true if ProvidersBookInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ProvidersBookInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProvidersBookInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SeriesName == input.SeriesName ||
                    (this.SeriesName != null &&
                    this.SeriesName.Equals(input.SeriesName))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.MetadataLanguage == input.MetadataLanguage ||
                    (this.MetadataLanguage != null &&
                    this.MetadataLanguage.Equals(input.MetadataLanguage))
                ) && 
                (
                    this.MetadataCountryCode == input.MetadataCountryCode ||
                    (this.MetadataCountryCode != null &&
                    this.MetadataCountryCode.Equals(input.MetadataCountryCode))
                ) && 
                (
                    this.ProviderIds == input.ProviderIds ||
                    (this.ProviderIds != null &&
                    this.ProviderIds.Equals(input.ProviderIds))
                ) && 
                (
                    this.Year == input.Year ||
                    (this.Year != null &&
                    this.Year.Equals(input.Year))
                ) && 
                (
                    this.IndexNumber == input.IndexNumber ||
                    (this.IndexNumber != null &&
                    this.IndexNumber.Equals(input.IndexNumber))
                ) && 
                (
                    this.ParentIndexNumber == input.ParentIndexNumber ||
                    (this.ParentIndexNumber != null &&
                    this.ParentIndexNumber.Equals(input.ParentIndexNumber))
                ) && 
                (
                    this.PremiereDate == input.PremiereDate ||
                    (this.PremiereDate != null &&
                    this.PremiereDate.Equals(input.PremiereDate))
                ) && 
                (
                    this.IsAutomated == input.IsAutomated ||
                    (this.IsAutomated != null &&
                    this.IsAutomated.Equals(input.IsAutomated))
                ) && 
                (
                    this.EnableAdultMetadata == input.EnableAdultMetadata ||
                    (this.EnableAdultMetadata != null &&
                    this.EnableAdultMetadata.Equals(input.EnableAdultMetadata))
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
                if (this.SeriesName != null)
                    hashCode = hashCode * 59 + this.SeriesName.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.MetadataLanguage != null)
                    hashCode = hashCode * 59 + this.MetadataLanguage.GetHashCode();
                if (this.MetadataCountryCode != null)
                    hashCode = hashCode * 59 + this.MetadataCountryCode.GetHashCode();
                if (this.ProviderIds != null)
                    hashCode = hashCode * 59 + this.ProviderIds.GetHashCode();
                if (this.Year != null)
                    hashCode = hashCode * 59 + this.Year.GetHashCode();
                if (this.IndexNumber != null)
                    hashCode = hashCode * 59 + this.IndexNumber.GetHashCode();
                if (this.ParentIndexNumber != null)
                    hashCode = hashCode * 59 + this.ParentIndexNumber.GetHashCode();
                if (this.PremiereDate != null)
                    hashCode = hashCode * 59 + this.PremiereDate.GetHashCode();
                if (this.IsAutomated != null)
                    hashCode = hashCode * 59 + this.IsAutomated.GetHashCode();
                if (this.EnableAdultMetadata != null)
                    hashCode = hashCode * 59 + this.EnableAdultMetadata.GetHashCode();
                return hashCode;
            }
        }

    }
}
