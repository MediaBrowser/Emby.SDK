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
    /// LibrarySubFolder
    /// </summary>
    [DataContract]
        public partial class LibrarySubFolder :  IEquatable<LibrarySubFolder>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibrarySubFolder" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="path">path.</param>
        /// <param name="isUserAccessConfigurable">isUserAccessConfigurable.</param>
        public LibrarySubFolder(string name = default(string), string id = default(string), string path = default(string), bool? isUserAccessConfigurable = default(bool?))
        {
            this.Name = name;
            this.Id = id;
            this.Path = path;
            this.IsUserAccessConfigurable = isUserAccessConfigurable;
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
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets IsUserAccessConfigurable
        /// </summary>
        [DataMember(Name="IsUserAccessConfigurable", EmitDefaultValue=false)]
        public bool? IsUserAccessConfigurable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibrarySubFolder {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  IsUserAccessConfigurable: ").Append(IsUserAccessConfigurable).Append("\n");
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
            return this.Equals(input as LibrarySubFolder);
        }

        /// <summary>
        /// Returns true if LibrarySubFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of LibrarySubFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibrarySubFolder input)
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
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.IsUserAccessConfigurable == input.IsUserAccessConfigurable ||
                    (this.IsUserAccessConfigurable != null &&
                    this.IsUserAccessConfigurable.Equals(input.IsUserAccessConfigurable))
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
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.IsUserAccessConfigurable != null)
                    hashCode = hashCode * 59 + this.IsUserAccessConfigurable.GetHashCode();
                return hashCode;
            }
        }

    }
}
