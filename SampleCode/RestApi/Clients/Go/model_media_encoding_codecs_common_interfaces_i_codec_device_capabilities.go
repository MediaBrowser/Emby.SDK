/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities struct {
	SupportsHwUpload bool `json:"SupportsHwUpload,omitempty"`
	SupportsHwDownload bool `json:"SupportsHwDownload,omitempty"`
	SupportsStandaloneDeviceInit bool `json:"SupportsStandaloneDeviceInit,omitempty"`
	Supports10BitProcessing bool `json:"Supports10BitProcessing,omitempty"`
	SupportsNativeToneMapping bool `json:"SupportsNativeToneMapping,omitempty"`
}
