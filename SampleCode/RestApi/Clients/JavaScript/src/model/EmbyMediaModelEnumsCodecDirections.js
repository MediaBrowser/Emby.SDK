/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class EmbyMediaModelEnumsCodecDirections.
* @enum {}
* @readonly
*/
export default class EmbyMediaModelEnumsCodecDirections {
        /**
         * value: "Encoder"
         * @const
         */
        encoder = "Encoder";

        /**
         * value: "Decoder"
         * @const
         */
        decoder = "Decoder";


    /**
    * Returns a <code>EmbyMediaModelEnumsCodecDirections</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyMediaModelEnumsCodecDirections} The enum <code>EmbyMediaModelEnumsCodecDirections</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
