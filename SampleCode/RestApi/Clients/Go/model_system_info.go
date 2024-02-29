/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class SystemInfo  
type SystemInfo struct {
	SystemUpdateLevel *PackageVersionClass `json:"SystemUpdateLevel,omitempty"`
	// The display name of the operating system.
	OperatingSystemDisplayName string `json:"OperatingSystemDisplayName,omitempty"`
	PackageName string `json:"PackageName,omitempty"`
	// A value indicating whether this instance has pending restart.
	HasPendingRestart bool `json:"HasPendingRestart,omitempty"`
	IsShuttingDown bool `json:"IsShuttingDown,omitempty"`
	HasImageEnhancers bool `json:"HasImageEnhancers,omitempty"`
	// The operating sytem.
	OperatingSystem string `json:"OperatingSystem,omitempty"`
	// A value indicating whether \\[supports library monitor\\].
	SupportsLibraryMonitor bool `json:"SupportsLibraryMonitor,omitempty"`
	SupportsLocalPortConfiguration bool `json:"SupportsLocalPortConfiguration,omitempty"`
	SupportsWakeServer bool `json:"SupportsWakeServer,omitempty"`
	// The web socket port number.
	WebSocketPortNumber int32 `json:"WebSocketPortNumber,omitempty"`
	// The completed installations.
	CompletedInstallations []InstallationInfo `json:"CompletedInstallations,omitempty"`
	// A value indicating whether this instance can self restart.
	CanSelfRestart bool `json:"CanSelfRestart,omitempty"`
	// A value indicating whether this instance can self update.
	CanSelfUpdate bool `json:"CanSelfUpdate,omitempty"`
	CanLaunchWebBrowser bool `json:"CanLaunchWebBrowser,omitempty"`
	// The program data path.
	ProgramDataPath string `json:"ProgramDataPath,omitempty"`
	// The items by name path.
	ItemsByNamePath string `json:"ItemsByNamePath,omitempty"`
	// The cache path.
	CachePath string `json:"CachePath,omitempty"`
	// The log path.
	LogPath string `json:"LogPath,omitempty"`
	// The internal metadata path.
	InternalMetadataPath string `json:"InternalMetadataPath,omitempty"`
	// The transcoding temporary path.
	TranscodingTempPath string `json:"TranscodingTempPath,omitempty"`
	// The HTTP server port number.
	HttpServerPortNumber int32 `json:"HttpServerPortNumber,omitempty"`
	// A value indicating whether \\[enable HTTPS\\].
	SupportsHttps bool `json:"SupportsHttps,omitempty"`
	// The HTTPS server port number.
	HttpsPortNumber int32 `json:"HttpsPortNumber,omitempty"`
	// A value indicating whether this instance has update available.
	HasUpdateAvailable bool `json:"HasUpdateAvailable,omitempty"`
	// A value indicating whether \\[supports automatic run at startup\\].
	SupportsAutoRunAtStartup bool `json:"SupportsAutoRunAtStartup,omitempty"`
	HardwareAccelerationRequiresPremiere bool `json:"HardwareAccelerationRequiresPremiere,omitempty"`
	WakeOnLanInfo []WakeOnLanInfo `json:"WakeOnLanInfo,omitempty"`
	// The local address.
	LocalAddress string `json:"LocalAddress,omitempty"`
	LocalAddresses []string `json:"LocalAddresses,omitempty"`
	// The wan address.
	WanAddress string `json:"WanAddress,omitempty"`
	RemoteAddresses []string `json:"RemoteAddresses,omitempty"`
	// The name of the server.
	ServerName string `json:"ServerName,omitempty"`
	// The version.
	Version string `json:"Version,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
}
