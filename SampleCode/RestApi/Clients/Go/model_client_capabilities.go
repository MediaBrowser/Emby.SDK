/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ClientCapabilities struct {
	PlayableMediaTypes []string `json:"PlayableMediaTypes,omitempty"`
	SupportedCommands []string `json:"SupportedCommands,omitempty"`
	SupportsMediaControl bool `json:"SupportsMediaControl,omitempty"`
	PushToken string `json:"PushToken,omitempty"`
	PushTokenType string `json:"PushTokenType,omitempty"`
	SupportsSync bool `json:"SupportsSync,omitempty"`
	DeviceProfile *DeviceProfile `json:"DeviceProfile,omitempty"`
	IconUrl string `json:"IconUrl,omitempty"`
	AppId string `json:"AppId,omitempty"`
}
