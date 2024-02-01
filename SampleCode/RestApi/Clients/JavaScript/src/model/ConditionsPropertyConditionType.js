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
* Enum class ConditionsPropertyConditionType.
* @enum {}
* @readonly
*/
export default class ConditionsPropertyConditionType {
        /**
         * value: "Visible"
         * @const
         */
        visible = "Visible";

        /**
         * value: "Enabled"
         * @const
         */
        enabled = "Enabled";


    /**
    * Returns a <code>ConditionsPropertyConditionType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ConditionsPropertyConditionType} The enum <code>ConditionsPropertyConditionType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
