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
* Enum class AttributesValueCondition.
* @enum {}
* @readonly
*/
export default class AttributesValueCondition {
        /**
         * value: "IsEqual"
         * @const
         */
        isEqual = "IsEqual";

        /**
         * value: "IsNotEqual"
         * @const
         */
        isNotEqual = "IsNotEqual";

        /**
         * value: "IsGreater"
         * @const
         */
        isGreater = "IsGreater";

        /**
         * value: "IsGreaterOrEqual"
         * @const
         */
        isGreaterOrEqual = "IsGreaterOrEqual";

        /**
         * value: "IsLess"
         * @const
         */
        isLess = "IsLess";

        /**
         * value: "IsLessOrEqual"
         * @const
         */
        isLessOrEqual = "IsLessOrEqual";


    /**
    * Returns a <code>AttributesValueCondition</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AttributesValueCondition} The enum <code>AttributesValueCondition</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
