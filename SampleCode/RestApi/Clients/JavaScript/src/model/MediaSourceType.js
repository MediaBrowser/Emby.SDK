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
* Enum class MediaSourceType.
* @enum {}
* @readonly
*/
export default class MediaSourceType {
        /**
         * value: "Default"
         * @const
         */
        _default = "Default";

        /**
         * value: "Grouping"
         * @const
         */
        grouping = "Grouping";

        /**
         * value: "Placeholder"
         * @const
         */
        placeholder = "Placeholder";


    /**
    * Returns a <code>MediaSourceType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaSourceType} The enum <code>MediaSourceType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
