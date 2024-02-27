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
    /// ExternalIdInfo
    /// </summary>
    [DataContract]
        public partial class ExternalIdInfo :  IEquatable<ExternalIdInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExternalIdInfo" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="key">The key..</param>
        /// <param name="website">website.</param>
        /// <param name="urlFormatString">The URL format string..</param>
        /// <param name="isSupportedAsIdentifier">isSupportedAsIdentifier.</param>
        public ExternalIdInfo(string name = default(string), string key = default(string), string website = default(string), string urlFormatString = default(string), bool? isSupportedAsIdentifier = default(bool?))
        {
            this.Name = name;
            this.Key = key;
            this.Website = website;
            this.UrlFormatString = urlFormatString;
            this.IsSupportedAsIdentifier = isSupportedAsIdentifier;
        }
        
        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The key.
        /// </summary>
        /// <value>The key.</value>
        [DataMember(Name="Key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets Website
        /// </summary>
        [DataMember(Name="Website", EmitDefaultValue=false)]
        public string Website { get; set; }

        /// <summary>
        /// The URL format string.
        /// </summary>
        /// <value>The URL format string.</value>
        [DataMember(Name="UrlFormatString", EmitDefaultValue=false)]
        public string UrlFormatString { get; set; }

        /// <summary>
        /// Gets or Sets IsSupportedAsIdentifier
        /// </summary>
        [DataMember(Name="IsSupportedAsIdentifier", EmitDefaultValue=false)]
        public bool? IsSupportedAsIdentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ExternalIdInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
            sb.Append("  UrlFormatString: ").Append(UrlFormatString).Append("\n");
            sb.Append("  IsSupportedAsIdentifier: ").Append(IsSupportedAsIdentifier).Append("\n");
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
            return this.Equals(input as ExternalIdInfo);
        }

        /// <summary>
        /// Returns true if ExternalIdInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ExternalIdInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExternalIdInfo input)
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
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Website == input.Website ||
                    (this.Website != null &&
                    this.Website.Equals(input.Website))
                ) && 
                (
                    this.UrlFormatString == input.UrlFormatString ||
                    (this.UrlFormatString != null &&
                    this.UrlFormatString.Equals(input.UrlFormatString))
                ) && 
                (
                    this.IsSupportedAsIdentifier == input.IsSupportedAsIdentifier ||
                    (this.IsSupportedAsIdentifier != null &&
                    this.IsSupportedAsIdentifier.Equals(input.IsSupportedAsIdentifier))
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
                if (this.Key != null)
                    hashCode = hashCode * 59 + this.Key.GetHashCode();
                if (this.Website != null)
                    hashCode = hashCode * 59 + this.Website.GetHashCode();
                if (this.UrlFormatString != null)
                    hashCode = hashCode * 59 + this.UrlFormatString.GetHashCode();
                if (this.IsSupportedAsIdentifier != null)
                    hashCode = hashCode * 59 + this.IsSupportedAsIdentifier.GetHashCode();
                return hashCode;
            }
        }

    }
}
