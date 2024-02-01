/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryOptions struct {
	EnableArchiveMediaFiles bool `json:"EnableArchiveMediaFiles,omitempty"`
	EnablePhotos bool `json:"EnablePhotos,omitempty"`
	EnableRealtimeMonitor bool `json:"EnableRealtimeMonitor,omitempty"`
	EnableMarkerDetection bool `json:"EnableMarkerDetection,omitempty"`
	EnableMarkerDetectionDuringLibraryScan bool `json:"EnableMarkerDetectionDuringLibraryScan,omitempty"`
	IntroDetectionFingerprintLength int32 `json:"IntroDetectionFingerprintLength,omitempty"`
	EnableChapterImageExtraction bool `json:"EnableChapterImageExtraction,omitempty"`
	ExtractChapterImagesDuringLibraryScan bool `json:"ExtractChapterImagesDuringLibraryScan,omitempty"`
	DownloadImagesInAdvance bool `json:"DownloadImagesInAdvance,omitempty"`
	CacheImages bool `json:"CacheImages,omitempty"`
	PathInfos []MediaPathInfo `json:"PathInfos,omitempty"`
	IgnoreHiddenFiles bool `json:"IgnoreHiddenFiles,omitempty"`
	IgnoreFileExtensions []string `json:"IgnoreFileExtensions,omitempty"`
	SaveLocalMetadata bool `json:"SaveLocalMetadata,omitempty"`
	SaveMetadataHidden bool `json:"SaveMetadataHidden,omitempty"`
	SaveLocalThumbnailSets bool `json:"SaveLocalThumbnailSets,omitempty"`
	ImportPlaylists bool `json:"ImportPlaylists,omitempty"`
	EnableAutomaticSeriesGrouping bool `json:"EnableAutomaticSeriesGrouping,omitempty"`
	ShareEmbeddedMusicAlbumImages bool `json:"ShareEmbeddedMusicAlbumImages,omitempty"`
	EnableEmbeddedTitles bool `json:"EnableEmbeddedTitles,omitempty"`
	EnableAudioResume bool `json:"EnableAudioResume,omitempty"`
	AutoGenerateChapters bool `json:"AutoGenerateChapters,omitempty"`
	AutomaticRefreshIntervalDays int32 `json:"AutomaticRefreshIntervalDays,omitempty"`
	PlaceholderMetadataRefreshIntervalDays int32 `json:"PlaceholderMetadataRefreshIntervalDays,omitempty"`
	// The preferred metadata language.
	PreferredMetadataLanguage string `json:"PreferredMetadataLanguage,omitempty"`
	PreferredImageLanguage string `json:"PreferredImageLanguage,omitempty"`
	ContentType string `json:"ContentType,omitempty"`
	// The metadata country code.
	MetadataCountryCode string `json:"MetadataCountryCode,omitempty"`
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
	HearingImpairedSubtitlesOnly bool `json:"HearingImpairedSubtitlesOnly,omitempty"`
	TypeOptions []TypeOptions `json:"TypeOptions,omitempty"`
	CollapseSingleItemFolders bool `json:"CollapseSingleItemFolders,omitempty"`
	EnableAdultMetadata bool `json:"EnableAdultMetadata,omitempty"`
	ImportCollections bool `json:"ImportCollections,omitempty"`
	MinCollectionItems int32 `json:"MinCollectionItems,omitempty"`
	MusicFolderStructure string `json:"MusicFolderStructure,omitempty"`
	// The minimum percentage of an item that must be played in order for playstate to be updated.
	MinResumePct int32 `json:"MinResumePct,omitempty"`
	// The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
	MaxResumePct int32 `json:"MaxResumePct,omitempty"`
	// The minimum duration that an item must have in order to be eligible for playstate updates..
	MinResumeDurationSeconds int32 `json:"MinResumeDurationSeconds,omitempty"`
	ThumbnailImagesIntervalSeconds int32 `json:"ThumbnailImagesIntervalSeconds,omitempty"`
	SampleIgnoreSize int32 `json:"SampleIgnoreSize,omitempty"`
}
