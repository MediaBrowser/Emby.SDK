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
* Enum class LiveTvChannelType.
* @enum {}
* @readonly
*/
export default class LiveTvChannelType {
        /**
         * value: "TV"
         * @const
         */
        TV = "TV";

        /**
         * value: "Radio"
         * @const
         */
        radio = "Radio";


    /**
    * Returns a <code>LiveTvChannelType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/LiveTvChannelType} The enum <code>LiveTvChannelType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
