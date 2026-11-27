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

type MediaEncodingSettingsHwaProjectionHwaConfigView struct {
	IsInitialized bool `json:"IsInitialized,omitempty"`
	ConfigMode *MediaEncodingHwaEnumsHwaConfigMode `json:"ConfigMode,omitempty"`
	Root *MediaEncodingSettingsHwaProjectionNodesUiNodeRoot `json:"Root,omitempty"`
	FocusNodeId string `json:"FocusNodeId,omitempty"`
	ConfigName string `json:"ConfigName,omitempty"`
	ConfigSavedOn time.Time `json:"ConfigSavedOn,omitempty"`
	ConfigSavedBy string `json:"ConfigSavedBy,omitempty"`
	ConfigRevision int32 `json:"ConfigRevision,omitempty"`
	HasUnsavedChanges bool `json:"HasUnsavedChanges,omitempty"`
	BasicModeOptions []MediaEncodingSettingsHwaProjectionBasicModeOption `json:"BasicModeOptions,omitempty"`
	BasicSelectedNodeId string `json:"BasicSelectedNodeId,omitempty"`
	ModeLegend string `json:"ModeLegend,omitempty"`
	ChangeConfigWizardUrl string `json:"ChangeConfigWizardUrl,omitempty"`
	HelpUrl string `json:"HelpUrl,omitempty"`
	ShowDeviceSelector bool `json:"ShowDeviceSelector,omitempty"`
	ShowSavedConfigInfo bool `json:"ShowSavedConfigInfo,omitempty"`
}
