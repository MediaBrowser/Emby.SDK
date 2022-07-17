/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaystateRequest struct {
	Command *PlaystateCommand `json:"Command,omitempty"`
	SeekPositionTicks int64 `json:"SeekPositionTicks,omitempty"`
	ControllingUserId string `json:"ControllingUserId,omitempty"`
}
