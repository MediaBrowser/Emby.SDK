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
    /// LibraryMediaFolder
    /// </summary>
    [DataContract]
        public partial class LibraryMediaFolder :  IEquatable<LibraryMediaFolder>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryMediaFolder" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="guid">guid.</param>
        /// <param name="subFolders">subFolders.</param>
        /// <param name="isUserAccessConfigurable">isUserAccessConfigurable.</param>
        public LibraryMediaFolder(string name = default(string), string id = default(string), string guid = default(string), List<LibrarySubFolder> subFolders = default(List<LibrarySubFolder>), bool? isUserAccessConfigurable = default(bool?))
        {
            this.Name = name;
            this.Id = id;
            this.Guid = guid;
            this.SubFolders = subFolders;
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
        /// Gets or Sets Guid
        /// </summary>
        [DataMember(Name="Guid", EmitDefaultValue=false)]
        public string Guid { get; set; }

        /// <summary>
        /// Gets or Sets SubFolders
        /// </summary>
        [DataMember(Name="SubFolders", EmitDefaultValue=false)]
        public List<LibrarySubFolder> SubFolders { get; set; }

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
            sb.Append("class LibraryMediaFolder {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  SubFolders: ").Append(SubFolders).Append("\n");
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
            return this.Equals(input as LibraryMediaFolder);
        }

        /// <summary>
        /// Returns true if LibraryMediaFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryMediaFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryMediaFolder input)
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
                    this.Guid == input.Guid ||
                    (this.Guid != null &&
                    this.Guid.Equals(input.Guid))
                ) && 
                (
                    this.SubFolders == input.SubFolders ||
                    this.SubFolders != null &&
                    input.SubFolders != null &&
                    this.SubFolders.SequenceEqual(input.SubFolders)
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
                if (this.Guid != null)
                    hashCode = hashCode * 59 + this.Guid.GetHashCode();
                if (this.SubFolders != null)
                    hashCode = hashCode * 59 + this.SubFolders.GetHashCode();
                if (this.IsUserAccessConfigurable != null)
                    hashCode = hashCode * 59 + this.IsUserAccessConfigurable.GetHashCode();
                return hashCode;
            }
        }

    }
}
