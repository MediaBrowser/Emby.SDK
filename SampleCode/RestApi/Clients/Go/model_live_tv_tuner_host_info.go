/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvTunerHostInfo struct {
	Id string `json:"Id,omitempty"`
	Url string `json:"Url,omitempty"`
	Type_ string `json:"Type,omitempty"`
	DeviceId string `json:"DeviceId,omitempty"`
	FriendlyName string `json:"FriendlyName,omitempty"`
	SetupUrl string `json:"SetupUrl,omitempty"`
	ImportFavoritesOnly bool `json:"ImportFavoritesOnly,omitempty"`
	PreferEpgChannelImages bool `json:"PreferEpgChannelImages,omitempty"`
	PreferEpgChannelNumbers bool `json:"PreferEpgChannelNumbers,omitempty"`
	AllowHWTranscoding bool `json:"AllowHWTranscoding,omitempty"`
	AllowMappingByNumber bool `json:"AllowMappingByNumber,omitempty"`
	ImportGuideData bool `json:"ImportGuideData,omitempty"`
	Source string `json:"Source,omitempty"`
	TunerCount int32 `json:"TunerCount,omitempty"`
	UserAgent string `json:"UserAgent,omitempty"`
	Referrer string `json:"Referrer,omitempty"`
	ProviderOptions string `json:"ProviderOptions,omitempty"`
	DataVersion int32 `json:"DataVersion,omitempty"`
}
