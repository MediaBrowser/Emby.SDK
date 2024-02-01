/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class ForgotPasswordAction.
* @enum {}
* @readonly
*/
export default class ForgotPasswordAction {
        /**
         * value: "ContactAdmin"
         * @const
         */
        contactAdmin = "ContactAdmin";

        /**
         * value: "PinCode"
         * @const
         */
        pinCode = "PinCode";


    /**
    * Returns a <code>ForgotPasswordAction</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ForgotPasswordAction} The enum <code>ForgotPasswordAction</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
