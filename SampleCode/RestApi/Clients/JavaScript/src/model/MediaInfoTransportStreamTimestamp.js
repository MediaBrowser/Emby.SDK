/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class MediaInfoTransportStreamTimestamp.
* @enum {}
* @readonly
*/
export default class MediaInfoTransportStreamTimestamp {
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
    * Returns a <code>MediaInfoTransportStreamTimestamp</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaInfoTransportStreamTimestamp} The enum <code>MediaInfoTransportStreamTimestamp</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
