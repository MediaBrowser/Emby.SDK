/**
 * Emby REST API
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
* Enum class ScrollDirection.
* @enum {}
* @readonly
*/
export default class ScrollDirection {
        /**
         * value: "Horizontal"
         * @const
         */
        horizontal = "Horizontal";

        /**
         * value: "Vertical"
         * @const
         */
        vertical = "Vertical";


    /**
    * Returns a <code>ScrollDirection</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ScrollDirection} The enum <code>ScrollDirection</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
