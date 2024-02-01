/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EnumsUiCommandType string

// List of Enums.UICommandType
const (
	CUSTOM_EnumsUiCommandType EnumsUiCommandType = "Custom"
	WIZARD_CANCEL_EnumsUiCommandType EnumsUiCommandType = "WizardCancel"
	WIZARD_BACK_EnumsUiCommandType EnumsUiCommandType = "WizardBack"
	WIZARD_NEXT_EnumsUiCommandType EnumsUiCommandType = "WizardNext"
	WIZARD_FINISH_EnumsUiCommandType EnumsUiCommandType = "WizardFinish"
	DIALOG_CANCEL_EnumsUiCommandType EnumsUiCommandType = "DialogCancel"
	DIALOG_OK_EnumsUiCommandType EnumsUiCommandType = "DialogOk"
	PAGE_SAVE_EnumsUiCommandType EnumsUiCommandType = "PageSave"
	PAGE_BACK_EnumsUiCommandType EnumsUiCommandType = "PageBack"
	WIZARD_BUTTON1_EnumsUiCommandType EnumsUiCommandType = "WizardButton1"
	WIZARD_BUTTON2_EnumsUiCommandType EnumsUiCommandType = "WizardButton2"
	WIZARD_BUTTON3_EnumsUiCommandType EnumsUiCommandType = "WizardButton3"
)
