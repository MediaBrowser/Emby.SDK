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
* Enum class AttributesValueCondition.
* @enum {}
* @readonly
*/
export default class AttributesValueCondition {
        /**
         * value: "IsEqual"
         * @const
         */
        IsEqual = "IsEqual";

        /**
         * value: "IsNotEqual"
         * @const
         */
        IsNotEqual = "IsNotEqual";

        /**
         * value: "IsGreater"
         * @const
         */
        IsGreater = "IsGreater";

        /**
         * value: "IsGreaterOrEqual"
         * @const
         */
        IsGreaterOrEqual = "IsGreaterOrEqual";

        /**
         * value: "IsLess"
         * @const
         */
        IsLess = "IsLess";

        /**
         * value: "IsLessOrEqual"
         * @const
         */
        IsLessOrEqual = "IsLessOrEqual";


    /**
    * Returns a <code>AttributesValueCondition</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AttributesValueCondition} The enum <code>AttributesValueCondition</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
