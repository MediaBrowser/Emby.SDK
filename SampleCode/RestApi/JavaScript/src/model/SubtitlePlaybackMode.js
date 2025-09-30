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
* Enum class SubtitlePlaybackMode.
* @enum {}
* @readonly
*/
export default class SubtitlePlaybackMode {
        /**
         * value: "Default"
         * @const
         */
        _Default = "Default";

        /**
         * value: "Always"
         * @const
         */
        Always = "Always";

        /**
         * value: "OnlyForced"
         * @const
         */
        OnlyForced = "OnlyForced";

        /**
         * value: "None"
         * @const
         */
        None = "None";

        /**
         * value: "Smart"
         * @const
         */
        Smart = "Smart";

        /**
         * value: "HearingImpaired"
         * @const
         */
        HearingImpaired = "HearingImpaired";


    /**
    * Returns a <code>SubtitlePlaybackMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SubtitlePlaybackMode} The enum <code>SubtitlePlaybackMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
