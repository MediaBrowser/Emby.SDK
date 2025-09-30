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
* Enum class SystemEvent.
* @enum {}
* @readonly
*/
export default class SystemEvent {
        /**
         * value: "WakeFromSleep"
         * @const
         */
        WakeFromSleep = "WakeFromSleep";

        /**
         * value: "DisplayConfigurationChange"
         * @const
         */
        DisplayConfigurationChange = "DisplayConfigurationChange";

        /**
         * value: "NetworkChange"
         * @const
         */
        NetworkChange = "NetworkChange";


    /**
    * Returns a <code>SystemEvent</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SystemEvent} The enum <code>SystemEvent</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
