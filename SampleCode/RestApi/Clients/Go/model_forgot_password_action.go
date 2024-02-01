/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ForgotPasswordAction string

// List of ForgotPasswordAction
const (
	CONTACT_ADMIN_ForgotPasswordAction ForgotPasswordAction = "ContactAdmin"
	PIN_CODE_ForgotPasswordAction ForgotPasswordAction = "PinCode"
)
