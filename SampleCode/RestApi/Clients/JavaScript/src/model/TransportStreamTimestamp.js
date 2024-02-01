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
* Enum class TransportStreamTimestamp.
* @enum {}
* @readonly
*/
export default class TransportStreamTimestamp {
        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "Zero"
         * @const
         */
        zero = "Zero";

        /**
         * value: "Valid"
         * @const
         */
        valid = "Valid";


    /**
    * Returns a <code>TransportStreamTimestamp</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TransportStreamTimestamp} The enum <code>TransportStreamTimestamp</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
