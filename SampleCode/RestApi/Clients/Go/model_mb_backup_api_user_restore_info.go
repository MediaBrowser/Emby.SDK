/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MbBackupApiUserRestoreInfo struct {
	SourceUserId string `json:"SourceUserId,omitempty"`
	TargetUserId string `json:"TargetUserId,omitempty"`
}