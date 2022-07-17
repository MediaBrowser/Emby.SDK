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
* Enum class ConfigurationSubtitlePlaybackMode.
* @enum {}
* @readonly
*/
export default class ConfigurationSubtitlePlaybackMode {
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
    * Returns a <code>ConfigurationSubtitlePlaybackMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConfigurationSubtitlePlaybackMode} The enum <code>ConfigurationSubtitlePlaybackMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
