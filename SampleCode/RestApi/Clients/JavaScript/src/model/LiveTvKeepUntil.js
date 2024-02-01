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
* Enum class LiveTvKeepUntil.
* @enum {}
* @readonly
*/
export default class LiveTvKeepUntil {
        /**
         * value: "UntilDeleted"
         * @const
         */
        untilDeleted = "UntilDeleted";

        /**
         * value: "UntilSpaceNeeded"
         * @const
         */
        untilSpaceNeeded = "UntilSpaceNeeded";

        /**
         * value: "UntilWatched"
         * @const
         */
        untilWatched = "UntilWatched";

        /**
         * value: "UntilDate"
         * @const
         */
        untilDate = "UntilDate";


    /**
    * Returns a <code>LiveTvKeepUntil</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvKeepUntil} The enum <code>LiveTvKeepUntil</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
