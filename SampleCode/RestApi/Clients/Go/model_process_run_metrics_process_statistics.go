/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProcessRunMetricsProcessStatistics struct {
	// The current cpu.
	CurrentCpu float64 `json:"CurrentCpu,omitempty"`
	// The average cpu.
	AverageCpu float64 `json:"AverageCpu,omitempty"`
	// The currently allocated virtual memory.
	CurrentVirtualMemory float64 `json:"CurrentVirtualMemory,omitempty"`
	// The currently allocated working set.
	CurrentWorkingSet float64 `json:"CurrentWorkingSet,omitempty"`
	// The metrics.
	Metrics []ProcessRunMetricsProcessMetricPoint `json:"Metrics,omitempty"`
}
