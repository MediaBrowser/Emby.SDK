/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibraryLibraryOptionsResult struct {
	MetadataSavers []LibraryLibraryOptionInfo `json:"MetadataSavers,omitempty"`
	MetadataReaders []LibraryLibraryOptionInfo `json:"MetadataReaders,omitempty"`
	SubtitleFetchers []LibraryLibraryOptionInfo `json:"SubtitleFetchers,omitempty"`
	LyricsFetchers []LibraryLibraryOptionInfo `json:"LyricsFetchers,omitempty"`
	TypeOptions []LibraryLibraryTypeOptions `json:"TypeOptions,omitempty"`
}
