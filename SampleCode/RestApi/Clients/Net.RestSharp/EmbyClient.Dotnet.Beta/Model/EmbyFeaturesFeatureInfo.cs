/*
 * EmbyClient.Dotnet.Beta
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// EmbyFeaturesFeatureInfo
    /// </summary>
    [DataContract]
        public partial class EmbyFeaturesFeatureInfo :  IEquatable<EmbyFeaturesFeatureInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyFeaturesFeatureInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="featureType">featureType.</param>
        public EmbyFeaturesFeatureInfo(string name = default(string), string id = default(string), EmbyFeaturesFeatureType featureType = default(EmbyFeaturesFeatureType))
        {
            this.Name = name;
            this.Id = id;
            this.FeatureType = featureType;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets FeatureType
        /// </summary>
        [DataMember(Name="FeatureType", EmitDefaultValue=false)]
        public EmbyFeaturesFeatureType FeatureType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyFeaturesFeatureInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  FeatureType: ").Append(FeatureType).Append("\n");
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
            return this.Equals(input as EmbyFeaturesFeatureInfo);
        }

        /// <summary>
        /// Returns true if EmbyFeaturesFeatureInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyFeaturesFeatureInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyFeaturesFeatureInfo input)
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.FeatureType == input.FeatureType ||
                    (this.FeatureType != null &&
                    this.FeatureType.Equals(input.FeatureType))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.FeatureType != null)
                    hashCode = hashCode * 59 + this.FeatureType.GetHashCode();
                return hashCode;
            }
        }

    }
}