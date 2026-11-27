/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsApiHwaSaveHwaConfigResult struct {
	WasSaved bool `json:"WasSaved,omitempty"`
	GraphView *MediaEncodingSettingsHwaProjectionHwaConfigView `json:"GraphView,omitempty"`
}
