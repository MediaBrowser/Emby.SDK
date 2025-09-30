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
    /// LibraryRemoveVirtualFolder
    /// </summary>
    [DataContract]
        public partial class LibraryRemoveVirtualFolder :  IEquatable<LibraryRemoveVirtualFolder>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryRemoveVirtualFolder" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="refreshLibrary">refreshLibrary.</param>
        public LibraryRemoveVirtualFolder(string id = default(string), bool? refreshLibrary = default(bool?))
        {
            this.Id = id;
            this.RefreshLibrary = refreshLibrary;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets RefreshLibrary
        /// </summary>
        [DataMember(Name="RefreshLibrary", EmitDefaultValue=false)]
        public bool? RefreshLibrary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryRemoveVirtualFolder {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  RefreshLibrary: ").Append(RefreshLibrary).Append("\n");
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
            return this.Equals(input as LibraryRemoveVirtualFolder);
        }

        /// <summary>
        /// Returns true if LibraryRemoveVirtualFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryRemoveVirtualFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryRemoveVirtualFolder input)
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
                    this.RefreshLibrary == input.RefreshLibrary ||
                    (this.RefreshLibrary != null &&
                    this.RefreshLibrary.Equals(input.RefreshLibrary))
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
                if (this.RefreshLibrary != null)
                    hashCode = hashCode * 59 + this.RefreshLibrary.GetHashCode();
                return hashCode;
            }
        }

    }
}
