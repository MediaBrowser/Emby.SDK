/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PersistenceIntroDebugInfo struct {
	Id int64 `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	Start int64 `json:"Start,omitempty"`
	End int64 `json:"End,omitempty"`
}
