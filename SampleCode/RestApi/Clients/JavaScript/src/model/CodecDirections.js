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
* Enum class CodecDirections.
* @enum {}
* @readonly
*/
export default class CodecDirections {
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
    * Returns a <code>CodecDirections</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/CodecDirections} The enum <code>CodecDirections</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
