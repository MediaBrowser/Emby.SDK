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
* Enum class AttributesSimpleCondition.
* @enum {}
* @readonly
*/
export default class AttributesSimpleCondition {
        /**
         * value: "IsTrue"
         * @const
         */
        isTrue = "IsTrue";

        /**
         * value: "IsFalse"
         * @const
         */
        isFalse = "IsFalse";

        /**
         * value: "IsNull"
         * @const
         */
        isNull = "IsNull";

        /**
         * value: "IsNotNullOrEmpty"
         * @const
         */
        isNotNullOrEmpty = "IsNotNullOrEmpty";


    /**
    * Returns a <code>AttributesSimpleCondition</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/AttributesSimpleCondition} The enum <code>AttributesSimpleCondition</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
