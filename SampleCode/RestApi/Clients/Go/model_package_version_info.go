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

// Class PackageVersionInfo  
type PackageVersionInfo struct {
	// The name.
	Name string `json:"name,omitempty"`
	// The guid.
	Guid string `json:"guid,omitempty"`
	// The version STR.
	VersionStr string `json:"versionStr,omitempty"`
	Classification *PackageVersionClass `json:"classification,omitempty"`
	// The description.
	Description string `json:"description,omitempty"`
	// The required version STR.
	RequiredVersionStr string `json:"requiredVersionStr,omitempty"`
	// The source URL.
	SourceUrl string `json:"sourceUrl,omitempty"`
	// The source URL.
	Checksum string `json:"checksum,omitempty"`
	// The target filename.
	TargetFilename string `json:"targetFilename,omitempty"`
	InfoUrl string `json:"infoUrl,omitempty"`
	Runtimes string `json:"runtimes,omitempty"`
	Timestamp time.Time `json:"timestamp,omitempty"`
}
