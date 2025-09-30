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
    /// ProcessRunMetricsProcessStatistics
    /// </summary>
    [DataContract]
        public partial class ProcessRunMetricsProcessStatistics :  IEquatable<ProcessRunMetricsProcessStatistics>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProcessRunMetricsProcessStatistics" /> class.
        /// </summary>
        /// <param name="currentCpu">The current cpu..</param>
        /// <param name="averageCpu">The average cpu..</param>
        /// <param name="currentVirtualMemory">The currently allocated virtual memory..</param>
        /// <param name="currentWorkingSet">The currently allocated working set..</param>
        /// <param name="metrics">The metrics..</param>
        public ProcessRunMetricsProcessStatistics(double? currentCpu = default(double?), double? averageCpu = default(double?), double? currentVirtualMemory = default(double?), double? currentWorkingSet = default(double?), List<ProcessRunMetricsProcessMetricPoint> metrics = default(List<ProcessRunMetricsProcessMetricPoint>))
        {
            this.CurrentCpu = currentCpu;
            this.AverageCpu = averageCpu;
            this.CurrentVirtualMemory = currentVirtualMemory;
            this.CurrentWorkingSet = currentWorkingSet;
            this.Metrics = metrics;
        }
        
        /// <summary>
        /// The current cpu.
        /// </summary>
        /// <value>The current cpu.</value>
        [DataMember(Name="CurrentCpu", EmitDefaultValue=false)]
        public double? CurrentCpu { get; set; }

        /// <summary>
        /// The average cpu.
        /// </summary>
        /// <value>The average cpu.</value>
        [DataMember(Name="AverageCpu", EmitDefaultValue=false)]
        public double? AverageCpu { get; set; }

        /// <summary>
        /// The currently allocated virtual memory.
        /// </summary>
        /// <value>The currently allocated virtual memory.</value>
        [DataMember(Name="CurrentVirtualMemory", EmitDefaultValue=false)]
        public double? CurrentVirtualMemory { get; set; }

        /// <summary>
        /// The currently allocated working set.
        /// </summary>
        /// <value>The currently allocated working set.</value>
        [DataMember(Name="CurrentWorkingSet", EmitDefaultValue=false)]
        public double? CurrentWorkingSet { get; set; }

        /// <summary>
        /// The metrics.
        /// </summary>
        /// <value>The metrics.</value>
        [DataMember(Name="Metrics", EmitDefaultValue=false)]
        public List<ProcessRunMetricsProcessMetricPoint> Metrics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProcessRunMetricsProcessStatistics {\n");
            sb.Append("  CurrentCpu: ").Append(CurrentCpu).Append("\n");
            sb.Append("  AverageCpu: ").Append(AverageCpu).Append("\n");
            sb.Append("  CurrentVirtualMemory: ").Append(CurrentVirtualMemory).Append("\n");
            sb.Append("  CurrentWorkingSet: ").Append(CurrentWorkingSet).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
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
            return this.Equals(input as ProcessRunMetricsProcessStatistics);
        }

        /// <summary>
        /// Returns true if ProcessRunMetricsProcessStatistics instances are equal
        /// </summary>
        /// <param name="input">Instance of ProcessRunMetricsProcessStatistics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProcessRunMetricsProcessStatistics input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CurrentCpu == input.CurrentCpu ||
                    (this.CurrentCpu != null &&
                    this.CurrentCpu.Equals(input.CurrentCpu))
                ) && 
                (
                    this.AverageCpu == input.AverageCpu ||
                    (this.AverageCpu != null &&
                    this.AverageCpu.Equals(input.AverageCpu))
                ) && 
                (
                    this.CurrentVirtualMemory == input.CurrentVirtualMemory ||
                    (this.CurrentVirtualMemory != null &&
                    this.CurrentVirtualMemory.Equals(input.CurrentVirtualMemory))
                ) && 
                (
                    this.CurrentWorkingSet == input.CurrentWorkingSet ||
                    (this.CurrentWorkingSet != null &&
                    this.CurrentWorkingSet.Equals(input.CurrentWorkingSet))
                ) && 
                (
                    this.Metrics == input.Metrics ||
                    this.Metrics != null &&
                    input.Metrics != null &&
                    this.Metrics.SequenceEqual(input.Metrics)
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
                if (this.CurrentCpu != null)
                    hashCode = hashCode * 59 + this.CurrentCpu.GetHashCode();
                if (this.AverageCpu != null)
                    hashCode = hashCode * 59 + this.AverageCpu.GetHashCode();
                if (this.CurrentVirtualMemory != null)
                    hashCode = hashCode * 59 + this.CurrentVirtualMemory.GetHashCode();
                if (this.CurrentWorkingSet != null)
                    hashCode = hashCode * 59 + this.CurrentWorkingSet.GetHashCode();
                if (this.Metrics != null)
                    hashCode = hashCode * 59 + this.Metrics.GetHashCode();
                return hashCode;
            }
        }

    }
}
