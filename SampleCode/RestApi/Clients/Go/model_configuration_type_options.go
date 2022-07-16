/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationTypeOptions struct {
	Type_ string `json:"Type,omitempty"`
	MetadataFetchers []string `json:"MetadataFetchers,omitempty"`
	MetadataFetcherOrder []string `json:"MetadataFetcherOrder,omitempty"`
	ImageFetchers []string `json:"ImageFetchers,omitempty"`
	ImageFetcherOrder []string `json:"ImageFetcherOrder,omitempty"`
	ImageOptions []ConfigurationImageOption `json:"ImageOptions,omitempty"`
}
