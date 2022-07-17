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
    /// LibraryMediaUpdateInfo
    /// </summary>
    [DataContract]
        public partial class LibraryMediaUpdateInfo :  IEquatable<LibraryMediaUpdateInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryMediaUpdateInfo" /> class.
        /// </summary>
        /// <param name="path">path.</param>
        /// <param name="updateType">updateType.</param>
        public LibraryMediaUpdateInfo(string path = default(string), string updateType = default(string))
        {
            this.Path = path;
            this.UpdateType = updateType;
        }
        
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets UpdateType
        /// </summary>
        [DataMember(Name="UpdateType", EmitDefaultValue=false)]
        public string UpdateType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryMediaUpdateInfo {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  UpdateType: ").Append(UpdateType).Append("\n");
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
            return this.Equals(input as LibraryMediaUpdateInfo);
        }

        /// <summary>
        /// Returns true if LibraryMediaUpdateInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryMediaUpdateInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryMediaUpdateInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.UpdateType == input.UpdateType ||
                    (this.UpdateType != null &&
                    this.UpdateType.Equals(input.UpdateType))
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
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.UpdateType != null)
                    hashCode = hashCode * 59 + this.UpdateType.GetHashCode();
                return hashCode;
            }
        }

    }
}
