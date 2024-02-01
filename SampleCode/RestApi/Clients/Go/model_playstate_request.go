/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaystateRequest struct {
	Command *PlaystateCommand `json:"Command,omitempty"`
	SeekPositionTicks int64 `json:"SeekPositionTicks,omitempty"`
	// The controlling user identifier.
	ControllingUserId string `json:"ControllingUserId,omitempty"`
}
