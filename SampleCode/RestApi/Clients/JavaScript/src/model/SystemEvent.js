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
* Enum class SystemEvent.
* @enum {}
* @readonly
*/
export default class SystemEvent {
        /**
         * value: "WakeFromSleep"
         * @const
         */
        wakeFromSleep = "WakeFromSleep";

        /**
         * value: "DisplayConfigurationChange"
         * @const
         */
        displayConfigurationChange = "DisplayConfigurationChange";

        /**
         * value: "NetworkChange"
         * @const
         */
        networkChange = "NetworkChange";


    /**
    * Returns a <code>SystemEvent</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SystemEvent} The enum <code>SystemEvent</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
