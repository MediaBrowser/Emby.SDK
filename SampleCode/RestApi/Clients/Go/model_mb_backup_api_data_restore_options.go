/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MbBackupApiDataRestoreOptions struct {
	Users []MbBackupApiUserRestoreInfo `json:"Users,omitempty"`
}
