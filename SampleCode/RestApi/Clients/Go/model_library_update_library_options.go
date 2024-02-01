/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryUpdateLibraryOptions struct {
	Id string `json:"Id,omitempty"`
	LibraryOptions *LibraryOptions `json:"LibraryOptions,omitempty"`
}
