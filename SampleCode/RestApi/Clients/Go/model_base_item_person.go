/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// This is used by the api to get information about a Person within a BaseItem  
type BaseItemPerson struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id string `json:"Id,omitempty"`
	// The role.
	Role string `json:"Role,omitempty"`
	Type_ *PersonType `json:"Type,omitempty"`
	// The primary image tag.
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
}
