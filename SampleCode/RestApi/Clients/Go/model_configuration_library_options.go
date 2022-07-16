/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationLibraryOptions struct {
	EnableArchiveMediaFiles bool `json:"EnableArchiveMediaFiles,omitempty"`
	EnablePhotos bool `json:"EnablePhotos,omitempty"`
	EnableRealtimeMonitor bool `json:"EnableRealtimeMonitor,omitempty"`
	EnableMarkerDetection bool `json:"EnableMarkerDetection,omitempty"`
	EnableMarkerDetectionDuringLibraryScan bool `json:"EnableMarkerDetectionDuringLibraryScan,omitempty"`
	IntroDetectionFingerprintLength int32 `json:"IntroDetectionFingerprintLength,omitempty"`
	EnableChapterImageExtraction bool `json:"EnableChapterImageExtraction,omitempty"`
	ExtractChapterImagesDuringLibraryScan bool `json:"ExtractChapterImagesDuringLibraryScan,omitempty"`
	DownloadImagesInAdvance bool `json:"DownloadImagesInAdvance,omitempty"`
	PathInfos []ConfigurationMediaPathInfo `json:"PathInfos,omitempty"`
	IgnoreHiddenFiles bool `json:"IgnoreHiddenFiles,omitempty"`
	IgnoreFileExtensions []string `json:"IgnoreFileExtensions,omitempty"`
	SaveLocalMetadata bool `json:"SaveLocalMetadata,omitempty"`
	SaveMetadataHidden bool `json:"SaveMetadataHidden,omitempty"`
	SaveLocalThumbnailSets bool `json:"SaveLocalThumbnailSets,omitempty"`
	ImportMissingEpisodes bool `json:"ImportMissingEpisodes,omitempty"`
	ImportPlaylists bool `json:"ImportPlaylists,omitempty"`
	EnableAutomaticSeriesGrouping bool `json:"EnableAutomaticSeriesGrouping,omitempty"`
	EnableEmbeddedTitles bool `json:"EnableEmbeddedTitles,omitempty"`
	EnableAudioResume bool `json:"EnableAudioResume,omitempty"`
	AutomaticRefreshIntervalDays int32 `json:"AutomaticRefreshIntervalDays,omitempty"`
	PreferredMetadataLanguage string `json:"PreferredMetadataLanguage,omitempty"`
	PreferredImageLanguage string `json:"PreferredImageLanguage,omitempty"`
	ContentType string `json:"ContentType,omitempty"`
	MetadataCountryCode string `json:"MetadataCountryCode,omitempty"`
	SeasonZeroDisplayName string `json:"SeasonZeroDisplayName,omitempty"`
	Name string `json:"Name,omitempty"`
	MetadataSavers []string `json:"MetadataSavers,omitempty"`
	DisabledLocalMetadataReaders []string `json:"DisabledLocalMetadataReaders,omitempty"`
	LocalMetadataReaderOrder []string `json:"LocalMetadataReaderOrder,omitempty"`
	DisabledLyricsFetchers []string `json:"DisabledLyricsFetchers,omitempty"`
	SaveLyricsWithMedia bool `json:"SaveLyricsWithMedia,omitempty"`
	LyricsDownloadMaxAgeDays int32 `json:"LyricsDownloadMaxAgeDays,omitempty"`
	LyricsFetcherOrder []string `json:"LyricsFetcherOrder,omitempty"`
	LyricsDownloadLanguages []string `json:"LyricsDownloadLanguages,omitempty"`
	DisabledSubtitleFetchers []string `json:"DisabledSubtitleFetchers,omitempty"`
	SubtitleFetcherOrder []string `json:"SubtitleFetcherOrder,omitempty"`
	SkipSubtitlesIfEmbeddedSubtitlesPresent bool `json:"SkipSubtitlesIfEmbeddedSubtitlesPresent,omitempty"`
	SkipSubtitlesIfAudioTrackMatches bool `json:"SkipSubtitlesIfAudioTrackMatches,omitempty"`
	SubtitleDownloadLanguages []string `json:"SubtitleDownloadLanguages,omitempty"`
	SubtitleDownloadMaxAgeDays int32 `json:"SubtitleDownloadMaxAgeDays,omitempty"`
	RequirePerfectSubtitleMatch bool `json:"RequirePerfectSubtitleMatch,omitempty"`
	SaveSubtitlesWithMedia bool `json:"SaveSubtitlesWithMedia,omitempty"`
	ForcedSubtitlesOnly bool `json:"ForcedSubtitlesOnly,omitempty"`
	TypeOptions []ConfigurationTypeOptions `json:"TypeOptions,omitempty"`
	CollapseSingleItemFolders bool `json:"CollapseSingleItemFolders,omitempty"`
	EnableAdultMetadata bool `json:"EnableAdultMetadata,omitempty"`
	ImportCollections bool `json:"ImportCollections,omitempty"`
	MinCollectionItems int32 `json:"MinCollectionItems,omitempty"`
	MusicFolderStructure string `json:"MusicFolderStructure,omitempty"`
	MinResumePct int32 `json:"MinResumePct,omitempty"`
	MaxResumePct int32 `json:"MaxResumePct,omitempty"`
	MinResumeDurationSeconds int32 `json:"MinResumeDurationSeconds,omitempty"`
	ThumbnailImagesIntervalSeconds int32 `json:"ThumbnailImagesIntervalSeconds,omitempty"`
	SampleIgnoreSize int32 `json:"SampleIgnoreSize,omitempty"`
}
