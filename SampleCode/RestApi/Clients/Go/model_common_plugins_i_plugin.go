/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CommonPluginsIPlugin struct {
	Name string `json:"Name,omitempty"`
	Description string `json:"Description,omitempty"`
	Id string `json:"Id,omitempty"`
	Version *Version `json:"Version,omitempty"`
	AssemblyFilePath string `json:"AssemblyFilePath,omitempty"`
	DataFolderPath string `json:"DataFolderPath,omitempty"`
}
