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
* Enum class EmbyFeaturesFeatureType.
* @enum {}
* @readonly
*/
export default class EmbyFeaturesFeatureType {
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
    * Returns a <code>EmbyFeaturesFeatureType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyFeaturesFeatureType} The enum <code>EmbyFeaturesFeatureType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
