/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
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
