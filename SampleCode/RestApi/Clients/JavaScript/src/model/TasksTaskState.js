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
* Enum class TasksTaskState.
* @enum {}
* @readonly
*/
export default class TasksTaskState {
        /**
         * value: "Idle"
         * @const
         */
        idle = "Idle";

        /**
         * value: "Cancelling"
         * @const
         */
        cancelling = "Cancelling";

        /**
         * value: "Running"
         * @const
         */
        running = "Running";


    /**
    * Returns a <code>TasksTaskState</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TasksTaskState} The enum <code>TasksTaskState</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
