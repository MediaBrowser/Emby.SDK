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
* Enum class TasksTaskCompletionStatus.
* @enum {}
* @readonly
*/
export default class TasksTaskCompletionStatus {
        /**
         * value: "Completed"
         * @const
         */
        completed = "Completed";

        /**
         * value: "Failed"
         * @const
         */
        failed = "Failed";

        /**
         * value: "Cancelled"
         * @const
         */
        cancelled = "Cancelled";

        /**
         * value: "Aborted"
         * @const
         */
        aborted = "Aborted";


    /**
    * Returns a <code>TasksTaskCompletionStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TasksTaskCompletionStatus} The enum <code>TasksTaskCompletionStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
