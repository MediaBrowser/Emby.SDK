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
* Enum class EmbyWebGenericUIModelEnumsUIViewType.
* @enum {}
* @readonly
*/
export default class EmbyWebGenericUIModelEnumsUIViewType {
        /**
         * value: "RegularPage"
         * @const
         */
        regularPage = "RegularPage";

        /**
         * value: "Dialog"
         * @const
         */
        dialog = "Dialog";

        /**
         * value: "Wizard"
         * @const
         */
        wizard = "Wizard";


    /**
    * Returns a <code>EmbyWebGenericUIModelEnumsUIViewType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyWebGenericUIModelEnumsUIViewType} The enum <code>EmbyWebGenericUIModelEnumsUIViewType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
