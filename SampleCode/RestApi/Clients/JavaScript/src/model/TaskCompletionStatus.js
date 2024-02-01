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
* Enum class TaskCompletionStatus.
* @enum {}
* @readonly
*/
export default class TaskCompletionStatus {
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
    * Returns a <code>TaskCompletionStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TaskCompletionStatus} The enum <code>TaskCompletionStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
