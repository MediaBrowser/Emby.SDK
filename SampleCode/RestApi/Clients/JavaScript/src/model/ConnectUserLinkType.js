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
* Enum class ConnectUserLinkType.
* @enum {}
* @readonly
*/
export default class ConnectUserLinkType {
        /**
         * value: "LinkedUser"
         * @const
         */
        linkedUser = "LinkedUser";

        /**
         * value: "Guest"
         * @const
         */
        guest = "Guest";


    /**
    * Returns a <code>ConnectUserLinkType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConnectUserLinkType} The enum <code>ConnectUserLinkType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
