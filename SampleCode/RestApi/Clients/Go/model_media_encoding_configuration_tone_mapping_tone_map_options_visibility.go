/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type MediaEncodingConfigurationToneMappingToneMapOptionsVisibility struct {
	ShowAdvanced bool `json:"ShowAdvanced,omitempty"`
	IsSoftwareToneMappingAvailable bool `json:"IsSoftwareToneMappingAvailable,omitempty"`
	IsAnyHardwareToneMappingAvailable bool `json:"IsAnyHardwareToneMappingAvailable,omitempty"`
	ShowNvidiaOptions bool `json:"ShowNvidiaOptions,omitempty"`
	ShowQuickSyncOptions bool `json:"ShowQuickSyncOptions,omitempty"`
	ShowVaapiOptions bool `json:"ShowVaapiOptions,omitempty"`
	IsOpenClAvailable bool `json:"IsOpenClAvailable,omitempty"`
	IsOpenClSuperTAvailable bool `json:"IsOpenClSuperTAvailable,omitempty"`
	IsVaapiNativeAvailable bool `json:"IsVaapiNativeAvailable,omitempty"`
	IsQuickSyncNativeAvailable bool `json:"IsQuickSyncNativeAvailable,omitempty"`
	OperatingSystem *OperatingSystem `json:"OperatingSystem,omitempty"`
}