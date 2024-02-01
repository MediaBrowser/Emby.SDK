/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationToneMappingToneMapOptionsVisibility struct {
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
