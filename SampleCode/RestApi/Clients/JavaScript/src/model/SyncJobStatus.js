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
* Enum class SyncJobStatus.
* @enum {}
* @readonly
*/
export default class SyncJobStatus {
        /**
         * value: "Queued"
         * @const
         */
        Queued = "Queued";

        /**
         * value: "Converting"
         * @const
         */
        Converting = "Converting";

        /**
         * value: "ReadyToTransfer"
         * @const
         */
        ReadyToTransfer = "ReadyToTransfer";

        /**
         * value: "Transferring"
         * @const
         */
        Transferring = "Transferring";

        /**
         * value: "Completed"
         * @const
         */
        Completed = "Completed";

        /**
         * value: "CompletedWithError"
         * @const
         */
        CompletedWithError = "CompletedWithError";

        /**
         * value: "Failed"
         * @const
         */
        Failed = "Failed";


    /**
    * Returns a <code>SyncJobStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobStatus} The enum <code>SyncJobStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
