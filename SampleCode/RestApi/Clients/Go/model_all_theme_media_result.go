/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type AllThemeMediaResult struct {
	ThemeVideosResult *ThemeMediaResult `json:"ThemeVideosResult,omitempty"`
	ThemeSongsResult *ThemeMediaResult `json:"ThemeSongsResult,omitempty"`
	SoundtrackSongsResult *ThemeMediaResult `json:"SoundtrackSongsResult,omitempty"`
}
