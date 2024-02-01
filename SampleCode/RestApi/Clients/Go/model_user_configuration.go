/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class UserConfiguration  
type UserConfiguration struct {
	// The audio language preference.
	AudioLanguagePreference string `json:"AudioLanguagePreference,omitempty"`
	// A value indicating whether \\[play default audio track\\].
	PlayDefaultAudioTrack bool `json:"PlayDefaultAudioTrack,omitempty"`
	// The subtitle language preference.
	SubtitleLanguagePreference string `json:"SubtitleLanguagePreference,omitempty"`
	ProfilePin string `json:"ProfilePin,omitempty"`
	DisplayMissingEpisodes bool `json:"DisplayMissingEpisodes,omitempty"`
	SubtitleMode *SubtitlePlaybackMode `json:"SubtitleMode,omitempty"`
	OrderedViews []string `json:"OrderedViews,omitempty"`
	LatestItemsExcludes []string `json:"LatestItemsExcludes,omitempty"`
	MyMediaExcludes []string `json:"MyMediaExcludes,omitempty"`
	HidePlayedInLatest bool `json:"HidePlayedInLatest,omitempty"`
	HidePlayedInMoreLikeThis bool `json:"HidePlayedInMoreLikeThis,omitempty"`
	HidePlayedInSuggestions bool `json:"HidePlayedInSuggestions,omitempty"`
	RememberAudioSelections bool `json:"RememberAudioSelections,omitempty"`
	RememberSubtitleSelections bool `json:"RememberSubtitleSelections,omitempty"`
	EnableNextEpisodeAutoPlay bool `json:"EnableNextEpisodeAutoPlay,omitempty"`
	ResumeRewindSeconds int32 `json:"ResumeRewindSeconds,omitempty"`
	IntroSkipMode *SegmentSkipMode `json:"IntroSkipMode,omitempty"`
	EnableLocalPassword bool `json:"EnableLocalPassword,omitempty"`
}
