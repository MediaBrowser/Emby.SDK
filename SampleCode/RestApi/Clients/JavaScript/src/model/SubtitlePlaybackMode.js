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
* Enum class SubtitlePlaybackMode.
* @enum {}
* @readonly
*/
export default class SubtitlePlaybackMode {
        /**
         * value: "Default"
         * @const
         */
        _default = "Default";

        /**
         * value: "Always"
         * @const
         */
        always = "Always";

        /**
         * value: "OnlyForced"
         * @const
         */
        onlyForced = "OnlyForced";

        /**
         * value: "None"
         * @const
         */
        none = "None";

        /**
         * value: "Smart"
         * @const
         */
        smart = "Smart";

        /**
         * value: "HearingImpaired"
         * @const
         */
        hearingImpaired = "HearingImpaired";


    /**
    * Returns a <code>SubtitlePlaybackMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SubtitlePlaybackMode} The enum <code>SubtitlePlaybackMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
