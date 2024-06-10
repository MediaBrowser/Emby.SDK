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
* Enum class EnumsUIViewType.
* @enum {}
* @readonly
*/
export default class EnumsUIViewType {
        /**
         * value: "RegularPage"
         * @const
         */
        RegularPage = "RegularPage";

        /**
         * value: "Dialog"
         * @const
         */
        Dialog = "Dialog";

        /**
         * value: "Wizard"
         * @const
         */
        Wizard = "Wizard";


    /**
    * Returns a <code>EnumsUIViewType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EnumsUIViewType} The enum <code>EnumsUIViewType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
