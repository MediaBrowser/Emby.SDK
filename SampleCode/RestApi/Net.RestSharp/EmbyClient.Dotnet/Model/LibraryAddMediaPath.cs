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
    /// LibraryAddMediaPath
    /// </summary>
    [DataContract]
        public partial class LibraryAddMediaPath :  IEquatable<LibraryAddMediaPath>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryAddMediaPath" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="path">path.</param>
        /// <param name="pathInfo">pathInfo.</param>
        /// <param name="refreshLibrary">refreshLibrary.</param>
        public LibraryAddMediaPath(string id = default(string), string path = default(string), MediaPathInfo pathInfo = default(MediaPathInfo), bool? refreshLibrary = default(bool?))
        {
            this.Id = id;
            this.Path = path;
            this.PathInfo = pathInfo;
            this.RefreshLibrary = refreshLibrary;
        }
        
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
        /// Gets or Sets PathInfo
        /// </summary>
        [DataMember(Name="PathInfo", EmitDefaultValue=false)]
        public MediaPathInfo PathInfo { get; set; }

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
            sb.Append("class LibraryAddMediaPath {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  PathInfo: ").Append(PathInfo).Append("\n");
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
            return this.Equals(input as LibraryAddMediaPath);
        }

        /// <summary>
        /// Returns true if LibraryAddMediaPath instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryAddMediaPath to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryAddMediaPath input)
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
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.PathInfo == input.PathInfo ||
                    (this.PathInfo != null &&
                    this.PathInfo.Equals(input.PathInfo))
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
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.PathInfo != null)
                    hashCode = hashCode * 59 + this.PathInfo.GetHashCode();
                if (this.RefreshLibrary != null)
                    hashCode = hashCode * 59 + this.RefreshLibrary.GetHashCode();
                return hashCode;
            }
        }

    }
}
