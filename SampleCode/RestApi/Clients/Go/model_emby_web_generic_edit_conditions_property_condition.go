/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebGenericEditConditionsPropertyCondition struct {
	AffectedPropertyId string `json:"AffectedPropertyId,omitempty"`
	ConditionType *EmbyWebGenericEditConditionsPropertyConditionType `json:"ConditionType,omitempty"`
	TargetPropertyId string `json:"TargetPropertyId,omitempty"`
	SimpleCondition *AttributesSimpleCondition `json:"SimpleCondition,omitempty"`
	ValueCondition *AttributesValueCondition `json:"ValueCondition,omitempty"`
	Value *interface{} `json:"Value,omitempty"`
}
