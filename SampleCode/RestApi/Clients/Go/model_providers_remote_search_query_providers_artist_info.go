/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type ProvidersRemoteSearchQueryProvidersArtistInfo struct {
	SearchInfo *ProvidersArtistInfo `json:"SearchInfo,omitempty"`
	ItemId int64 `json:"ItemId,omitempty"`
	SearchProviderName string `json:"SearchProviderName,omitempty"`
	Providers []string `json:"Providers,omitempty"`
	IncludeDisabledProviders bool `json:"IncludeDisabledProviders,omitempty"`
}