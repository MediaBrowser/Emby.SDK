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
    /// SyncedItemProgress
    /// </summary>
    [DataContract]
        public partial class SyncedItemProgress :  IEquatable<SyncedItemProgress>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncedItemProgress" /> class.
        /// </summary>
        /// <param name="progress">progress.</param>
        /// <param name="status">status.</param>
        public SyncedItemProgress(double? progress = default(double?), SyncJobItemStatus status = default(SyncJobItemStatus))
        {
            this.Progress = progress;
            this.Status = status;
        }
        
        /// <summary>
        /// Gets or Sets Progress
        /// </summary>
        [DataMember(Name="Progress", EmitDefaultValue=false)]
        public double? Progress { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public SyncJobItemStatus Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncedItemProgress {\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as SyncedItemProgress);
        }

        /// <summary>
        /// Returns true if SyncedItemProgress instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncedItemProgress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncedItemProgress input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Progress == input.Progress ||
                    (this.Progress != null &&
                    this.Progress.Equals(input.Progress))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                if (this.Progress != null)
                    hashCode = hashCode * 59 + this.Progress.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                return hashCode;
            }
        }

    }
}
