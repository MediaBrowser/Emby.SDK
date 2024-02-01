/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Interface IPlugin  
type CommonPluginsIPlugin struct {
	// The name of the plugin
	Name string `json:"Name,omitempty"`
	// The description.
	Description string `json:"Description,omitempty"`
	// The unique id.
	Id string `json:"Id,omitempty"`
	Version *Version `json:"Version,omitempty"`
	// The path to the assembly file
	AssemblyFilePath string `json:"AssemblyFilePath,omitempty"`
	// The full path to the data folder, where the plugin can store any miscellaneous files needed
	DataFolderPath string `json:"DataFolderPath,omitempty"`
}
