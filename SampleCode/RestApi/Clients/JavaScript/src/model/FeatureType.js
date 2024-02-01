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
* Enum class FeatureType.
* @enum {}
* @readonly
*/
export default class FeatureType {
        /**
         * value: "System"
         * @const
         */
        system = "System";

        /**
         * value: "User"
         * @const
         */
        user = "User";


    /**
    * Returns a <code>FeatureType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/FeatureType} The enum <code>FeatureType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
