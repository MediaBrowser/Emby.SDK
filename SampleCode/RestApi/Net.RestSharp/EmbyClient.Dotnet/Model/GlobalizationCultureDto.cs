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
    /// Class CultureDto  
    /// </summary>
    [DataContract]
        public partial class GlobalizationCultureDto :  IEquatable<GlobalizationCultureDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GlobalizationCultureDto" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="displayName">The display name..</param>
        /// <param name="twoLetterISOLanguageName">The name of the two letter ISO language..</param>
        /// <param name="threeLetterISOLanguageName">The name of the three letter ISO language..</param>
        /// <param name="threeLetterISOLanguageNames">threeLetterISOLanguageNames.</param>
        /// <param name="twoLetterISOLanguageNames">twoLetterISOLanguageNames.</param>
        public GlobalizationCultureDto(string name = default(string), string displayName = default(string), string twoLetterISOLanguageName = default(string), string threeLetterISOLanguageName = default(string), List<string> threeLetterISOLanguageNames = default(List<string>), List<string> twoLetterISOLanguageNames = default(List<string>))
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.TwoLetterISOLanguageName = twoLetterISOLanguageName;
            this.ThreeLetterISOLanguageName = threeLetterISOLanguageName;
            this.ThreeLetterISOLanguageNames = threeLetterISOLanguageNames;
            this.TwoLetterISOLanguageNames = twoLetterISOLanguageNames;
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
        /// The name of the two letter ISO language.
        /// </summary>
        /// <value>The name of the two letter ISO language.</value>
        [DataMember(Name="TwoLetterISOLanguageName", EmitDefaultValue=false)]
        public string TwoLetterISOLanguageName { get; set; }

        /// <summary>
        /// The name of the three letter ISO language.
        /// </summary>
        /// <value>The name of the three letter ISO language.</value>
        [DataMember(Name="ThreeLetterISOLanguageName", EmitDefaultValue=false)]
        public string ThreeLetterISOLanguageName { get; set; }

        /// <summary>
        /// Gets or Sets ThreeLetterISOLanguageNames
        /// </summary>
        [DataMember(Name="ThreeLetterISOLanguageNames", EmitDefaultValue=false)]
        public List<string> ThreeLetterISOLanguageNames { get; set; }

        /// <summary>
        /// Gets or Sets TwoLetterISOLanguageNames
        /// </summary>
        [DataMember(Name="TwoLetterISOLanguageNames", EmitDefaultValue=false)]
        public List<string> TwoLetterISOLanguageNames { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GlobalizationCultureDto {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  TwoLetterISOLanguageName: ").Append(TwoLetterISOLanguageName).Append("\n");
            sb.Append("  ThreeLetterISOLanguageName: ").Append(ThreeLetterISOLanguageName).Append("\n");
            sb.Append("  ThreeLetterISOLanguageNames: ").Append(ThreeLetterISOLanguageNames).Append("\n");
            sb.Append("  TwoLetterISOLanguageNames: ").Append(TwoLetterISOLanguageNames).Append("\n");
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
            return this.Equals(input as GlobalizationCultureDto);
        }

        /// <summary>
        /// Returns true if GlobalizationCultureDto instances are equal
        /// </summary>
        /// <param name="input">Instance of GlobalizationCultureDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GlobalizationCultureDto input)
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
                    this.TwoLetterISOLanguageName == input.TwoLetterISOLanguageName ||
                    (this.TwoLetterISOLanguageName != null &&
                    this.TwoLetterISOLanguageName.Equals(input.TwoLetterISOLanguageName))
                ) && 
                (
                    this.ThreeLetterISOLanguageName == input.ThreeLetterISOLanguageName ||
                    (this.ThreeLetterISOLanguageName != null &&
                    this.ThreeLetterISOLanguageName.Equals(input.ThreeLetterISOLanguageName))
                ) && 
                (
                    this.ThreeLetterISOLanguageNames == input.ThreeLetterISOLanguageNames ||
                    this.ThreeLetterISOLanguageNames != null &&
                    input.ThreeLetterISOLanguageNames != null &&
                    this.ThreeLetterISOLanguageNames.SequenceEqual(input.ThreeLetterISOLanguageNames)
                ) && 
                (
                    this.TwoLetterISOLanguageNames == input.TwoLetterISOLanguageNames ||
                    this.TwoLetterISOLanguageNames != null &&
                    input.TwoLetterISOLanguageNames != null &&
                    this.TwoLetterISOLanguageNames.SequenceEqual(input.TwoLetterISOLanguageNames)
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
                if (this.TwoLetterISOLanguageName != null)
                    hashCode = hashCode * 59 + this.TwoLetterISOLanguageName.GetHashCode();
                if (this.ThreeLetterISOLanguageName != null)
                    hashCode = hashCode * 59 + this.ThreeLetterISOLanguageName.GetHashCode();
                if (this.ThreeLetterISOLanguageNames != null)
                    hashCode = hashCode * 59 + this.ThreeLetterISOLanguageNames.GetHashCode();
                if (this.TwoLetterISOLanguageNames != null)
                    hashCode = hashCode * 59 + this.TwoLetterISOLanguageNames.GetHashCode();
                return hashCode;
            }
        }

    }
}
