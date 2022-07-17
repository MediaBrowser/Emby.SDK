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
* Enum class ConfigurationSegmentSkipMode.
* @enum {}
* @readonly
*/
export default class ConfigurationSegmentSkipMode {
        /**
         * value: "ShowButton"
         * @const
         */
        showButton = "ShowButton";

        /**
         * value: "AutoSkip"
         * @const
         */
        autoSkip = "AutoSkip";

        /**
         * value: "None"
         * @const
         */
        none = "None";


    /**
    * Returns a <code>ConfigurationSegmentSkipMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConfigurationSegmentSkipMode} The enum <code>ConfigurationSegmentSkipMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
