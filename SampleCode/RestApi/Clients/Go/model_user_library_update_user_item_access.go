/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserLibraryUpdateUserItemAccess struct {
	ItemIds []string `json:"ItemIds,omitempty"`
	UserIds []string `json:"UserIds,omitempty"`
	ItemAccess *UserItemShareLevel `json:"ItemAccess,omitempty"`
}
