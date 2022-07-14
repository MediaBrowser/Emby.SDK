/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class DlnaProfileConditionType.
* @enum {}
* @readonly
*/
export default class DlnaProfileConditionType {
        /**
         * value: "Equals"
         * @const
         */
        equals = "Equals";

        /**
         * value: "NotEquals"
         * @const
         */
        notEquals = "NotEquals";

        /**
         * value: "LessThanEqual"
         * @const
         */
        lessThanEqual = "LessThanEqual";

        /**
         * value: "GreaterThanEqual"
         * @const
         */
        greaterThanEqual = "GreaterThanEqual";

        /**
         * value: "EqualsAny"
         * @const
         */
        equalsAny = "EqualsAny";


    /**
    * Returns a <code>DlnaProfileConditionType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/DlnaProfileConditionType} The enum <code>DlnaProfileConditionType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
