/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ParentalRating struct {
	Name string `json:"Name,omitempty"`
	Value int32 `json:"Value,omitempty"`
}
