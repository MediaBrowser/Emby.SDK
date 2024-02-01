/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CommonInterfacesICodecDeviceCapabilities struct {
	SupportsHwUpload bool `json:"SupportsHwUpload,omitempty"`
	SupportsHwDownload bool `json:"SupportsHwDownload,omitempty"`
	SupportsStandaloneDeviceInit bool `json:"SupportsStandaloneDeviceInit,omitempty"`
	Supports10BitProcessing bool `json:"Supports10BitProcessing,omitempty"`
	SupportsNativeToneMapping bool `json:"SupportsNativeToneMapping,omitempty"`
}
