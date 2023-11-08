/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvApiAvailableRecordingOptions struct {
	RecordingFolders []LiveTvApiNameIdDescriptionPair `json:"RecordingFolders,omitempty"`
	MovieRecordingFolders []LiveTvApiNameIdDescriptionPair `json:"MovieRecordingFolders,omitempty"`
	SeriesRecordingFolders []LiveTvApiNameIdDescriptionPair `json:"SeriesRecordingFolders,omitempty"`
}
