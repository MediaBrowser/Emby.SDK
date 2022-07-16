/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
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
