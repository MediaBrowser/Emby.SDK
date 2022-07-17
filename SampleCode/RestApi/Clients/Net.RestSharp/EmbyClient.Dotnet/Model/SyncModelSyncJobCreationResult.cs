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
    /// SyncModelSyncJobCreationResult
    /// </summary>
    [DataContract]
        public partial class SyncModelSyncJobCreationResult :  IEquatable<SyncModelSyncJobCreationResult>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncModelSyncJobCreationResult" /> class.
        /// </summary>
        /// <param name="job">job.</param>
        /// <param name="jobItems">jobItems.</param>
        public SyncModelSyncJobCreationResult(SyncSyncJob job = default(SyncSyncJob), List<SyncModelSyncJobItem> jobItems = default(List<SyncModelSyncJobItem>))
        {
            this.Job = job;
            this.JobItems = jobItems;
        }
        
        /// <summary>
        /// Gets or Sets Job
        /// </summary>
        [DataMember(Name="Job", EmitDefaultValue=false)]
        public SyncSyncJob Job { get; set; }

        /// <summary>
        /// Gets or Sets JobItems
        /// </summary>
        [DataMember(Name="JobItems", EmitDefaultValue=false)]
        public List<SyncModelSyncJobItem> JobItems { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncModelSyncJobCreationResult {\n");
            sb.Append("  Job: ").Append(Job).Append("\n");
            sb.Append("  JobItems: ").Append(JobItems).Append("\n");
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
            return this.Equals(input as SyncModelSyncJobCreationResult);
        }

        /// <summary>
        /// Returns true if SyncModelSyncJobCreationResult instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncModelSyncJobCreationResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncModelSyncJobCreationResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Job == input.Job ||
                    (this.Job != null &&
                    this.Job.Equals(input.Job))
                ) && 
                (
                    this.JobItems == input.JobItems ||
                    this.JobItems != null &&
                    input.JobItems != null &&
                    this.JobItems.SequenceEqual(input.JobItems)
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
                if (this.Job != null)
                    hashCode = hashCode * 59 + this.Job.GetHashCode();
                if (this.JobItems != null)
                    hashCode = hashCode * 59 + this.JobItems.GetHashCode();
                return hashCode;
            }
        }

    }
}
