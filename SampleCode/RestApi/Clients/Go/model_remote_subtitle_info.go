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

type RemoteSubtitleInfo struct {
	// Use language instead to return the language specified by the subtitle provider
	ThreeLetterISOLanguageName string `json:"ThreeLetterISOLanguageName,omitempty"`
	Id string `json:"Id,omitempty"`
	ProviderName string `json:"ProviderName,omitempty"`
	Name string `json:"Name,omitempty"`
	Format string `json:"Format,omitempty"`
	Author string `json:"Author,omitempty"`
	Comment string `json:"Comment,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	CommunityRating float32 `json:"CommunityRating,omitempty"`
	DownloadCount int32 `json:"DownloadCount,omitempty"`
	IsHashMatch bool `json:"IsHashMatch,omitempty"`
	IsForced bool `json:"IsForced,omitempty"`
	IsHearingImpaired bool `json:"IsHearingImpaired,omitempty"`
	Language string `json:"Language,omitempty"`
}
