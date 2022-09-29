/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebGenericUiModelUiViewInfo struct {
	ViewId string `json:"ViewId,omitempty"`
	PageId string `json:"PageId,omitempty"`
	Caption string `json:"Caption,omitempty"`
	SubCaption string `json:"SubCaption,omitempty"`
	PluginId string `json:"PluginId,omitempty"`
	ViewType *EmbyWebGenericUiModelEnumsUiViewType `json:"ViewType,omitempty"`
	ShowDialogFullScreen bool `json:"ShowDialogFullScreen,omitempty"`
	IsInSequence bool `json:"IsInSequence,omitempty"`
	RedirectViewUrl string `json:"RedirectViewUrl,omitempty"`
	EditObjectContainer *GenericEditIEditObjectContainer `json:"EditObjectContainer,omitempty"`
	Commands []EmbyWebGenericUiModelUiCommand `json:"Commands,omitempty"`
	TabPageInfos []EmbyWebGenericUiModelUiTabPageInfo `json:"TabPageInfos,omitempty"`
	IsPageChangeInfo bool `json:"IsPageChangeInfo,omitempty"`
}
