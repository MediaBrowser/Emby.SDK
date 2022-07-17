/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebApiConfigurationPageInfo struct {
	Name string `json:"Name,omitempty"`
	EnableInMainMenu bool `json:"EnableInMainMenu,omitempty"`
	MenuSection string `json:"MenuSection,omitempty"`
	MenuIcon string `json:"MenuIcon,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	ConfigurationPageType *PluginsConfigurationPageType `json:"ConfigurationPageType,omitempty"`
	PluginId string `json:"PluginId,omitempty"`
	Plugin *CommonPluginsIPlugin `json:"Plugin,omitempty"`
	Translations []string `json:"Translations,omitempty"`
}
