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
* Enum class AttributesSimpleCondition.
* @enum {}
* @readonly
*/
export default class AttributesSimpleCondition {
        /**
         * value: "IsTrue"
         * @const
         */
        IsTrue = "IsTrue";

        /**
         * value: "IsFalse"
         * @const
         */
        IsFalse = "IsFalse";

        /**
         * value: "IsNull"
         * @const
         */
        IsNull = "IsNull";

        /**
         * value: "IsNotNullOrEmpty"
         * @const
         */
        IsNotNullOrEmpty = "IsNotNullOrEmpty";


    /**
    * Returns a <code>AttributesSimpleCondition</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AttributesSimpleCondition} The enum <code>AttributesSimpleCondition</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
