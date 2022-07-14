/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SystemInfo struct {
	SystemUpdateLevel *UpdatesPackageVersionClass `json:"SystemUpdateLevel,omitempty"`
	OperatingSystemDisplayName string `json:"OperatingSystemDisplayName,omitempty"`
	PackageName string `json:"PackageName,omitempty"`
	HasPendingRestart bool `json:"HasPendingRestart,omitempty"`
	IsShuttingDown bool `json:"IsShuttingDown,omitempty"`
	OperatingSystem string `json:"OperatingSystem,omitempty"`
	SupportsLibraryMonitor bool `json:"SupportsLibraryMonitor,omitempty"`
	SupportsLocalPortConfiguration bool `json:"SupportsLocalPortConfiguration,omitempty"`
	SupportsWakeServer bool `json:"SupportsWakeServer,omitempty"`
	WebSocketPortNumber int32 `json:"WebSocketPortNumber,omitempty"`
	CompletedInstallations []UpdatesInstallationInfo `json:"CompletedInstallations,omitempty"`
	CanSelfRestart bool `json:"CanSelfRestart,omitempty"`
	CanSelfUpdate bool `json:"CanSelfUpdate,omitempty"`
	CanLaunchWebBrowser bool `json:"CanLaunchWebBrowser,omitempty"`
	ProgramDataPath string `json:"ProgramDataPath,omitempty"`
	ItemsByNamePath string `json:"ItemsByNamePath,omitempty"`
	CachePath string `json:"CachePath,omitempty"`
	LogPath string `json:"LogPath,omitempty"`
	InternalMetadataPath string `json:"InternalMetadataPath,omitempty"`
	TranscodingTempPath string `json:"TranscodingTempPath,omitempty"`
	HttpServerPortNumber int32 `json:"HttpServerPortNumber,omitempty"`
	SupportsHttps bool `json:"SupportsHttps,omitempty"`
	HttpsPortNumber int32 `json:"HttpsPortNumber,omitempty"`
	HasUpdateAvailable bool `json:"HasUpdateAvailable,omitempty"`
	SupportsAutoRunAtStartup bool `json:"SupportsAutoRunAtStartup,omitempty"`
	HardwareAccelerationRequiresPremiere bool `json:"HardwareAccelerationRequiresPremiere,omitempty"`
	LocalAddress string `json:"LocalAddress,omitempty"`
	LocalAddresses []string `json:"LocalAddresses,omitempty"`
	WanAddress string `json:"WanAddress,omitempty"`
	RemoteAddresses []string `json:"RemoteAddresses,omitempty"`
	ServerName string `json:"ServerName,omitempty"`
	Version string `json:"Version,omitempty"`
	Id string `json:"Id,omitempty"`
}
