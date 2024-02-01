/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProfileConditionType string

// List of ProfileConditionType
const (
	EQUALS_ProfileConditionType ProfileConditionType = "Equals"
	NOT_EQUALS_ProfileConditionType ProfileConditionType = "NotEquals"
	LESS_THAN_EQUAL_ProfileConditionType ProfileConditionType = "LessThanEqual"
	GREATER_THAN_EQUAL_ProfileConditionType ProfileConditionType = "GreaterThanEqual"
	EQUALS_ANY_ProfileConditionType ProfileConditionType = "EqualsAny"
)
