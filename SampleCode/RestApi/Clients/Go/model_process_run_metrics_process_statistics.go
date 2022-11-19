/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProcessRunMetricsProcessStatistics struct {
	CurrentCpu float64 `json:"CurrentCpu,omitempty"`
	AverageCpu float64 `json:"AverageCpu,omitempty"`
	CurrentVirtualMemory float64 `json:"CurrentVirtualMemory,omitempty"`
	CurrentWorkingSet float64 `json:"CurrentWorkingSet,omitempty"`
	Metrics []ProcessRunMetricsProcessMetricPoint `json:"Metrics,omitempty"`
}
