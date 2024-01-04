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
    /// MBBackupApiAllBackupsInfo
    /// </summary>
    [DataContract]
        public partial class MBBackupApiAllBackupsInfo :  IEquatable<MBBackupApiAllBackupsInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MBBackupApiAllBackupsInfo" /> class.
        /// </summary>
        /// <param name="fullBackupInfo">fullBackupInfo.</param>
        /// <param name="lightBackups">lightBackups.</param>
        public MBBackupApiAllBackupsInfo(MBBackupBackupInfo fullBackupInfo = default(MBBackupBackupInfo), List<MBBackupBackupInfo> lightBackups = default(List<MBBackupBackupInfo>))
        {
            this.FullBackupInfo = fullBackupInfo;
            this.LightBackups = lightBackups;
        }
        
        /// <summary>
        /// Gets or Sets FullBackupInfo
        /// </summary>
        [DataMember(Name="FullBackupInfo", EmitDefaultValue=false)]
        public MBBackupBackupInfo FullBackupInfo { get; set; }

        /// <summary>
        /// Gets or Sets LightBackups
        /// </summary>
        [DataMember(Name="LightBackups", EmitDefaultValue=false)]
        public List<MBBackupBackupInfo> LightBackups { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MBBackupApiAllBackupsInfo {\n");
            sb.Append("  FullBackupInfo: ").Append(FullBackupInfo).Append("\n");
            sb.Append("  LightBackups: ").Append(LightBackups).Append("\n");
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
            return this.Equals(input as MBBackupApiAllBackupsInfo);
        }

        /// <summary>
        /// Returns true if MBBackupApiAllBackupsInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MBBackupApiAllBackupsInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MBBackupApiAllBackupsInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FullBackupInfo == input.FullBackupInfo ||
                    (this.FullBackupInfo != null &&
                    this.FullBackupInfo.Equals(input.FullBackupInfo))
                ) && 
                (
                    this.LightBackups == input.LightBackups ||
                    this.LightBackups != null &&
                    input.LightBackups != null &&
                    this.LightBackups.SequenceEqual(input.LightBackups)
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
                if (this.FullBackupInfo != null)
                    hashCode = hashCode * 59 + this.FullBackupInfo.GetHashCode();
                if (this.LightBackups != null)
                    hashCode = hashCode * 59 + this.LightBackups.GetHashCode();
                return hashCode;
            }
        }

    }
}
