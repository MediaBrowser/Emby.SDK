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
    /// LibraryAddVirtualFolder
    /// </summary>
    [DataContract]
        public partial class LibraryAddVirtualFolder :  IEquatable<LibraryAddVirtualFolder>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryAddVirtualFolder" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="collectionType">collectionType.</param>
        /// <param name="refreshLibrary">refreshLibrary.</param>
        /// <param name="paths">paths.</param>
        /// <param name="libraryOptions">libraryOptions.</param>
        public LibraryAddVirtualFolder(string name = default(string), string collectionType = default(string), bool? refreshLibrary = default(bool?), List<string> paths = default(List<string>), LibraryOptions libraryOptions = default(LibraryOptions))
        {
            this.Name = name;
            this.CollectionType = collectionType;
            this.RefreshLibrary = refreshLibrary;
            this.Paths = paths;
            this.LibraryOptions = libraryOptions;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CollectionType
        /// </summary>
        [DataMember(Name="CollectionType", EmitDefaultValue=false)]
        public string CollectionType { get; set; }

        /// <summary>
        /// Gets or Sets RefreshLibrary
        /// </summary>
        [DataMember(Name="RefreshLibrary", EmitDefaultValue=false)]
        public bool? RefreshLibrary { get; set; }

        /// <summary>
        /// Gets or Sets Paths
        /// </summary>
        [DataMember(Name="Paths", EmitDefaultValue=false)]
        public List<string> Paths { get; set; }

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
            sb.Append("class LibraryAddVirtualFolder {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CollectionType: ").Append(CollectionType).Append("\n");
            sb.Append("  RefreshLibrary: ").Append(RefreshLibrary).Append("\n");
            sb.Append("  Paths: ").Append(Paths).Append("\n");
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
            return this.Equals(input as LibraryAddVirtualFolder);
        }

        /// <summary>
        /// Returns true if LibraryAddVirtualFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryAddVirtualFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryAddVirtualFolder input)
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
                    this.CollectionType == input.CollectionType ||
                    (this.CollectionType != null &&
                    this.CollectionType.Equals(input.CollectionType))
                ) && 
                (
                    this.RefreshLibrary == input.RefreshLibrary ||
                    (this.RefreshLibrary != null &&
                    this.RefreshLibrary.Equals(input.RefreshLibrary))
                ) && 
                (
                    this.Paths == input.Paths ||
                    this.Paths != null &&
                    input.Paths != null &&
                    this.Paths.SequenceEqual(input.Paths)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CollectionType != null)
                    hashCode = hashCode * 59 + this.CollectionType.GetHashCode();
                if (this.RefreshLibrary != null)
                    hashCode = hashCode * 59 + this.RefreshLibrary.GetHashCode();
                if (this.Paths != null)
                    hashCode = hashCode * 59 + this.Paths.GetHashCode();
                if (this.LibraryOptions != null)
                    hashCode = hashCode * 59 + this.LibraryOptions.GetHashCode();
                return hashCode;
            }
        }

    }
}
