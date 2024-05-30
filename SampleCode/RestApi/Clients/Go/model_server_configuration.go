/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Represents the server configuration.  
type ServerConfiguration struct {
	// A value indicating whether \\[enable u pn p\\].
	EnableUPnP bool `json:"EnableUPnP,omitempty"`
	// The public mapped port.
	PublicPort int32 `json:"PublicPort,omitempty"`
	// The public HTTPS port.
	PublicHttpsPort int32 `json:"PublicHttpsPort,omitempty"`
	// The HTTP server port number.
	HttpServerPortNumber int32 `json:"HttpServerPortNumber,omitempty"`
	// The HTTPS server port number.
	HttpsPortNumber int32 `json:"HttpsPortNumber,omitempty"`
	// A value indicating whether \\[use HTTPS\\].
	EnableHttps bool `json:"EnableHttps,omitempty"`
	// The value pointing to the file system where the ssl certiifcate is located..
	CertificatePath string `json:"CertificatePath,omitempty"`
	CertificatePassword string `json:"CertificatePassword,omitempty"`
	// A value indicating whether this instance is port authorized.
	IsPortAuthorized bool `json:"IsPortAuthorized,omitempty"`
	AutoRunWebApp bool `json:"AutoRunWebApp,omitempty"`
	EnableRemoteAccess bool `json:"EnableRemoteAccess,omitempty"`
	LogAllQueryTimes bool `json:"LogAllQueryTimes,omitempty"`
	// A value indicating whether \\[enable case sensitive item ids\\].
	EnableCaseSensitiveItemIds bool `json:"EnableCaseSensitiveItemIds,omitempty"`
	// The metadata path.
	MetadataPath string `json:"MetadataPath,omitempty"`
	MetadataNetworkPath string `json:"MetadataNetworkPath,omitempty"`
	// The preferred metadata language.
	PreferredMetadataLanguage string `json:"PreferredMetadataLanguage,omitempty"`
	// The metadata country code.
	MetadataCountryCode string `json:"MetadataCountryCode,omitempty"`
	// Words to be removed from strings to create a sort name
	SortRemoveWords []string `json:"SortRemoveWords,omitempty"`
	// The delay in seconds that we will wait after a file system change to try and discover what has been added/removed Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several different directories and files.
	LibraryMonitorDelaySeconds int32 `json:"LibraryMonitorDelaySeconds,omitempty"`
	// A value indicating whether \\[enable dashboard response caching\\]. Allows potential contributors without visual studio to modify production dashboard code and test changes.
	EnableDashboardResponseCaching bool `json:"EnableDashboardResponseCaching,omitempty"`
	// Allows the dashboard to be served from a custom path.
	DashboardSourcePath string `json:"DashboardSourcePath,omitempty"`
	ImageSavingConvention *ImageSavingConvention `json:"ImageSavingConvention,omitempty"`
	EnableAutomaticRestart bool `json:"EnableAutomaticRestart,omitempty"`
	ServerName string `json:"ServerName,omitempty"`
	PreferredDetectedRemoteAddressFamily *NetSocketsAddressFamily `json:"PreferredDetectedRemoteAddressFamily,omitempty"`
	WanDdns string `json:"WanDdns,omitempty"`
	UICulture string `json:"UICulture,omitempty"`
	RemoteClientBitrateLimit int32 `json:"RemoteClientBitrateLimit,omitempty"`
	LocalNetworkSubnets []string `json:"LocalNetworkSubnets,omitempty"`
	LocalNetworkAddresses []string `json:"LocalNetworkAddresses,omitempty"`
	EnableExternalContentInSuggestions bool `json:"EnableExternalContentInSuggestions,omitempty"`
	RequireHttps bool `json:"RequireHttps,omitempty"`
	IsBehindProxy bool `json:"IsBehindProxy,omitempty"`
	RemoteIPFilter []string `json:"RemoteIPFilter,omitempty"`
	IsRemoteIPFilterBlacklist bool `json:"IsRemoteIPFilterBlacklist,omitempty"`
	ImageExtractionTimeoutMs int32 `json:"ImageExtractionTimeoutMs,omitempty"`
	PathSubstitutions []PathSubstitution `json:"PathSubstitutions,omitempty"`
	UninstalledPlugins []string `json:"UninstalledPlugins,omitempty"`
	CollapseVideoFolders bool `json:"CollapseVideoFolders,omitempty"`
	EnableOriginalTrackTitles bool `json:"EnableOriginalTrackTitles,omitempty"`
	VacuumDatabaseOnStartup bool `json:"VacuumDatabaseOnStartup,omitempty"`
	SimultaneousStreamLimit int32 `json:"SimultaneousStreamLimit,omitempty"`
	DatabaseCacheSizeMB int32 `json:"DatabaseCacheSizeMB,omitempty"`
	EnableSqLiteMmio bool `json:"EnableSqLiteMmio,omitempty"`
	PlaylistsUpgradedToM3U bool `json:"PlaylistsUpgradedToM3U,omitempty"`
	ImageExtractorUpgraded1 bool `json:"ImageExtractorUpgraded1,omitempty"`
	EnablePeopleLetterSubFolders bool `json:"EnablePeopleLetterSubFolders,omitempty"`
	OptimizeDatabaseOnShutdown bool `json:"OptimizeDatabaseOnShutdown,omitempty"`
	DatabaseAnalysisLimit int32 `json:"DatabaseAnalysisLimit,omitempty"`
	DisableAsyncIO bool `json:"DisableAsyncIO,omitempty"`
	MigratedToUserItemShares8 bool `json:"MigratedToUserItemShares8,omitempty"`
	MigratedLibraryOptionsToDb bool `json:"MigratedLibraryOptionsToDb,omitempty"`
	AllowLegacyLocalNetworkPassword bool `json:"AllowLegacyLocalNetworkPassword,omitempty"`
	EnableSavedMetadataForPeople bool `json:"EnableSavedMetadataForPeople,omitempty"`
	TvChannelsRefreshed bool `json:"TvChannelsRefreshed,omitempty"`
	ProxyHeaderMode *ProxyHeaderMode `json:"ProxyHeaderMode,omitempty"`
	// A value indicating whether \\[enable debug level logging\\].
	EnableDebugLevelLogging bool `json:"EnableDebugLevelLogging,omitempty"`
	RevertDebugLogging string `json:"RevertDebugLogging,omitempty"`
	// Enable automatically and silently updating of the application
	EnableAutoUpdate bool `json:"EnableAutoUpdate,omitempty"`
	// The number of days we should retain log files
	LogFileRetentionDays int32 `json:"LogFileRetentionDays,omitempty"`
	// A value indicating whether \\[run at startup\\].
	RunAtStartup bool `json:"RunAtStartup,omitempty"`
	// A value indicating whether this instance is first run.
	IsStartupWizardCompleted bool `json:"IsStartupWizardCompleted,omitempty"`
	// The cache path.
	CachePath string `json:"CachePath,omitempty"`
}
