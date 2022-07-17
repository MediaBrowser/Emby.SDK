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
    /// ConfigurationMediaPathInfo
    /// </summary>
    [DataContract]
        public partial class ConfigurationMediaPathInfo :  IEquatable<ConfigurationMediaPathInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationMediaPathInfo" /> class.
        /// </summary>
        /// <param name="path">path.</param>
        /// <param name="networkPath">networkPath.</param>
        public ConfigurationMediaPathInfo(string path = default(string), string networkPath = default(string))
        {
            this.Path = path;
            this.NetworkPath = networkPath;
        }
        
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets NetworkPath
        /// </summary>
        [DataMember(Name="NetworkPath", EmitDefaultValue=false)]
        public string NetworkPath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationMediaPathInfo {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  NetworkPath: ").Append(NetworkPath).Append("\n");
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
            return this.Equals(input as ConfigurationMediaPathInfo);
        }

        /// <summary>
        /// Returns true if ConfigurationMediaPathInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of ConfigurationMediaPathInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationMediaPathInfo input)
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
                    this.NetworkPath == input.NetworkPath ||
                    (this.NetworkPath != null &&
                    this.NetworkPath.Equals(input.NetworkPath))
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
                if (this.NetworkPath != null)
                    hashCode = hashCode * 59 + this.NetworkPath.GetHashCode();
                return hashCode;
            }
        }

    }
}
