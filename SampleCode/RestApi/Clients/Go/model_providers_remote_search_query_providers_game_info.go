/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ProvidersRemoteSearchQueryProvidersGameInfo struct {
	SearchInfo *ProvidersGameInfo `json:"SearchInfo,omitempty"`
	ItemId int64 `json:"ItemId,omitempty"`
	SearchProviderName string `json:"SearchProviderName,omitempty"`
	Providers []string `json:"Providers,omitempty"`
	IncludeDisabledProviders bool `json:"IncludeDisabledProviders,omitempty"`
}
