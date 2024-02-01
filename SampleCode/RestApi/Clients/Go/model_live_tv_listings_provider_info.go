/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvListingsProviderInfo struct {
	Name string `json:"Name,omitempty"`
	SetupUrl string `json:"SetupUrl,omitempty"`
	Id string `json:"Id,omitempty"`
	Type_ string `json:"Type,omitempty"`
	Username string `json:"Username,omitempty"`
	Password string `json:"Password,omitempty"`
	ListingsId string `json:"ListingsId,omitempty"`
	ZipCode string `json:"ZipCode,omitempty"`
	Country string `json:"Country,omitempty"`
	Path string `json:"Path,omitempty"`
	EnabledTuners []string `json:"EnabledTuners,omitempty"`
	EnableAllTuners bool `json:"EnableAllTuners,omitempty"`
	NewsCategories []string `json:"NewsCategories,omitempty"`
	SportsCategories []string `json:"SportsCategories,omitempty"`
	KidsCategories []string `json:"KidsCategories,omitempty"`
	MovieCategories []string `json:"MovieCategories,omitempty"`
	ChannelMappings []NameValuePair `json:"ChannelMappings,omitempty"`
	MoviePrefix string `json:"MoviePrefix,omitempty"`
	PreferredLanguage string `json:"PreferredLanguage,omitempty"`
	UserAgent string `json:"UserAgent,omitempty"`
	DataVersion string `json:"DataVersion,omitempty"`
}
