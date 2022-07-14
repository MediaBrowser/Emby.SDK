/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type EmbyDlnaProfilesHeaderMatchType string

// List of Emby.Dlna.Profiles.HeaderMatchType
const (
	EQUALS_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Equals"
	REGEX_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Regex"
	SUBSTRING_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Substring"
)
