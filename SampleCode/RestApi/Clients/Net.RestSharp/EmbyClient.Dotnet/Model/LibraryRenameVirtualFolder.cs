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
    /// LibraryRenameVirtualFolder
    /// </summary>
    [DataContract]
        public partial class LibraryRenameVirtualFolder :  IEquatable<LibraryRenameVirtualFolder>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryRenameVirtualFolder" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="newName">newName.</param>
        public LibraryRenameVirtualFolder(string id = default(string), string newName = default(string))
        {
            this.Id = id;
            this.NewName = newName;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets NewName
        /// </summary>
        [DataMember(Name="NewName", EmitDefaultValue=false)]
        public string NewName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryRenameVirtualFolder {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NewName: ").Append(NewName).Append("\n");
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
            return this.Equals(input as LibraryRenameVirtualFolder);
        }

        /// <summary>
        /// Returns true if LibraryRenameVirtualFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryRenameVirtualFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryRenameVirtualFolder input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.NewName == input.NewName ||
                    (this.NewName != null &&
                    this.NewName.Equals(input.NewName))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.NewName != null)
                    hashCode = hashCode * 59 + this.NewName.GetHashCode();
                return hashCode;
            }
        }

    }
}
