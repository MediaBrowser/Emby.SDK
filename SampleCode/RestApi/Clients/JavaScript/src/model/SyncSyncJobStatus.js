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
* Enum class SyncSyncJobStatus.
* @enum {}
* @readonly
*/
export default class SyncSyncJobStatus {
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
    * Returns a <code>SyncSyncJobStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncSyncJobStatus} The enum <code>SyncSyncJobStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
