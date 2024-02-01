/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UiViewInfo struct {
	ViewId string `json:"ViewId,omitempty"`
	PageId string `json:"PageId,omitempty"`
	Caption string `json:"Caption,omitempty"`
	SubCaption string `json:"SubCaption,omitempty"`
	PluginId string `json:"PluginId,omitempty"`
	ViewType *EnumsUiViewType `json:"ViewType,omitempty"`
	ShowDialogFullScreen bool `json:"ShowDialogFullScreen,omitempty"`
	IsInSequence bool `json:"IsInSequence,omitempty"`
	RedirectViewUrl string `json:"RedirectViewUrl,omitempty"`
	EditObjectContainer *GenericEditIEditObjectContainer `json:"EditObjectContainer,omitempty"`
	Commands []UiCommand `json:"Commands,omitempty"`
	TabPageInfos []UiTabPageInfo `json:"TabPageInfos,omitempty"`
	IsPageChangeInfo bool `json:"IsPageChangeInfo,omitempty"`
}
