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
* Enum class SleepTimerMode.
* @enum {}
* @readonly
*/
export default class SleepTimerMode {
        /**
         * value: "None"
         * @const
         */
        None = "None";

        /**
         * value: "AfterItem"
         * @const
         */
        AfterItem = "AfterItem";

        /**
         * value: "AtTime"
         * @const
         */
        AtTime = "AtTime";


    /**
    * Returns a <code>SleepTimerMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SleepTimerMode} The enum <code>SleepTimerMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
