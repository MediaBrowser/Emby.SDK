/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type SessionSessionInfo struct {
	PlayState *PlayerStateInfo `json:"PlayState,omitempty"`
	AdditionalUsers []SessionUserInfo `json:"AdditionalUsers,omitempty"`
	RemoteEndPoint string `json:"RemoteEndPoint,omitempty"`
	Protocol string `json:"Protocol,omitempty"`
	PlayableMediaTypes []string `json:"PlayableMediaTypes,omitempty"`
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	Id string `json:"Id,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	UserId string `json:"UserId,omitempty"`
	UserName string `json:"UserName,omitempty"`
	UserPrimaryImageTag string `json:"UserPrimaryImageTag,omitempty"`
	Client string `json:"Client,omitempty"`
	LastActivityDate time.Time `json:"LastActivityDate,omitempty"`
	DeviceName string `json:"DeviceName,omitempty"`
	DeviceType string `json:"DeviceType,omitempty"`
	NowPlayingItem *BaseItemDto `json:"NowPlayingItem,omitempty"`
	InternalDeviceId int64 `json:"InternalDeviceId,omitempty"`
	DeviceId string `json:"DeviceId,omitempty"`
	ApplicationVersion string `json:"ApplicationVersion,omitempty"`
	AppIconUrl string `json:"AppIconUrl,omitempty"`
	SupportedCommands []string `json:"SupportedCommands,omitempty"`
	TranscodingInfo *TranscodingInfo `json:"TranscodingInfo,omitempty"`
	SupportsRemoteControl bool `json:"SupportsRemoteControl,omitempty"`
}
