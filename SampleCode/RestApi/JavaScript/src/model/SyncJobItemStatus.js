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
* Enum class SyncJobItemStatus.
* @enum {}
* @readonly
*/
export default class SyncJobItemStatus {
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
         * value: "Synced"
         * @const
         */
        Synced = "Synced";

        /**
         * value: "Failed"
         * @const
         */
        Failed = "Failed";


    /**
    * Returns a <code>SyncJobItemStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobItemStatus} The enum <code>SyncJobItemStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
