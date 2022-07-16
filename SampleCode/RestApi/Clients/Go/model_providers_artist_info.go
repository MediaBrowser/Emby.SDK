/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go
import (
	"time"
)

type ProvidersArtistInfo struct {
	Name string `json:"Name,omitempty"`
	MetadataLanguage string `json:"MetadataLanguage,omitempty"`
	MetadataCountryCode string `json:"MetadataCountryCode,omitempty"`
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	Year int32 `json:"Year,omitempty"`
	IndexNumber int32 `json:"IndexNumber,omitempty"`
	ParentIndexNumber int32 `json:"ParentIndexNumber,omitempty"`
	PremiereDate time.Time `json:"PremiereDate,omitempty"`
	IsAutomated bool `json:"IsAutomated,omitempty"`
	EnableAdultMetadata bool `json:"EnableAdultMetadata,omitempty"`
}
