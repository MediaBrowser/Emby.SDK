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
* Enum class ExtendedVideoTypes.
* @enum {}
* @readonly
*/
export default class ExtendedVideoTypes {
        /**
         * value: "None"
         * @const
         */
        None = "None";

        /**
         * value: "Hdr10"
         * @const
         */
        Hdr10 = "Hdr10";

        /**
         * value: "Hdr10Plus"
         * @const
         */
        Hdr10Plus = "Hdr10Plus";

        /**
         * value: "HyperLogGamma"
         * @const
         */
        HyperLogGamma = "HyperLogGamma";

        /**
         * value: "DolbyVision"
         * @const
         */
        DolbyVision = "DolbyVision";


    /**
    * Returns a <code>ExtendedVideoTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ExtendedVideoTypes} The enum <code>ExtendedVideoTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
