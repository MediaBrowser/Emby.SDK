/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationServerConfiguration struct {
	EnableUPnP bool `json:"EnableUPnP,omitempty"`
	PublicPort int32 `json:"PublicPort,omitempty"`
	PublicHttpsPort int32 `json:"PublicHttpsPort,omitempty"`
	HttpServerPortNumber int32 `json:"HttpServerPortNumber,omitempty"`
	HttpsPortNumber int32 `json:"HttpsPortNumber,omitempty"`
	EnableHttps bool `json:"EnableHttps,omitempty"`
	CertificatePath string `json:"CertificatePath,omitempty"`
	CertificatePassword string `json:"CertificatePassword,omitempty"`
	IsPortAuthorized bool `json:"IsPortAuthorized,omitempty"`
	AutoRunWebApp bool `json:"AutoRunWebApp,omitempty"`
	EnableRemoteAccess bool `json:"EnableRemoteAccess,omitempty"`
	LogAllQueryTimes bool `json:"LogAllQueryTimes,omitempty"`
	EnableCaseSensitiveItemIds bool `json:"EnableCaseSensitiveItemIds,omitempty"`
	MetadataPath string `json:"MetadataPath,omitempty"`
	MetadataNetworkPath string `json:"MetadataNetworkPath,omitempty"`
	PreferredMetadataLanguage string `json:"PreferredMetadataLanguage,omitempty"`
	MetadataCountryCode string `json:"MetadataCountryCode,omitempty"`
	SortRemoveWords []string `json:"SortRemoveWords,omitempty"`
	LibraryMonitorDelay int32 `json:"LibraryMonitorDelay,omitempty"`
	EnableDashboardResponseCaching bool `json:"EnableDashboardResponseCaching,omitempty"`
	DashboardSourcePath string `json:"DashboardSourcePath,omitempty"`
	ImageSavingConvention *ConfigurationImageSavingConvention `json:"ImageSavingConvention,omitempty"`
	EnableAutomaticRestart bool `json:"EnableAutomaticRestart,omitempty"`
	ServerName string `json:"ServerName,omitempty"`
	WanDdns string `json:"WanDdns,omitempty"`
	UICulture string `json:"UICulture,omitempty"`
	RemoteClientBitrateLimit int32 `json:"RemoteClientBitrateLimit,omitempty"`
	DisplaySpecialsWithinSeasons bool `json:"DisplaySpecialsWithinSeasons,omitempty"`
	LocalNetworkSubnets []string `json:"LocalNetworkSubnets,omitempty"`
	LocalNetworkAddresses []string `json:"LocalNetworkAddresses,omitempty"`
	EnableExternalContentInSuggestions bool `json:"EnableExternalContentInSuggestions,omitempty"`
	RequireHttps bool `json:"RequireHttps,omitempty"`
	IsBehindProxy bool `json:"IsBehindProxy,omitempty"`
	RemoteIPFilter []string `json:"RemoteIPFilter,omitempty"`
	IsRemoteIPFilterBlacklist bool `json:"IsRemoteIPFilterBlacklist,omitempty"`
	ImageExtractionTimeoutMs int32 `json:"ImageExtractionTimeoutMs,omitempty"`
	PathSubstitutions []ConfigurationPathSubstitution `json:"PathSubstitutions,omitempty"`
	UninstalledPlugins []string `json:"UninstalledPlugins,omitempty"`
	CollapseVideoFolders bool `json:"CollapseVideoFolders,omitempty"`
	EnableOriginalTrackTitles bool `json:"EnableOriginalTrackTitles,omitempty"`
	VacuumDatabaseOnStartup bool `json:"VacuumDatabaseOnStartup,omitempty"`
	SimultaneousStreamLimit int32 `json:"SimultaneousStreamLimit,omitempty"`
	DatabaseCacheSizeMB int32 `json:"DatabaseCacheSizeMB,omitempty"`
	EnableSqLiteMmio bool `json:"EnableSqLiteMmio,omitempty"`
	ChannelOptionsUpgraded bool `json:"ChannelOptionsUpgraded,omitempty"`
	TimerIdsUpgraded bool `json:"TimerIdsUpgraded,omitempty"`
	ForcedSortNameUpgraded bool `json:"ForcedSortNameUpgraded,omitempty"`
	InheritedParentalRatingValueUpgraded bool `json:"InheritedParentalRatingValueUpgraded,omitempty"`
	EnablePeopleLetterSubFolders bool `json:"EnablePeopleLetterSubFolders,omitempty"`
	OptimizeDatabaseOnShutdown bool `json:"OptimizeDatabaseOnShutdown,omitempty"`
	DatabaseAnalysisLimit int32 `json:"DatabaseAnalysisLimit,omitempty"`
	DisableAsyncIO bool `json:"DisableAsyncIO,omitempty"`
	EnableDebugLevelLogging bool `json:"EnableDebugLevelLogging,omitempty"`
	RevertDebugLogging string `json:"RevertDebugLogging,omitempty"`
	EnableAutoUpdate bool `json:"EnableAutoUpdate,omitempty"`
	LogFileRetentionDays int32 `json:"LogFileRetentionDays,omitempty"`
	RunAtStartup bool `json:"RunAtStartup,omitempty"`
	IsStartupWizardCompleted bool `json:"IsStartupWizardCompleted,omitempty"`
	CachePath string `json:"CachePath,omitempty"`
}
