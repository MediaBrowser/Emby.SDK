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
    /// SyncModelSyncDataRequest
    /// </summary>
    [DataContract]
        public partial class SyncModelSyncDataRequest :  IEquatable<SyncModelSyncDataRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncModelSyncDataRequest" /> class.
        /// </summary>
        /// <param name="localItemIds">localItemIds.</param>
        /// <param name="targetId">targetId.</param>
        public SyncModelSyncDataRequest(List<string> localItemIds = default(List<string>), string targetId = default(string))
        {
            this.LocalItemIds = localItemIds;
            this.TargetId = targetId;
        }
        
        /// <summary>
        /// Gets or Sets LocalItemIds
        /// </summary>
        [DataMember(Name="LocalItemIds", EmitDefaultValue=false)]
        public List<string> LocalItemIds { get; set; }

        /// <summary>
        /// Gets or Sets TargetId
        /// </summary>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncModelSyncDataRequest {\n");
            sb.Append("  LocalItemIds: ").Append(LocalItemIds).Append("\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
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
            return this.Equals(input as SyncModelSyncDataRequest);
        }

        /// <summary>
        /// Returns true if SyncModelSyncDataRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncModelSyncDataRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncModelSyncDataRequest input)
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
                    this.TargetId == input.TargetId ||
                    (this.TargetId != null &&
                    this.TargetId.Equals(input.TargetId))
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
                if (this.TargetId != null)
                    hashCode = hashCode * 59 + this.TargetId.GetHashCode();
                return hashCode;
            }
        }

    }
}
