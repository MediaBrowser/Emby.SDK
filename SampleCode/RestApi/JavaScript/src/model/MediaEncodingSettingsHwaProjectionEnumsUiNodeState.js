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
* Enum class MediaEncodingSettingsHwaProjectionEnumsUiNodeState.
* @enum {}
* @readonly
*/
export default class MediaEncodingSettingsHwaProjectionEnumsUiNodeState {
        /**
         * value: "Normal"
         * @const
         */
        Normal = "Normal";

        /**
         * value: "Disabled"
         * @const
         */
        Disabled = "Disabled";

        /**
         * value: "Unavailable"
         * @const
         */
        Unavailable = "Unavailable";

        /**
         * value: "Error"
         * @const
         */
        Error = "Error";

        /**
         * value: "Fallback"
         * @const
         */
        Fallback = "Fallback";


    /**
    * Returns a <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeState</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeState} The enum <code>MediaEncodingSettingsHwaProjectionEnumsUiNodeState</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
