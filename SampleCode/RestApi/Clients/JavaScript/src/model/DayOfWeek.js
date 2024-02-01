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
* Enum class DayOfWeek.
* @enum {}
* @readonly
*/
export default class DayOfWeek {
        /**
         * value: "Sunday"
         * @const
         */
        sunday = "Sunday";

        /**
         * value: "Monday"
         * @const
         */
        monday = "Monday";

        /**
         * value: "Tuesday"
         * @const
         */
        tuesday = "Tuesday";

        /**
         * value: "Wednesday"
         * @const
         */
        wednesday = "Wednesday";

        /**
         * value: "Thursday"
         * @const
         */
        thursday = "Thursday";

        /**
         * value: "Friday"
         * @const
         */
        friday = "Friday";

        /**
         * value: "Saturday"
         * @const
         */
        saturday = "Saturday";


    /**
    * Returns a <code>DayOfWeek</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DayOfWeek} The enum <code>DayOfWeek</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
