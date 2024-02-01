/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryLibraryTypeOptions struct {
	Type_ string `json:"Type,omitempty"`
	MetadataFetchers []LibraryLibraryOptionInfo `json:"MetadataFetchers,omitempty"`
	ImageFetchers []LibraryLibraryOptionInfo `json:"ImageFetchers,omitempty"`
	SupportedImageTypes []ImageType `json:"SupportedImageTypes,omitempty"`
	DefaultImageOptions []ImageOption `json:"DefaultImageOptions,omitempty"`
}
