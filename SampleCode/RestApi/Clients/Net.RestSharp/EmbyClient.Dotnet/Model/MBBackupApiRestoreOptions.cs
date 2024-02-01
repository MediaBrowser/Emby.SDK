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
    /// MBBackupApiRestoreOptions
    /// </summary>
    [DataContract]
        public partial class MBBackupApiRestoreOptions :  IEquatable<MBBackupApiRestoreOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MBBackupApiRestoreOptions" /> class.
        /// </summary>
        /// <param name="restoreServerId">restoreServerId.</param>
        /// <param name="useFiles">useFiles.</param>
        public MBBackupApiRestoreOptions(bool? restoreServerId = default(bool?), string useFiles = default(string))
        {
            this.RestoreServerId = restoreServerId;
            this.UseFiles = useFiles;
        }
        
        /// <summary>
        /// Gets or Sets RestoreServerId
        /// </summary>
        [DataMember(Name="RestoreServerId", EmitDefaultValue=false)]
        public bool? RestoreServerId { get; set; }

        /// <summary>
        /// Gets or Sets UseFiles
        /// </summary>
        [DataMember(Name="UseFiles", EmitDefaultValue=false)]
        public string UseFiles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MBBackupApiRestoreOptions {\n");
            sb.Append("  RestoreServerId: ").Append(RestoreServerId).Append("\n");
            sb.Append("  UseFiles: ").Append(UseFiles).Append("\n");
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
            return this.Equals(input as MBBackupApiRestoreOptions);
        }

        /// <summary>
        /// Returns true if MBBackupApiRestoreOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of MBBackupApiRestoreOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MBBackupApiRestoreOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RestoreServerId == input.RestoreServerId ||
                    (this.RestoreServerId != null &&
                    this.RestoreServerId.Equals(input.RestoreServerId))
                ) && 
                (
                    this.UseFiles == input.UseFiles ||
                    (this.UseFiles != null &&
                    this.UseFiles.Equals(input.UseFiles))
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
                if (this.RestoreServerId != null)
                    hashCode = hashCode * 59 + this.RestoreServerId.GetHashCode();
                if (this.UseFiles != null)
                    hashCode = hashCode * 59 + this.UseFiles.GetHashCode();
                return hashCode;
            }
        }

    }
}
