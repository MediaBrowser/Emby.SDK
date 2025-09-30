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
* Enum class MediaSourceType.
* @enum {}
* @readonly
*/
export default class MediaSourceType {
        /**
         * value: "Default"
         * @const
         */
        _Default = "Default";

        /**
         * value: "Grouping"
         * @const
         */
        Grouping = "Grouping";

        /**
         * value: "Placeholder"
         * @const
         */
        Placeholder = "Placeholder";


    /**
    * Returns a <code>MediaSourceType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaSourceType} The enum <code>MediaSourceType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
