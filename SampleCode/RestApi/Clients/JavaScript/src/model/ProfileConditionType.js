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
* Enum class ProfileConditionType.
* @enum {}
* @readonly
*/
export default class ProfileConditionType {
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
    * Returns a <code>ProfileConditionType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ProfileConditionType} The enum <code>ProfileConditionType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
