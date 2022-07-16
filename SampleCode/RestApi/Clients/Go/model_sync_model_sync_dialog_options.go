/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type SyncModelSyncDialogOptions struct {
	Targets []SyncSyncTarget `json:"Targets,omitempty"`
	Options []SyncModelSyncJobOption `json:"Options,omitempty"`
	QualityOptions []SyncModelSyncQualityOption `json:"QualityOptions,omitempty"`
	ProfileOptions []SyncModelSyncProfileOption `json:"ProfileOptions,omitempty"`
}
