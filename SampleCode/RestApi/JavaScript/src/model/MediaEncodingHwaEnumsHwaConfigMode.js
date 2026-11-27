/**
 * Emby Server REST API (BETA)
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
* Enum class MediaEncodingHwaEnumsHwaConfigMode.
* @enum {}
* @readonly
*/
export default class MediaEncodingHwaEnumsHwaConfigMode {
        /**
         * value: "Basic"
         * @const
         */
        Basic = "Basic";

        /**
         * value: "Advanced"
         * @const
         */
        Advanced = "Advanced";

        /**
         * value: "Expert"
         * @const
         */
        Expert = "Expert";


    /**
    * Returns a <code>MediaEncodingHwaEnumsHwaConfigMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaEncodingHwaEnumsHwaConfigMode} The enum <code>MediaEncodingHwaEnumsHwaConfigMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
