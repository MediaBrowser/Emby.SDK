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
* Enum class LiveTvRecordingStatus.
* @enum {}
* @readonly
*/
export default class LiveTvRecordingStatus {
        /**
         * value: "New"
         * @const
         */
        _New = "New";

        /**
         * value: "InProgress"
         * @const
         */
        InProgress = "InProgress";

        /**
         * value: "Completed"
         * @const
         */
        Completed = "Completed";

        /**
         * value: "Cancelled"
         * @const
         */
        Cancelled = "Cancelled";

        /**
         * value: "ConflictedOk"
         * @const
         */
        ConflictedOk = "ConflictedOk";

        /**
         * value: "ConflictedNotOk"
         * @const
         */
        ConflictedNotOk = "ConflictedNotOk";

        /**
         * value: "Error"
         * @const
         */
        Error = "Error";


    /**
    * Returns a <code>LiveTvRecordingStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvRecordingStatus} The enum <code>LiveTvRecordingStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
