/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type EmbyDlnaProfilesHttpHeaderInfo struct {
	Name string `json:"Name,omitempty"`
	Value string `json:"Value,omitempty"`
	Match *EmbyDlnaProfilesHeaderMatchType `json:"Match,omitempty"`
}
