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
* Enum class SyncCategory.
* @enum {}
* @readonly
*/
export default class SyncCategory {
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
    * Returns a <code>SyncCategory</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SyncCategory} The enum <code>SyncCategory</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
