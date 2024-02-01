/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaProfilesHeaderMatchType string

// List of Dlna.Profiles.HeaderMatchType
const (
	EQUALS_DlnaProfilesHeaderMatchType DlnaProfilesHeaderMatchType = "Equals"
	REGEX_DlnaProfilesHeaderMatchType DlnaProfilesHeaderMatchType = "Regex"
	SUBSTRING_DlnaProfilesHeaderMatchType DlnaProfilesHeaderMatchType = "Substring"
)
