/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MbBackupApiAllBackupsInfo struct {
	FullBackupInfo *MbBackupBackupInfo `json:"FullBackupInfo,omitempty"`
	LightBackups []MbBackupBackupInfo `json:"LightBackups,omitempty"`
}
