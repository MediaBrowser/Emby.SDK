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
    /// LibraryUpdateLibraryOptions
    /// </summary>
    [DataContract]
        public partial class LibraryUpdateLibraryOptions :  IEquatable<LibraryUpdateLibraryOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryUpdateLibraryOptions" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="libraryOptions">libraryOptions.</param>
        public LibraryUpdateLibraryOptions(string id = default(string), LibraryOptions libraryOptions = default(LibraryOptions))
        {
            this.Id = id;
            this.LibraryOptions = libraryOptions;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets LibraryOptions
        /// </summary>
        [DataMember(Name="LibraryOptions", EmitDefaultValue=false)]
        public LibraryOptions LibraryOptions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryUpdateLibraryOptions {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LibraryOptions: ").Append(LibraryOptions).Append("\n");
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
            return this.Equals(input as LibraryUpdateLibraryOptions);
        }

        /// <summary>
        /// Returns true if LibraryUpdateLibraryOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryUpdateLibraryOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryUpdateLibraryOptions input)
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
                    this.LibraryOptions == input.LibraryOptions ||
                    (this.LibraryOptions != null &&
                    this.LibraryOptions.Equals(input.LibraryOptions))
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
                if (this.LibraryOptions != null)
                    hashCode = hashCode * 59 + this.LibraryOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
