/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TranscodingVpStepInfo struct {
	StepType *TranscodingVpStepTypes `json:"StepType,omitempty"`
	StepTypeName string `json:"StepTypeName,omitempty"`
	HardwareContextName string `json:"HardwareContextName,omitempty"`
	IsHardwareContext bool `json:"IsHardwareContext,omitempty"`
	Name string `json:"Name,omitempty"`
	Short string `json:"Short,omitempty"`
	FfmpegName string `json:"FfmpegName,omitempty"`
	FfmpegDescription string `json:"FfmpegDescription,omitempty"`
	FfmpegOptions string `json:"FfmpegOptions,omitempty"`
	Param string `json:"Param,omitempty"`
	ParamShort string `json:"ParamShort,omitempty"`
}
