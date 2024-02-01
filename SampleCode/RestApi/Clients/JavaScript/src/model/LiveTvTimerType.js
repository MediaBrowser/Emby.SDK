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
* Enum class LiveTvTimerType.
* @enum {}
* @readonly
*/
export default class LiveTvTimerType {
        /**
         * value: "Program"
         * @const
         */
        program = "Program";

        /**
         * value: "DateTime"
         * @const
         */
        dateTime = "DateTime";

        /**
         * value: "Keyword"
         * @const
         */
        keyword = "Keyword";


    /**
    * Returns a <code>LiveTvTimerType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvTimerType} The enum <code>LiveTvTimerType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
