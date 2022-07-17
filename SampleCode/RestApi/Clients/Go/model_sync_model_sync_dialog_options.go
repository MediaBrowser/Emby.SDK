/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncModelSyncDialogOptions struct {
	Targets []SyncSyncTarget `json:"Targets,omitempty"`
	Options []SyncModelSyncJobOption `json:"Options,omitempty"`
	QualityOptions []SyncModelSyncQualityOption `json:"QualityOptions,omitempty"`
	ProfileOptions []SyncModelSyncProfileOption `json:"ProfileOptions,omitempty"`
}
