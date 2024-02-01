/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ItemFileInfo struct {
	Type_ *ItemFileType `json:"Type,omitempty"`
	Name string `json:"Name,omitempty"`
	Path string `json:"Path,omitempty"`
	ImageType *ImageType `json:"ImageType,omitempty"`
	Index int32 `json:"Index,omitempty"`
}
