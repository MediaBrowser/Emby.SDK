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
* Enum class DayOfWeek.
* @enum {}
* @readonly
*/
export default class DayOfWeek {
        /**
         * value: "Sunday"
         * @const
         */
        Sunday = "Sunday";

        /**
         * value: "Monday"
         * @const
         */
        Monday = "Monday";

        /**
         * value: "Tuesday"
         * @const
         */
        Tuesday = "Tuesday";

        /**
         * value: "Wednesday"
         * @const
         */
        Wednesday = "Wednesday";

        /**
         * value: "Thursday"
         * @const
         */
        Thursday = "Thursday";

        /**
         * value: "Friday"
         * @const
         */
        Friday = "Friday";

        /**
         * value: "Saturday"
         * @const
         */
        Saturday = "Saturday";


    /**
    * Returns a <code>DayOfWeek</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DayOfWeek} The enum <code>DayOfWeek</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
