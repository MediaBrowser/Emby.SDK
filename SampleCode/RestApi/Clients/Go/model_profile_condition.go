/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProfileCondition struct {
	Condition *ProfileConditionType `json:"Condition,omitempty"`
	Property *ProfileConditionValue `json:"Property,omitempty"`
	Value string `json:"Value,omitempty"`
	IsRequired bool `json:"IsRequired,omitempty"`
}
