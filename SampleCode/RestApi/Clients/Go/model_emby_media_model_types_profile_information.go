/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyMediaModelTypesProfileInformation struct {
	ShortName string `json:"ShortName,omitempty"`
	Description string `json:"Description,omitempty"`
	Details string `json:"Details,omitempty"`
	Id string `json:"Id,omitempty"`
	BitDepths []int32 `json:"BitDepths,omitempty"`
}
