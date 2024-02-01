/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class PlayRequest  
type PlayRequest struct {
	// The controlling user identifier.
	ControllingUserId string `json:"ControllingUserId,omitempty"`
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	StartIndex int32 `json:"StartIndex,omitempty"`
}
