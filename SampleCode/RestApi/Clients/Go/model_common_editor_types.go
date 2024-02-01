/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CommonEditorTypes string

// List of Common.EditorTypes
const (
	GROUP_CommonEditorTypes CommonEditorTypes = "Group"
	TEXT_CommonEditorTypes CommonEditorTypes = "Text"
	NUMERIC_CommonEditorTypes CommonEditorTypes = "Numeric"
	BOOLEAN_CommonEditorTypes CommonEditorTypes = "Boolean"
	SELECT_SINGLE_CommonEditorTypes CommonEditorTypes = "SelectSingle"
	SELECT_MULTIPLE_CommonEditorTypes CommonEditorTypes = "SelectMultiple"
	DATE_CommonEditorTypes CommonEditorTypes = "Date"
	FILE_PATH_CommonEditorTypes CommonEditorTypes = "FilePath"
	FOLDER_PATH_CommonEditorTypes CommonEditorTypes = "FolderPath"
	STATUS_ITEM_CommonEditorTypes CommonEditorTypes = "StatusItem"
	PROGRESS_ITEM_CommonEditorTypes CommonEditorTypes = "ProgressItem"
	BUTTON_ITEM_CommonEditorTypes CommonEditorTypes = "ButtonItem"
	BUTTON_GROUP_CommonEditorTypes CommonEditorTypes = "ButtonGroup"
	CAPTION_ITEM_CommonEditorTypes CommonEditorTypes = "CaptionItem"
	LABEL_ITEM_CommonEditorTypes CommonEditorTypes = "LabelItem"
	ITEM_LIST_CommonEditorTypes CommonEditorTypes = "ItemList"
	RADIO_GROUP_CommonEditorTypes CommonEditorTypes = "RadioGroup"
	DX_DATA_GRID_CommonEditorTypes CommonEditorTypes = "DxDataGrid"
	DX_PIVOT_GRID_CommonEditorTypes CommonEditorTypes = "DxPivotGrid"
	SPACER_ITEM_CommonEditorTypes CommonEditorTypes = "SpacerItem"
)
