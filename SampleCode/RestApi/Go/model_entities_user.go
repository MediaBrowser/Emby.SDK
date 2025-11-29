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

// Class User  
type EntitiesUser struct {
	// From now on all user paths will be Id\\-based. This is for backwards compatibility.
	UsesIdForConfigurationPath bool `json:"UsesIdForConfigurationPath,omitempty"`
	// The password.
	Password string `json:"Password,omitempty"`
	EasyPassword string `json:"EasyPassword,omitempty"`
	Salt string `json:"Salt,omitempty"`
	ConnectUserName string `json:"ConnectUserName,omitempty"`
	ConnectUserId string `json:"ConnectUserId,omitempty"`
	ConnectLinkType *ConnectUserLinkType `json:"ConnectLinkType,omitempty"`
	ConnectAccessKey string `json:"ConnectAccessKey,omitempty"`
	ImageInfos []EntitiesItemImageInfo `json:"ImageInfos,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The last login date.
	LastLoginDate time.Time `json:"LastLoginDate,omitempty"`
	// The last activity date.
	LastActivityDate time.Time `json:"LastActivityDate,omitempty"`
	PlayedPercentage float64 `json:"PlayedPercentage,omitempty"`
	RecursiveChildCountEqualsChildCount bool `json:"RecursiveChildCountEqualsChildCount,omitempty"`
	// Internal use only
	OriginalParsedName string `json:"OriginalParsedName,omitempty"`
	// Internal use only
	IsNameParsedFromFolder bool `json:"IsNameParsedFromFolder,omitempty"`
	IdString string `json:"IdString,omitempty"`
	// The date created.
	DateCreated time.Time `json:"DateCreated,omitempty"`
	ImportedCollections []LinkedItemInfo `json:"ImportedCollections,omitempty"`
	ResolvedPresentationUniqueKey string `json:"ResolvedPresentationUniqueKey,omitempty"`
}
