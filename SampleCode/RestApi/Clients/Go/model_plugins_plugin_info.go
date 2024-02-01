/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// This is a serializable stub class that is used by the api to provide information about installed plugins.  
type PluginsPluginInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The version.
	Version string `json:"Version,omitempty"`
	// The name of the configuration file.
	ConfigurationFileName string `json:"ConfigurationFileName,omitempty"`
	// The description.
	Description string `json:"Description,omitempty"`
	// The unique id.
	Id string `json:"Id,omitempty"`
	// The image URL.
	ImageTag string `json:"ImageTag,omitempty"`
}
