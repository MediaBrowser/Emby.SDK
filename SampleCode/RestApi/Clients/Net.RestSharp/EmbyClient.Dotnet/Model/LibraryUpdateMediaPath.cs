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
    /// LibraryUpdateMediaPath
    /// </summary>
    [DataContract]
        public partial class LibraryUpdateMediaPath :  IEquatable<LibraryUpdateMediaPath>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryUpdateMediaPath" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="pathInfo">pathInfo.</param>
        public LibraryUpdateMediaPath(string id = default(string), MediaPathInfo pathInfo = default(MediaPathInfo))
        {
            this.Id = id;
            this.PathInfo = pathInfo;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets PathInfo
        /// </summary>
        [DataMember(Name="PathInfo", EmitDefaultValue=false)]
        public MediaPathInfo PathInfo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryUpdateMediaPath {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  PathInfo: ").Append(PathInfo).Append("\n");
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
            return this.Equals(input as LibraryUpdateMediaPath);
        }

        /// <summary>
        /// Returns true if LibraryUpdateMediaPath instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryUpdateMediaPath to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryUpdateMediaPath input)
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
                    this.PathInfo == input.PathInfo ||
                    (this.PathInfo != null &&
                    this.PathInfo.Equals(input.PathInfo))
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
                if (this.PathInfo != null)
                    hashCode = hashCode * 59 + this.PathInfo.GetHashCode();
                return hashCode;
            }
        }

    }
}
