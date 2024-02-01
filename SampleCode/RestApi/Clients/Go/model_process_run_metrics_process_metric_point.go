/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProcessRunMetricsProcessMetricPoint struct {
	// The time.
	Time string `json:"Time,omitempty"`
	// The cpu percent.
	CpuPercent float64 `json:"CpuPercent,omitempty"`
	// The virtual memory.
	VirtualMemory float64 `json:"VirtualMemory,omitempty"`
	// The working set.
	WorkingSet float64 `json:"WorkingSet,omitempty"`
}
