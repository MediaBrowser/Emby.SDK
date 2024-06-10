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
* Enum class LiveTvKeepUntil.
* @enum {}
* @readonly
*/
export default class LiveTvKeepUntil {
        /**
         * value: "UntilDeleted"
         * @const
         */
        UntilDeleted = "UntilDeleted";

        /**
         * value: "UntilSpaceNeeded"
         * @const
         */
        UntilSpaceNeeded = "UntilSpaceNeeded";

        /**
         * value: "UntilWatched"
         * @const
         */
        UntilWatched = "UntilWatched";

        /**
         * value: "UntilDate"
         * @const
         */
        UntilDate = "UntilDate";


    /**
    * Returns a <code>LiveTvKeepUntil</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvKeepUntil} The enum <code>LiveTvKeepUntil</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
