/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserPolicy struct {
	// A value indicating whether this instance is administrator.
	IsAdministrator bool `json:"IsAdministrator,omitempty"`
	// A value indicating whether this instance is hidden.
	IsHidden bool `json:"IsHidden,omitempty"`
	IsHiddenRemotely bool `json:"IsHiddenRemotely,omitempty"`
	IsHiddenFromUnusedDevices bool `json:"IsHiddenFromUnusedDevices,omitempty"`
	// A value indicating whether this instance is disabled.
	IsDisabled bool `json:"IsDisabled,omitempty"`
	LockedOutDate int64 `json:"LockedOutDate,omitempty"`
	// The max parental rating.
	MaxParentalRating int32 `json:"MaxParentalRating,omitempty"`
	AllowTagOrRating bool `json:"AllowTagOrRating,omitempty"`
	BlockedTags []string `json:"BlockedTags,omitempty"`
	IsTagBlockingModeInclusive bool `json:"IsTagBlockingModeInclusive,omitempty"`
	IncludeTags []string `json:"IncludeTags,omitempty"`
	EnableUserPreferenceAccess bool `json:"EnableUserPreferenceAccess,omitempty"`
	AccessSchedules []AccessSchedule `json:"AccessSchedules,omitempty"`
	BlockUnratedItems []UnratedItem `json:"BlockUnratedItems,omitempty"`
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
	RestrictedFeatures []string `json:"RestrictedFeatures,omitempty"`
	EnableContentDeletionFromFolders []string `json:"EnableContentDeletionFromFolders,omitempty"`
	EnableContentDownloading bool `json:"EnableContentDownloading,omitempty"`
	EnableSubtitleDownloading bool `json:"EnableSubtitleDownloading,omitempty"`
	EnableSubtitleManagement bool `json:"EnableSubtitleManagement,omitempty"`
	// A value indicating whether \\[enable synchronize\\].
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
	AllowCameraUpload bool `json:"AllowCameraUpload,omitempty"`
	AllowSharingPersonalItems bool `json:"AllowSharingPersonalItems,omitempty"`
}
