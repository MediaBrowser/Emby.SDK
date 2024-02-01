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
* Enum class ExtendedVideoTypes.
* @enum {}
* @readonly
*/
export default class ExtendedVideoTypes {
        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "Hdr10"
         * @const
         */
        hdr10 = "Hdr10";

        /**
         * value: "Hdr10Plus"
         * @const
         */
        hdr10Plus = "Hdr10Plus";

        /**
         * value: "HyperLogGamma"
         * @const
         */
        hyperLogGamma = "HyperLogGamma";

        /**
         * value: "DolbyVision"
         * @const
         */
        dolbyVision = "DolbyVision";


    /**
    * Returns a <code>ExtendedVideoTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ExtendedVideoTypes} The enum <code>ExtendedVideoTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
