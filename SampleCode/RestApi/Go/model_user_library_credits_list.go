/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type UserLibraryCreditsList struct {
	PersonType *PersonType `json:"PersonType,omitempty"`
	Items []RemoteSearchResult `json:"Items,omitempty"`
}
