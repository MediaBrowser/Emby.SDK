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
* Enum class TasksSystemEvent.
* @enum {}
* @readonly
*/
export default class TasksSystemEvent {
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
    * Returns a <code>TasksSystemEvent</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TasksSystemEvent} The enum <code>TasksSystemEvent</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
