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
* Enum class SubtitleEnableReason.
* @enum {}
* @readonly
*/
export default class SubtitleEnableReason {
        /**
         * value: "UserEnabled"
         * @const
         */
        UserEnabled = "UserEnabled";

        /**
         * value: "SkipBack"
         * @const
         */
        SkipBack = "SkipBack";

        /**
         * value: "LowVolume"
         * @const
         */
        LowVolume = "LowVolume";


    /**
    * Returns a <code>SubtitleEnableReason</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SubtitleEnableReason} The enum <code>SubtitleEnableReason</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
