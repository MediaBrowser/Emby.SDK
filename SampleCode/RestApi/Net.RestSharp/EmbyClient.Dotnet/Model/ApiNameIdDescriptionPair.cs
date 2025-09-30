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
    /// ApiNameIdDescriptionPair
    /// </summary>
    [DataContract]
        public partial class ApiNameIdDescriptionPair :  IEquatable<ApiNameIdDescriptionPair>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiNameIdDescriptionPair" /> class.
        /// </summary>
        /// <param name="shortOverview">shortOverview.</param>
        /// <param name="name">The name..</param>
        /// <param name="id">The identifier..</param>
        public ApiNameIdDescriptionPair(string shortOverview = default(string), string name = default(string), string id = default(string))
        {
            this.ShortOverview = shortOverview;
            this.Name = name;
            this.Id = id;
        }
        
        /// <summary>
        /// Gets or Sets ShortOverview
        /// </summary>
        [DataMember(Name="ShortOverview", EmitDefaultValue=false)]
        public string ShortOverview { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The identifier.
        /// </summary>
        /// <value>The identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApiNameIdDescriptionPair {\n");
            sb.Append("  ShortOverview: ").Append(ShortOverview).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as ApiNameIdDescriptionPair);
        }

        /// <summary>
        /// Returns true if ApiNameIdDescriptionPair instances are equal
        /// </summary>
        /// <param name="input">Instance of ApiNameIdDescriptionPair to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApiNameIdDescriptionPair input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ShortOverview == input.ShortOverview ||
                    (this.ShortOverview != null &&
                    this.ShortOverview.Equals(input.ShortOverview))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.ShortOverview != null)
                    hashCode = hashCode * 59 + this.ShortOverview.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

    }
}
