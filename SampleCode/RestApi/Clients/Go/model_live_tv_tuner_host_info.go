/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
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
	AllowHWTranscoding bool `json:"AllowHWTranscoding,omitempty"`
	Source string `json:"Source,omitempty"`
	TunerCount int32 `json:"TunerCount,omitempty"`
	UserAgent string `json:"UserAgent,omitempty"`
	Referrer string `json:"Referrer,omitempty"`
	ProviderOptions string `json:"ProviderOptions,omitempty"`
	DataVersion int32 `json:"DataVersion,omitempty"`
}
