/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type Version struct {
	Major int32 `json:"Major,omitempty"`
	Minor int32 `json:"Minor,omitempty"`
	Build int32 `json:"Build,omitempty"`
	Revision int32 `json:"Revision,omitempty"`
	MajorRevision int32 `json:"MajorRevision,omitempty"`
	MinorRevision int32 `json:"MinorRevision,omitempty"`
}
