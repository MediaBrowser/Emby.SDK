/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class UsersForgotPasswordAction.
* @enum {}
* @readonly
*/
export default class UsersForgotPasswordAction {
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
         * value: "InNetworkRequired"
         * @const
         */
        inNetworkRequired = "InNetworkRequired";


    /**
    * Returns a <code>UsersForgotPasswordAction</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UsersForgotPasswordAction} The enum <code>UsersForgotPasswordAction</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
