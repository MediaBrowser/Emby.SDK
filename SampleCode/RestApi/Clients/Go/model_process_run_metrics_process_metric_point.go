/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProcessRunMetricsProcessMetricPoint struct {
	Time *TimeSpan `json:"Time,omitempty"`
	CpuPercent float64 `json:"CpuPercent,omitempty"`
	VirtualMemory float64 `json:"VirtualMemory,omitempty"`
	WorkingSet float64 `json:"WorkingSet,omitempty"`
}
