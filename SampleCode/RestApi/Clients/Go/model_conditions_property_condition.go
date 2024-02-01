/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConditionsPropertyCondition struct {
	AffectedPropertyId string `json:"AffectedPropertyId,omitempty"`
	ConditionType *ConditionsPropertyConditionType `json:"ConditionType,omitempty"`
	// The target property name or path.
	TargetPropertyId string `json:"TargetPropertyId,omitempty"`
	SimpleCondition *AttributesSimpleCondition `json:"SimpleCondition,omitempty"`
	ValueCondition *AttributesValueCondition `json:"ValueCondition,omitempty"`
	// The value.
	Value *interface{} `json:"Value,omitempty"`
}
