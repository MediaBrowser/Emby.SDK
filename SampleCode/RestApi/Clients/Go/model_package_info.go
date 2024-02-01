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

// Class PackageInfo  
type PackageInfo struct {
	// The internal id of this package.
	Id string `json:"id,omitempty"`
	// The name.
	Name string `json:"name,omitempty"`
	// The short description.
	ShortDescription string `json:"shortDescription,omitempty"`
	// The overview.
	Overview string `json:"overview,omitempty"`
	// A value indicating whether this instance is premium.
	IsPremium bool `json:"isPremium,omitempty"`
	// A value indicating whether this instance is adult only content.
	Adult bool `json:"adult,omitempty"`
	// The rich desc URL.
	RichDescUrl string `json:"richDescUrl,omitempty"`
	// The thumb image.
	ThumbImage string `json:"thumbImage,omitempty"`
	// The preview image.
	PreviewImage string `json:"previewImage,omitempty"`
	// The type.
	Type_ string `json:"type,omitempty"`
	// The target filename.
	TargetFilename string `json:"targetFilename,omitempty"`
	// The owner.
	Owner string `json:"owner,omitempty"`
	// The category.
	Category string `json:"category,omitempty"`
	// The catalog tile color.
	TileColor string `json:"tileColor,omitempty"`
	// The feature id of this package (if premium).
	FeatureId string `json:"featureId,omitempty"`
	// The price for this package (if premium).
	Price float32 `json:"price,omitempty"`
	TargetSystem *PackageTargetSystem `json:"targetSystem,omitempty"`
	// The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.
	Guid string `json:"guid,omitempty"`
	// Whether or not this package is registered.
	IsRegistered bool `json:"isRegistered,omitempty"`
	// The expiration date for this package.
	ExpDate time.Time `json:"expDate,omitempty"`
	// The versions.
	Versions []PackageVersionInfo `json:"versions,omitempty"`
	// A value indicating whether \\[enable in application store\\].
	EnableInAppStore bool `json:"enableInAppStore,omitempty"`
	// The installs.
	Installs int32 `json:"installs,omitempty"`
}
