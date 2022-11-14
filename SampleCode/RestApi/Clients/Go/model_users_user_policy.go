/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UsersUserPolicy struct {
	IsAdministrator bool `json:"IsAdministrator,omitempty"`
	IsHidden bool `json:"IsHidden,omitempty"`
	IsHiddenRemotely bool `json:"IsHiddenRemotely,omitempty"`
	IsHiddenFromUnusedDevices bool `json:"IsHiddenFromUnusedDevices,omitempty"`
	IsDisabled bool `json:"IsDisabled,omitempty"`
	MaxParentalRating int32 `json:"MaxParentalRating,omitempty"`
	AllowTagOrRating bool `json:"AllowTagOrRating,omitempty"`
	BlockedTags []string `json:"BlockedTags,omitempty"`
	IsTagBlockingModeInclusive bool `json:"IsTagBlockingModeInclusive,omitempty"`
	IncludeTags []string `json:"IncludeTags,omitempty"`
	EnableUserPreferenceAccess bool `json:"EnableUserPreferenceAccess,omitempty"`
	AccessSchedules []ConfigurationAccessSchedule `json:"AccessSchedules,omitempty"`
	BlockUnratedItems []ConfigurationUnratedItem `json:"BlockUnratedItems,omitempty"`
	EnableRemoteControlOfOtherUsers bool `json:"EnableRemoteControlOfOtherUsers,omitempty"`
	EnableSharedDeviceControl bool `json:"EnableSharedDeviceControl,omitempty"`
	EnableRemoteAccess bool `json:"EnableRemoteAccess,omitempty"`
	EnableLiveTvManagement bool `json:"EnableLiveTvManagement,omitempty"`
	EnableLiveTvAccess bool `json:"EnableLiveTvAccess,omitempty"`
	EnableMediaPlayback bool `json:"EnableMediaPlayback,omitempty"`
	EnableAudioPlaybackTranscoding bool `json:"EnableAudioPlaybackTranscoding,omitempty"`
	EnableVideoPlaybackTranscoding bool `json:"EnableVideoPlaybackTranscoding,omitempty"`
	EnablePlaybackRemuxing bool `json:"EnablePlaybackRemuxing,omitempty"`
	EnableContentDeletion bool `json:"EnableContentDeletion,omitempty"`
	EnableContentDeletionFromFolders []string `json:"EnableContentDeletionFromFolders,omitempty"`
	EnableContentDownloading bool `json:"EnableContentDownloading,omitempty"`
	EnableSubtitleDownloading bool `json:"EnableSubtitleDownloading,omitempty"`
	EnableSubtitleManagement bool `json:"EnableSubtitleManagement,omitempty"`
	EnableSyncTranscoding bool `json:"EnableSyncTranscoding,omitempty"`
	EnableMediaConversion bool `json:"EnableMediaConversion,omitempty"`
	EnabledChannels []string `json:"EnabledChannels,omitempty"`
	EnableAllChannels bool `json:"EnableAllChannels,omitempty"`
	EnabledFolders []string `json:"EnabledFolders,omitempty"`
	EnableAllFolders bool `json:"EnableAllFolders,omitempty"`
	InvalidLoginAttemptCount int32 `json:"InvalidLoginAttemptCount,omitempty"`
	EnablePublicSharing bool `json:"EnablePublicSharing,omitempty"`
	BlockedMediaFolders []string `json:"BlockedMediaFolders,omitempty"`
	RemoteClientBitrateLimit int32 `json:"RemoteClientBitrateLimit,omitempty"`
	AuthenticationProviderId string `json:"AuthenticationProviderId,omitempty"`
	ExcludedSubFolders []string `json:"ExcludedSubFolders,omitempty"`
	SimultaneousStreamLimit int32 `json:"SimultaneousStreamLimit,omitempty"`
	EnabledDevices []string `json:"EnabledDevices,omitempty"`
	EnableAllDevices bool `json:"EnableAllDevices,omitempty"`
}
