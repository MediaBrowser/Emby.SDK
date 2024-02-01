/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ApiAvailableRecordingOptions struct {
	RecordingFolders []ApiNameIdDescriptionPair `json:"RecordingFolders,omitempty"`
	MovieRecordingFolders []ApiNameIdDescriptionPair `json:"MovieRecordingFolders,omitempty"`
	SeriesRecordingFolders []ApiNameIdDescriptionPair `json:"SeriesRecordingFolders,omitempty"`
}
