/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibraryTypeOptions struct {
	Type_ string `json:"Type,omitempty"`
	MetadataFetchers []LibraryOptionInfo `json:"MetadataFetchers,omitempty"`
	ImageFetchers []LibraryOptionInfo `json:"ImageFetchers,omitempty"`
	SupportedImageTypes []ImageType `json:"SupportedImageTypes,omitempty"`
	DefaultImageOptions []ImageOption `json:"DefaultImageOptions,omitempty"`
}
