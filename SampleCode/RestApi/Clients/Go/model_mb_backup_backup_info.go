/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type MbBackupBackupInfo struct {
	ServerVersion string `json:"ServerVersion,omitempty"`
	PluginVersion string `json:"PluginVersion,omitempty"`
	Name string `json:"Name,omitempty"`
	CanRestore bool `json:"CanRestore,omitempty"`
	IsFullBackup bool `json:"IsFullBackup,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	Users []NameIdPair `json:"Users,omitempty"`
}
