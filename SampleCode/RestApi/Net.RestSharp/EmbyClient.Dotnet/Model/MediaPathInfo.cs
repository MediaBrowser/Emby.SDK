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
    /// MediaPathInfo
    /// </summary>
    [DataContract]
        public partial class MediaPathInfo :  IEquatable<MediaPathInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaPathInfo" /> class.
        /// </summary>
        /// <param name="path">path.</param>
        /// <param name="networkPath">networkPath.</param>
        /// <param name="username">username.</param>
        /// <param name="password">password.</param>
        public MediaPathInfo(string path = default(string), string networkPath = default(string), string username = default(string), string password = default(string))
        {
            this.Path = path;
            this.NetworkPath = networkPath;
            this.Username = username;
            this.Password = password;
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
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name="Username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name="Password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaPathInfo {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  NetworkPath: ").Append(NetworkPath).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
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
            return this.Equals(input as MediaPathInfo);
        }

        /// <summary>
        /// Returns true if MediaPathInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaPathInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaPathInfo input)
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
                ) && 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
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
                if (this.Username != null)
                    hashCode = hashCode * 59 + this.Username.GetHashCode();
                if (this.Password != null)
                    hashCode = hashCode * 59 + this.Password.GetHashCode();
                return hashCode;
            }
        }

    }
}
