/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LiveTvApiSetChannelDisabled struct {
	Id string `json:"Id,omitempty"`
	ManagementId string `json:"ManagementId,omitempty"`
	Disabled bool `json:"Disabled,omitempty"`
}
