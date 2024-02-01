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
* Enum class SyncJobStatus.
* @enum {}
* @readonly
*/
export default class SyncJobStatus {
        /**
         * value: "Queued"
         * @const
         */
        queued = "Queued";

        /**
         * value: "Converting"
         * @const
         */
        converting = "Converting";

        /**
         * value: "ReadyToTransfer"
         * @const
         */
        readyToTransfer = "ReadyToTransfer";

        /**
         * value: "Transferring"
         * @const
         */
        transferring = "Transferring";

        /**
         * value: "Completed"
         * @const
         */
        completed = "Completed";

        /**
         * value: "CompletedWithError"
         * @const
         */
        completedWithError = "CompletedWithError";

        /**
         * value: "Failed"
         * @const
         */
        failed = "Failed";


    /**
    * Returns a <code>SyncJobStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobStatus} The enum <code>SyncJobStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
