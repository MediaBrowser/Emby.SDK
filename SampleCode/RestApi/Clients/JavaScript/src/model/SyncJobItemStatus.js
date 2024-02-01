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
* Enum class SyncJobItemStatus.
* @enum {}
* @readonly
*/
export default class SyncJobItemStatus {
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
         * value: "Synced"
         * @const
         */
        synced = "Synced";

        /**
         * value: "Failed"
         * @const
         */
        failed = "Failed";


    /**
    * Returns a <code>SyncJobItemStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncJobItemStatus} The enum <code>SyncJobItemStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
