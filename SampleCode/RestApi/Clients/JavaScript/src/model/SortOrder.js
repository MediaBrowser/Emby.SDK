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
* Enum class SortOrder.
* @enum {}
* @readonly
*/
export default class SortOrder {
        /**
         * value: "Ascending"
         * @const
         */
        ascending = "Ascending";

        /**
         * value: "Descending"
         * @const
         */
        descending = "Descending";


    /**
    * Returns a <code>SortOrder</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SortOrder} The enum <code>SortOrder</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
