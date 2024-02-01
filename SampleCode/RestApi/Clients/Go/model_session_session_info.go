/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

// Class SessionInfo  
type SessionSessionInfo struct {
	PlayState *PlayerStateInfo `json:"PlayState,omitempty"`
	AdditionalUsers []SessionUserInfo `json:"AdditionalUsers,omitempty"`
	// The remote end point.
	RemoteEndPoint string `json:"RemoteEndPoint,omitempty"`
	Protocol string `json:"Protocol,omitempty"`
	// The playable media types.
	PlayableMediaTypes []string `json:"PlayableMediaTypes,omitempty"`
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	// The user id.
	UserId string `json:"UserId,omitempty"`
	// The username.
	UserName string `json:"UserName,omitempty"`
	UserPrimaryImageTag string `json:"UserPrimaryImageTag,omitempty"`
	// The type of the client.
	Client string `json:"Client,omitempty"`
	// The last activity date.
	LastActivityDate time.Time `json:"LastActivityDate,omitempty"`
	// The name of the device.
	DeviceName string `json:"DeviceName,omitempty"`
	DeviceType string `json:"DeviceType,omitempty"`
	NowPlayingItem *BaseItemDto `json:"NowPlayingItem,omitempty"`
	InternalDeviceId int64 `json:"InternalDeviceId,omitempty"`
	// The device id.
	DeviceId string `json:"DeviceId,omitempty"`
	// The application version.
	ApplicationVersion string `json:"ApplicationVersion,omitempty"`
	// The application icon URL.
	AppIconUrl string `json:"AppIconUrl,omitempty"`
	// The supported commands.
	SupportedCommands []string `json:"SupportedCommands,omitempty"`
	TranscodingInfo *TranscodingInfo `json:"TranscodingInfo,omitempty"`
	SupportsRemoteControl bool `json:"SupportsRemoteControl,omitempty"`
}
