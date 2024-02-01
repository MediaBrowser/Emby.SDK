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
    /// Class CountryInfo  
    /// </summary>
    [DataContract]
        public partial class GlobalizationCountryInfo :  IEquatable<GlobalizationCountryInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GlobalizationCountryInfo" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="displayName">The display name..</param>
        /// <param name="englishName">The English name..</param>
        /// <param name="twoLetterISORegionName">The name of the two letter ISO region..</param>
        /// <param name="threeLetterISORegionName">The name of the three letter ISO region..</param>
        public GlobalizationCountryInfo(string name = default(string), string displayName = default(string), string englishName = default(string), string twoLetterISORegionName = default(string), string threeLetterISORegionName = default(string))
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.EnglishName = englishName;
            this.TwoLetterISORegionName = twoLetterISORegionName;
            this.ThreeLetterISORegionName = threeLetterISORegionName;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The display name.
        /// </summary>
        /// <value>The display name.</value>
        [DataMember(Name="DisplayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The English name.
        /// </summary>
        /// <value>The English name.</value>
        [DataMember(Name="EnglishName", EmitDefaultValue=false)]
        public string EnglishName { get; set; }

        /// <summary>
        /// The name of the two letter ISO region.
        /// </summary>
        /// <value>The name of the two letter ISO region.</value>
        [DataMember(Name="TwoLetterISORegionName", EmitDefaultValue=false)]
        public string TwoLetterISORegionName { get; set; }

        /// <summary>
        /// The name of the three letter ISO region.
        /// </summary>
        /// <value>The name of the three letter ISO region.</value>
        [DataMember(Name="ThreeLetterISORegionName", EmitDefaultValue=false)]
        public string ThreeLetterISORegionName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GlobalizationCountryInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  EnglishName: ").Append(EnglishName).Append("\n");
            sb.Append("  TwoLetterISORegionName: ").Append(TwoLetterISORegionName).Append("\n");
            sb.Append("  ThreeLetterISORegionName: ").Append(ThreeLetterISORegionName).Append("\n");
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
            return this.Equals(input as GlobalizationCountryInfo);
        }

        /// <summary>
        /// Returns true if GlobalizationCountryInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of GlobalizationCountryInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GlobalizationCountryInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.EnglishName == input.EnglishName ||
                    (this.EnglishName != null &&
                    this.EnglishName.Equals(input.EnglishName))
                ) && 
                (
                    this.TwoLetterISORegionName == input.TwoLetterISORegionName ||
                    (this.TwoLetterISORegionName != null &&
                    this.TwoLetterISORegionName.Equals(input.TwoLetterISORegionName))
                ) && 
                (
                    this.ThreeLetterISORegionName == input.ThreeLetterISORegionName ||
                    (this.ThreeLetterISORegionName != null &&
                    this.ThreeLetterISORegionName.Equals(input.ThreeLetterISORegionName))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.EnglishName != null)
                    hashCode = hashCode * 59 + this.EnglishName.GetHashCode();
                if (this.TwoLetterISORegionName != null)
                    hashCode = hashCode * 59 + this.TwoLetterISORegionName.GetHashCode();
                if (this.ThreeLetterISORegionName != null)
                    hashCode = hashCode * 59 + this.ThreeLetterISORegionName.GetHashCode();
                return hashCode;
            }
        }

    }
}
