/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncJobRequest struct {
	TargetId string `json:"TargetId,omitempty"`
	ItemIds []string `json:"ItemIds,omitempty"`
	Category *SyncCategory `json:"Category,omitempty"`
	ParentId string `json:"ParentId,omitempty"`
	Quality string `json:"Quality,omitempty"`
	Profile string `json:"Profile,omitempty"`
	Container string `json:"Container,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	Name string `json:"Name,omitempty"`
	UserId string `json:"UserId,omitempty"`
	UnwatchedOnly bool `json:"UnwatchedOnly,omitempty"`
	SyncNewContent bool `json:"SyncNewContent,omitempty"`
	ItemLimit int32 `json:"ItemLimit,omitempty"`
	Bitrate int32 `json:"Bitrate,omitempty"`
	Downloaded bool `json:"Downloaded,omitempty"`
}
