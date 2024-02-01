/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type AllThemeMediaResult struct {
	ThemeVideosResult *ThemeMediaResult `json:"ThemeVideosResult,omitempty"`
	ThemeSongsResult *ThemeMediaResult `json:"ThemeSongsResult,omitempty"`
	SoundtrackSongsResult *ThemeMediaResult `json:"SoundtrackSongsResult,omitempty"`
}
