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
    /// SyncDataRequest
    /// </summary>
    [DataContract]
        public partial class SyncDataRequest :  IEquatable<SyncDataRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncDataRequest" /> class.
        /// </summary>
        /// <param name="localItemIds">localItemIds.</param>
        /// <param name="internalTargetIds">internalTargetIds.</param>
        public SyncDataRequest(List<string> localItemIds = default(List<string>), List<long?> internalTargetIds = default(List<long?>))
        {
            this.LocalItemIds = localItemIds;
            this.InternalTargetIds = internalTargetIds;
        }
        
        /// <summary>
        /// Gets or Sets LocalItemIds
        /// </summary>
        [DataMember(Name="LocalItemIds", EmitDefaultValue=false)]
        public List<string> LocalItemIds { get; set; }

        /// <summary>
        /// Gets or Sets InternalTargetIds
        /// </summary>
        [DataMember(Name="InternalTargetIds", EmitDefaultValue=false)]
        public List<long?> InternalTargetIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncDataRequest {\n");
            sb.Append("  LocalItemIds: ").Append(LocalItemIds).Append("\n");
            sb.Append("  InternalTargetIds: ").Append(InternalTargetIds).Append("\n");
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
            return this.Equals(input as SyncDataRequest);
        }

        /// <summary>
        /// Returns true if SyncDataRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncDataRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncDataRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.LocalItemIds == input.LocalItemIds ||
                    this.LocalItemIds != null &&
                    input.LocalItemIds != null &&
                    this.LocalItemIds.SequenceEqual(input.LocalItemIds)
                ) && 
                (
                    this.InternalTargetIds == input.InternalTargetIds ||
                    this.InternalTargetIds != null &&
                    input.InternalTargetIds != null &&
                    this.InternalTargetIds.SequenceEqual(input.InternalTargetIds)
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
                if (this.LocalItemIds != null)
                    hashCode = hashCode * 59 + this.LocalItemIds.GetHashCode();
                if (this.InternalTargetIds != null)
                    hashCode = hashCode * 59 + this.InternalTargetIds.GetHashCode();
                return hashCode;
            }
        }

    }
}
