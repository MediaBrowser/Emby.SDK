/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LibraryLibraryOptionsResult struct {
	MetadataSavers []LibraryLibraryOptionInfo `json:"MetadataSavers,omitempty"`
	MetadataReaders []LibraryLibraryOptionInfo `json:"MetadataReaders,omitempty"`
	SubtitleFetchers []LibraryLibraryOptionInfo `json:"SubtitleFetchers,omitempty"`
	LyricsFetchers []LibraryLibraryOptionInfo `json:"LyricsFetchers,omitempty"`
	TypeOptions []LibraryLibraryTypeOptions `json:"TypeOptions,omitempty"`
}
