/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncDialogOptions struct {
	Targets []SyncTarget `json:"Targets,omitempty"`
	Options []SyncJobOption `json:"Options,omitempty"`
	QualityOptions []SyncQualityOption `json:"QualityOptions,omitempty"`
	ProfileOptions []SyncProfileOption `json:"ProfileOptions,omitempty"`
}
