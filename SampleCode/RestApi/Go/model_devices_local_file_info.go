/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
import (
	"time"
)

type DevicesLocalFileInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Album string `json:"Album,omitempty"`
	MimeType string `json:"MimeType,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
}
