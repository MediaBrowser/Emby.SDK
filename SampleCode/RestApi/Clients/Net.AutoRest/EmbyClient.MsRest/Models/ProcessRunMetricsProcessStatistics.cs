// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class ProcessRunMetricsProcessStatistics
    {
        /// <summary>
        /// Initializes a new instance of the
        /// ProcessRunMetricsProcessStatistics class.
        /// </summary>
        public ProcessRunMetricsProcessStatistics()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// ProcessRunMetricsProcessStatistics class.
        /// </summary>
        public ProcessRunMetricsProcessStatistics(double? currentCpu = default(double?), double? averageCpu = default(double?), double? currentVirtualMemory = default(double?), double? currentWorkingSet = default(double?), IList<ProcessRunMetricsProcessMetricPoint> metrics = default(IList<ProcessRunMetricsProcessMetricPoint>))
        {
            CurrentCpu = currentCpu;
            AverageCpu = averageCpu;
            CurrentVirtualMemory = currentVirtualMemory;
            CurrentWorkingSet = currentWorkingSet;
            Metrics = metrics;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CurrentCpu")]
        public double? CurrentCpu { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AverageCpu")]
        public double? AverageCpu { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CurrentVirtualMemory")]
        public double? CurrentVirtualMemory { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CurrentWorkingSet")]
        public double? CurrentWorkingSet { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Metrics")]
        public IList<ProcessRunMetricsProcessMetricPoint> Metrics { get; set; }

    }
}