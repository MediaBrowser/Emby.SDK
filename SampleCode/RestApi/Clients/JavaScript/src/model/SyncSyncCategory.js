/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class SyncSyncCategory.
* @enum {}
* @readonly
*/
export default class SyncSyncCategory {
        /**
         * value: "Latest"
         * @const
         */
        latest = "Latest";

        /**
         * value: "NextUp"
         * @const
         */
        nextUp = "NextUp";

        /**
         * value: "Resume"
         * @const
         */
        resume = "Resume";


    /**
    * Returns a <code>SyncSyncCategory</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncSyncCategory} The enum <code>SyncSyncCategory</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
