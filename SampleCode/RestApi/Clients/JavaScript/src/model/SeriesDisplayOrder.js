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
* Enum class SeriesDisplayOrder.
* @enum {}
* @readonly
*/
export default class SeriesDisplayOrder {
        /**
         * value: "Aired"
         * @const
         */
        aired = "Aired";

        /**
         * value: "Dvd"
         * @const
         */
        dvd = "Dvd";

        /**
         * value: "Absolute"
         * @const
         */
        absolute = "Absolute";


    /**
    * Returns a <code>SeriesDisplayOrder</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SeriesDisplayOrder} The enum <code>SeriesDisplayOrder</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
