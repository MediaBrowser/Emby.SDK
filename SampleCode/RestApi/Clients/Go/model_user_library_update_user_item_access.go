/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type UserLibraryUpdateUserItemAccess struct {
	ItemIds []string `json:"ItemIds,omitempty"`
	UserIds []string `json:"UserIds,omitempty"`
	ItemAccess *UserItemShareLevel `json:"ItemAccess,omitempty"`
}
