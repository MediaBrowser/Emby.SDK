/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ApiSetChannelDisabled struct {
	Id string `json:"Id,omitempty"`
	ManagementId string `json:"ManagementId,omitempty"`
	Disabled bool `json:"Disabled,omitempty"`
}
