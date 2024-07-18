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
    /// LibraryOptionInfo
    /// </summary>
    [DataContract]
        public partial class LibraryOptionInfo :  IEquatable<LibraryOptionInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryOptionInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="setupUrl">setupUrl.</param>
        /// <param name="defaultEnabled">defaultEnabled.</param>
        /// <param name="features">features.</param>
        public LibraryOptionInfo(string name = default(string), string setupUrl = default(string), bool? defaultEnabled = default(bool?), List<MetadataFeatures> features = default(List<MetadataFeatures>))
        {
            this.Name = name;
            this.SetupUrl = setupUrl;
            this.DefaultEnabled = defaultEnabled;
            this.Features = features;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SetupUrl
        /// </summary>
        [DataMember(Name="SetupUrl", EmitDefaultValue=false)]
        public string SetupUrl { get; set; }

        /// <summary>
        /// Gets or Sets DefaultEnabled
        /// </summary>
        [DataMember(Name="DefaultEnabled", EmitDefaultValue=false)]
        public bool? DefaultEnabled { get; set; }

        /// <summary>
        /// Gets or Sets Features
        /// </summary>
        [DataMember(Name="Features", EmitDefaultValue=false)]
        public List<MetadataFeatures> Features { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryOptionInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SetupUrl: ").Append(SetupUrl).Append("\n");
            sb.Append("  DefaultEnabled: ").Append(DefaultEnabled).Append("\n");
            sb.Append("  Features: ").Append(Features).Append("\n");
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
            return this.Equals(input as LibraryOptionInfo);
        }

        /// <summary>
        /// Returns true if LibraryOptionInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryOptionInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryOptionInfo input)
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
                    this.SetupUrl == input.SetupUrl ||
                    (this.SetupUrl != null &&
                    this.SetupUrl.Equals(input.SetupUrl))
                ) && 
                (
                    this.DefaultEnabled == input.DefaultEnabled ||
                    (this.DefaultEnabled != null &&
                    this.DefaultEnabled.Equals(input.DefaultEnabled))
                ) && 
                (
                    this.Features == input.Features ||
                    this.Features != null &&
                    input.Features != null &&
                    this.Features.SequenceEqual(input.Features)
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
                if (this.SetupUrl != null)
                    hashCode = hashCode * 59 + this.SetupUrl.GetHashCode();
                if (this.DefaultEnabled != null)
                    hashCode = hashCode * 59 + this.DefaultEnabled.GetHashCode();
                if (this.Features != null)
                    hashCode = hashCode * 59 + this.Features.GetHashCode();
                return hashCode;
            }
        }

    }
}
