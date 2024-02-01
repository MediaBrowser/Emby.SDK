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
* Enum class LiveTvRecordingStatus.
* @enum {}
* @readonly
*/
export default class LiveTvRecordingStatus {
        /**
         * value: "New"
         * @const
         */
        _new = "New";

        /**
         * value: "InProgress"
         * @const
         */
        inProgress = "InProgress";

        /**
         * value: "Completed"
         * @const
         */
        completed = "Completed";

        /**
         * value: "Cancelled"
         * @const
         */
        cancelled = "Cancelled";

        /**
         * value: "ConflictedOk"
         * @const
         */
        conflictedOk = "ConflictedOk";

        /**
         * value: "ConflictedNotOk"
         * @const
         */
        conflictedNotOk = "ConflictedNotOk";

        /**
         * value: "Error"
         * @const
         */
        error = "Error";


    /**
    * Returns a <code>LiveTvRecordingStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvRecordingStatus} The enum <code>LiveTvRecordingStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
