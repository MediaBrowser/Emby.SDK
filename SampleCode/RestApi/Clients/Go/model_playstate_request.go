/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type PlaystateRequest struct {
	Command *PlaystateCommand `json:"Command,omitempty"`
	SeekPositionTicks int64 `json:"SeekPositionTicks,omitempty"`
	ControllingUserId string `json:"ControllingUserId,omitempty"`
}
