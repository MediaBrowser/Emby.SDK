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
    /// EmbyMediaModelTypesProfileInformation
    /// </summary>
    [DataContract]
        public partial class EmbyMediaModelTypesProfileInformation :  IEquatable<EmbyMediaModelTypesProfileInformation>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyMediaModelTypesProfileInformation" /> class.
        /// </summary>
        /// <param name="shortName">shortName.</param>
        /// <param name="description">description.</param>
        /// <param name="details">details.</param>
        /// <param name="id">id.</param>
        /// <param name="bitDepths">bitDepths.</param>
        public EmbyMediaModelTypesProfileInformation(string shortName = default(string), string description = default(string), string details = default(string), string id = default(string), List<int?> bitDepths = default(List<int?>))
        {
            this.ShortName = shortName;
            this.Description = description;
            this.Details = details;
            this.Id = id;
            this.BitDepths = bitDepths;
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
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name="Details", EmitDefaultValue=false)]
        public string Details { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets BitDepths
        /// </summary>
        [DataMember(Name="BitDepths", EmitDefaultValue=false)]
        public List<int?> BitDepths { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyMediaModelTypesProfileInformation {\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  BitDepths: ").Append(BitDepths).Append("\n");
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
            return this.Equals(input as EmbyMediaModelTypesProfileInformation);
        }

        /// <summary>
        /// Returns true if EmbyMediaModelTypesProfileInformation instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyMediaModelTypesProfileInformation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyMediaModelTypesProfileInformation input)
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
                    this.Details == input.Details ||
                    (this.Details != null &&
                    this.Details.Equals(input.Details))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.BitDepths == input.BitDepths ||
                    this.BitDepths != null &&
                    input.BitDepths != null &&
                    this.BitDepths.SequenceEqual(input.BitDepths)
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
                if (this.Details != null)
                    hashCode = hashCode * 59 + this.Details.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.BitDepths != null)
                    hashCode = hashCode * 59 + this.BitDepths.GetHashCode();
                return hashCode;
            }
        }

    }
}
