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
    /// MBBackupApiUserRestoreInfo
    /// </summary>
    [DataContract]
        public partial class MBBackupApiUserRestoreInfo :  IEquatable<MBBackupApiUserRestoreInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MBBackupApiUserRestoreInfo" /> class.
        /// </summary>
        /// <param name="sourceUserId">sourceUserId.</param>
        /// <param name="targetUserId">targetUserId.</param>
        public MBBackupApiUserRestoreInfo(string sourceUserId = default(string), string targetUserId = default(string))
        {
            this.SourceUserId = sourceUserId;
            this.TargetUserId = targetUserId;
        }
        
        /// <summary>
        /// Gets or Sets SourceUserId
        /// </summary>
        [DataMember(Name="SourceUserId", EmitDefaultValue=false)]
        public string SourceUserId { get; set; }

        /// <summary>
        /// Gets or Sets TargetUserId
        /// </summary>
        [DataMember(Name="TargetUserId", EmitDefaultValue=false)]
        public string TargetUserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MBBackupApiUserRestoreInfo {\n");
            sb.Append("  SourceUserId: ").Append(SourceUserId).Append("\n");
            sb.Append("  TargetUserId: ").Append(TargetUserId).Append("\n");
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
            return this.Equals(input as MBBackupApiUserRestoreInfo);
        }

        /// <summary>
        /// Returns true if MBBackupApiUserRestoreInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of MBBackupApiUserRestoreInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MBBackupApiUserRestoreInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SourceUserId == input.SourceUserId ||
                    (this.SourceUserId != null &&
                    this.SourceUserId.Equals(input.SourceUserId))
                ) && 
                (
                    this.TargetUserId == input.TargetUserId ||
                    (this.TargetUserId != null &&
                    this.TargetUserId.Equals(input.TargetUserId))
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
                if (this.SourceUserId != null)
                    hashCode = hashCode * 59 + this.SourceUserId.GetHashCode();
                if (this.TargetUserId != null)
                    hashCode = hashCode * 59 + this.TargetUserId.GetHashCode();
                return hashCode;
            }
        }

    }
}
