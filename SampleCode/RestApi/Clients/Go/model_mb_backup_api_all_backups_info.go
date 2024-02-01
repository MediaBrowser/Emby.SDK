/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MbBackupApiAllBackupsInfo struct {
	FullBackupInfo *MbBackupBackupInfo `json:"FullBackupInfo,omitempty"`
	LightBackups []MbBackupBackupInfo `json:"LightBackups,omitempty"`
}
