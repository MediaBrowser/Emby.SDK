/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class for unified presentation of all information associated with a specific codec profile.  
type ProfileInformation struct {
	// The enum member name of the profile.
	ShortName string `json:"ShortName,omitempty"`
	// The common name of the profile.
	Description string `json:"Description,omitempty"`
	// Detail information about the profile.
	Details string `json:"Details,omitempty"`
	// A unique identifier.
	Id string `json:"Id,omitempty"`
	// The bit depths.
	BitDepths []int32 `json:"BitDepths,omitempty"`
}
