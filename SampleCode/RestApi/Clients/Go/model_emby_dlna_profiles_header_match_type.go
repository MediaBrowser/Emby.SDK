/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyDlnaProfilesHeaderMatchType string

// List of Emby.Dlna.Profiles.HeaderMatchType
const (
	EQUALS_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Equals"
	REGEX_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Regex"
	SUBSTRING_EmbyDlnaProfilesHeaderMatchType EmbyDlnaProfilesHeaderMatchType = "Substring"
)
