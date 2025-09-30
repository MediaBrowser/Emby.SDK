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
* Enum class DynamicDayOfWeek.
* @enum {}
* @readonly
*/
export default class DynamicDayOfWeek {
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
         * value: "Everyday"
         * @const
         */
        Everyday = "Everyday";

        /**
         * value: "Weekday"
         * @const
         */
        Weekday = "Weekday";

        /**
         * value: "Weekend"
         * @const
         */
        Weekend = "Weekend";


    /**
    * Returns a <code>DynamicDayOfWeek</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DynamicDayOfWeek} The enum <code>DynamicDayOfWeek</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
