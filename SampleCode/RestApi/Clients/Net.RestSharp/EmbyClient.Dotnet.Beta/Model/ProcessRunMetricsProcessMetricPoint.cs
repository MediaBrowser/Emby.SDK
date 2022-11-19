/*
 * EmbyClient.Dotnet.Beta
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// ProcessRunMetricsProcessMetricPoint
    /// </summary>
    [DataContract]
        public partial class ProcessRunMetricsProcessMetricPoint :  IEquatable<ProcessRunMetricsProcessMetricPoint>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProcessRunMetricsProcessMetricPoint" /> class.
        /// </summary>
        /// <param name="time">time.</param>
        /// <param name="cpuPercent">cpuPercent.</param>
        /// <param name="virtualMemory">virtualMemory.</param>
        /// <param name="workingSet">workingSet.</param>
        public ProcessRunMetricsProcessMetricPoint(TimeSpan time = default(TimeSpan), double? cpuPercent = default(double?), double? virtualMemory = default(double?), double? workingSet = default(double?))
        {
            this.Time = time;
            this.CpuPercent = cpuPercent;
            this.VirtualMemory = virtualMemory;
            this.WorkingSet = workingSet;
        }
        
        /// <summary>
        /// Gets or Sets Time
        /// </summary>
        [DataMember(Name="Time", EmitDefaultValue=false)]
        public TimeSpan Time { get; set; }

        /// <summary>
        /// Gets or Sets CpuPercent
        /// </summary>
        [DataMember(Name="CpuPercent", EmitDefaultValue=false)]
        public double? CpuPercent { get; set; }

        /// <summary>
        /// Gets or Sets VirtualMemory
        /// </summary>
        [DataMember(Name="VirtualMemory", EmitDefaultValue=false)]
        public double? VirtualMemory { get; set; }

        /// <summary>
        /// Gets or Sets WorkingSet
        /// </summary>
        [DataMember(Name="WorkingSet", EmitDefaultValue=false)]
        public double? WorkingSet { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProcessRunMetricsProcessMetricPoint {\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  CpuPercent: ").Append(CpuPercent).Append("\n");
            sb.Append("  VirtualMemory: ").Append(VirtualMemory).Append("\n");
            sb.Append("  WorkingSet: ").Append(WorkingSet).Append("\n");
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
            return this.Equals(input as ProcessRunMetricsProcessMetricPoint);
        }

        /// <summary>
        /// Returns true if ProcessRunMetricsProcessMetricPoint instances are equal
        /// </summary>
        /// <param name="input">Instance of ProcessRunMetricsProcessMetricPoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProcessRunMetricsProcessMetricPoint input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.CpuPercent == input.CpuPercent ||
                    (this.CpuPercent != null &&
                    this.CpuPercent.Equals(input.CpuPercent))
                ) && 
                (
                    this.VirtualMemory == input.VirtualMemory ||
                    (this.VirtualMemory != null &&
                    this.VirtualMemory.Equals(input.VirtualMemory))
                ) && 
                (
                    this.WorkingSet == input.WorkingSet ||
                    (this.WorkingSet != null &&
                    this.WorkingSet.Equals(input.WorkingSet))
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
                if (this.Time != null)
                    hashCode = hashCode * 59 + this.Time.GetHashCode();
                if (this.CpuPercent != null)
                    hashCode = hashCode * 59 + this.CpuPercent.GetHashCode();
                if (this.VirtualMemory != null)
                    hashCode = hashCode * 59 + this.VirtualMemory.GetHashCode();
                if (this.WorkingSet != null)
                    hashCode = hashCode * 59 + this.WorkingSet.GetHashCode();
                return hashCode;
            }
        }

    }
}
