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
    /// MBBackupBackupInfo
    /// </summary>
    [DataContract]
        public partial class MBBackupBackupInfo :  IEquatable<MBBackupBackupInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MBBackupBackupInfo" /> class.
        /// </summary>
        /// <param name="serverVersion">serverVersion.</param>
        /// <param name="pluginVersion">pluginVersion.</param>
        /// <param name="name">name.</param>
        /// <param name="canRestore">canRestore.</param>
        /// <param name="isFullBackup">isFullBackup.</param>
        /// <param name="dateCreated">dateCreated.</param>
        /// <param name="users">users.</param>
        public MBBackupBackupInfo(string serverVersion = default(string), string pluginVersion = default(string), string name = default(string), bool? canRestore = default(bool?), bool? isFullBackup = default(bool?), DateTimeOffset? dateCreated = default(DateTimeOffset?), List<NameIdPair> users = default(List<NameIdPair>))
        {
            this.ServerVersion = serverVersion;
            this.PluginVersion = pluginVersion;
            this.Name = name;
            this.CanRestore = canRestore;
            this.IsFullBackup = isFullBackup;
            this.DateCreated = dateCreated;
            this.Users = users;
        }
        
        /// <summary>
        /// Gets or Sets ServerVersion
        /// </summary>
        [DataMember(Name="ServerVersion", EmitDefaultValue=false)]
        public string ServerVersion { get; set; }

        /// <summary>
        /// Gets or Sets PluginVersion
        /// </summary>
        [DataMember(Name="PluginVersion", EmitDefaultValue=false)]
        public string PluginVersion { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CanRestore
        /// </summary>
        [DataMember(Name="CanRestore", EmitDefaultValue=false)]
        public bool? CanRestore { get; set; }

        /// <summary>
        /// Gets or Sets IsFullBackup
        /// </summary>
        [DataMember(Name="IsFullBackup", EmitDefaultValue=false)]
        public bool? IsFullBackup { get; set; }

        /// <summary>
        /// Gets or Sets DateCreated
        /// </summary>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets Users
        /// </summary>
        [DataMember(Name="Users", EmitDefaultValue=false)]
        public List<NameIdPair> Users { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MBBackupBackupInfo {\n");
            sb.Append("  ServerVersion: ").Append(ServerVersion).Append("\n");
            sb.Append("  PluginVersion: ").Append(PluginVersion).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CanRestore: ").Append(CanRestore).Append("\n");
            sb.Append("  IsFullBackup: ").Append(IsFullBackup).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  Users: ").Append(Users).Append("\n");
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
            return this.Equals(input as MBBackupBackupInfo);
        }

        /// <summary>
        /// Returns true if MBBackupBackupInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MBBackupBackupInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MBBackupBackupInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ServerVersion == input.ServerVersion ||
                    (this.ServerVersion != null &&
                    this.ServerVersion.Equals(input.ServerVersion))
                ) && 
                (
                    this.PluginVersion == input.PluginVersion ||
                    (this.PluginVersion != null &&
                    this.PluginVersion.Equals(input.PluginVersion))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CanRestore == input.CanRestore ||
                    (this.CanRestore != null &&
                    this.CanRestore.Equals(input.CanRestore))
                ) && 
                (
                    this.IsFullBackup == input.IsFullBackup ||
                    (this.IsFullBackup != null &&
                    this.IsFullBackup.Equals(input.IsFullBackup))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.Users == input.Users ||
                    this.Users != null &&
                    input.Users != null &&
                    this.Users.SequenceEqual(input.Users)
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
                if (this.ServerVersion != null)
                    hashCode = hashCode * 59 + this.ServerVersion.GetHashCode();
                if (this.PluginVersion != null)
                    hashCode = hashCode * 59 + this.PluginVersion.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CanRestore != null)
                    hashCode = hashCode * 59 + this.CanRestore.GetHashCode();
                if (this.IsFullBackup != null)
                    hashCode = hashCode * 59 + this.IsFullBackup.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.Users != null)
                    hashCode = hashCode * 59 + this.Users.GetHashCode();
                return hashCode;
            }
        }

    }
}
