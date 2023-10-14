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
    /// This is used by the api to get information about a Person within a BaseItem  
    /// </summary>
    [DataContract]
        public partial class BaseItemPerson :  IEquatable<BaseItemPerson>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BaseItemPerson" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="id">The identifier..</param>
        /// <param name="role">The role..</param>
        /// <param name="type">type.</param>
        /// <param name="primaryImageTag">The primary image tag..</param>
        public BaseItemPerson(string name = default(string), string id = default(string), string role = default(string), PersonType type = default(PersonType), string primaryImageTag = default(string))
        {
            this.Name = name;
            this.Id = id;
            this.Role = role;
            this.Type = type;
            this.PrimaryImageTag = primaryImageTag;
        }
        
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
        /// The role.
        /// </summary>
        /// <value>The role.</value>
        [DataMember(Name="Role", EmitDefaultValue=false)]
        public string Role { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public PersonType Type { get; set; }

        /// <summary>
        /// The primary image tag.
        /// </summary>
        /// <value>The primary image tag.</value>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=false)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BaseItemPerson {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
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
            return this.Equals(input as BaseItemPerson);
        }

        /// <summary>
        /// Returns true if BaseItemPerson instances are equal
        /// </summary>
        /// <param name="input">Instance of BaseItemPerson to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BaseItemPerson input)
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
                    this.Role == input.Role ||
                    (this.Role != null &&
                    this.Role.Equals(input.Role))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.PrimaryImageTag == input.PrimaryImageTag ||
                    (this.PrimaryImageTag != null &&
                    this.PrimaryImageTag.Equals(input.PrimaryImageTag))
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
                if (this.Role != null)
                    hashCode = hashCode * 59 + this.Role.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.PrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.PrimaryImageTag.GetHashCode();
                return hashCode;
            }
        }

    }
}
