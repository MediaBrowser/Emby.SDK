/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ApiAvailableRecordingOptions struct {
	RecordingFolders []NameIdPair `json:"RecordingFolders,omitempty"`
	MovieRecordingFolders []NameIdPair `json:"MovieRecordingFolders,omitempty"`
	SeriesRecordingFolders []NameIdPair `json:"SeriesRecordingFolders,omitempty"`
}
