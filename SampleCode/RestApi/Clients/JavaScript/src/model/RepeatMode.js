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
* Enum class RepeatMode.
* @enum {}
* @readonly
*/
export default class RepeatMode {
        /**
         * value: "RepeatNone"
         * @const
         */
        repeatNone = "RepeatNone";

        /**
         * value: "RepeatAll"
         * @const
         */
        repeatAll = "RepeatAll";

        /**
         * value: "RepeatOne"
         * @const
         */
        repeatOne = "RepeatOne";


    /**
    * Returns a <code>RepeatMode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RepeatMode} The enum <code>RepeatMode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
